package
parse
;
import
java
.
beans
.
Expression
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
public int getEofSym() { return 102; }
public int getNttSym() { return 103; }
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
"`for",
"`=",
"`++",
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
"{\"A\"..\"Z\" \"a\" \"d\" \"g\" \"j\"..\"k\" \"m\"..\"n\" \"q\"..\"s\" \"y\"..\"z\"}",
"\"p\"",
"\"v\"",
"\"c\"",
"\"f\"",
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
"\"@\"",
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
public int numSymbols() { return 104;}
private static final int MIN_REDUCTION = 1347;
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
1,610, // <start>
2,891, // ws*
3,876, // <program>
4,959, // <class decl>+
5,1091, // <class decl>
6,623, // `class
74,351, // ws
75,834, // " "
76,880, // {10}
77,825, // "#"
  }
,
{ // state 1
  }
,
{ // state 2
MIN_REDUCTION+29, // (default reduction)
  }
,
{ // state 3
74,985, // ws
75,146, // " "
76,207, // {10}
MIN_REDUCTION+84, // (default reduction)
  }
,
{ // state 4
7,239, // ID
16,482, // `(
30,1142, // <exp>
36,1049, // <exp8>
37,315, // <exp7>
38,35, // <exp6>
39,32, // <exp5>
40,165, // <exp4>
42,413, // <exp3>
44,11, // <exp2>
45,339, // <cast exp>
46,504, // <unary exp>
47,231, // <exp1>
48,849, // `-
49,478, // INTLIT
50,1027, // letter
51,809, // {"A".."Z" "a" "d" "g" "j".."k" "m".."n" "q".."s" "y".."z"}
52,809, // "p"
53,809, // "v"
54,809, // "c"
55,809, // "f"
56,809, // "i"
57,809, // "l"
58,809, // "o"
59,809, // "u"
60,809, // "x"
61,809, // "b"
62,809, // "e"
63,809, // "h"
64,809, // "t"
65,809, // "w"
66,1296, // letter128
67,749, // {199..218 231..250}
68,749, // {193..198 225..230}
70,300, // {"1".."9"}
71,1120, // "0"
72,594, // digit128
73,1276, // {176..185}
80,956, // "("
84,1303, // "-"
  }
,
{ // state 5
-1, // $$start
-1, // <start>
-1, // ws*
-1, // <program>
-1, // <class decl>+
-1, // <class decl>
-1, // `class
238, // ID
710, // `{
-1, // <decl in class>*
-1, // `}
-1, // `extends
-1, // <decl in class>
-1, // <method decl>
-1, // `public
-1, // `void
853, // `(
-1, // `)
-1, // <stmt>*
209, // <type>
914, // `int
921, // `boolean
-1, // <empty bracket pair>
-1, // `[
-1, // `]
856, // <stmt>
950, // <assign>
-1, // `;
402, // <local var decl>
1316, // `if
467, // <exp>
-1, // `else
392, // `while
893, // `for
-1, // `=
-1, // `++
638, // <exp8>
292, // <exp7>
406, // <exp6>
408, // <exp5>
1266, // <exp4>
-1, // `+
784, // <exp3>
-1, // `*
1036, // <exp2>
39, // <cast exp>
957, // <unary exp>
1117, // <exp1>
953, // `-
1000, // INTLIT
1267, // letter
809, // {"A".."Z" "a" "d" "g" "j".."k" "m".."n" "q".."s" "y".."z"}
809, // "p"
809, // "v"
809, // "c"
809, // "f"
809, // "i"
809, // "l"
809, // "o"
809, // "u"
809, // "x"
809, // "b"
809, // "e"
809, // "h"
809, // "t"
809, // "w"
796, // letter128
269, // {199..218 231..250}
269, // {193..198 225..230}
-1, // digit
923, // {"1".."9"}
1001, // "0"
496, // digit128
679, // {176..185}
-1, // ws
-1, // " "
-1, // {10}
396, // "#"
-1, // "+"
-1, // "*"
956, // "("
-1, // ")"
877, // "{"
-1, // "}"
1303, // "-"
-1, // "="
-1, // "["
-1, // "]"
-1, // ";"
-1, // "@"
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
{ // state 6
0x80000000|1, // match move
0x80000000|640, // no-match move
0x80000000|46, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 7
50,674, // letter
51,66, // {"A".."Z" "a" "d" "g" "j".."k" "m".."n" "q".."s" "y".."z"}
52,66, // "p"
53,66, // "v"
54,66, // "c"
55,66, // "f"
56,66, // "i"
57,66, // "l"
58,66, // "o"
59,66, // "u"
60,66, // "x"
61,66, // "b"
62,66, // "e"
63,66, // "h"
64,66, // "t"
65,66, // "w"
66,1108, // letter128
67,820, // {199..218 231..250}
68,820, // {193..198 225..230}
69,293, // digit
70,259, // {"1".."9"}
71,259, // "0"
72,835, // digit128
73,1219, // {176..185}
91,541, // $$0
96,1275, // idChar
97,1232, // "_"
98,338, // idChar128
99,864, // {223}
  }
,
{ // state 8
0x80000000|1, // match move
0x80000000|1011, // no-match move
0x80000000|46, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 9
2,655, // ws*
74,839, // ws
75,742, // " "
76,1262, // {10}
MIN_REDUCTION+53, // (default reduction)
  }
,
{ // state 10
MIN_REDUCTION+20, // (default reduction)
  }
,
{ // state 11
MIN_REDUCTION+36, // (default reduction)
  }
,
{ // state 12
MIN_REDUCTION+109, // (default reduction)
  }
,
{ // state 13
103,MIN_REDUCTION+40, // $NT
  }
,
{ // state 14
0x80000000|553, // match move
0x80000000|548, // no-match move
0x80000000|46, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 15
MIN_REDUCTION+18, // (default reduction)
  }
,
{ // state 16
2,1043, // ws*
74,1077, // ws
75,698, // " "
76,971, // {10}
MIN_REDUCTION+75, // (default reduction)
  }
,
{ // state 17
0x80000000|426, // match move
0x80000000|400, // no-match move
0x80000000|46, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 18
MIN_REDUCTION+17, // (default reduction)
  }
,
{ // state 19
-1, // $$start
-1, // <start>
-1, // ws*
-1, // <program>
-1, // <class decl>+
-1, // <class decl>
-1, // `class
238, // ID
710, // `{
-1, // <decl in class>*
922, // `}
-1, // `extends
-1, // <decl in class>
-1, // <method decl>
-1, // `public
-1, // `void
853, // `(
-1, // `)
-1, // <stmt>*
209, // <type>
914, // `int
921, // `boolean
-1, // <empty bracket pair>
-1, // `[
-1, // `]
838, // <stmt>
950, // <assign>
-1, // `;
402, // <local var decl>
1316, // `if
467, // <exp>
-1, // `else
392, // `while
893, // `for
-1, // `=
-1, // `++
638, // <exp8>
292, // <exp7>
406, // <exp6>
408, // <exp5>
1266, // <exp4>
-1, // `+
784, // <exp3>
-1, // `*
1036, // <exp2>
39, // <cast exp>
957, // <unary exp>
1117, // <exp1>
953, // `-
1000, // INTLIT
1267, // letter
809, // {"A".."Z" "a" "d" "g" "j".."k" "m".."n" "q".."s" "y".."z"}
809, // "p"
809, // "v"
809, // "c"
809, // "f"
809, // "i"
809, // "l"
809, // "o"
809, // "u"
809, // "x"
809, // "b"
809, // "e"
809, // "h"
809, // "t"
809, // "w"
796, // letter128
269, // {199..218 231..250}
269, // {193..198 225..230}
-1, // digit
923, // {"1".."9"}
1001, // "0"
496, // digit128
679, // {176..185}
-1, // ws
-1, // " "
-1, // {10}
396, // "#"
-1, // "+"
-1, // "*"
956, // "("
-1, // ")"
877, // "{"
987, // "}"
1303, // "-"
-1, // "="
-1, // "["
-1, // "]"
-1, // ";"
-1, // "@"
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
{ // state 20
2,104, // ws*
74,632, // ws
75,1169, // " "
76,354, // {10}
MIN_REDUCTION+81, // (default reduction)
  }
,
{ // state 21
MIN_REDUCTION+31, // (default reduction)
  }
,
{ // state 22
MIN_REDUCTION+30, // (default reduction)
  }
,
{ // state 23
74,554, // ws
75,394, // " "
76,226, // {10}
MIN_REDUCTION+92, // (default reduction)
  }
,
{ // state 24
0x80000000|1, // match move
0x80000000|935, // no-match move
0x80000000|46, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 25
78,589, // "+"
  }
,
{ // state 26
27,385, // `;
88,754, // ";"
  }
,
{ // state 27
50,674, // letter
51,66, // {"A".."Z" "a" "d" "g" "j".."k" "m".."n" "q".."s" "y".."z"}
52,66, // "p"
53,66, // "v"
54,66, // "c"
55,66, // "f"
56,66, // "i"
57,66, // "l"
58,66, // "o"
59,66, // "u"
60,66, // "x"
61,66, // "b"
62,66, // "e"
63,66, // "h"
64,66, // "t"
65,66, // "w"
66,1105, // letter128
67,269, // {199..218 231..250}
68,269, // {193..198 225..230}
69,293, // digit
70,259, // {"1".."9"}
71,259, // "0"
72,318, // digit128
73,1253, // {176..185}
91,1035, // $$0
96,1275, // idChar
97,1232, // "_"
98,621, // idChar128
99,102, // {223}
  }
,
{ // state 28
23,MIN_REDUCTION+96, // `[
74,1154, // ws
75,943, // " "
76,1294, // {10}
86,MIN_REDUCTION+96, // "["
MIN_REDUCTION+96, // (default reduction)
  }
,
{ // state 29
23,MIN_REDUCTION+105, // `[
86,MIN_REDUCTION+105, // "["
MIN_REDUCTION+105, // (default reduction)
  }
,
{ // state 30
MIN_REDUCTION+25, // (default reduction)
  }
,
{ // state 31
0x80000000|600, // match move
0x80000000|657, // no-match move
0x80000000|46, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 32
MIN_REDUCTION+31, // (default reduction)
  }
,
{ // state 33
0x80000000|407, // match move
0x80000000|1126, // no-match move
0x80000000|1146, // NT-test-match state for `else
  }
,
{ // state 34
23,MIN_REDUCTION+105, // `[
86,MIN_REDUCTION+105, // "["
MIN_REDUCTION+105, // (default reduction)
  }
,
{ // state 35
MIN_REDUCTION+30, // (default reduction)
  }
,
{ // state 36
23,MIN_REDUCTION+111, // `[
86,MIN_REDUCTION+111, // "["
103,MIN_REDUCTION+111, // $NT
MIN_REDUCTION+111, // (default reduction)
  }
,
{ // state 37
0x80000000|407, // match move
0x80000000|1133, // no-match move
0x80000000|1146, // NT-test-match state for `else
  }
,
{ // state 38
74,545, // ws
75,353, // " "
76,285, // {10}
MIN_REDUCTION+92, // (default reduction)
  }
,
{ // state 39
MIN_REDUCTION+37, // (default reduction)
  }
,
{ // state 40
0x80000000|1, // match move
0x80000000|1004, // no-match move
0x80000000|46, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 41
23,MIN_REDUCTION+132, // `[
74,321, // ws
75,92, // " "
76,103, // {10}
86,MIN_REDUCTION+132, // "["
103,MIN_REDUCTION+132, // $NT
MIN_REDUCTION+132, // (default reduction)
  }
,
{ // state 42
74,567, // ws
75,958, // " "
76,983, // {10}
MIN_REDUCTION+78, // (default reduction)
  }
,
{ // state 43
23,MIN_REDUCTION+45, // `[
86,MIN_REDUCTION+45, // "["
MIN_REDUCTION+45, // (default reduction)
  }
,
{ // state 44
MIN_REDUCTION+50, // (default reduction)
  }
,
{ // state 45
MIN_REDUCTION+98, // (default reduction)
  }
,
{ // state 46
23,1125, // `[
86,883, // "["
  }
,
{ // state 47
103,MIN_REDUCTION+50, // $NT
  }
,
{ // state 48
2,1319, // ws*
MIN_REDUCTION+75, // (default reduction)
  }
,
{ // state 49
MIN_REDUCTION+19, // (default reduction)
  }
,
{ // state 50
-1, // $$start
-1, // <start>
-1, // ws*
-1, // <program>
-1, // <class decl>+
-1, // <class decl>
-1, // `class
238, // ID
710, // `{
-1, // <decl in class>*
421, // `}
-1, // `extends
-1, // <decl in class>
-1, // <method decl>
-1, // `public
-1, // `void
853, // `(
-1, // `)
840, // <stmt>*
209, // <type>
914, // `int
921, // `boolean
-1, // <empty bracket pair>
-1, // `[
-1, // `]
1295, // <stmt>
950, // <assign>
-1, // `;
402, // <local var decl>
1316, // `if
467, // <exp>
-1, // `else
392, // `while
893, // `for
-1, // `=
-1, // `++
638, // <exp8>
292, // <exp7>
406, // <exp6>
408, // <exp5>
1266, // <exp4>
-1, // `+
784, // <exp3>
-1, // `*
1036, // <exp2>
39, // <cast exp>
957, // <unary exp>
1117, // <exp1>
953, // `-
1000, // INTLIT
1267, // letter
809, // {"A".."Z" "a" "d" "g" "j".."k" "m".."n" "q".."s" "y".."z"}
809, // "p"
809, // "v"
809, // "c"
809, // "f"
809, // "i"
809, // "l"
809, // "o"
809, // "u"
809, // "x"
809, // "b"
809, // "e"
809, // "h"
809, // "t"
809, // "w"
796, // letter128
269, // {199..218 231..250}
269, // {193..198 225..230}
-1, // digit
923, // {"1".."9"}
1001, // "0"
496, // digit128
679, // {176..185}
-1, // ws
-1, // " "
-1, // {10}
396, // "#"
-1, // "+"
-1, // "*"
956, // "("
-1, // ")"
877, // "{"
507, // "}"
1303, // "-"
-1, // "="
-1, // "["
-1, // "]"
-1, // ";"
-1, // "@"
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
{ // state 51
-1, // $$start
-1, // <start>
-1, // ws*
-1, // <program>
-1, // <class decl>+
-1, // <class decl>
-1, // `class
238, // ID
710, // `{
-1, // <decl in class>*
421, // `}
-1, // `extends
-1, // <decl in class>
-1, // <method decl>
-1, // `public
-1, // `void
853, // `(
-1, // `)
1337, // <stmt>*
209, // <type>
914, // `int
921, // `boolean
-1, // <empty bracket pair>
-1, // `[
-1, // `]
1295, // <stmt>
950, // <assign>
-1, // `;
402, // <local var decl>
1316, // `if
467, // <exp>
-1, // `else
392, // `while
893, // `for
-1, // `=
-1, // `++
638, // <exp8>
292, // <exp7>
406, // <exp6>
408, // <exp5>
1266, // <exp4>
-1, // `+
784, // <exp3>
-1, // `*
1036, // <exp2>
39, // <cast exp>
957, // <unary exp>
1117, // <exp1>
953, // `-
1000, // INTLIT
1267, // letter
809, // {"A".."Z" "a" "d" "g" "j".."k" "m".."n" "q".."s" "y".."z"}
809, // "p"
809, // "v"
809, // "c"
809, // "f"
809, // "i"
809, // "l"
809, // "o"
809, // "u"
809, // "x"
809, // "b"
809, // "e"
809, // "h"
809, // "t"
809, // "w"
796, // letter128
269, // {199..218 231..250}
269, // {193..198 225..230}
-1, // digit
923, // {"1".."9"}
1001, // "0"
496, // digit128
679, // {176..185}
-1, // ws
-1, // " "
-1, // {10}
396, // "#"
-1, // "+"
-1, // "*"
956, // "("
-1, // ")"
877, // "{"
1076, // "}"
1303, // "-"
-1, // "="
-1, // "["
-1, // "]"
-1, // ";"
-1, // "@"
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
{ // state 52
0x80000000|1, // match move
0x80000000|974, // no-match move
0x80000000|46, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 53
24,746, // `]
87,843, // "]"
  }
,
{ // state 54
MIN_REDUCTION+36, // (default reduction)
  }
,
{ // state 55
MIN_REDUCTION+109, // (default reduction)
  }
,
{ // state 56
2,693, // ws*
23,MIN_REDUCTION+131, // `[
74,162, // ws
75,744, // " "
76,100, // {10}
86,MIN_REDUCTION+131, // "["
MIN_REDUCTION+131, // (default reduction)
  }
,
{ // state 57
0x80000000|1, // match move
0x80000000|662, // no-match move
0x80000000|46, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 58
7,239, // ID
16,482, // `(
30,431, // <exp>
36,1049, // <exp8>
37,315, // <exp7>
38,35, // <exp6>
39,32, // <exp5>
40,165, // <exp4>
42,413, // <exp3>
44,11, // <exp2>
45,339, // <cast exp>
46,504, // <unary exp>
47,231, // <exp1>
48,849, // `-
49,478, // INTLIT
50,1027, // letter
51,809, // {"A".."Z" "a" "d" "g" "j".."k" "m".."n" "q".."s" "y".."z"}
52,809, // "p"
53,809, // "v"
54,809, // "c"
55,809, // "f"
56,809, // "i"
57,809, // "l"
58,809, // "o"
59,809, // "u"
60,809, // "x"
61,809, // "b"
62,809, // "e"
63,809, // "h"
64,809, // "t"
65,809, // "w"
66,1296, // letter128
67,749, // {199..218 231..250}
68,749, // {193..198 225..230}
70,300, // {"1".."9"}
71,1120, // "0"
72,594, // digit128
73,1276, // {176..185}
80,956, // "("
84,1303, // "-"
  }
,
{ // state 59
7,218, // ID
16,519, // `(
30,941, // <exp>
36,1158, // <exp8>
37,323, // <exp7>
38,22, // <exp6>
39,21, // <exp5>
40,139, // <exp4>
42,480, // <exp3>
44,83, // <exp2>
45,262, // <cast exp>
46,488, // <unary exp>
47,111, // <exp1>
48,842, // `-
49,463, // INTLIT
50,968, // letter
51,809, // {"A".."Z" "a" "d" "g" "j".."k" "m".."n" "q".."s" "y".."z"}
52,809, // "p"
53,809, // "v"
54,809, // "c"
55,809, // "f"
56,809, // "i"
57,809, // "l"
58,809, // "o"
59,809, // "u"
60,809, // "x"
61,809, // "b"
62,809, // "e"
63,809, // "h"
64,809, // "t"
65,809, // "w"
66,1233, // letter128
67,735, // {199..218 231..250}
68,735, // {193..198 225..230}
70,274, // {"1".."9"}
71,1079, // "0"
72,590, // digit128
73,1289, // {176..185}
80,956, // "("
84,1303, // "-"
  }
,
{ // state 60
74,1241, // ws
75,1012, // " "
76,993, // {10}
MIN_REDUCTION+92, // (default reduction)
  }
,
{ // state 61
MIN_REDUCTION+16, // (default reduction)
  }
,
{ // state 62
MIN_REDUCTION+126, // (default reduction)
  }
,
{ // state 63
41,526, // `+
78,1270, // "+"
MIN_REDUCTION+32, // (default reduction)
  }
,
{ // state 64
0x80000000|859, // match move
0x80000000|435, // no-match move
0x80000000|46, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 65
27,1230, // `;
88,847, // ";"
  }
,
{ // state 66
MIN_REDUCTION+46, // (default reduction)
  }
,
{ // state 67
23,MIN_REDUCTION+128, // `[
74,1029, // ws
75,744, // " "
76,100, // {10}
86,MIN_REDUCTION+128, // "["
MIN_REDUCTION+128, // (default reduction)
  }
,
{ // state 68
7,239, // ID
16,482, // `(
30,1159, // <exp>
36,1049, // <exp8>
37,315, // <exp7>
38,35, // <exp6>
39,32, // <exp5>
40,165, // <exp4>
42,413, // <exp3>
44,11, // <exp2>
45,339, // <cast exp>
46,504, // <unary exp>
47,231, // <exp1>
48,849, // `-
49,478, // INTLIT
50,1027, // letter
51,809, // {"A".."Z" "a" "d" "g" "j".."k" "m".."n" "q".."s" "y".."z"}
52,809, // "p"
53,809, // "v"
54,809, // "c"
55,809, // "f"
56,809, // "i"
57,809, // "l"
58,809, // "o"
59,809, // "u"
60,809, // "x"
61,809, // "b"
62,809, // "e"
63,809, // "h"
64,809, // "t"
65,809, // "w"
66,1296, // letter128
67,749, // {199..218 231..250}
68,749, // {193..198 225..230}
70,300, // {"1".."9"}
71,1120, // "0"
72,594, // digit128
73,1276, // {176..185}
80,956, // "("
84,1303, // "-"
  }
,
{ // state 69
-1, // $$start
-1, // <start>
-1, // ws*
-1, // <program>
-1, // <class decl>+
-1, // <class decl>
-1, // `class
238, // ID
710, // `{
-1, // <decl in class>*
937, // `}
-1, // `extends
-1, // <decl in class>
-1, // <method decl>
-1, // `public
-1, // `void
853, // `(
-1, // `)
-1, // <stmt>*
209, // <type>
914, // `int
921, // `boolean
-1, // <empty bracket pair>
-1, // `[
-1, // `]
838, // <stmt>
950, // <assign>
-1, // `;
402, // <local var decl>
1316, // `if
467, // <exp>
-1, // `else
392, // `while
893, // `for
-1, // `=
-1, // `++
638, // <exp8>
292, // <exp7>
406, // <exp6>
408, // <exp5>
1266, // <exp4>
-1, // `+
784, // <exp3>
-1, // `*
1036, // <exp2>
39, // <cast exp>
957, // <unary exp>
1117, // <exp1>
953, // `-
1000, // INTLIT
1267, // letter
809, // {"A".."Z" "a" "d" "g" "j".."k" "m".."n" "q".."s" "y".."z"}
809, // "p"
809, // "v"
809, // "c"
809, // "f"
809, // "i"
809, // "l"
809, // "o"
809, // "u"
809, // "x"
809, // "b"
809, // "e"
809, // "h"
809, // "t"
809, // "w"
796, // letter128
269, // {199..218 231..250}
269, // {193..198 225..230}
-1, // digit
923, // {"1".."9"}
1001, // "0"
496, // digit128
679, // {176..185}
-1, // ws
-1, // " "
-1, // {10}
396, // "#"
-1, // "+"
-1, // "*"
956, // "("
-1, // ")"
877, // "{"
1005, // "}"
1303, // "-"
-1, // "="
-1, // "["
-1, // "]"
-1, // ";"
-1, // "@"
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
{ // state 70
MIN_REDUCTION+98, // (default reduction)
  }
,
{ // state 71
23,MIN_REDUCTION+126, // `[
86,MIN_REDUCTION+126, // "["
MIN_REDUCTION+126, // (default reduction)
  }
,
{ // state 72
103,MIN_REDUCTION+31, // $NT
  }
,
{ // state 73
0x80000000|485, // match move
0x80000000|753, // no-match move
0x80000000|1146, // NT-test-match state for `else
  }
,
{ // state 74
23,MIN_REDUCTION+105, // `[
86,MIN_REDUCTION+105, // "["
103,MIN_REDUCTION+105, // $NT
MIN_REDUCTION+105, // (default reduction)
  }
,
{ // state 75
103,MIN_REDUCTION+30, // $NT
  }
,
{ // state 76
7,239, // ID
16,482, // `(
30,1225, // <exp>
36,1049, // <exp8>
37,315, // <exp7>
38,35, // <exp6>
39,32, // <exp5>
40,165, // <exp4>
42,413, // <exp3>
44,11, // <exp2>
45,339, // <cast exp>
46,504, // <unary exp>
47,231, // <exp1>
48,849, // `-
49,478, // INTLIT
50,1027, // letter
51,809, // {"A".."Z" "a" "d" "g" "j".."k" "m".."n" "q".."s" "y".."z"}
52,809, // "p"
53,809, // "v"
54,809, // "c"
55,809, // "f"
56,809, // "i"
57,809, // "l"
58,809, // "o"
59,809, // "u"
60,809, // "x"
61,809, // "b"
62,809, // "e"
63,809, // "h"
64,809, // "t"
65,809, // "w"
66,1296, // letter128
67,749, // {199..218 231..250}
68,749, // {193..198 225..230}
70,300, // {"1".."9"}
71,1120, // "0"
72,594, // digit128
73,1276, // {176..185}
80,956, // "("
84,1303, // "-"
  }
,
{ // state 77
8,1113, // `{
82,1057, // "{"
  }
,
{ // state 78
2,663, // ws*
74,839, // ws
75,742, // " "
76,1262, // {10}
MIN_REDUCTION+61, // (default reduction)
  }
,
{ // state 79
74,866, // ws
75,319, // " "
76,345, // {10}
MIN_REDUCTION+70, // (default reduction)
  }
,
{ // state 80
43,465, // `*
79,1151, // "*"
103,MIN_REDUCTION+33, // $NT
MIN_REDUCTION+33, // (default reduction)
  }
,
{ // state 81
7,239, // ID
16,482, // `(
30,401, // <exp>
36,1049, // <exp8>
37,315, // <exp7>
38,35, // <exp6>
39,32, // <exp5>
40,165, // <exp4>
42,413, // <exp3>
44,11, // <exp2>
45,339, // <cast exp>
46,504, // <unary exp>
47,231, // <exp1>
48,849, // `-
49,478, // INTLIT
50,1027, // letter
51,809, // {"A".."Z" "a" "d" "g" "j".."k" "m".."n" "q".."s" "y".."z"}
52,809, // "p"
53,809, // "v"
54,809, // "c"
55,809, // "f"
56,809, // "i"
57,809, // "l"
58,809, // "o"
59,809, // "u"
60,809, // "x"
61,809, // "b"
62,809, // "e"
63,809, // "h"
64,809, // "t"
65,809, // "w"
66,1296, // letter128
67,749, // {199..218 231..250}
68,749, // {193..198 225..230}
70,300, // {"1".."9"}
71,1120, // "0"
72,594, // digit128
73,1276, // {176..185}
80,956, // "("
84,1303, // "-"
  }
,
{ // state 82
27,1009, // `;
88,1097, // ";"
  }
,
{ // state 83
MIN_REDUCTION+36, // (default reduction)
  }
,
{ // state 84
2,515, // ws*
MIN_REDUCTION+97, // (default reduction)
  }
,
{ // state 85
27,1236, // `;
88,847, // ";"
  }
,
{ // state 86
0x80000000|798, // match move
0x80000000|471, // no-match move
0x80000000|46, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 87
2,1238, // ws*
23,MIN_REDUCTION+129, // `[
74,1190, // ws
75,943, // " "
76,1294, // {10}
86,MIN_REDUCTION+129, // "["
MIN_REDUCTION+129, // (default reduction)
  }
,
{ // state 88
0x80000000|418, // match move
0x80000000|890, // no-match move
0x80000000|46, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 89
0x80000000|439, // match move
0x80000000|429, // no-match move
0x80000000|46, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 90
103,MIN_REDUCTION+113, // $NT
MIN_REDUCTION+113, // (default reduction)
  }
,
{ // state 91
MIN_REDUCTION+50, // (default reduction)
  }
,
{ // state 92
0x80000000|47, // match move
0x80000000|1103, // no-match move
0x80000000|46, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 93
0x80000000|794, // match move
0x80000000|593, // no-match move
0x80000000|1146, // NT-test-match state for `else
  }
,
{ // state 94
74,1039, // ws
75,1182, // " "
76,819, // {10}
MIN_REDUCTION+52, // (default reduction)
  }
,
{ // state 95
2,748, // ws*
MIN_REDUCTION+93, // (default reduction)
  }
,
{ // state 96
23,MIN_REDUCTION+43, // `[
34,MIN_REDUCTION+43, // `=
35,MIN_REDUCTION+43, // `++
41,MIN_REDUCTION+43, // `+
43,MIN_REDUCTION+43, // `*
78,MIN_REDUCTION+43, // "+"
79,MIN_REDUCTION+43, // "*"
85,MIN_REDUCTION+43, // "="
86,MIN_REDUCTION+43, // "["
89,MIN_REDUCTION+43, // "@"
MIN_REDUCTION+13, // (default reduction)
  }
,
{ // state 97
0x80000000|1, // match move
0x80000000|1237, // no-match move
0x80000000|46, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 98
MIN_REDUCTION+99, // (default reduction)
  }
,
{ // state 99
MIN_REDUCTION+126, // (default reduction)
  }
,
{ // state 100
0x80000000|1, // match move
0x80000000|911, // no-match move
0x80000000|46, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 101
0x80000000|136, // match move
0x80000000|562, // no-match move
0x80000000|46, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 102
0x80000000|362, // match move
0x80000000|276, // no-match move
0x80000000|46, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 103
0x80000000|615, // match move
0x80000000|1016, // no-match move
0x80000000|46, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 104
74,115, // ws
75,1169, // " "
76,354, // {10}
MIN_REDUCTION+80, // (default reduction)
  }
,
{ // state 105
23,MIN_REDUCTION+132, // `[
74,8, // ws
75,128, // " "
76,125, // {10}
86,MIN_REDUCTION+132, // "["
MIN_REDUCTION+132, // (default reduction)
  }
,
{ // state 106
17,1313, // `)
81,585, // ")"
  }
,
{ // state 107
23,MIN_REDUCTION+98, // `[
86,MIN_REDUCTION+98, // "["
103,MIN_REDUCTION+98, // $NT
MIN_REDUCTION+98, // (default reduction)
  }
,
{ // state 108
0x80000000|1, // match move
0x80000000|1255, // no-match move
0x80000000|46, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 109
2,23, // ws*
74,762, // ws
75,394, // " "
76,226, // {10}
MIN_REDUCTION+93, // (default reduction)
  }
,
{ // state 110
MIN_REDUCTION+127, // (default reduction)
  }
,
{ // state 111
0x80000000|1, // match move
0x80000000|765, // no-match move
0x80000000|46, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 112
2,730, // ws*
MIN_REDUCTION+93, // (default reduction)
  }
,
{ // state 113
103,MIN_REDUCTION+98, // $NT
  }
,
{ // state 114
17,1281, // `)
81,585, // ")"
  }
,
{ // state 115
MIN_REDUCTION+126, // (default reduction)
  }
,
{ // state 116
0x80000000|878, // match move
0x80000000|631, // no-match move
0x80000000|797, // NT-test-match state for <exp>
  }
,
{ // state 117
50,674, // letter
51,66, // {"A".."Z" "a" "d" "g" "j".."k" "m".."n" "q".."s" "y".."z"}
52,66, // "p"
53,66, // "v"
54,66, // "c"
55,66, // "f"
56,66, // "i"
57,66, // "l"
58,66, // "o"
59,66, // "u"
60,66, // "x"
61,66, // "b"
62,66, // "e"
63,66, // "h"
64,66, // "t"
65,66, // "w"
66,1188, // letter128
67,711, // {199..218 231..250}
68,711, // {193..198 225..230}
69,293, // digit
70,259, // {"1".."9"}
71,259, // "0"
72,786, // digit128
73,1305, // {176..185}
91,97, // $$0
96,1275, // idChar
97,1232, // "_"
98,138, // idChar128
99,939, // {223}
  }
,
{ // state 118
0x80000000|1, // match move
0x80000000|1243, // no-match move
0x80000000|46, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 119
MIN_REDUCTION+19, // (default reduction)
  }
,
{ // state 120
0x80000000|654, // match move
0x80000000|216, // no-match move
0x80000000|46, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 121
7,1030, // ID
16,853, // `(
42,1040, // <exp3>
44,1036, // <exp2>
45,39, // <cast exp>
46,957, // <unary exp>
47,1117, // <exp1>
48,953, // `-
49,1000, // INTLIT
50,175, // letter
51,809, // {"A".."Z" "a" "d" "g" "j".."k" "m".."n" "q".."s" "y".."z"}
52,809, // "p"
53,809, // "v"
54,809, // "c"
55,809, // "f"
56,809, // "i"
57,809, // "l"
58,809, // "o"
59,809, // "u"
60,809, // "x"
61,809, // "b"
62,809, // "e"
63,809, // "h"
64,809, // "t"
65,809, // "w"
66,31, // letter128
67,992, // {199..218 231..250}
68,992, // {193..198 225..230}
70,923, // {"1".."9"}
71,1001, // "0"
72,496, // digit128
73,679, // {176..185}
80,956, // "("
84,1303, // "-"
  }
,
{ // state 122
23,MIN_REDUCTION+126, // `[
86,MIN_REDUCTION+126, // "["
MIN_REDUCTION+126, // (default reduction)
  }
,
{ // state 123
50,674, // letter
51,66, // {"A".."Z" "a" "d" "g" "j".."k" "m".."n" "q".."s" "y".."z"}
52,66, // "p"
53,66, // "v"
54,66, // "c"
55,66, // "f"
56,66, // "i"
57,66, // "l"
58,66, // "o"
59,66, // "u"
60,66, // "x"
61,66, // "b"
62,66, // "e"
63,66, // "h"
64,66, // "t"
65,66, // "w"
66,936, // letter128
67,656, // {199..218 231..250}
68,656, // {193..198 225..230}
69,293, // digit
70,259, // {"1".."9"}
71,259, // "0"
72,428, // digit128
73,635, // {176..185}
90,1307, // idChar*
91,810, // $$0
96,528, // idChar
97,1232, // "_"
98,822, // idChar128
99,704, // {223}
  }
,
{ // state 124
MIN_REDUCTION+12, // (default reduction)
  }
,
{ // state 125
0x80000000|1, // match move
0x80000000|879, // no-match move
0x80000000|46, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 126
43,438, // `*
79,1151, // "*"
MIN_REDUCTION+33, // (default reduction)
  }
,
{ // state 127
17,MIN_REDUCTION+126, // `)
81,MIN_REDUCTION+126, // ")"
MIN_REDUCTION+126, // (default reduction)
  }
,
{ // state 128
0x80000000|1, // match move
0x80000000|302, // no-match move
0x80000000|46, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 129
50,674, // letter
51,66, // {"A".."Z" "a" "d" "g" "j".."k" "m".."n" "q".."s" "y".."z"}
52,66, // "p"
53,66, // "v"
54,66, // "c"
55,66, // "f"
56,66, // "i"
57,66, // "l"
58,66, // "o"
59,66, // "u"
60,66, // "x"
61,66, // "b"
62,66, // "e"
63,66, // "h"
64,66, // "t"
65,66, // "w"
66,1055, // letter128
67,749, // {199..218 231..250}
68,749, // {193..198 225..230}
69,293, // digit
70,259, // {"1".."9"}
71,259, // "0"
72,795, // digit128
73,1276, // {176..185}
91,118, // $$0
96,1275, // idChar
97,1232, // "_"
98,89, // idChar128
99,818, // {223}
  }
,
{ // state 130
MIN_REDUCTION+99, // (default reduction)
  }
,
{ // state 131
0x80000000|1, // match move
0x80000000|833, // no-match move
0x80000000|46, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 132
103,MIN_REDUCTION+36, // $NT
MIN_REDUCTION+36, // (default reduction)
  }
,
{ // state 133
60,976, // "x"
  }
,
{ // state 134
2,38, // ws*
74,779, // ws
75,353, // " "
76,285, // {10}
MIN_REDUCTION+93, // (default reduction)
  }
,
{ // state 135
2,1070, // ws*
74,257, // ws
75,1182, // " "
76,819, // {10}
MIN_REDUCTION+97, // (default reduction)
  }
,
{ // state 136
103,MIN_REDUCTION+90, // $NT
  }
,
{ // state 137
0x80000000|1, // match move
0x80000000|830, // no-match move
0x80000000|46, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 138
0x80000000|398, // match move
0x80000000|538, // no-match move
0x80000000|46, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 139
41,512, // `+
78,1270, // "+"
MIN_REDUCTION+32, // (default reduction)
  }
,
{ // state 140
17,550, // `)
81,585, // ")"
  }
,
{ // state 141
0x80000000|1, // match move
0x80000000|295, // no-match move
0x80000000|46, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 142
50,674, // letter
51,66, // {"A".."Z" "a" "d" "g" "j".."k" "m".."n" "q".."s" "y".."z"}
52,66, // "p"
53,66, // "v"
54,66, // "c"
55,66, // "f"
56,66, // "i"
57,66, // "l"
58,66, // "o"
59,66, // "u"
60,66, // "x"
61,66, // "b"
62,66, // "e"
63,66, // "h"
64,66, // "t"
65,66, // "w"
66,1045, // letter128
67,735, // {199..218 231..250}
68,735, // {193..198 225..230}
69,293, // digit
70,259, // {"1".."9"}
71,259, // "0"
72,807, // digit128
73,1289, // {176..185}
91,108, // $$0
96,1275, // idChar
97,1232, // "_"
98,17, // idChar128
99,806, // {223}
  }
,
{ // state 143
-1, // $$start
-1, // <start>
-1, // ws*
-1, // <program>
-1, // <class decl>+
-1, // <class decl>
-1, // `class
238, // ID
757, // `{
-1, // <decl in class>*
-1, // `}
-1, // `extends
-1, // <decl in class>
-1, // <method decl>
-1, // `public
-1, // `void
853, // `(
-1, // `)
-1, // <stmt>*
209, // <type>
914, // `int
921, // `boolean
-1, // <empty bracket pair>
-1, // `[
-1, // `]
37, // <stmt>
783, // <assign>
-1, // `;
1093, // <local var decl>
980, // `if
467, // <exp>
-1, // `else
726, // `while
177, // `for
-1, // `=
-1, // `++
638, // <exp8>
292, // <exp7>
406, // <exp6>
408, // <exp5>
1266, // <exp4>
-1, // `+
784, // <exp3>
-1, // `*
1036, // <exp2>
39, // <cast exp>
957, // <unary exp>
1117, // <exp1>
953, // `-
1000, // INTLIT
1267, // letter
809, // {"A".."Z" "a" "d" "g" "j".."k" "m".."n" "q".."s" "y".."z"}
809, // "p"
809, // "v"
809, // "c"
809, // "f"
809, // "i"
809, // "l"
809, // "o"
809, // "u"
809, // "x"
809, // "b"
809, // "e"
809, // "h"
809, // "t"
809, // "w"
796, // letter128
269, // {199..218 231..250}
269, // {193..198 225..230}
-1, // digit
923, // {"1".."9"}
1001, // "0"
496, // digit128
679, // {176..185}
-1, // ws
-1, // " "
-1, // {10}
396, // "#"
-1, // "+"
-1, // "*"
956, // "("
-1, // ")"
877, // "{"
-1, // "}"
1303, // "-"
-1, // "="
-1, // "["
-1, // "]"
-1, // ";"
-1, // "@"
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
{ // state 144
-1, // $$start
-1, // <start>
-1, // ws*
-1, // <program>
-1, // <class decl>+
-1, // <class decl>
-1, // `class
238, // ID
845, // `{
-1, // <decl in class>*
-1, // `}
-1, // `extends
-1, // <decl in class>
-1, // <method decl>
-1, // `public
-1, // `void
853, // `(
-1, // `)
-1, // <stmt>*
209, // <type>
914, // `int
921, // `boolean
-1, // <empty bracket pair>
-1, // `[
-1, // `]
1269, // <stmt>
1178, // <assign>
-1, // `;
529, // <local var decl>
622, // `if
467, // <exp>
-1, // `else
1132, // `while
832, // `for
-1, // `=
-1, // `++
638, // <exp8>
292, // <exp7>
406, // <exp6>
408, // <exp5>
1266, // <exp4>
-1, // `+
784, // <exp3>
-1, // `*
1036, // <exp2>
39, // <cast exp>
957, // <unary exp>
1117, // <exp1>
953, // `-
1000, // INTLIT
1267, // letter
809, // {"A".."Z" "a" "d" "g" "j".."k" "m".."n" "q".."s" "y".."z"}
809, // "p"
809, // "v"
809, // "c"
809, // "f"
809, // "i"
809, // "l"
809, // "o"
809, // "u"
809, // "x"
809, // "b"
809, // "e"
809, // "h"
809, // "t"
809, // "w"
796, // letter128
269, // {199..218 231..250}
269, // {193..198 225..230}
-1, // digit
923, // {"1".."9"}
1001, // "0"
496, // digit128
679, // {176..185}
-1, // ws
-1, // " "
-1, // {10}
396, // "#"
-1, // "+"
-1, // "*"
956, // "("
-1, // ")"
877, // "{"
-1, // "}"
1303, // "-"
-1, // "="
-1, // "["
-1, // "]"
-1, // ";"
-1, // "@"
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
{ // state 145
23,MIN_REDUCTION+47, // `[
86,MIN_REDUCTION+47, // "["
MIN_REDUCTION+47, // (default reduction)
  }
,
{ // state 146
MIN_REDUCTION+50, // (default reduction)
  }
,
{ // state 147
103,MIN_REDUCTION+102, // $NT
  }
,
{ // state 148
69,1050, // digit
70,1101, // {"1".."9"}
71,1101, // "0"
72,586, // digit128
73,679, // {176..185}
93,305, // $$1
  }
,
{ // state 149
MIN_REDUCTION+109, // (default reduction)
  }
,
{ // state 150
-1, // $$start
-1, // <start>
-1, // ws*
-1, // <program>
-1, // <class decl>+
-1, // <class decl>
-1, // `class
238, // ID
713, // `{
-1, // <decl in class>*
-1, // `}
-1, // `extends
-1, // <decl in class>
-1, // <method decl>
-1, // `public
-1, // `void
853, // `(
-1, // `)
-1, // <stmt>*
209, // <type>
914, // `int
921, // `boolean
-1, // <empty bracket pair>
-1, // `[
-1, // `]
705, // <stmt>
1170, // <assign>
-1, // `;
370, // <local var decl>
678, // `if
467, // <exp>
-1, // `else
210, // `while
799, // `for
-1, // `=
-1, // `++
638, // <exp8>
292, // <exp7>
406, // <exp6>
408, // <exp5>
1266, // <exp4>
-1, // `+
784, // <exp3>
-1, // `*
1036, // <exp2>
39, // <cast exp>
957, // <unary exp>
1117, // <exp1>
953, // `-
1000, // INTLIT
1267, // letter
809, // {"A".."Z" "a" "d" "g" "j".."k" "m".."n" "q".."s" "y".."z"}
809, // "p"
809, // "v"
809, // "c"
809, // "f"
809, // "i"
809, // "l"
809, // "o"
809, // "u"
809, // "x"
809, // "b"
809, // "e"
809, // "h"
809, // "t"
809, // "w"
796, // letter128
269, // {199..218 231..250}
269, // {193..198 225..230}
-1, // digit
923, // {"1".."9"}
1001, // "0"
496, // digit128
679, // {176..185}
-1, // ws
-1, // " "
-1, // {10}
396, // "#"
-1, // "+"
-1, // "*"
956, // "("
-1, // ")"
877, // "{"
-1, // "}"
1303, // "-"
-1, // "="
-1, // "["
-1, // "]"
-1, // ";"
-1, // "@"
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
{ // state 151
MIN_REDUCTION+127, // (default reduction)
  }
,
{ // state 152
43,430, // `*
79,1151, // "*"
MIN_REDUCTION+33, // (default reduction)
  }
,
{ // state 153
23,MIN_REDUCTION+110, // `[
86,MIN_REDUCTION+110, // "["
MIN_REDUCTION+110, // (default reduction)
  }
,
{ // state 154
74,73, // ws
75,93, // " "
76,1172, // {10}
MIN_REDUCTION+80, // (default reduction)
  }
,
{ // state 155
74,62, // ws
75,1265, // " "
76,702, // {10}
MIN_REDUCTION+56, // (default reduction)
  }
,
{ // state 156
23,MIN_REDUCTION+50, // `[
86,MIN_REDUCTION+50, // "["
MIN_REDUCTION+50, // (default reduction)
  }
,
{ // state 157
-1, // $$start
-1, // <start>
-1, // ws*
-1, // <program>
-1, // <class decl>+
-1, // <class decl>
-1, // `class
238, // ID
731, // `{
-1, // <decl in class>*
-1, // `}
-1, // `extends
-1, // <decl in class>
-1, // <method decl>
-1, // `public
-1, // `void
853, // `(
-1, // `)
-1, // <stmt>*
209, // <type>
914, // `int
921, // `boolean
-1, // <empty bracket pair>
-1, // `[
-1, // `]
33, // <stmt>
691, // <assign>
-1, // `;
1107, // <local var decl>
908, // `if
467, // <exp>
-1, // `else
703, // `while
208, // `for
-1, // `=
-1, // `++
638, // <exp8>
292, // <exp7>
406, // <exp6>
408, // <exp5>
1266, // <exp4>
-1, // `+
784, // <exp3>
-1, // `*
1036, // <exp2>
39, // <cast exp>
957, // <unary exp>
1117, // <exp1>
953, // `-
1000, // INTLIT
1267, // letter
809, // {"A".."Z" "a" "d" "g" "j".."k" "m".."n" "q".."s" "y".."z"}
809, // "p"
809, // "v"
809, // "c"
809, // "f"
809, // "i"
809, // "l"
809, // "o"
809, // "u"
809, // "x"
809, // "b"
809, // "e"
809, // "h"
809, // "t"
809, // "w"
796, // letter128
269, // {199..218 231..250}
269, // {193..198 225..230}
-1, // digit
923, // {"1".."9"}
1001, // "0"
496, // digit128
679, // {176..185}
-1, // ws
-1, // " "
-1, // {10}
396, // "#"
-1, // "+"
-1, // "*"
956, // "("
-1, // ")"
877, // "{"
-1, // "}"
1303, // "-"
-1, // "="
-1, // "["
-1, // "]"
-1, // ";"
-1, // "@"
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
{ // state 158
50,674, // letter
51,66, // {"A".."Z" "a" "d" "g" "j".."k" "m".."n" "q".."s" "y".."z"}
52,66, // "p"
53,66, // "v"
54,66, // "c"
55,66, // "f"
56,66, // "i"
57,66, // "l"
58,66, // "o"
59,66, // "u"
60,66, // "x"
61,66, // "b"
62,66, // "e"
63,66, // "h"
64,66, // "t"
65,66, // "w"
66,852, // letter128
67,992, // {199..218 231..250}
68,992, // {193..198 225..230}
69,293, // digit
70,259, // {"1".."9"}
71,259, // "0"
72,584, // digit128
73,679, // {176..185}
91,1309, // $$0
96,1275, // idChar
97,1232, // "_"
98,14, // idChar128
99,909, // {223}
  }
,
{ // state 159
2,1301, // ws*
103,MIN_REDUCTION+129, // $NT
  }
,
{ // state 160
0x80000000|1, // match move
0x80000000|884, // no-match move
0x80000000|46, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 161
17,988, // `)
81,606, // ")"
  }
,
{ // state 162
0x80000000|1, // match move
0x80000000|905, // no-match move
0x80000000|46, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 163
0x80000000|1, // match move
0x80000000|271, // no-match move
0x80000000|46, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 164
MIN_REDUCTION+126, // (default reduction)
  }
,
{ // state 165
41,476, // `+
78,1270, // "+"
MIN_REDUCTION+32, // (default reduction)
  }
,
{ // state 166
64,78, // "t"
  }
,
{ // state 167
MIN_REDUCTION+50, // (default reduction)
  }
,
{ // state 168
-1, // $$start
-1, // <start>
-1, // ws*
-1, // <program>
-1, // <class decl>+
-1, // <class decl>
-1, // `class
238, // ID
710, // `{
-1, // <decl in class>*
792, // `}
-1, // `extends
-1, // <decl in class>
-1, // <method decl>
-1, // `public
-1, // `void
853, // `(
-1, // `)
-1, // <stmt>*
209, // <type>
914, // `int
921, // `boolean
-1, // <empty bracket pair>
-1, // `[
-1, // `]
838, // <stmt>
950, // <assign>
-1, // `;
402, // <local var decl>
1316, // `if
467, // <exp>
-1, // `else
392, // `while
893, // `for
-1, // `=
-1, // `++
638, // <exp8>
292, // <exp7>
406, // <exp6>
408, // <exp5>
1266, // <exp4>
-1, // `+
784, // <exp3>
-1, // `*
1036, // <exp2>
39, // <cast exp>
957, // <unary exp>
1117, // <exp1>
953, // `-
1000, // INTLIT
1267, // letter
809, // {"A".."Z" "a" "d" "g" "j".."k" "m".."n" "q".."s" "y".."z"}
809, // "p"
809, // "v"
809, // "c"
809, // "f"
809, // "i"
809, // "l"
809, // "o"
809, // "u"
809, // "x"
809, // "b"
809, // "e"
809, // "h"
809, // "t"
809, // "w"
796, // letter128
269, // {199..218 231..250}
269, // {193..198 225..230}
-1, // digit
923, // {"1".."9"}
1001, // "0"
496, // digit128
679, // {176..185}
-1, // ws
-1, // " "
-1, // {10}
396, // "#"
-1, // "+"
-1, // "*"
956, // "("
-1, // ")"
877, // "{"
597, // "}"
1303, // "-"
-1, // "="
-1, // "["
-1, // "]"
-1, // ";"
-1, // "@"
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
{ // state 169
31,536, // `else
77,475, // "#"
  }
,
{ // state 170
27,403, // `;
88,1325, // ";"
  }
,
{ // state 171
23,MIN_REDUCTION+101, // `[
86,MIN_REDUCTION+101, // "["
MIN_REDUCTION+101, // (default reduction)
  }
,
{ // state 172
17,1028, // `)
81,585, // ")"
  }
,
{ // state 173
2,1042, // ws*
23,MIN_REDUCTION+131, // `[
74,1129, // ws
75,163, // " "
76,24, // {10}
86,MIN_REDUCTION+131, // "["
MIN_REDUCTION+131, // (default reduction)
  }
,
{ // state 174
0x80000000|535, // match move
0x80000000|253, // no-match move
0x80000000|46, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 175
50,674, // letter
51,66, // {"A".."Z" "a" "d" "g" "j".."k" "m".."n" "q".."s" "y".."z"}
52,66, // "p"
53,66, // "v"
54,66, // "c"
55,66, // "f"
56,66, // "i"
57,66, // "l"
58,66, // "o"
59,66, // "u"
60,66, // "x"
61,66, // "b"
62,66, // "e"
63,66, // "h"
64,66, // "t"
65,66, // "w"
66,852, // letter128
67,992, // {199..218 231..250}
68,992, // {193..198 225..230}
69,293, // digit
70,259, // {"1".."9"}
71,259, // "0"
72,584, // digit128
73,679, // {176..185}
90,158, // idChar*
91,434, // $$0
96,528, // idChar
97,1232, // "_"
98,14, // idChar128
99,909, // {223}
  }
,
{ // state 176
43,372, // `*
79,1151, // "*"
MIN_REDUCTION+33, // (default reduction)
  }
,
{ // state 177
16,1287, // `(
80,16, // "("
  }
,
{ // state 178
0x80000000|416, // match move
0x80000000|966, // no-match move
0x80000000|1146, // NT-test-match state for `else
  }
,
{ // state 179
0x80000000|112, // match move
0x80000000|1006, // no-match move
0x80000000|1146, // NT-test-match state for `else
  }
,
{ // state 180
-1, // $$start
-1, // <start>
-1, // ws*
-1, // <program>
-1, // <class decl>+
-1, // <class decl>
-1, // `class
238, // ID
710, // `{
-1, // <decl in class>*
1060, // `}
-1, // `extends
-1, // <decl in class>
-1, // <method decl>
-1, // `public
-1, // `void
853, // `(
-1, // `)
-1, // <stmt>*
209, // <type>
914, // `int
921, // `boolean
-1, // <empty bracket pair>
-1, // `[
-1, // `]
838, // <stmt>
950, // <assign>
-1, // `;
402, // <local var decl>
1316, // `if
467, // <exp>
-1, // `else
392, // `while
893, // `for
-1, // `=
-1, // `++
638, // <exp8>
292, // <exp7>
406, // <exp6>
408, // <exp5>
1266, // <exp4>
-1, // `+
784, // <exp3>
-1, // `*
1036, // <exp2>
39, // <cast exp>
957, // <unary exp>
1117, // <exp1>
953, // `-
1000, // INTLIT
1267, // letter
809, // {"A".."Z" "a" "d" "g" "j".."k" "m".."n" "q".."s" "y".."z"}
809, // "p"
809, // "v"
809, // "c"
809, // "f"
809, // "i"
809, // "l"
809, // "o"
809, // "u"
809, // "x"
809, // "b"
809, // "e"
809, // "h"
809, // "t"
809, // "w"
796, // letter128
269, // {199..218 231..250}
269, // {193..198 225..230}
-1, // digit
923, // {"1".."9"}
1001, // "0"
496, // digit128
679, // {176..185}
-1, // ws
-1, // " "
-1, // {10}
396, // "#"
-1, // "+"
-1, // "*"
956, // "("
-1, // ")"
877, // "{"
1072, // "}"
1303, // "-"
-1, // "="
-1, // "["
-1, // "]"
-1, // ";"
-1, // "@"
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
{ // state 181
MIN_REDUCTION+51, // (default reduction)
  }
,
{ // state 182
27,414, // `;
88,1335, // ";"
  }
,
{ // state 183
2,6, // ws*
23,MIN_REDUCTION+91, // `[
74,1139, // ws
75,128, // " "
76,125, // {10}
86,MIN_REDUCTION+91, // "["
MIN_REDUCTION+91, // (default reduction)
  }
,
{ // state 184
16,865, // `(
80,16, // "("
  }
,
{ // state 185
2,283, // ws*
  }
,
{ // state 186
0x80000000|1, // match move
0x80000000|486, // no-match move
0x80000000|46, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 187
23,MIN_REDUCTION+109, // `[
86,MIN_REDUCTION+109, // "["
MIN_REDUCTION+109, // (default reduction)
  }
,
{ // state 188
MIN_REDUCTION+39, // (default reduction)
  }
,
{ // state 189
MIN_REDUCTION+51, // (default reduction)
  }
,
{ // state 190
51,1066, // {"A".."Z" "a" "d" "g" "j".."k" "m".."n" "q".."s" "y".."z"}
52,1066, // "p"
53,1066, // "v"
54,1066, // "c"
55,1066, // "f"
56,1066, // "i"
57,1066, // "l"
58,1066, // "o"
59,1066, // "u"
60,1066, // "x"
61,1066, // "b"
62,1066, // "e"
63,1066, // "h"
64,1066, // "t"
65,1066, // "w"
68,316, // {193..198 225..230}
70,1066, // {"1".."9"}
71,1066, // "0"
73,316, // {176..185}
94,844, // hexDigit*
95,458, // $$2
100,1221, // hexDigit
101,817, // hexDigit128
  }
,
{ // state 191
0x80000000|551, // match move
0x80000000|1345, // no-match move
0x80000000|1146, // NT-test-match state for `else
  }
,
{ // state 192
MIN_REDUCTION+99, // (default reduction)
  }
,
{ // state 193
31,758, // `else
77,475, // "#"
  }
,
{ // state 194
MIN_REDUCTION+5, // (default reduction)
  }
,
{ // state 195
50,674, // letter
51,66, // {"A".."Z" "a" "d" "g" "j".."k" "m".."n" "q".."s" "y".."z"}
52,66, // "p"
53,66, // "v"
54,66, // "c"
55,66, // "f"
56,66, // "i"
57,66, // "l"
58,66, // "o"
59,66, // "u"
60,66, // "x"
61,66, // "b"
62,66, // "e"
63,66, // "h"
64,66, // "t"
65,66, // "w"
66,1069, // letter128
67,1022, // {199..218 231..250}
68,1022, // {193..198 225..230}
69,293, // digit
70,259, // {"1".."9"}
71,259, // "0"
72,1220, // digit128
73,949, // {176..185}
90,260, // idChar*
91,900, // $$0
96,528, // idChar
97,1232, // "_"
98,371, // idChar128
99,868, // {223}
  }
,
{ // state 196
MIN_REDUCTION+127, // (default reduction)
  }
,
{ // state 197
0x80000000|551, // match move
0x80000000|15, // no-match move
0x80000000|1146, // NT-test-match state for `else
  }
,
{ // state 198
7,218, // ID
16,519, // `(
30,85, // <exp>
36,1158, // <exp8>
37,323, // <exp7>
38,22, // <exp6>
39,21, // <exp5>
40,139, // <exp4>
42,480, // <exp3>
44,83, // <exp2>
45,262, // <cast exp>
46,488, // <unary exp>
47,111, // <exp1>
48,842, // `-
49,463, // INTLIT
50,968, // letter
51,809, // {"A".."Z" "a" "d" "g" "j".."k" "m".."n" "q".."s" "y".."z"}
52,809, // "p"
53,809, // "v"
54,809, // "c"
55,809, // "f"
56,809, // "i"
57,809, // "l"
58,809, // "o"
59,809, // "u"
60,809, // "x"
61,809, // "b"
62,809, // "e"
63,809, // "h"
64,809, // "t"
65,809, // "w"
66,1233, // letter128
67,735, // {199..218 231..250}
68,735, // {193..198 225..230}
70,274, // {"1".."9"}
71,1079, // "0"
72,590, // digit128
73,1289, // {176..185}
80,956, // "("
84,1303, // "-"
  }
,
{ // state 199
23,MIN_REDUCTION+101, // `[
86,MIN_REDUCTION+101, // "["
MIN_REDUCTION+101, // (default reduction)
  }
,
{ // state 200
7,239, // ID
16,482, // `(
30,725, // <exp>
36,1049, // <exp8>
37,315, // <exp7>
38,35, // <exp6>
39,32, // <exp5>
40,165, // <exp4>
42,413, // <exp3>
44,11, // <exp2>
45,339, // <cast exp>
46,504, // <unary exp>
47,231, // <exp1>
48,849, // `-
49,478, // INTLIT
50,1027, // letter
51,809, // {"A".."Z" "a" "d" "g" "j".."k" "m".."n" "q".."s" "y".."z"}
52,809, // "p"
53,809, // "v"
54,809, // "c"
55,809, // "f"
56,809, // "i"
57,809, // "l"
58,809, // "o"
59,809, // "u"
60,809, // "x"
61,809, // "b"
62,809, // "e"
63,809, // "h"
64,809, // "t"
65,809, // "w"
66,1296, // letter128
67,749, // {199..218 231..250}
68,749, // {193..198 225..230}
70,300, // {"1".."9"}
71,1120, // "0"
72,594, // digit128
73,1276, // {176..185}
80,956, // "("
84,1303, // "-"
  }
,
{ // state 201
0x80000000|1, // match move
0x80000000|506, // no-match move
0x80000000|46, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 202
MIN_REDUCTION+24, // (default reduction)
  }
,
{ // state 203
MIN_REDUCTION+51, // (default reduction)
  }
,
{ // state 204
7,218, // ID
16,519, // `(
30,65, // <exp>
36,1158, // <exp8>
37,323, // <exp7>
38,22, // <exp6>
39,21, // <exp5>
40,139, // <exp4>
42,480, // <exp3>
44,83, // <exp2>
45,262, // <cast exp>
46,488, // <unary exp>
47,111, // <exp1>
48,842, // `-
49,463, // INTLIT
50,968, // letter
51,809, // {"A".."Z" "a" "d" "g" "j".."k" "m".."n" "q".."s" "y".."z"}
52,809, // "p"
53,809, // "v"
54,809, // "c"
55,809, // "f"
56,809, // "i"
57,809, // "l"
58,809, // "o"
59,809, // "u"
60,809, // "x"
61,809, // "b"
62,809, // "e"
63,809, // "h"
64,809, // "t"
65,809, // "w"
66,1233, // letter128
67,735, // {199..218 231..250}
68,735, // {193..198 225..230}
70,274, // {"1".."9"}
71,1079, // "0"
72,590, // digit128
73,1289, // {176..185}
80,956, // "("
84,1303, // "-"
  }
,
{ // state 205
23,MIN_REDUCTION+130, // `[
74,1029, // ws
75,744, // " "
76,100, // {10}
86,MIN_REDUCTION+130, // "["
MIN_REDUCTION+130, // (default reduction)
  }
,
{ // state 206
7,1030, // ID
16,853, // `(
44,1278, // <exp2>
45,39, // <cast exp>
46,957, // <unary exp>
47,1117, // <exp1>
48,953, // `-
49,1000, // INTLIT
50,175, // letter
51,809, // {"A".."Z" "a" "d" "g" "j".."k" "m".."n" "q".."s" "y".."z"}
52,809, // "p"
53,809, // "v"
54,809, // "c"
55,809, // "f"
56,809, // "i"
57,809, // "l"
58,809, // "o"
59,809, // "u"
60,809, // "x"
61,809, // "b"
62,809, // "e"
63,809, // "h"
64,809, // "t"
65,809, // "w"
66,31, // letter128
67,992, // {199..218 231..250}
68,992, // {193..198 225..230}
70,923, // {"1".."9"}
71,1001, // "0"
72,496, // digit128
73,679, // {176..185}
80,956, // "("
84,1303, // "-"
  }
,
{ // state 207
MIN_REDUCTION+51, // (default reduction)
  }
,
{ // state 208
16,1273, // `(
80,16, // "("
  }
,
{ // state 209
7,1198, // ID
22,282, // <empty bracket pair>
23,53, // `[
50,642, // letter
51,809, // {"A".."Z" "a" "d" "g" "j".."k" "m".."n" "q".."s" "y".."z"}
52,809, // "p"
53,809, // "v"
54,809, // "c"
55,809, // "f"
56,809, // "i"
57,809, // "l"
58,809, // "o"
59,809, // "u"
60,809, // "x"
61,809, // "b"
62,809, // "e"
63,809, // "h"
64,809, // "t"
65,809, // "w"
66,1104, // letter128
67,1047, // {199..218 231..250}
68,1047, // {193..198 225..230}
86,883, // "["
  }
,
{ // state 210
16,945, // `(
80,1065, // "("
  }
,
{ // state 211
2,1165, // ws*
23,MIN_REDUCTION+131, // `[
74,1147, // ws
75,141, // " "
76,160, // {10}
86,MIN_REDUCTION+131, // "["
MIN_REDUCTION+131, // (default reduction)
  }
,
{ // state 212
MIN_REDUCTION+8, // (default reduction)
  }
,
{ // state 213
0x80000000|185, // match move
0x80000000|296, // no-match move
0x80000000|46, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 214
MIN_REDUCTION+26, // (default reduction)
  }
,
{ // state 215
103,MIN_REDUCTION+105, // $NT
  }
,
{ // state 216
23,MIN_REDUCTION+100, // `[
86,MIN_REDUCTION+100, // "["
103,MIN_REDUCTION+100, // $NT
MIN_REDUCTION+100, // (default reduction)
  }
,
{ // state 217
7,239, // ID
16,482, // `(
30,882, // <exp>
36,1049, // <exp8>
37,315, // <exp7>
38,35, // <exp6>
39,32, // <exp5>
40,165, // <exp4>
42,413, // <exp3>
44,11, // <exp2>
45,339, // <cast exp>
46,504, // <unary exp>
47,231, // <exp1>
48,849, // `-
49,478, // INTLIT
50,1027, // letter
51,809, // {"A".."Z" "a" "d" "g" "j".."k" "m".."n" "q".."s" "y".."z"}
52,809, // "p"
53,809, // "v"
54,809, // "c"
55,809, // "f"
56,809, // "i"
57,809, // "l"
58,809, // "o"
59,809, // "u"
60,809, // "x"
61,809, // "b"
62,809, // "e"
63,809, // "h"
64,809, // "t"
65,809, // "w"
66,1296, // letter128
67,749, // {199..218 231..250}
68,749, // {193..198 225..230}
70,300, // {"1".."9"}
71,1120, // "0"
72,594, // digit128
73,1276, // {176..185}
80,956, // "("
84,1303, // "-"
  }
,
{ // state 218
0x80000000|1, // match move
0x80000000|666, // no-match move
0x80000000|46, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 219
27,MIN_REDUCTION+127, // `;
88,MIN_REDUCTION+127, // ";"
MIN_REDUCTION+127, // (default reduction)
  }
,
{ // state 220
23,MIN_REDUCTION+102, // `[
74,321, // ws
75,92, // " "
76,103, // {10}
86,MIN_REDUCTION+102, // "["
103,MIN_REDUCTION+102, // $NT
MIN_REDUCTION+102, // (default reduction)
  }
,
{ // state 221
MIN_REDUCTION+126, // (default reduction)
  }
,
{ // state 222
MIN_REDUCTION+125, // (default reduction)
  }
,
{ // state 223
MIN_REDUCTION+74, // (default reduction)
  }
,
{ // state 224
69,1280, // digit
70,1101, // {"1".."9"}
71,1101, // "0"
72,1320, // digit128
73,1305, // {176..185}
92,546, // digit*
93,479, // $$1
  }
,
{ // state 225
0x80000000|1, // match move
0x80000000|312, // no-match move
0x80000000|46, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 226
MIN_REDUCTION+51, // (default reduction)
  }
,
{ // state 227
0x80000000|95, // match move
0x80000000|981, // no-match move
0x80000000|1146, // NT-test-match state for `else
  }
,
{ // state 228
MIN_REDUCTION+51, // (default reduction)
  }
,
{ // state 229
0x80000000|237, // match move
0x80000000|598, // no-match move
0x80000000|1146, // NT-test-match state for `else
  }
,
{ // state 230
2,693, // ws*
  }
,
{ // state 231
0x80000000|1, // match move
0x80000000|687, // no-match move
0x80000000|46, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 232
23,243, // `[
86,373, // "["
MIN_REDUCTION+40, // (default reduction)
  }
,
{ // state 233
74,99, // ws
75,44, // " "
76,927, // {10}
MIN_REDUCTION+76, // (default reduction)
  }
,
{ // state 234
0x80000000|917, // match move
0x80000000|1231, // no-match move
0x80000000|46, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 235
-1, // $$start
-1, // <start>
-1, // ws*
-1, // <program>
-1, // <class decl>+
-1, // <class decl>
-1, // `class
238, // ID
757, // `{
-1, // <decl in class>*
-1, // `}
-1, // `extends
-1, // <decl in class>
-1, // <method decl>
-1, // `public
-1, // `void
853, // `(
-1, // `)
-1, // <stmt>*
209, // <type>
914, // `int
921, // `boolean
-1, // <empty bracket pair>
-1, // `[
-1, // `]
301, // <stmt>
783, // <assign>
-1, // `;
1093, // <local var decl>
980, // `if
467, // <exp>
-1, // `else
726, // `while
177, // `for
-1, // `=
-1, // `++
638, // <exp8>
292, // <exp7>
406, // <exp6>
408, // <exp5>
1266, // <exp4>
-1, // `+
784, // <exp3>
-1, // `*
1036, // <exp2>
39, // <cast exp>
957, // <unary exp>
1117, // <exp1>
953, // `-
1000, // INTLIT
1267, // letter
809, // {"A".."Z" "a" "d" "g" "j".."k" "m".."n" "q".."s" "y".."z"}
809, // "p"
809, // "v"
809, // "c"
809, // "f"
809, // "i"
809, // "l"
809, // "o"
809, // "u"
809, // "x"
809, // "b"
809, // "e"
809, // "h"
809, // "t"
809, // "w"
796, // letter128
269, // {199..218 231..250}
269, // {193..198 225..230}
-1, // digit
923, // {"1".."9"}
1001, // "0"
496, // digit128
679, // {176..185}
-1, // ws
-1, // " "
-1, // {10}
396, // "#"
-1, // "+"
-1, // "*"
956, // "("
-1, // ")"
877, // "{"
-1, // "}"
1303, // "-"
-1, // "="
-1, // "["
-1, // "]"
-1, // ";"
-1, // "@"
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
{ // state 236
23,MIN_REDUCTION+101, // `[
86,MIN_REDUCTION+101, // "["
103,MIN_REDUCTION+101, // $NT
MIN_REDUCTION+101, // (default reduction)
  }
,
{ // state 237
31,740, // `else
77,475, // "#"
  }
,
{ // state 238
0x80000000|1137, // match move
0x80000000|96, // no-match move
0x80000000|46, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 239
0x80000000|1, // match move
0x80000000|681, // no-match move
0x80000000|46, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 240
2,320, // ws*
74,378, // ws
75,1166, // " "
76,452, // {10}
MIN_REDUCTION+97, // (default reduction)
  }
,
{ // state 241
16,76, // `(
80,617, // "("
  }
,
{ // state 242
-1, // $$start
-1, // <start>
-1, // ws*
-1, // <program>
-1, // <class decl>+
-1, // <class decl>
-1, // `class
238, // ID
710, // `{
-1, // <decl in class>*
1032, // `}
-1, // `extends
-1, // <decl in class>
-1, // <method decl>
-1, // `public
-1, // `void
853, // `(
-1, // `)
-1, // <stmt>*
209, // <type>
914, // `int
921, // `boolean
-1, // <empty bracket pair>
-1, // `[
-1, // `]
838, // <stmt>
950, // <assign>
-1, // `;
402, // <local var decl>
1316, // `if
467, // <exp>
-1, // `else
392, // `while
893, // `for
-1, // `=
-1, // `++
638, // <exp8>
292, // <exp7>
406, // <exp6>
408, // <exp5>
1266, // <exp4>
-1, // `+
784, // <exp3>
-1, // `*
1036, // <exp2>
39, // <cast exp>
957, // <unary exp>
1117, // <exp1>
953, // `-
1000, // INTLIT
1267, // letter
809, // {"A".."Z" "a" "d" "g" "j".."k" "m".."n" "q".."s" "y".."z"}
809, // "p"
809, // "v"
809, // "c"
809, // "f"
809, // "i"
809, // "l"
809, // "o"
809, // "u"
809, // "x"
809, // "b"
809, // "e"
809, // "h"
809, // "t"
809, // "w"
796, // letter128
269, // {199..218 231..250}
269, // {193..198 225..230}
-1, // digit
923, // {"1".."9"}
1001, // "0"
496, // digit128
679, // {176..185}
-1, // ws
-1, // " "
-1, // {10}
396, // "#"
-1, // "+"
-1, // "*"
956, // "("
-1, // ")"
877, // "{"
982, // "}"
1303, // "-"
-1, // "="
-1, // "["
-1, // "]"
-1, // ";"
-1, // "@"
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
{ // state 243
7,249, // ID
16,374, // `(
30,919, // <exp>
36,1177, // <exp8>
37,2, // <exp7>
38,341, // <exp6>
39,343, // <exp5>
40,63, // <exp4>
42,531, // <exp3>
44,54, // <exp2>
45,290, // <cast exp>
46,516, // <unary exp>
47,131, // <exp1>
48,862, // `-
49,445, // INTLIT
50,773, // letter
51,809, // {"A".."Z" "a" "d" "g" "j".."k" "m".."n" "q".."s" "y".."z"}
52,809, // "p"
53,809, // "v"
54,809, // "c"
55,809, // "f"
56,809, // "i"
57,809, // "l"
58,809, // "o"
59,809, // "u"
60,809, // "x"
61,809, // "b"
62,809, // "e"
63,809, // "h"
64,809, // "t"
65,809, // "w"
66,1199, // letter128
67,711, // {199..218 231..250}
68,711, // {193..198 225..230}
70,224, // {"1".."9"}
71,1037, // "0"
72,549, // digit128
73,1305, // {176..185}
80,956, // "("
84,1303, // "-"
  }
,
{ // state 244
MIN_REDUCTION+19, // (default reduction)
  }
,
{ // state 245
MIN_REDUCTION+16, // (default reduction)
  }
,
{ // state 246
23,MIN_REDUCTION+47, // `[
86,MIN_REDUCTION+47, // "["
MIN_REDUCTION+47, // (default reduction)
  }
,
{ // state 247
0x80000000|13, // match move
0x80000000|628, // no-match move
0x80000000|46, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 248
23,MIN_REDUCTION+100, // `[
86,MIN_REDUCTION+100, // "["
MIN_REDUCTION+100, // (default reduction)
  }
,
{ // state 249
0x80000000|1, // match move
0x80000000|652, // no-match move
0x80000000|46, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 250
2,1173, // ws*
23,MIN_REDUCTION+131, // `[
74,1139, // ws
75,128, // " "
76,125, // {10}
86,MIN_REDUCTION+131, // "["
MIN_REDUCTION+131, // (default reduction)
  }
,
{ // state 251
2,515, // ws*
23,MIN_REDUCTION+97, // `[
74,1190, // ws
75,943, // " "
76,1294, // {10}
86,MIN_REDUCTION+97, // "["
MIN_REDUCTION+97, // (default reduction)
  }
,
{ // state 252
31,456, // `else
77,475, // "#"
  }
,
{ // state 253
2,57, // ws*
23,MIN_REDUCTION+91, // `[
74,1147, // ws
75,141, // " "
76,160, // {10}
86,MIN_REDUCTION+91, // "["
MIN_REDUCTION+91, // (default reduction)
  }
,
{ // state 254
74,1039, // ws
75,1182, // " "
76,819, // {10}
MIN_REDUCTION+60, // (default reduction)
  }
,
{ // state 255
MIN_REDUCTION+51, // (default reduction)
  }
,
{ // state 256
0x80000000|1, // match move
0x80000000|454, // no-match move
0x80000000|46, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 257
MIN_REDUCTION+127, // (default reduction)
  }
,
{ // state 258
17,MIN_REDUCTION+127, // `)
81,MIN_REDUCTION+127, // ")"
MIN_REDUCTION+127, // (default reduction)
  }
,
{ // state 259
MIN_REDUCTION+48, // (default reduction)
  }
,
{ // state 260
50,674, // letter
51,66, // {"A".."Z" "a" "d" "g" "j".."k" "m".."n" "q".."s" "y".."z"}
52,66, // "p"
53,66, // "v"
54,66, // "c"
55,66, // "f"
56,66, // "i"
57,66, // "l"
58,66, // "o"
59,66, // "u"
60,66, // "x"
61,66, // "b"
62,66, // "e"
63,66, // "h"
64,66, // "t"
65,66, // "w"
66,1069, // letter128
67,1022, // {199..218 231..250}
68,1022, // {193..198 225..230}
69,293, // digit
70,259, // {"1".."9"}
71,259, // "0"
72,1220, // digit128
73,949, // {176..185}
91,646, // $$0
96,1275, // idChar
97,1232, // "_"
98,371, // idChar128
99,868, // {223}
  }
,
{ // state 261
-1, // $$start
-1, // <start>
-1, // ws*
-1, // <program>
-1, // <class decl>+
-1, // <class decl>
-1, // `class
238, // ID
713, // `{
-1, // <decl in class>*
-1, // `}
-1, // `extends
-1, // <decl in class>
-1, // <method decl>
-1, // `public
-1, // `void
853, // `(
-1, // `)
-1, // <stmt>*
209, // <type>
914, // `int
921, // `boolean
-1, // <empty bracket pair>
-1, // `[
-1, // `]
389, // <stmt>
1170, // <assign>
-1, // `;
370, // <local var decl>
678, // `if
467, // <exp>
-1, // `else
210, // `while
799, // `for
-1, // `=
-1, // `++
638, // <exp8>
292, // <exp7>
406, // <exp6>
408, // <exp5>
1266, // <exp4>
-1, // `+
784, // <exp3>
-1, // `*
1036, // <exp2>
39, // <cast exp>
957, // <unary exp>
1117, // <exp1>
953, // `-
1000, // INTLIT
1267, // letter
809, // {"A".."Z" "a" "d" "g" "j".."k" "m".."n" "q".."s" "y".."z"}
809, // "p"
809, // "v"
809, // "c"
809, // "f"
809, // "i"
809, // "l"
809, // "o"
809, // "u"
809, // "x"
809, // "b"
809, // "e"
809, // "h"
809, // "t"
809, // "w"
796, // letter128
269, // {199..218 231..250}
269, // {193..198 225..230}
-1, // digit
923, // {"1".."9"}
1001, // "0"
496, // digit128
679, // {176..185}
-1, // ws
-1, // " "
-1, // {10}
396, // "#"
-1, // "+"
-1, // "*"
956, // "("
-1, // ")"
877, // "{"
-1, // "}"
1303, // "-"
-1, // "="
-1, // "["
-1, // "]"
-1, // ";"
-1, // "@"
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
{ // state 262
MIN_REDUCTION+37, // (default reduction)
  }
,
{ // state 263
MIN_REDUCTION+98, // (default reduction)
  }
,
{ // state 264
0x80000000|859, // match move
0x80000000|409, // no-match move
0x80000000|46, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 265
-1, // $$start
-1, // <start>
-1, // ws*
-1, // <program>
-1, // <class decl>+
-1, // <class decl>
-1, // `class
238, // ID
731, // `{
-1, // <decl in class>*
-1, // `}
-1, // `extends
-1, // <decl in class>
-1, // <method decl>
-1, // `public
-1, // `void
853, // `(
-1, // `)
-1, // <stmt>*
209, // <type>
914, // `int
921, // `boolean
-1, // <empty bracket pair>
-1, // `[
-1, // `]
229, // <stmt>
691, // <assign>
-1, // `;
1107, // <local var decl>
908, // `if
467, // <exp>
-1, // `else
703, // `while
208, // `for
-1, // `=
-1, // `++
638, // <exp8>
292, // <exp7>
406, // <exp6>
408, // <exp5>
1266, // <exp4>
-1, // `+
784, // <exp3>
-1, // `*
1036, // <exp2>
39, // <cast exp>
957, // <unary exp>
1117, // <exp1>
953, // `-
1000, // INTLIT
1267, // letter
809, // {"A".."Z" "a" "d" "g" "j".."k" "m".."n" "q".."s" "y".."z"}
809, // "p"
809, // "v"
809, // "c"
809, // "f"
809, // "i"
809, // "l"
809, // "o"
809, // "u"
809, // "x"
809, // "b"
809, // "e"
809, // "h"
809, // "t"
809, // "w"
796, // letter128
269, // {199..218 231..250}
269, // {193..198 225..230}
-1, // digit
923, // {"1".."9"}
1001, // "0"
496, // digit128
679, // {176..185}
-1, // ws
-1, // " "
-1, // {10}
396, // "#"
-1, // "+"
-1, // "*"
956, // "("
-1, // ")"
877, // "{"
-1, // "}"
1303, // "-"
-1, // "="
-1, // "["
-1, // "]"
-1, // ";"
-1, // "@"
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
{ // state 266
MIN_REDUCTION+110, // (default reduction)
  }
,
{ // state 267
74,489, // ws
75,991, // " "
76,332, // {10}
103,MIN_REDUCTION+66, // $NT
  }
,
{ // state 268
MIN_REDUCTION+98, // (default reduction)
  }
,
{ // state 269
0x80000000|1038, // match move
0x80000000|1201, // no-match move
0x80000000|46, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 270
103,MIN_REDUCTION+29, // $NT
  }
,
{ // state 271
23,MIN_REDUCTION+50, // `[
86,MIN_REDUCTION+50, // "["
MIN_REDUCTION+50, // (default reduction)
  }
,
{ // state 272
0x80000000|859, // match move
0x80000000|641, // no-match move
0x80000000|46, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 273
-1, // $$start
-1, // <start>
-1, // ws*
-1, // <program>
-1, // <class decl>+
-1, // <class decl>
-1, // `class
238, // ID
713, // `{
-1, // <decl in class>*
-1, // `}
-1, // `extends
-1, // <decl in class>
-1, // <method decl>
-1, // `public
-1, // `void
853, // `(
-1, // `)
-1, // <stmt>*
209, // <type>
914, // `int
921, // `boolean
-1, // <empty bracket pair>
-1, // `[
-1, // `]
383, // <stmt>
1170, // <assign>
-1, // `;
370, // <local var decl>
678, // `if
467, // <exp>
-1, // `else
210, // `while
799, // `for
-1, // `=
-1, // `++
638, // <exp8>
292, // <exp7>
406, // <exp6>
408, // <exp5>
1266, // <exp4>
-1, // `+
784, // <exp3>
-1, // `*
1036, // <exp2>
39, // <cast exp>
957, // <unary exp>
1117, // <exp1>
953, // `-
1000, // INTLIT
1267, // letter
809, // {"A".."Z" "a" "d" "g" "j".."k" "m".."n" "q".."s" "y".."z"}
809, // "p"
809, // "v"
809, // "c"
809, // "f"
809, // "i"
809, // "l"
809, // "o"
809, // "u"
809, // "x"
809, // "b"
809, // "e"
809, // "h"
809, // "t"
809, // "w"
796, // letter128
269, // {199..218 231..250}
269, // {193..198 225..230}
-1, // digit
923, // {"1".."9"}
1001, // "0"
496, // digit128
679, // {176..185}
-1, // ws
-1, // " "
-1, // {10}
396, // "#"
-1, // "+"
-1, // "*"
956, // "("
-1, // ")"
877, // "{"
-1, // "}"
1303, // "-"
-1, // "="
-1, // "["
-1, // "]"
-1, // ";"
-1, // "@"
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
{ // state 274
69,1280, // digit
70,1101, // {"1".."9"}
71,1101, // "0"
72,1290, // digit128
73,1289, // {176..185}
92,665, // digit*
93,501, // $$1
  }
,
{ // state 275
23,MIN_REDUCTION+111, // `[
86,MIN_REDUCTION+111, // "["
MIN_REDUCTION+111, // (default reduction)
  }
,
{ // state 276
23,MIN_REDUCTION+111, // `[
86,MIN_REDUCTION+111, // "["
MIN_REDUCTION+111, // (default reduction)
  }
,
{ // state 277
74,961, // ws
75,167, // " "
76,189, // {10}
MIN_REDUCTION+72, // (default reduction)
  }
,
{ // state 278
0x80000000|644, // match move
0x80000000|10, // no-match move
0x80000000|1146, // NT-test-match state for `else
  }
,
{ // state 279
23,MIN_REDUCTION+49, // `[
86,MIN_REDUCTION+49, // "["
103,MIN_REDUCTION+49, // $NT
MIN_REDUCTION+49, // (default reduction)
  }
,
{ // state 280
23,MIN_REDUCTION+96, // `[
74,8, // ws
75,128, // " "
76,125, // {10}
86,MIN_REDUCTION+96, // "["
MIN_REDUCTION+96, // (default reduction)
  }
,
{ // state 281
0x80000000|1, // match move
0x80000000|668, // no-match move
0x80000000|46, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 282
MIN_REDUCTION+14, // (default reduction)
  }
,
{ // state 283
0x80000000|1, // match move
0x80000000|709, // no-match move
0x80000000|46, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 284
0x80000000|1344, // match move
0x80000000|1094, // no-match move
0x80000000|1146, // NT-test-match state for `else
  }
,
{ // state 285
MIN_REDUCTION+51, // (default reduction)
  }
,
{ // state 286
MIN_REDUCTION+22, // (default reduction)
  }
,
{ // state 287
MIN_REDUCTION+51, // (default reduction)
  }
,
{ // state 288
7,218, // ID
16,519, // `(
30,1150, // <exp>
36,1158, // <exp8>
37,323, // <exp7>
38,22, // <exp6>
39,21, // <exp5>
40,139, // <exp4>
42,480, // <exp3>
44,83, // <exp2>
45,262, // <cast exp>
46,488, // <unary exp>
47,111, // <exp1>
48,842, // `-
49,463, // INTLIT
50,968, // letter
51,809, // {"A".."Z" "a" "d" "g" "j".."k" "m".."n" "q".."s" "y".."z"}
52,809, // "p"
53,809, // "v"
54,809, // "c"
55,809, // "f"
56,809, // "i"
57,809, // "l"
58,809, // "o"
59,809, // "u"
60,809, // "x"
61,809, // "b"
62,809, // "e"
63,809, // "h"
64,809, // "t"
65,809, // "w"
66,1233, // letter128
67,735, // {199..218 231..250}
68,735, // {193..198 225..230}
70,274, // {"1".."9"}
71,1079, // "0"
72,590, // digit128
73,1289, // {176..185}
80,956, // "("
84,1303, // "-"
  }
,
{ // state 289
MIN_REDUCTION+49, // (default reduction)
  }
,
{ // state 290
MIN_REDUCTION+37, // (default reduction)
  }
,
{ // state 291
MIN_REDUCTION+126, // (default reduction)
  }
,
{ // state 292
MIN_REDUCTION+29, // (default reduction)
  }
,
{ // state 293
MIN_REDUCTION+107, // (default reduction)
  }
,
{ // state 294
53,667, // "v"
  }
,
{ // state 295
23,MIN_REDUCTION+50, // `[
86,MIN_REDUCTION+50, // "["
MIN_REDUCTION+50, // (default reduction)
  }
,
{ // state 296
2,283, // ws*
23,MIN_REDUCTION+91, // `[
74,1129, // ws
75,163, // " "
76,24, // {10}
86,MIN_REDUCTION+91, // "["
MIN_REDUCTION+91, // (default reduction)
  }
,
{ // state 297
0x80000000|1, // match move
0x80000000|928, // no-match move
0x80000000|46, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 298
23,MIN_REDUCTION+111, // `[
86,MIN_REDUCTION+111, // "["
MIN_REDUCTION+111, // (default reduction)
  }
,
{ // state 299
-1, // $$start
-1, // <start>
-1, // ws*
-1, // <program>
-1, // <class decl>+
-1, // <class decl>
-1, // `class
238, // ID
50, // `{
-1, // <decl in class>*
-1, // `}
-1, // `extends
-1, // <decl in class>
-1, // <method decl>
-1, // `public
-1, // `void
853, // `(
-1, // `)
-1, // <stmt>*
209, // <type>
914, // `int
921, // `boolean
-1, // <empty bracket pair>
-1, // `[
-1, // `]
1195, // <stmt>
1044, // <assign>
-1, // `;
26, // <local var decl>
241, // `if
467, // <exp>
-1, // `else
1318, // `while
184, // `for
-1, // `=
-1, // `++
638, // <exp8>
292, // <exp7>
406, // <exp6>
408, // <exp5>
1266, // <exp4>
-1, // `+
784, // <exp3>
-1, // `*
1036, // <exp2>
39, // <cast exp>
957, // <unary exp>
1117, // <exp1>
953, // `-
1000, // INTLIT
1267, // letter
809, // {"A".."Z" "a" "d" "g" "j".."k" "m".."n" "q".."s" "y".."z"}
809, // "p"
809, // "v"
809, // "c"
809, // "f"
809, // "i"
809, // "l"
809, // "o"
809, // "u"
809, // "x"
809, // "b"
809, // "e"
809, // "h"
809, // "t"
809, // "w"
796, // letter128
269, // {199..218 231..250}
269, // {193..198 225..230}
-1, // digit
923, // {"1".."9"}
1001, // "0"
496, // digit128
679, // {176..185}
-1, // ws
-1, // " "
-1, // {10}
396, // "#"
-1, // "+"
-1, // "*"
956, // "("
-1, // ")"
877, // "{"
-1, // "}"
1303, // "-"
-1, // "="
-1, // "["
-1, // "]"
-1, // ";"
-1, // "@"
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
{ // state 300
69,1280, // digit
70,1101, // {"1".."9"}
71,1101, // "0"
72,1300, // digit128
73,1276, // {176..185}
92,680, // digit*
93,525, // $$1
  }
,
{ // state 301
0x80000000|193, // match move
0x80000000|608, // no-match move
0x80000000|1146, // NT-test-match state for `else
  }
,
{ // state 302
23,MIN_REDUCTION+50, // `[
86,MIN_REDUCTION+50, // "["
MIN_REDUCTION+50, // (default reduction)
  }
,
{ // state 303
MIN_REDUCTION+127, // (default reduction)
  }
,
{ // state 304
23,MIN_REDUCTION+96, // `[
74,40, // ws
75,141, // " "
76,160, // {10}
86,MIN_REDUCTION+96, // "["
MIN_REDUCTION+96, // (default reduction)
  }
,
{ // state 305
0x80000000|1, // match move
0x80000000|248, // no-match move
0x80000000|46, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 306
0x80000000|1191, // match move
0x80000000|639, // no-match move
0x80000000|46, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 307
0x80000000|1, // match move
0x80000000|808, // no-match move
0x80000000|46, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 308
56,960, // "i"
61,723, // "b"
  }
,
{ // state 309
27,769, // `;
88,1097, // ";"
  }
,
{ // state 310
-1, // $$start
-1, // <start>
-1, // ws*
-1, // <program>
-1, // <class decl>+
-1, // <class decl>
-1, // `class
238, // ID
734, // `{
-1, // <decl in class>*
-1, // `}
-1, // `extends
-1, // <decl in class>
-1, // <method decl>
-1, // `public
-1, // `void
853, // `(
-1, // `)
-1, // <stmt>*
209, // <type>
914, // `int
921, // `boolean
-1, // <empty bracket pair>
-1, // `[
-1, // `]
424, // <stmt>
170, // <assign>
-1, // `;
1062, // <local var decl>
1284, // `if
467, // <exp>
-1, // `else
574, // `while
1249, // `for
-1, // `=
-1, // `++
638, // <exp8>
292, // <exp7>
406, // <exp6>
408, // <exp5>
1266, // <exp4>
-1, // `+
784, // <exp3>
-1, // `*
1036, // <exp2>
39, // <cast exp>
957, // <unary exp>
1117, // <exp1>
953, // `-
1000, // INTLIT
1267, // letter
809, // {"A".."Z" "a" "d" "g" "j".."k" "m".."n" "q".."s" "y".."z"}
809, // "p"
809, // "v"
809, // "c"
809, // "f"
809, // "i"
809, // "l"
809, // "o"
809, // "u"
809, // "x"
809, // "b"
809, // "e"
809, // "h"
809, // "t"
809, // "w"
796, // letter128
269, // {199..218 231..250}
269, // {193..198 225..230}
-1, // digit
923, // {"1".."9"}
1001, // "0"
496, // digit128
679, // {176..185}
-1, // ws
-1, // " "
-1, // {10}
396, // "#"
-1, // "+"
-1, // "*"
956, // "("
-1, // ")"
877, // "{"
-1, // "}"
1303, // "-"
-1, // "="
-1, // "["
-1, // "]"
-1, // ";"
-1, // "@"
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
{ // state 311
2,636, // ws*
74,511, // ws
75,93, // " "
76,1172, // {10}
MIN_REDUCTION+81, // (default reduction)
  }
,
{ // state 312
23,MIN_REDUCTION+102, // `[
74,1029, // ws
75,744, // " "
76,100, // {10}
86,MIN_REDUCTION+102, // "["
MIN_REDUCTION+102, // (default reduction)
  }
,
{ // state 313
15,1285, // `void
77,294, // "#"
  }
,
{ // state 314
MIN_REDUCTION+126, // (default reduction)
  }
,
{ // state 315
MIN_REDUCTION+29, // (default reduction)
  }
,
{ // state 316
0x80000000|90, // match move
0x80000000|675, // no-match move
0x80000000|46, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 317
MIN_REDUCTION+51, // (default reduction)
  }
,
{ // state 318
0x80000000|266, // match move
0x80000000|1052, // no-match move
0x80000000|46, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 319
MIN_REDUCTION+50, // (default reduction)
  }
,
{ // state 320
74,898, // ws
75,1166, // " "
76,452, // {10}
MIN_REDUCTION+96, // (default reduction)
  }
,
{ // state 321
0x80000000|1123, // match move
0x80000000|729, // no-match move
0x80000000|46, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 322
23,MIN_REDUCTION+49, // `[
86,MIN_REDUCTION+49, // "["
MIN_REDUCTION+49, // (default reduction)
  }
,
{ // state 323
MIN_REDUCTION+29, // (default reduction)
  }
,
{ // state 324
0x80000000|1, // match move
0x80000000|831, // no-match move
0x80000000|46, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 325
23,MIN_REDUCTION+96, // `[
74,52, // ws
75,163, // " "
76,24, // {10}
86,MIN_REDUCTION+96, // "["
MIN_REDUCTION+96, // (default reduction)
  }
,
{ // state 326
23,MIN_REDUCTION+111, // `[
86,MIN_REDUCTION+111, // "["
MIN_REDUCTION+111, // (default reduction)
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
238, // ID
770, // `{
-1, // <decl in class>*
-1, // `}
-1, // `extends
-1, // <decl in class>
-1, // <method decl>
-1, // `public
-1, // `void
853, // `(
-1, // `)
-1, // <stmt>*
209, // <type>
914, // `int
921, // `boolean
-1, // <empty bracket pair>
-1, // `[
-1, // `]
437, // <stmt>
182, // <assign>
-1, // `;
1031, // <local var decl>
1332, // `if
467, // <exp>
-1, // `else
659, // `while
1229, // `for
-1, // `=
-1, // `++
638, // <exp8>
292, // <exp7>
406, // <exp6>
408, // <exp5>
1266, // <exp4>
-1, // `+
784, // <exp3>
-1, // `*
1036, // <exp2>
39, // <cast exp>
957, // <unary exp>
1117, // <exp1>
953, // `-
1000, // INTLIT
1267, // letter
809, // {"A".."Z" "a" "d" "g" "j".."k" "m".."n" "q".."s" "y".."z"}
809, // "p"
809, // "v"
809, // "c"
809, // "f"
809, // "i"
809, // "l"
809, // "o"
809, // "u"
809, // "x"
809, // "b"
809, // "e"
809, // "h"
809, // "t"
809, // "w"
796, // letter128
269, // {199..218 231..250}
269, // {193..198 225..230}
-1, // digit
923, // {"1".."9"}
1001, // "0"
496, // digit128
679, // {176..185}
-1, // ws
-1, // " "
-1, // {10}
396, // "#"
-1, // "+"
-1, // "*"
956, // "("
-1, // ")"
877, // "{"
-1, // "}"
1303, // "-"
-1, // "="
-1, // "["
-1, // "]"
-1, // ";"
-1, // "@"
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
-1, // $$start
-1, // <start>
-1, // ws*
-1, // <program>
-1, // <class decl>+
-1, // <class decl>
-1, // `class
238, // ID
845, // `{
-1, // <decl in class>*
-1, // `}
-1, // `extends
-1, // <decl in class>
-1, // <method decl>
-1, // `public
-1, // `void
853, // `(
-1, // `)
-1, // <stmt>*
209, // <type>
914, // `int
921, // `boolean
-1, // <empty bracket pair>
-1, // `[
-1, // `]
787, // <stmt>
1178, // <assign>
-1, // `;
529, // <local var decl>
622, // `if
467, // <exp>
-1, // `else
1132, // `while
832, // `for
-1, // `=
-1, // `++
638, // <exp8>
292, // <exp7>
406, // <exp6>
408, // <exp5>
1266, // <exp4>
-1, // `+
784, // <exp3>
-1, // `*
1036, // <exp2>
39, // <cast exp>
957, // <unary exp>
1117, // <exp1>
953, // `-
1000, // INTLIT
1267, // letter
809, // {"A".."Z" "a" "d" "g" "j".."k" "m".."n" "q".."s" "y".."z"}
809, // "p"
809, // "v"
809, // "c"
809, // "f"
809, // "i"
809, // "l"
809, // "o"
809, // "u"
809, // "x"
809, // "b"
809, // "e"
809, // "h"
809, // "t"
809, // "w"
796, // letter128
269, // {199..218 231..250}
269, // {193..198 225..230}
-1, // digit
923, // {"1".."9"}
1001, // "0"
496, // digit128
679, // {176..185}
-1, // ws
-1, // " "
-1, // {10}
396, // "#"
-1, // "+"
-1, // "*"
956, // "("
-1, // ")"
877, // "{"
-1, // "}"
1303, // "-"
-1, // "="
-1, // "["
-1, // "]"
-1, // ";"
-1, // "@"
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
{ // state 330
0x80000000|802, // match move
0x80000000|568, // no-match move
0x80000000|46, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 331
23,MIN_REDUCTION+44, // `[
86,MIN_REDUCTION+44, // "["
MIN_REDUCTION+44, // (default reduction)
  }
,
{ // state 332
103,MIN_REDUCTION+51, // $NT
MIN_REDUCTION+51, // (default reduction)
  }
,
{ // state 333
23,MIN_REDUCTION+49, // `[
86,MIN_REDUCTION+49, // "["
MIN_REDUCTION+49, // (default reduction)
  }
,
{ // state 334
MIN_REDUCTION+127, // (default reduction)
  }
,
{ // state 335
0x80000000|500, // match move
0x80000000|183, // no-match move
0x80000000|46, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 336
74,1019, // ws
75,742, // " "
76,1262, // {10}
MIN_REDUCTION+90, // (default reduction)
  }
,
{ // state 337
2,1238, // ws*
MIN_REDUCTION+129, // (default reduction)
  }
,
{ // state 338
0x80000000|159, // match move
0x80000000|1021, // no-match move
0x80000000|46, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 339
MIN_REDUCTION+37, // (default reduction)
  }
,
{ // state 340
MIN_REDUCTION+126, // (default reduction)
  }
,
{ // state 341
MIN_REDUCTION+30, // (default reduction)
  }
,
{ // state 342
-1, // $$start
-1, // <start>
-1, // ws*
-1, // <program>
-1, // <class decl>+
-1, // <class decl>
-1, // `class
238, // ID
845, // `{
-1, // <decl in class>*
-1, // `}
-1, // `extends
-1, // <decl in class>
-1, // <method decl>
-1, // `public
-1, // `void
853, // `(
-1, // `)
-1, // <stmt>*
209, // <type>
914, // `int
921, // `boolean
-1, // <empty bracket pair>
-1, // `[
-1, // `]
741, // <stmt>
1178, // <assign>
-1, // `;
529, // <local var decl>
622, // `if
467, // <exp>
-1, // `else
1132, // `while
832, // `for
-1, // `=
-1, // `++
638, // <exp8>
292, // <exp7>
406, // <exp6>
408, // <exp5>
1266, // <exp4>
-1, // `+
784, // <exp3>
-1, // `*
1036, // <exp2>
39, // <cast exp>
957, // <unary exp>
1117, // <exp1>
953, // `-
1000, // INTLIT
1267, // letter
809, // {"A".."Z" "a" "d" "g" "j".."k" "m".."n" "q".."s" "y".."z"}
809, // "p"
809, // "v"
809, // "c"
809, // "f"
809, // "i"
809, // "l"
809, // "o"
809, // "u"
809, // "x"
809, // "b"
809, // "e"
809, // "h"
809, // "t"
809, // "w"
796, // letter128
269, // {199..218 231..250}
269, // {193..198 225..230}
-1, // digit
923, // {"1".."9"}
1001, // "0"
496, // digit128
679, // {176..185}
-1, // ws
-1, // " "
-1, // {10}
396, // "#"
-1, // "+"
-1, // "*"
956, // "("
-1, // ")"
877, // "{"
-1, // "}"
1303, // "-"
-1, // "="
-1, // "["
-1, // "]"
-1, // ";"
-1, // "@"
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
{ // state 343
MIN_REDUCTION+31, // (default reduction)
  }
,
{ // state 344
0x80000000|1328, // match move
0x80000000|1073, // no-match move
0x80000000|1146, // NT-test-match state for `else
  }
,
{ // state 345
MIN_REDUCTION+51, // (default reduction)
  }
,
{ // state 346
2,636, // ws*
MIN_REDUCTION+81, // (default reduction)
  }
,
{ // state 347
MIN_REDUCTION+24, // (default reduction)
  }
,
{ // state 348
MIN_REDUCTION+127, // (default reduction)
  }
,
{ // state 349
74,595, // ws
75,379, // " "
76,228, // {10}
MIN_REDUCTION+128, // (default reduction)
  }
,
{ // state 350
MIN_REDUCTION+47, // (default reduction)
  }
,
{ // state 351
MIN_REDUCTION+127, // (default reduction)
  }
,
{ // state 352
74,1256, // ws
75,970, // " "
76,577, // {10}
MIN_REDUCTION+92, // (default reduction)
  }
,
{ // state 353
MIN_REDUCTION+50, // (default reduction)
  }
,
{ // state 354
MIN_REDUCTION+51, // (default reduction)
  }
,
{ // state 355
MIN_REDUCTION+50, // (default reduction)
  }
,
{ // state 356
27,464, // `;
88,1097, // ";"
  }
,
{ // state 357
MIN_REDUCTION+111, // (default reduction)
  }
,
{ // state 358
17,596, // `)
22,1056, // <empty bracket pair>
23,1343, // `[
81,1128, // ")"
86,883, // "["
  }
,
{ // state 359
23,MIN_REDUCTION+98, // `[
86,MIN_REDUCTION+98, // "["
MIN_REDUCTION+98, // (default reduction)
  }
,
{ // state 360
74,1241, // ws
75,1012, // " "
76,993, // {10}
MIN_REDUCTION+80, // (default reduction)
  }
,
{ // state 361
74,164, // ws
75,995, // " "
76,1025, // {10}
MIN_REDUCTION+86, // (default reduction)
  }
,
{ // state 362
MIN_REDUCTION+111, // (default reduction)
  }
,
{ // state 363
0x80000000|564, // match move
0x80000000|462, // no-match move
0x80000000|46, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 364
MIN_REDUCTION+22, // (default reduction)
  }
,
{ // state 365
MIN_REDUCTION+116, // (default reduction)
  }
,
{ // state 366
0x80000000|1, // match move
0x80000000|682, // no-match move
0x80000000|46, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 367
2,602, // ws*
74,776, // ws
75,355, // " "
76,287, // {10}
MIN_REDUCTION+65, // (default reduction)
  }
,
{ // state 368
MIN_REDUCTION+49, // (default reduction)
  }
,
{ // state 369
50,674, // letter
51,66, // {"A".."Z" "a" "d" "g" "j".."k" "m".."n" "q".."s" "y".."z"}
52,66, // "p"
53,66, // "v"
54,66, // "c"
55,66, // "f"
56,66, // "i"
57,66, // "l"
58,66, // "o"
59,66, // "u"
60,66, // "x"
61,66, // "b"
62,66, // "e"
63,66, // "h"
64,66, // "t"
65,66, // "w"
66,55, // letter128
67,1110, // {199..218 231..250}
68,1110, // {193..198 225..230}
69,293, // digit
70,259, // {"1".."9"}
71,259, // "0"
72,1341, // digit128
73,289, // {176..185}
91,263, // $$0
96,1275, // idChar
97,1232, // "_"
98,850, // idChar128
99,357, // {223}
  }
,
{ // state 370
27,119, // `;
88,109, // ";"
  }
,
{ // state 371
2,930, // ws*
74,257, // ws
75,1182, // " "
76,819, // {10}
MIN_REDUCTION+129, // (default reduction)
  }
,
{ // state 372
7,249, // ID
16,374, // `(
44,1259, // <exp2>
45,290, // <cast exp>
46,516, // <unary exp>
47,131, // <exp1>
48,862, // `-
49,445, // INTLIT
50,773, // letter
51,809, // {"A".."Z" "a" "d" "g" "j".."k" "m".."n" "q".."s" "y".."z"}
52,809, // "p"
53,809, // "v"
54,809, // "c"
55,809, // "f"
56,809, // "i"
57,809, // "l"
58,809, // "o"
59,809, // "u"
60,809, // "x"
61,809, // "b"
62,809, // "e"
63,809, // "h"
64,809, // "t"
65,809, // "w"
66,1199, // letter128
67,711, // {199..218 231..250}
68,711, // {193..198 225..230}
70,224, // {"1".."9"}
71,1037, // "0"
72,549, // digit128
73,1305, // {176..185}
80,956, // "("
84,1303, // "-"
  }
,
{ // state 373
2,821, // ws*
74,303, // ws
75,995, // " "
76,1025, // {10}
MIN_REDUCTION+89, // (default reduction)
  }
,
{ // state 374
7,449, // ID
19,517, // <type>
20,1059, // `int
21,124, // `boolean
50,195, // letter
51,809, // {"A".."Z" "a" "d" "g" "j".."k" "m".."n" "q".."s" "y".."z"}
52,809, // "p"
53,809, // "v"
54,809, // "c"
55,809, // "f"
56,809, // "i"
57,809, // "l"
58,809, // "o"
59,809, // "u"
60,809, // "x"
61,809, // "b"
62,809, // "e"
63,809, // "h"
64,809, // "t"
65,809, // "w"
66,135, // letter128
67,1022, // {199..218 231..250}
68,1022, // {193..198 225..230}
77,308, // "#"
  }
,
{ // state 375
7,1030, // ID
16,853, // `(
45,188, // <cast exp>
47,649, // <exp1>
49,1000, // INTLIT
50,175, // letter
51,809, // {"A".."Z" "a" "d" "g" "j".."k" "m".."n" "q".."s" "y".."z"}
52,809, // "p"
53,809, // "v"
54,809, // "c"
55,809, // "f"
56,809, // "i"
57,809, // "l"
58,809, // "o"
59,809, // "u"
60,809, // "x"
61,809, // "b"
62,809, // "e"
63,809, // "h"
64,809, // "t"
65,809, // "w"
66,31, // letter128
67,992, // {199..218 231..250}
68,992, // {193..198 225..230}
70,923, // {"1".."9"}
71,1001, // "0"
72,496, // digit128
73,679, // {176..185}
80,956, // "("
  }
,
{ // state 376
-1, // $$start
-1, // <start>
-1, // ws*
-1, // <program>
-1, // <class decl>+
-1, // <class decl>
-1, // `class
238, // ID
845, // `{
-1, // <decl in class>*
-1, // `}
-1, // `extends
-1, // <decl in class>
-1, // <method decl>
-1, // `public
-1, // `void
853, // `(
-1, // `)
-1, // <stmt>*
209, // <type>
914, // `int
921, // `boolean
-1, // <empty bracket pair>
-1, // `[
-1, // `]
1116, // <stmt>
1178, // <assign>
-1, // `;
529, // <local var decl>
622, // `if
467, // <exp>
-1, // `else
1132, // `while
832, // `for
-1, // `=
-1, // `++
638, // <exp8>
292, // <exp7>
406, // <exp6>
408, // <exp5>
1266, // <exp4>
-1, // `+
784, // <exp3>
-1, // `*
1036, // <exp2>
39, // <cast exp>
957, // <unary exp>
1117, // <exp1>
953, // `-
1000, // INTLIT
1267, // letter
809, // {"A".."Z" "a" "d" "g" "j".."k" "m".."n" "q".."s" "y".."z"}
809, // "p"
809, // "v"
809, // "c"
809, // "f"
809, // "i"
809, // "l"
809, // "o"
809, // "u"
809, // "x"
809, // "b"
809, // "e"
809, // "h"
809, // "t"
809, // "w"
796, // letter128
269, // {199..218 231..250}
269, // {193..198 225..230}
-1, // digit
923, // {"1".."9"}
1001, // "0"
496, // digit128
679, // {176..185}
-1, // ws
-1, // " "
-1, // {10}
396, // "#"
-1, // "+"
-1, // "*"
956, // "("
-1, // ")"
877, // "{"
-1, // "}"
1303, // "-"
-1, // "="
-1, // "["
-1, // "]"
-1, // ";"
-1, // "@"
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
{ // state 377
0x80000000|1, // match move
0x80000000|34, // no-match move
0x80000000|46, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 378
MIN_REDUCTION+127, // (default reduction)
  }
,
{ // state 379
MIN_REDUCTION+50, // (default reduction)
  }
,
{ // state 380
17,789, // `)
22,1056, // <empty bracket pair>
23,1343, // `[
81,1128, // ")"
86,883, // "["
  }
,
{ // state 381
69,1280, // digit
70,1101, // {"1".."9"}
71,1101, // "0"
72,1164, // digit128
73,1219, // {176..185}
92,613, // digit*
93,390, // $$1
  }
,
{ // state 382
MIN_REDUCTION+21, // (default reduction)
  }
,
{ // state 383
27,743, // `;
88,1097, // ";"
  }
,
{ // state 384
MIN_REDUCTION+24, // (default reduction)
  }
,
{ // state 385
0x80000000|1333, // match move
0x80000000|986, // no-match move
0x80000000|1146, // NT-test-match state for `else
  }
,
{ // state 386
0x80000000|1, // match move
0x80000000|29, // no-match move
0x80000000|46, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 387
7,218, // ID
16,519, // `(
30,30, // <exp>
36,1158, // <exp8>
37,323, // <exp7>
38,22, // <exp6>
39,21, // <exp5>
40,139, // <exp4>
42,480, // <exp3>
44,83, // <exp2>
45,262, // <cast exp>
46,488, // <unary exp>
47,111, // <exp1>
48,842, // `-
49,463, // INTLIT
50,968, // letter
51,809, // {"A".."Z" "a" "d" "g" "j".."k" "m".."n" "q".."s" "y".."z"}
52,809, // "p"
53,809, // "v"
54,809, // "c"
55,809, // "f"
56,809, // "i"
57,809, // "l"
58,809, // "o"
59,809, // "u"
60,809, // "x"
61,809, // "b"
62,809, // "e"
63,809, // "h"
64,809, // "t"
65,809, // "w"
66,1233, // letter128
67,735, // {199..218 231..250}
68,735, // {193..198 225..230}
70,274, // {"1".."9"}
71,1079, // "0"
72,590, // digit128
73,1289, // {176..185}
80,956, // "("
84,1303, // "-"
  }
,
{ // state 388
74,73, // ws
75,93, // " "
76,1172, // {10}
MIN_REDUCTION+80, // (default reduction)
  }
,
{ // state 389
27,764, // `;
88,1097, // ";"
  }
,
{ // state 390
0x80000000|873, // match move
0x80000000|236, // no-match move
0x80000000|46, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 391
74,544, // ws
75,355, // " "
76,287, // {10}
MIN_REDUCTION+128, // (default reduction)
  }
,
{ // state 392
16,599, // `(
80,1065, // "("
  }
,
{ // state 393
103,MIN_REDUCTION+37, // $NT
MIN_REDUCTION+37, // (default reduction)
  }
,
{ // state 394
MIN_REDUCTION+50, // (default reduction)
  }
,
{ // state 395
50,674, // letter
51,66, // {"A".."Z" "a" "d" "g" "j".."k" "m".."n" "q".."s" "y".."z"}
52,66, // "p"
53,66, // "v"
54,66, // "c"
55,66, // "f"
56,66, // "i"
57,66, // "l"
58,66, // "o"
59,66, // "u"
60,66, // "x"
61,66, // "b"
62,66, // "e"
63,66, // "h"
64,66, // "t"
65,66, // "w"
66,55, // letter128
67,1110, // {199..218 231..250}
68,1110, // {193..198 225..230}
69,293, // digit
70,259, // {"1".."9"}
71,259, // "0"
72,1341, // digit128
73,289, // {176..185}
90,369, // idChar*
91,98, // $$0
96,528, // idChar
97,1232, // "_"
98,850, // idChar128
99,357, // {223}
  }
,
{ // state 396
55,423, // "f"
56,166, // "i"
61,494, // "b"
65,579, // "w"
78,367, // "+"
  }
,
{ // state 397
23,MIN_REDUCTION+102, // `[
74,52, // ws
75,163, // " "
76,24, // {10}
86,MIN_REDUCTION+102, // "["
MIN_REDUCTION+102, // (default reduction)
  }
,
{ // state 398
2,137, // ws*
  }
,
{ // state 399
0x80000000|196, // match move
0x80000000|258, // no-match move
0x80000000|1146, // NT-test-match state for `else
  }
,
{ // state 400
2,1202, // ws*
23,MIN_REDUCTION+129, // `[
74,1147, // ws
75,141, // " "
76,160, // {10}
86,MIN_REDUCTION+129, // "["
MIN_REDUCTION+129, // (default reduction)
  }
,
{ // state 401
17,697, // `)
81,585, // ")"
  }
,
{ // state 402
27,244, // `;
88,902, // ";"
  }
,
{ // state 403
0x80000000|1046, // match move
0x80000000|1227, // no-match move
0x80000000|1146, // NT-test-match state for `else
  }
,
{ // state 404
MIN_REDUCTION+50, // (default reduction)
  }
,
{ // state 405
MIN_REDUCTION+111, // (default reduction)
  }
,
{ // state 406
MIN_REDUCTION+30, // (default reduction)
  }
,
{ // state 407
MIN_REDUCTION+24, // (default reduction)
  }
,
{ // state 408
MIN_REDUCTION+31, // (default reduction)
  }
,
{ // state 409
23,MIN_REDUCTION+113, // `[
86,MIN_REDUCTION+113, // "["
MIN_REDUCTION+113, // (default reduction)
  }
,
{ // state 410
MIN_REDUCTION+51, // (default reduction)
  }
,
{ // state 411
-1, // $$start
-1, // <start>
-1, // ws*
-1, // <program>
-1, // <class decl>+
-1, // <class decl>
-1, // `class
238, // ID
51, // `{
-1, // <decl in class>*
-1, // `}
-1, // `extends
-1, // <decl in class>
-1, // <method decl>
-1, // `public
-1, // `void
853, // `(
-1, // `)
-1, // <stmt>*
209, // <type>
914, // `int
921, // `boolean
-1, // <empty bracket pair>
-1, // `[
-1, // `]
1071, // <stmt>
915, // <assign>
-1, // `;
755, // <local var decl>
1342, // `if
467, // <exp>
-1, // `else
470, // `while
653, // `for
-1, // `=
-1, // `++
638, // <exp8>
292, // <exp7>
406, // <exp6>
408, // <exp5>
1266, // <exp4>
-1, // `+
784, // <exp3>
-1, // `*
1036, // <exp2>
39, // <cast exp>
957, // <unary exp>
1117, // <exp1>
953, // `-
1000, // INTLIT
1267, // letter
809, // {"A".."Z" "a" "d" "g" "j".."k" "m".."n" "q".."s" "y".."z"}
809, // "p"
809, // "v"
809, // "c"
809, // "f"
809, // "i"
809, // "l"
809, // "o"
809, // "u"
809, // "x"
809, // "b"
809, // "e"
809, // "h"
809, // "t"
809, // "w"
796, // letter128
269, // {199..218 231..250}
269, // {193..198 225..230}
-1, // digit
923, // {"1".."9"}
1001, // "0"
496, // digit128
679, // {176..185}
-1, // ws
-1, // " "
-1, // {10}
396, // "#"
-1, // "+"
-1, // "*"
956, // "("
-1, // ")"
877, // "{"
-1, // "}"
1303, // "-"
-1, // "="
-1, // "["
-1, // "]"
-1, // ";"
-1, // "@"
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
{ // state 412
MIN_REDUCTION+50, // (default reduction)
  }
,
{ // state 413
43,430, // `*
79,1151, // "*"
MIN_REDUCTION+34, // (default reduction)
  }
,
{ // state 414
0x80000000|1046, // match move
0x80000000|1234, // no-match move
0x80000000|1146, // NT-test-match state for `else
  }
,
{ // state 415
23,1068, // `[
86,373, // "["
MIN_REDUCTION+40, // (default reduction)
  }
,
{ // state 416
2,739, // ws*
MIN_REDUCTION+93, // (default reduction)
  }
,
{ // state 417
0x80000000|196, // match move
0x80000000|219, // no-match move
0x80000000|1146, // NT-test-match state for `else
  }
,
{ // state 418
103,MIN_REDUCTION+99, // $NT
  }
,
{ // state 419
17,1317, // `)
81,585, // ")"
  }
,
{ // state 420
23,MIN_REDUCTION+127, // `[
86,MIN_REDUCTION+127, // "["
MIN_REDUCTION+127, // (default reduction)
  }
,
{ // state 421
0x80000000|551, // match move
0x80000000|1304, // no-match move
0x80000000|1146, // NT-test-match state for `else
  }
,
{ // state 422
MIN_REDUCTION+24, // (default reduction)
  }
,
{ // state 423
58,1205, // "o"
  }
,
{ // state 424
0x80000000|782, // match move
0x80000000|286, // no-match move
0x80000000|1146, // NT-test-match state for `else
  }
,
{ // state 425
57,1063, // "l"
  }
,
{ // state 426
2,1202, // ws*
  }
,
{ // state 427
74,547, // ws
75,698, // " "
76,971, // {10}
MIN_REDUCTION+66, // (default reduction)
  }
,
{ // state 428
MIN_REDUCTION+110, // (default reduction)
  }
,
{ // state 429
2,1217, // ws*
23,MIN_REDUCTION+129, // `[
74,1139, // ws
75,128, // " "
76,125, // {10}
86,MIN_REDUCTION+129, // "["
MIN_REDUCTION+129, // (default reduction)
  }
,
{ // state 430
7,239, // ID
16,482, // `(
44,1213, // <exp2>
45,339, // <cast exp>
46,504, // <unary exp>
47,231, // <exp1>
48,849, // `-
49,478, // INTLIT
50,1027, // letter
51,809, // {"A".."Z" "a" "d" "g" "j".."k" "m".."n" "q".."s" "y".."z"}
52,809, // "p"
53,809, // "v"
54,809, // "c"
55,809, // "f"
56,809, // "i"
57,809, // "l"
58,809, // "o"
59,809, // "u"
60,809, // "x"
61,809, // "b"
62,809, // "e"
63,809, // "h"
64,809, // "t"
65,809, // "w"
66,1296, // letter128
67,749, // {199..218 231..250}
68,749, // {193..198 225..230}
70,300, // {"1".."9"}
71,1120, // "0"
72,594, // digit128
73,1276, // {176..185}
80,956, // "("
84,1303, // "-"
  }
,
{ // state 431
17,774, // `)
81,585, // ")"
  }
,
{ // state 432
27,514, // `;
88,1097, // ";"
  }
,
{ // state 433
2,1140, // ws*
74,257, // ws
75,1182, // " "
76,819, // {10}
MIN_REDUCTION+91, // (default reduction)
  }
,
{ // state 434
0x80000000|1, // match move
0x80000000|513, // no-match move
0x80000000|46, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 435
23,MIN_REDUCTION+113, // `[
86,MIN_REDUCTION+113, // "["
MIN_REDUCTION+113, // (default reduction)
  }
,
{ // state 436
103,MIN_REDUCTION+38, // $NT
MIN_REDUCTION+38, // (default reduction)
  }
,
{ // state 437
0x80000000|782, // match move
0x80000000|1081, // no-match move
0x80000000|1146, // NT-test-match state for `else
  }
,
{ // state 438
7,218, // ID
16,519, // `(
44,1206, // <exp2>
45,262, // <cast exp>
46,488, // <unary exp>
47,111, // <exp1>
48,842, // `-
49,463, // INTLIT
50,968, // letter
51,809, // {"A".."Z" "a" "d" "g" "j".."k" "m".."n" "q".."s" "y".."z"}
52,809, // "p"
53,809, // "v"
54,809, // "c"
55,809, // "f"
56,809, // "i"
57,809, // "l"
58,809, // "o"
59,809, // "u"
60,809, // "x"
61,809, // "b"
62,809, // "e"
63,809, // "h"
64,809, // "t"
65,809, // "w"
66,1233, // letter128
67,735, // {199..218 231..250}
68,735, // {193..198 225..230}
70,274, // {"1".."9"}
71,1079, // "0"
72,590, // digit128
73,1289, // {176..185}
80,956, // "("
84,1303, // "-"
  }
,
{ // state 439
2,1217, // ws*
  }
,
{ // state 440
24,932, // `]
87,86, // "]"
  }
,
{ // state 441
0x80000000|203, // match move
0x80000000|858, // no-match move
0x80000000|797, // NT-test-match state for <exp>
  }
,
{ // state 442
MIN_REDUCTION+111, // (default reduction)
  }
,
{ // state 443
MIN_REDUCTION+50, // (default reduction)
  }
,
{ // state 444
74,1277, // ws
75,990, // " "
76,566, // {10}
MIN_REDUCTION+92, // (default reduction)
  }
,
{ // state 445
0x80000000|1, // match move
0x80000000|534, // no-match move
0x80000000|46, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 446
23,1083, // `[
86,373, // "["
MIN_REDUCTION+40, // (default reduction)
  }
,
{ // state 447
103,MIN_REDUCTION+96, // $NT
  }
,
{ // state 448
0x80000000|1207, // match move
0x80000000|571, // no-match move
0x80000000|797, // NT-test-match state for <exp>
  }
,
{ // state 449
MIN_REDUCTION+13, // (default reduction)
  }
,
{ // state 450
103,MIN_REDUCTION+132, // $NT
  }
,
{ // state 451
74,544, // ws
75,355, // " "
76,287, // {10}
MIN_REDUCTION+62, // (default reduction)
  }
,
{ // state 452
MIN_REDUCTION+51, // (default reduction)
  }
,
{ // state 453
74,591, // ws
75,443, // " "
76,181, // {10}
MIN_REDUCTION+128, // (default reduction)
  }
,
{ // state 454
23,MIN_REDUCTION+100, // `[
86,MIN_REDUCTION+100, // "["
MIN_REDUCTION+100, // (default reduction)
  }
,
{ // state 455
0x80000000|1, // match move
0x80000000|1272, // no-match move
0x80000000|46, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 456
-1, // $$start
-1, // <start>
-1, // ws*
-1, // <program>
-1, // <class decl>+
-1, // <class decl>
-1, // `class
238, // ID
757, // `{
-1, // <decl in class>*
-1, // `}
-1, // `extends
-1, // <decl in class>
-1, // <method decl>
-1, // `public
-1, // `void
853, // `(
-1, // `)
-1, // <stmt>*
209, // <type>
914, // `int
921, // `boolean
-1, // <empty bracket pair>
-1, // `[
-1, // `]
1096, // <stmt>
783, // <assign>
-1, // `;
1093, // <local var decl>
980, // `if
467, // <exp>
-1, // `else
726, // `while
177, // `for
-1, // `=
-1, // `++
638, // <exp8>
292, // <exp7>
406, // <exp6>
408, // <exp5>
1266, // <exp4>
-1, // `+
784, // <exp3>
-1, // `*
1036, // <exp2>
39, // <cast exp>
957, // <unary exp>
1117, // <exp1>
953, // `-
1000, // INTLIT
1267, // letter
809, // {"A".."Z" "a" "d" "g" "j".."k" "m".."n" "q".."s" "y".."z"}
809, // "p"
809, // "v"
809, // "c"
809, // "f"
809, // "i"
809, // "l"
809, // "o"
809, // "u"
809, // "x"
809, // "b"
809, // "e"
809, // "h"
809, // "t"
809, // "w"
796, // letter128
269, // {199..218 231..250}
269, // {193..198 225..230}
-1, // digit
923, // {"1".."9"}
1001, // "0"
496, // digit128
679, // {176..185}
-1, // ws
-1, // " "
-1, // {10}
396, // "#"
-1, // "+"
-1, // "*"
956, // "("
-1, // ")"
877, // "{"
-1, // "}"
1303, // "-"
-1, // "="
-1, // "["
-1, // "]"
-1, // ";"
-1, // "@"
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
{ // state 457
9,492, // <decl in class>*
10,194, // `}
12,645, // <decl in class>
13,212, // <method decl>
14,313, // `public
77,1258, // "#"
83,20, // "}"
  }
,
{ // state 458
0x80000000|215, // match move
0x80000000|74, // no-match move
0x80000000|46, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 459
74,73, // ws
75,93, // " "
76,1172, // {10}
MIN_REDUCTION+92, // (default reduction)
  }
,
{ // state 460
MIN_REDUCTION+18, // (default reduction)
  }
,
{ // state 461
23,MIN_REDUCTION+102, // `[
74,40, // ws
75,141, // " "
76,160, // {10}
86,MIN_REDUCTION+102, // "["
MIN_REDUCTION+102, // (default reduction)
  }
,
{ // state 462
2,643, // ws*
23,MIN_REDUCTION+103, // `[
74,1176, // ws
75,92, // " "
76,103, // {10}
86,MIN_REDUCTION+103, // "["
103,MIN_REDUCTION+103, // $NT
MIN_REDUCTION+103, // (default reduction)
  }
,
{ // state 463
0x80000000|1, // match move
0x80000000|505, // no-match move
0x80000000|46, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 464
7,218, // ID
16,519, // `(
30,1245, // <exp>
36,1158, // <exp8>
37,323, // <exp7>
38,22, // <exp6>
39,21, // <exp5>
40,139, // <exp4>
42,480, // <exp3>
44,83, // <exp2>
45,262, // <cast exp>
46,488, // <unary exp>
47,111, // <exp1>
48,842, // `-
49,463, // INTLIT
50,968, // letter
51,809, // {"A".."Z" "a" "d" "g" "j".."k" "m".."n" "q".."s" "y".."z"}
52,809, // "p"
53,809, // "v"
54,809, // "c"
55,809, // "f"
56,809, // "i"
57,809, // "l"
58,809, // "o"
59,809, // "u"
60,809, // "x"
61,809, // "b"
62,809, // "e"
63,809, // "h"
64,809, // "t"
65,809, // "w"
66,1233, // letter128
67,735, // {199..218 231..250}
68,735, // {193..198 225..230}
70,274, // {"1".."9"}
71,1079, // "0"
72,590, // digit128
73,1289, // {176..185}
80,956, // "("
84,1303, // "-"
  }
,
{ // state 465
7,330, // ID
16,892, // `(
44,1336, // <exp2>
45,393, // <cast exp>
46,436, // <unary exp>
47,306, // <exp1>
48,916, // `-
49,530, // INTLIT
50,929, // letter
51,809, // {"A".."Z" "a" "d" "g" "j".."k" "m".."n" "q".."s" "y".."z"}
52,809, // "p"
53,809, // "v"
54,809, // "c"
55,809, // "f"
56,809, // "i"
57,809, // "l"
58,809, // "o"
59,809, // "u"
60,809, // "x"
61,809, // "b"
62,809, // "e"
63,809, // "h"
64,809, // "t"
65,809, // "w"
66,1058, // letter128
67,820, // {199..218 231..250}
68,820, // {193..198 225..230}
70,381, // {"1".."9"}
71,190, // "0"
72,363, // digit128
73,1219, // {176..185}
80,956, // "("
84,1303, // "-"
  }
,
{ // state 466
MIN_REDUCTION+126, // (default reduction)
  }
,
{ // state 467
34,387, // `=
35,214, // `++
85,1209, // "="
89,25, // "@"
  }
,
{ // state 468
0x80000000|1200, // match move
0x80000000|563, // no-match move
0x80000000|797, // NT-test-match state for <exp>
  }
,
{ // state 469
74,164, // ws
75,995, // " "
76,1025, // {10}
MIN_REDUCTION+92, // (default reduction)
  }
,
{ // state 470
16,889, // `(
80,1065, // "("
  }
,
{ // state 471
2,101, // ws*
23,MIN_REDUCTION+91, // `[
74,1176, // ws
75,92, // " "
76,103, // {10}
86,MIN_REDUCTION+91, // "["
103,MIN_REDUCTION+91, // $NT
MIN_REDUCTION+91, // (default reduction)
  }
,
{ // state 472
23,MIN_REDUCTION+43, // `[
86,MIN_REDUCTION+43, // "["
MIN_REDUCTION+43, // (default reduction)
  }
,
{ // state 473
2,1204, // ws*
103,MIN_REDUCTION+131, // $NT
  }
,
{ // state 474
MIN_REDUCTION+22, // (default reduction)
  }
,
{ // state 475
62,714, // "e"
  }
,
{ // state 476
7,239, // ID
16,482, // `(
42,152, // <exp3>
44,11, // <exp2>
45,339, // <cast exp>
46,504, // <unary exp>
47,231, // <exp1>
48,849, // `-
49,478, // INTLIT
50,1027, // letter
51,809, // {"A".."Z" "a" "d" "g" "j".."k" "m".."n" "q".."s" "y".."z"}
52,809, // "p"
53,809, // "v"
54,809, // "c"
55,809, // "f"
56,809, // "i"
57,809, // "l"
58,809, // "o"
59,809, // "u"
60,809, // "x"
61,809, // "b"
62,809, // "e"
63,809, // "h"
64,809, // "t"
65,809, // "w"
66,1296, // letter128
67,749, // {199..218 231..250}
68,749, // {193..198 225..230}
70,300, // {"1".."9"}
71,1120, // "0"
72,594, // digit128
73,1276, // {176..185}
80,956, // "("
84,1303, // "-"
  }
,
{ // state 477
MIN_REDUCTION+18, // (default reduction)
  }
,
{ // state 478
0x80000000|1, // match move
0x80000000|572, // no-match move
0x80000000|46, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 479
0x80000000|1, // match move
0x80000000|1161, // no-match move
0x80000000|46, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 480
43,438, // `*
79,1151, // "*"
MIN_REDUCTION+34, // (default reduction)
  }
,
{ // state 481
27,144, // `;
88,847, // ";"
  }
,
{ // state 482
7,449, // ID
19,358, // <type>
20,1059, // `int
21,124, // `boolean
50,195, // letter
51,809, // {"A".."Z" "a" "d" "g" "j".."k" "m".."n" "q".."s" "y".."z"}
52,809, // "p"
53,809, // "v"
54,809, // "c"
55,809, // "f"
56,809, // "i"
57,809, // "l"
58,809, // "o"
59,809, // "u"
60,809, // "x"
61,809, // "b"
62,809, // "e"
63,809, // "h"
64,809, // "t"
65,809, // "w"
66,135, // letter128
67,1022, // {199..218 231..250}
68,1022, // {193..198 225..230}
77,308, // "#"
  }
,
{ // state 483
23,1054, // `[
86,373, // "["
MIN_REDUCTION+40, // (default reduction)
  }
,
{ // state 484
0x80000000|906, // match move
0x80000000|751, // no-match move
0x80000000|1146, // NT-test-match state for `else
  }
,
{ // state 485
MIN_REDUCTION+126, // (default reduction)
  }
,
{ // state 486
23,MIN_REDUCTION+100, // `[
86,MIN_REDUCTION+100, // "["
MIN_REDUCTION+100, // (default reduction)
  }
,
{ // state 487
2,1002, // ws*
MIN_REDUCTION+81, // (default reduction)
  }
,
{ // state 488
MIN_REDUCTION+38, // (default reduction)
  }
,
{ // state 489
103,MIN_REDUCTION+126, // $NT
MIN_REDUCTION+126, // (default reduction)
  }
,
{ // state 490
0x80000000|1, // match move
0x80000000|1322, // no-match move
0x80000000|46, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 491
7,239, // ID
16,482, // `(
30,938, // <exp>
36,1049, // <exp8>
37,315, // <exp7>
38,35, // <exp6>
39,32, // <exp5>
40,165, // <exp4>
42,413, // <exp3>
44,11, // <exp2>
45,339, // <cast exp>
46,504, // <unary exp>
47,231, // <exp1>
48,849, // `-
49,478, // INTLIT
50,1027, // letter
51,809, // {"A".."Z" "a" "d" "g" "j".."k" "m".."n" "q".."s" "y".."z"}
52,809, // "p"
53,809, // "v"
54,809, // "c"
55,809, // "f"
56,809, // "i"
57,809, // "l"
58,809, // "o"
59,809, // "u"
60,809, // "x"
61,809, // "b"
62,809, // "e"
63,809, // "h"
64,809, // "t"
65,809, // "w"
66,1296, // letter128
67,749, // {199..218 231..250}
68,749, // {193..198 225..230}
70,300, // {"1".."9"}
71,1120, // "0"
72,594, // digit128
73,1276, // {176..185}
80,956, // "("
84,1303, // "-"
  }
,
{ // state 492
10,1187, // `}
12,365, // <decl in class>
13,212, // <method decl>
14,313, // `public
77,1258, // "#"
83,20, // "}"
  }
,
{ // state 493
MIN_REDUCTION+110, // (default reduction)
  }
,
{ // state 494
58,9, // "o"
  }
,
{ // state 495
MIN_REDUCTION+17, // (default reduction)
  }
,
{ // state 496
0x80000000|1261, // match move
0x80000000|1010, // no-match move
0x80000000|46, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 497
23,MIN_REDUCTION+105, // `[
86,MIN_REDUCTION+105, // "["
MIN_REDUCTION+105, // (default reduction)
  }
,
{ // state 498
27,204, // `;
88,1097, // ";"
  }
,
{ // state 499
2,952, // ws*
MIN_REDUCTION+81, // (default reduction)
  }
,
{ // state 500
2,6, // ws*
  }
,
{ // state 501
0x80000000|1, // match move
0x80000000|199, // no-match move
0x80000000|46, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 502
50,674, // letter
51,66, // {"A".."Z" "a" "d" "g" "j".."k" "m".."n" "q".."s" "y".."z"}
52,66, // "p"
53,66, // "v"
54,66, // "c"
55,66, // "f"
56,66, // "i"
57,66, // "l"
58,66, // "o"
59,66, // "u"
60,66, // "x"
61,66, // "b"
62,66, // "e"
63,66, // "h"
64,66, // "t"
65,66, // "w"
66,12, // letter128
67,1047, // {199..218 231..250}
68,1047, // {193..198 225..230}
69,293, // digit
70,259, // {"1".."9"}
71,259, // "0"
72,1311, // digit128
73,327, // {176..185}
91,45, // $$0
96,1275, // idChar
97,1232, // "_"
98,760, // idChar128
99,405, // {223}
  }
,
{ // state 503
-1, // $$start
-1, // <start>
-1, // ws*
-1, // <program>
-1, // <class decl>+
-1, // <class decl>
-1, // `class
238, // ID
845, // `{
-1, // <decl in class>*
-1, // `}
-1, // `extends
-1, // <decl in class>
-1, // <method decl>
-1, // `public
-1, // `void
853, // `(
-1, // `)
-1, // <stmt>*
209, // <type>
914, // `int
921, // `boolean
-1, // <empty bracket pair>
-1, // `[
-1, // `]
419, // <stmt>
1178, // <assign>
-1, // `;
529, // <local var decl>
622, // `if
467, // <exp>
-1, // `else
1132, // `while
832, // `for
-1, // `=
-1, // `++
638, // <exp8>
292, // <exp7>
406, // <exp6>
408, // <exp5>
1266, // <exp4>
-1, // `+
784, // <exp3>
-1, // `*
1036, // <exp2>
39, // <cast exp>
957, // <unary exp>
1117, // <exp1>
953, // `-
1000, // INTLIT
1267, // letter
809, // {"A".."Z" "a" "d" "g" "j".."k" "m".."n" "q".."s" "y".."z"}
809, // "p"
809, // "v"
809, // "c"
809, // "f"
809, // "i"
809, // "l"
809, // "o"
809, // "u"
809, // "x"
809, // "b"
809, // "e"
809, // "h"
809, // "t"
809, // "w"
796, // letter128
269, // {199..218 231..250}
269, // {193..198 225..230}
-1, // digit
923, // {"1".."9"}
1001, // "0"
496, // digit128
679, // {176..185}
-1, // ws
-1, // " "
-1, // {10}
396, // "#"
-1, // "+"
-1, // "*"
956, // "("
-1, // ")"
877, // "{"
-1, // "}"
1303, // "-"
-1, // "="
-1, // "["
-1, // "]"
-1, // ";"
-1, // "@"
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
{ // state 504
MIN_REDUCTION+38, // (default reduction)
  }
,
{ // state 505
23,MIN_REDUCTION+45, // `[
86,MIN_REDUCTION+45, // "["
MIN_REDUCTION+45, // (default reduction)
  }
,
{ // state 506
23,MIN_REDUCTION+100, // `[
86,MIN_REDUCTION+100, // "["
MIN_REDUCTION+100, // (default reduction)
  }
,
{ // state 507
0x80000000|813, // match move
0x80000000|1134, // no-match move
0x80000000|1146, // NT-test-match state for `else
  }
,
{ // state 508
MIN_REDUCTION+21, // (default reduction)
  }
,
{ // state 509
2,1319, // ws*
74,828, // ws
75,116, // " "
76,441, // {10}
MIN_REDUCTION+75, // (default reduction)
  }
,
{ // state 510
27,198, // `;
88,1097, // ";"
  }
,
{ // state 511
0x80000000|196, // match move
0x80000000|1121, // no-match move
0x80000000|1146, // NT-test-match state for `else
  }
,
{ // state 512
7,218, // ID
16,519, // `(
42,126, // <exp3>
44,83, // <exp2>
45,262, // <cast exp>
46,488, // <unary exp>
47,111, // <exp1>
48,842, // `-
49,463, // INTLIT
50,968, // letter
51,809, // {"A".."Z" "a" "d" "g" "j".."k" "m".."n" "q".."s" "y".."z"}
52,809, // "p"
53,809, // "v"
54,809, // "c"
55,809, // "f"
56,809, // "i"
57,809, // "l"
58,809, // "o"
59,809, // "u"
60,809, // "x"
61,809, // "b"
62,809, // "e"
63,809, // "h"
64,809, // "t"
65,809, // "w"
66,1233, // letter128
67,735, // {199..218 231..250}
68,735, // {193..198 225..230}
70,274, // {"1".."9"}
71,1079, // "0"
72,590, // digit128
73,1289, // {176..185}
80,956, // "("
84,1303, // "-"
  }
,
{ // state 513
23,MIN_REDUCTION+99, // `[
86,MIN_REDUCTION+99, // "["
MIN_REDUCTION+99, // (default reduction)
  }
,
{ // state 514
7,218, // ID
16,519, // `(
30,1263, // <exp>
36,1158, // <exp8>
37,323, // <exp7>
38,22, // <exp6>
39,21, // <exp5>
40,139, // <exp4>
42,480, // <exp3>
44,83, // <exp2>
45,262, // <cast exp>
46,488, // <unary exp>
47,111, // <exp1>
48,842, // `-
49,463, // INTLIT
50,968, // letter
51,809, // {"A".."Z" "a" "d" "g" "j".."k" "m".."n" "q".."s" "y".."z"}
52,809, // "p"
53,809, // "v"
54,809, // "c"
55,809, // "f"
56,809, // "i"
57,809, // "l"
58,809, // "o"
59,809, // "u"
60,809, // "x"
61,809, // "b"
62,809, // "e"
63,809, // "h"
64,809, // "t"
65,809, // "w"
66,1233, // letter128
67,735, // {199..218 231..250}
68,735, // {193..198 225..230}
70,274, // {"1".."9"}
71,1079, // "0"
72,590, // digit128
73,1289, // {176..185}
80,956, // "("
84,1303, // "-"
  }
,
{ // state 515
0x80000000|537, // match move
0x80000000|28, // no-match move
0x80000000|46, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 516
MIN_REDUCTION+38, // (default reduction)
  }
,
{ // state 517
17,872, // `)
22,1056, // <empty bracket pair>
23,1343, // `[
81,1128, // ")"
86,883, // "["
  }
,
{ // state 518
0x80000000|1, // match move
0x80000000|1306, // no-match move
0x80000000|46, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 519
7,449, // ID
19,380, // <type>
20,1059, // `int
21,124, // `boolean
50,195, // letter
51,809, // {"A".."Z" "a" "d" "g" "j".."k" "m".."n" "q".."s" "y".."z"}
52,809, // "p"
53,809, // "v"
54,809, // "c"
55,809, // "f"
56,809, // "i"
57,809, // "l"
58,809, // "o"
59,809, // "u"
60,809, // "x"
61,809, // "b"
62,809, // "e"
63,809, // "h"
64,809, // "t"
65,809, // "w"
66,135, // letter128
67,1022, // {199..218 231..250}
68,1022, // {193..198 225..230}
77,308, // "#"
  }
,
{ // state 520
17,692, // `)
81,585, // ")"
  }
,
{ // state 521
2,1155, // ws*
23,MIN_REDUCTION+133, // `[
74,1129, // ws
75,163, // " "
76,24, // {10}
86,MIN_REDUCTION+133, // "["
MIN_REDUCTION+133, // (default reduction)
  }
,
{ // state 522
7,239, // ID
16,482, // `(
30,910, // <exp>
36,1049, // <exp8>
37,315, // <exp7>
38,35, // <exp6>
39,32, // <exp5>
40,165, // <exp4>
42,413, // <exp3>
44,11, // <exp2>
45,339, // <cast exp>
46,504, // <unary exp>
47,231, // <exp1>
48,849, // `-
49,478, // INTLIT
50,1027, // letter
51,809, // {"A".."Z" "a" "d" "g" "j".."k" "m".."n" "q".."s" "y".."z"}
52,809, // "p"
53,809, // "v"
54,809, // "c"
55,809, // "f"
56,809, // "i"
57,809, // "l"
58,809, // "o"
59,809, // "u"
60,809, // "x"
61,809, // "b"
62,809, // "e"
63,809, // "h"
64,809, // "t"
65,809, // "w"
66,1296, // letter128
67,749, // {199..218 231..250}
68,749, // {193..198 225..230}
70,300, // {"1".."9"}
71,1120, // "0"
72,594, // digit128
73,1276, // {176..185}
80,956, // "("
84,1303, // "-"
  }
,
{ // state 523
23,MIN_REDUCTION+96, // `[
74,321, // ws
75,92, // " "
76,103, // {10}
86,MIN_REDUCTION+96, // "["
103,MIN_REDUCTION+96, // $NT
MIN_REDUCTION+96, // (default reduction)
  }
,
{ // state 524
103,MIN_REDUCTION+127, // $NT
  }
,
{ // state 525
0x80000000|1, // match move
0x80000000|171, // no-match move
0x80000000|46, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 526
7,249, // ID
16,374, // `(
42,176, // <exp3>
44,54, // <exp2>
45,290, // <cast exp>
46,516, // <unary exp>
47,131, // <exp1>
48,862, // `-
49,445, // INTLIT
50,773, // letter
51,809, // {"A".."Z" "a" "d" "g" "j".."k" "m".."n" "q".."s" "y".."z"}
52,809, // "p"
53,809, // "v"
54,809, // "c"
55,809, // "f"
56,809, // "i"
57,809, // "l"
58,809, // "o"
59,809, // "u"
60,809, // "x"
61,809, // "b"
62,809, // "e"
63,809, // "h"
64,809, // "t"
65,809, // "w"
66,1199, // letter128
67,711, // {199..218 231..250}
68,711, // {193..198 225..230}
70,224, // {"1".."9"}
71,1037, // "0"
72,549, // digit128
73,1305, // {176..185}
80,956, // "("
84,1303, // "-"
  }
,
{ // state 527
23,MIN_REDUCTION+49, // `[
86,MIN_REDUCTION+49, // "["
MIN_REDUCTION+49, // (default reduction)
  }
,
{ // state 528
MIN_REDUCTION+123, // (default reduction)
  }
,
{ // state 529
27,49, // `;
88,134, // ";"
  }
,
{ // state 530
0x80000000|561, // match move
0x80000000|612, // no-match move
0x80000000|46, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 531
43,372, // `*
79,1151, // "*"
MIN_REDUCTION+34, // (default reduction)
  }
,
{ // state 532
23,MIN_REDUCTION+102, // `[
74,8, // ws
75,128, // " "
76,125, // {10}
86,MIN_REDUCTION+102, // "["
MIN_REDUCTION+102, // (default reduction)
  }
,
{ // state 533
50,674, // letter
51,66, // {"A".."Z" "a" "d" "g" "j".."k" "m".."n" "q".."s" "y".."z"}
52,66, // "p"
53,66, // "v"
54,66, // "c"
55,66, // "f"
56,66, // "i"
57,66, // "l"
58,66, // "o"
59,66, // "u"
60,66, // "x"
61,66, // "b"
62,66, // "e"
63,66, // "h"
64,66, // "t"
65,66, // "w"
66,149, // letter128
67,1033, // {199..218 231..250}
68,1033, // {193..198 225..230}
69,293, // digit
70,259, // {"1".."9"}
71,259, // "0"
72,1302, // digit128
73,368, // {176..185}
91,70, // $$0
96,1275, // idChar
97,1232, // "_"
98,689, // idChar128
99,442, // {223}
  }
,
{ // state 534
23,MIN_REDUCTION+45, // `[
86,MIN_REDUCTION+45, // "["
MIN_REDUCTION+45, // (default reduction)
  }
,
{ // state 535
2,57, // ws*
  }
,
{ // state 536
-1, // $$start
-1, // <start>
-1, // ws*
-1, // <program>
-1, // <class decl>+
-1, // <class decl>
-1, // `class
238, // ID
731, // `{
-1, // <decl in class>*
-1, // `}
-1, // `extends
-1, // <decl in class>
-1, // <method decl>
-1, // `public
-1, // `void
853, // `(
-1, // `)
-1, // <stmt>*
209, // <type>
914, // `int
921, // `boolean
-1, // <empty bracket pair>
-1, // `[
-1, // `]
1041, // <stmt>
691, // <assign>
-1, // `;
1107, // <local var decl>
908, // `if
467, // <exp>
-1, // `else
703, // `while
208, // `for
-1, // `=
-1, // `++
638, // <exp8>
292, // <exp7>
406, // <exp6>
408, // <exp5>
1266, // <exp4>
-1, // `+
784, // <exp3>
-1, // `*
1036, // <exp2>
39, // <cast exp>
957, // <unary exp>
1117, // <exp1>
953, // `-
1000, // INTLIT
1267, // letter
809, // {"A".."Z" "a" "d" "g" "j".."k" "m".."n" "q".."s" "y".."z"}
809, // "p"
809, // "v"
809, // "c"
809, // "f"
809, // "i"
809, // "l"
809, // "o"
809, // "u"
809, // "x"
809, // "b"
809, // "e"
809, // "h"
809, // "t"
809, // "w"
796, // letter128
269, // {199..218 231..250}
269, // {193..198 225..230}
-1, // digit
923, // {"1".."9"}
1001, // "0"
496, // digit128
679, // {176..185}
-1, // ws
-1, // " "
-1, // {10}
396, // "#"
-1, // "+"
-1, // "*"
956, // "("
-1, // ")"
877, // "{"
-1, // "}"
1303, // "-"
-1, // "="
-1, // "["
-1, // "]"
-1, // ";"
-1, // "@"
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
{ // state 537
MIN_REDUCTION+96, // (default reduction)
  }
,
{ // state 538
2,137, // ws*
23,MIN_REDUCTION+129, // `[
74,1129, // ws
75,163, // " "
76,24, // {10}
86,MIN_REDUCTION+129, // "["
MIN_REDUCTION+129, // (default reduction)
  }
,
{ // state 539
0x80000000|18, // match move
0x80000000|495, // no-match move
0x80000000|1146, // NT-test-match state for `else
  }
,
{ // state 540
MIN_REDUCTION+99, // (default reduction)
  }
,
{ // state 541
0x80000000|113, // match move
0x80000000|107, // no-match move
0x80000000|46, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 542
MIN_REDUCTION+15, // (default reduction)
  }
,
{ // state 543
0x80000000|955, // match move
0x80000000|598, // no-match move
0x80000000|1146, // NT-test-match state for `else
  }
,
{ // state 544
MIN_REDUCTION+126, // (default reduction)
  }
,
{ // state 545
MIN_REDUCTION+126, // (default reduction)
  }
,
{ // state 546
69,1050, // digit
70,1101, // {"1".."9"}
71,1101, // "0"
72,1320, // digit128
73,1305, // {176..185}
93,201, // $$1
  }
,
{ // state 547
MIN_REDUCTION+126, // (default reduction)
  }
,
{ // state 548
2,664, // ws*
23,MIN_REDUCTION+129, // `[
74,162, // ws
75,744, // " "
76,100, // {10}
86,MIN_REDUCTION+129, // "["
MIN_REDUCTION+129, // (default reduction)
  }
,
{ // state 549
0x80000000|616, // match move
0x80000000|620, // no-match move
0x80000000|46, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 550
-1, // $$start
-1, // <start>
-1, // ws*
-1, // <program>
-1, // <class decl>+
-1, // <class decl>
-1, // `class
238, // ID
50, // `{
-1, // <decl in class>*
-1, // `}
-1, // `extends
-1, // <decl in class>
-1, // <method decl>
-1, // `public
-1, // `void
853, // `(
-1, // `)
-1, // <stmt>*
209, // <type>
914, // `int
921, // `boolean
-1, // <empty bracket pair>
-1, // `[
-1, // `]
1026, // <stmt>
1044, // <assign>
-1, // `;
26, // <local var decl>
241, // `if
467, // <exp>
-1, // `else
1318, // `while
184, // `for
-1, // `=
-1, // `++
638, // <exp8>
292, // <exp7>
406, // <exp6>
408, // <exp5>
1266, // <exp4>
-1, // `+
784, // <exp3>
-1, // `*
1036, // <exp2>
39, // <cast exp>
957, // <unary exp>
1117, // <exp1>
953, // `-
1000, // INTLIT
1267, // letter
809, // {"A".."Z" "a" "d" "g" "j".."k" "m".."n" "q".."s" "y".."z"}
809, // "p"
809, // "v"
809, // "c"
809, // "f"
809, // "i"
809, // "l"
809, // "o"
809, // "u"
809, // "x"
809, // "b"
809, // "e"
809, // "h"
809, // "t"
809, // "w"
796, // letter128
269, // {199..218 231..250}
269, // {193..198 225..230}
-1, // digit
923, // {"1".."9"}
1001, // "0"
496, // digit128
679, // {176..185}
-1, // ws
-1, // " "
-1, // {10}
396, // "#"
-1, // "+"
-1, // "*"
956, // "("
-1, // ")"
877, // "{"
-1, // "}"
1303, // "-"
-1, // "="
-1, // "["
-1, // "]"
-1, // ";"
-1, // "@"
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
{ // state 551
MIN_REDUCTION+18, // (default reduction)
  }
,
{ // state 552
7,239, // ID
16,482, // `(
30,1017, // <exp>
36,1049, // <exp8>
37,315, // <exp7>
38,35, // <exp6>
39,32, // <exp5>
40,165, // <exp4>
42,413, // <exp3>
44,11, // <exp2>
45,339, // <cast exp>
46,504, // <unary exp>
47,231, // <exp1>
48,849, // `-
49,478, // INTLIT
50,1027, // letter
51,809, // {"A".."Z" "a" "d" "g" "j".."k" "m".."n" "q".."s" "y".."z"}
52,809, // "p"
53,809, // "v"
54,809, // "c"
55,809, // "f"
56,809, // "i"
57,809, // "l"
58,809, // "o"
59,809, // "u"
60,809, // "x"
61,809, // "b"
62,809, // "e"
63,809, // "h"
64,809, // "t"
65,809, // "w"
66,1296, // letter128
67,749, // {199..218 231..250}
68,749, // {193..198 225..230}
70,300, // {"1".."9"}
71,1120, // "0"
72,594, // digit128
73,1276, // {176..185}
80,956, // "("
84,1303, // "-"
  }
,
{ // state 553
2,664, // ws*
  }
,
{ // state 554
MIN_REDUCTION+126, // (default reduction)
  }
,
{ // state 555
MIN_REDUCTION+126, // (default reduction)
  }
,
{ // state 556
MIN_REDUCTION+127, // (default reduction)
  }
,
{ // state 557
2,1119, // ws*
23,MIN_REDUCTION+133, // `[
74,1147, // ws
75,141, // " "
76,160, // {10}
86,MIN_REDUCTION+133, // "["
MIN_REDUCTION+133, // (default reduction)
  }
,
{ // state 558
-1, // $$start
-1, // <start>
-1, // ws*
-1, // <program>
-1, // <class decl>+
-1, // <class decl>
-1, // `class
238, // ID
770, // `{
-1, // <decl in class>*
-1, // `}
-1, // `extends
-1, // <decl in class>
-1, // <method decl>
-1, // `public
-1, // `void
853, // `(
-1, // `)
-1, // <stmt>*
209, // <type>
914, // `int
921, // `boolean
-1, // <empty bracket pair>
-1, // `[
-1, // `]
583, // <stmt>
182, // <assign>
-1, // `;
1031, // <local var decl>
1332, // `if
467, // <exp>
-1, // `else
659, // `while
1229, // `for
-1, // `=
-1, // `++
638, // <exp8>
292, // <exp7>
406, // <exp6>
408, // <exp5>
1266, // <exp4>
-1, // `+
784, // <exp3>
-1, // `*
1036, // <exp2>
39, // <cast exp>
957, // <unary exp>
1117, // <exp1>
953, // `-
1000, // INTLIT
1267, // letter
809, // {"A".."Z" "a" "d" "g" "j".."k" "m".."n" "q".."s" "y".."z"}
809, // "p"
809, // "v"
809, // "c"
809, // "f"
809, // "i"
809, // "l"
809, // "o"
809, // "u"
809, // "x"
809, // "b"
809, // "e"
809, // "h"
809, // "t"
809, // "w"
796, // letter128
269, // {199..218 231..250}
269, // {193..198 225..230}
-1, // digit
923, // {"1".."9"}
1001, // "0"
496, // digit128
679, // {176..185}
-1, // ws
-1, // " "
-1, // {10}
396, // "#"
-1, // "+"
-1, // "*"
956, // "("
-1, // ")"
877, // "{"
-1, // "}"
1303, // "-"
-1, // "="
-1, // "["
-1, // "]"
-1, // ";"
-1, // "@"
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
{ // state 559
-1, // $$start
-1, // <start>
-1, // ws*
-1, // <program>
-1, // <class decl>+
-1, // <class decl>
-1, // `class
238, // ID
731, // `{
-1, // <decl in class>*
-1, // `}
-1, // `extends
-1, // <decl in class>
-1, // <method decl>
-1, // `public
-1, // `void
853, // `(
-1, // `)
-1, // <stmt>*
209, // <type>
914, // `int
921, // `boolean
-1, // <empty bracket pair>
-1, // `[
-1, // `]
437, // <stmt>
691, // <assign>
-1, // `;
1107, // <local var decl>
908, // `if
467, // <exp>
-1, // `else
703, // `while
208, // `for
-1, // `=
-1, // `++
638, // <exp8>
292, // <exp7>
406, // <exp6>
408, // <exp5>
1266, // <exp4>
-1, // `+
784, // <exp3>
-1, // `*
1036, // <exp2>
39, // <cast exp>
957, // <unary exp>
1117, // <exp1>
953, // `-
1000, // INTLIT
1267, // letter
809, // {"A".."Z" "a" "d" "g" "j".."k" "m".."n" "q".."s" "y".."z"}
809, // "p"
809, // "v"
809, // "c"
809, // "f"
809, // "i"
809, // "l"
809, // "o"
809, // "u"
809, // "x"
809, // "b"
809, // "e"
809, // "h"
809, // "t"
809, // "w"
796, // letter128
269, // {199..218 231..250}
269, // {193..198 225..230}
-1, // digit
923, // {"1".."9"}
1001, // "0"
496, // digit128
679, // {176..185}
-1, // ws
-1, // " "
-1, // {10}
396, // "#"
-1, // "+"
-1, // "*"
956, // "("
-1, // ")"
877, // "{"
-1, // "}"
1303, // "-"
-1, // "="
-1, // "["
-1, // "]"
-1, // ";"
-1, // "@"
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
{ // state 560
17,310, // `)
81,585, // ")"
  }
,
{ // state 561
103,MIN_REDUCTION+45, // $NT
  }
,
{ // state 562
23,MIN_REDUCTION+90, // `[
74,321, // ws
75,92, // " "
76,103, // {10}
86,MIN_REDUCTION+90, // "["
103,MIN_REDUCTION+90, // $NT
MIN_REDUCTION+90, // (default reduction)
  }
,
{ // state 563
17,575, // `)
81,585, // ")"
  }
,
{ // state 564
2,643, // ws*
103,MIN_REDUCTION+103, // $NT
  }
,
{ // state 565
-1, // $$start
-1, // <start>
-1, // ws*
-1, // <program>
-1, // <class decl>+
-1, // <class decl>
-1, // `class
238, // ID
710, // `{
-1, // <decl in class>*
815, // `}
-1, // `extends
-1, // <decl in class>
-1, // <method decl>
-1, // `public
-1, // `void
853, // `(
-1, // `)
-1, // <stmt>*
209, // <type>
914, // `int
921, // `boolean
-1, // <empty bracket pair>
-1, // `[
-1, // `]
838, // <stmt>
950, // <assign>
-1, // `;
402, // <local var decl>
1316, // `if
467, // <exp>
-1, // `else
392, // `while
893, // `for
-1, // `=
-1, // `++
638, // <exp8>
292, // <exp7>
406, // <exp6>
408, // <exp5>
1266, // <exp4>
-1, // `+
784, // <exp3>
-1, // `*
1036, // <exp2>
39, // <cast exp>
957, // <unary exp>
1117, // <exp1>
953, // `-
1000, // INTLIT
1267, // letter
809, // {"A".."Z" "a" "d" "g" "j".."k" "m".."n" "q".."s" "y".."z"}
809, // "p"
809, // "v"
809, // "c"
809, // "f"
809, // "i"
809, // "l"
809, // "o"
809, // "u"
809, // "x"
809, // "b"
809, // "e"
809, // "h"
809, // "t"
809, // "w"
796, // letter128
269, // {199..218 231..250}
269, // {193..198 225..230}
-1, // digit
923, // {"1".."9"}
1001, // "0"
496, // digit128
679, // {176..185}
-1, // ws
-1, // " "
-1, // {10}
396, // "#"
-1, // "+"
-1, // "*"
956, // "("
-1, // ")"
877, // "{"
875, // "}"
1303, // "-"
-1, // "="
-1, // "["
-1, // "]"
-1, // ";"
-1, // "@"
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
{ // state 566
0x80000000|317, // match move
0x80000000|997, // no-match move
0x80000000|1146, // NT-test-match state for `else
  }
,
{ // state 567
MIN_REDUCTION+126, // (default reduction)
  }
,
{ // state 568
23,MIN_REDUCTION+43, // `[
86,MIN_REDUCTION+43, // "["
103,MIN_REDUCTION+43, // $NT
MIN_REDUCTION+43, // (default reduction)
  }
,
{ // state 569
7,239, // ID
16,482, // `(
30,944, // <exp>
36,1049, // <exp8>
37,315, // <exp7>
38,35, // <exp6>
39,32, // <exp5>
40,165, // <exp4>
42,413, // <exp3>
44,11, // <exp2>
45,339, // <cast exp>
46,504, // <unary exp>
47,231, // <exp1>
48,849, // `-
49,478, // INTLIT
50,1027, // letter
51,809, // {"A".."Z" "a" "d" "g" "j".."k" "m".."n" "q".."s" "y".."z"}
52,809, // "p"
53,809, // "v"
54,809, // "c"
55,809, // "f"
56,809, // "i"
57,809, // "l"
58,809, // "o"
59,809, // "u"
60,809, // "x"
61,809, // "b"
62,809, // "e"
63,809, // "h"
64,809, // "t"
65,809, // "w"
66,1296, // letter128
67,749, // {199..218 231..250}
68,749, // {193..198 225..230}
70,300, // {"1".."9"}
71,1120, // "0"
72,594, // digit128
73,1276, // {176..185}
80,956, // "("
84,1303, // "-"
  }
,
{ // state 570
0x80000000|823, // match move
0x80000000|699, // no-match move
0x80000000|46, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 571
17,559, // `)
81,585, // ")"
  }
,
{ // state 572
23,MIN_REDUCTION+45, // `[
86,MIN_REDUCTION+45, // "["
MIN_REDUCTION+45, // (default reduction)
  }
,
{ // state 573
17,328, // `)
81,585, // ")"
  }
,
{ // state 574
16,848, // `(
80,1065, // "("
  }
,
{ // state 575
-1, // $$start
-1, // <start>
-1, // ws*
-1, // <program>
-1, // <class decl>+
-1, // <class decl>
-1, // `class
238, // ID
757, // `{
-1, // <decl in class>*
-1, // `}
-1, // `extends
-1, // <decl in class>
-1, // <method decl>
-1, // `public
-1, // `void
853, // `(
-1, // `)
-1, // <stmt>*
209, // <type>
914, // `int
921, // `boolean
-1, // <empty bracket pair>
-1, // `[
-1, // `]
424, // <stmt>
783, // <assign>
-1, // `;
1093, // <local var decl>
980, // `if
467, // <exp>
-1, // `else
726, // `while
177, // `for
-1, // `=
-1, // `++
638, // <exp8>
292, // <exp7>
406, // <exp6>
408, // <exp5>
1266, // <exp4>
-1, // `+
784, // <exp3>
-1, // `*
1036, // <exp2>
39, // <cast exp>
957, // <unary exp>
1117, // <exp1>
953, // `-
1000, // INTLIT
1267, // letter
809, // {"A".."Z" "a" "d" "g" "j".."k" "m".."n" "q".."s" "y".."z"}
809, // "p"
809, // "v"
809, // "c"
809, // "f"
809, // "i"
809, // "l"
809, // "o"
809, // "u"
809, // "x"
809, // "b"
809, // "e"
809, // "h"
809, // "t"
809, // "w"
796, // letter128
269, // {199..218 231..250}
269, // {193..198 225..230}
-1, // digit
923, // {"1".."9"}
1001, // "0"
496, // digit128
679, // {176..185}
-1, // ws
-1, // " "
-1, // {10}
396, // "#"
-1, // "+"
-1, // "*"
956, // "("
-1, // ")"
877, // "{"
-1, // "}"
1303, // "-"
-1, // "="
-1, // "["
-1, // "]"
-1, // ";"
-1, // "@"
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
{ // state 576
31,5, // `else
77,475, // "#"
  }
,
{ // state 577
0x80000000|317, // match move
0x80000000|1020, // no-match move
0x80000000|1146, // NT-test-match state for `else
  }
,
{ // state 578
7,239, // ID
16,482, // `(
30,756, // <exp>
36,1049, // <exp8>
37,315, // <exp7>
38,35, // <exp6>
39,32, // <exp5>
40,165, // <exp4>
42,413, // <exp3>
44,11, // <exp2>
45,339, // <cast exp>
46,504, // <unary exp>
47,231, // <exp1>
48,849, // `-
49,478, // INTLIT
50,1027, // letter
51,809, // {"A".."Z" "a" "d" "g" "j".."k" "m".."n" "q".."s" "y".."z"}
52,809, // "p"
53,809, // "v"
54,809, // "c"
55,809, // "f"
56,809, // "i"
57,809, // "l"
58,809, // "o"
59,809, // "u"
60,809, // "x"
61,809, // "b"
62,809, // "e"
63,809, // "h"
64,809, // "t"
65,809, // "w"
66,1296, // letter128
67,749, // {199..218 231..250}
68,749, // {193..198 225..230}
70,300, // {"1".."9"}
71,1120, // "0"
72,594, // digit128
73,1276, // {176..185}
80,956, // "("
84,1303, // "-"
  }
,
{ // state 579
63,1339, // "h"
  }
,
{ // state 580
MIN_REDUCTION+126, // (default reduction)
  }
,
{ // state 581
17,MIN_REDUCTION+50, // `)
81,MIN_REDUCTION+50, // ")"
MIN_REDUCTION+50, // (default reduction)
  }
,
{ // state 582
103,MIN_REDUCTION+47, // $NT
MIN_REDUCTION+47, // (default reduction)
  }
,
{ // state 583
0x80000000|906, // match move
0x80000000|736, // no-match move
0x80000000|1146, // NT-test-match state for `else
  }
,
{ // state 584
0x80000000|493, // match move
0x80000000|153, // no-match move
0x80000000|46, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 585
2,1082, // ws*
74,1077, // ws
75,698, // " "
76,971, // {10}
MIN_REDUCTION+77, // (default reduction)
  }
,
{ // state 586
0x80000000|230, // match move
0x80000000|56, // no-match move
0x80000000|46, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 587
MIN_REDUCTION+41, // (default reduction)
  }
,
{ // state 588
-1, // $$start
-1, // <start>
-1, // ws*
-1, // <program>
-1, // <class decl>+
-1, // <class decl>
-1, // `class
238, // ID
734, // `{
-1, // <decl in class>*
-1, // `}
-1, // `extends
-1, // <decl in class>
-1, // <method decl>
-1, // `public
-1, // `void
853, // `(
-1, // `)
-1, // <stmt>*
209, // <type>
914, // `int
921, // `boolean
-1, // <empty bracket pair>
-1, // `[
-1, // `]
484, // <stmt>
170, // <assign>
-1, // `;
1062, // <local var decl>
1284, // `if
467, // <exp>
-1, // `else
574, // `while
1249, // `for
-1, // `=
-1, // `++
638, // <exp8>
292, // <exp7>
406, // <exp6>
408, // <exp5>
1266, // <exp4>
-1, // `+
784, // <exp3>
-1, // `*
1036, // <exp2>
39, // <cast exp>
957, // <unary exp>
1117, // <exp1>
953, // `-
1000, // INTLIT
1267, // letter
809, // {"A".."Z" "a" "d" "g" "j".."k" "m".."n" "q".."s" "y".."z"}
809, // "p"
809, // "v"
809, // "c"
809, // "f"
809, // "i"
809, // "l"
809, // "o"
809, // "u"
809, // "x"
809, // "b"
809, // "e"
809, // "h"
809, // "t"
809, // "w"
796, // letter128
269, // {199..218 231..250}
269, // {193..198 225..230}
-1, // digit
923, // {"1".."9"}
1001, // "0"
496, // digit128
679, // {176..185}
-1, // ws
-1, // " "
-1, // {10}
396, // "#"
-1, // "+"
-1, // "*"
956, // "("
-1, // ")"
877, // "{"
-1, // "}"
1303, // "-"
-1, // "="
-1, // "["
-1, // "]"
-1, // ";"
-1, // "@"
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
{ // state 589
2,1067, // ws*
74,762, // ws
75,394, // " "
76,226, // {10}
MIN_REDUCTION+95, // (default reduction)
  }
,
{ // state 590
0x80000000|630, // match move
0x80000000|651, // no-match move
0x80000000|46, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 591
MIN_REDUCTION+126, // (default reduction)
  }
,
{ // state 592
2,1078, // ws*
23,MIN_REDUCTION+133, // `[
74,1139, // ws
75,128, // " "
76,125, // {10}
86,MIN_REDUCTION+133, // "["
MIN_REDUCTION+133, // (default reduction)
  }
,
{ // state 593
74,MIN_REDUCTION+50, // ws
75,MIN_REDUCTION+50, // " "
76,MIN_REDUCTION+50, // {10}
MIN_REDUCTION+50, // (default reduction)
  }
,
{ // state 594
0x80000000|637, // match move
0x80000000|670, // no-match move
0x80000000|46, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 595
MIN_REDUCTION+126, // (default reduction)
  }
,
{ // state 596
7,239, // ID
16,482, // `(
45,788, // <cast exp>
47,1160, // <exp1>
49,478, // INTLIT
50,1027, // letter
51,809, // {"A".."Z" "a" "d" "g" "j".."k" "m".."n" "q".."s" "y".."z"}
52,809, // "p"
53,809, // "v"
54,809, // "c"
55,809, // "f"
56,809, // "i"
57,809, // "l"
58,809, // "o"
59,809, // "u"
60,809, // "x"
61,809, // "b"
62,809, // "e"
63,809, // "h"
64,809, // "t"
65,809, // "w"
66,1296, // letter128
67,749, // {199..218 231..250}
68,749, // {193..198 225..230}
70,300, // {"1".."9"}
71,1120, // "0"
72,594, // digit128
73,1276, // {176..185}
80,956, // "("
  }
,
{ // state 597
2,360, // ws*
74,1100, // ws
75,1012, // " "
76,993, // {10}
MIN_REDUCTION+81, // (default reduction)
  }
,
{ // state 598
MIN_REDUCTION+20, // (default reduction)
  }
,
{ // state 599
0x80000000|829, // match move
0x80000000|887, // no-match move
0x80000000|797, // NT-test-match state for <exp>
  }
,
{ // state 600
2,1085, // ws*
  }
,
{ // state 601
57,719, // "l"
  }
,
{ // state 602
74,544, // ws
75,355, // " "
76,287, // {10}
MIN_REDUCTION+64, // (default reduction)
  }
,
{ // state 603
27,MIN_REDUCTION+50, // `;
88,MIN_REDUCTION+50, // ";"
MIN_REDUCTION+50, // (default reduction)
  }
,
{ // state 604
31,619, // `else
77,475, // "#"
  }
,
{ // state 605
7,330, // ID
16,892, // `(
42,80, // <exp3>
44,132, // <exp2>
45,393, // <cast exp>
46,436, // <unary exp>
47,306, // <exp1>
48,916, // `-
49,530, // INTLIT
50,929, // letter
51,809, // {"A".."Z" "a" "d" "g" "j".."k" "m".."n" "q".."s" "y".."z"}
52,809, // "p"
53,809, // "v"
54,809, // "c"
55,809, // "f"
56,809, // "i"
57,809, // "l"
58,809, // "o"
59,809, // "u"
60,809, // "x"
61,809, // "b"
62,809, // "e"
63,809, // "h"
64,809, // "t"
65,809, // "w"
66,1058, // letter128
67,820, // {199..218 231..250}
68,820, // {193..198 225..230}
70,381, // {"1".."9"}
71,190, // "0"
72,363, // digit128
73,1219, // {176..185}
80,956, // "("
84,1303, // "-"
  }
,
{ // state 606
2,899, // ws*
74,707, // ws
75,443, // " "
76,181, // {10}
MIN_REDUCTION+77, // (default reduction)
  }
,
{ // state 607
0x80000000|1024, // match move
0x80000000|608, // no-match move
0x80000000|1146, // NT-test-match state for `else
  }
,
{ // state 608
MIN_REDUCTION+20, // (default reduction)
  }
,
{ // state 609
2,1086, // ws*
74,969, // ws
75,991, // " "
76,332, // {10}
103,MIN_REDUCTION+91, // $NT
  }
,
{ // state 610
102,MIN_REDUCTION+0, // $
  }
,
{ // state 611
17,1153, // `)
81,585, // ")"
  }
,
{ // state 612
23,MIN_REDUCTION+45, // `[
86,MIN_REDUCTION+45, // "["
103,MIN_REDUCTION+45, // $NT
MIN_REDUCTION+45, // (default reduction)
  }
,
{ // state 613
69,1050, // digit
70,1101, // {"1".."9"}
71,1101, // "0"
72,1164, // digit128
73,1219, // {176..185}
93,120, // $$1
  }
,
{ // state 614
50,674, // letter
51,66, // {"A".."Z" "a" "d" "g" "j".."k" "m".."n" "q".."s" "y".."z"}
52,66, // "p"
53,66, // "v"
54,66, // "c"
55,66, // "f"
56,66, // "i"
57,66, // "l"
58,66, // "o"
59,66, // "u"
60,66, // "x"
61,66, // "b"
62,66, // "e"
63,66, // "h"
64,66, // "t"
65,66, // "w"
66,149, // letter128
67,1033, // {199..218 231..250}
68,1033, // {193..198 225..230}
69,293, // digit
70,259, // {"1".."9"}
71,259, // "0"
72,1302, // digit128
73,368, // {176..185}
90,533, // idChar*
91,192, // $$0
96,528, // idChar
97,1232, // "_"
98,689, // idChar128
99,442, // {223}
  }
,
{ // state 615
103,MIN_REDUCTION+51, // $NT
  }
,
{ // state 616
2,811, // ws*
  }
,
{ // state 617
2,1310, // ws*
74,303, // ws
75,995, // " "
76,1025, // {10}
MIN_REDUCTION+75, // (default reduction)
  }
,
{ // state 618
0x80000000|717, // match move
0x80000000|521, // no-match move
0x80000000|46, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 619
-1, // $$start
-1, // <start>
-1, // ws*
-1, // <program>
-1, // <class decl>+
-1, // <class decl>
-1, // `class
238, // ID
50, // `{
-1, // <decl in class>*
-1, // `}
-1, // `extends
-1, // <decl in class>
-1, // <method decl>
-1, // `public
-1, // `void
853, // `(
-1, // `)
-1, // <stmt>*
209, // <type>
914, // `int
921, // `boolean
-1, // <empty bracket pair>
-1, // `[
-1, // `]
1242, // <stmt>
1044, // <assign>
-1, // `;
26, // <local var decl>
241, // `if
467, // <exp>
-1, // `else
1318, // `while
184, // `for
-1, // `=
-1, // `++
638, // <exp8>
292, // <exp7>
406, // <exp6>
408, // <exp5>
1266, // <exp4>
-1, // `+
784, // <exp3>
-1, // `*
1036, // <exp2>
39, // <cast exp>
957, // <unary exp>
1117, // <exp1>
953, // `-
1000, // INTLIT
1267, // letter
809, // {"A".."Z" "a" "d" "g" "j".."k" "m".."n" "q".."s" "y".."z"}
809, // "p"
809, // "v"
809, // "c"
809, // "f"
809, // "i"
809, // "l"
809, // "o"
809, // "u"
809, // "x"
809, // "b"
809, // "e"
809, // "h"
809, // "t"
809, // "w"
796, // letter128
269, // {199..218 231..250}
269, // {193..198 225..230}
-1, // digit
923, // {"1".."9"}
1001, // "0"
496, // digit128
679, // {176..185}
-1, // ws
-1, // " "
-1, // {10}
396, // "#"
-1, // "+"
-1, // "*"
956, // "("
-1, // ")"
877, // "{"
-1, // "}"
1303, // "-"
-1, // "="
-1, // "["
-1, // "]"
-1, // ";"
-1, // "@"
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
{ // state 620
2,811, // ws*
23,MIN_REDUCTION+103, // `[
74,1129, // ws
75,163, // " "
76,24, // {10}
86,MIN_REDUCTION+103, // "["
MIN_REDUCTION+103, // (default reduction)
  }
,
{ // state 621
0x80000000|337, // match move
0x80000000|87, // no-match move
0x80000000|46, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 622
16,68, // `(
80,617, // "("
  }
,
{ // state 623
7,996, // ID
50,123, // letter
51,809, // {"A".."Z" "a" "d" "g" "j".."k" "m".."n" "q".."s" "y".."z"}
52,809, // "p"
53,809, // "v"
54,809, // "c"
55,809, // "f"
56,809, // "i"
57,809, // "l"
58,809, // "o"
59,809, // "u"
60,809, // "x"
61,809, // "b"
62,809, // "e"
63,809, // "h"
64,809, // "t"
65,809, // "w"
66,240, // letter128
67,656, // {199..218 231..250}
68,656, // {193..198 225..230}
  }
,
{ // state 624
17,677, // `)
22,1056, // <empty bracket pair>
23,1343, // `[
81,1128, // ")"
86,883, // "["
  }
,
{ // state 625
74,1277, // ws
75,990, // " "
76,566, // {10}
MIN_REDUCTION+80, // (default reduction)
  }
,
{ // state 626
2,79, // ws*
74,984, // ws
75,319, // " "
76,345, // {10}
MIN_REDUCTION+71, // (default reduction)
  }
,
{ // state 627
24,886, // `]
87,174, // "]"
  }
,
{ // state 628
23,1312, // `[
86,373, // "["
103,MIN_REDUCTION+40, // $NT
MIN_REDUCTION+40, // (default reduction)
  }
,
{ // state 629
23,MIN_REDUCTION+50, // `[
86,MIN_REDUCTION+50, // "["
MIN_REDUCTION+50, // (default reduction)
  }
,
{ // state 630
2,771, // ws*
  }
,
{ // state 631
17,MIN_REDUCTION+50, // `)
81,MIN_REDUCTION+50, // ")"
MIN_REDUCTION+50, // (default reduction)
  }
,
{ // state 632
MIN_REDUCTION+127, // (default reduction)
  }
,
{ // state 633
24,895, // `]
87,335, // "]"
  }
,
{ // state 634
74,1256, // ws
75,970, // " "
76,577, // {10}
MIN_REDUCTION+80, // (default reduction)
  }
,
{ // state 635
MIN_REDUCTION+49, // (default reduction)
  }
,
{ // state 636
0x80000000|1240, // match move
0x80000000|154, // no-match move
0x80000000|1146, // NT-test-match state for `else
  }
,
{ // state 637
2,694, // ws*
  }
,
{ // state 638
MIN_REDUCTION+28, // (default reduction)
  }
,
{ // state 639
23,1312, // `[
86,373, // "["
103,MIN_REDUCTION+42, // $NT
MIN_REDUCTION+42, // (default reduction)
  }
,
{ // state 640
23,MIN_REDUCTION+90, // `[
74,8, // ws
75,128, // " "
76,125, // {10}
86,MIN_REDUCTION+90, // "["
MIN_REDUCTION+90, // (default reduction)
  }
,
{ // state 641
23,MIN_REDUCTION+113, // `[
86,MIN_REDUCTION+113, // "["
MIN_REDUCTION+113, // (default reduction)
  }
,
{ // state 642
50,674, // letter
51,66, // {"A".."Z" "a" "d" "g" "j".."k" "m".."n" "q".."s" "y".."z"}
52,66, // "p"
53,66, // "v"
54,66, // "c"
55,66, // "f"
56,66, // "i"
57,66, // "l"
58,66, // "o"
59,66, // "u"
60,66, // "x"
61,66, // "b"
62,66, // "e"
63,66, // "h"
64,66, // "t"
65,66, // "w"
66,12, // letter128
67,1047, // {199..218 231..250}
68,1047, // {193..198 225..230}
69,293, // digit
70,259, // {"1".."9"}
71,259, // "0"
72,1311, // digit128
73,327, // {176..185}
90,502, // idChar*
91,130, // $$0
96,528, // idChar
97,1232, // "_"
98,760, // idChar128
99,405, // {223}
  }
,
{ // state 643
0x80000000|147, // match move
0x80000000|220, // no-match move
0x80000000|46, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 644
31,964, // `else
77,475, // "#"
  }
,
{ // state 645
MIN_REDUCTION+117, // (default reduction)
  }
,
{ // state 646
MIN_REDUCTION+98, // (default reduction)
  }
,
{ // state 647
43,465, // `*
79,1151, // "*"
103,MIN_REDUCTION+34, // $NT
MIN_REDUCTION+34, // (default reduction)
  }
,
{ // state 648
MIN_REDUCTION+10, // (default reduction)
  }
,
{ // state 649
0x80000000|1, // match move
0x80000000|232, // no-match move
0x80000000|46, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 650
MIN_REDUCTION+109, // (default reduction)
  }
,
{ // state 651
2,771, // ws*
23,MIN_REDUCTION+103, // `[
74,1147, // ws
75,141, // " "
76,160, // {10}
86,MIN_REDUCTION+103, // "["
MIN_REDUCTION+103, // (default reduction)
  }
,
{ // state 652
23,MIN_REDUCTION+43, // `[
86,MIN_REDUCTION+43, // "["
MIN_REDUCTION+43, // (default reduction)
  }
,
{ // state 653
16,150, // `(
80,16, // "("
  }
,
{ // state 654
103,MIN_REDUCTION+100, // $NT
  }
,
{ // state 655
74,1019, // ws
75,742, // " "
76,1262, // {10}
MIN_REDUCTION+52, // (default reduction)
  }
,
{ // state 656
MIN_REDUCTION+47, // (default reduction)
  }
,
{ // state 657
2,1085, // ws*
23,MIN_REDUCTION+97, // `[
74,162, // ws
75,744, // " "
76,100, // {10}
86,MIN_REDUCTION+97, // "["
MIN_REDUCTION+97, // (default reduction)
  }
,
{ // state 658
74,62, // ws
75,1265, // " "
76,702, // {10}
MIN_REDUCTION+54, // (default reduction)
  }
,
{ // state 659
16,728, // `(
80,1065, // "("
  }
,
{ // state 660
-1, // $$start
-1, // <start>
-1, // ws*
-1, // <program>
-1, // <class decl>+
-1, // <class decl>
-1, // `class
238, // ID
713, // `{
-1, // <decl in class>*
-1, // `}
-1, // `extends
-1, // <decl in class>
-1, // <method decl>
-1, // `public
-1, // `void
853, // `(
-1, // `)
-1, // <stmt>*
209, // <type>
914, // `int
921, // `boolean
-1, // <empty bracket pair>
-1, // `[
-1, // `]
498, // <stmt>
1170, // <assign>
-1, // `;
370, // <local var decl>
678, // `if
467, // <exp>
-1, // `else
210, // `while
799, // `for
-1, // `=
-1, // `++
638, // <exp8>
292, // <exp7>
406, // <exp6>
408, // <exp5>
1266, // <exp4>
-1, // `+
784, // <exp3>
-1, // `*
1036, // <exp2>
39, // <cast exp>
957, // <unary exp>
1117, // <exp1>
953, // `-
1000, // INTLIT
1267, // letter
809, // {"A".."Z" "a" "d" "g" "j".."k" "m".."n" "q".."s" "y".."z"}
809, // "p"
809, // "v"
809, // "c"
809, // "f"
809, // "i"
809, // "l"
809, // "o"
809, // "u"
809, // "x"
809, // "b"
809, // "e"
809, // "h"
809, // "t"
809, // "w"
796, // letter128
269, // {199..218 231..250}
269, // {193..198 225..230}
-1, // digit
923, // {"1".."9"}
1001, // "0"
496, // digit128
679, // {176..185}
-1, // ws
-1, // " "
-1, // {10}
396, // "#"
-1, // "+"
-1, // "*"
956, // "("
-1, // ")"
877, // "{"
-1, // "}"
1303, // "-"
-1, // "="
-1, // "["
-1, // "]"
-1, // ";"
-1, // "@"
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
{ // state 661
2,767, // ws*
MIN_REDUCTION+93, // (default reduction)
  }
,
{ // state 662
23,MIN_REDUCTION+90, // `[
74,40, // ws
75,141, // " "
76,160, // {10}
86,MIN_REDUCTION+90, // "["
MIN_REDUCTION+90, // (default reduction)
  }
,
{ // state 663
74,1019, // ws
75,742, // " "
76,1262, // {10}
MIN_REDUCTION+60, // (default reduction)
  }
,
{ // state 664
0x80000000|1, // match move
0x80000000|67, // no-match move
0x80000000|46, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 665
69,1050, // digit
70,1101, // {"1".."9"}
71,1101, // "0"
72,1290, // digit128
73,1289, // {176..185}
93,186, // $$1
  }
,
{ // state 666
23,MIN_REDUCTION+43, // `[
86,MIN_REDUCTION+43, // "["
MIN_REDUCTION+43, // (default reduction)
  }
,
{ // state 667
58,1145, // "o"
  }
,
{ // state 668
23,MIN_REDUCTION+132, // `[
74,1029, // ws
75,744, // " "
76,100, // {10}
86,MIN_REDUCTION+132, // "["
MIN_REDUCTION+132, // (default reduction)
  }
,
{ // state 669
-1, // $$start
-1, // <start>
-1, // ws*
-1, // <program>
-1, // <class decl>+
-1, // <class decl>
-1, // `class
238, // ID
734, // `{
-1, // <decl in class>*
-1, // `}
-1, // `extends
-1, // <decl in class>
-1, // <method decl>
-1, // `public
-1, // `void
853, // `(
-1, // `)
-1, // <stmt>*
209, // <type>
914, // `int
921, // `boolean
-1, // <empty bracket pair>
-1, // `[
-1, // `]
37, // <stmt>
170, // <assign>
-1, // `;
1062, // <local var decl>
1284, // `if
467, // <exp>
-1, // `else
574, // `while
1249, // `for
-1, // `=
-1, // `++
638, // <exp8>
292, // <exp7>
406, // <exp6>
408, // <exp5>
1266, // <exp4>
-1, // `+
784, // <exp3>
-1, // `*
1036, // <exp2>
39, // <cast exp>
957, // <unary exp>
1117, // <exp1>
953, // `-
1000, // INTLIT
1267, // letter
809, // {"A".."Z" "a" "d" "g" "j".."k" "m".."n" "q".."s" "y".."z"}
809, // "p"
809, // "v"
809, // "c"
809, // "f"
809, // "i"
809, // "l"
809, // "o"
809, // "u"
809, // "x"
809, // "b"
809, // "e"
809, // "h"
809, // "t"
809, // "w"
796, // letter128
269, // {199..218 231..250}
269, // {193..198 225..230}
-1, // digit
923, // {"1".."9"}
1001, // "0"
496, // digit128
679, // {176..185}
-1, // ws
-1, // " "
-1, // {10}
396, // "#"
-1, // "+"
-1, // "*"
956, // "("
-1, // ")"
877, // "{"
-1, // "}"
1303, // "-"
-1, // "="
-1, // "["
-1, // "]"
-1, // ";"
-1, // "@"
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
{ // state 670
2,694, // ws*
23,MIN_REDUCTION+103, // `[
74,1139, // ws
75,128, // " "
76,125, // {10}
86,MIN_REDUCTION+103, // "["
MIN_REDUCTION+103, // (default reduction)
  }
,
{ // state 671
-1, // $$start
-1, // <start>
-1, // ws*
-1, // <program>
-1, // <class decl>+
-1, // <class decl>
-1, // `class
238, // ID
713, // `{
-1, // <decl in class>*
-1, // `}
-1, // `extends
-1, // <decl in class>
-1, // <method decl>
-1, // `public
-1, // `void
853, // `(
-1, // `)
-1, // <stmt>*
209, // <type>
914, // `int
921, // `boolean
-1, // <empty bracket pair>
-1, // `[
-1, // `]
510, // <stmt>
1170, // <assign>
-1, // `;
370, // <local var decl>
678, // `if
467, // <exp>
-1, // `else
210, // `while
799, // `for
-1, // `=
-1, // `++
638, // <exp8>
292, // <exp7>
406, // <exp6>
408, // <exp5>
1266, // <exp4>
-1, // `+
784, // <exp3>
-1, // `*
1036, // <exp2>
39, // <cast exp>
957, // <unary exp>
1117, // <exp1>
953, // `-
1000, // INTLIT
1267, // letter
809, // {"A".."Z" "a" "d" "g" "j".."k" "m".."n" "q".."s" "y".."z"}
809, // "p"
809, // "v"
809, // "c"
809, // "f"
809, // "i"
809, // "l"
809, // "o"
809, // "u"
809, // "x"
809, // "b"
809, // "e"
809, // "h"
809, // "t"
809, // "w"
796, // letter128
269, // {199..218 231..250}
269, // {193..198 225..230}
-1, // digit
923, // {"1".."9"}
1001, // "0"
496, // digit128
679, // {176..185}
-1, // ws
-1, // " "
-1, // {10}
396, // "#"
-1, // "+"
-1, // "*"
956, // "("
-1, // ")"
877, // "{"
-1, // "}"
1303, // "-"
-1, // "="
-1, // "["
-1, // "]"
-1, // ";"
-1, // "@"
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
{ // state 672
2,1315, // ws*
23,MIN_REDUCTION+133, // `[
74,1176, // ws
75,92, // " "
76,103, // {10}
86,MIN_REDUCTION+133, // "["
103,MIN_REDUCTION+133, // $NT
MIN_REDUCTION+133, // (default reduction)
  }
,
{ // state 673
24,1185, // `]
87,213, // "]"
  }
,
{ // state 674
MIN_REDUCTION+106, // (default reduction)
  }
,
{ // state 675
23,MIN_REDUCTION+113, // `[
86,MIN_REDUCTION+113, // "["
103,MIN_REDUCTION+113, // $NT
MIN_REDUCTION+113, // (default reduction)
  }
,
{ // state 676
2,790, // ws*
MIN_REDUCTION+93, // (default reduction)
  }
,
{ // state 677
7,330, // ID
16,892, // `(
45,793, // <cast exp>
47,247, // <exp1>
49,530, // INTLIT
50,929, // letter
51,809, // {"A".."Z" "a" "d" "g" "j".."k" "m".."n" "q".."s" "y".."z"}
52,809, // "p"
53,809, // "v"
54,809, // "c"
55,809, // "f"
56,809, // "i"
57,809, // "l"
58,809, // "o"
59,809, // "u"
60,809, // "x"
61,809, // "b"
62,809, // "e"
63,809, // "h"
64,809, // "t"
65,809, // "w"
66,1058, // letter128
67,820, // {199..218 231..250}
68,820, // {193..198 225..230}
70,381, // {"1".."9"}
71,190, // "0"
72,363, // digit128
73,1219, // {176..185}
80,956, // "("
  }
,
{ // state 678
16,4, // `(
80,617, // "("
  }
,
{ // state 679
0x80000000|752, // match move
0x80000000|527, // no-match move
0x80000000|46, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 680
69,1050, // digit
70,1101, // {"1".."9"}
71,1101, // "0"
72,1300, // digit128
73,1276, // {176..185}
93,256, // $$1
  }
,
{ // state 681
23,MIN_REDUCTION+43, // `[
86,MIN_REDUCTION+43, // "["
MIN_REDUCTION+43, // (default reduction)
  }
,
{ // state 682
23,MIN_REDUCTION+105, // `[
86,MIN_REDUCTION+105, // "["
MIN_REDUCTION+105, // (default reduction)
  }
,
{ // state 683
-1, // $$start
-1, // <start>
-1, // ws*
-1, // <program>
-1, // <class decl>+
-1, // <class decl>
-1, // `class
238, // ID
710, // `{
-1, // <decl in class>*
-1, // `}
-1, // `extends
-1, // <decl in class>
-1, // <method decl>
-1, // `public
-1, // `void
853, // `(
-1, // `)
-1, // <stmt>*
209, // <type>
914, // `int
921, // `boolean
-1, // <empty bracket pair>
-1, // `[
-1, // `]
1196, // <stmt>
950, // <assign>
-1, // `;
402, // <local var decl>
1316, // `if
467, // <exp>
-1, // `else
392, // `while
893, // `for
-1, // `=
-1, // `++
638, // <exp8>
292, // <exp7>
406, // <exp6>
408, // <exp5>
1266, // <exp4>
-1, // `+
784, // <exp3>
-1, // `*
1036, // <exp2>
39, // <cast exp>
957, // <unary exp>
1117, // <exp1>
953, // `-
1000, // INTLIT
1267, // letter
809, // {"A".."Z" "a" "d" "g" "j".."k" "m".."n" "q".."s" "y".."z"}
809, // "p"
809, // "v"
809, // "c"
809, // "f"
809, // "i"
809, // "l"
809, // "o"
809, // "u"
809, // "x"
809, // "b"
809, // "e"
809, // "h"
809, // "t"
809, // "w"
796, // letter128
269, // {199..218 231..250}
269, // {193..198 225..230}
-1, // digit
923, // {"1".."9"}
1001, // "0"
496, // digit128
679, // {176..185}
-1, // ws
-1, // " "
-1, // {10}
396, // "#"
-1, // "+"
-1, // "*"
956, // "("
-1, // ")"
877, // "{"
-1, // "}"
1303, // "-"
-1, // "="
-1, // "["
-1, // "]"
-1, // ";"
-1, // "@"
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
{ // state 684
-1, // $$start
-1, // <start>
-1, // ws*
-1, // <program>
-1, // <class decl>+
-1, // <class decl>
-1, // `class
238, // ID
770, // `{
-1, // <decl in class>*
-1, // `}
-1, // `extends
-1, // <decl in class>
-1, // <method decl>
-1, // `public
-1, // `void
853, // `(
-1, // `)
-1, // <stmt>*
209, // <type>
914, // `int
921, // `boolean
-1, // <empty bracket pair>
-1, // `[
-1, // `]
33, // <stmt>
182, // <assign>
-1, // `;
1031, // <local var decl>
1332, // `if
467, // <exp>
-1, // `else
659, // `while
1229, // `for
-1, // `=
-1, // `++
638, // <exp8>
292, // <exp7>
406, // <exp6>
408, // <exp5>
1266, // <exp4>
-1, // `+
784, // <exp3>
-1, // `*
1036, // <exp2>
39, // <cast exp>
957, // <unary exp>
1117, // <exp1>
953, // `-
1000, // INTLIT
1267, // letter
809, // {"A".."Z" "a" "d" "g" "j".."k" "m".."n" "q".."s" "y".."z"}
809, // "p"
809, // "v"
809, // "c"
809, // "f"
809, // "i"
809, // "l"
809, // "o"
809, // "u"
809, // "x"
809, // "b"
809, // "e"
809, // "h"
809, // "t"
809, // "w"
796, // letter128
269, // {199..218 231..250}
269, // {193..198 225..230}
-1, // digit
923, // {"1".."9"}
1001, // "0"
496, // digit128
679, // {176..185}
-1, // ws
-1, // " "
-1, // {10}
396, // "#"
-1, // "+"
-1, // "*"
956, // "("
-1, // ")"
877, // "{"
-1, // "}"
1303, // "-"
-1, // "="
-1, // "["
-1, // "]"
-1, // ";"
-1, // "@"
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
{ // state 685
51,1066, // {"A".."Z" "a" "d" "g" "j".."k" "m".."n" "q".."s" "y".."z"}
52,1066, // "p"
53,1066, // "v"
54,1066, // "c"
55,1066, // "f"
56,1066, // "i"
57,1066, // "l"
58,1066, // "o"
59,1066, // "u"
60,1066, // "x"
61,1066, // "b"
62,1066, // "e"
63,1066, // "h"
64,1066, // "t"
65,1066, // "w"
68,1235, // {193..198 225..230}
70,1066, // {"1".."9"}
71,1066, // "0"
73,1235, // {176..185}
95,1074, // $$2
100,775, // hexDigit
101,1288, // hexDigit128
  }
,
{ // state 686
MIN_REDUCTION+39, // (default reduction)
  }
,
{ // state 687
23,1068, // `[
86,373, // "["
MIN_REDUCTION+42, // (default reduction)
  }
,
{ // state 688
2,933, // ws*
74,511, // ws
75,93, // " "
76,1172, // {10}
MIN_REDUCTION+93, // (default reduction)
  }
,
{ // state 689
2,391, // ws*
74,776, // ws
75,355, // " "
76,287, // {10}
MIN_REDUCTION+129, // (default reduction)
  }
,
{ // state 690
23,MIN_REDUCTION+130, // `[
74,52, // ws
75,163, // " "
76,24, // {10}
86,MIN_REDUCTION+130, // "["
MIN_REDUCTION+130, // (default reduction)
  }
,
{ // state 691
27,414, // `;
88,227, // ";"
  }
,
{ // state 692
-1, // $$start
-1, // <start>
-1, // ws*
-1, // <program>
-1, // <class decl>+
-1, // <class decl>
-1, // `class
238, // ID
845, // `{
-1, // <decl in class>*
-1, // `}
-1, // `extends
-1, // <decl in class>
-1, // <method decl>
-1, // `public
-1, // `void
853, // `(
-1, // `)
-1, // <stmt>*
209, // <type>
914, // `int
921, // `boolean
-1, // <empty bracket pair>
-1, // `[
-1, // `]
1106, // <stmt>
1178, // <assign>
-1, // `;
529, // <local var decl>
622, // `if
467, // <exp>
-1, // `else
1132, // `while
832, // `for
-1, // `=
-1, // `++
638, // <exp8>
292, // <exp7>
406, // <exp6>
408, // <exp5>
1266, // <exp4>
-1, // `+
784, // <exp3>
-1, // `*
1036, // <exp2>
39, // <cast exp>
957, // <unary exp>
1117, // <exp1>
953, // `-
1000, // INTLIT
1267, // letter
809, // {"A".."Z" "a" "d" "g" "j".."k" "m".."n" "q".."s" "y".."z"}
809, // "p"
809, // "v"
809, // "c"
809, // "f"
809, // "i"
809, // "l"
809, // "o"
809, // "u"
809, // "x"
809, // "b"
809, // "e"
809, // "h"
809, // "t"
809, // "w"
796, // letter128
269, // {199..218 231..250}
269, // {193..198 225..230}
-1, // digit
923, // {"1".."9"}
1001, // "0"
496, // digit128
679, // {176..185}
-1, // ws
-1, // " "
-1, // {10}
396, // "#"
-1, // "+"
-1, // "*"
956, // "("
-1, // ")"
877, // "{"
-1, // "}"
1303, // "-"
-1, // "="
-1, // "["
-1, // "]"
-1, // ";"
-1, // "@"
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
{ // state 693
0x80000000|1, // match move
0x80000000|205, // no-match move
0x80000000|46, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 694
0x80000000|1, // match move
0x80000000|532, // no-match move
0x80000000|46, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 695
2,1168, // ws*
74,779, // ws
75,353, // " "
76,285, // {10}
MIN_REDUCTION+75, // (default reduction)
  }
,
{ // state 696
23,MIN_REDUCTION+109, // `[
86,MIN_REDUCTION+109, // "["
MIN_REDUCTION+109, // (default reduction)
  }
,
{ // state 697
-1, // $$start
-1, // <start>
-1, // ws*
-1, // <program>
-1, // <class decl>+
-1, // <class decl>
-1, // `class
238, // ID
731, // `{
-1, // <decl in class>*
-1, // `}
-1, // `extends
-1, // <decl in class>
-1, // <method decl>
-1, // `public
-1, // `void
853, // `(
-1, // `)
-1, // <stmt>*
209, // <type>
914, // `int
921, // `boolean
-1, // <empty bracket pair>
-1, // `[
-1, // `]
1298, // <stmt>
691, // <assign>
-1, // `;
1107, // <local var decl>
908, // `if
467, // <exp>
-1, // `else
703, // `while
208, // `for
-1, // `=
-1, // `++
638, // <exp8>
292, // <exp7>
406, // <exp6>
408, // <exp5>
1266, // <exp4>
-1, // `+
784, // <exp3>
-1, // `*
1036, // <exp2>
39, // <cast exp>
957, // <unary exp>
1117, // <exp1>
953, // `-
1000, // INTLIT
1267, // letter
809, // {"A".."Z" "a" "d" "g" "j".."k" "m".."n" "q".."s" "y".."z"}
809, // "p"
809, // "v"
809, // "c"
809, // "f"
809, // "i"
809, // "l"
809, // "o"
809, // "u"
809, // "x"
809, // "b"
809, // "e"
809, // "h"
809, // "t"
809, // "w"
796, // letter128
269, // {199..218 231..250}
269, // {193..198 225..230}
-1, // digit
923, // {"1".."9"}
1001, // "0"
496, // digit128
679, // {176..185}
-1, // ws
-1, // " "
-1, // {10}
396, // "#"
-1, // "+"
-1, // "*"
956, // "("
-1, // ")"
877, // "{"
-1, // "}"
1303, // "-"
-1, // "="
-1, // "["
-1, // "]"
-1, // ";"
-1, // "@"
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
{ // state 698
MIN_REDUCTION+50, // (default reduction)
  }
,
{ // state 699
2,1171, // ws*
23,MIN_REDUCTION+91, // `[
74,162, // ws
75,744, // " "
76,100, // {10}
86,MIN_REDUCTION+91, // "["
MIN_REDUCTION+91, // (default reduction)
  }
,
{ // state 700
0x80000000|1240, // match move
0x80000000|1268, // no-match move
0x80000000|1146, // NT-test-match state for `else
  }
,
{ // state 701
MIN_REDUCTION+22, // (default reduction)
  }
,
{ // state 702
MIN_REDUCTION+51, // (default reduction)
  }
,
{ // state 703
16,448, // `(
80,1065, // "("
  }
,
{ // state 704
MIN_REDUCTION+111, // (default reduction)
  }
,
{ // state 705
27,288, // `;
88,1097, // ";"
  }
,
{ // state 706
17,683, // `)
81,585, // ")"
  }
,
{ // state 707
MIN_REDUCTION+127, // (default reduction)
  }
,
{ // state 708
MIN_REDUCTION+127, // (default reduction)
  }
,
{ // state 709
23,MIN_REDUCTION+90, // `[
74,52, // ws
75,163, // " "
76,24, // {10}
86,MIN_REDUCTION+90, // "["
MIN_REDUCTION+90, // (default reduction)
  }
,
{ // state 710
-1, // $$start
-1, // <start>
-1, // ws*
-1, // <program>
-1, // <class decl>+
-1, // <class decl>
-1, // `class
238, // ID
710, // `{
-1, // <decl in class>*
897, // `}
-1, // `extends
-1, // <decl in class>
-1, // <method decl>
-1, // `public
-1, // `void
853, // `(
-1, // `)
168, // <stmt>*
209, // <type>
914, // `int
921, // `boolean
-1, // <empty bracket pair>
-1, // `[
-1, // `]
1295, // <stmt>
950, // <assign>
-1, // `;
402, // <local var decl>
1316, // `if
467, // <exp>
-1, // `else
392, // `while
893, // `for
-1, // `=
-1, // `++
638, // <exp8>
292, // <exp7>
406, // <exp6>
408, // <exp5>
1266, // <exp4>
-1, // `+
784, // <exp3>
-1, // `*
1036, // <exp2>
39, // <cast exp>
957, // <unary exp>
1117, // <exp1>
953, // `-
1000, // INTLIT
1267, // letter
809, // {"A".."Z" "a" "d" "g" "j".."k" "m".."n" "q".."s" "y".."z"}
809, // "p"
809, // "v"
809, // "c"
809, // "f"
809, // "i"
809, // "l"
809, // "o"
809, // "u"
809, // "x"
809, // "b"
809, // "e"
809, // "h"
809, // "t"
809, // "w"
796, // letter128
269, // {199..218 231..250}
269, // {193..198 225..230}
-1, // digit
923, // {"1".."9"}
1001, // "0"
496, // digit128
679, // {176..185}
-1, // ws
-1, // " "
-1, // {10}
396, // "#"
-1, // "+"
-1, // "*"
956, // "("
-1, // ")"
877, // "{"
597, // "}"
1303, // "-"
-1, // "="
-1, // "["
-1, // "]"
-1, // ";"
-1, // "@"
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
{ // state 711
0x80000000|350, // match move
0x80000000|145, // no-match move
0x80000000|46, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 712
0x80000000|1240, // match move
0x80000000|1224, // no-match move
0x80000000|1146, // NT-test-match state for `else
  }
,
{ // state 713
-1, // $$start
-1, // <start>
-1, // ws*
-1, // <program>
-1, // <class decl>+
-1, // <class decl>
-1, // `class
238, // ID
710, // `{
-1, // <decl in class>*
460, // `}
-1, // `extends
-1, // <decl in class>
-1, // <method decl>
-1, // `public
-1, // `void
853, // `(
-1, // `)
19, // <stmt>*
209, // <type>
914, // `int
921, // `boolean
-1, // <empty bracket pair>
-1, // `[
-1, // `]
1295, // <stmt>
950, // <assign>
-1, // `;
402, // <local var decl>
1316, // `if
467, // <exp>
-1, // `else
392, // `while
893, // `for
-1, // `=
-1, // `++
638, // <exp8>
292, // <exp7>
406, // <exp6>
408, // <exp5>
1266, // <exp4>
-1, // `+
784, // <exp3>
-1, // `*
1036, // <exp2>
39, // <cast exp>
957, // <unary exp>
1117, // <exp1>
953, // `-
1000, // INTLIT
1267, // letter
809, // {"A".."Z" "a" "d" "g" "j".."k" "m".."n" "q".."s" "y".."z"}
809, // "p"
809, // "v"
809, // "c"
809, // "f"
809, // "i"
809, // "l"
809, // "o"
809, // "u"
809, // "x"
809, // "b"
809, // "e"
809, // "h"
809, // "t"
809, // "w"
796, // letter128
269, // {199..218 231..250}
269, // {193..198 225..230}
-1, // digit
923, // {"1".."9"}
1001, // "0"
496, // digit128
679, // {176..185}
-1, // ws
-1, // " "
-1, // {10}
396, // "#"
-1, // "+"
-1, // "*"
956, // "("
-1, // ")"
877, // "{"
987, // "}"
1303, // "-"
-1, // "="
-1, // "["
-1, // "]"
-1, // ";"
-1, // "@"
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
{ // state 714
57,1274, // "l"
  }
,
{ // state 715
16,161, // `(
80,695, // "("
  }
,
{ // state 716
MIN_REDUCTION+22, // (default reduction)
  }
,
{ // state 717
2,1155, // ws*
  }
,
{ // state 718
74,1256, // ws
75,970, // " "
76,577, // {10}
MIN_REDUCTION+92, // (default reduction)
  }
,
{ // state 719
2,267, // ws*
74,969, // ws
75,991, // " "
76,332, // {10}
103,MIN_REDUCTION+67, // $NT
  }
,
{ // state 720
74,MIN_REDUCTION+51, // ws
75,MIN_REDUCTION+51, // " "
76,MIN_REDUCTION+51, // {10}
MIN_REDUCTION+51, // (default reduction)
  }
,
{ // state 721
23,MIN_REDUCTION+109, // `[
86,MIN_REDUCTION+109, // "["
MIN_REDUCTION+109, // (default reduction)
  }
,
{ // state 722
MIN_REDUCTION+50, // (default reduction)
  }
,
{ // state 723
58,1136, // "o"
  }
,
{ // state 724
0x80000000|778, // match move
0x80000000|592, // no-match move
0x80000000|46, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 725
17,299, // `)
81,585, // ")"
  }
,
{ // state 726
16,468, // `(
80,1065, // "("
  }
,
{ // state 727
0x80000000|407, // match move
0x80000000|202, // no-match move
0x80000000|1146, // NT-test-match state for `else
  }
,
{ // state 728
0x80000000|552, // match move
0x80000000|573, // no-match move
0x80000000|797, // NT-test-match state for <exp>
  }
,
{ // state 729
23,MIN_REDUCTION+126, // `[
86,MIN_REDUCTION+126, // "["
103,MIN_REDUCTION+126, // $NT
MIN_REDUCTION+126, // (default reduction)
  }
,
{ // state 730
0x80000000|874, // match move
0x80000000|444, // no-match move
0x80000000|1146, // NT-test-match state for `else
  }
,
{ // state 731
-1, // $$start
-1, // <start>
-1, // ws*
-1, // <program>
-1, // <class decl>+
-1, // <class decl>
-1, // `class
238, // ID
710, // `{
-1, // <decl in class>*
197, // `}
-1, // `extends
-1, // <decl in class>
-1, // <method decl>
-1, // `public
-1, // `void
853, // `(
-1, // `)
975, // <stmt>*
209, // <type>
914, // `int
921, // `boolean
-1, // <empty bracket pair>
-1, // `[
-1, // `]
1295, // <stmt>
950, // <assign>
-1, // `;
402, // <local var decl>
1316, // `if
467, // <exp>
-1, // `else
392, // `while
893, // `for
-1, // `=
-1, // `++
638, // <exp8>
292, // <exp7>
406, // <exp6>
408, // <exp5>
1266, // <exp4>
-1, // `+
784, // <exp3>
-1, // `*
1036, // <exp2>
39, // <cast exp>
957, // <unary exp>
1117, // <exp1>
953, // `-
1000, // INTLIT
1267, // letter
809, // {"A".."Z" "a" "d" "g" "j".."k" "m".."n" "q".."s" "y".."z"}
809, // "p"
809, // "v"
809, // "c"
809, // "f"
809, // "i"
809, // "l"
809, // "o"
809, // "u"
809, // "x"
809, // "b"
809, // "e"
809, // "h"
809, // "t"
809, // "w"
796, // letter128
269, // {199..218 231..250}
269, // {193..198 225..230}
-1, // digit
923, // {"1".."9"}
1001, // "0"
496, // digit128
679, // {176..185}
-1, // ws
-1, // " "
-1, // {10}
396, // "#"
-1, // "+"
-1, // "*"
956, // "("
-1, // ")"
877, // "{"
284, // "}"
1303, // "-"
-1, // "="
-1, // "["
-1, // "]"
-1, // ";"
-1, // "@"
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
{ // state 732
103,MIN_REDUCTION+15, // $NT
  }
,
{ // state 733
MIN_REDUCTION+127, // (default reduction)
  }
,
{ // state 734
-1, // $$start
-1, // <start>
-1, // ws*
-1, // <program>
-1, // <class decl>+
-1, // <class decl>
-1, // `class
238, // ID
710, // `{
-1, // <decl in class>*
191, // `}
-1, // `extends
-1, // <decl in class>
-1, // <method decl>
-1, // `public
-1, // `void
853, // `(
-1, // `)
180, // <stmt>*
209, // <type>
914, // `int
921, // `boolean
-1, // <empty bracket pair>
-1, // `[
-1, // `]
1295, // <stmt>
950, // <assign>
-1, // `;
402, // <local var decl>
1316, // `if
467, // <exp>
-1, // `else
392, // `while
893, // `for
-1, // `=
-1, // `++
638, // <exp8>
292, // <exp7>
406, // <exp6>
408, // <exp5>
1266, // <exp4>
-1, // `+
784, // <exp3>
-1, // `*
1036, // <exp2>
39, // <cast exp>
957, // <unary exp>
1117, // <exp1>
953, // `-
1000, // INTLIT
1267, // letter
809, // {"A".."Z" "a" "d" "g" "j".."k" "m".."n" "q".."s" "y".."z"}
809, // "p"
809, // "v"
809, // "c"
809, // "f"
809, // "i"
809, // "l"
809, // "o"
809, // "u"
809, // "x"
809, // "b"
809, // "e"
809, // "h"
809, // "t"
809, // "w"
796, // letter128
269, // {199..218 231..250}
269, // {193..198 225..230}
-1, // digit
923, // {"1".."9"}
1001, // "0"
496, // digit128
679, // {176..185}
-1, // ws
-1, // " "
-1, // {10}
396, // "#"
-1, // "+"
-1, // "*"
956, // "("
-1, // ")"
877, // "{"
1072, // "}"
1303, // "-"
-1, // "="
-1, // "["
-1, // "]"
-1, // ";"
-1, // "@"
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
{ // state 735
0x80000000|350, // match move
0x80000000|1193, // no-match move
0x80000000|46, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 736
MIN_REDUCTION+23, // (default reduction)
  }
,
{ // state 737
2,1315, // ws*
103,MIN_REDUCTION+133, // $NT
  }
,
{ // state 738
51,1066, // {"A".."Z" "a" "d" "g" "j".."k" "m".."n" "q".."s" "y".."z"}
52,1066, // "p"
53,1066, // "v"
54,1066, // "c"
55,1066, // "f"
56,1066, // "i"
57,1066, // "l"
58,1066, // "o"
59,1066, // "u"
60,1066, // "x"
61,1066, // "b"
62,1066, // "e"
63,1066, // "h"
64,1066, // "t"
65,1066, // "w"
68,64, // {193..198 225..230}
70,1066, // {"1".."9"}
71,1066, // "0"
73,64, // {176..185}
95,490, // $$2
100,775, // hexDigit
101,618, // hexDigit128
  }
,
{ // state 739
0x80000000|874, // match move
0x80000000|459, // no-match move
0x80000000|1146, // NT-test-match state for `else
  }
,
{ // state 740
-1, // $$start
-1, // <start>
-1, // ws*
-1, // <program>
-1, // <class decl>+
-1, // <class decl>
-1, // `class
238, // ID
770, // `{
-1, // <decl in class>*
-1, // `}
-1, // `extends
-1, // <decl in class>
-1, // <method decl>
-1, // `public
-1, // `void
853, // `(
-1, // `)
-1, // <stmt>*
209, // <type>
914, // `int
921, // `boolean
-1, // <empty bracket pair>
-1, // `[
-1, // `]
1041, // <stmt>
182, // <assign>
-1, // `;
1031, // <local var decl>
1332, // `if
467, // <exp>
-1, // `else
659, // `while
1229, // `for
-1, // `=
-1, // `++
638, // <exp8>
292, // <exp7>
406, // <exp6>
408, // <exp5>
1266, // <exp4>
-1, // `+
784, // <exp3>
-1, // `*
1036, // <exp2>
39, // <cast exp>
957, // <unary exp>
1117, // <exp1>
953, // `-
1000, // INTLIT
1267, // letter
809, // {"A".."Z" "a" "d" "g" "j".."k" "m".."n" "q".."s" "y".."z"}
809, // "p"
809, // "v"
809, // "c"
809, // "f"
809, // "i"
809, // "l"
809, // "o"
809, // "u"
809, // "x"
809, // "b"
809, // "e"
809, // "h"
809, // "t"
809, // "w"
796, // letter128
269, // {199..218 231..250}
269, // {193..198 225..230}
-1, // digit
923, // {"1".."9"}
1001, // "0"
496, // digit128
679, // {176..185}
-1, // ws
-1, // " "
-1, // {10}
396, // "#"
-1, // "+"
-1, // "*"
956, // "("
-1, // ")"
877, // "{"
-1, // "}"
1303, // "-"
-1, // "="
-1, // "["
-1, // "]"
-1, // ";"
-1, // "@"
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
{ // state 741
17,143, // `)
81,585, // ")"
  }
,
{ // state 742
MIN_REDUCTION+50, // (default reduction)
  }
,
{ // state 743
7,218, // ID
16,519, // `(
30,1115, // <exp>
36,1158, // <exp8>
37,323, // <exp7>
38,22, // <exp6>
39,21, // <exp5>
40,139, // <exp4>
42,480, // <exp3>
44,83, // <exp2>
45,262, // <cast exp>
46,488, // <unary exp>
47,111, // <exp1>
48,842, // `-
49,463, // INTLIT
50,968, // letter
51,809, // {"A".."Z" "a" "d" "g" "j".."k" "m".."n" "q".."s" "y".."z"}
52,809, // "p"
53,809, // "v"
54,809, // "c"
55,809, // "f"
56,809, // "i"
57,809, // "l"
58,809, // "o"
59,809, // "u"
60,809, // "x"
61,809, // "b"
62,809, // "e"
63,809, // "h"
64,809, // "t"
65,809, // "w"
66,1233, // letter128
67,735, // {199..218 231..250}
68,735, // {193..198 225..230}
70,274, // {"1".."9"}
71,1079, // "0"
72,590, // digit128
73,1289, // {176..185}
80,956, // "("
84,1303, // "-"
  }
,
{ // state 744
0x80000000|1, // match move
0x80000000|156, // no-match move
0x80000000|46, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 745
23,MIN_REDUCTION+109, // `[
86,MIN_REDUCTION+109, // "["
MIN_REDUCTION+109, // (default reduction)
  }
,
{ // state 746
MIN_REDUCTION+15, // (default reduction)
  }
,
{ // state 747
0x80000000|540, // match move
0x80000000|1089, // no-match move
0x80000000|46, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 748
0x80000000|874, // match move
0x80000000|352, // no-match move
0x80000000|1146, // NT-test-match state for `else
  }
,
{ // state 749
0x80000000|350, // match move
0x80000000|1203, // no-match move
0x80000000|46, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 750
2,281, // ws*
  }
,
{ // state 751
MIN_REDUCTION+23, // (default reduction)
  }
,
{ // state 752
MIN_REDUCTION+49, // (default reduction)
  }
,
{ // state 753
74,MIN_REDUCTION+126, // ws
75,MIN_REDUCTION+126, // " "
76,MIN_REDUCTION+126, // {10}
MIN_REDUCTION+126, // (default reduction)
  }
,
{ // state 754
0x80000000|1286, // match move
0x80000000|688, // no-match move
0x80000000|1146, // NT-test-match state for `else
  }
,
{ // state 755
27,385, // `;
88,178, // ";"
  }
,
{ // state 756
17,1329, // `)
81,585, // ")"
  }
,
{ // state 757
-1, // $$start
-1, // <start>
-1, // ws*
-1, // <program>
-1, // <class decl>+
-1, // <class decl>
-1, // `class
238, // ID
710, // `{
-1, // <decl in class>*
191, // `}
-1, // `extends
-1, // <decl in class>
-1, // <method decl>
-1, // `public
-1, // `void
853, // `(
-1, // `)
994, // <stmt>*
209, // <type>
914, // `int
921, // `boolean
-1, // <empty bracket pair>
-1, // `[
-1, // `]
1295, // <stmt>
950, // <assign>
-1, // `;
402, // <local var decl>
1316, // `if
467, // <exp>
-1, // `else
392, // `while
893, // `for
-1, // `=
-1, // `++
638, // <exp8>
292, // <exp7>
406, // <exp6>
408, // <exp5>
1266, // <exp4>
-1, // `+
784, // <exp3>
-1, // `*
1036, // <exp2>
39, // <cast exp>
957, // <unary exp>
1117, // <exp1>
953, // `-
1000, // INTLIT
1267, // letter
809, // {"A".."Z" "a" "d" "g" "j".."k" "m".."n" "q".."s" "y".."z"}
809, // "p"
809, // "v"
809, // "c"
809, // "f"
809, // "i"
809, // "l"
809, // "o"
809, // "u"
809, // "x"
809, // "b"
809, // "e"
809, // "h"
809, // "t"
809, // "w"
796, // letter128
269, // {199..218 231..250}
269, // {193..198 225..230}
-1, // digit
923, // {"1".."9"}
1001, // "0"
496, // digit128
679, // {176..185}
-1, // ws
-1, // " "
-1, // {10}
396, // "#"
-1, // "+"
-1, // "*"
956, // "("
-1, // ")"
877, // "{"
344, // "}"
1303, // "-"
-1, // "="
-1, // "["
-1, // "]"
-1, // ";"
-1, // "@"
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
{ // state 758
-1, // $$start
-1, // <start>
-1, // ws*
-1, // <program>
-1, // <class decl>+
-1, // <class decl>
-1, // `class
238, // ID
734, // `{
-1, // <decl in class>*
-1, // `}
-1, // `extends
-1, // <decl in class>
-1, // <method decl>
-1, // `public
-1, // `void
853, // `(
-1, // `)
-1, // <stmt>*
209, // <type>
914, // `int
921, // `boolean
-1, // <empty bracket pair>
-1, // `[
-1, // `]
1096, // <stmt>
170, // <assign>
-1, // `;
1062, // <local var decl>
1284, // `if
467, // <exp>
-1, // `else
574, // `while
1249, // `for
-1, // `=
-1, // `++
638, // <exp8>
292, // <exp7>
406, // <exp6>
408, // <exp5>
1266, // <exp4>
-1, // `+
784, // <exp3>
-1, // `*
1036, // <exp2>
39, // <cast exp>
957, // <unary exp>
1117, // <exp1>
953, // `-
1000, // INTLIT
1267, // letter
809, // {"A".."Z" "a" "d" "g" "j".."k" "m".."n" "q".."s" "y".."z"}
809, // "p"
809, // "v"
809, // "c"
809, // "f"
809, // "i"
809, // "l"
809, // "o"
809, // "u"
809, // "x"
809, // "b"
809, // "e"
809, // "h"
809, // "t"
809, // "w"
796, // letter128
269, // {199..218 231..250}
269, // {193..198 225..230}
-1, // digit
923, // {"1".."9"}
1001, // "0"
496, // digit128
679, // {176..185}
-1, // ws
-1, // " "
-1, // {10}
396, // "#"
-1, // "+"
-1, // "*"
956, // "("
-1, // ")"
877, // "{"
-1, // "}"
1303, // "-"
-1, // "="
-1, // "["
-1, // "]"
-1, // ";"
-1, // "@"
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
{ // state 759
0x80000000|761, // match move
0x80000000|557, // no-match move
0x80000000|46, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 760
2,349, // ws*
74,733, // ws
75,379, // " "
76,228, // {10}
MIN_REDUCTION+129, // (default reduction)
  }
,
{ // state 761
2,1119, // ws*
  }
,
{ // state 762
MIN_REDUCTION+127, // (default reduction)
  }
,
{ // state 763
2,767, // ws*
74,417, // ws
75,970, // " "
76,577, // {10}
MIN_REDUCTION+93, // (default reduction)
  }
,
{ // state 764
7,218, // ID
16,519, // `(
30,1181, // <exp>
36,1158, // <exp8>
37,323, // <exp7>
38,22, // <exp6>
39,21, // <exp5>
40,139, // <exp4>
42,480, // <exp3>
44,83, // <exp2>
45,262, // <cast exp>
46,488, // <unary exp>
47,111, // <exp1>
48,842, // `-
49,463, // INTLIT
50,968, // letter
51,809, // {"A".."Z" "a" "d" "g" "j".."k" "m".."n" "q".."s" "y".."z"}
52,809, // "p"
53,809, // "v"
54,809, // "c"
55,809, // "f"
56,809, // "i"
57,809, // "l"
58,809, // "o"
59,809, // "u"
60,809, // "x"
61,809, // "b"
62,809, // "e"
63,809, // "h"
64,809, // "t"
65,809, // "w"
66,1233, // letter128
67,735, // {199..218 231..250}
68,735, // {193..198 225..230}
70,274, // {"1".."9"}
71,1079, // "0"
72,590, // digit128
73,1289, // {176..185}
80,956, // "("
84,1303, // "-"
  }
,
{ // state 765
23,1083, // `[
86,373, // "["
MIN_REDUCTION+42, // (default reduction)
  }
,
{ // state 766
MIN_REDUCTION+39, // (default reduction)
  }
,
{ // state 767
0x80000000|874, // match move
0x80000000|718, // no-match move
0x80000000|1146, // NT-test-match state for `else
  }
,
{ // state 768
MIN_REDUCTION+7, // (default reduction)
  }
,
{ // state 769
7,218, // ID
16,519, // `(
30,481, // <exp>
36,1158, // <exp8>
37,323, // <exp7>
38,22, // <exp6>
39,21, // <exp5>
40,139, // <exp4>
42,480, // <exp3>
44,83, // <exp2>
45,262, // <cast exp>
46,488, // <unary exp>
47,111, // <exp1>
48,842, // `-
49,463, // INTLIT
50,968, // letter
51,809, // {"A".."Z" "a" "d" "g" "j".."k" "m".."n" "q".."s" "y".."z"}
52,809, // "p"
53,809, // "v"
54,809, // "c"
55,809, // "f"
56,809, // "i"
57,809, // "l"
58,809, // "o"
59,809, // "u"
60,809, // "x"
61,809, // "b"
62,809, // "e"
63,809, // "h"
64,809, // "t"
65,809, // "w"
66,1233, // letter128
67,735, // {199..218 231..250}
68,735, // {193..198 225..230}
70,274, // {"1".."9"}
71,1079, // "0"
72,590, // digit128
73,1289, // {176..185}
80,956, // "("
84,1303, // "-"
  }
,
{ // state 770
-1, // $$start
-1, // <start>
-1, // ws*
-1, // <program>
-1, // <class decl>+
-1, // <class decl>
-1, // `class
238, // ID
710, // `{
-1, // <decl in class>*
197, // `}
-1, // `extends
-1, // <decl in class>
-1, // <method decl>
-1, // `public
-1, // `void
853, // `(
-1, // `)
242, // <stmt>*
209, // <type>
914, // `int
921, // `boolean
-1, // <empty bracket pair>
-1, // `[
-1, // `]
1295, // <stmt>
950, // <assign>
-1, // `;
402, // <local var decl>
1316, // `if
467, // <exp>
-1, // `else
392, // `while
893, // `for
-1, // `=
-1, // `++
638, // <exp8>
292, // <exp7>
406, // <exp6>
408, // <exp5>
1266, // <exp4>
-1, // `+
784, // <exp3>
-1, // `*
1036, // <exp2>
39, // <cast exp>
957, // <unary exp>
1117, // <exp1>
953, // `-
1000, // INTLIT
1267, // letter
809, // {"A".."Z" "a" "d" "g" "j".."k" "m".."n" "q".."s" "y".."z"}
809, // "p"
809, // "v"
809, // "c"
809, // "f"
809, // "i"
809, // "l"
809, // "o"
809, // "u"
809, // "x"
809, // "b"
809, // "e"
809, // "h"
809, // "t"
809, // "w"
796, // letter128
269, // {199..218 231..250}
269, // {193..198 225..230}
-1, // digit
923, // {"1".."9"}
1001, // "0"
496, // digit128
679, // {176..185}
-1, // ws
-1, // " "
-1, // {10}
396, // "#"
-1, // "+"
-1, // "*"
956, // "("
-1, // ")"
877, // "{"
982, // "}"
1303, // "-"
-1, // "="
-1, // "["
-1, // "]"
-1, // ";"
-1, // "@"
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
{ // state 771
0x80000000|1, // match move
0x80000000|461, // no-match move
0x80000000|46, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 772
2,1163, // ws*
23,MIN_REDUCTION+97, // `[
74,1176, // ws
75,92, // " "
76,103, // {10}
86,MIN_REDUCTION+97, // "["
103,MIN_REDUCTION+97, // $NT
MIN_REDUCTION+97, // (default reduction)
  }
,
{ // state 773
50,674, // letter
51,66, // {"A".."Z" "a" "d" "g" "j".."k" "m".."n" "q".."s" "y".."z"}
52,66, // "p"
53,66, // "v"
54,66, // "c"
55,66, // "f"
56,66, // "i"
57,66, // "l"
58,66, // "o"
59,66, // "u"
60,66, // "x"
61,66, // "b"
62,66, // "e"
63,66, // "h"
64,66, // "t"
65,66, // "w"
66,1188, // letter128
67,711, // {199..218 231..250}
68,711, // {193..198 225..230}
69,293, // digit
70,259, // {"1".."9"}
71,259, // "0"
72,786, // digit128
73,1305, // {176..185}
90,117, // idChar*
91,324, // $$0
96,528, // idChar
97,1232, // "_"
98,138, // idChar128
99,939, // {223}
  }
,
{ // state 774
-1, // $$start
-1, // <start>
-1, // ws*
-1, // <program>
-1, // <class decl>+
-1, // <class decl>
-1, // `class
238, // ID
757, // `{
-1, // <decl in class>*
-1, // `}
-1, // `extends
-1, // <decl in class>
-1, // <method decl>
-1, // `public
-1, // `void
853, // `(
-1, // `)
-1, // <stmt>*
209, // <type>
914, // `int
921, // `boolean
-1, // <empty bracket pair>
-1, // `[
-1, // `]
1314, // <stmt>
783, // <assign>
-1, // `;
1093, // <local var decl>
980, // `if
467, // <exp>
-1, // `else
726, // `while
177, // `for
-1, // `=
-1, // `++
638, // <exp8>
292, // <exp7>
406, // <exp6>
408, // <exp5>
1266, // <exp4>
-1, // `+
784, // <exp3>
-1, // `*
1036, // <exp2>
39, // <cast exp>
957, // <unary exp>
1117, // <exp1>
953, // `-
1000, // INTLIT
1267, // letter
809, // {"A".."Z" "a" "d" "g" "j".."k" "m".."n" "q".."s" "y".."z"}
809, // "p"
809, // "v"
809, // "c"
809, // "f"
809, // "i"
809, // "l"
809, // "o"
809, // "u"
809, // "x"
809, // "b"
809, // "e"
809, // "h"
809, // "t"
809, // "w"
796, // letter128
269, // {199..218 231..250}
269, // {193..198 225..230}
-1, // digit
923, // {"1".."9"}
1001, // "0"
496, // digit128
679, // {176..185}
-1, // ws
-1, // " "
-1, // {10}
396, // "#"
-1, // "+"
-1, // "*"
956, // "("
-1, // ")"
877, // "{"
-1, // "}"
1303, // "-"
-1, // "="
-1, // "["
-1, // "]"
-1, // ";"
-1, // "@"
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
{ // state 775
MIN_REDUCTION+118, // (default reduction)
  }
,
{ // state 776
MIN_REDUCTION+127, // (default reduction)
  }
,
{ // state 777
7,239, // ID
16,482, // `(
30,172, // <exp>
36,1049, // <exp8>
37,315, // <exp7>
38,35, // <exp6>
39,32, // <exp5>
40,165, // <exp4>
42,413, // <exp3>
44,11, // <exp2>
45,339, // <cast exp>
46,504, // <unary exp>
47,231, // <exp1>
48,849, // `-
49,478, // INTLIT
50,1027, // letter
51,809, // {"A".."Z" "a" "d" "g" "j".."k" "m".."n" "q".."s" "y".."z"}
52,809, // "p"
53,809, // "v"
54,809, // "c"
55,809, // "f"
56,809, // "i"
57,809, // "l"
58,809, // "o"
59,809, // "u"
60,809, // "x"
61,809, // "b"
62,809, // "e"
63,809, // "h"
64,809, // "t"
65,809, // "w"
66,1296, // letter128
67,749, // {199..218 231..250}
68,749, // {193..198 225..230}
70,300, // {"1".."9"}
71,1120, // "0"
72,594, // digit128
73,1276, // {176..185}
80,956, // "("
84,1303, // "-"
  }
,
{ // state 778
2,1078, // ws*
  }
,
{ // state 779
MIN_REDUCTION+127, // (default reduction)
  }
,
{ // state 780
103,MIN_REDUCTION+109, // $NT
MIN_REDUCTION+109, // (default reduction)
  }
,
{ // state 781
74,1112, // ws
75,116, // " "
76,441, // {10}
MIN_REDUCTION+74, // (default reduction)
  }
,
{ // state 782
MIN_REDUCTION+22, // (default reduction)
  }
,
{ // state 783
27,403, // `;
88,179, // ";"
  }
,
{ // state 784
43,206, // `*
79,1151, // "*"
MIN_REDUCTION+34, // (default reduction)
  }
,
{ // state 785
2,790, // ws*
74,399, // ws
75,990, // " "
76,566, // {10}
MIN_REDUCTION+93, // (default reduction)
  }
,
{ // state 786
0x80000000|493, // match move
0x80000000|1299, // no-match move
0x80000000|46, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 787
17,157, // `)
81,585, // ")"
  }
,
{ // state 788
MIN_REDUCTION+39, // (default reduction)
  }
,
{ // state 789
7,218, // ID
16,519, // `(
45,766, // <cast exp>
47,1051, // <exp1>
49,463, // INTLIT
50,968, // letter
51,809, // {"A".."Z" "a" "d" "g" "j".."k" "m".."n" "q".."s" "y".."z"}
52,809, // "p"
53,809, // "v"
54,809, // "c"
55,809, // "f"
56,809, // "i"
57,809, // "l"
58,809, // "o"
59,809, // "u"
60,809, // "x"
61,809, // "b"
62,809, // "e"
63,809, // "h"
64,809, // "t"
65,809, // "w"
66,1233, // letter128
67,735, // {199..218 231..250}
68,735, // {193..198 225..230}
70,274, // {"1".."9"}
71,1079, // "0"
72,590, // digit128
73,1289, // {176..185}
80,956, // "("
  }
,
{ // state 790
0x80000000|874, // match move
0x80000000|1007, // no-match move
0x80000000|1146, // NT-test-match state for `else
  }
,
{ // state 791
-1, // $$start
-1, // <start>
-1, // ws*
-1, // <program>
-1, // <class decl>+
-1, // <class decl>
-1, // `class
238, // ID
845, // `{
-1, // <decl in class>*
-1, // `}
-1, // `extends
-1, // <decl in class>
-1, // <method decl>
-1, // `public
-1, // `void
853, // `(
-1, // `)
-1, // <stmt>*
209, // <type>
914, // `int
921, // `boolean
-1, // <empty bracket pair>
-1, // `[
-1, // `]
422, // <stmt>
1178, // <assign>
-1, // `;
529, // <local var decl>
622, // `if
467, // <exp>
-1, // `else
1132, // `while
832, // `for
-1, // `=
-1, // `++
638, // <exp8>
292, // <exp7>
406, // <exp6>
408, // <exp5>
1266, // <exp4>
-1, // `+
784, // <exp3>
-1, // `*
1036, // <exp2>
39, // <cast exp>
957, // <unary exp>
1117, // <exp1>
953, // `-
1000, // INTLIT
1267, // letter
809, // {"A".."Z" "a" "d" "g" "j".."k" "m".."n" "q".."s" "y".."z"}
809, // "p"
809, // "v"
809, // "c"
809, // "f"
809, // "i"
809, // "l"
809, // "o"
809, // "u"
809, // "x"
809, // "b"
809, // "e"
809, // "h"
809, // "t"
809, // "w"
796, // letter128
269, // {199..218 231..250}
269, // {193..198 225..230}
-1, // digit
923, // {"1".."9"}
1001, // "0"
496, // digit128
679, // {176..185}
-1, // ws
-1, // " "
-1, // {10}
396, // "#"
-1, // "+"
-1, // "*"
956, // "("
-1, // ")"
877, // "{"
-1, // "}"
1303, // "-"
-1, // "="
-1, // "["
-1, // "]"
-1, // ";"
-1, // "@"
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
{ // state 792
MIN_REDUCTION+17, // (default reduction)
  }
,
{ // state 793
103,MIN_REDUCTION+39, // $NT
MIN_REDUCTION+39, // (default reduction)
  }
,
{ // state 794
MIN_REDUCTION+50, // (default reduction)
  }
,
{ // state 795
0x80000000|493, // match move
0x80000000|1251, // no-match move
0x80000000|46, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 796
0x80000000|84, // match move
0x80000000|251, // no-match move
0x80000000|46, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 797
7,330, // ID
16,892, // `(
36,1098, // <exp8>
37,270, // <exp7>
38,75, // <exp6>
39,72, // <exp5>
40,1246, // <exp4>
42,647, // <exp3>
44,132, // <exp2>
45,393, // <cast exp>
46,436, // <unary exp>
47,306, // <exp1>
48,916, // `-
49,530, // INTLIT
50,929, // letter
51,809, // {"A".."Z" "a" "d" "g" "j".."k" "m".."n" "q".."s" "y".."z"}
52,809, // "p"
53,809, // "v"
54,809, // "c"
55,809, // "f"
56,809, // "i"
57,809, // "l"
58,809, // "o"
59,809, // "u"
60,809, // "x"
61,809, // "b"
62,809, // "e"
63,809, // "h"
64,809, // "t"
65,809, // "w"
66,1058, // letter128
67,820, // {199..218 231..250}
68,820, // {193..198 225..230}
70,381, // {"1".."9"}
71,190, // "0"
72,363, // digit128
73,1219, // {176..185}
80,956, // "("
84,1303, // "-"
  }
,
{ // state 798
2,101, // ws*
103,MIN_REDUCTION+91, // $NT
  }
,
{ // state 799
16,660, // `(
80,16, // "("
  }
,
{ // state 800
-1, // $$start
-1, // <start>
-1, // ws*
-1, // <program>
-1, // <class decl>+
-1, // <class decl>
-1, // `class
238, // ID
734, // `{
-1, // <decl in class>*
-1, // `}
-1, // `extends
-1, // <decl in class>
-1, // <method decl>
-1, // `public
-1, // `void
853, // `(
-1, // `)
-1, // <stmt>*
209, // <type>
914, // `int
921, // `boolean
-1, // <empty bracket pair>
-1, // `[
-1, // `]
607, // <stmt>
170, // <assign>
-1, // `;
1062, // <local var decl>
1284, // `if
467, // <exp>
-1, // `else
574, // `while
1249, // `for
-1, // `=
-1, // `++
638, // <exp8>
292, // <exp7>
406, // <exp6>
408, // <exp5>
1266, // <exp4>
-1, // `+
784, // <exp3>
-1, // `*
1036, // <exp2>
39, // <cast exp>
957, // <unary exp>
1117, // <exp1>
953, // `-
1000, // INTLIT
1267, // letter
809, // {"A".."Z" "a" "d" "g" "j".."k" "m".."n" "q".."s" "y".."z"}
809, // "p"
809, // "v"
809, // "c"
809, // "f"
809, // "i"
809, // "l"
809, // "o"
809, // "u"
809, // "x"
809, // "b"
809, // "e"
809, // "h"
809, // "t"
809, // "w"
796, // letter128
269, // {199..218 231..250}
269, // {193..198 225..230}
-1, // digit
923, // {"1".."9"}
1001, // "0"
496, // digit128
679, // {176..185}
-1, // ws
-1, // " "
-1, // {10}
396, // "#"
-1, // "+"
-1, // "*"
956, // "("
-1, // ")"
877, // "{"
-1, // "}"
1303, // "-"
-1, // "="
-1, // "["
-1, // "]"
-1, // ";"
-1, // "@"
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
{ // state 801
MIN_REDUCTION+126, // (default reduction)
  }
,
{ // state 802
103,MIN_REDUCTION+43, // $NT
  }
,
{ // state 803
MIN_REDUCTION+51, // (default reduction)
  }
,
{ // state 804
2,1092, // ws*
23,MIN_REDUCTION+97, // `[
74,1139, // ws
75,128, // " "
76,125, // {10}
86,MIN_REDUCTION+97, // "["
MIN_REDUCTION+97, // (default reduction)
  }
,
{ // state 805
17,1084, // `)
81,585, // ")"
  }
,
{ // state 806
0x80000000|1023, // match move
0x80000000|275, // no-match move
0x80000000|46, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 807
0x80000000|493, // match move
0x80000000|1222, // no-match move
0x80000000|46, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 808
23,MIN_REDUCTION+99, // `[
86,MIN_REDUCTION+99, // "["
MIN_REDUCTION+99, // (default reduction)
  }
,
{ // state 809
MIN_REDUCTION+46, // (default reduction)
  }
,
{ // state 810
MIN_REDUCTION+99, // (default reduction)
  }
,
{ // state 811
0x80000000|1, // match move
0x80000000|397, // no-match move
0x80000000|46, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 812
MIN_REDUCTION+16, // (default reduction)
  }
,
{ // state 813
2,1013, // ws*
MIN_REDUCTION+81, // (default reduction)
  }
,
{ // state 814
74,314, // ws
75,1254, // " "
76,803, // {10}
MIN_REDUCTION+80, // (default reduction)
  }
,
{ // state 815
MIN_REDUCTION+9, // (default reduction)
  }
,
{ // state 816
51,1066, // {"A".."Z" "a" "d" "g" "j".."k" "m".."n" "q".."s" "y".."z"}
52,1066, // "p"
53,1066, // "v"
54,1066, // "c"
55,1066, // "f"
56,1066, // "i"
57,1066, // "l"
58,1066, // "o"
59,1066, // "u"
60,1066, // "x"
61,1066, // "b"
62,1066, // "e"
63,1066, // "h"
64,1066, // "t"
65,1066, // "w"
68,264, // {193..198 225..230}
70,1066, // {"1".."9"}
71,1066, // "0"
73,264, // {176..185}
95,518, // $$2
100,775, // hexDigit
101,759, // hexDigit128
  }
,
{ // state 817
0x80000000|737, // match move
0x80000000|672, // no-match move
0x80000000|46, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 818
0x80000000|1023, // match move
0x80000000|326, // no-match move
0x80000000|46, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 819
MIN_REDUCTION+51, // (default reduction)
  }
,
{ // state 820
0x80000000|582, // match move
0x80000000|1239, // no-match move
0x80000000|46, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 821
74,164, // ws
75,995, // " "
76,1025, // {10}
MIN_REDUCTION+88, // (default reduction)
  }
,
{ // state 822
2,837, // ws*
74,378, // ws
75,1166, // " "
76,452, // {10}
MIN_REDUCTION+129, // (default reduction)
  }
,
{ // state 823
2,1171, // ws*
  }
,
{ // state 824
2,962, // ws*
23,MIN_REDUCTION+97, // `[
74,1147, // ws
75,141, // " "
76,160, // {10}
86,MIN_REDUCTION+97, // "["
MIN_REDUCTION+97, // (default reduction)
  }
,
{ // state 825
54,425, // "c"
  }
,
{ // state 826
MIN_REDUCTION+16, // (default reduction)
  }
,
{ // state 827
51,1066, // {"A".."Z" "a" "d" "g" "j".."k" "m".."n" "q".."s" "y".."z"}
52,1066, // "p"
53,1066, // "v"
54,1066, // "c"
55,1066, // "f"
56,1066, // "i"
57,1066, // "l"
58,1066, // "o"
59,1066, // "u"
60,1066, // "x"
61,1066, // "b"
62,1066, // "e"
63,1066, // "h"
64,1066, // "t"
65,1066, // "w"
68,272, // {193..198 225..230}
70,1066, // {"1".."9"}
71,1066, // "0"
73,272, // {176..185}
95,455, // $$2
100,775, // hexDigit
101,724, // hexDigit128
  }
,
{ // state 828
0x80000000|1257, // match move
0x80000000|1135, // no-match move
0x80000000|797, // NT-test-match state for <exp>
  }
,
{ // state 829
7,239, // ID
16,482, // `(
30,706, // <exp>
36,1049, // <exp8>
37,315, // <exp7>
38,35, // <exp6>
39,32, // <exp5>
40,165, // <exp4>
42,413, // <exp3>
44,11, // <exp2>
45,339, // <cast exp>
46,504, // <unary exp>
47,231, // <exp1>
48,849, // `-
49,478, // INTLIT
50,1027, // letter
51,809, // {"A".."Z" "a" "d" "g" "j".."k" "m".."n" "q".."s" "y".."z"}
52,809, // "p"
53,809, // "v"
54,809, // "c"
55,809, // "f"
56,809, // "i"
57,809, // "l"
58,809, // "o"
59,809, // "u"
60,809, // "x"
61,809, // "b"
62,809, // "e"
63,809, // "h"
64,809, // "t"
65,809, // "w"
66,1296, // letter128
67,749, // {199..218 231..250}
68,749, // {193..198 225..230}
70,300, // {"1".."9"}
71,1120, // "0"
72,594, // digit128
73,1276, // {176..185}
80,956, // "("
84,1303, // "-"
  }
,
{ // state 830
23,MIN_REDUCTION+128, // `[
74,52, // ws
75,163, // " "
76,24, // {10}
86,MIN_REDUCTION+128, // "["
MIN_REDUCTION+128, // (default reduction)
  }
,
{ // state 831
23,MIN_REDUCTION+99, // `[
86,MIN_REDUCTION+99, // "["
MIN_REDUCTION+99, // (default reduction)
  }
,
{ // state 832
16,671, // `(
80,16, // "("
  }
,
{ // state 833
23,1054, // `[
86,373, // "["
MIN_REDUCTION+42, // (default reduction)
  }
,
{ // state 834
MIN_REDUCTION+50, // (default reduction)
  }
,
{ // state 835
0x80000000|1223, // match move
0x80000000|1216, // no-match move
0x80000000|46, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 836
10,1124, // `}
12,365, // <decl in class>
13,212, // <method decl>
14,313, // `public
77,1258, // "#"
83,20, // "}"
  }
,
{ // state 837
74,898, // ws
75,1166, // " "
76,452, // {10}
MIN_REDUCTION+128, // (default reduction)
  }
,
{ // state 838
MIN_REDUCTION+120, // (default reduction)
  }
,
{ // state 839
MIN_REDUCTION+127, // (default reduction)
  }
,
{ // state 840
-1, // $$start
-1, // <start>
-1, // ws*
-1, // <program>
-1, // <class decl>+
-1, // <class decl>
-1, // `class
238, // ID
710, // `{
-1, // <decl in class>*
539, // `}
-1, // `extends
-1, // <decl in class>
-1, // <method decl>
-1, // `public
-1, // `void
853, // `(
-1, // `)
-1, // <stmt>*
209, // <type>
914, // `int
921, // `boolean
-1, // <empty bracket pair>
-1, // `[
-1, // `]
838, // <stmt>
950, // <assign>
-1, // `;
402, // <local var decl>
1316, // `if
467, // <exp>
-1, // `else
392, // `while
893, // `for
-1, // `=
-1, // `++
638, // <exp8>
292, // <exp7>
406, // <exp6>
408, // <exp5>
1266, // <exp4>
-1, // `+
784, // <exp3>
-1, // `*
1036, // <exp2>
39, // <cast exp>
957, // <unary exp>
1117, // <exp1>
953, // `-
1000, // INTLIT
1267, // letter
809, // {"A".."Z" "a" "d" "g" "j".."k" "m".."n" "q".."s" "y".."z"}
809, // "p"
809, // "v"
809, // "c"
809, // "f"
809, // "i"
809, // "l"
809, // "o"
809, // "u"
809, // "x"
809, // "b"
809, // "e"
809, // "h"
809, // "t"
809, // "w"
796, // letter128
269, // {199..218 231..250}
269, // {193..198 225..230}
-1, // digit
923, // {"1".."9"}
1001, // "0"
496, // digit128
679, // {176..185}
-1, // ws
-1, // " "
-1, // {10}
396, // "#"
-1, // "+"
-1, // "*"
956, // "("
-1, // ")"
877, // "{"
507, // "}"
1303, // "-"
-1, // "="
-1, // "["
-1, // "]"
-1, // ";"
-1, // "@"
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
{ // state 841
-1, // $$start
-1, // <start>
-1, // ws*
-1, // <program>
-1, // <class decl>+
-1, // <class decl>
-1, // `class
238, // ID
710, // `{
-1, // <decl in class>*
648, // `}
-1, // `extends
-1, // <decl in class>
-1, // <method decl>
-1, // `public
-1, // `void
853, // `(
-1, // `)
565, // <stmt>*
209, // <type>
914, // `int
921, // `boolean
-1, // <empty bracket pair>
-1, // `[
-1, // `]
1295, // <stmt>
950, // <assign>
-1, // `;
402, // <local var decl>
1316, // `if
467, // <exp>
-1, // `else
392, // `while
893, // `for
-1, // `=
-1, // `++
638, // <exp8>
292, // <exp7>
406, // <exp6>
408, // <exp5>
1266, // <exp4>
-1, // `+
784, // <exp3>
-1, // `*
1036, // <exp2>
39, // <cast exp>
957, // <unary exp>
1117, // <exp1>
953, // `-
1000, // INTLIT
1267, // letter
809, // {"A".."Z" "a" "d" "g" "j".."k" "m".."n" "q".."s" "y".."z"}
809, // "p"
809, // "v"
809, // "c"
809, // "f"
809, // "i"
809, // "l"
809, // "o"
809, // "u"
809, // "x"
809, // "b"
809, // "e"
809, // "h"
809, // "t"
809, // "w"
796, // letter128
269, // {199..218 231..250}
269, // {193..198 225..230}
-1, // digit
923, // {"1".."9"}
1001, // "0"
496, // digit128
679, // {176..185}
-1, // ws
-1, // " "
-1, // {10}
396, // "#"
-1, // "+"
-1, // "*"
956, // "("
-1, // ")"
877, // "{"
875, // "}"
1303, // "-"
-1, // "="
-1, // "["
-1, // "]"
-1, // ";"
-1, // "@"
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
{ // state 842
7,218, // ID
46,1326, // <unary exp>
47,111, // <exp1>
48,842, // `-
49,463, // INTLIT
50,968, // letter
51,809, // {"A".."Z" "a" "d" "g" "j".."k" "m".."n" "q".."s" "y".."z"}
52,809, // "p"
53,809, // "v"
54,809, // "c"
55,809, // "f"
56,809, // "i"
57,809, // "l"
58,809, // "o"
59,809, // "u"
60,809, // "x"
61,809, // "b"
62,809, // "e"
63,809, // "h"
64,809, // "t"
65,809, // "w"
66,1233, // letter128
67,735, // {199..218 231..250}
68,735, // {193..198 225..230}
70,274, // {"1".."9"}
71,1079, // "0"
72,590, // digit128
73,1289, // {176..185}
84,1303, // "-"
  }
,
{ // state 843
2,336, // ws*
74,839, // ws
75,742, // " "
76,1262, // {10}
MIN_REDUCTION+91, // (default reduction)
  }
,
{ // state 844
51,1066, // {"A".."Z" "a" "d" "g" "j".."k" "m".."n" "q".."s" "y".."z"}
52,1066, // "p"
53,1066, // "v"
54,1066, // "c"
55,1066, // "f"
56,1066, // "i"
57,1066, // "l"
58,1066, // "o"
59,1066, // "u"
60,1066, // "x"
61,1066, // "b"
62,1066, // "e"
63,1066, // "h"
64,1066, // "t"
65,1066, // "w"
68,316, // {193..198 225..230}
70,1066, // {"1".."9"}
71,1066, // "0"
73,316, // {176..185}
95,234, // $$2
100,775, // hexDigit
101,817, // hexDigit128
  }
,
{ // state 845
-1, // $$start
-1, // <start>
-1, // ws*
-1, // <program>
-1, // <class decl>+
-1, // <class decl>
-1, // `class
238, // ID
710, // `{
-1, // <decl in class>*
477, // `}
-1, // `extends
-1, // <decl in class>
-1, // <method decl>
-1, // `public
-1, // `void
853, // `(
-1, // `)
69, // <stmt>*
209, // <type>
914, // `int
921, // `boolean
-1, // <empty bracket pair>
-1, // `[
-1, // `]
1295, // <stmt>
950, // <assign>
-1, // `;
402, // <local var decl>
1316, // `if
467, // <exp>
-1, // `else
392, // `while
893, // `for
-1, // `=
-1, // `++
638, // <exp8>
292, // <exp7>
406, // <exp6>
408, // <exp5>
1266, // <exp4>
-1, // `+
784, // <exp3>
-1, // `*
1036, // <exp2>
39, // <cast exp>
957, // <unary exp>
1117, // <exp1>
953, // `-
1000, // INTLIT
1267, // letter
809, // {"A".."Z" "a" "d" "g" "j".."k" "m".."n" "q".."s" "y".."z"}
809, // "p"
809, // "v"
809, // "c"
809, // "f"
809, // "i"
809, // "l"
809, // "o"
809, // "u"
809, // "x"
809, // "b"
809, // "e"
809, // "h"
809, // "t"
809, // "w"
796, // letter128
269, // {199..218 231..250}
269, // {193..198 225..230}
-1, // digit
923, // {"1".."9"}
1001, // "0"
496, // digit128
679, // {176..185}
-1, // ws
-1, // " "
-1, // {10}
396, // "#"
-1, // "+"
-1, // "*"
956, // "("
-1, // ")"
877, // "{"
1005, // "}"
1303, // "-"
-1, // "="
-1, // "["
-1, // "]"
-1, // ";"
-1, // "@"
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
{ // state 846
MIN_REDUCTION+19, // (default reduction)
  }
,
{ // state 847
2,871, // ws*
74,1077, // ws
75,698, // " "
76,971, // {10}
MIN_REDUCTION+93, // (default reduction)
  }
,
{ // state 848
0x80000000|569, // match move
0x80000000|560, // no-match move
0x80000000|797, // NT-test-match state for <exp>
  }
,
{ // state 849
7,239, // ID
46,1061, // <unary exp>
47,231, // <exp1>
48,849, // `-
49,478, // INTLIT
50,1027, // letter
51,809, // {"A".."Z" "a" "d" "g" "j".."k" "m".."n" "q".."s" "y".."z"}
52,809, // "p"
53,809, // "v"
54,809, // "c"
55,809, // "f"
56,809, // "i"
57,809, // "l"
58,809, // "o"
59,809, // "u"
60,809, // "x"
61,809, // "b"
62,809, // "e"
63,809, // "h"
64,809, // "t"
65,809, // "w"
66,1296, // letter128
67,749, // {199..218 231..250}
68,749, // {193..198 225..230}
70,300, // {"1".."9"}
71,1120, // "0"
72,594, // digit128
73,1276, // {176..185}
84,1303, // "-"
  }
,
{ // state 850
2,453, // ws*
74,707, // ws
75,443, // " "
76,181, // {10}
MIN_REDUCTION+129, // (default reduction)
  }
,
{ // state 851
23,MIN_REDUCTION+127, // `[
86,MIN_REDUCTION+127, // "["
MIN_REDUCTION+127, // (default reduction)
  }
,
{ // state 852
0x80000000|1014, // match move
0x80000000|187, // no-match move
0x80000000|46, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 853
7,449, // ID
19,1053, // <type>
20,1059, // `int
21,124, // `boolean
50,195, // letter
51,809, // {"A".."Z" "a" "d" "g" "j".."k" "m".."n" "q".."s" "y".."z"}
52,809, // "p"
53,809, // "v"
54,809, // "c"
55,809, // "f"
56,809, // "i"
57,809, // "l"
58,809, // "o"
59,809, // "u"
60,809, // "x"
61,809, // "b"
62,809, // "e"
63,809, // "h"
64,809, // "t"
65,809, // "w"
66,135, // letter128
67,1022, // {199..218 231..250}
68,1022, // {193..198 225..230}
77,308, // "#"
  }
,
{ // state 854
-1, // $$start
-1, // <start>
-1, // ws*
-1, // <program>
-1, // <class decl>+
-1, // <class decl>
-1, // `class
238, // ID
770, // `{
-1, // <decl in class>*
-1, // `}
-1, // `extends
-1, // <decl in class>
-1, // <method decl>
-1, // `public
-1, // `void
853, // `(
-1, // `)
-1, // <stmt>*
209, // <type>
914, // `int
921, // `boolean
-1, // <empty bracket pair>
-1, // `[
-1, // `]
543, // <stmt>
182, // <assign>
-1, // `;
1031, // <local var decl>
1332, // `if
467, // <exp>
-1, // `else
659, // `while
1229, // `for
-1, // `=
-1, // `++
638, // <exp8>
292, // <exp7>
406, // <exp6>
408, // <exp5>
1266, // <exp4>
-1, // `+
784, // <exp3>
-1, // `*
1036, // <exp2>
39, // <cast exp>
957, // <unary exp>
1117, // <exp1>
953, // `-
1000, // INTLIT
1267, // letter
809, // {"A".."Z" "a" "d" "g" "j".."k" "m".."n" "q".."s" "y".."z"}
809, // "p"
809, // "v"
809, // "c"
809, // "f"
809, // "i"
809, // "l"
809, // "o"
809, // "u"
809, // "x"
809, // "b"
809, // "e"
809, // "h"
809, // "t"
809, // "w"
796, // letter128
269, // {199..218 231..250}
269, // {193..198 225..230}
-1, // digit
923, // {"1".."9"}
1001, // "0"
496, // digit128
679, // {176..185}
-1, // ws
-1, // " "
-1, // {10}
396, // "#"
-1, // "+"
-1, // "*"
956, // "("
-1, // ")"
877, // "{"
-1, // "}"
1303, // "-"
-1, // "="
-1, // "["
-1, // "]"
-1, // ";"
-1, // "@"
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
{ // state 855
MIN_REDUCTION+19, // (default reduction)
  }
,
{ // state 856
MIN_REDUCTION+21, // (default reduction)
  }
,
{ // state 857
0x80000000|1333, // match move
0x80000000|846, // no-match move
0x80000000|1146, // NT-test-match state for `else
  }
,
{ // state 858
17,MIN_REDUCTION+51, // `)
81,MIN_REDUCTION+51, // ")"
MIN_REDUCTION+51, // (default reduction)
  }
,
{ // state 859
MIN_REDUCTION+113, // (default reduction)
  }
,
{ // state 860
23,MIN_REDUCTION+127, // `[
86,MIN_REDUCTION+127, // "["
MIN_REDUCTION+127, // (default reduction)
  }
,
{ // state 861
-1, // $$start
-1, // <start>
-1, // ws*
-1, // <program>
-1, // <class decl>+
-1, // <class decl>
-1, // `class
238, // ID
713, // `{
-1, // <decl in class>*
-1, // `}
-1, // `extends
-1, // <decl in class>
-1, // <method decl>
-1, // `public
-1, // `void
853, // `(
-1, // `)
-1, // <stmt>*
209, // <type>
914, // `int
921, // `boolean
-1, // <empty bracket pair>
-1, // `[
-1, // `]
384, // <stmt>
1170, // <assign>
-1, // `;
370, // <local var decl>
678, // `if
467, // <exp>
-1, // `else
210, // `while
799, // `for
-1, // `=
-1, // `++
638, // <exp8>
292, // <exp7>
406, // <exp6>
408, // <exp5>
1266, // <exp4>
-1, // `+
784, // <exp3>
-1, // `*
1036, // <exp2>
39, // <cast exp>
957, // <unary exp>
1117, // <exp1>
953, // `-
1000, // INTLIT
1267, // letter
809, // {"A".."Z" "a" "d" "g" "j".."k" "m".."n" "q".."s" "y".."z"}
809, // "p"
809, // "v"
809, // "c"
809, // "f"
809, // "i"
809, // "l"
809, // "o"
809, // "u"
809, // "x"
809, // "b"
809, // "e"
809, // "h"
809, // "t"
809, // "w"
796, // letter128
269, // {199..218 231..250}
269, // {193..198 225..230}
-1, // digit
923, // {"1".."9"}
1001, // "0"
496, // digit128
679, // {176..185}
-1, // ws
-1, // " "
-1, // {10}
396, // "#"
-1, // "+"
-1, // "*"
956, // "("
-1, // ")"
877, // "{"
-1, // "}"
1303, // "-"
-1, // "="
-1, // "["
-1, // "]"
-1, // ";"
-1, // "@"
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
{ // state 862
7,249, // ID
46,1338, // <unary exp>
47,131, // <exp1>
48,862, // `-
49,445, // INTLIT
50,773, // letter
51,809, // {"A".."Z" "a" "d" "g" "j".."k" "m".."n" "q".."s" "y".."z"}
52,809, // "p"
53,809, // "v"
54,809, // "c"
55,809, // "f"
56,809, // "i"
57,809, // "l"
58,809, // "o"
59,809, // "u"
60,809, // "x"
61,809, // "b"
62,809, // "e"
63,809, // "h"
64,809, // "t"
65,809, // "w"
66,1199, // letter128
67,711, // {199..218 231..250}
68,711, // {193..198 225..230}
70,224, // {"1".."9"}
71,1037, // "0"
72,549, // digit128
73,1305, // {176..185}
84,1303, // "-"
  }
,
{ // state 863
MIN_REDUCTION+51, // (default reduction)
  }
,
{ // state 864
0x80000000|907, // match move
0x80000000|36, // no-match move
0x80000000|46, // NT-test-match state for <empty bracket pair>
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
238, // ID
713, // `{
-1, // <decl in class>*
-1, // `}
-1, // `extends
-1, // <decl in class>
-1, // <method decl>
-1, // `public
-1, // `void
853, // `(
-1, // `)
-1, // <stmt>*
209, // <type>
914, // `int
921, // `boolean
-1, // <empty bracket pair>
-1, // `[
-1, // `]
82, // <stmt>
1170, // <assign>
-1, // `;
370, // <local var decl>
678, // `if
467, // <exp>
-1, // `else
210, // `while
799, // `for
-1, // `=
-1, // `++
638, // <exp8>
292, // <exp7>
406, // <exp6>
408, // <exp5>
1266, // <exp4>
-1, // `+
784, // <exp3>
-1, // `*
1036, // <exp2>
39, // <cast exp>
957, // <unary exp>
1117, // <exp1>
953, // `-
1000, // INTLIT
1267, // letter
809, // {"A".."Z" "a" "d" "g" "j".."k" "m".."n" "q".."s" "y".."z"}
809, // "p"
809, // "v"
809, // "c"
809, // "f"
809, // "i"
809, // "l"
809, // "o"
809, // "u"
809, // "x"
809, // "b"
809, // "e"
809, // "h"
809, // "t"
809, // "w"
796, // letter128
269, // {199..218 231..250}
269, // {193..198 225..230}
-1, // digit
923, // {"1".."9"}
1001, // "0"
496, // digit128
679, // {176..185}
-1, // ws
-1, // " "
-1, // {10}
396, // "#"
-1, // "+"
-1, // "*"
956, // "("
-1, // ")"
877, // "{"
-1, // "}"
1303, // "-"
-1, // "="
-1, // "["
-1, // "]"
-1, // ";"
-1, // "@"
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
MIN_REDUCTION+126, // (default reduction)
  }
,
{ // state 867
23,MIN_REDUCTION+127, // `[
86,MIN_REDUCTION+127, // "["
MIN_REDUCTION+127, // (default reduction)
  }
,
{ // state 868
MIN_REDUCTION+111, // (default reduction)
  }
,
{ // state 869
0x80000000|1333, // match move
0x80000000|855, // no-match move
0x80000000|1146, // NT-test-match state for `else
  }
,
{ // state 870
74,544, // ws
75,355, // " "
76,287, // {10}
MIN_REDUCTION+68, // (default reduction)
  }
,
{ // state 871
74,547, // ws
75,698, // " "
76,971, // {10}
MIN_REDUCTION+92, // (default reduction)
  }
,
{ // state 872
7,249, // ID
16,374, // `(
45,686, // <cast exp>
47,1095, // <exp1>
49,445, // INTLIT
50,773, // letter
51,809, // {"A".."Z" "a" "d" "g" "j".."k" "m".."n" "q".."s" "y".."z"}
52,809, // "p"
53,809, // "v"
54,809, // "c"
55,809, // "f"
56,809, // "i"
57,809, // "l"
58,809, // "o"
59,809, // "u"
60,809, // "x"
61,809, // "b"
62,809, // "e"
63,809, // "h"
64,809, // "t"
65,809, // "w"
66,1199, // letter128
67,711, // {199..218 231..250}
68,711, // {193..198 225..230}
70,224, // {"1".."9"}
71,1037, // "0"
72,549, // digit128
73,1305, // {176..185}
80,956, // "("
  }
,
{ // state 873
103,MIN_REDUCTION+101, // $NT
  }
,
{ // state 874
MIN_REDUCTION+92, // (default reduction)
  }
,
{ // state 875
2,814, // ws*
74,151, // ws
75,1254, // " "
76,803, // {10}
MIN_REDUCTION+81, // (default reduction)
  }
,
{ // state 876
MIN_REDUCTION+2, // (default reduction)
  }
,
{ // state 877
2,1208, // ws*
74,973, // ws
75,722, // " "
76,1330, // {10}
MIN_REDUCTION+79, // (default reduction)
  }
,
{ // state 878
MIN_REDUCTION+50, // (default reduction)
  }
,
{ // state 879
23,MIN_REDUCTION+51, // `[
86,MIN_REDUCTION+51, // "["
MIN_REDUCTION+51, // (default reduction)
  }
,
{ // state 880
MIN_REDUCTION+51, // (default reduction)
  }
,
{ // state 881
23,MIN_REDUCTION+128, // `[
74,8, // ws
75,128, // " "
76,125, // {10}
86,MIN_REDUCTION+128, // "["
MIN_REDUCTION+128, // (default reduction)
  }
,
{ // state 882
17,1018, // `)
81,585, // ")"
  }
,
{ // state 883
2,978, // ws*
74,708, // ws
75,404, // " "
76,255, // {10}
MIN_REDUCTION+89, // (default reduction)
  }
,
{ // state 884
23,MIN_REDUCTION+51, // `[
86,MIN_REDUCTION+51, // "["
MIN_REDUCTION+51, // (default reduction)
  }
,
{ // state 885
62,601, // "e"
  }
,
{ // state 886
0x80000000|1, // match move
0x80000000|1340, // no-match move
0x80000000|46, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 887
17,1252, // `)
81,585, // ")"
  }
,
{ // state 888
-1, // $$start
-1, // <start>
-1, // ws*
-1, // <program>
-1, // <class decl>+
-1, // <class decl>
-1, // `class
238, // ID
713, // `{
-1, // <decl in class>*
-1, // `}
-1, // `extends
-1, // <decl in class>
-1, // <method decl>
-1, // `public
-1, // `void
853, // `(
-1, // `)
-1, // <stmt>*
209, // <type>
914, // `int
921, // `boolean
-1, // <empty bracket pair>
-1, // `[
-1, // `]
1260, // <stmt>
1170, // <assign>
-1, // `;
370, // <local var decl>
678, // `if
467, // <exp>
-1, // `else
210, // `while
799, // `for
-1, // `=
-1, // `++
638, // <exp8>
292, // <exp7>
406, // <exp6>
408, // <exp5>
1266, // <exp4>
-1, // `+
784, // <exp3>
-1, // `*
1036, // <exp2>
39, // <cast exp>
957, // <unary exp>
1117, // <exp1>
953, // `-
1000, // INTLIT
1267, // letter
809, // {"A".."Z" "a" "d" "g" "j".."k" "m".."n" "q".."s" "y".."z"}
809, // "p"
809, // "v"
809, // "c"
809, // "f"
809, // "i"
809, // "l"
809, // "o"
809, // "u"
809, // "x"
809, // "b"
809, // "e"
809, // "h"
809, // "t"
809, // "w"
796, // letter128
269, // {199..218 231..250}
269, // {193..198 225..230}
-1, // digit
923, // {"1".."9"}
1001, // "0"
496, // digit128
679, // {176..185}
-1, // ws
-1, // " "
-1, // {10}
396, // "#"
-1, // "+"
-1, // "*"
956, // "("
-1, // ")"
877, // "{"
-1, // "}"
1303, // "-"
-1, // "="
-1, // "["
-1, // "]"
-1, // ";"
-1, // "@"
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
{ // state 889
0x80000000|578, // match move
0x80000000|805, // no-match move
0x80000000|797, // NT-test-match state for <exp>
  }
,
{ // state 890
23,MIN_REDUCTION+99, // `[
86,MIN_REDUCTION+99, // "["
103,MIN_REDUCTION+99, // $NT
MIN_REDUCTION+99, // (default reduction)
  }
,
{ // state 891
3,1323, // <program>
4,959, // <class decl>+
5,1091, // <class decl>
6,623, // `class
74,291, // ws
75,834, // " "
76,880, // {10}
77,825, // "#"
  }
,
{ // state 892
7,449, // ID
19,624, // <type>
20,1059, // `int
21,124, // `boolean
50,195, // letter
51,809, // {"A".."Z" "a" "d" "g" "j".."k" "m".."n" "q".."s" "y".."z"}
52,809, // "p"
53,809, // "v"
54,809, // "c"
55,809, // "f"
56,809, // "i"
57,809, // "l"
58,809, // "o"
59,809, // "u"
60,809, // "x"
61,809, // "b"
62,809, // "e"
63,809, // "h"
64,809, // "t"
65,809, // "w"
66,135, // letter128
67,1022, // {199..218 231..250}
68,1022, // {193..198 225..230}
77,308, // "#"
  }
,
{ // state 893
16,1283, // `(
80,16, // "("
  }
,
{ // state 894
23,MIN_REDUCTION+90, // `[
74,1029, // ws
75,744, // " "
76,100, // {10}
86,MIN_REDUCTION+90, // "["
MIN_REDUCTION+90, // (default reduction)
  }
,
{ // state 895
0x80000000|1, // match move
0x80000000|1279, // no-match move
0x80000000|46, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 896
-1, // $$start
-1, // <start>
-1, // ws*
-1, // <program>
-1, // <class decl>+
-1, // <class decl>
-1, // `class
238, // ID
845, // `{
-1, // <decl in class>*
-1, // `}
-1, // `extends
-1, // <decl in class>
-1, // <method decl>
-1, // `public
-1, // `void
853, // `(
-1, // `)
-1, // <stmt>*
209, // <type>
914, // `int
921, // `boolean
-1, // <empty bracket pair>
-1, // `[
-1, // `]
1247, // <stmt>
1178, // <assign>
-1, // `;
529, // <local var decl>
622, // `if
467, // <exp>
-1, // `else
1132, // `while
832, // `for
-1, // `=
-1, // `++
638, // <exp8>
292, // <exp7>
406, // <exp6>
408, // <exp5>
1266, // <exp4>
-1, // `+
784, // <exp3>
-1, // `*
1036, // <exp2>
39, // <cast exp>
957, // <unary exp>
1117, // <exp1>
953, // `-
1000, // INTLIT
1267, // letter
809, // {"A".."Z" "a" "d" "g" "j".."k" "m".."n" "q".."s" "y".."z"}
809, // "p"
809, // "v"
809, // "c"
809, // "f"
809, // "i"
809, // "l"
809, // "o"
809, // "u"
809, // "x"
809, // "b"
809, // "e"
809, // "h"
809, // "t"
809, // "w"
796, // letter128
269, // {199..218 231..250}
269, // {193..198 225..230}
-1, // digit
923, // {"1".."9"}
1001, // "0"
496, // digit128
679, // {176..185}
-1, // ws
-1, // " "
-1, // {10}
396, // "#"
-1, // "+"
-1, // "*"
956, // "("
-1, // ")"
877, // "{"
-1, // "}"
1303, // "-"
-1, // "="
-1, // "["
-1, // "]"
-1, // ";"
-1, // "@"
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
{ // state 897
MIN_REDUCTION+18, // (default reduction)
  }
,
{ // state 898
MIN_REDUCTION+126, // (default reduction)
  }
,
{ // state 899
74,591, // ws
75,443, // " "
76,181, // {10}
MIN_REDUCTION+76, // (default reduction)
  }
,
{ // state 900
MIN_REDUCTION+99, // (default reduction)
  }
,
{ // state 901
17,669, // `)
81,585, // ")"
  }
,
{ // state 902
2,60, // ws*
74,1100, // ws
75,1012, // " "
76,993, // {10}
MIN_REDUCTION+93, // (default reduction)
  }
,
{ // state 903
23,MIN_REDUCTION+130, // `[
74,321, // ws
75,92, // " "
76,103, // {10}
86,MIN_REDUCTION+130, // "["
103,MIN_REDUCTION+130, // $NT
MIN_REDUCTION+130, // (default reduction)
  }
,
{ // state 904
-1, // $$start
-1, // <start>
-1, // ws*
-1, // <program>
-1, // <class decl>+
-1, // <class decl>
-1, // `class
238, // ID
51, // `{
-1, // <decl in class>*
-1, // `}
-1, // `extends
-1, // <decl in class>
-1, // <method decl>
-1, // `public
-1, // `void
853, // `(
-1, // `)
-1, // <stmt>*
209, // <type>
914, // `int
921, // `boolean
-1, // <empty bracket pair>
-1, // `[
-1, // `]
727, // <stmt>
915, // <assign>
-1, // `;
755, // <local var decl>
1342, // `if
467, // <exp>
-1, // `else
470, // `while
653, // `for
-1, // `=
-1, // `++
638, // <exp8>
292, // <exp7>
406, // <exp6>
408, // <exp5>
1266, // <exp4>
-1, // `+
784, // <exp3>
-1, // `*
1036, // <exp2>
39, // <cast exp>
957, // <unary exp>
1117, // <exp1>
953, // `-
1000, // INTLIT
1267, // letter
809, // {"A".."Z" "a" "d" "g" "j".."k" "m".."n" "q".."s" "y".."z"}
809, // "p"
809, // "v"
809, // "c"
809, // "f"
809, // "i"
809, // "l"
809, // "o"
809, // "u"
809, // "x"
809, // "b"
809, // "e"
809, // "h"
809, // "t"
809, // "w"
796, // letter128
269, // {199..218 231..250}
269, // {193..198 225..230}
-1, // digit
923, // {"1".."9"}
1001, // "0"
496, // digit128
679, // {176..185}
-1, // ws
-1, // " "
-1, // {10}
396, // "#"
-1, // "+"
-1, // "*"
956, // "("
-1, // ")"
877, // "{"
-1, // "}"
1303, // "-"
-1, // "="
-1, // "["
-1, // "]"
-1, // ";"
-1, // "@"
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
{ // state 905
23,MIN_REDUCTION+127, // `[
86,MIN_REDUCTION+127, // "["
MIN_REDUCTION+127, // (default reduction)
  }
,
{ // state 906
MIN_REDUCTION+23, // (default reduction)
  }
,
{ // state 907
103,MIN_REDUCTION+111, // $NT
MIN_REDUCTION+111, // (default reduction)
  }
,
{ // state 908
16,81, // `(
80,617, // "("
  }
,
{ // state 909
0x80000000|1023, // match move
0x80000000|925, // no-match move
0x80000000|46, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 910
17,235, // `)
81,585, // ")"
  }
,
{ // state 911
23,MIN_REDUCTION+51, // `[
86,MIN_REDUCTION+51, // "["
MIN_REDUCTION+51, // (default reduction)
  }
,
{ // state 912
17,684, // `)
81,585, // ")"
  }
,
{ // state 913
74,340, // ws
75,1156, // " "
76,863, // {10}
MIN_REDUCTION+74, // (default reduction)
  }
,
{ // state 914
MIN_REDUCTION+11, // (default reduction)
  }
,
{ // state 915
27,1248, // `;
88,178, // ";"
  }
,
{ // state 916
7,330, // ID
46,1102, // <unary exp>
47,306, // <exp1>
48,916, // `-
49,530, // INTLIT
50,929, // letter
51,809, // {"A".."Z" "a" "d" "g" "j".."k" "m".."n" "q".."s" "y".."z"}
52,809, // "p"
53,809, // "v"
54,809, // "c"
55,809, // "f"
56,809, // "i"
57,809, // "l"
58,809, // "o"
59,809, // "u"
60,809, // "x"
61,809, // "b"
62,809, // "e"
63,809, // "h"
64,809, // "t"
65,809, // "w"
66,1058, // letter128
67,820, // {199..218 231..250}
68,820, // {193..198 225..230}
70,381, // {"1".."9"}
71,190, // "0"
72,363, // digit128
73,1219, // {176..185}
84,1303, // "-"
  }
,
{ // state 917
103,MIN_REDUCTION+104, // $NT
  }
,
{ // state 918
103,MIN_REDUCTION+128, // $NT
  }
,
{ // state 919
24,1141, // `]
87,570, // "]"
  }
,
{ // state 920
27,MIN_REDUCTION+126, // `;
88,MIN_REDUCTION+126, // ";"
MIN_REDUCTION+126, // (default reduction)
  }
,
{ // state 921
MIN_REDUCTION+12, // (default reduction)
  }
,
{ // state 922
MIN_REDUCTION+17, // (default reduction)
  }
,
{ // state 923
69,1280, // digit
70,1101, // {"1".."9"}
71,1101, // "0"
72,586, // digit128
73,679, // {176..185}
92,148, // digit*
93,1064, // $$1
  }
,
{ // state 924
MIN_REDUCTION+127, // (default reduction)
  }
,
{ // state 925
23,MIN_REDUCTION+111, // `[
86,MIN_REDUCTION+111, // "["
MIN_REDUCTION+111, // (default reduction)
  }
,
{ // state 926
2,1008, // ws*
23,MIN_REDUCTION+97, // `[
74,1129, // ws
75,163, // " "
76,24, // {10}
86,MIN_REDUCTION+97, // "["
MIN_REDUCTION+97, // (default reduction)
  }
,
{ // state 927
MIN_REDUCTION+51, // (default reduction)
  }
,
{ // state 928
23,MIN_REDUCTION+99, // `[
86,MIN_REDUCTION+99, // "["
MIN_REDUCTION+99, // (default reduction)
  }
,
{ // state 929
50,674, // letter
51,66, // {"A".."Z" "a" "d" "g" "j".."k" "m".."n" "q".."s" "y".."z"}
52,66, // "p"
53,66, // "v"
54,66, // "c"
55,66, // "f"
56,66, // "i"
57,66, // "l"
58,66, // "o"
59,66, // "u"
60,66, // "x"
61,66, // "b"
62,66, // "e"
63,66, // "h"
64,66, // "t"
65,66, // "w"
66,1108, // letter128
67,820, // {199..218 231..250}
68,820, // {193..198 225..230}
69,293, // digit
70,259, // {"1".."9"}
71,259, // "0"
72,835, // digit128
73,1219, // {176..185}
90,7, // idChar*
91,88, // $$0
96,528, // idChar
97,1232, // "_"
98,338, // idChar128
99,864, // {223}
  }
,
{ // state 930
74,1039, // ws
75,1182, // " "
76,819, // {10}
MIN_REDUCTION+128, // (default reduction)
  }
,
{ // state 931
0x80000000|1143, // match move
0x80000000|114, // no-match move
0x80000000|797, // NT-test-match state for <exp>
  }
,
{ // state 932
0x80000000|946, // match move
0x80000000|1080, // no-match move
0x80000000|46, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 933
0x80000000|874, // match move
0x80000000|989, // no-match move
0x80000000|1146, // NT-test-match state for `else
  }
,
{ // state 934
23,MIN_REDUCTION+128, // `[
74,40, // ws
75,141, // " "
76,160, // {10}
86,MIN_REDUCTION+128, // "["
MIN_REDUCTION+128, // (default reduction)
  }
,
{ // state 935
23,MIN_REDUCTION+51, // `[
86,MIN_REDUCTION+51, // "["
MIN_REDUCTION+51, // (default reduction)
  }
,
{ // state 936
MIN_REDUCTION+109, // (default reduction)
  }
,
{ // state 937
MIN_REDUCTION+17, // (default reduction)
  }
,
{ // state 938
17,265, // `)
81,585, // ")"
  }
,
{ // state 939
0x80000000|1023, // match move
0x80000000|298, // no-match move
0x80000000|46, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 940
74,595, // ws
75,379, // " "
76,228, // {10}
MIN_REDUCTION+96, // (default reduction)
  }
,
{ // state 941
MIN_REDUCTION+27, // (default reduction)
  }
,
{ // state 942
23,MIN_REDUCTION+128, // `[
74,321, // ws
75,92, // " "
76,103, // {10}
86,MIN_REDUCTION+128, // "["
103,MIN_REDUCTION+128, // $NT
MIN_REDUCTION+128, // (default reduction)
  }
,
{ // state 943
0x80000000|91, // match move
0x80000000|629, // no-match move
0x80000000|46, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 944
17,588, // `)
81,585, // ")"
  }
,
{ // state 945
0x80000000|217, // match move
0x80000000|106, // no-match move
0x80000000|797, // NT-test-match state for <exp>
  }
,
{ // state 946
103,MIN_REDUCTION+44, // $NT
  }
,
{ // state 947
MIN_REDUCTION+21, // (default reduction)
  }
,
{ // state 948
74,544, // ws
75,355, // " "
76,287, // {10}
MIN_REDUCTION+96, // (default reduction)
  }
,
{ // state 949
MIN_REDUCTION+49, // (default reduction)
  }
,
{ // state 950
27,245, // `;
88,902, // ";"
  }
,
{ // state 951
2,281, // ws*
23,MIN_REDUCTION+133, // `[
74,162, // ws
75,744, // " "
76,100, // {10}
86,MIN_REDUCTION+133, // "["
MIN_REDUCTION+133, // (default reduction)
  }
,
{ // state 952
0x80000000|1240, // match move
0x80000000|634, // no-match move
0x80000000|1146, // NT-test-match state for `else
  }
,
{ // state 953
7,1030, // ID
46,587, // <unary exp>
47,1117, // <exp1>
48,953, // `-
49,1000, // INTLIT
50,175, // letter
51,809, // {"A".."Z" "a" "d" "g" "j".."k" "m".."n" "q".."s" "y".."z"}
52,809, // "p"
53,809, // "v"
54,809, // "c"
55,809, // "f"
56,809, // "i"
57,809, // "l"
58,809, // "o"
59,809, // "u"
60,809, // "x"
61,809, // "b"
62,809, // "e"
63,809, // "h"
64,809, // "t"
65,809, // "w"
66,31, // letter128
67,992, // {199..218 231..250}
68,992, // {193..198 225..230}
70,923, // {"1".."9"}
71,1001, // "0"
72,496, // digit128
73,679, // {176..185}
84,1303, // "-"
  }
,
{ // state 954
23,MIN_REDUCTION+109, // `[
86,MIN_REDUCTION+109, // "["
MIN_REDUCTION+109, // (default reduction)
  }
,
{ // state 955
31,888, // `else
77,475, // "#"
  }
,
{ // state 956
2,913, // ws*
74,110, // ws
75,1156, // " "
76,863, // {10}
MIN_REDUCTION+75, // (default reduction)
  }
,
{ // state 957
MIN_REDUCTION+38, // (default reduction)
  }
,
{ // state 958
MIN_REDUCTION+50, // (default reduction)
  }
,
{ // state 959
5,222, // <class decl>
6,623, // `class
77,825, // "#"
MIN_REDUCTION+3, // (default reduction)
  }
,
{ // state 960
64,1162, // "t"
  }
,
{ // state 961
MIN_REDUCTION+126, // (default reduction)
  }
,
{ // state 962
0x80000000|1, // match move
0x80000000|304, // no-match move
0x80000000|46, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 963
17,MIN_REDUCTION+126, // `)
81,MIN_REDUCTION+126, // ")"
MIN_REDUCTION+126, // (default reduction)
  }
,
{ // state 964
-1, // $$start
-1, // <start>
-1, // ws*
-1, // <program>
-1, // <class decl>+
-1, // <class decl>
-1, // `class
238, // ID
51, // `{
-1, // <decl in class>*
-1, // `}
-1, // `extends
-1, // <decl in class>
-1, // <method decl>
-1, // `public
-1, // `void
853, // `(
-1, // `)
-1, // <stmt>*
209, // <type>
914, // `int
921, // `boolean
-1, // <empty bracket pair>
-1, // `[
-1, // `]
1242, // <stmt>
915, // <assign>
-1, // `;
755, // <local var decl>
1342, // `if
467, // <exp>
-1, // `else
470, // `while
653, // `for
-1, // `=
-1, // `++
638, // <exp8>
292, // <exp7>
406, // <exp6>
408, // <exp5>
1266, // <exp4>
-1, // `+
784, // <exp3>
-1, // `*
1036, // <exp2>
39, // <cast exp>
957, // <unary exp>
1117, // <exp1>
953, // `-
1000, // INTLIT
1267, // letter
809, // {"A".."Z" "a" "d" "g" "j".."k" "m".."n" "q".."s" "y".."z"}
809, // "p"
809, // "v"
809, // "c"
809, // "f"
809, // "i"
809, // "l"
809, // "o"
809, // "u"
809, // "x"
809, // "b"
809, // "e"
809, // "h"
809, // "t"
809, // "w"
796, // letter128
269, // {199..218 231..250}
269, // {193..198 225..230}
-1, // digit
923, // {"1".."9"}
1001, // "0"
496, // digit128
679, // {176..185}
-1, // ws
-1, // " "
-1, // {10}
396, // "#"
-1, // "+"
-1, // "*"
956, // "("
-1, // ")"
877, // "{"
-1, // "}"
1303, // "-"
-1, // "="
-1, // "["
-1, // "]"
-1, // ";"
-1, // "@"
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
{ // state 965
23,MIN_REDUCTION+51, // `[
86,MIN_REDUCTION+51, // "["
MIN_REDUCTION+51, // (default reduction)
  }
,
{ // state 966
2,739, // ws*
74,511, // ws
75,93, // " "
76,1172, // {10}
MIN_REDUCTION+93, // (default reduction)
  }
,
{ // state 967
-1, // $$start
-1, // <start>
-1, // ws*
-1, // <program>
-1, // <class decl>+
-1, // <class decl>
-1, // `class
238, // ID
710, // `{
-1, // <decl in class>*
-1, // `}
-1, // `extends
-1, // <decl in class>
-1, // <method decl>
-1, // `public
-1, // `void
853, // `(
-1, // `)
-1, // <stmt>*
209, // <type>
914, // `int
921, // `boolean
-1, // <empty bracket pair>
-1, // `[
-1, // `]
347, // <stmt>
950, // <assign>
-1, // `;
402, // <local var decl>
1316, // `if
467, // <exp>
-1, // `else
392, // `while
893, // `for
-1, // `=
-1, // `++
638, // <exp8>
292, // <exp7>
406, // <exp6>
408, // <exp5>
1266, // <exp4>
-1, // `+
784, // <exp3>
-1, // `*
1036, // <exp2>
39, // <cast exp>
957, // <unary exp>
1117, // <exp1>
953, // `-
1000, // INTLIT
1267, // letter
809, // {"A".."Z" "a" "d" "g" "j".."k" "m".."n" "q".."s" "y".."z"}
809, // "p"
809, // "v"
809, // "c"
809, // "f"
809, // "i"
809, // "l"
809, // "o"
809, // "u"
809, // "x"
809, // "b"
809, // "e"
809, // "h"
809, // "t"
809, // "w"
796, // letter128
269, // {199..218 231..250}
269, // {193..198 225..230}
-1, // digit
923, // {"1".."9"}
1001, // "0"
496, // digit128
679, // {176..185}
-1, // ws
-1, // " "
-1, // {10}
396, // "#"
-1, // "+"
-1, // "*"
956, // "("
-1, // ")"
877, // "{"
-1, // "}"
1303, // "-"
-1, // "="
-1, // "["
-1, // "]"
-1, // ";"
-1, // "@"
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
{ // state 968
50,674, // letter
51,66, // {"A".."Z" "a" "d" "g" "j".."k" "m".."n" "q".."s" "y".."z"}
52,66, // "p"
53,66, // "v"
54,66, // "c"
55,66, // "f"
56,66, // "i"
57,66, // "l"
58,66, // "o"
59,66, // "u"
60,66, // "x"
61,66, // "b"
62,66, // "e"
63,66, // "h"
64,66, // "t"
65,66, // "w"
66,1045, // letter128
67,735, // {199..218 231..250}
68,735, // {193..198 225..230}
69,293, // digit
70,259, // {"1".."9"}
71,259, // "0"
72,807, // digit128
73,1289, // {176..185}
90,142, // idChar*
91,307, // $$0
96,528, // idChar
97,1232, // "_"
98,17, // idChar128
99,806, // {223}
  }
,
{ // state 969
103,MIN_REDUCTION+127, // $NT
MIN_REDUCTION+127, // (default reduction)
  }
,
{ // state 970
0x80000000|794, // match move
0x80000000|603, // no-match move
0x80000000|1146, // NT-test-match state for `else
  }
,
{ // state 971
MIN_REDUCTION+51, // (default reduction)
  }
,
{ // state 972
23,MIN_REDUCTION+130, // `[
74,8, // ws
75,128, // " "
76,125, // {10}
86,MIN_REDUCTION+130, // "["
MIN_REDUCTION+130, // (default reduction)
  }
,
{ // state 973
MIN_REDUCTION+127, // (default reduction)
  }
,
{ // state 974
23,MIN_REDUCTION+126, // `[
86,MIN_REDUCTION+126, // "["
MIN_REDUCTION+126, // (default reduction)
  }
,
{ // state 975
-1, // $$start
-1, // <start>
-1, // ws*
-1, // <program>
-1, // <class decl>+
-1, // <class decl>
-1, // `class
238, // ID
710, // `{
-1, // <decl in class>*
1032, // `}
-1, // `extends
-1, // <decl in class>
-1, // <method decl>
-1, // `public
-1, // `void
853, // `(
-1, // `)
-1, // <stmt>*
209, // <type>
914, // `int
921, // `boolean
-1, // <empty bracket pair>
-1, // `[
-1, // `]
838, // <stmt>
950, // <assign>
-1, // `;
402, // <local var decl>
1316, // `if
467, // <exp>
-1, // `else
392, // `while
893, // `for
-1, // `=
-1, // `++
638, // <exp8>
292, // <exp7>
406, // <exp6>
408, // <exp5>
1266, // <exp4>
-1, // `+
784, // <exp3>
-1, // `*
1036, // <exp2>
39, // <cast exp>
957, // <unary exp>
1117, // <exp1>
953, // `-
1000, // INTLIT
1267, // letter
809, // {"A".."Z" "a" "d" "g" "j".."k" "m".."n" "q".."s" "y".."z"}
809, // "p"
809, // "v"
809, // "c"
809, // "f"
809, // "i"
809, // "l"
809, // "o"
809, // "u"
809, // "x"
809, // "b"
809, // "e"
809, // "h"
809, // "t"
809, // "w"
796, // letter128
269, // {199..218 231..250}
269, // {193..198 225..230}
-1, // digit
923, // {"1".."9"}
1001, // "0"
496, // digit128
679, // {176..185}
-1, // ws
-1, // " "
-1, // {10}
396, // "#"
-1, // "+"
-1, // "*"
956, // "("
-1, // ")"
877, // "{"
284, // "}"
1303, // "-"
-1, // "="
-1, // "["
-1, // "]"
-1, // ";"
-1, // "@"
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
};
}
private class Initter4{
public int doInit(int startIdx) {
  for (int i = 0; i < myParseTable.length; i++) {
    parseTable[i+startIdx] = myParseTable[i];
  }
  return myParseTable.length;
}
private final int[][] myParseTable = {
{ // state 976
2,155, // ws*
74,556, // ws
75,1265, // " "
76,702, // {10}
MIN_REDUCTION+57, // (default reduction)
  }
,
{ // state 977
7,239, // ID
16,482, // `(
30,611, // <exp>
36,1049, // <exp8>
37,315, // <exp7>
38,35, // <exp6>
39,32, // <exp5>
40,165, // <exp4>
42,413, // <exp3>
44,11, // <exp2>
45,339, // <cast exp>
46,504, // <unary exp>
47,231, // <exp1>
48,849, // `-
49,478, // INTLIT
50,1027, // letter
51,809, // {"A".."Z" "a" "d" "g" "j".."k" "m".."n" "q".."s" "y".."z"}
52,809, // "p"
53,809, // "v"
54,809, // "c"
55,809, // "f"
56,809, // "i"
57,809, // "l"
58,809, // "o"
59,809, // "u"
60,809, // "x"
61,809, // "b"
62,809, // "e"
63,809, // "h"
64,809, // "t"
65,809, // "w"
66,1296, // letter128
67,749, // {199..218 231..250}
68,749, // {193..198 225..230}
70,300, // {"1".."9"}
71,1120, // "0"
72,594, // digit128
73,1276, // {176..185}
80,956, // "("
84,1303, // "-"
  }
,
{ // state 978
74,580, // ws
75,404, // " "
76,255, // {10}
MIN_REDUCTION+88, // (default reduction)
  }
,
{ // state 979
MIN_REDUCTION+51, // (default reduction)
  }
,
{ // state 980
16,58, // `(
80,617, // "("
  }
,
{ // state 981
2,748, // ws*
74,417, // ws
75,970, // " "
76,577, // {10}
MIN_REDUCTION+93, // (default reduction)
  }
,
{ // state 982
0x80000000|499, // match move
0x80000000|1282, // no-match move
0x80000000|1146, // NT-test-match state for `else
  }
,
{ // state 983
MIN_REDUCTION+51, // (default reduction)
  }
,
{ // state 984
MIN_REDUCTION+127, // (default reduction)
  }
,
{ // state 985
MIN_REDUCTION+126, // (default reduction)
  }
,
{ // state 986
MIN_REDUCTION+19, // (default reduction)
  }
,
{ // state 987
2,1327, // ws*
74,762, // ws
75,394, // " "
76,226, // {10}
MIN_REDUCTION+81, // (default reduction)
  }
,
{ // state 988
8,841, // `{
82,877, // "{"
  }
,
{ // state 989
74,73, // ws
75,93, // " "
76,1172, // {10}
MIN_REDUCTION+92, // (default reduction)
  }
,
{ // state 990
0x80000000|794, // match move
0x80000000|581, // no-match move
0x80000000|1146, // NT-test-match state for `else
  }
,
{ // state 991
103,MIN_REDUCTION+50, // $NT
MIN_REDUCTION+50, // (default reduction)
  }
,
{ // state 992
0x80000000|350, // match move
0x80000000|246, // no-match move
0x80000000|46, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 993
MIN_REDUCTION+51, // (default reduction)
  }
,
{ // state 994
-1, // $$start
-1, // <start>
-1, // ws*
-1, // <program>
-1, // <class decl>+
-1, // <class decl>
-1, // `class
238, // ID
710, // `{
-1, // <decl in class>*
1060, // `}
-1, // `extends
-1, // <decl in class>
-1, // <method decl>
-1, // `public
-1, // `void
853, // `(
-1, // `)
-1, // <stmt>*
209, // <type>
914, // `int
921, // `boolean
-1, // <empty bracket pair>
-1, // `[
-1, // `]
838, // <stmt>
950, // <assign>
-1, // `;
402, // <local var decl>
1316, // `if
467, // <exp>
-1, // `else
392, // `while
893, // `for
-1, // `=
-1, // `++
638, // <exp8>
292, // <exp7>
406, // <exp6>
408, // <exp5>
1266, // <exp4>
-1, // `+
784, // <exp3>
-1, // `*
1036, // <exp2>
39, // <cast exp>
957, // <unary exp>
1117, // <exp1>
953, // `-
1000, // INTLIT
1267, // letter
809, // {"A".."Z" "a" "d" "g" "j".."k" "m".."n" "q".."s" "y".."z"}
809, // "p"
809, // "v"
809, // "c"
809, // "f"
809, // "i"
809, // "l"
809, // "o"
809, // "u"
809, // "x"
809, // "b"
809, // "e"
809, // "h"
809, // "t"
809, // "w"
796, // letter128
269, // {199..218 231..250}
269, // {193..198 225..230}
-1, // digit
923, // {"1".."9"}
1001, // "0"
496, // digit128
679, // {176..185}
-1, // ws
-1, // " "
-1, // {10}
396, // "#"
-1, // "+"
-1, // "*"
956, // "("
-1, // ")"
877, // "{"
344, // "}"
1303, // "-"
-1, // "="
-1, // "["
-1, // "]"
-1, // ";"
-1, // "@"
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
{ // state 995
MIN_REDUCTION+50, // (default reduction)
  }
,
{ // state 996
8,457, // `{
11,1214, // `extends
77,1114, // "#"
82,1057, // "{"
  }
,
{ // state 997
17,MIN_REDUCTION+51, // `)
81,MIN_REDUCTION+51, // ")"
MIN_REDUCTION+51, // (default reduction)
  }
,
{ // state 998
23,MIN_REDUCTION+130, // `[
74,40, // ws
75,141, // " "
76,160, // {10}
86,MIN_REDUCTION+130, // "["
MIN_REDUCTION+130, // (default reduction)
  }
,
{ // state 999
74,221, // ws
75,412, // " "
76,410, // {10}
MIN_REDUCTION+82, // (default reduction)
  }
,
{ // state 1000
0x80000000|1, // match move
0x80000000|43, // no-match move
0x80000000|46, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 1001
51,1066, // {"A".."Z" "a" "d" "g" "j".."k" "m".."n" "q".."s" "y".."z"}
52,1066, // "p"
53,1066, // "v"
54,1066, // "c"
55,1066, // "f"
56,1066, // "i"
57,1066, // "l"
58,1066, // "o"
59,1066, // "u"
60,1066, // "x"
61,1066, // "b"
62,1066, // "e"
63,1066, // "h"
64,1066, // "t"
65,1066, // "w"
68,1235, // {193..198 225..230}
70,1066, // {"1".."9"}
71,1066, // "0"
73,1235, // {176..185}
94,685, // hexDigit*
95,1015, // $$2
100,1221, // hexDigit
101,1288, // hexDigit128
  }
,
{ // state 1002
0x80000000|1240, // match move
0x80000000|625, // no-match move
0x80000000|1146, // NT-test-match state for `else
  }
,
{ // state 1003
23,MIN_REDUCTION+109, // `[
86,MIN_REDUCTION+109, // "["
103,MIN_REDUCTION+109, // $NT
MIN_REDUCTION+109, // (default reduction)
  }
,
{ // state 1004
23,MIN_REDUCTION+126, // `[
86,MIN_REDUCTION+126, // "["
MIN_REDUCTION+126, // (default reduction)
  }
,
{ // state 1005
2,1194, // ws*
74,779, // ws
75,353, // " "
76,285, // {10}
MIN_REDUCTION+81, // (default reduction)
  }
,
{ // state 1006
2,730, // ws*
74,399, // ws
75,990, // " "
76,566, // {10}
MIN_REDUCTION+93, // (default reduction)
  }
,
{ // state 1007
74,1277, // ws
75,990, // " "
76,566, // {10}
MIN_REDUCTION+92, // (default reduction)
  }
,
{ // state 1008
0x80000000|1, // match move
0x80000000|325, // no-match move
0x80000000|46, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 1009
7,218, // ID
16,519, // `(
30,1244, // <exp>
36,1158, // <exp8>
37,323, // <exp7>
38,22, // <exp6>
39,21, // <exp5>
40,139, // <exp4>
42,480, // <exp3>
44,83, // <exp2>
45,262, // <cast exp>
46,488, // <unary exp>
47,111, // <exp1>
48,842, // `-
49,463, // INTLIT
50,968, // letter
51,809, // {"A".."Z" "a" "d" "g" "j".."k" "m".."n" "q".."s" "y".."z"}
52,809, // "p"
53,809, // "v"
54,809, // "c"
55,809, // "f"
56,809, // "i"
57,809, // "l"
58,809, // "o"
59,809, // "u"
60,809, // "x"
61,809, // "b"
62,809, // "e"
63,809, // "h"
64,809, // "t"
65,809, // "w"
66,1233, // letter128
67,735, // {199..218 231..250}
68,735, // {193..198 225..230}
70,274, // {"1".."9"}
71,1079, // "0"
72,590, // digit128
73,1289, // {176..185}
80,956, // "("
84,1303, // "-"
  }
,
{ // state 1010
2,225, // ws*
23,MIN_REDUCTION+103, // `[
74,162, // ws
75,744, // " "
76,100, // {10}
86,MIN_REDUCTION+103, // "["
MIN_REDUCTION+103, // (default reduction)
  }
,
{ // state 1011
23,MIN_REDUCTION+126, // `[
86,MIN_REDUCTION+126, // "["
MIN_REDUCTION+126, // (default reduction)
  }
,
{ // state 1012
MIN_REDUCTION+50, // (default reduction)
  }
,
{ // state 1013
0x80000000|1240, // match move
0x80000000|388, // no-match move
0x80000000|1146, // NT-test-match state for `else
  }
,
{ // state 1014
MIN_REDUCTION+109, // (default reduction)
  }
,
{ // state 1015
0x80000000|1, // match move
0x80000000|497, // no-match move
0x80000000|46, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 1016
23,MIN_REDUCTION+51, // `[
86,MIN_REDUCTION+51, // "["
103,MIN_REDUCTION+51, // $NT
MIN_REDUCTION+51, // (default reduction)
  }
,
{ // state 1017
17,558, // `)
81,585, // ")"
  }
,
{ // state 1018
-1, // $$start
-1, // <start>
-1, // ws*
-1, // <program>
-1, // <class decl>+
-1, // <class decl>
-1, // `class
238, // ID
713, // `{
-1, // <decl in class>*
-1, // `}
-1, // `extends
-1, // <decl in class>
-1, // <method decl>
-1, // `public
-1, // `void
853, // `(
-1, // `)
-1, // <stmt>*
209, // <type>
914, // `int
921, // `boolean
-1, // <empty bracket pair>
-1, // `[
-1, // `]
1291, // <stmt>
1170, // <assign>
-1, // `;
370, // <local var decl>
678, // `if
467, // <exp>
-1, // `else
210, // `while
799, // `for
-1, // `=
-1, // `++
638, // <exp8>
292, // <exp7>
406, // <exp6>
408, // <exp5>
1266, // <exp4>
-1, // `+
784, // <exp3>
-1, // `*
1036, // <exp2>
39, // <cast exp>
957, // <unary exp>
1117, // <exp1>
953, // `-
1000, // INTLIT
1267, // letter
809, // {"A".."Z" "a" "d" "g" "j".."k" "m".."n" "q".."s" "y".."z"}
809, // "p"
809, // "v"
809, // "c"
809, // "f"
809, // "i"
809, // "l"
809, // "o"
809, // "u"
809, // "x"
809, // "b"
809, // "e"
809, // "h"
809, // "t"
809, // "w"
796, // letter128
269, // {199..218 231..250}
269, // {193..198 225..230}
-1, // digit
923, // {"1".."9"}
1001, // "0"
496, // digit128
679, // {176..185}
-1, // ws
-1, // " "
-1, // {10}
396, // "#"
-1, // "+"
-1, // "*"
956, // "("
-1, // ")"
877, // "{"
-1, // "}"
1303, // "-"
-1, // "="
-1, // "["
-1, // "]"
-1, // ";"
-1, // "@"
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
{ // state 1019
MIN_REDUCTION+126, // (default reduction)
  }
,
{ // state 1020
27,MIN_REDUCTION+51, // `;
88,MIN_REDUCTION+51, // ";"
MIN_REDUCTION+51, // (default reduction)
  }
,
{ // state 1021
2,1301, // ws*
23,MIN_REDUCTION+129, // `[
74,1176, // ws
75,92, // " "
76,103, // {10}
86,MIN_REDUCTION+129, // "["
103,MIN_REDUCTION+129, // $NT
MIN_REDUCTION+129, // (default reduction)
  }
,
{ // state 1022
MIN_REDUCTION+47, // (default reduction)
  }
,
{ // state 1023
MIN_REDUCTION+111, // (default reduction)
  }
,
{ // state 1024
31,896, // `else
77,475, // "#"
  }
,
{ // state 1025
MIN_REDUCTION+51, // (default reduction)
  }
,
{ // state 1026
0x80000000|782, // match move
0x80000000|474, // no-match move
0x80000000|1146, // NT-test-match state for `else
  }
,
{ // state 1027
50,674, // letter
51,66, // {"A".."Z" "a" "d" "g" "j".."k" "m".."n" "q".."s" "y".."z"}
52,66, // "p"
53,66, // "v"
54,66, // "c"
55,66, // "f"
56,66, // "i"
57,66, // "l"
58,66, // "o"
59,66, // "u"
60,66, // "x"
61,66, // "b"
62,66, // "e"
63,66, // "h"
64,66, // "t"
65,66, // "w"
66,1055, // letter128
67,749, // {199..218 231..250}
68,749, // {193..198 225..230}
69,293, // digit
70,259, // {"1".."9"}
71,259, // "0"
72,795, // digit128
73,1276, // {176..185}
90,129, // idChar*
91,297, // $$0
96,528, // idChar
97,1232, // "_"
98,89, // idChar128
99,818, // {223}
  }
,
{ // state 1028
-1, // $$start
-1, // <start>
-1, // ws*
-1, // <program>
-1, // <class decl>+
-1, // <class decl>
-1, // `class
238, // ID
50, // `{
-1, // <decl in class>*
-1, // `}
-1, // `extends
-1, // <decl in class>
-1, // <method decl>
-1, // `public
-1, // `void
853, // `(
-1, // `)
-1, // <stmt>*
209, // <type>
914, // `int
921, // `boolean
-1, // <empty bracket pair>
-1, // `[
-1, // `]
1099, // <stmt>
1044, // <assign>
-1, // `;
26, // <local var decl>
241, // `if
467, // <exp>
-1, // `else
1318, // `while
184, // `for
-1, // `=
-1, // `++
638, // <exp8>
292, // <exp7>
406, // <exp6>
408, // <exp5>
1266, // <exp4>
-1, // `+
784, // <exp3>
-1, // `*
1036, // <exp2>
39, // <cast exp>
957, // <unary exp>
1117, // <exp1>
953, // `-
1000, // INTLIT
1267, // letter
809, // {"A".."Z" "a" "d" "g" "j".."k" "m".."n" "q".."s" "y".."z"}
809, // "p"
809, // "v"
809, // "c"
809, // "f"
809, // "i"
809, // "l"
809, // "o"
809, // "u"
809, // "x"
809, // "b"
809, // "e"
809, // "h"
809, // "t"
809, // "w"
796, // letter128
269, // {199..218 231..250}
269, // {193..198 225..230}
-1, // digit
923, // {"1".."9"}
1001, // "0"
496, // digit128
679, // {176..185}
-1, // ws
-1, // " "
-1, // {10}
396, // "#"
-1, // "+"
-1, // "*"
956, // "("
-1, // ")"
877, // "{"
-1, // "}"
1303, // "-"
-1, // "="
-1, // "["
-1, // "]"
-1, // ";"
-1, // "@"
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
{ // state 1029
0x80000000|1, // match move
0x80000000|122, // no-match move
0x80000000|46, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 1030
0x80000000|1, // match move
0x80000000|472, // no-match move
0x80000000|46, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 1031
27,857, // `;
88,1335, // ";"
  }
,
{ // state 1032
0x80000000|18, // match move
0x80000000|1075, // no-match move
0x80000000|1146, // NT-test-match state for `else
  }
,
{ // state 1033
MIN_REDUCTION+47, // (default reduction)
  }
,
{ // state 1034
23,MIN_REDUCTION+49, // `[
86,MIN_REDUCTION+49, // "["
MIN_REDUCTION+49, // (default reduction)
  }
,
{ // state 1035
0x80000000|1211, // match move
0x80000000|1152, // no-match move
0x80000000|46, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 1036
MIN_REDUCTION+36, // (default reduction)
  }
,
{ // state 1037
51,1066, // {"A".."Z" "a" "d" "g" "j".."k" "m".."n" "q".."s" "y".."z"}
52,1066, // "p"
53,1066, // "v"
54,1066, // "c"
55,1066, // "f"
56,1066, // "i"
57,1066, // "l"
58,1066, // "o"
59,1066, // "u"
60,1066, // "x"
61,1066, // "b"
62,1066, // "e"
63,1066, // "h"
64,1066, // "t"
65,1066, // "w"
68,64, // {193..198 225..230}
70,1066, // {"1".."9"}
71,1066, // "0"
73,64, // {176..185}
94,738, // hexDigit*
95,366, // $$2
100,1221, // hexDigit
101,618, // hexDigit128
  }
,
{ // state 1038
MIN_REDUCTION+47, // (default reduction)
  }
,
{ // state 1039
MIN_REDUCTION+126, // (default reduction)
  }
,
{ // state 1040
43,206, // `*
79,1151, // "*"
MIN_REDUCTION+33, // (default reduction)
  }
,
{ // state 1041
0x80000000|1174, // match move
0x80000000|508, // no-match move
0x80000000|1146, // NT-test-match state for `else
  }
,
{ // state 1042
0x80000000|1, // match move
0x80000000|690, // no-match move
0x80000000|46, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 1043
74,547, // ws
75,698, // " "
76,971, // {10}
MIN_REDUCTION+74, // (default reduction)
  }
,
{ // state 1044
27,1248, // `;
88,754, // ";"
  }
,
{ // state 1045
0x80000000|1014, // match move
0x80000000|721, // no-match move
0x80000000|46, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 1046
MIN_REDUCTION+16, // (default reduction)
  }
,
{ // state 1047
MIN_REDUCTION+47, // (default reduction)
  }
,
{ // state 1048
17,1144, // `)
81,585, // ")"
  }
,
{ // state 1049
MIN_REDUCTION+28, // (default reduction)
  }
,
{ // state 1050
MIN_REDUCTION+114, // (default reduction)
  }
,
{ // state 1051
0x80000000|1, // match move
0x80000000|446, // no-match move
0x80000000|46, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 1052
23,MIN_REDUCTION+110, // `[
86,MIN_REDUCTION+110, // "["
MIN_REDUCTION+110, // (default reduction)
  }
,
{ // state 1053
17,375, // `)
22,1056, // <empty bracket pair>
23,1343, // `[
81,1128, // ")"
86,883, // "["
  }
,
{ // state 1054
7,249, // ID
16,374, // `(
30,673, // <exp>
36,1177, // <exp8>
37,2, // <exp7>
38,341, // <exp6>
39,343, // <exp5>
40,63, // <exp4>
42,531, // <exp3>
44,54, // <exp2>
45,290, // <cast exp>
46,516, // <unary exp>
47,131, // <exp1>
48,862, // `-
49,445, // INTLIT
50,773, // letter
51,809, // {"A".."Z" "a" "d" "g" "j".."k" "m".."n" "q".."s" "y".."z"}
52,809, // "p"
53,809, // "v"
54,809, // "c"
55,809, // "f"
56,809, // "i"
57,809, // "l"
58,809, // "o"
59,809, // "u"
60,809, // "x"
61,809, // "b"
62,809, // "e"
63,809, // "h"
64,809, // "t"
65,809, // "w"
66,1199, // letter128
67,711, // {199..218 231..250}
68,711, // {193..198 225..230}
70,224, // {"1".."9"}
71,1037, // "0"
72,549, // digit128
73,1305, // {176..185}
80,956, // "("
84,1303, // "-"
  }
,
{ // state 1055
0x80000000|1014, // match move
0x80000000|696, // no-match move
0x80000000|46, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 1056
MIN_REDUCTION+14, // (default reduction)
  }
,
{ // state 1057
2,42, // ws*
74,348, // ws
75,958, // " "
76,983, // {10}
MIN_REDUCTION+79, // (default reduction)
  }
,
{ // state 1058
0x80000000|1212, // match move
0x80000000|772, // no-match move
0x80000000|46, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 1059
MIN_REDUCTION+11, // (default reduction)
  }
,
{ // state 1060
0x80000000|18, // match move
0x80000000|1111, // no-match move
0x80000000|1146, // NT-test-match state for `else
  }
,
{ // state 1061
MIN_REDUCTION+41, // (default reduction)
  }
,
{ // state 1062
27,869, // `;
88,1325, // ";"
  }
,
{ // state 1063
2,658, // ws*
74,556, // ws
75,1265, // " "
76,702, // {10}
MIN_REDUCTION+55, // (default reduction)
  }
,
{ // state 1064
0x80000000|1, // match move
0x80000000|1197, // no-match move
0x80000000|46, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 1065
0x80000000|48, // match move
0x80000000|509, // no-match move
0x80000000|797, // NT-test-match state for <exp>
  }
,
{ // state 1066
MIN_REDUCTION+112, // (default reduction)
  }
,
{ // state 1067
74,554, // ws
75,394, // " "
76,226, // {10}
MIN_REDUCTION+94, // (default reduction)
  }
,
{ // state 1068
7,249, // ID
16,374, // `(
30,633, // <exp>
36,1177, // <exp8>
37,2, // <exp7>
38,341, // <exp6>
39,343, // <exp5>
40,63, // <exp4>
42,531, // <exp3>
44,54, // <exp2>
45,290, // <cast exp>
46,516, // <unary exp>
47,131, // <exp1>
48,862, // `-
49,445, // INTLIT
50,773, // letter
51,809, // {"A".."Z" "a" "d" "g" "j".."k" "m".."n" "q".."s" "y".."z"}
52,809, // "p"
53,809, // "v"
54,809, // "c"
55,809, // "f"
56,809, // "i"
57,809, // "l"
58,809, // "o"
59,809, // "u"
60,809, // "x"
61,809, // "b"
62,809, // "e"
63,809, // "h"
64,809, // "t"
65,809, // "w"
66,1199, // letter128
67,711, // {199..218 231..250}
68,711, // {193..198 225..230}
70,224, // {"1".."9"}
71,1037, // "0"
72,549, // digit128
73,1305, // {176..185}
80,956, // "("
84,1303, // "-"
  }
,
{ // state 1069
MIN_REDUCTION+109, // (default reduction)
  }
,
{ // state 1070
74,1039, // ws
75,1182, // " "
76,819, // {10}
MIN_REDUCTION+96, // (default reduction)
  }
,
{ // state 1071
0x80000000|604, // match move
0x80000000|10, // no-match move
0x80000000|1146, // NT-test-match state for `else
  }
,
{ // state 1072
0x80000000|487, // match move
0x80000000|1293, // no-match move
0x80000000|1146, // NT-test-match state for `else
  }
,
{ // state 1073
2,700, // ws*
74,399, // ws
75,990, // " "
76,566, // {10}
MIN_REDUCTION+81, // (default reduction)
  }
,
{ // state 1074
0x80000000|1, // match move
0x80000000|1180, // no-match move
0x80000000|46, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 1075
MIN_REDUCTION+17, // (default reduction)
  }
,
{ // state 1076
0x80000000|346, // match move
0x80000000|311, // no-match move
0x80000000|1146, // NT-test-match state for `else
  }
,
{ // state 1077
MIN_REDUCTION+127, // (default reduction)
  }
,
{ // state 1078
0x80000000|1, // match move
0x80000000|105, // no-match move
0x80000000|46, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 1079
51,1066, // {"A".."Z" "a" "d" "g" "j".."k" "m".."n" "q".."s" "y".."z"}
52,1066, // "p"
53,1066, // "v"
54,1066, // "c"
55,1066, // "f"
56,1066, // "i"
57,1066, // "l"
58,1066, // "o"
59,1066, // "u"
60,1066, // "x"
61,1066, // "b"
62,1066, // "e"
63,1066, // "h"
64,1066, // "t"
65,1066, // "w"
68,264, // {193..198 225..230}
70,1066, // {"1".."9"}
71,1066, // "0"
73,264, // {176..185}
94,816, // hexDigit*
95,386, // $$2
100,1221, // hexDigit
101,759, // hexDigit128
  }
,
{ // state 1080
23,MIN_REDUCTION+44, // `[
86,MIN_REDUCTION+44, // "["
103,MIN_REDUCTION+44, // $NT
MIN_REDUCTION+44, // (default reduction)
  }
,
{ // state 1081
MIN_REDUCTION+22, // (default reduction)
  }
,
{ // state 1082
74,547, // ws
75,698, // " "
76,971, // {10}
MIN_REDUCTION+76, // (default reduction)
  }
,
{ // state 1083
7,249, // ID
16,374, // `(
30,627, // <exp>
36,1177, // <exp8>
37,2, // <exp7>
38,341, // <exp6>
39,343, // <exp5>
40,63, // <exp4>
42,531, // <exp3>
44,54, // <exp2>
45,290, // <cast exp>
46,516, // <unary exp>
47,131, // <exp1>
48,862, // `-
49,445, // INTLIT
50,773, // letter
51,809, // {"A".."Z" "a" "d" "g" "j".."k" "m".."n" "q".."s" "y".."z"}
52,809, // "p"
53,809, // "v"
54,809, // "c"
55,809, // "f"
56,809, // "i"
57,809, // "l"
58,809, // "o"
59,809, // "u"
60,809, // "x"
61,809, // "b"
62,809, // "e"
63,809, // "h"
64,809, // "t"
65,809, // "w"
66,1199, // letter128
67,711, // {199..218 231..250}
68,711, // {193..198 225..230}
70,224, // {"1".."9"}
71,1037, // "0"
72,549, // digit128
73,1305, // {176..185}
80,956, // "("
84,1303, // "-"
  }
,
{ // state 1084
-1, // $$start
-1, // <start>
-1, // ws*
-1, // <program>
-1, // <class decl>+
-1, // <class decl>
-1, // `class
238, // ID
51, // `{
-1, // <decl in class>*
-1, // `}
-1, // `extends
-1, // <decl in class>
-1, // <method decl>
-1, // `public
-1, // `void
853, // `(
-1, // `)
-1, // <stmt>*
209, // <type>
914, // `int
921, // `boolean
-1, // <empty bracket pair>
-1, // `[
-1, // `]
1026, // <stmt>
915, // <assign>
-1, // `;
755, // <local var decl>
1342, // `if
467, // <exp>
-1, // `else
470, // `while
653, // `for
-1, // `=
-1, // `++
638, // <exp8>
292, // <exp7>
406, // <exp6>
408, // <exp5>
1266, // <exp4>
-1, // `+
784, // <exp3>
-1, // `*
1036, // <exp2>
39, // <cast exp>
957, // <unary exp>
1117, // <exp1>
953, // `-
1000, // INTLIT
1267, // letter
809, // {"A".."Z" "a" "d" "g" "j".."k" "m".."n" "q".."s" "y".."z"}
809, // "p"
809, // "v"
809, // "c"
809, // "f"
809, // "i"
809, // "l"
809, // "o"
809, // "u"
809, // "x"
809, // "b"
809, // "e"
809, // "h"
809, // "t"
809, // "w"
796, // letter128
269, // {199..218 231..250}
269, // {193..198 225..230}
-1, // digit
923, // {"1".."9"}
1001, // "0"
496, // digit128
679, // {176..185}
-1, // ws
-1, // " "
-1, // {10}
396, // "#"
-1, // "+"
-1, // "*"
956, // "("
-1, // ")"
877, // "{"
-1, // "}"
1303, // "-"
-1, // "="
-1, // "["
-1, // "]"
-1, // ";"
-1, // "@"
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
{ // state 1085
0x80000000|1, // match move
0x80000000|1167, // no-match move
0x80000000|46, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 1086
74,489, // ws
75,991, // " "
76,332, // {10}
103,MIN_REDUCTION+90, // $NT
  }
,
{ // state 1087
MIN_REDUCTION+127, // (default reduction)
  }
,
{ // state 1088
-1, // $$start
-1, // <start>
-1, // ws*
-1, // <program>
-1, // <class decl>+
-1, // <class decl>
-1, // `class
238, // ID
731, // `{
-1, // <decl in class>*
-1, // `}
-1, // `extends
-1, // <decl in class>
-1, // <method decl>
-1, // `public
-1, // `void
853, // `(
-1, // `)
-1, // <stmt>*
209, // <type>
914, // `int
921, // `boolean
-1, // <empty bracket pair>
-1, // `[
-1, // `]
583, // <stmt>
691, // <assign>
-1, // `;
1107, // <local var decl>
908, // `if
467, // <exp>
-1, // `else
703, // `while
208, // `for
-1, // `=
-1, // `++
638, // <exp8>
292, // <exp7>
406, // <exp6>
408, // <exp5>
1266, // <exp4>
-1, // `+
784, // <exp3>
-1, // `*
1036, // <exp2>
39, // <cast exp>
957, // <unary exp>
1117, // <exp1>
953, // `-
1000, // INTLIT
1267, // letter
809, // {"A".."Z" "a" "d" "g" "j".."k" "m".."n" "q".."s" "y".."z"}
809, // "p"
809, // "v"
809, // "c"
809, // "f"
809, // "i"
809, // "l"
809, // "o"
809, // "u"
809, // "x"
809, // "b"
809, // "e"
809, // "h"
809, // "t"
809, // "w"
796, // letter128
269, // {199..218 231..250}
269, // {193..198 225..230}
-1, // digit
923, // {"1".."9"}
1001, // "0"
496, // digit128
679, // {176..185}
-1, // ws
-1, // " "
-1, // {10}
396, // "#"
-1, // "+"
-1, // "*"
956, // "("
-1, // ")"
877, // "{"
-1, // "}"
1303, // "-"
-1, // "="
-1, // "["
-1, // "]"
-1, // ";"
-1, // "@"
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
{ // state 1089
23,MIN_REDUCTION+99, // `[
86,MIN_REDUCTION+99, // "["
MIN_REDUCTION+99, // (default reduction)
  }
,
{ // state 1090
0x80000000|200, // match move
0x80000000|140, // no-match move
0x80000000|797, // NT-test-match state for <exp>
  }
,
{ // state 1091
MIN_REDUCTION+124, // (default reduction)
  }
,
{ // state 1092
0x80000000|1, // match move
0x80000000|280, // no-match move
0x80000000|46, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 1093
27,869, // `;
88,179, // ";"
  }
,
{ // state 1094
2,712, // ws*
74,417, // ws
75,970, // " "
76,577, // {10}
MIN_REDUCTION+81, // (default reduction)
  }
,
{ // state 1095
0x80000000|1, // match move
0x80000000|483, // no-match move
0x80000000|46, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 1096
0x80000000|1174, // match move
0x80000000|382, // no-match move
0x80000000|1146, // NT-test-match state for `else
  }
,
{ // state 1097
2,469, // ws*
74,303, // ws
75,995, // " "
76,1025, // {10}
MIN_REDUCTION+93, // (default reduction)
  }
,
{ // state 1098
103,MIN_REDUCTION+28, // $NT
  }
,
{ // state 1099
0x80000000|576, // match move
0x80000000|10, // no-match move
0x80000000|1146, // NT-test-match state for `else
  }
,
{ // state 1100
MIN_REDUCTION+127, // (default reduction)
  }
,
{ // state 1101
MIN_REDUCTION+48, // (default reduction)
  }
,
{ // state 1102
103,MIN_REDUCTION+41, // $NT
MIN_REDUCTION+41, // (default reduction)
  }
,
{ // state 1103
23,MIN_REDUCTION+50, // `[
86,MIN_REDUCTION+50, // "["
103,MIN_REDUCTION+50, // $NT
MIN_REDUCTION+50, // (default reduction)
  }
,
{ // state 1104
2,940, // ws*
74,733, // ws
75,379, // " "
76,228, // {10}
MIN_REDUCTION+97, // (default reduction)
  }
,
{ // state 1105
0x80000000|650, // match move
0x80000000|954, // no-match move
0x80000000|46, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 1106
MIN_REDUCTION+23, // (default reduction)
  }
,
{ // state 1107
27,857, // `;
88,227, // ";"
  }
,
{ // state 1108
0x80000000|780, // match move
0x80000000|1003, // no-match move
0x80000000|46, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 1109
MIN_REDUCTION+127, // (default reduction)
  }
,
{ // state 1110
MIN_REDUCTION+47, // (default reduction)
  }
,
{ // state 1111
MIN_REDUCTION+17, // (default reduction)
  }
,
{ // state 1112
0x80000000|555, // match move
0x80000000|127, // no-match move
0x80000000|797, // NT-test-match state for <exp>
  }
,
{ // state 1113
9,836, // <decl in class>*
10,768, // `}
12,645, // <decl in class>
13,212, // <method decl>
14,313, // `public
77,1258, // "#"
83,20, // "}"
  }
,
{ // state 1114
62,133, // "e"
  }
,
{ // state 1115
27,1215, // `;
88,847, // ";"
  }
,
{ // state 1116
17,904, // `)
81,585, // ")"
  }
,
{ // state 1117
0x80000000|1, // match move
0x80000000|1184, // no-match move
0x80000000|46, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 1118
2,1092, // ws*
  }
,
{ // state 1119
0x80000000|1, // match move
0x80000000|1264, // no-match move
0x80000000|46, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 1120
51,1066, // {"A".."Z" "a" "d" "g" "j".."k" "m".."n" "q".."s" "y".."z"}
52,1066, // "p"
53,1066, // "v"
54,1066, // "c"
55,1066, // "f"
56,1066, // "i"
57,1066, // "l"
58,1066, // "o"
59,1066, // "u"
60,1066, // "x"
61,1066, // "b"
62,1066, // "e"
63,1066, // "h"
64,1066, // "t"
65,1066, // "w"
68,272, // {193..198 225..230}
70,1066, // {"1".."9"}
71,1066, // "0"
73,272, // {176..185}
94,827, // hexDigit*
95,377, // $$2
100,1221, // hexDigit
101,724, // hexDigit128
  }
,
{ // state 1121
74,MIN_REDUCTION+127, // ws
75,MIN_REDUCTION+127, // " "
76,MIN_REDUCTION+127, // {10}
MIN_REDUCTION+127, // (default reduction)
  }
,
{ // state 1122
23,MIN_REDUCTION+49, // `[
86,MIN_REDUCTION+49, // "["
MIN_REDUCTION+49, // (default reduction)
  }
,
{ // state 1123
103,MIN_REDUCTION+126, // $NT
  }
,
{ // state 1124
MIN_REDUCTION+6, // (default reduction)
  }
,
{ // state 1125
24,732, // `]
87,609, // "]"
  }
,
{ // state 1126
MIN_REDUCTION+24, // (default reduction)
  }
,
{ // state 1127
103,MIN_REDUCTION+130, // $NT
  }
,
{ // state 1128
2,233, // ws*
74,1271, // ws
75,44, // " "
76,927, // {10}
MIN_REDUCTION+77, // (default reduction)
  }
,
{ // state 1129
0x80000000|1, // match move
0x80000000|851, // no-match move
0x80000000|46, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 1130
2,962, // ws*
  }
,
{ // state 1131
MIN_REDUCTION+49, // (default reduction)
  }
,
{ // state 1132
16,931, // `(
80,1065, // "("
  }
,
{ // state 1133
MIN_REDUCTION+24, // (default reduction)
  }
,
{ // state 1134
2,1013, // ws*
74,511, // ws
75,93, // " "
76,1172, // {10}
MIN_REDUCTION+81, // (default reduction)
  }
,
{ // state 1135
17,MIN_REDUCTION+127, // `)
81,MIN_REDUCTION+127, // ")"
MIN_REDUCTION+127, // (default reduction)
  }
,
{ // state 1136
2,94, // ws*
74,257, // ws
75,1182, // " "
76,819, // {10}
MIN_REDUCTION+53, // (default reduction)
  }
,
{ // state 1137
MIN_REDUCTION+13, // (default reduction)
  }
,
{ // state 1138
2,948, // ws*
74,776, // ws
75,355, // " "
76,287, // {10}
MIN_REDUCTION+97, // (default reduction)
  }
,
{ // state 1139
0x80000000|1, // match move
0x80000000|860, // no-match move
0x80000000|46, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 1140
74,1039, // ws
75,1182, // " "
76,819, // {10}
MIN_REDUCTION+90, // (default reduction)
  }
,
{ // state 1141
0x80000000|1, // match move
0x80000000|331, // no-match move
0x80000000|46, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 1142
17,854, // `)
81,585, // ")"
  }
,
{ // state 1143
7,239, // ID
16,482, // `(
30,520, // <exp>
36,1049, // <exp8>
37,315, // <exp7>
38,35, // <exp6>
39,32, // <exp5>
40,165, // <exp4>
42,413, // <exp3>
44,11, // <exp2>
45,339, // <cast exp>
46,504, // <unary exp>
47,231, // <exp1>
48,849, // `-
49,478, // INTLIT
50,1027, // letter
51,809, // {"A".."Z" "a" "d" "g" "j".."k" "m".."n" "q".."s" "y".."z"}
52,809, // "p"
53,809, // "v"
54,809, // "c"
55,809, // "f"
56,809, // "i"
57,809, // "l"
58,809, // "o"
59,809, // "u"
60,809, // "x"
61,809, // "b"
62,809, // "e"
63,809, // "h"
64,809, // "t"
65,809, // "w"
66,1296, // letter128
67,749, // {199..218 231..250}
68,749, // {193..198 225..230}
70,300, // {"1".."9"}
71,1120, // "0"
72,594, // digit128
73,1276, // {176..185}
80,956, // "("
84,1303, // "-"
  }
,
{ // state 1144
-1, // $$start
-1, // <start>
-1, // ws*
-1, // <program>
-1, // <class decl>+
-1, // <class decl>
-1, // `class
238, // ID
757, // `{
-1, // <decl in class>*
-1, // `}
-1, // `extends
-1, // <decl in class>
-1, // <method decl>
-1, // `public
-1, // `void
853, // `(
-1, // `)
-1, // <stmt>*
209, // <type>
914, // `int
921, // `boolean
-1, // <empty bracket pair>
-1, // `[
-1, // `]
484, // <stmt>
783, // <assign>
-1, // `;
1093, // <local var decl>
980, // `if
467, // <exp>
-1, // `else
726, // `while
177, // `for
-1, // `=
-1, // `++
638, // <exp8>
292, // <exp7>
406, // <exp6>
408, // <exp5>
1266, // <exp4>
-1, // `+
784, // <exp3>
-1, // `*
1036, // <exp2>
39, // <cast exp>
957, // <unary exp>
1117, // <exp1>
953, // `-
1000, // INTLIT
1267, // letter
809, // {"A".."Z" "a" "d" "g" "j".."k" "m".."n" "q".."s" "y".."z"}
809, // "p"
809, // "v"
809, // "c"
809, // "f"
809, // "i"
809, // "l"
809, // "o"
809, // "u"
809, // "x"
809, // "b"
809, // "e"
809, // "h"
809, // "t"
809, // "w"
796, // letter128
269, // {199..218 231..250}
269, // {193..198 225..230}
-1, // digit
923, // {"1".."9"}
1001, // "0"
496, // digit128
679, // {176..185}
-1, // ws
-1, // " "
-1, // {10}
396, // "#"
-1, // "+"
-1, // "*"
956, // "("
-1, // ")"
877, // "{"
-1, // "}"
1303, // "-"
-1, // "="
-1, // "["
-1, // "]"
-1, // ";"
-1, // "@"
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
{ // state 1145
2,1292, // ws*
74,556, // ws
75,1265, // " "
76,702, // {10}
MIN_REDUCTION+59, // (default reduction)
  }
,
{ // state 1146
77,885, // "#"
  }
,
{ // state 1147
0x80000000|1, // match move
0x80000000|867, // no-match move
0x80000000|46, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 1148
2,1042, // ws*
  }
,
{ // state 1149
59,626, // "u"
  }
,
{ // state 1150
27,376, // `;
88,847, // ";"
  }
,
{ // state 1151
2,277, // ws*
74,1087, // ws
75,167, // " "
76,189, // {10}
MIN_REDUCTION+73, // (default reduction)
  }
,
{ // state 1152
23,MIN_REDUCTION+98, // `[
86,MIN_REDUCTION+98, // "["
MIN_REDUCTION+98, // (default reduction)
  }
,
{ // state 1153
-1, // $$start
-1, // <start>
-1, // ws*
-1, // <program>
-1, // <class decl>+
-1, // <class decl>
-1, // `class
238, // ID
51, // `{
-1, // <decl in class>*
-1, // `}
-1, // `extends
-1, // <decl in class>
-1, // <method decl>
-1, // `public
-1, // `void
853, // `(
-1, // `)
-1, // <stmt>*
209, // <type>
914, // `int
921, // `boolean
-1, // <empty bracket pair>
-1, // `[
-1, // `]
278, // <stmt>
915, // <assign>
-1, // `;
755, // <local var decl>
1342, // `if
467, // <exp>
-1, // `else
470, // `while
653, // `for
-1, // `=
-1, // `++
638, // <exp8>
292, // <exp7>
406, // <exp6>
408, // <exp5>
1266, // <exp4>
-1, // `+
784, // <exp3>
-1, // `*
1036, // <exp2>
39, // <cast exp>
957, // <unary exp>
1117, // <exp1>
953, // `-
1000, // INTLIT
1267, // letter
809, // {"A".."Z" "a" "d" "g" "j".."k" "m".."n" "q".."s" "y".."z"}
809, // "p"
809, // "v"
809, // "c"
809, // "f"
809, // "i"
809, // "l"
809, // "o"
809, // "u"
809, // "x"
809, // "b"
809, // "e"
809, // "h"
809, // "t"
809, // "w"
796, // letter128
269, // {199..218 231..250}
269, // {193..198 225..230}
-1, // digit
923, // {"1".."9"}
1001, // "0"
496, // digit128
679, // {176..185}
-1, // ws
-1, // " "
-1, // {10}
396, // "#"
-1, // "+"
-1, // "*"
956, // "("
-1, // ")"
877, // "{"
-1, // "}"
1303, // "-"
-1, // "="
-1, // "["
-1, // "]"
-1, // ";"
-1, // "@"
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
{ // state 1154
0x80000000|466, // match move
0x80000000|71, // no-match move
0x80000000|46, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 1155
0x80000000|1, // match move
0x80000000|1218, // no-match move
0x80000000|46, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 1156
MIN_REDUCTION+50, // (default reduction)
  }
,
{ // state 1157
17,1088, // `)
81,585, // ")"
  }
,
{ // state 1158
MIN_REDUCTION+28, // (default reduction)
  }
,
{ // state 1159
17,800, // `)
81,585, // ")"
  }
,
{ // state 1160
0x80000000|1, // match move
0x80000000|415, // no-match move
0x80000000|46, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 1161
23,MIN_REDUCTION+101, // `[
86,MIN_REDUCTION+101, // "["
MIN_REDUCTION+101, // (default reduction)
  }
,
{ // state 1162
2,254, // ws*
74,257, // ws
75,1182, // " "
76,819, // {10}
MIN_REDUCTION+61, // (default reduction)
  }
,
{ // state 1163
0x80000000|447, // match move
0x80000000|523, // no-match move
0x80000000|46, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 1164
0x80000000|473, // match move
0x80000000|1189, // no-match move
0x80000000|46, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 1165
0x80000000|1, // match move
0x80000000|998, // no-match move
0x80000000|46, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 1166
MIN_REDUCTION+50, // (default reduction)
  }
,
{ // state 1167
23,MIN_REDUCTION+96, // `[
74,1029, // ws
75,744, // " "
76,100, // {10}
86,MIN_REDUCTION+96, // "["
MIN_REDUCTION+96, // (default reduction)
  }
,
{ // state 1168
74,545, // ws
75,353, // " "
76,285, // {10}
MIN_REDUCTION+74, // (default reduction)
  }
,
{ // state 1169
MIN_REDUCTION+50, // (default reduction)
  }
,
{ // state 1170
27,826, // `;
88,109, // ";"
  }
,
{ // state 1171
0x80000000|1, // match move
0x80000000|894, // no-match move
0x80000000|46, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 1172
0x80000000|317, // match move
0x80000000|720, // no-match move
0x80000000|1146, // NT-test-match state for `else
  }
,
{ // state 1173
0x80000000|1, // match move
0x80000000|972, // no-match move
0x80000000|46, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 1174
MIN_REDUCTION+21, // (default reduction)
  }
,
{ // state 1175
2,1165, // ws*
  }
,
{ // state 1176
0x80000000|524, // match move
0x80000000|1210, // no-match move
0x80000000|46, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 1177
MIN_REDUCTION+28, // (default reduction)
  }
,
{ // state 1178
27,812, // `;
88,134, // ";"
  }
,
{ // state 1179
74,591, // ws
75,443, // " "
76,181, // {10}
MIN_REDUCTION+96, // (default reduction)
  }
,
{ // state 1180
23,MIN_REDUCTION+104, // `[
86,MIN_REDUCTION+104, // "["
MIN_REDUCTION+104, // (default reduction)
  }
,
{ // state 1181
27,1228, // `;
88,847, // ";"
  }
,
{ // state 1182
MIN_REDUCTION+50, // (default reduction)
  }
,
{ // state 1183
2,1173, // ws*
  }
,
{ // state 1184
23,243, // `[
86,373, // "["
MIN_REDUCTION+42, // (default reduction)
  }
,
{ // state 1185
0x80000000|1, // match move
0x80000000|1324, // no-match move
0x80000000|46, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 1186
2,1008, // ws*
  }
,
{ // state 1187
MIN_REDUCTION+4, // (default reduction)
  }
,
{ // state 1188
0x80000000|1014, // match move
0x80000000|745, // no-match move
0x80000000|46, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 1189
2,1204, // ws*
23,MIN_REDUCTION+131, // `[
74,1176, // ws
75,92, // " "
76,103, // {10}
86,MIN_REDUCTION+131, // "["
103,MIN_REDUCTION+131, // $NT
MIN_REDUCTION+131, // (default reduction)
  }
,
{ // state 1190
0x80000000|924, // match move
0x80000000|420, // no-match move
0x80000000|46, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 1191
103,MIN_REDUCTION+42, // $NT
  }
,
{ // state 1192
MIN_REDUCTION+23, // (default reduction)
  }
,
{ // state 1193
23,MIN_REDUCTION+47, // `[
86,MIN_REDUCTION+47, // "["
MIN_REDUCTION+47, // (default reduction)
  }
,
{ // state 1194
74,545, // ws
75,353, // " "
76,285, // {10}
MIN_REDUCTION+80, // (default reduction)
  }
,
{ // state 1195
0x80000000|906, // match move
0x80000000|1192, // no-match move
0x80000000|1146, // NT-test-match state for `else
  }
,
{ // state 1196
MIN_REDUCTION+23, // (default reduction)
  }
,
{ // state 1197
23,MIN_REDUCTION+101, // `[
86,MIN_REDUCTION+101, // "["
MIN_REDUCTION+101, // (default reduction)
  }
,
{ // state 1198
34,59, // `=
85,1209, // "="
  }
,
{ // state 1199
0x80000000|1186, // match move
0x80000000|926, // no-match move
0x80000000|46, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 1200
7,239, // ID
16,482, // `(
30,1048, // <exp>
36,1049, // <exp8>
37,315, // <exp7>
38,35, // <exp6>
39,32, // <exp5>
40,165, // <exp4>
42,413, // <exp3>
44,11, // <exp2>
45,339, // <cast exp>
46,504, // <unary exp>
47,231, // <exp1>
48,849, // `-
49,478, // INTLIT
50,1027, // letter
51,809, // {"A".."Z" "a" "d" "g" "j".."k" "m".."n" "q".."s" "y".."z"}
52,809, // "p"
53,809, // "v"
54,809, // "c"
55,809, // "f"
56,809, // "i"
57,809, // "l"
58,809, // "o"
59,809, // "u"
60,809, // "x"
61,809, // "b"
62,809, // "e"
63,809, // "h"
64,809, // "t"
65,809, // "w"
66,1296, // letter128
67,749, // {199..218 231..250}
68,749, // {193..198 225..230}
70,300, // {"1".."9"}
71,1120, // "0"
72,594, // digit128
73,1276, // {176..185}
80,956, // "("
84,1303, // "-"
  }
,
{ // state 1201
23,MIN_REDUCTION+47, // `[
86,MIN_REDUCTION+47, // "["
MIN_REDUCTION+47, // (default reduction)
  }
,
{ // state 1202
0x80000000|1, // match move
0x80000000|934, // no-match move
0x80000000|46, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 1203
23,MIN_REDUCTION+47, // `[
86,MIN_REDUCTION+47, // "["
MIN_REDUCTION+47, // (default reduction)
  }
,
{ // state 1204
0x80000000|1127, // match move
0x80000000|903, // no-match move
0x80000000|46, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 1205
2,870, // ws*
74,776, // ws
75,355, // " "
76,287, // {10}
MIN_REDUCTION+69, // (default reduction)
  }
,
{ // state 1206
MIN_REDUCTION+35, // (default reduction)
  }
,
{ // state 1207
7,239, // ID
16,482, // `(
30,1157, // <exp>
36,1049, // <exp8>
37,315, // <exp7>
38,35, // <exp6>
39,32, // <exp5>
40,165, // <exp4>
42,413, // <exp3>
44,11, // <exp2>
45,339, // <cast exp>
46,504, // <unary exp>
47,231, // <exp1>
48,849, // `-
49,478, // INTLIT
50,1027, // letter
51,809, // {"A".."Z" "a" "d" "g" "j".."k" "m".."n" "q".."s" "y".."z"}
52,809, // "p"
53,809, // "v"
54,809, // "c"
55,809, // "f"
56,809, // "i"
57,809, // "l"
58,809, // "o"
59,809, // "u"
60,809, // "x"
61,809, // "b"
62,809, // "e"
63,809, // "h"
64,809, // "t"
65,809, // "w"
66,1296, // letter128
67,749, // {199..218 231..250}
68,749, // {193..198 225..230}
70,300, // {"1".."9"}
71,1120, // "0"
72,594, // digit128
73,1276, // {176..185}
80,956, // "("
84,1303, // "-"
  }
,
{ // state 1208
74,801, // ws
75,722, // " "
76,1330, // {10}
MIN_REDUCTION+78, // (default reduction)
  }
,
{ // state 1209
2,361, // ws*
74,303, // ws
75,995, // " "
76,1025, // {10}
MIN_REDUCTION+87, // (default reduction)
  }
,
{ // state 1210
23,MIN_REDUCTION+127, // `[
86,MIN_REDUCTION+127, // "["
103,MIN_REDUCTION+127, // $NT
MIN_REDUCTION+127, // (default reduction)
  }
,
{ // state 1211
MIN_REDUCTION+98, // (default reduction)
  }
,
{ // state 1212
2,1163, // ws*
103,MIN_REDUCTION+97, // $NT
  }
,
{ // state 1213
MIN_REDUCTION+35, // (default reduction)
  }
,
{ // state 1214
7,77, // ID
50,395, // letter
51,809, // {"A".."Z" "a" "d" "g" "j".."k" "m".."n" "q".."s" "y".."z"}
52,809, // "p"
53,809, // "v"
54,809, // "c"
55,809, // "f"
56,809, // "i"
57,809, // "l"
58,809, // "o"
59,809, // "u"
60,809, // "x"
61,809, // "b"
62,809, // "e"
63,809, // "h"
64,809, // "t"
65,809, // "w"
66,1334, // letter128
67,1110, // {199..218 231..250}
68,1110, // {193..198 225..230}
  }
,
{ // state 1215
-1, // $$start
-1, // <start>
-1, // ws*
-1, // <program>
-1, // <class decl>+
-1, // <class decl>
-1, // `class
238, // ID
845, // `{
-1, // <decl in class>*
-1, // `}
-1, // `extends
-1, // <decl in class>
-1, // <method decl>
-1, // `public
-1, // `void
853, // `(
-1, // `)
-1, // <stmt>*
209, // <type>
914, // `int
921, // `boolean
-1, // <empty bracket pair>
-1, // `[
-1, // `]
912, // <stmt>
1178, // <assign>
-1, // `;
529, // <local var decl>
622, // `if
467, // <exp>
-1, // `else
1132, // `while
832, // `for
-1, // `=
-1, // `++
638, // <exp8>
292, // <exp7>
406, // <exp6>
408, // <exp5>
1266, // <exp4>
-1, // `+
784, // <exp3>
-1, // `*
1036, // <exp2>
39, // <cast exp>
957, // <unary exp>
1117, // <exp1>
953, // `-
1000, // INTLIT
1267, // letter
809, // {"A".."Z" "a" "d" "g" "j".."k" "m".."n" "q".."s" "y".."z"}
809, // "p"
809, // "v"
809, // "c"
809, // "f"
809, // "i"
809, // "l"
809, // "o"
809, // "u"
809, // "x"
809, // "b"
809, // "e"
809, // "h"
809, // "t"
809, // "w"
796, // letter128
269, // {199..218 231..250}
269, // {193..198 225..230}
-1, // digit
923, // {"1".."9"}
1001, // "0"
496, // digit128
679, // {176..185}
-1, // ws
-1, // " "
-1, // {10}
396, // "#"
-1, // "+"
-1, // "*"
956, // "("
-1, // ")"
877, // "{"
-1, // "}"
1303, // "-"
-1, // "="
-1, // "["
-1, // "]"
-1, // ";"
-1, // "@"
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
{ // state 1216
23,MIN_REDUCTION+110, // `[
86,MIN_REDUCTION+110, // "["
103,MIN_REDUCTION+110, // $NT
MIN_REDUCTION+110, // (default reduction)
  }
,
{ // state 1217
0x80000000|1, // match move
0x80000000|881, // no-match move
0x80000000|46, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 1218
23,MIN_REDUCTION+132, // `[
74,52, // ws
75,163, // " "
76,24, // {10}
86,MIN_REDUCTION+132, // "["
MIN_REDUCTION+132, // (default reduction)
  }
,
{ // state 1219
0x80000000|1321, // match move
0x80000000|279, // no-match move
0x80000000|46, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 1220
MIN_REDUCTION+110, // (default reduction)
  }
,
{ // state 1221
MIN_REDUCTION+119, // (default reduction)
  }
,
{ // state 1222
23,MIN_REDUCTION+110, // `[
86,MIN_REDUCTION+110, // "["
MIN_REDUCTION+110, // (default reduction)
  }
,
{ // state 1223
103,MIN_REDUCTION+110, // $NT
MIN_REDUCTION+110, // (default reduction)
  }
,
{ // state 1224
74,1256, // ws
75,970, // " "
76,577, // {10}
MIN_REDUCTION+80, // (default reduction)
  }
,
{ // state 1225
17,411, // `)
81,585, // ")"
  }
,
{ // state 1226
23,MIN_REDUCTION+113, // `[
86,MIN_REDUCTION+113, // "["
MIN_REDUCTION+113, // (default reduction)
  }
,
{ // state 1227
MIN_REDUCTION+16, // (default reduction)
  }
,
{ // state 1228
-1, // $$start
-1, // <start>
-1, // ws*
-1, // <program>
-1, // <class decl>+
-1, // <class decl>
-1, // `class
238, // ID
845, // `{
-1, // <decl in class>*
-1, // `}
-1, // `extends
-1, // <decl in class>
-1, // <method decl>
-1, // `public
-1, // `void
853, // `(
-1, // `)
-1, // <stmt>*
209, // <type>
914, // `int
921, // `boolean
-1, // <empty bracket pair>
-1, // `[
-1, // `]
901, // <stmt>
1178, // <assign>
-1, // `;
529, // <local var decl>
622, // `if
467, // <exp>
-1, // `else
1132, // `while
832, // `for
-1, // `=
-1, // `++
638, // <exp8>
292, // <exp7>
406, // <exp6>
408, // <exp5>
1266, // <exp4>
-1, // `+
784, // <exp3>
-1, // `*
1036, // <exp2>
39, // <cast exp>
957, // <unary exp>
1117, // <exp1>
953, // `-
1000, // INTLIT
1267, // letter
809, // {"A".."Z" "a" "d" "g" "j".."k" "m".."n" "q".."s" "y".."z"}
809, // "p"
809, // "v"
809, // "c"
809, // "f"
809, // "i"
809, // "l"
809, // "o"
809, // "u"
809, // "x"
809, // "b"
809, // "e"
809, // "h"
809, // "t"
809, // "w"
796, // letter128
269, // {199..218 231..250}
269, // {193..198 225..230}
-1, // digit
923, // {"1".."9"}
1001, // "0"
496, // digit128
679, // {176..185}
-1, // ws
-1, // " "
-1, // {10}
396, // "#"
-1, // "+"
-1, // "*"
956, // "("
-1, // ")"
877, // "{"
-1, // "}"
1303, // "-"
-1, // "="
-1, // "["
-1, // "]"
-1, // ";"
-1, // "@"
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
{ // state 1229
16,273, // `(
80,16, // "("
  }
,
{ // state 1230
-1, // $$start
-1, // <start>
-1, // ws*
-1, // <program>
-1, // <class decl>+
-1, // <class decl>
-1, // `class
238, // ID
845, // `{
-1, // <decl in class>*
-1, // `}
-1, // `extends
-1, // <decl in class>
-1, // <method decl>
-1, // `public
-1, // `void
853, // `(
-1, // `)
-1, // <stmt>*
209, // <type>
914, // `int
921, // `boolean
-1, // <empty bracket pair>
-1, // `[
-1, // `]
1308, // <stmt>
1178, // <assign>
-1, // `;
529, // <local var decl>
622, // `if
467, // <exp>
-1, // `else
1132, // `while
832, // `for
-1, // `=
-1, // `++
638, // <exp8>
292, // <exp7>
406, // <exp6>
408, // <exp5>
1266, // <exp4>
-1, // `+
784, // <exp3>
-1, // `*
1036, // <exp2>
39, // <cast exp>
957, // <unary exp>
1117, // <exp1>
953, // `-
1000, // INTLIT
1267, // letter
809, // {"A".."Z" "a" "d" "g" "j".."k" "m".."n" "q".."s" "y".."z"}
809, // "p"
809, // "v"
809, // "c"
809, // "f"
809, // "i"
809, // "l"
809, // "o"
809, // "u"
809, // "x"
809, // "b"
809, // "e"
809, // "h"
809, // "t"
809, // "w"
796, // letter128
269, // {199..218 231..250}
269, // {193..198 225..230}
-1, // digit
923, // {"1".."9"}
1001, // "0"
496, // digit128
679, // {176..185}
-1, // ws
-1, // " "
-1, // {10}
396, // "#"
-1, // "+"
-1, // "*"
956, // "("
-1, // ")"
877, // "{"
-1, // "}"
1303, // "-"
-1, // "="
-1, // "["
-1, // "]"
-1, // ";"
-1, // "@"
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
{ // state 1231
23,MIN_REDUCTION+104, // `[
86,MIN_REDUCTION+104, // "["
103,MIN_REDUCTION+104, // $NT
MIN_REDUCTION+104, // (default reduction)
  }
,
{ // state 1232
MIN_REDUCTION+108, // (default reduction)
  }
,
{ // state 1233
0x80000000|1130, // match move
0x80000000|824, // no-match move
0x80000000|46, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 1234
MIN_REDUCTION+16, // (default reduction)
  }
,
{ // state 1235
0x80000000|859, // match move
0x80000000|1226, // no-match move
0x80000000|46, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 1236
-1, // $$start
-1, // <start>
-1, // ws*
-1, // <program>
-1, // <class decl>+
-1, // <class decl>
-1, // `class
238, // ID
845, // `{
-1, // <decl in class>*
-1, // `}
-1, // `extends
-1, // <decl in class>
-1, // <method decl>
-1, // `public
-1, // `void
853, // `(
-1, // `)
-1, // <stmt>*
209, // <type>
914, // `int
921, // `boolean
-1, // <empty bracket pair>
-1, // `[
-1, // `]
1297, // <stmt>
1178, // <assign>
-1, // `;
529, // <local var decl>
622, // `if
467, // <exp>
-1, // `else
1132, // `while
832, // `for
-1, // `=
-1, // `++
638, // <exp8>
292, // <exp7>
406, // <exp6>
408, // <exp5>
1266, // <exp4>
-1, // `+
784, // <exp3>
-1, // `*
1036, // <exp2>
39, // <cast exp>
957, // <unary exp>
1117, // <exp1>
953, // `-
1000, // INTLIT
1267, // letter
809, // {"A".."Z" "a" "d" "g" "j".."k" "m".."n" "q".."s" "y".."z"}
809, // "p"
809, // "v"
809, // "c"
809, // "f"
809, // "i"
809, // "l"
809, // "o"
809, // "u"
809, // "x"
809, // "b"
809, // "e"
809, // "h"
809, // "t"
809, // "w"
796, // letter128
269, // {199..218 231..250}
269, // {193..198 225..230}
-1, // digit
923, // {"1".."9"}
1001, // "0"
496, // digit128
679, // {176..185}
-1, // ws
-1, // " "
-1, // {10}
396, // "#"
-1, // "+"
-1, // "*"
956, // "("
-1, // ")"
877, // "{"
-1, // "}"
1303, // "-"
-1, // "="
-1, // "["
-1, // "]"
-1, // ";"
-1, // "@"
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
{ // state 1237
23,MIN_REDUCTION+98, // `[
86,MIN_REDUCTION+98, // "["
MIN_REDUCTION+98, // (default reduction)
  }
,
{ // state 1238
0x80000000|1331, // match move
0x80000000|1250, // no-match move
0x80000000|46, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 1239
23,MIN_REDUCTION+47, // `[
86,MIN_REDUCTION+47, // "["
103,MIN_REDUCTION+47, // $NT
MIN_REDUCTION+47, // (default reduction)
  }
,
{ // state 1240
MIN_REDUCTION+80, // (default reduction)
  }
,
{ // state 1241
MIN_REDUCTION+126, // (default reduction)
  }
,
{ // state 1242
0x80000000|1174, // match move
0x80000000|947, // no-match move
0x80000000|1146, // NT-test-match state for `else
  }
,
{ // state 1243
23,MIN_REDUCTION+98, // `[
86,MIN_REDUCTION+98, // "["
MIN_REDUCTION+98, // (default reduction)
  }
,
{ // state 1244
27,503, // `;
88,847, // ";"
  }
,
{ // state 1245
27,329, // `;
88,847, // ";"
  }
,
{ // state 1246
41,605, // `+
78,1270, // "+"
103,MIN_REDUCTION+32, // $NT
  }
,
{ // state 1247
MIN_REDUCTION+21, // (default reduction)
  }
,
{ // state 1248
0x80000000|1046, // match move
0x80000000|61, // no-match move
0x80000000|1146, // NT-test-match state for `else
  }
,
{ // state 1249
16,261, // `(
80,16, // "("
  }
,
{ // state 1250
23,MIN_REDUCTION+128, // `[
74,1154, // ws
75,943, // " "
76,1294, // {10}
86,MIN_REDUCTION+128, // "["
MIN_REDUCTION+128, // (default reduction)
  }
,
{ // state 1251
23,MIN_REDUCTION+110, // `[
86,MIN_REDUCTION+110, // "["
MIN_REDUCTION+110, // (default reduction)
  }
,
{ // state 1252
-1, // $$start
-1, // <start>
-1, // ws*
-1, // <program>
-1, // <class decl>+
-1, // <class decl>
-1, // `class
238, // ID
710, // `{
-1, // <decl in class>*
-1, // `}
-1, // `extends
-1, // <decl in class>
-1, // <method decl>
-1, // `public
-1, // `void
853, // `(
-1, // `)
-1, // <stmt>*
209, // <type>
914, // `int
921, // `boolean
-1, // <empty bracket pair>
-1, // `[
-1, // `]
364, // <stmt>
950, // <assign>
-1, // `;
402, // <local var decl>
1316, // `if
467, // <exp>
-1, // `else
392, // `while
893, // `for
-1, // `=
-1, // `++
638, // <exp8>
292, // <exp7>
406, // <exp6>
408, // <exp5>
1266, // <exp4>
-1, // `+
784, // <exp3>
-1, // `*
1036, // <exp2>
39, // <cast exp>
957, // <unary exp>
1117, // <exp1>
953, // `-
1000, // INTLIT
1267, // letter
809, // {"A".."Z" "a" "d" "g" "j".."k" "m".."n" "q".."s" "y".."z"}
809, // "p"
809, // "v"
809, // "c"
809, // "f"
809, // "i"
809, // "l"
809, // "o"
809, // "u"
809, // "x"
809, // "b"
809, // "e"
809, // "h"
809, // "t"
809, // "w"
796, // letter128
269, // {199..218 231..250}
269, // {193..198 225..230}
-1, // digit
923, // {"1".."9"}
1001, // "0"
496, // digit128
679, // {176..185}
-1, // ws
-1, // " "
-1, // {10}
396, // "#"
-1, // "+"
-1, // "*"
956, // "("
-1, // ")"
877, // "{"
-1, // "}"
1303, // "-"
-1, // "="
-1, // "["
-1, // "]"
-1, // ";"
-1, // "@"
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
{ // state 1253
0x80000000|1131, // match move
0x80000000|1122, // no-match move
0x80000000|46, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 1254
MIN_REDUCTION+50, // (default reduction)
  }
,
{ // state 1255
23,MIN_REDUCTION+98, // `[
86,MIN_REDUCTION+98, // "["
MIN_REDUCTION+98, // (default reduction)
  }
,
{ // state 1256
0x80000000|485, // match move
0x80000000|920, // no-match move
0x80000000|1146, // NT-test-match state for `else
  }
,
{ // state 1257
MIN_REDUCTION+127, // (default reduction)
  }
,
{ // state 1258
52,1149, // "p"
  }
,
{ // state 1259
MIN_REDUCTION+35, // (default reduction)
  }
,
{ // state 1260
MIN_REDUCTION+21, // (default reduction)
  }
,
{ // state 1261
2,225, // ws*
  }
,
{ // state 1262
MIN_REDUCTION+51, // (default reduction)
  }
,
{ // state 1263
27,342, // `;
88,847, // ";"
  }
,
{ // state 1264
23,MIN_REDUCTION+132, // `[
74,40, // ws
75,141, // " "
76,160, // {10}
86,MIN_REDUCTION+132, // "["
MIN_REDUCTION+132, // (default reduction)
  }
,
{ // state 1265
MIN_REDUCTION+50, // (default reduction)
  }
,
{ // state 1266
41,121, // `+
78,1270, // "+"
MIN_REDUCTION+32, // (default reduction)
  }
,
{ // state 1267
50,674, // letter
51,66, // {"A".."Z" "a" "d" "g" "j".."k" "m".."n" "q".."s" "y".."z"}
52,66, // "p"
53,66, // "v"
54,66, // "c"
55,66, // "f"
56,66, // "i"
57,66, // "l"
58,66, // "o"
59,66, // "u"
60,66, // "x"
61,66, // "b"
62,66, // "e"
63,66, // "h"
64,66, // "t"
65,66, // "w"
66,1105, // letter128
67,269, // {199..218 231..250}
68,269, // {193..198 225..230}
69,293, // digit
70,259, // {"1".."9"}
71,259, // "0"
72,318, // digit128
73,1253, // {176..185}
90,27, // idChar*
91,747, // $$0
96,528, // idChar
97,1232, // "_"
98,621, // idChar128
99,102, // {223}
  }
,
{ // state 1268
74,1277, // ws
75,990, // " "
76,566, // {10}
MIN_REDUCTION+80, // (default reduction)
  }
,
{ // state 1269
17,967, // `)
81,585, // ")"
  }
,
{ // state 1270
2,3, // ws*
74,1109, // ws
75,146, // " "
76,207, // {10}
MIN_REDUCTION+85, // (default reduction)
  }
,
{ // state 1271
MIN_REDUCTION+127, // (default reduction)
  }
,
{ // state 1272
23,MIN_REDUCTION+104, // `[
86,MIN_REDUCTION+104, // "["
MIN_REDUCTION+104, // (default reduction)
  }
,
{ // state 1273
-1, // $$start
-1, // <start>
-1, // ws*
-1, // <program>
-1, // <class decl>+
-1, // <class decl>
-1, // `class
238, // ID
713, // `{
-1, // <decl in class>*
-1, // `}
-1, // `extends
-1, // <decl in class>
-1, // <method decl>
-1, // `public
-1, // `void
853, // `(
-1, // `)
-1, // <stmt>*
209, // <type>
914, // `int
921, // `boolean
-1, // <empty bracket pair>
-1, // `[
-1, // `]
356, // <stmt>
1170, // <assign>
-1, // `;
370, // <local var decl>
678, // `if
467, // <exp>
-1, // `else
210, // `while
799, // `for
-1, // `=
-1, // `++
638, // <exp8>
292, // <exp7>
406, // <exp6>
408, // <exp5>
1266, // <exp4>
-1, // `+
784, // <exp3>
-1, // `*
1036, // <exp2>
39, // <cast exp>
957, // <unary exp>
1117, // <exp1>
953, // `-
1000, // INTLIT
1267, // letter
809, // {"A".."Z" "a" "d" "g" "j".."k" "m".."n" "q".."s" "y".."z"}
809, // "p"
809, // "v"
809, // "c"
809, // "f"
809, // "i"
809, // "l"
809, // "o"
809, // "u"
809, // "x"
809, // "b"
809, // "e"
809, // "h"
809, // "t"
809, // "w"
796, // letter128
269, // {199..218 231..250}
269, // {193..198 225..230}
-1, // digit
923, // {"1".."9"}
1001, // "0"
496, // digit128
679, // {176..185}
-1, // ws
-1, // " "
-1, // {10}
396, // "#"
-1, // "+"
-1, // "*"
956, // "("
-1, // ")"
877, // "{"
-1, // "}"
1303, // "-"
-1, // "="
-1, // "["
-1, // "]"
-1, // ";"
-1, // "@"
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
{ // state 1274
2,427, // ws*
74,1077, // ws
75,698, // " "
76,971, // {10}
MIN_REDUCTION+67, // (default reduction)
  }
,
{ // state 1275
MIN_REDUCTION+122, // (default reduction)
  }
,
{ // state 1276
0x80000000|752, // match move
0x80000000|322, // no-match move
0x80000000|46, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 1277
0x80000000|485, // match move
0x80000000|963, // no-match move
0x80000000|1146, // NT-test-match state for `else
  }
,
{ // state 1278
MIN_REDUCTION+35, // (default reduction)
  }
,
{ // state 1279
23,MIN_REDUCTION+44, // `[
86,MIN_REDUCTION+44, // "["
MIN_REDUCTION+44, // (default reduction)
  }
,
{ // state 1280
MIN_REDUCTION+115, // (default reduction)
  }
,
{ // state 1281
-1, // $$start
-1, // <start>
-1, // ws*
-1, // <program>
-1, // <class decl>+
-1, // <class decl>
-1, // `class
238, // ID
845, // `{
-1, // <decl in class>*
-1, // `}
-1, // `extends
-1, // <decl in class>
-1, // <method decl>
-1, // `public
-1, // `void
853, // `(
-1, // `)
-1, // <stmt>*
209, // <type>
914, // `int
921, // `boolean
-1, // <empty bracket pair>
-1, // `[
-1, // `]
716, // <stmt>
1178, // <assign>
-1, // `;
529, // <local var decl>
622, // `if
467, // <exp>
-1, // `else
1132, // `while
832, // `for
-1, // `=
-1, // `++
638, // <exp8>
292, // <exp7>
406, // <exp6>
408, // <exp5>
1266, // <exp4>
-1, // `+
784, // <exp3>
-1, // `*
1036, // <exp2>
39, // <cast exp>
957, // <unary exp>
1117, // <exp1>
953, // `-
1000, // INTLIT
1267, // letter
809, // {"A".."Z" "a" "d" "g" "j".."k" "m".."n" "q".."s" "y".."z"}
809, // "p"
809, // "v"
809, // "c"
809, // "f"
809, // "i"
809, // "l"
809, // "o"
809, // "u"
809, // "x"
809, // "b"
809, // "e"
809, // "h"
809, // "t"
809, // "w"
796, // letter128
269, // {199..218 231..250}
269, // {193..198 225..230}
-1, // digit
923, // {"1".."9"}
1001, // "0"
496, // digit128
679, // {176..185}
-1, // ws
-1, // " "
-1, // {10}
396, // "#"
-1, // "+"
-1, // "*"
956, // "("
-1, // ")"
877, // "{"
-1, // "}"
1303, // "-"
-1, // "="
-1, // "["
-1, // "]"
-1, // ";"
-1, // "@"
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
{ // state 1282
2,952, // ws*
74,417, // ws
75,970, // " "
76,577, // {10}
MIN_REDUCTION+81, // (default reduction)
  }
,
{ // state 1283
-1, // $$start
-1, // <start>
-1, // ws*
-1, // <program>
-1, // <class decl>+
-1, // <class decl>
-1, // `class
238, // ID
713, // `{
-1, // <decl in class>*
-1, // `}
-1, // `extends
-1, // <decl in class>
-1, // <method decl>
-1, // `public
-1, // `void
853, // `(
-1, // `)
-1, // <stmt>*
209, // <type>
914, // `int
921, // `boolean
-1, // <empty bracket pair>
-1, // `[
-1, // `]
309, // <stmt>
1170, // <assign>
-1, // `;
370, // <local var decl>
678, // `if
467, // <exp>
-1, // `else
210, // `while
799, // `for
-1, // `=
-1, // `++
638, // <exp8>
292, // <exp7>
406, // <exp6>
408, // <exp5>
1266, // <exp4>
-1, // `+
784, // <exp3>
-1, // `*
1036, // <exp2>
39, // <cast exp>
957, // <unary exp>
1117, // <exp1>
953, // `-
1000, // INTLIT
1267, // letter
809, // {"A".."Z" "a" "d" "g" "j".."k" "m".."n" "q".."s" "y".."z"}
809, // "p"
809, // "v"
809, // "c"
809, // "f"
809, // "i"
809, // "l"
809, // "o"
809, // "u"
809, // "x"
809, // "b"
809, // "e"
809, // "h"
809, // "t"
809, // "w"
796, // letter128
269, // {199..218 231..250}
269, // {193..198 225..230}
-1, // digit
923, // {"1".."9"}
1001, // "0"
496, // digit128
679, // {176..185}
-1, // ws
-1, // " "
-1, // {10}
396, // "#"
-1, // "+"
-1, // "*"
956, // "("
-1, // ")"
877, // "{"
-1, // "}"
1303, // "-"
-1, // "="
-1, // "["
-1, // "]"
-1, // ";"
-1, // "@"
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
{ // state 1284
16,522, // `(
80,617, // "("
  }
,
{ // state 1285
7,715, // ID
50,614, // letter
51,809, // {"A".."Z" "a" "d" "g" "j".."k" "m".."n" "q".."s" "y".."z"}
52,809, // "p"
53,809, // "v"
54,809, // "c"
55,809, // "f"
56,809, // "i"
57,809, // "l"
58,809, // "o"
59,809, // "u"
60,809, // "x"
61,809, // "b"
62,809, // "e"
63,809, // "h"
64,809, // "t"
65,809, // "w"
66,1138, // letter128
67,1033, // {199..218 231..250}
68,1033, // {193..198 225..230}
  }
,
{ // state 1286
2,933, // ws*
MIN_REDUCTION+93, // (default reduction)
  }
,
{ // state 1287
-1, // $$start
-1, // <start>
-1, // ws*
-1, // <program>
-1, // <class decl>+
-1, // <class decl>
-1, // `class
238, // ID
713, // `{
-1, // <decl in class>*
-1, // `}
-1, // `extends
-1, // <decl in class>
-1, // <method decl>
-1, // `public
-1, // `void
853, // `(
-1, // `)
-1, // <stmt>*
209, // <type>
914, // `int
921, // `boolean
-1, // <empty bracket pair>
-1, // `[
-1, // `]
432, // <stmt>
1170, // <assign>
-1, // `;
370, // <local var decl>
678, // `if
467, // <exp>
-1, // `else
210, // `while
799, // `for
-1, // `=
-1, // `++
638, // <exp8>
292, // <exp7>
406, // <exp6>
408, // <exp5>
1266, // <exp4>
-1, // `+
784, // <exp3>
-1, // `*
1036, // <exp2>
39, // <cast exp>
957, // <unary exp>
1117, // <exp1>
953, // `-
1000, // INTLIT
1267, // letter
809, // {"A".."Z" "a" "d" "g" "j".."k" "m".."n" "q".."s" "y".."z"}
809, // "p"
809, // "v"
809, // "c"
809, // "f"
809, // "i"
809, // "l"
809, // "o"
809, // "u"
809, // "x"
809, // "b"
809, // "e"
809, // "h"
809, // "t"
809, // "w"
796, // letter128
269, // {199..218 231..250}
269, // {193..198 225..230}
-1, // digit
923, // {"1".."9"}
1001, // "0"
496, // digit128
679, // {176..185}
-1, // ws
-1, // " "
-1, // {10}
396, // "#"
-1, // "+"
-1, // "*"
956, // "("
-1, // ")"
877, // "{"
-1, // "}"
1303, // "-"
-1, // "="
-1, // "["
-1, // "]"
-1, // ";"
-1, // "@"
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
{ // state 1288
0x80000000|750, // match move
0x80000000|951, // no-match move
0x80000000|46, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 1289
0x80000000|752, // match move
0x80000000|333, // no-match move
0x80000000|46, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 1290
0x80000000|1175, // match move
0x80000000|211, // no-match move
0x80000000|46, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 1291
MIN_REDUCTION+23, // (default reduction)
  }
,
{ // state 1292
74,62, // ws
75,1265, // " "
76,702, // {10}
MIN_REDUCTION+58, // (default reduction)
  }
,
{ // state 1293
2,1002, // ws*
74,399, // ws
75,990, // " "
76,566, // {10}
MIN_REDUCTION+81, // (default reduction)
  }
,
{ // state 1294
0x80000000|979, // match move
0x80000000|965, // no-match move
0x80000000|46, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 1295
MIN_REDUCTION+121, // (default reduction)
  }
,
{ // state 1296
0x80000000|1118, // match move
0x80000000|804, // no-match move
0x80000000|46, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 1297
17,791, // `)
81,585, // ")"
  }
,
{ // state 1298
0x80000000|169, // match move
0x80000000|598, // no-match move
0x80000000|1146, // NT-test-match state for `else
  }
,
{ // state 1299
23,MIN_REDUCTION+110, // `[
86,MIN_REDUCTION+110, // "["
MIN_REDUCTION+110, // (default reduction)
  }
,
{ // state 1300
0x80000000|1183, // match move
0x80000000|250, // no-match move
0x80000000|46, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 1301
0x80000000|918, // match move
0x80000000|942, // no-match move
0x80000000|46, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 1302
MIN_REDUCTION+110, // (default reduction)
  }
,
{ // state 1303
2,999, // ws*
74,334, // ws
75,412, // " "
76,410, // {10}
MIN_REDUCTION+83, // (default reduction)
  }
,
{ // state 1304
MIN_REDUCTION+18, // (default reduction)
  }
,
{ // state 1305
0x80000000|752, // match move
0x80000000|1034, // no-match move
0x80000000|46, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 1306
23,MIN_REDUCTION+104, // `[
86,MIN_REDUCTION+104, // "["
MIN_REDUCTION+104, // (default reduction)
  }
,
{ // state 1307
50,674, // letter
51,66, // {"A".."Z" "a" "d" "g" "j".."k" "m".."n" "q".."s" "y".."z"}
52,66, // "p"
53,66, // "v"
54,66, // "c"
55,66, // "f"
56,66, // "i"
57,66, // "l"
58,66, // "o"
59,66, // "u"
60,66, // "x"
61,66, // "b"
62,66, // "e"
63,66, // "h"
64,66, // "t"
65,66, // "w"
66,936, // letter128
67,656, // {199..218 231..250}
68,656, // {193..198 225..230}
69,293, // digit
70,259, // {"1".."9"}
71,259, // "0"
72,428, // digit128
73,635, // {176..185}
91,268, // $$0
96,1275, // idChar
97,1232, // "_"
98,822, // idChar128
99,704, // {223}
  }
,
{ // state 1308
17,861, // `)
81,585, // ")"
  }
,
{ // state 1309
0x80000000|1, // match move
0x80000000|359, // no-match move
0x80000000|46, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 1310
74,164, // ws
75,995, // " "
76,1025, // {10}
MIN_REDUCTION+74, // (default reduction)
  }
,
{ // state 1311
MIN_REDUCTION+110, // (default reduction)
  }
,
{ // state 1312
7,249, // ID
16,374, // `(
30,440, // <exp>
36,1177, // <exp8>
37,2, // <exp7>
38,341, // <exp6>
39,343, // <exp5>
40,63, // <exp4>
42,531, // <exp3>
44,54, // <exp2>
45,290, // <cast exp>
46,516, // <unary exp>
47,131, // <exp1>
48,862, // `-
49,445, // INTLIT
50,773, // letter
51,809, // {"A".."Z" "a" "d" "g" "j".."k" "m".."n" "q".."s" "y".."z"}
52,809, // "p"
53,809, // "v"
54,809, // "c"
55,809, // "f"
56,809, // "i"
57,809, // "l"
58,809, // "o"
59,809, // "u"
60,809, // "x"
61,809, // "b"
62,809, // "e"
63,809, // "h"
64,809, // "t"
65,809, // "w"
66,1199, // letter128
67,711, // {199..218 231..250}
68,711, // {193..198 225..230}
70,224, // {"1".."9"}
71,1037, // "0"
72,549, // digit128
73,1305, // {176..185}
80,956, // "("
84,1303, // "-"
  }
,
{ // state 1313
-1, // $$start
-1, // <start>
-1, // ws*
-1, // <program>
-1, // <class decl>+
-1, // <class decl>
-1, // `class
238, // ID
713, // `{
-1, // <decl in class>*
-1, // `}
-1, // `extends
-1, // <decl in class>
-1, // <method decl>
-1, // `public
-1, // `void
853, // `(
-1, // `)
-1, // <stmt>*
209, // <type>
914, // `int
921, // `boolean
-1, // <empty bracket pair>
-1, // `[
-1, // `]
701, // <stmt>
1170, // <assign>
-1, // `;
370, // <local var decl>
678, // `if
467, // <exp>
-1, // `else
210, // `while
799, // `for
-1, // `=
-1, // `++
638, // <exp8>
292, // <exp7>
406, // <exp6>
408, // <exp5>
1266, // <exp4>
-1, // `+
784, // <exp3>
-1, // `*
1036, // <exp2>
39, // <cast exp>
957, // <unary exp>
1117, // <exp1>
953, // `-
1000, // INTLIT
1267, // letter
809, // {"A".."Z" "a" "d" "g" "j".."k" "m".."n" "q".."s" "y".."z"}
809, // "p"
809, // "v"
809, // "c"
809, // "f"
809, // "i"
809, // "l"
809, // "o"
809, // "u"
809, // "x"
809, // "b"
809, // "e"
809, // "h"
809, // "t"
809, // "w"
796, // letter128
269, // {199..218 231..250}
269, // {193..198 225..230}
-1, // digit
923, // {"1".."9"}
1001, // "0"
496, // digit128
679, // {176..185}
-1, // ws
-1, // " "
-1, // {10}
396, // "#"
-1, // "+"
-1, // "*"
956, // "("
-1, // ")"
877, // "{"
-1, // "}"
1303, // "-"
-1, // "="
-1, // "["
-1, // "]"
-1, // ";"
-1, // "@"
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
{ // state 1314
0x80000000|252, // match move
0x80000000|608, // no-match move
0x80000000|1146, // NT-test-match state for `else
  }
,
{ // state 1315
0x80000000|450, // match move
0x80000000|41, // no-match move
0x80000000|46, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 1316
16,777, // `(
80,617, // "("
  }
,
{ // state 1317
-1, // $$start
-1, // <start>
-1, // ws*
-1, // <program>
-1, // <class decl>+
-1, // <class decl>
-1, // `class
238, // ID
50, // `{
-1, // <decl in class>*
-1, // `}
-1, // `extends
-1, // <decl in class>
-1, // <method decl>
-1, // `public
-1, // `void
853, // `(
-1, // `)
-1, // <stmt>*
209, // <type>
914, // `int
921, // `boolean
-1, // <empty bracket pair>
-1, // `[
-1, // `]
727, // <stmt>
1044, // <assign>
-1, // `;
26, // <local var decl>
241, // `if
467, // <exp>
-1, // `else
1318, // `while
184, // `for
-1, // `=
-1, // `++
638, // <exp8>
292, // <exp7>
406, // <exp6>
408, // <exp5>
1266, // <exp4>
-1, // `+
784, // <exp3>
-1, // `*
1036, // <exp2>
39, // <cast exp>
957, // <unary exp>
1117, // <exp1>
953, // `-
1000, // INTLIT
1267, // letter
809, // {"A".."Z" "a" "d" "g" "j".."k" "m".."n" "q".."s" "y".."z"}
809, // "p"
809, // "v"
809, // "c"
809, // "f"
809, // "i"
809, // "l"
809, // "o"
809, // "u"
809, // "x"
809, // "b"
809, // "e"
809, // "h"
809, // "t"
809, // "w"
796, // letter128
269, // {199..218 231..250}
269, // {193..198 225..230}
-1, // digit
923, // {"1".."9"}
1001, // "0"
496, // digit128
679, // {176..185}
-1, // ws
-1, // " "
-1, // {10}
396, // "#"
-1, // "+"
-1, // "*"
956, // "("
-1, // ")"
877, // "{"
-1, // "}"
1303, // "-"
-1, // "="
-1, // "["
-1, // "]"
-1, // ";"
-1, // "@"
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
{ // state 1318
16,1090, // `(
80,1065, // "("
  }
,
{ // state 1319
0x80000000|223, // match move
0x80000000|781, // no-match move
0x80000000|797, // NT-test-match state for <exp>
  }
,
{ // state 1320
0x80000000|1148, // match move
0x80000000|173, // no-match move
0x80000000|46, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 1321
103,MIN_REDUCTION+49, // $NT
MIN_REDUCTION+49, // (default reduction)
  }
,
{ // state 1322
23,MIN_REDUCTION+104, // `[
86,MIN_REDUCTION+104, // "["
MIN_REDUCTION+104, // (default reduction)
  }
,
{ // state 1323
MIN_REDUCTION+1, // (default reduction)
  }
,
{ // state 1324
23,MIN_REDUCTION+44, // `[
86,MIN_REDUCTION+44, // "["
MIN_REDUCTION+44, // (default reduction)
  }
,
{ // state 1325
0x80000000|676, // match move
0x80000000|785, // no-match move
0x80000000|1146, // NT-test-match state for `else
  }
,
{ // state 1326
MIN_REDUCTION+41, // (default reduction)
  }
,
{ // state 1327
74,554, // ws
75,394, // " "
76,226, // {10}
MIN_REDUCTION+80, // (default reduction)
  }
,
{ // state 1328
2,700, // ws*
MIN_REDUCTION+81, // (default reduction)
  }
,
{ // state 1329
-1, // $$start
-1, // <start>
-1, // ws*
-1, // <program>
-1, // <class decl>+
-1, // <class decl>
-1, // `class
238, // ID
51, // `{
-1, // <decl in class>*
-1, // `}
-1, // `extends
-1, // <decl in class>
-1, // <method decl>
-1, // `public
-1, // `void
853, // `(
-1, // `)
-1, // <stmt>*
209, // <type>
914, // `int
921, // `boolean
-1, // <empty bracket pair>
-1, // `[
-1, // `]
1195, // <stmt>
915, // <assign>
-1, // `;
755, // <local var decl>
1342, // `if
467, // <exp>
-1, // `else
470, // `while
653, // `for
-1, // `=
-1, // `++
638, // <exp8>
292, // <exp7>
406, // <exp6>
408, // <exp5>
1266, // <exp4>
-1, // `+
784, // <exp3>
-1, // `*
1036, // <exp2>
39, // <cast exp>
957, // <unary exp>
1117, // <exp1>
953, // `-
1000, // INTLIT
1267, // letter
809, // {"A".."Z" "a" "d" "g" "j".."k" "m".."n" "q".."s" "y".."z"}
809, // "p"
809, // "v"
809, // "c"
809, // "f"
809, // "i"
809, // "l"
809, // "o"
809, // "u"
809, // "x"
809, // "b"
809, // "e"
809, // "h"
809, // "t"
809, // "w"
796, // letter128
269, // {199..218 231..250}
269, // {193..198 225..230}
-1, // digit
923, // {"1".."9"}
1001, // "0"
496, // digit128
679, // {176..185}
-1, // ws
-1, // " "
-1, // {10}
396, // "#"
-1, // "+"
-1, // "*"
956, // "("
-1, // ")"
877, // "{"
-1, // "}"
1303, // "-"
-1, // "="
-1, // "["
-1, // "]"
-1, // ";"
-1, // "@"
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
{ // state 1330
MIN_REDUCTION+51, // (default reduction)
  }
,
{ // state 1331
MIN_REDUCTION+128, // (default reduction)
  }
,
{ // state 1332
16,491, // `(
80,617, // "("
  }
,
{ // state 1333
MIN_REDUCTION+19, // (default reduction)
  }
,
{ // state 1334
2,1179, // ws*
74,707, // ws
75,443, // " "
76,181, // {10}
MIN_REDUCTION+97, // (default reduction)
  }
,
{ // state 1335
0x80000000|661, // match move
0x80000000|763, // no-match move
0x80000000|1146, // NT-test-match state for `else
  }
,
{ // state 1336
103,MIN_REDUCTION+35, // $NT
MIN_REDUCTION+35, // (default reduction)
  }
,
{ // state 1337
-1, // $$start
-1, // <start>
-1, // ws*
-1, // <program>
-1, // <class decl>+
-1, // <class decl>
-1, // `class
238, // ID
710, // `{
-1, // <decl in class>*
539, // `}
-1, // `extends
-1, // <decl in class>
-1, // <method decl>
-1, // `public
-1, // `void
853, // `(
-1, // `)
-1, // <stmt>*
209, // <type>
914, // `int
921, // `boolean
-1, // <empty bracket pair>
-1, // `[
-1, // `]
838, // <stmt>
950, // <assign>
-1, // `;
402, // <local var decl>
1316, // `if
467, // <exp>
-1, // `else
392, // `while
893, // `for
-1, // `=
-1, // `++
638, // <exp8>
292, // <exp7>
406, // <exp6>
408, // <exp5>
1266, // <exp4>
-1, // `+
784, // <exp3>
-1, // `*
1036, // <exp2>
39, // <cast exp>
957, // <unary exp>
1117, // <exp1>
953, // `-
1000, // INTLIT
1267, // letter
809, // {"A".."Z" "a" "d" "g" "j".."k" "m".."n" "q".."s" "y".."z"}
809, // "p"
809, // "v"
809, // "c"
809, // "f"
809, // "i"
809, // "l"
809, // "o"
809, // "u"
809, // "x"
809, // "b"
809, // "e"
809, // "h"
809, // "t"
809, // "w"
796, // letter128
269, // {199..218 231..250}
269, // {193..198 225..230}
-1, // digit
923, // {"1".."9"}
1001, // "0"
496, // digit128
679, // {176..185}
-1, // ws
-1, // " "
-1, // {10}
396, // "#"
-1, // "+"
-1, // "*"
956, // "("
-1, // ")"
877, // "{"
1076, // "}"
1303, // "-"
-1, // "="
-1, // "["
-1, // "]"
-1, // ";"
-1, // "@"
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
{ // state 1338
MIN_REDUCTION+41, // (default reduction)
  }
,
{ // state 1339
2,451, // ws*
74,776, // ws
75,355, // " "
76,287, // {10}
MIN_REDUCTION+63, // (default reduction)
  }
,
{ // state 1340
23,MIN_REDUCTION+44, // `[
86,MIN_REDUCTION+44, // "["
MIN_REDUCTION+44, // (default reduction)
  }
,
{ // state 1341
MIN_REDUCTION+110, // (default reduction)
  }
,
{ // state 1342
16,977, // `(
80,617, // "("
  }
,
{ // state 1343
24,542, // `]
87,433, // "]"
  }
,
{ // state 1344
2,712, // ws*
MIN_REDUCTION+81, // (default reduction)
  }
,
{ // state 1345
MIN_REDUCTION+18, // (default reduction)
  }
,
};
}
public MJGrammarParseTable(MJGrammar actionObj) {
  actionObject = actionObj;
  parseTable = new int[1346][];
  int doneSoFar = 0;
  doneSoFar += new Initter1().doInit(doneSoFar);
  doneSoFar += new Initter2().doInit(doneSoFar);
  doneSoFar += new Initter3().doInit(doneSoFar);
  doneSoFar += new Initter4().doInit(doneSoFar);
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
// <stmt> ::= `for `( <stmt> `; <exp> `; <stmt> `) <stmt>
(25<<16)+9,
// <assign> ::= <exp> `= <exp>
(26<<16)+3,
// <assign> ::= <exp> `++
(26<<16)+2,
// <local var decl> ::= <type> ID `= <exp>
(28<<16)+4,
// <exp> ::= <exp8>
(30<<16)+1,
// <exp8> ::= <exp7>
(36<<16)+1,
// <exp7> ::= <exp6>
(37<<16)+1,
// <exp6> ::= <exp5>
(38<<16)+1,
// <exp5> ::= <exp4>
(39<<16)+1,
// <exp4> ::= <exp4> `+ <exp3>
(40<<16)+3,
// <exp4> ::= <exp3>
(40<<16)+1,
// <exp3> ::= <exp3> `* <exp2>
(42<<16)+3,
// <exp3> ::= <exp2>
(42<<16)+1,
// <exp2> ::= <cast exp>
(44<<16)+1,
// <exp2> ::= <unary exp>
(44<<16)+1,
// <cast exp> ::= `( <type> `) <cast exp>
(45<<16)+4,
// <cast exp> ::= `( <type> `) <exp1>
(45<<16)+4,
// <unary exp> ::= `- <unary exp>
(46<<16)+2,
// <unary exp> ::= <exp1>
(46<<16)+1,
// <exp1> ::= ID
(47<<16)+1,
// <exp1> ::= <exp1> !<empty bracket pair> `[ <exp> `]
(47<<16)+4,
// <exp1> ::= INTLIT
(47<<16)+1,
// letter ::= {"A".."Z" "a".."z"}
(50<<16)+1,
// letter128 ::= {193..218 225..250}
(66<<16)+1,
// digit ::= {"0".."9"}
(69<<16)+1,
// digit128 ::= {176..185}
(72<<16)+1,
// ws ::= " "
(74<<16)+1,
// ws ::= {10}
(74<<16)+1,
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
// `for ::= "#" "f" "o" ws*
(33<<16)+4,
// `for ::= "#" "f" "o"
(33<<16)+3,
// `public ::= "#" "p" "u" ws*
(14<<16)+4,
// `public ::= "#" "p" "u"
(14<<16)+3,
// `* ::= "*" ws*
(43<<16)+2,
// `* ::= "*"
(43<<16)+1,
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
(48<<16)+2,
// `- ::= "-"
(48<<16)+1,
// `+ ::= "+" ws*
(41<<16)+2,
// `+ ::= "+"
(41<<16)+1,
// `= ::= "=" ws*
(34<<16)+2,
// `= ::= "="
(34<<16)+1,
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
// `++ ::= "@" "+" ws*
(35<<16)+3,
// `++ ::= "@" "+"
(35<<16)+2,
// ID ::= letter128 ws*
(7<<16)+2,
// ID ::= letter128
(7<<16)+1,
// ID ::= letter idChar* $$0
(7<<16)+3,
// ID ::= letter $$0
(7<<16)+2,
// INTLIT ::= {"1".."9"} digit* $$1
(49<<16)+3,
// INTLIT ::= {"1".."9"} $$1
(49<<16)+2,
// INTLIT ::= digit128 ws*
(49<<16)+2,
// INTLIT ::= digit128
(49<<16)+1,
// INTLIT ::= "0" hexDigit* $$2
(49<<16)+3,
// INTLIT ::= "0" $$2
(49<<16)+2,
// idChar ::= letter
(96<<16)+1,
// idChar ::= digit
(96<<16)+1,
// idChar ::= "_"
(96<<16)+1,
// idChar128 ::= letter128
(98<<16)+1,
// idChar128 ::= digit128
(98<<16)+1,
// idChar128 ::= {223}
(98<<16)+1,
// hexDigit ::= {"0".."9" "A".."Z" "a".."z"}
(100<<16)+1,
// hexDigit128 ::= {176..185 193..198 225..230}
(101<<16)+1,
// digit* ::= digit* digit
(92<<16)+2,
// digit* ::= digit
(92<<16)+1,
// <decl in class>* ::= <decl in class>* <decl in class>
(9<<16)+2,
// <decl in class>* ::= <decl in class>
(9<<16)+1,
// hexDigit* ::= hexDigit* hexDigit
(94<<16)+2,
// hexDigit* ::= hexDigit
(94<<16)+1,
// <stmt>* ::= <stmt>* <stmt>
(18<<16)+2,
// <stmt>* ::= <stmt>
(18<<16)+1,
// idChar* ::= idChar* idChar
(90<<16)+2,
// idChar* ::= idChar
(90<<16)+1,
// <class decl>+ ::= <class decl>
(4<<16)+1,
// <class decl>+ ::= <class decl>+ <class decl>
(4<<16)+2,
// ws* ::= ws* ws
(2<<16)+2,
// ws* ::= ws
(2<<16)+1,
// $$0 ::= idChar128 ws*
(91<<16)+2,
// $$0 ::= idChar128
(91<<16)+1,
// $$1 ::= digit128 ws*
(93<<16)+2,
// $$1 ::= digit128
(93<<16)+1,
// $$2 ::= hexDigit128 ws*
(95<<16)+2,
// $$2 ::= hexDigit128
(95<<16)+1,
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
76, // 10
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
75, // " "
-1, // "!"
-1, // '"'
77, // "#"
-1, // "$"
-1, // "%"
-1, // "&"
-1, // "'"
80, // "("
81, // ")"
79, // "*"
78, // "+"
-1, // ","
84, // "-"
-1, // "."
-1, // "/"
71, // "0"
70, // "1"
70, // "2"
70, // "3"
70, // "4"
70, // "5"
70, // "6"
70, // "7"
70, // "8"
70, // "9"
-1, // ":"
88, // ";"
-1, // "<"
85, // "="
-1, // ">"
-1, // "?"
89, // "@"
51, // "A"
51, // "B"
51, // "C"
51, // "D"
51, // "E"
51, // "F"
51, // "G"
51, // "H"
51, // "I"
51, // "J"
51, // "K"
51, // "L"
51, // "M"
51, // "N"
51, // "O"
51, // "P"
51, // "Q"
51, // "R"
51, // "S"
51, // "T"
51, // "U"
51, // "V"
51, // "W"
51, // "X"
51, // "Y"
51, // "Z"
86, // "["
-1, // "\"
87, // "]"
-1, // "^"
97, // "_"
-1, // "`"
51, // "a"
61, // "b"
54, // "c"
51, // "d"
62, // "e"
55, // "f"
51, // "g"
63, // "h"
56, // "i"
51, // "j"
51, // "k"
57, // "l"
51, // "m"
51, // "n"
58, // "o"
52, // "p"
51, // "q"
51, // "r"
51, // "s"
64, // "t"
59, // "u"
53, // "v"
65, // "w"
60, // "x"
51, // "y"
51, // "z"
82, // "{"
-1, // "|"
83, // "}"
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
73, // 176
73, // 177
73, // 178
73, // 179
73, // 180
73, // 181
73, // 182
73, // 183
73, // 184
73, // 185
-1, // 186
-1, // 187
-1, // 188
-1, // 189
-1, // 190
-1, // 191
-1, // 192
68, // 193
68, // 194
68, // 195
68, // 196
68, // 197
68, // 198
67, // 199
67, // 200
67, // 201
67, // 202
67, // 203
67, // 204
67, // 205
67, // 206
67, // 207
67, // 208
67, // 209
67, // 210
67, // 211
67, // 212
67, // 213
67, // 214
67, // 215
67, // 216
67, // 217
67, // 218
-1, // 219
-1, // 220
-1, // 221
-1, // 222
99, // 223
-1, // 224
68, // 225
68, // 226
68, // 227
68, // 228
68, // 229
68, // 230
67, // 231
67, // 232
67, // 233
67, // 234
67, // 235
67, // 236
67, // 237
67, // 238
67, // 239
67, // 240
67, // 241
67, // 242
67, // 243
67, // 244
67, // 245
67, // 246
67, // 247
67, // 248
67, // 249
67, // 250
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
"", // 108
"", // 109
"", // 110
"", // 111
"", // 112
"", // 113
"digit* ::= digit* digit", // 114
"digit* ::= digit* digit", // 115
"<decl in class>* ::= <decl in class>* <decl in class>", // 116
"<decl in class>* ::= <decl in class>* <decl in class>", // 117
"hexDigit* ::= hexDigit* hexDigit", // 118
"hexDigit* ::= hexDigit* hexDigit", // 119
"<stmt>* ::= <stmt>* <stmt>", // 120
"<stmt>* ::= <stmt>* <stmt>", // 121
"idChar* ::= idChar* idChar", // 122
"idChar* ::= idChar* idChar", // 123
"<class decl>+ ::= <class decl>", // 124
"<class decl>+ ::= <class decl>+ <class decl>", // 125
"ws* ::= ws* ws", // 126
"ws* ::= ws* ws", // 127
"", // 128
"", // 129
"", // 130
"", // 131
"", // 132
"", // 133
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
    { // 24: <stmt> ::= `for [#] `( <stmt> `; <exp> `; <stmt> `) <stmt> @for_to_while(int,Statement,Exp,Statement,Statement)=>Statement
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
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
      ((14<<5)|0x5)/*methodCall:14*/,
    },
    { // 25: <assign> ::= <exp> [#] `= <exp> @assign(Exp,int,Exp)=>Statement
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((6<<5)|0x6)/*nullProductionAction:6*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((15<<5)|0x5)/*methodCall:15*/,
    },
    { // 26: <assign> ::= <exp> [#] `++ @increment(Exp,int)=>Statement
      ((1<<5)|0xe)/*popPos:1*/,
      ((6<<5)|0x6)/*nullProductionAction:6*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((16<<5)|0x5)/*methodCall:16*/,
    },
    { // 27: <local var decl> ::= <type> [#] ID `= <exp> @localVarDecl(Type,int,String,Exp)=>Statement
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((6<<5)|0x6)/*nullProductionAction:6*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((17<<5)|0x5)/*methodCall:17*/,
    },
    { // 28: <exp> ::= <exp8> @pass
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
    },
    { // 29: <exp8> ::= <exp7> @pass
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
    },
    { // 30: <exp7> ::= <exp6> @pass
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
    },
    { // 31: <exp6> ::= <exp5> @pass
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
    },
    { // 32: <exp5> ::= <exp4> @pass
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
    },
    { // 33: <exp4> ::= <exp4> [#] `+ <exp3> @newPlus(Exp,int,Exp)=>Exp
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((6<<5)|0x6)/*nullProductionAction:6*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((18<<5)|0x5)/*methodCall:18*/,
    },
    { // 34: <exp4> ::= <exp3> @pass
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
    },
    { // 35: <exp3> ::= <exp3> [#] `* <exp2> @newTimes(Exp,int,Exp)=>Exp
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((6<<5)|0x6)/*nullProductionAction:6*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((19<<5)|0x5)/*methodCall:19*/,
    },
    { // 36: <exp3> ::= <exp2> @pass
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
    },
    { // 37: <exp2> ::= <cast exp> @pass
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
    },
    { // 38: <exp2> ::= <unary exp> @pass
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
    },
    { // 39: <cast exp> ::= [#] `( <type> `) <cast exp> @newCast(int,Type,Exp)=>Exp
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((6<<5)|0x6)/*nullProductionAction:6*/,
      ((20<<5)|0x5)/*methodCall:20*/,
    },
    { // 40: <cast exp> ::= [#] `( <type> `) <exp1> @newCast(int,Type,Exp)=>Exp
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((6<<5)|0x6)/*nullProductionAction:6*/,
      ((20<<5)|0x5)/*methodCall:20*/,
    },
    { // 41: <unary exp> ::= [#] `- <unary exp> @newUnaryMinus(int,Exp)=>Exp
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((6<<5)|0x6)/*nullProductionAction:6*/,
      ((21<<5)|0x5)/*methodCall:21*/,
    },
    { // 42: <unary exp> ::= <exp1> @pass
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
    },
    { // 43: <exp1> ::= [#] ID @newIdentfierExp(int,String)=>Exp
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((6<<5)|0x6)/*nullProductionAction:6*/,
      ((22<<5)|0x5)/*methodCall:22*/,
    },
    { // 44: <exp1> ::= <exp1> !<empty bracket pair> [#] `[ <exp> `] @newArrayLookup(Exp,int,Exp)=>Exp
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((6<<5)|0x6)/*nullProductionAction:6*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((23<<5)|0x5)/*methodCall:23*/,
    },
    { // 45: <exp1> ::= [#] INTLIT @newIntegerLiteral(int,int)=>Exp
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((6<<5)|0x6)/*nullProductionAction:6*/,
      ((24<<5)|0x5)/*methodCall:24*/,
    },
    { // 46: letter ::= {"A".."Z" "a".."z"} @pass
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
    },
    { // 47: letter128 ::= {193..218 225..250} @sub128(char)=>char
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((25<<5)|0x5)/*methodCall:25*/,
    },
    { // 48: digit ::= {"0".."9"} @pass
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
    },
    { // 49: digit128 ::= {176..185} @sub128(char)=>char
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((25<<5)|0x5)/*methodCall:25*/,
    },
    { // 50: ws ::= " " @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 51: ws ::= {10} [registerNewline] @void
      ((7<<5)|0x6)/*nullProductionAction:7*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 52: `boolean ::= "#" "b" "o" ws* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((3<<5)|0x3)/*popOffPushBack:3*/,
    },
    { // 53: `boolean ::= "#" "b" "o" [ws*] @void
      ((3<<5)|0x6)/*nullProductionAction:3*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((3<<5)|0x3)/*popOffPushBack:3*/,
    },
    { // 54: `class ::= "#" "c" "l" ws* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((3<<5)|0x3)/*popOffPushBack:3*/,
    },
    { // 55: `class ::= "#" "c" "l" [ws*] @void
      ((3<<5)|0x6)/*nullProductionAction:3*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((3<<5)|0x3)/*popOffPushBack:3*/,
    },
    { // 56: `extends ::= "#" "e" "x" ws* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((3<<5)|0x3)/*popOffPushBack:3*/,
    },
    { // 57: `extends ::= "#" "e" "x" [ws*] @void
      ((3<<5)|0x6)/*nullProductionAction:3*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((3<<5)|0x3)/*popOffPushBack:3*/,
    },
    { // 58: `void ::= "#" "v" "o" ws* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((3<<5)|0x3)/*popOffPushBack:3*/,
    },
    { // 59: `void ::= "#" "v" "o" [ws*] @void
      ((3<<5)|0x6)/*nullProductionAction:3*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((3<<5)|0x3)/*popOffPushBack:3*/,
    },
    { // 60: `int ::= "#" "i" "t" ws* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((3<<5)|0x3)/*popOffPushBack:3*/,
    },
    { // 61: `int ::= "#" "i" "t" [ws*] @void
      ((3<<5)|0x6)/*nullProductionAction:3*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((3<<5)|0x3)/*popOffPushBack:3*/,
    },
    { // 62: `while ::= "#" "w" "h" ws* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((3<<5)|0x3)/*popOffPushBack:3*/,
    },
    { // 63: `while ::= "#" "w" "h" [ws*] @void
      ((3<<5)|0x6)/*nullProductionAction:3*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((3<<5)|0x3)/*popOffPushBack:3*/,
    },
    { // 64: `if ::= "#" "+" ws* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((2<<5)|0x3)/*popOffPushBack:2*/,
    },
    { // 65: `if ::= "#" "+" [ws*] @void
      ((3<<5)|0x6)/*nullProductionAction:3*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((2<<5)|0x3)/*popOffPushBack:2*/,
    },
    { // 66: `else ::= "#" "e" "l" ws* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((3<<5)|0x3)/*popOffPushBack:3*/,
    },
    { // 67: `else ::= "#" "e" "l" [ws*] @void
      ((3<<5)|0x6)/*nullProductionAction:3*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((3<<5)|0x3)/*popOffPushBack:3*/,
    },
    { // 68: `for ::= "#" "f" "o" ws* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((3<<5)|0x3)/*popOffPushBack:3*/,
    },
    { // 69: `for ::= "#" "f" "o" [ws*] @void
      ((3<<5)|0x6)/*nullProductionAction:3*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((3<<5)|0x3)/*popOffPushBack:3*/,
    },
    { // 70: `public ::= "#" "p" "u" ws* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((3<<5)|0x3)/*popOffPushBack:3*/,
    },
    { // 71: `public ::= "#" "p" "u" [ws*] @void
      ((3<<5)|0x6)/*nullProductionAction:3*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((3<<5)|0x3)/*popOffPushBack:3*/,
    },
    { // 72: `* ::= "*" ws* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 73: `* ::= "*" [ws*] @void
      ((3<<5)|0x6)/*nullProductionAction:3*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 74: `( ::= "(" ws* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 75: `( ::= "(" [ws*] @void
      ((3<<5)|0x6)/*nullProductionAction:3*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 76: `) ::= ")" ws* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 77: `) ::= ")" [ws*] @void
      ((3<<5)|0x6)/*nullProductionAction:3*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 78: `{ ::= "{" ws* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 79: `{ ::= "{" [ws*] @void
      ((3<<5)|0x6)/*nullProductionAction:3*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 80: `} ::= "}" ws* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 81: `} ::= "}" [ws*] @void
      ((3<<5)|0x6)/*nullProductionAction:3*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 82: `- ::= "-" ws* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 83: `- ::= "-" [ws*] @void
      ((3<<5)|0x6)/*nullProductionAction:3*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 84: `+ ::= "+" ws* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 85: `+ ::= "+" [ws*] @void
      ((3<<5)|0x6)/*nullProductionAction:3*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 86: `= ::= "=" ws* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 87: `= ::= "=" [ws*] @void
      ((3<<5)|0x6)/*nullProductionAction:3*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 88: `[ ::= "[" ws* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 89: `[ ::= "[" [ws*] @void
      ((3<<5)|0x6)/*nullProductionAction:3*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 90: `] ::= "]" ws* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 91: `] ::= "]" [ws*] @void
      ((3<<5)|0x6)/*nullProductionAction:3*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 92: `; ::= ";" ws* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 93: `; ::= ";" [ws*] @void
      ((3<<5)|0x6)/*nullProductionAction:3*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 94: `++ ::= "@" "+" ws* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((2<<5)|0x3)/*popOffPushBack:2*/,
    },
    { // 95: `++ ::= "@" "+" [ws*] @void
      ((3<<5)|0x6)/*nullProductionAction:3*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((2<<5)|0x3)/*popOffPushBack:2*/,
    },
    { // 96: ID ::= letter128 ws* @text
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x4)/*stringConcat:1*/,
    },
    { // 97: ID ::= letter128 [ws*] @text
      ((3<<5)|0x6)/*nullProductionAction:3*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x4)/*stringConcat:1*/,
    },
    { // 98: ID ::= letter idChar* $$0 @text
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((3<<5)|0x4)/*stringConcat:3*/,
    },
    { // 99: ID ::= letter [idChar*] $$0 @text
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((4<<5)|0x6)/*nullProductionAction:4*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((3<<5)|0x4)/*stringConcat:3*/,
    },
    { // 100: INTLIT ::= {"1".."9"} digit* $$1 @convertToInt(char,List<Character>,char)=>int
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((26<<5)|0x5)/*methodCall:26*/,
    },
    { // 101: INTLIT ::= {"1".."9"} [digit*] $$1 @convertToInt(char,List<Character>,char)=>int
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((5<<5)|0x6)/*nullProductionAction:5*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((26<<5)|0x5)/*methodCall:26*/,
    },
    { // 102: INTLIT ::= digit128 ws* @convertToInt(char)=>int
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((27<<5)|0x5)/*methodCall:27*/,
    },
    { // 103: INTLIT ::= digit128 [ws*] @convertToInt(char)=>int
      ((3<<5)|0x6)/*nullProductionAction:3*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((27<<5)|0x5)/*methodCall:27*/,
    },
    { // 104: INTLIT ::= "0" hexDigit* $$2 @convert16ToInt(char,List<Character>,char)=>int
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((28<<5)|0x5)/*methodCall:28*/,
    },
    { // 105: INTLIT ::= "0" [hexDigit*] $$2 @convert16ToInt(char,List<Character>,char)=>int
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((0<<5)|0x6)/*nullProductionAction:0*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((28<<5)|0x5)/*methodCall:28*/,
    },
    { // 106: idChar ::= letter @pass
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
    },
    { // 107: idChar ::= digit @pass
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
    },
    { // 108: idChar ::= "_" @pass
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
    },
    { // 109: idChar128 ::= letter128 @pass
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
    },
    { // 110: idChar128 ::= digit128 @pass
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
    },
    { // 111: idChar128 ::= {223} @underscore(char)=>char
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((29<<5)|0x5)/*methodCall:29*/,
    },
    { // 112: hexDigit ::= {"0".."9" "A".."Z" "a".."z"} @pass
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
    },
    { // 113: hexDigit128 ::= {176..185 193..198 225..230} @sub128(char)=>char
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((25<<5)|0x5)/*methodCall:25*/,
    },
    { // 114: digit* ::= digit* digit @append
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xb)/*append:1*/,
    },
    { // 115: digit* ::= [digit*] digit @append
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((5<<5)|0x6)/*nullProductionAction:5*/,
      ((1<<5)|0xb)/*append:1*/,
    },
    { // 116: <decl in class>* ::= <decl in class>* <decl in class> @append
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xb)/*append:1*/,
    },
    { // 117: <decl in class>* ::= [<decl in class>*] <decl in class> @append
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((2<<5)|0x6)/*nullProductionAction:2*/,
      ((1<<5)|0xb)/*append:1*/,
    },
    { // 118: hexDigit* ::= hexDigit* hexDigit @append
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xb)/*append:1*/,
    },
    { // 119: hexDigit* ::= [hexDigit*] hexDigit @append
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((0<<5)|0x6)/*nullProductionAction:0*/,
      ((1<<5)|0xb)/*append:1*/,
    },
    { // 120: <stmt>* ::= <stmt>* <stmt> @append
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xb)/*append:1*/,
    },
    { // 121: <stmt>* ::= [<stmt>*] <stmt> @append
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x6)/*nullProductionAction:1*/,
      ((1<<5)|0xb)/*append:1*/,
    },
    { // 122: idChar* ::= idChar* idChar @append
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xb)/*append:1*/,
    },
    { // 123: idChar* ::= [idChar*] idChar @append
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((4<<5)|0x6)/*nullProductionAction:4*/,
      ((1<<5)|0xb)/*append:1*/,
    },
    { // 124: <class decl>+ ::= <class decl> @singleList
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xa)/*singleList:1*/,
    },
    { // 125: <class decl>+ ::= <class decl>+ <class decl> @append
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xb)/*append:1*/,
    },
    { // 126: ws* ::= ws* ws @append
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
    },
    { // 127: ws* ::= [ws*] ws @append
      ((1<<5)|0xe)/*popPos:1*/,
      ((3<<5)|0x6)/*nullProductionAction:3*/,
    },
    { // 128: $$0 ::= idChar128 ws* @pass
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
    },
    { // 129: $$0 ::= idChar128 [ws*] @pass
      ((3<<5)|0x6)/*nullProductionAction:3*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
    },
    { // 130: $$1 ::= digit128 ws* @pass
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
    },
    { // 131: $$1 ::= digit128 [ws*] @pass
      ((3<<5)|0x6)/*nullProductionAction:3*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
    },
    { // 132: $$2 ::= hexDigit128 ws* @pass
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
    },
    { // 133: $$2 ::= hexDigit128 [ws*] @pass
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
      ((30<<5)|0x5)/*methodCall:30*/,
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
      int parm0 = (Integer)si.popPb();
      Statement parm1 = (Statement)si.popPb();
      Exp parm2 = (Exp)si.popPb();
      Statement parm3 = (Statement)si.popPb();
      Statement parm4 = (Statement)si.popPb();
      Statement result = actionObject.for_to_while(parm0,parm1,parm2,parm3,parm4);
      si.pushPb(result);
    }
    break;
    case 15: {
      Exp parm0 = (Exp)si.popPb();
      int parm1 = (Integer)si.popPb();
      Exp parm2 = (Exp)si.popPb();
      Statement result = actionObject.assign(parm0,parm1,parm2);
      si.pushPb(result);
    }
    break;
    case 16: {
      Exp parm0 = (Exp)si.popPb();
      int parm1 = (Integer)si.popPb();
      Statement result = actionObject.increment(parm0,parm1);
      si.pushPb(result);
    }
    break;
    case 17: {
      Type parm0 = (Type)si.popPb();
      int parm1 = (Integer)si.popPb();
      String parm2 = (String)si.popPb();
      Exp parm3 = (Exp)si.popPb();
      Statement result = actionObject.localVarDecl(parm0,parm1,parm2,parm3);
      si.pushPb(result);
    }
    break;
    case 18: {
      Exp parm0 = (Exp)si.popPb();
      int parm1 = (Integer)si.popPb();
      Exp parm2 = (Exp)si.popPb();
      Exp result = actionObject.newPlus(parm0,parm1,parm2);
      si.pushPb(result);
    }
    break;
    case 19: {
      Exp parm0 = (Exp)si.popPb();
      int parm1 = (Integer)si.popPb();
      Exp parm2 = (Exp)si.popPb();
      Exp result = actionObject.newTimes(parm0,parm1,parm2);
      si.pushPb(result);
    }
    break;
    case 20: {
      int parm0 = (Integer)si.popPb();
      Type parm1 = (Type)si.popPb();
      Exp parm2 = (Exp)si.popPb();
      Exp result = actionObject.newCast(parm0,parm1,parm2);
      si.pushPb(result);
    }
    break;
    case 21: {
      int parm0 = (Integer)si.popPb();
      Exp parm1 = (Exp)si.popPb();
      Exp result = actionObject.newUnaryMinus(parm0,parm1);
      si.pushPb(result);
    }
    break;
    case 22: {
      int parm0 = (Integer)si.popPb();
      String parm1 = (String)si.popPb();
      Exp result = actionObject.newIdentfierExp(parm0,parm1);
      si.pushPb(result);
    }
    break;
    case 23: {
      Exp parm0 = (Exp)si.popPb();
      int parm1 = (Integer)si.popPb();
      Exp parm2 = (Exp)si.popPb();
      Exp result = actionObject.newArrayLookup(parm0,parm1,parm2);
      si.pushPb(result);
    }
    break;
    case 24: {
      int parm0 = (Integer)si.popPb();
      int parm1 = (Integer)si.popPb();
      Exp result = actionObject.newIntegerLiteral(parm0,parm1);
      si.pushPb(result);
    }
    break;
    case 25: {
      char parm0 = (Character)si.popPb();
      char result = actionObject.sub128(parm0);
      si.pushPb(result);
    }
    break;
    case 26: {
      char parm0 = (Character)si.popPb();
      List<Character> parm1 = (List<Character>)si.popPb();
      char parm2 = (Character)si.popPb();
      int result = actionObject.convertToInt(parm0,parm1,parm2);
      si.pushPb(result);
    }
    break;
    case 27: {
      char parm0 = (Character)si.popPb();
      int result = actionObject.convertToInt(parm0);
      si.pushPb(result);
    }
    break;
    case 28: {
      char parm0 = (Character)si.popPb();
      List<Character> parm1 = (List<Character>)si.popPb();
      char parm2 = (Character)si.popPb();
      int result = actionObject.convert16ToInt(parm0,parm1,parm2);
      si.pushPb(result);
    }
    break;
    case 29: {
      char parm0 = (Character)si.popPb();
      char result = actionObject.underscore(parm0);
      si.pushPb(result);
    }
    break;
    case 30: {
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
"Statement for_to_while(int,Statement,Exp,Statement,Statement)",
"Statement assign(Exp,int,Exp)",
"Statement increment(Exp,int)",
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
5,1,
3,1,
2,1,
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
