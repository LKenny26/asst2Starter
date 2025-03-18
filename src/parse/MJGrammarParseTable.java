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
public int getEofSym() { return 100; }
public int getNttSym() { return 101; }
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
public int numSymbols() { return 102;}
private static final int MIN_REDUCTION = 1343;
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
1,612, // <start>
2,903, // ws*
3,886, // <program>
4,962, // <class decl>+
5,1091, // <class decl>
6,625, // `class
73,348, // ws
74,843, // " "
75,890, // {10}
76,833, // "#"
  }
,
{ // state 1
  }
,
{ // state 2
MIN_REDUCTION+28, // (default reduction)
  }
,
{ // state 3
73,991, // ws
74,147, // " "
75,207, // {10}
MIN_REDUCTION+83, // (default reduction)
  }
,
{ // state 4
7,236, // ID
16,482, // `(
30,1140, // <exp>
35,1051, // <exp8>
36,313, // <exp7>
37,36, // <exp6>
38,33, // <exp5>
39,164, // <exp4>
41,411, // <exp3>
43,11, // <exp2>
44,336, // <cast exp>
45,507, // <unary exp>
46,230, // <exp1>
47,859, // `-
48,478, // INTLIT
49,1033, // letter
50,816, // {"A".."Z" "a" "d" "g" "j".."k" "m".."n" "q".."s" "y".."z"}
51,816, // "p"
52,816, // "v"
53,816, // "c"
54,816, // "f"
55,816, // "i"
56,816, // "l"
57,816, // "o"
58,816, // "u"
59,816, // "x"
60,816, // "b"
61,816, // "e"
62,816, // "h"
63,816, // "t"
64,816, // "w"
65,1288, // letter128
66,752, // {199..218 231..250}
67,752, // {193..198 225..230}
69,298, // {"1".."9"}
70,1119, // "0"
71,597, // digit128
72,1269, // {176..185}
79,960, // "("
83,1296, // "-"
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
264, // ID
708, // `{
-1, // <decl in class>*
-1, // `}
-1, // `extends
-1, // <decl in class>
-1, // <method decl>
-1, // `public
-1, // `void
518, // `(
-1, // `)
-1, // <stmt>*
209, // <type>
924, // `int
930, // `boolean
-1, // <empty bracket pair>
-1, // `[
-1, // `]
864, // <stmt>
957, // <assign>
-1, // `;
401, // <local var decl>
1310, // `if
592, // <exp>
-1, // `else
390, // `while
905, // `for
-1, // `=
1153, // <exp8>
325, // <exp7>
19, // <exp6>
25, // <exp5>
101, // <exp4>
-1, // `+
483, // <exp3>
-1, // `*
78, // <exp2>
258, // <cast exp>
490, // <unary exp>
95, // <exp1>
854, // `-
461, // INTLIT
1239, // letter
816, // {"A".."Z" "a" "d" "g" "j".."k" "m".."n" "q".."s" "y".."z"}
816, // "p"
816, // "v"
816, // "c"
816, // "f"
816, // "i"
816, // "l"
816, // "o"
816, // "u"
816, // "x"
816, // "b"
816, // "e"
816, // "h"
816, // "t"
816, // "w"
374, // letter128
189, // {199..218 231..250}
189, // {193..198 225..230}
-1, // digit
269, // {"1".."9"}
1084, // "0"
591, // digit128
1279, // {176..185}
-1, // ws
-1, // " "
-1, // {10}
395, // "#"
-1, // "+"
-1, // "*"
960, // "("
-1, // ")"
887, // "{"
-1, // "}"
1296, // "-"
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
{ // state 6
0x80000000|1, // match move
0x80000000|642, // no-match move
0x80000000|47, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 7
49,676, // letter
50,67, // {"A".."Z" "a" "d" "g" "j".."k" "m".."n" "q".."s" "y".."z"}
51,67, // "p"
52,67, // "v"
53,67, // "c"
54,67, // "f"
55,67, // "i"
56,67, // "l"
57,67, // "o"
58,67, // "u"
59,67, // "x"
60,67, // "b"
61,67, // "e"
62,67, // "h"
63,67, // "t"
64,67, // "w"
65,1107, // letter128
66,828, // {199..218 231..250}
67,828, // {193..198 225..230}
68,290, // digit
69,253, // {"1".."9"}
70,253, // "0"
71,844, // digit128
72,1214, // {176..185}
89,546, // $$0
94,1268, // idChar
95,1227, // "_"
96,335, // idChar128
97,872, // {223}
  }
,
{ // state 8
0x80000000|1, // match move
0x80000000|1017, // no-match move
0x80000000|47, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 9
2,657, // ws*
73,848, // ws
74,744, // " "
75,1256, // {10}
MIN_REDUCTION+52, // (default reduction)
  }
,
{ // state 10
MIN_REDUCTION+20, // (default reduction)
  }
,
{ // state 11
MIN_REDUCTION+35, // (default reduction)
  }
,
{ // state 12
MIN_REDUCTION+106, // (default reduction)
  }
,
{ // state 13
101,MIN_REDUCTION+39, // $NT
  }
,
{ // state 14
0x80000000|89, // match move
0x80000000|743, // no-match move
0x80000000|47, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 15
MIN_REDUCTION+18, // (default reduction)
  }
,
{ // state 16
2,1045, // ws*
73,1077, // ws
74,697, // " "
75,976, // {10}
MIN_REDUCTION+74, // (default reduction)
  }
,
{ // state 17
0x80000000|424, // match move
0x80000000|399, // no-match move
0x80000000|47, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 18
MIN_REDUCTION+17, // (default reduction)
  }
,
{ // state 19
MIN_REDUCTION+29, // (default reduction)
  }
,
{ // state 20
-1, // $$start
-1, // <start>
-1, // ws*
-1, // <program>
-1, // <class decl>+
-1, // <class decl>
-1, // `class
264, // ID
708, // `{
-1, // <decl in class>*
931, // `}
-1, // `extends
-1, // <decl in class>
-1, // <method decl>
-1, // `public
-1, // `void
518, // `(
-1, // `)
-1, // <stmt>*
209, // <type>
924, // `int
930, // `boolean
-1, // <empty bracket pair>
-1, // `[
-1, // `]
847, // <stmt>
957, // <assign>
-1, // `;
401, // <local var decl>
1310, // `if
592, // <exp>
-1, // `else
390, // `while
905, // `for
-1, // `=
1153, // <exp8>
325, // <exp7>
19, // <exp6>
25, // <exp5>
101, // <exp4>
-1, // `+
483, // <exp3>
-1, // `*
78, // <exp2>
258, // <cast exp>
490, // <unary exp>
95, // <exp1>
854, // `-
461, // INTLIT
1239, // letter
816, // {"A".."Z" "a" "d" "g" "j".."k" "m".."n" "q".."s" "y".."z"}
816, // "p"
816, // "v"
816, // "c"
816, // "f"
816, // "i"
816, // "l"
816, // "o"
816, // "u"
816, // "x"
816, // "b"
816, // "e"
816, // "h"
816, // "t"
816, // "w"
374, // letter128
189, // {199..218 231..250}
189, // {193..198 225..230}
-1, // digit
269, // {"1".."9"}
1084, // "0"
591, // digit128
1279, // {176..185}
-1, // ws
-1, // " "
-1, // {10}
395, // "#"
-1, // "+"
-1, // "*"
960, // "("
-1, // ")"
887, // "{"
993, // "}"
1296, // "-"
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
{ // state 21
2,100, // ws*
73,634, // ws
74,1166, // " "
75,351, // {10}
MIN_REDUCTION+80, // (default reduction)
  }
,
{ // state 22
MIN_REDUCTION+30, // (default reduction)
  }
,
{ // state 23
0x80000000|422, // match move
0x80000000|393, // no-match move
0x80000000|47, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 24
MIN_REDUCTION+29, // (default reduction)
  }
,
{ // state 25
MIN_REDUCTION+30, // (default reduction)
  }
,
{ // state 26
73,558, // ws
74,392, // " "
75,226, // {10}
MIN_REDUCTION+91, // (default reduction)
  }
,
{ // state 27
2,1302, // ws*
23,MIN_REDUCTION+94, // `[
73,109, // ws
74,14, // " "
75,102, // {10}
85,MIN_REDUCTION+94, // "["
MIN_REDUCTION+94, // (default reduction)
  }
,
{ // state 28
0x80000000|1, // match move
0x80000000|942, // no-match move
0x80000000|47, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 29
23,MIN_REDUCTION+102, // `[
85,MIN_REDUCTION+102, // "["
MIN_REDUCTION+102, // (default reduction)
  }
,
{ // state 30
27,382, // `;
87,756, // ";"
  }
,
{ // state 31
23,MIN_REDUCTION+102, // `[
85,MIN_REDUCTION+102, // "["
MIN_REDUCTION+102, // (default reduction)
  }
,
{ // state 32
MIN_REDUCTION+25, // (default reduction)
  }
,
{ // state 33
MIN_REDUCTION+30, // (default reduction)
  }
,
{ // state 34
0x80000000|405, // match move
0x80000000|1124, // no-match move
0x80000000|1145, // NT-test-match state for `else
  }
,
{ // state 35
23,MIN_REDUCTION+102, // `[
85,MIN_REDUCTION+102, // "["
MIN_REDUCTION+102, // (default reduction)
  }
,
{ // state 36
MIN_REDUCTION+29, // (default reduction)
  }
,
{ // state 37
23,MIN_REDUCTION+108, // `[
85,MIN_REDUCTION+108, // "["
101,MIN_REDUCTION+108, // $NT
MIN_REDUCTION+108, // (default reduction)
  }
,
{ // state 38
0x80000000|405, // match move
0x80000000|1132, // no-match move
0x80000000|1145, // NT-test-match state for `else
  }
,
{ // state 39
0x80000000|1, // match move
0x80000000|1005, // no-match move
0x80000000|47, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 40
73,551, // ws
74,350, // " "
75,282, // {10}
MIN_REDUCTION+91, // (default reduction)
  }
,
{ // state 41
0x80000000|1, // match move
0x80000000|1009, // no-match move
0x80000000|47, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 42
23,MIN_REDUCTION+129, // `[
73,318, // ws
74,90, // " "
75,99, // {10}
85,MIN_REDUCTION+129, // "["
101,MIN_REDUCTION+129, // $NT
MIN_REDUCTION+129, // (default reduction)
  }
,
{ // state 43
73,572, // ws
74,961, // " "
75,988, // {10}
MIN_REDUCTION+77, // (default reduction)
  }
,
{ // state 44
MIN_REDUCTION+49, // (default reduction)
  }
,
{ // state 45
MIN_REDUCTION+95, // (default reduction)
  }
,
{ // state 46
49,676, // letter
50,67, // {"A".."Z" "a" "d" "g" "j".."k" "m".."n" "q".."s" "y".."z"}
51,67, // "p"
52,67, // "v"
53,67, // "c"
54,67, // "f"
55,67, // "i"
56,67, // "l"
57,67, // "o"
58,67, // "u"
59,67, // "x"
60,67, // "b"
61,67, // "e"
62,67, // "h"
63,67, // "t"
64,67, // "w"
65,547, // letter128
66,189, // {199..218 231..250}
67,189, // {193..198 225..230}
68,290, // digit
69,253, // {"1".."9"}
70,253, // "0"
71,1230, // digit128
72,159, // {176..185}
89,723, // $$0
94,1268, // idChar
95,1227, // "_"
96,636, // idChar128
97,589, // {223}
  }
,
{ // state 47
23,1123, // `[
85,895, // "["
  }
,
{ // state 48
101,MIN_REDUCTION+49, // $NT
  }
,
{ // state 49
2,1313, // ws*
MIN_REDUCTION+74, // (default reduction)
  }
,
{ // state 50
MIN_REDUCTION+19, // (default reduction)
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
264, // ID
708, // `{
-1, // <decl in class>*
418, // `}
-1, // `extends
-1, // <decl in class>
-1, // <method decl>
-1, // `public
-1, // `void
518, // `(
-1, // `)
849, // <stmt>*
209, // <type>
924, // `int
930, // `boolean
-1, // <empty bracket pair>
-1, // `[
-1, // `]
1287, // <stmt>
957, // <assign>
-1, // `;
401, // <local var decl>
1310, // `if
592, // <exp>
-1, // `else
390, // `while
905, // `for
-1, // `=
1153, // <exp8>
325, // <exp7>
19, // <exp6>
25, // <exp5>
101, // <exp4>
-1, // `+
483, // <exp3>
-1, // `*
78, // <exp2>
258, // <cast exp>
490, // <unary exp>
95, // <exp1>
854, // `-
461, // INTLIT
1239, // letter
816, // {"A".."Z" "a" "d" "g" "j".."k" "m".."n" "q".."s" "y".."z"}
816, // "p"
816, // "v"
816, // "c"
816, // "f"
816, // "i"
816, // "l"
816, // "o"
816, // "u"
816, // "x"
816, // "b"
816, // "e"
816, // "h"
816, // "t"
816, // "w"
374, // letter128
189, // {199..218 231..250}
189, // {193..198 225..230}
-1, // digit
269, // {"1".."9"}
1084, // "0"
591, // digit128
1279, // {176..185}
-1, // ws
-1, // " "
-1, // {10}
395, // "#"
-1, // "+"
-1, // "*"
960, // "("
-1, // ")"
887, // "{"
511, // "}"
1296, // "-"
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
{ // state 52
-1, // $$start
-1, // <start>
-1, // ws*
-1, // <program>
-1, // <class decl>+
-1, // <class decl>
-1, // `class
264, // ID
708, // `{
-1, // <decl in class>*
418, // `}
-1, // `extends
-1, // <decl in class>
-1, // <method decl>
-1, // `public
-1, // `void
518, // `(
-1, // `)
1332, // <stmt>*
209, // <type>
924, // `int
930, // `boolean
-1, // <empty bracket pair>
-1, // `[
-1, // `]
1287, // <stmt>
957, // <assign>
-1, // `;
401, // <local var decl>
1310, // `if
592, // <exp>
-1, // `else
390, // `while
905, // `for
-1, // `=
1153, // <exp8>
325, // <exp7>
19, // <exp6>
25, // <exp5>
101, // <exp4>
-1, // `+
483, // <exp3>
-1, // `*
78, // <exp2>
258, // <cast exp>
490, // <unary exp>
95, // <exp1>
854, // `-
461, // INTLIT
1239, // letter
816, // {"A".."Z" "a" "d" "g" "j".."k" "m".."n" "q".."s" "y".."z"}
816, // "p"
816, // "v"
816, // "c"
816, // "f"
816, // "i"
816, // "l"
816, // "o"
816, // "u"
816, // "x"
816, // "b"
816, // "e"
816, // "h"
816, // "t"
816, // "w"
374, // letter128
189, // {199..218 231..250}
189, // {193..198 225..230}
-1, // digit
269, // {"1".."9"}
1084, // "0"
591, // digit128
1279, // {176..185}
-1, // ws
-1, // " "
-1, // {10}
395, // "#"
-1, // "+"
-1, // "*"
960, // "("
-1, // ")"
887, // "{"
1076, // "}"
1296, // "-"
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
{ // state 53
0x80000000|1, // match move
0x80000000|979, // no-match move
0x80000000|47, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 54
24,750, // `]
86,852, // "]"
  }
,
{ // state 55
MIN_REDUCTION+35, // (default reduction)
  }
,
{ // state 56
MIN_REDUCTION+106, // (default reduction)
  }
,
{ // state 57
0x80000000|1, // match move
0x80000000|663, // no-match move
0x80000000|47, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 58
0x80000000|1, // match move
0x80000000|665, // no-match move
0x80000000|47, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 59
7,236, // ID
16,482, // `(
30,429, // <exp>
35,1051, // <exp8>
36,313, // <exp7>
37,36, // <exp6>
38,33, // <exp5>
39,164, // <exp4>
41,411, // <exp3>
43,11, // <exp2>
44,336, // <cast exp>
45,507, // <unary exp>
46,230, // <exp1>
47,859, // `-
48,478, // INTLIT
49,1033, // letter
50,816, // {"A".."Z" "a" "d" "g" "j".."k" "m".."n" "q".."s" "y".."z"}
51,816, // "p"
52,816, // "v"
53,816, // "c"
54,816, // "f"
55,816, // "i"
56,816, // "l"
57,816, // "o"
58,816, // "u"
59,816, // "x"
60,816, // "b"
61,816, // "e"
62,816, // "h"
63,816, // "t"
64,816, // "w"
65,1288, // letter128
66,752, // {199..218 231..250}
67,752, // {193..198 225..230}
69,298, // {"1".."9"}
70,1119, // "0"
71,597, // digit128
72,1269, // {176..185}
79,960, // "("
83,1296, // "-"
  }
,
{ // state 60
7,218, // ID
16,523, // `(
30,949, // <exp>
35,1156, // <exp8>
36,320, // <exp7>
37,24, // <exp6>
38,22, // <exp5>
39,138, // <exp4>
41,480, // <exp3>
43,83, // <exp2>
44,256, // <cast exp>
45,491, // <unary exp>
46,111, // <exp1>
47,851, // `-
48,465, // INTLIT
49,972, // letter
50,816, // {"A".."Z" "a" "d" "g" "j".."k" "m".."n" "q".."s" "y".."z"}
51,816, // "p"
52,816, // "v"
53,816, // "c"
54,816, // "f"
55,816, // "i"
56,816, // "l"
57,816, // "o"
58,816, // "u"
59,816, // "x"
60,816, // "b"
61,816, // "e"
62,816, // "h"
63,816, // "t"
64,816, // "w"
65,1229, // letter128
66,735, // {199..218 231..250}
67,735, // {193..198 225..230}
69,272, // {"1".."9"}
70,1080, // "0"
71,593, // digit128
72,1282, // {176..185}
79,960, // "("
83,1296, // "-"
  }
,
{ // state 61
73,1236, // ws
74,1018, // " "
75,998, // {10}
MIN_REDUCTION+91, // (default reduction)
  }
,
{ // state 62
MIN_REDUCTION+16, // (default reduction)
  }
,
{ // state 63
MIN_REDUCTION+123, // (default reduction)
  }
,
{ // state 64
40,531, // `+
77,1263, // "+"
MIN_REDUCTION+31, // (default reduction)
  }
,
{ // state 65
0x80000000|867, // match move
0x80000000|432, // no-match move
0x80000000|47, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 66
27,1225, // `;
87,857, // ";"
  }
,
{ // state 67
MIN_REDUCTION+45, // (default reduction)
  }
,
{ // state 68
7,236, // ID
16,482, // `(
30,1157, // <exp>
35,1051, // <exp8>
36,313, // <exp7>
37,36, // <exp6>
38,33, // <exp5>
39,164, // <exp4>
41,411, // <exp3>
43,11, // <exp2>
44,336, // <cast exp>
45,507, // <unary exp>
46,230, // <exp1>
47,859, // `-
48,478, // INTLIT
49,1033, // letter
50,816, // {"A".."Z" "a" "d" "g" "j".."k" "m".."n" "q".."s" "y".."z"}
51,816, // "p"
52,816, // "v"
53,816, // "c"
54,816, // "f"
55,816, // "i"
56,816, // "l"
57,816, // "o"
58,816, // "u"
59,816, // "x"
60,816, // "b"
61,816, // "e"
62,816, // "h"
63,816, // "t"
64,816, // "w"
65,1288, // letter128
66,752, // {199..218 231..250}
67,752, // {193..198 225..230}
69,298, // {"1".."9"}
70,1119, // "0"
71,597, // digit128
72,1269, // {176..185}
79,960, // "("
83,1296, // "-"
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
264, // ID
708, // `{
-1, // <decl in class>*
944, // `}
-1, // `extends
-1, // <decl in class>
-1, // <method decl>
-1, // `public
-1, // `void
518, // `(
-1, // `)
-1, // <stmt>*
209, // <type>
924, // `int
930, // `boolean
-1, // <empty bracket pair>
-1, // `[
-1, // `]
847, // <stmt>
957, // <assign>
-1, // `;
401, // <local var decl>
1310, // `if
592, // <exp>
-1, // `else
390, // `while
905, // `for
-1, // `=
1153, // <exp8>
325, // <exp7>
19, // <exp6>
25, // <exp5>
101, // <exp4>
-1, // `+
483, // <exp3>
-1, // `*
78, // <exp2>
258, // <cast exp>
490, // <unary exp>
95, // <exp1>
854, // `-
461, // INTLIT
1239, // letter
816, // {"A".."Z" "a" "d" "g" "j".."k" "m".."n" "q".."s" "y".."z"}
816, // "p"
816, // "v"
816, // "c"
816, // "f"
816, // "i"
816, // "l"
816, // "o"
816, // "u"
816, // "x"
816, // "b"
816, // "e"
816, // "h"
816, // "t"
816, // "w"
374, // letter128
189, // {199..218 231..250}
189, // {193..198 225..230}
-1, // digit
269, // {"1".."9"}
1084, // "0"
591, // digit128
1279, // {176..185}
-1, // ws
-1, // " "
-1, // {10}
395, // "#"
-1, // "+"
-1, // "*"
960, // "("
-1, // ")"
887, // "{"
1010, // "}"
1296, // "-"
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
{ // state 70
MIN_REDUCTION+95, // (default reduction)
  }
,
{ // state 71
101,MIN_REDUCTION+30, // $NT
  }
,
{ // state 72
0x80000000|487, // match move
0x80000000|755, // no-match move
0x80000000|1145, // NT-test-match state for `else
  }
,
{ // state 73
23,MIN_REDUCTION+102, // `[
85,MIN_REDUCTION+102, // "["
101,MIN_REDUCTION+102, // $NT
MIN_REDUCTION+102, // (default reduction)
  }
,
{ // state 74
101,MIN_REDUCTION+29, // $NT
  }
,
{ // state 75
7,236, // ID
16,482, // `(
30,1220, // <exp>
35,1051, // <exp8>
36,313, // <exp7>
37,36, // <exp6>
38,33, // <exp5>
39,164, // <exp4>
41,411, // <exp3>
43,11, // <exp2>
44,336, // <cast exp>
45,507, // <unary exp>
46,230, // <exp1>
47,859, // `-
48,478, // INTLIT
49,1033, // letter
50,816, // {"A".."Z" "a" "d" "g" "j".."k" "m".."n" "q".."s" "y".."z"}
51,816, // "p"
52,816, // "v"
53,816, // "c"
54,816, // "f"
55,816, // "i"
56,816, // "l"
57,816, // "o"
58,816, // "u"
59,816, // "x"
60,816, // "b"
61,816, // "e"
62,816, // "h"
63,816, // "t"
64,816, // "w"
65,1288, // letter128
66,752, // {199..218 231..250}
67,752, // {193..198 225..230}
69,298, // {"1".."9"}
70,1119, // "0"
71,597, // digit128
72,1269, // {176..185}
79,960, // "("
83,1296, // "-"
  }
,
{ // state 76
8,1112, // `{
81,1058, // "{"
  }
,
{ // state 77
2,664, // ws*
73,848, // ws
74,744, // " "
75,1256, // {10}
MIN_REDUCTION+60, // (default reduction)
  }
,
{ // state 78
MIN_REDUCTION+35, // (default reduction)
  }
,
{ // state 79
73,874, // ws
74,316, // " "
75,342, // {10}
MIN_REDUCTION+69, // (default reduction)
  }
,
{ // state 80
42,467, // `*
78,1150, // "*"
101,MIN_REDUCTION+32, // $NT
MIN_REDUCTION+32, // (default reduction)
  }
,
{ // state 81
7,236, // ID
16,482, // `(
30,400, // <exp>
35,1051, // <exp8>
36,313, // <exp7>
37,36, // <exp6>
38,33, // <exp5>
39,164, // <exp4>
41,411, // <exp3>
43,11, // <exp2>
44,336, // <cast exp>
45,507, // <unary exp>
46,230, // <exp1>
47,859, // `-
48,478, // INTLIT
49,1033, // letter
50,816, // {"A".."Z" "a" "d" "g" "j".."k" "m".."n" "q".."s" "y".."z"}
51,816, // "p"
52,816, // "v"
53,816, // "c"
54,816, // "f"
55,816, // "i"
56,816, // "l"
57,816, // "o"
58,816, // "u"
59,816, // "x"
60,816, // "b"
61,816, // "e"
62,816, // "h"
63,816, // "t"
64,816, // "w"
65,1288, // letter128
66,752, // {199..218 231..250}
67,752, // {193..198 225..230}
69,298, // {"1".."9"}
70,1119, // "0"
71,597, // digit128
72,1269, // {176..185}
79,960, // "("
83,1296, // "-"
  }
,
{ // state 82
27,1015, // `;
87,1097, // ";"
  }
,
{ // state 83
MIN_REDUCTION+35, // (default reduction)
  }
,
{ // state 84
27,1232, // `;
87,857, // ";"
  }
,
{ // state 85
0x80000000|802, // match move
0x80000000|472, // no-match move
0x80000000|47, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 86
0x80000000|416, // match move
0x80000000|902, // no-match move
0x80000000|47, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 87
0x80000000|436, // match move
0x80000000|427, // no-match move
0x80000000|47, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 88
101,MIN_REDUCTION+110, // $NT
MIN_REDUCTION+110, // (default reduction)
  }
,
{ // state 89
MIN_REDUCTION+49, // (default reduction)
  }
,
{ // state 90
0x80000000|48, // match move
0x80000000|1103, // no-match move
0x80000000|47, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 91
0x80000000|799, // match move
0x80000000|596, // no-match move
0x80000000|1145, // NT-test-match state for `else
  }
,
{ // state 92
73,1041, // ws
74,1179, // " "
75,827, // {10}
MIN_REDUCTION+51, // (default reduction)
  }
,
{ // state 93
2,751, // ws*
MIN_REDUCTION+92, // (default reduction)
  }
,
{ // state 94
0x80000000|1, // match move
0x80000000|1233, // no-match move
0x80000000|47, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 95
0x80000000|1, // match move
0x80000000|790, // no-match move
0x80000000|47, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 96
MIN_REDUCTION+96, // (default reduction)
  }
,
{ // state 97
MIN_REDUCTION+123, // (default reduction)
  }
,
{ // state 98
0x80000000|135, // match move
0x80000000|567, // no-match move
0x80000000|47, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 99
0x80000000|617, // match move
0x80000000|1022, // no-match move
0x80000000|47, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 100
73,115, // ws
74,1166, // " "
75,351, // {10}
MIN_REDUCTION+79, // (default reduction)
  }
,
{ // state 101
40,503, // `+
77,1263, // "+"
MIN_REDUCTION+31, // (default reduction)
  }
,
{ // state 102
0x80000000|984, // match move
0x80000000|260, // no-match move
0x80000000|47, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 103
23,MIN_REDUCTION+129, // `[
73,8, // ws
74,126, // " "
75,123, // {10}
85,MIN_REDUCTION+129, // "["
MIN_REDUCTION+129, // (default reduction)
  }
,
{ // state 104
17,1307, // `)
80,588, // ")"
  }
,
{ // state 105
23,MIN_REDUCTION+95, // `[
85,MIN_REDUCTION+95, // "["
101,MIN_REDUCTION+95, // $NT
MIN_REDUCTION+95, // (default reduction)
  }
,
{ // state 106
0x80000000|1, // match move
0x80000000|1249, // no-match move
0x80000000|47, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 107
0x80000000|1, // match move
0x80000000|1252, // no-match move
0x80000000|47, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 108
2,26, // ws*
73,764, // ws
74,392, // " "
75,226, // {10}
MIN_REDUCTION+92, // (default reduction)
  }
,
{ // state 109
0x80000000|932, // match move
0x80000000|517, // no-match move
0x80000000|47, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 110
MIN_REDUCTION+124, // (default reduction)
  }
,
{ // state 111
0x80000000|1, // match move
0x80000000|767, // no-match move
0x80000000|47, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 112
2,730, // ws*
MIN_REDUCTION+92, // (default reduction)
  }
,
{ // state 113
101,MIN_REDUCTION+95, // $NT
  }
,
{ // state 114
17,1273, // `)
80,588, // ")"
  }
,
{ // state 115
MIN_REDUCTION+123, // (default reduction)
  }
,
{ // state 116
0x80000000|888, // match move
0x80000000|632, // no-match move
0x80000000|801, // NT-test-match state for <exp>
  }
,
{ // state 117
49,676, // letter
50,67, // {"A".."Z" "a" "d" "g" "j".."k" "m".."n" "q".."s" "y".."z"}
51,67, // "p"
52,67, // "v"
53,67, // "c"
54,67, // "f"
55,67, // "i"
56,67, // "l"
57,67, // "o"
58,67, // "u"
59,67, // "x"
60,67, // "b"
61,67, // "e"
62,67, // "h"
63,67, // "t"
64,67, // "w"
65,1184, // letter128
66,709, // {199..218 231..250}
67,709, // {193..198 225..230}
68,290, // digit
69,253, // {"1".."9"}
70,253, // "0"
71,791, // digit128
72,1298, // {176..185}
89,94, // $$0
94,1268, // idChar
95,1227, // "_"
96,137, // idChar128
97,947, // {223}
  }
,
{ // state 118
0x80000000|1, // match move
0x80000000|1238, // no-match move
0x80000000|47, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 119
MIN_REDUCTION+19, // (default reduction)
  }
,
{ // state 120
0x80000000|655, // match move
0x80000000|216, // no-match move
0x80000000|47, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 121
49,676, // letter
50,67, // {"A".."Z" "a" "d" "g" "j".."k" "m".."n" "q".."s" "y".."z"}
51,67, // "p"
52,67, // "v"
53,67, // "c"
54,67, // "f"
55,67, // "i"
56,67, // "l"
57,67, // "o"
58,67, // "u"
59,67, // "x"
60,67, // "b"
61,67, // "e"
62,67, // "h"
63,67, // "t"
64,67, // "w"
65,943, // letter128
66,658, // {199..218 231..250}
67,658, // {193..198 225..230}
68,290, // digit
69,253, // {"1".."9"}
70,253, // "0"
71,426, // digit128
72,638, // {176..185}
88,1301, // idChar*
89,817, // $$0
94,532, // idChar
95,1227, // "_"
96,831, // idChar128
97,702, // {223}
  }
,
{ // state 122
MIN_REDUCTION+12, // (default reduction)
  }
,
{ // state 123
0x80000000|1, // match move
0x80000000|889, // no-match move
0x80000000|47, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 124
42,435, // `*
78,1150, // "*"
MIN_REDUCTION+32, // (default reduction)
  }
,
{ // state 125
17,MIN_REDUCTION+123, // `)
80,MIN_REDUCTION+123, // ")"
MIN_REDUCTION+123, // (default reduction)
  }
,
{ // state 126
0x80000000|1, // match move
0x80000000|300, // no-match move
0x80000000|47, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 127
49,676, // letter
50,67, // {"A".."Z" "a" "d" "g" "j".."k" "m".."n" "q".."s" "y".."z"}
51,67, // "p"
52,67, // "v"
53,67, // "c"
54,67, // "f"
55,67, // "i"
56,67, // "l"
57,67, // "o"
58,67, // "u"
59,67, // "x"
60,67, // "b"
61,67, // "e"
62,67, // "h"
63,67, // "t"
64,67, // "w"
65,1056, // letter128
66,752, // {199..218 231..250}
67,752, // {193..198 225..230}
68,290, // digit
69,253, // {"1".."9"}
70,253, // "0"
71,800, // digit128
72,1269, // {176..185}
89,118, // $$0
94,1268, // idChar
95,1227, // "_"
96,87, // idChar128
97,825, // {223}
  }
,
{ // state 128
42,443, // `*
78,1150, // "*"
MIN_REDUCTION+32, // (default reduction)
  }
,
{ // state 129
MIN_REDUCTION+96, // (default reduction)
  }
,
{ // state 130
0x80000000|1, // match move
0x80000000|841, // no-match move
0x80000000|47, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 131
101,MIN_REDUCTION+35, // $NT
MIN_REDUCTION+35, // (default reduction)
  }
,
{ // state 132
59,981, // "x"
  }
,
{ // state 133
2,40, // ws*
73,783, // ws
74,350, // " "
75,282, // {10}
MIN_REDUCTION+92, // (default reduction)
  }
,
{ // state 134
2,1069, // ws*
73,251, // ws
74,1179, // " "
75,827, // {10}
MIN_REDUCTION+94, // (default reduction)
  }
,
{ // state 135
101,MIN_REDUCTION+89, // $NT
  }
,
{ // state 136
0x80000000|1, // match move
0x80000000|838, // no-match move
0x80000000|47, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 137
0x80000000|397, // match move
0x80000000|543, // no-match move
0x80000000|47, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 138
40,516, // `+
77,1263, // "+"
MIN_REDUCTION+31, // (default reduction)
  }
,
{ // state 139
0x80000000|1, // match move
0x80000000|294, // no-match move
0x80000000|47, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 140
17,555, // `)
80,588, // ")"
  }
,
{ // state 141
49,676, // letter
50,67, // {"A".."Z" "a" "d" "g" "j".."k" "m".."n" "q".."s" "y".."z"}
51,67, // "p"
52,67, // "v"
53,67, // "c"
54,67, // "f"
55,67, // "i"
56,67, // "l"
57,67, // "o"
58,67, // "u"
59,67, // "x"
60,67, // "b"
61,67, // "e"
62,67, // "h"
63,67, // "t"
64,67, // "w"
65,1044, // letter128
66,737, // {199..218 231..250}
67,737, // {193..198 225..230}
68,290, // digit
69,253, // {"1".."9"}
70,253, // "0"
71,815, // digit128
72,1279, // {176..185}
89,107, // $$0
94,1268, // idChar
95,1227, // "_"
96,23, // idChar128
97,814, // {223}
  }
,
{ // state 142
0x80000000|1, // match move
0x80000000|292, // no-match move
0x80000000|47, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 143
49,676, // letter
50,67, // {"A".."Z" "a" "d" "g" "j".."k" "m".."n" "q".."s" "y".."z"}
51,67, // "p"
52,67, // "v"
53,67, // "c"
54,67, // "f"
55,67, // "i"
56,67, // "l"
57,67, // "o"
58,67, // "u"
59,67, // "x"
60,67, // "b"
61,67, // "e"
62,67, // "h"
63,67, // "t"
64,67, // "w"
65,1047, // letter128
66,735, // {199..218 231..250}
67,735, // {193..198 225..230}
68,290, // digit
69,253, // {"1".."9"}
70,253, // "0"
71,812, // digit128
72,1282, // {176..185}
89,106, // $$0
94,1268, // idChar
95,1227, // "_"
96,17, // idChar128
97,811, // {223}
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
264, // ID
759, // `{
-1, // <decl in class>*
-1, // `}
-1, // `extends
-1, // <decl in class>
-1, // <method decl>
-1, // `public
-1, // `void
518, // `(
-1, // `)
-1, // <stmt>*
209, // <type>
924, // `int
930, // `boolean
-1, // <empty bracket pair>
-1, // `[
-1, // `]
38, // <stmt>
787, // <assign>
-1, // `;
1093, // <local var decl>
985, // `if
592, // <exp>
-1, // `else
726, // `while
177, // `for
-1, // `=
1153, // <exp8>
325, // <exp7>
19, // <exp6>
25, // <exp5>
101, // <exp4>
-1, // `+
483, // <exp3>
-1, // `*
78, // <exp2>
258, // <cast exp>
490, // <unary exp>
95, // <exp1>
854, // `-
461, // INTLIT
1239, // letter
816, // {"A".."Z" "a" "d" "g" "j".."k" "m".."n" "q".."s" "y".."z"}
816, // "p"
816, // "v"
816, // "c"
816, // "f"
816, // "i"
816, // "l"
816, // "o"
816, // "u"
816, // "x"
816, // "b"
816, // "e"
816, // "h"
816, // "t"
816, // "w"
374, // letter128
189, // {199..218 231..250}
189, // {193..198 225..230}
-1, // digit
269, // {"1".."9"}
1084, // "0"
591, // digit128
1279, // {176..185}
-1, // ws
-1, // " "
-1, // {10}
395, // "#"
-1, // "+"
-1, // "*"
960, // "("
-1, // ")"
887, // "{"
-1, // "}"
1296, // "-"
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
{ // state 145
-1, // $$start
-1, // <start>
-1, // ws*
-1, // <program>
-1, // <class decl>+
-1, // <class decl>
-1, // `class
264, // ID
855, // `{
-1, // <decl in class>*
-1, // `}
-1, // `extends
-1, // <decl in class>
-1, // <method decl>
-1, // `public
-1, // `void
518, // `(
-1, // `)
-1, // <stmt>*
209, // <type>
924, // `int
930, // `boolean
-1, // <empty bracket pair>
-1, // `[
-1, // `]
1262, // <stmt>
1176, // <assign>
-1, // `;
533, // <local var decl>
624, // `if
592, // <exp>
-1, // `else
1131, // `while
840, // `for
-1, // `=
1153, // <exp8>
325, // <exp7>
19, // <exp6>
25, // <exp5>
101, // <exp4>
-1, // `+
483, // <exp3>
-1, // `*
78, // <exp2>
258, // <cast exp>
490, // <unary exp>
95, // <exp1>
854, // `-
461, // INTLIT
1239, // letter
816, // {"A".."Z" "a" "d" "g" "j".."k" "m".."n" "q".."s" "y".."z"}
816, // "p"
816, // "v"
816, // "c"
816, // "f"
816, // "i"
816, // "l"
816, // "o"
816, // "u"
816, // "x"
816, // "b"
816, // "e"
816, // "h"
816, // "t"
816, // "w"
374, // letter128
189, // {199..218 231..250}
189, // {193..198 225..230}
-1, // digit
269, // {"1".."9"}
1084, // "0"
591, // digit128
1279, // {176..185}
-1, // ws
-1, // " "
-1, // {10}
395, // "#"
-1, // "+"
-1, // "*"
960, // "("
-1, // ")"
887, // "{"
-1, // "}"
1296, // "-"
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
{ // state 146
23,MIN_REDUCTION+46, // `[
85,MIN_REDUCTION+46, // "["
MIN_REDUCTION+46, // (default reduction)
  }
,
{ // state 147
MIN_REDUCTION+49, // (default reduction)
  }
,
{ // state 148
101,MIN_REDUCTION+99, // $NT
  }
,
{ // state 149
2,1302, // ws*
MIN_REDUCTION+94, // (default reduction)
  }
,
{ // state 150
MIN_REDUCTION+106, // (default reduction)
  }
,
{ // state 151
-1, // $$start
-1, // <start>
-1, // ws*
-1, // <program>
-1, // <class decl>+
-1, // <class decl>
-1, // `class
264, // ID
711, // `{
-1, // <decl in class>*
-1, // `}
-1, // `extends
-1, // <decl in class>
-1, // <method decl>
-1, // `public
-1, // `void
518, // `(
-1, // `)
-1, // <stmt>*
209, // <type>
924, // `int
930, // `boolean
-1, // <empty bracket pair>
-1, // `[
-1, // `]
703, // <stmt>
1167, // <assign>
-1, // `;
366, // <local var decl>
680, // `if
592, // <exp>
-1, // `else
210, // `while
803, // `for
-1, // `=
1153, // <exp8>
325, // <exp7>
19, // <exp6>
25, // <exp5>
101, // <exp4>
-1, // `+
483, // <exp3>
-1, // `*
78, // <exp2>
258, // <cast exp>
490, // <unary exp>
95, // <exp1>
854, // `-
461, // INTLIT
1239, // letter
816, // {"A".."Z" "a" "d" "g" "j".."k" "m".."n" "q".."s" "y".."z"}
816, // "p"
816, // "v"
816, // "c"
816, // "f"
816, // "i"
816, // "l"
816, // "o"
816, // "u"
816, // "x"
816, // "b"
816, // "e"
816, // "h"
816, // "t"
816, // "w"
374, // letter128
189, // {199..218 231..250}
189, // {193..198 225..230}
-1, // digit
269, // {"1".."9"}
1084, // "0"
591, // digit128
1279, // {176..185}
-1, // ws
-1, // " "
-1, // {10}
395, // "#"
-1, // "+"
-1, // "*"
960, // "("
-1, // ")"
887, // "{"
-1, // "}"
1296, // "-"
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
{ // state 152
MIN_REDUCTION+124, // (default reduction)
  }
,
{ // state 153
42,428, // `*
78,1150, // "*"
MIN_REDUCTION+32, // (default reduction)
  }
,
{ // state 154
73,72, // ws
74,91, // " "
75,1170, // {10}
MIN_REDUCTION+79, // (default reduction)
  }
,
{ // state 155
73,63, // ws
74,1259, // " "
75,700, // {10}
MIN_REDUCTION+55, // (default reduction)
  }
,
{ // state 156
-1, // $$start
-1, // <start>
-1, // ws*
-1, // <program>
-1, // <class decl>+
-1, // <class decl>
-1, // `class
264, // ID
731, // `{
-1, // <decl in class>*
-1, // `}
-1, // `extends
-1, // <decl in class>
-1, // <method decl>
-1, // `public
-1, // `void
518, // `(
-1, // `)
-1, // <stmt>*
209, // <type>
924, // `int
930, // `boolean
-1, // <empty bracket pair>
-1, // `[
-1, // `]
34, // <stmt>
691, // <assign>
-1, // `;
1106, // <local var decl>
920, // `if
592, // <exp>
-1, // `else
701, // `while
208, // `for
-1, // `=
1153, // <exp8>
325, // <exp7>
19, // <exp6>
25, // <exp5>
101, // <exp4>
-1, // `+
483, // <exp3>
-1, // `*
78, // <exp2>
258, // <cast exp>
490, // <unary exp>
95, // <exp1>
854, // `-
461, // INTLIT
1239, // letter
816, // {"A".."Z" "a" "d" "g" "j".."k" "m".."n" "q".."s" "y".."z"}
816, // "p"
816, // "v"
816, // "c"
816, // "f"
816, // "i"
816, // "l"
816, // "o"
816, // "u"
816, // "x"
816, // "b"
816, // "e"
816, // "h"
816, // "t"
816, // "w"
374, // letter128
189, // {199..218 231..250}
189, // {193..198 225..230}
-1, // digit
269, // {"1".."9"}
1084, // "0"
591, // digit128
1279, // {176..185}
-1, // ws
-1, // " "
-1, // {10}
395, // "#"
-1, // "+"
-1, // "*"
960, // "("
-1, // ")"
887, // "{"
-1, // "}"
1296, // "-"
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
{ // state 157
2,1294, // ws*
101,MIN_REDUCTION+126, // $NT
  }
,
{ // state 158
0x80000000|1, // match move
0x80000000|896, // no-match move
0x80000000|47, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 159
0x80000000|1130, // match move
0x80000000|1293, // no-match move
0x80000000|47, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 160
17,994, // `)
80,608, // ")"
  }
,
{ // state 161
0x80000000|1, // match move
0x80000000|268, // no-match move
0x80000000|47, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 162
0x80000000|1, // match move
0x80000000|892, // no-match move
0x80000000|47, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 163
MIN_REDUCTION+123, // (default reduction)
  }
,
{ // state 164
40,476, // `+
77,1263, // "+"
MIN_REDUCTION+31, // (default reduction)
  }
,
{ // state 165
63,77, // "t"
  }
,
{ // state 166
MIN_REDUCTION+49, // (default reduction)
  }
,
{ // state 167
23,MIN_REDUCTION+46, // `[
85,MIN_REDUCTION+46, // "["
MIN_REDUCTION+46, // (default reduction)
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
264, // ID
708, // `{
-1, // <decl in class>*
797, // `}
-1, // `extends
-1, // <decl in class>
-1, // <method decl>
-1, // `public
-1, // `void
518, // `(
-1, // `)
-1, // <stmt>*
209, // <type>
924, // `int
930, // `boolean
-1, // <empty bracket pair>
-1, // `[
-1, // `]
847, // <stmt>
957, // <assign>
-1, // `;
401, // <local var decl>
1310, // `if
592, // <exp>
-1, // `else
390, // `while
905, // `for
-1, // `=
1153, // <exp8>
325, // <exp7>
19, // <exp6>
25, // <exp5>
101, // <exp4>
-1, // `+
483, // <exp3>
-1, // `*
78, // <exp2>
258, // <cast exp>
490, // <unary exp>
95, // <exp1>
854, // `-
461, // INTLIT
1239, // letter
816, // {"A".."Z" "a" "d" "g" "j".."k" "m".."n" "q".."s" "y".."z"}
816, // "p"
816, // "v"
816, // "c"
816, // "f"
816, // "i"
816, // "l"
816, // "o"
816, // "u"
816, // "x"
816, // "b"
816, // "e"
816, // "h"
816, // "t"
816, // "w"
374, // letter128
189, // {199..218 231..250}
189, // {193..198 225..230}
-1, // digit
269, // {"1".."9"}
1084, // "0"
591, // digit128
1279, // {176..185}
-1, // ws
-1, // " "
-1, // {10}
395, // "#"
-1, // "+"
-1, // "*"
960, // "("
-1, // ")"
887, // "{"
600, // "}"
1296, // "-"
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
{ // state 169
31,541, // `else
76,475, // "#"
  }
,
{ // state 170
27,402, // `;
87,1320, // ";"
  }
,
{ // state 171
23,MIN_REDUCTION+98, // `[
85,MIN_REDUCTION+98, // "["
MIN_REDUCTION+98, // (default reduction)
  }
,
{ // state 172
17,1034, // `)
80,588, // ")"
  }
,
{ // state 173
0x80000000|537, // match move
0x80000000|245, // no-match move
0x80000000|47, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 174
2,1043, // ws*
23,MIN_REDUCTION+128, // `[
73,1128, // ws
74,161, // " "
75,28, // {10}
85,MIN_REDUCTION+128, // "["
MIN_REDUCTION+128, // (default reduction)
  }
,
{ // state 175
0x80000000|540, // match move
0x80000000|247, // no-match move
0x80000000|47, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 176
42,368, // `*
78,1150, // "*"
MIN_REDUCTION+32, // (default reduction)
  }
,
{ // state 177
16,1281, // `(
79,16, // "("
  }
,
{ // state 178
0x80000000|414, // match move
0x80000000|970, // no-match move
0x80000000|1145, // NT-test-match state for `else
  }
,
{ // state 179
0x80000000|112, // match move
0x80000000|1011, // no-match move
0x80000000|1145, // NT-test-match state for `else
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
264, // ID
708, // `{
-1, // <decl in class>*
1061, // `}
-1, // `extends
-1, // <decl in class>
-1, // <method decl>
-1, // `public
-1, // `void
518, // `(
-1, // `)
-1, // <stmt>*
209, // <type>
924, // `int
930, // `boolean
-1, // <empty bracket pair>
-1, // `[
-1, // `]
847, // <stmt>
957, // <assign>
-1, // `;
401, // <local var decl>
1310, // `if
592, // <exp>
-1, // `else
390, // `while
905, // `for
-1, // `=
1153, // <exp8>
325, // <exp7>
19, // <exp6>
25, // <exp5>
101, // <exp4>
-1, // `+
483, // <exp3>
-1, // `*
78, // <exp2>
258, // <cast exp>
490, // <unary exp>
95, // <exp1>
854, // `-
461, // INTLIT
1239, // letter
816, // {"A".."Z" "a" "d" "g" "j".."k" "m".."n" "q".."s" "y".."z"}
816, // "p"
816, // "v"
816, // "c"
816, // "f"
816, // "i"
816, // "l"
816, // "o"
816, // "u"
816, // "x"
816, // "b"
816, // "e"
816, // "h"
816, // "t"
816, // "w"
374, // letter128
189, // {199..218 231..250}
189, // {193..198 225..230}
-1, // digit
269, // {"1".."9"}
1084, // "0"
591, // digit128
1279, // {176..185}
-1, // ws
-1, // " "
-1, // {10}
395, // "#"
-1, // "+"
-1, // "*"
960, // "("
-1, // ")"
887, // "{"
1071, // "}"
1296, // "-"
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
{ // state 181
2,439, // ws*
MIN_REDUCTION+126, // (default reduction)
  }
,
{ // state 182
MIN_REDUCTION+50, // (default reduction)
  }
,
{ // state 183
27,412, // `;
87,1330, // ";"
  }
,
{ // state 184
2,6, // ws*
23,MIN_REDUCTION+90, // `[
73,1138, // ws
74,126, // " "
75,123, // {10}
85,MIN_REDUCTION+90, // "["
MIN_REDUCTION+90, // (default reduction)
  }
,
{ // state 185
16,873, // `(
79,16, // "("
  }
,
{ // state 186
0x80000000|1, // match move
0x80000000|485, // no-match move
0x80000000|47, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 187
2,280, // ws*
  }
,
{ // state 188
0x80000000|1, // match move
0x80000000|488, // no-match move
0x80000000|47, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 189
0x80000000|1040, // match move
0x80000000|990, // no-match move
0x80000000|47, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 190
MIN_REDUCTION+50, // (default reduction)
  }
,
{ // state 191
50,1066, // {"A".."Z" "a" "d" "g" "j".."k" "m".."n" "q".."s" "y".."z"}
51,1066, // "p"
52,1066, // "v"
53,1066, // "c"
54,1066, // "f"
55,1066, // "i"
56,1066, // "l"
57,1066, // "o"
58,1066, // "u"
59,1066, // "x"
60,1066, // "b"
61,1066, // "e"
62,1066, // "h"
63,1066, // "t"
64,1066, // "w"
67,314, // {193..198 225..230}
69,1066, // {"1".."9"}
70,1066, // "0"
72,314, // {176..185}
92,853, // hexDigit*
93,459, // $$2
98,1216, // hexDigit
99,824, // hexDigit128
  }
,
{ // state 192
0x80000000|556, // match move
0x80000000|1341, // no-match move
0x80000000|1145, // NT-test-match state for `else
  }
,
{ // state 193
MIN_REDUCTION+96, // (default reduction)
  }
,
{ // state 194
31,760, // `else
76,475, // "#"
  }
,
{ // state 195
MIN_REDUCTION+5, // (default reduction)
  }
,
{ // state 196
49,676, // letter
50,67, // {"A".."Z" "a" "d" "g" "j".."k" "m".."n" "q".."s" "y".."z"}
51,67, // "p"
52,67, // "v"
53,67, // "c"
54,67, // "f"
55,67, // "i"
56,67, // "l"
57,67, // "o"
58,67, // "u"
59,67, // "x"
60,67, // "b"
61,67, // "e"
62,67, // "h"
63,67, // "t"
64,67, // "w"
65,1068, // letter128
66,1028, // {199..218 231..250}
67,1028, // {193..198 225..230}
68,290, // digit
69,253, // {"1".."9"}
70,253, // "0"
71,1215, // digit128
72,956, // {176..185}
88,254, // idChar*
89,911, // $$0
94,532, // idChar
95,1227, // "_"
96,367, // idChar128
97,877, // {223}
  }
,
{ // state 197
MIN_REDUCTION+124, // (default reduction)
  }
,
{ // state 198
0x80000000|556, // match move
0x80000000|15, // no-match move
0x80000000|1145, // NT-test-match state for `else
  }
,
{ // state 199
7,218, // ID
16,523, // `(
30,84, // <exp>
35,1156, // <exp8>
36,320, // <exp7>
37,24, // <exp6>
38,22, // <exp5>
39,138, // <exp4>
41,480, // <exp3>
43,83, // <exp2>
44,256, // <cast exp>
45,491, // <unary exp>
46,111, // <exp1>
47,851, // `-
48,465, // INTLIT
49,972, // letter
50,816, // {"A".."Z" "a" "d" "g" "j".."k" "m".."n" "q".."s" "y".."z"}
51,816, // "p"
52,816, // "v"
53,816, // "c"
54,816, // "f"
55,816, // "i"
56,816, // "l"
57,816, // "o"
58,816, // "u"
59,816, // "x"
60,816, // "b"
61,816, // "e"
62,816, // "h"
63,816, // "t"
64,816, // "w"
65,1229, // letter128
66,735, // {199..218 231..250}
67,735, // {193..198 225..230}
69,272, // {"1".."9"}
70,1080, // "0"
71,593, // digit128
72,1282, // {176..185}
79,960, // "("
83,1296, // "-"
  }
,
{ // state 200
23,MIN_REDUCTION+98, // `[
85,MIN_REDUCTION+98, // "["
MIN_REDUCTION+98, // (default reduction)
  }
,
{ // state 201
7,236, // ID
16,482, // `(
30,725, // <exp>
35,1051, // <exp8>
36,313, // <exp7>
37,36, // <exp6>
38,33, // <exp5>
39,164, // <exp4>
41,411, // <exp3>
43,11, // <exp2>
44,336, // <cast exp>
45,507, // <unary exp>
46,230, // <exp1>
47,859, // `-
48,478, // INTLIT
49,1033, // letter
50,816, // {"A".."Z" "a" "d" "g" "j".."k" "m".."n" "q".."s" "y".."z"}
51,816, // "p"
52,816, // "v"
53,816, // "c"
54,816, // "f"
55,816, // "i"
56,816, // "l"
57,816, // "o"
58,816, // "u"
59,816, // "x"
60,816, // "b"
61,816, // "e"
62,816, // "h"
63,816, // "t"
64,816, // "w"
65,1288, // letter128
66,752, // {199..218 231..250}
67,752, // {193..198 225..230}
69,298, // {"1".."9"}
70,1119, // "0"
71,597, // digit128
72,1269, // {176..185}
79,960, // "("
83,1296, // "-"
  }
,
{ // state 202
23,MIN_REDUCTION+98, // `[
85,MIN_REDUCTION+98, // "["
MIN_REDUCTION+98, // (default reduction)
  }
,
{ // state 203
0x80000000|1, // match move
0x80000000|510, // no-match move
0x80000000|47, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 204
MIN_REDUCTION+24, // (default reduction)
  }
,
{ // state 205
MIN_REDUCTION+50, // (default reduction)
  }
,
{ // state 206
7,218, // ID
16,523, // `(
30,66, // <exp>
35,1156, // <exp8>
36,320, // <exp7>
37,24, // <exp6>
38,22, // <exp5>
39,138, // <exp4>
41,480, // <exp3>
43,83, // <exp2>
44,256, // <cast exp>
45,491, // <unary exp>
46,111, // <exp1>
47,851, // `-
48,465, // INTLIT
49,972, // letter
50,816, // {"A".."Z" "a" "d" "g" "j".."k" "m".."n" "q".."s" "y".."z"}
51,816, // "p"
52,816, // "v"
53,816, // "c"
54,816, // "f"
55,816, // "i"
56,816, // "l"
57,816, // "o"
58,816, // "u"
59,816, // "x"
60,816, // "b"
61,816, // "e"
62,816, // "h"
63,816, // "t"
64,816, // "w"
65,1229, // letter128
66,735, // {199..218 231..250}
67,735, // {193..198 225..230}
69,272, // {"1".."9"}
70,1080, // "0"
71,593, // digit128
72,1282, // {176..185}
79,960, // "("
83,1296, // "-"
  }
,
{ // state 207
MIN_REDUCTION+50, // (default reduction)
  }
,
{ // state 208
16,1266, // `(
79,16, // "("
  }
,
{ // state 209
7,1192, // ID
22,279, // <empty bracket pair>
23,54, // `[
49,644, // letter
50,816, // {"A".."Z" "a" "d" "g" "j".."k" "m".."n" "q".."s" "y".."z"}
51,816, // "p"
52,816, // "v"
53,816, // "c"
54,816, // "f"
55,816, // "i"
56,816, // "l"
57,816, // "o"
58,816, // "u"
59,816, // "x"
60,816, // "b"
61,816, // "e"
62,816, // "h"
63,816, // "t"
64,816, // "w"
65,1104, // letter128
66,1049, // {199..218 231..250}
67,1049, // {193..198 225..230}
85,895, // "["
  }
,
{ // state 210
16,952, // `(
79,1065, // "("
  }
,
{ // state 211
2,1163, // ws*
23,MIN_REDUCTION+128, // `[
73,1146, // ws
74,142, // " "
75,158, // {10}
85,MIN_REDUCTION+128, // "["
MIN_REDUCTION+128, // (default reduction)
  }
,
{ // state 212
MIN_REDUCTION+8, // (default reduction)
  }
,
{ // state 213
0x80000000|187, // match move
0x80000000|293, // no-match move
0x80000000|47, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 214
2,1168, // ws*
23,MIN_REDUCTION+128, // `[
73,1143, // ws
74,139, // " "
75,162, // {10}
85,MIN_REDUCTION+128, // "["
MIN_REDUCTION+128, // (default reduction)
  }
,
{ // state 215
101,MIN_REDUCTION+102, // $NT
  }
,
{ // state 216
23,MIN_REDUCTION+97, // `[
85,MIN_REDUCTION+97, // "["
101,MIN_REDUCTION+97, // $NT
MIN_REDUCTION+97, // (default reduction)
  }
,
{ // state 217
7,236, // ID
16,482, // `(
30,893, // <exp>
35,1051, // <exp8>
36,313, // <exp7>
37,36, // <exp6>
38,33, // <exp5>
39,164, // <exp4>
41,411, // <exp3>
43,11, // <exp2>
44,336, // <cast exp>
45,507, // <unary exp>
46,230, // <exp1>
47,859, // `-
48,478, // INTLIT
49,1033, // letter
50,816, // {"A".."Z" "a" "d" "g" "j".."k" "m".."n" "q".."s" "y".."z"}
51,816, // "p"
52,816, // "v"
53,816, // "c"
54,816, // "f"
55,816, // "i"
56,816, // "l"
57,816, // "o"
58,816, // "u"
59,816, // "x"
60,816, // "b"
61,816, // "e"
62,816, // "h"
63,816, // "t"
64,816, // "w"
65,1288, // letter128
66,752, // {199..218 231..250}
67,752, // {193..198 225..230}
69,298, // {"1".."9"}
70,1119, // "0"
71,597, // digit128
72,1269, // {176..185}
79,960, // "("
83,1296, // "-"
  }
,
{ // state 218
0x80000000|1, // match move
0x80000000|667, // no-match move
0x80000000|47, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 219
27,MIN_REDUCTION+124, // `;
87,MIN_REDUCTION+124, // ";"
MIN_REDUCTION+124, // (default reduction)
  }
,
{ // state 220
23,MIN_REDUCTION+99, // `[
73,318, // ws
74,90, // " "
75,99, // {10}
85,MIN_REDUCTION+99, // "["
101,MIN_REDUCTION+99, // $NT
MIN_REDUCTION+99, // (default reduction)
  }
,
{ // state 221
MIN_REDUCTION+123, // (default reduction)
  }
,
{ // state 222
0x80000000|1, // match move
0x80000000|672, // no-match move
0x80000000|47, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 223
MIN_REDUCTION+122, // (default reduction)
  }
,
{ // state 224
MIN_REDUCTION+73, // (default reduction)
  }
,
{ // state 225
68,1272, // digit
69,1100, // {"1".."9"}
70,1100, // "0"
71,1314, // digit128
72,1298, // {176..185}
90,552, // digit*
91,479, // $$1
  }
,
{ // state 226
MIN_REDUCTION+50, // (default reduction)
  }
,
{ // state 227
0x80000000|93, // match move
0x80000000|986, // no-match move
0x80000000|1145, // NT-test-match state for `else
  }
,
{ // state 228
MIN_REDUCTION+50, // (default reduction)
  }
,
{ // state 229
0x80000000|235, // match move
0x80000000|601, // no-match move
0x80000000|1145, // NT-test-match state for `else
  }
,
{ // state 230
0x80000000|1, // match move
0x80000000|687, // no-match move
0x80000000|47, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 231
73,97, // ws
74,44, // " "
75,934, // {10}
MIN_REDUCTION+75, // (default reduction)
  }
,
{ // state 232
0x80000000|927, // match move
0x80000000|1226, // no-match move
0x80000000|47, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 233
-1, // $$start
-1, // <start>
-1, // ws*
-1, // <program>
-1, // <class decl>+
-1, // <class decl>
-1, // `class
264, // ID
759, // `{
-1, // <decl in class>*
-1, // `}
-1, // `extends
-1, // <decl in class>
-1, // <method decl>
-1, // `public
-1, // `void
518, // `(
-1, // `)
-1, // <stmt>*
209, // <type>
924, // `int
930, // `boolean
-1, // <empty bracket pair>
-1, // `[
-1, // `]
299, // <stmt>
787, // <assign>
-1, // `;
1093, // <local var decl>
985, // `if
592, // <exp>
-1, // `else
726, // `while
177, // `for
-1, // `=
1153, // <exp8>
325, // <exp7>
19, // <exp6>
25, // <exp5>
101, // <exp4>
-1, // `+
483, // <exp3>
-1, // `*
78, // <exp2>
258, // <cast exp>
490, // <unary exp>
95, // <exp1>
854, // `-
461, // INTLIT
1239, // letter
816, // {"A".."Z" "a" "d" "g" "j".."k" "m".."n" "q".."s" "y".."z"}
816, // "p"
816, // "v"
816, // "c"
816, // "f"
816, // "i"
816, // "l"
816, // "o"
816, // "u"
816, // "x"
816, // "b"
816, // "e"
816, // "h"
816, // "t"
816, // "w"
374, // letter128
189, // {199..218 231..250}
189, // {193..198 225..230}
-1, // digit
269, // {"1".."9"}
1084, // "0"
591, // digit128
1279, // {176..185}
-1, // ws
-1, // " "
-1, // {10}
395, // "#"
-1, // "+"
-1, // "*"
960, // "("
-1, // ")"
887, // "{"
-1, // "}"
1296, // "-"
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
{ // state 234
23,MIN_REDUCTION+98, // `[
85,MIN_REDUCTION+98, // "["
101,MIN_REDUCTION+98, // $NT
MIN_REDUCTION+98, // (default reduction)
  }
,
{ // state 235
31,741, // `else
76,475, // "#"
  }
,
{ // state 236
0x80000000|1, // match move
0x80000000|682, // no-match move
0x80000000|47, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 237
2,317, // ws*
73,373, // ws
74,1164, // " "
75,453, // {10}
MIN_REDUCTION+94, // (default reduction)
  }
,
{ // state 238
16,75, // `(
79,619, // "("
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
264, // ID
708, // `{
-1, // <decl in class>*
1036, // `}
-1, // `extends
-1, // <decl in class>
-1, // <method decl>
-1, // `public
-1, // `void
518, // `(
-1, // `)
-1, // <stmt>*
209, // <type>
924, // `int
930, // `boolean
-1, // <empty bracket pair>
-1, // `[
-1, // `]
847, // <stmt>
957, // <assign>
-1, // `;
401, // <local var decl>
1310, // `if
592, // <exp>
-1, // `else
390, // `while
905, // `for
-1, // `=
1153, // <exp8>
325, // <exp7>
19, // <exp6>
25, // <exp5>
101, // <exp4>
-1, // `+
483, // <exp3>
-1, // `*
78, // <exp2>
258, // <cast exp>
490, // <unary exp>
95, // <exp1>
854, // `-
461, // INTLIT
1239, // letter
816, // {"A".."Z" "a" "d" "g" "j".."k" "m".."n" "q".."s" "y".."z"}
816, // "p"
816, // "v"
816, // "c"
816, // "f"
816, // "i"
816, // "l"
816, // "o"
816, // "u"
816, // "x"
816, // "b"
816, // "e"
816, // "h"
816, // "t"
816, // "w"
374, // letter128
189, // {199..218 231..250}
189, // {193..198 225..230}
-1, // digit
269, // {"1".."9"}
1084, // "0"
591, // digit128
1279, // {176..185}
-1, // ws
-1, // " "
-1, // {10}
395, // "#"
-1, // "+"
-1, // "*"
960, // "("
-1, // ")"
887, // "{"
987, // "}"
1296, // "-"
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
MIN_REDUCTION+19, // (default reduction)
  }
,
{ // state 241
MIN_REDUCTION+16, // (default reduction)
  }
,
{ // state 242
0x80000000|13, // match move
0x80000000|630, // no-match move
0x80000000|47, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 243
0x80000000|1, // match move
0x80000000|653, // no-match move
0x80000000|47, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 244
2,1171, // ws*
23,MIN_REDUCTION+128, // `[
73,1138, // ws
74,126, // " "
75,123, // {10}
85,MIN_REDUCTION+128, // "["
MIN_REDUCTION+128, // (default reduction)
  }
,
{ // state 245
2,58, // ws*
23,MIN_REDUCTION+90, // `[
73,1143, // ws
74,139, // " "
75,162, // {10}
85,MIN_REDUCTION+90, // "["
MIN_REDUCTION+90, // (default reduction)
  }
,
{ // state 246
31,457, // `else
76,475, // "#"
  }
,
{ // state 247
2,57, // ws*
23,MIN_REDUCTION+90, // `[
73,1146, // ws
74,142, // " "
75,158, // {10}
85,MIN_REDUCTION+90, // "["
MIN_REDUCTION+90, // (default reduction)
  }
,
{ // state 248
73,1041, // ws
74,1179, // " "
75,827, // {10}
MIN_REDUCTION+59, // (default reduction)
  }
,
{ // state 249
MIN_REDUCTION+50, // (default reduction)
  }
,
{ // state 250
0x80000000|1, // match move
0x80000000|455, // no-match move
0x80000000|47, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 251
MIN_REDUCTION+124, // (default reduction)
  }
,
{ // state 252
17,MIN_REDUCTION+124, // `)
80,MIN_REDUCTION+124, // ")"
MIN_REDUCTION+124, // (default reduction)
  }
,
{ // state 253
MIN_REDUCTION+47, // (default reduction)
  }
,
{ // state 254
49,676, // letter
50,67, // {"A".."Z" "a" "d" "g" "j".."k" "m".."n" "q".."s" "y".."z"}
51,67, // "p"
52,67, // "v"
53,67, // "c"
54,67, // "f"
55,67, // "i"
56,67, // "l"
57,67, // "o"
58,67, // "u"
59,67, // "x"
60,67, // "b"
61,67, // "e"
62,67, // "h"
63,67, // "t"
64,67, // "w"
65,1068, // letter128
66,1028, // {199..218 231..250}
67,1028, // {193..198 225..230}
68,290, // digit
69,253, // {"1".."9"}
70,253, // "0"
71,1215, // digit128
72,956, // {176..185}
89,648, // $$0
94,1268, // idChar
95,1227, // "_"
96,367, // idChar128
97,877, // {223}
  }
,
{ // state 255
-1, // $$start
-1, // <start>
-1, // ws*
-1, // <program>
-1, // <class decl>+
-1, // <class decl>
-1, // `class
264, // ID
711, // `{
-1, // <decl in class>*
-1, // `}
-1, // `extends
-1, // <decl in class>
-1, // <method decl>
-1, // `public
-1, // `void
518, // `(
-1, // `)
-1, // <stmt>*
209, // <type>
924, // `int
930, // `boolean
-1, // <empty bracket pair>
-1, // `[
-1, // `]
386, // <stmt>
1167, // <assign>
-1, // `;
366, // <local var decl>
680, // `if
592, // <exp>
-1, // `else
210, // `while
803, // `for
-1, // `=
1153, // <exp8>
325, // <exp7>
19, // <exp6>
25, // <exp5>
101, // <exp4>
-1, // `+
483, // <exp3>
-1, // `*
78, // <exp2>
258, // <cast exp>
490, // <unary exp>
95, // <exp1>
854, // `-
461, // INTLIT
1239, // letter
816, // {"A".."Z" "a" "d" "g" "j".."k" "m".."n" "q".."s" "y".."z"}
816, // "p"
816, // "v"
816, // "c"
816, // "f"
816, // "i"
816, // "l"
816, // "o"
816, // "u"
816, // "x"
816, // "b"
816, // "e"
816, // "h"
816, // "t"
816, // "w"
374, // letter128
189, // {199..218 231..250}
189, // {193..198 225..230}
-1, // digit
269, // {"1".."9"}
1084, // "0"
591, // digit128
1279, // {176..185}
-1, // ws
-1, // " "
-1, // {10}
395, // "#"
-1, // "+"
-1, // "*"
960, // "("
-1, // ")"
887, // "{"
-1, // "}"
1296, // "-"
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
{ // state 256
MIN_REDUCTION+36, // (default reduction)
  }
,
{ // state 257
0x80000000|867, // match move
0x80000000|409, // no-match move
0x80000000|47, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 258
MIN_REDUCTION+36, // (default reduction)
  }
,
{ // state 259
MIN_REDUCTION+95, // (default reduction)
  }
,
{ // state 260
23,MIN_REDUCTION+50, // `[
85,MIN_REDUCTION+50, // "["
MIN_REDUCTION+50, // (default reduction)
  }
,
{ // state 261
0x80000000|867, // match move
0x80000000|406, // no-match move
0x80000000|47, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 262
-1, // $$start
-1, // <start>
-1, // ws*
-1, // <program>
-1, // <class decl>+
-1, // <class decl>
-1, // `class
264, // ID
731, // `{
-1, // <decl in class>*
-1, // `}
-1, // `extends
-1, // <decl in class>
-1, // <method decl>
-1, // `public
-1, // `void
518, // `(
-1, // `)
-1, // <stmt>*
209, // <type>
924, // `int
930, // `boolean
-1, // <empty bracket pair>
-1, // `[
-1, // `]
229, // <stmt>
691, // <assign>
-1, // `;
1106, // <local var decl>
920, // `if
592, // <exp>
-1, // `else
701, // `while
208, // `for
-1, // `=
1153, // <exp8>
325, // <exp7>
19, // <exp6>
25, // <exp5>
101, // <exp4>
-1, // `+
483, // <exp3>
-1, // `*
78, // <exp2>
258, // <cast exp>
490, // <unary exp>
95, // <exp1>
854, // `-
461, // INTLIT
1239, // letter
816, // {"A".."Z" "a" "d" "g" "j".."k" "m".."n" "q".."s" "y".."z"}
816, // "p"
816, // "v"
816, // "c"
816, // "f"
816, // "i"
816, // "l"
816, // "o"
816, // "u"
816, // "x"
816, // "b"
816, // "e"
816, // "h"
816, // "t"
816, // "w"
374, // letter128
189, // {199..218 231..250}
189, // {193..198 225..230}
-1, // digit
269, // {"1".."9"}
1084, // "0"
591, // digit128
1279, // {176..185}
-1, // ws
-1, // " "
-1, // {10}
395, // "#"
-1, // "+"
-1, // "*"
960, // "("
-1, // ")"
887, // "{"
-1, // "}"
1296, // "-"
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
{ // state 263
MIN_REDUCTION+107, // (default reduction)
  }
,
{ // state 264
0x80000000|1136, // match move
0x80000000|1074, // no-match move
0x80000000|47, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 265
73,492, // ws
74,997, // " "
75,329, // {10}
101,MIN_REDUCTION+65, // $NT
  }
,
{ // state 266
MIN_REDUCTION+95, // (default reduction)
  }
,
{ // state 267
101,MIN_REDUCTION+28, // $NT
  }
,
{ // state 268
23,MIN_REDUCTION+49, // `[
85,MIN_REDUCTION+49, // "["
MIN_REDUCTION+49, // (default reduction)
  }
,
{ // state 269
68,1272, // digit
69,1100, // {"1".."9"}
70,1100, // "0"
71,1278, // digit128
72,1279, // {176..185}
90,671, // digit*
91,506, // $$1
  }
,
{ // state 270
0x80000000|867, // match move
0x80000000|643, // no-match move
0x80000000|47, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 271
-1, // $$start
-1, // <start>
-1, // ws*
-1, // <program>
-1, // <class decl>+
-1, // <class decl>
-1, // `class
264, // ID
711, // `{
-1, // <decl in class>*
-1, // `}
-1, // `extends
-1, // <decl in class>
-1, // <method decl>
-1, // `public
-1, // `void
518, // `(
-1, // `)
-1, // <stmt>*
209, // <type>
924, // `int
930, // `boolean
-1, // <empty bracket pair>
-1, // `[
-1, // `]
380, // <stmt>
1167, // <assign>
-1, // `;
366, // <local var decl>
680, // `if
592, // <exp>
-1, // `else
210, // `while
803, // `for
-1, // `=
1153, // <exp8>
325, // <exp7>
19, // <exp6>
25, // <exp5>
101, // <exp4>
-1, // `+
483, // <exp3>
-1, // `*
78, // <exp2>
258, // <cast exp>
490, // <unary exp>
95, // <exp1>
854, // `-
461, // INTLIT
1239, // letter
816, // {"A".."Z" "a" "d" "g" "j".."k" "m".."n" "q".."s" "y".."z"}
816, // "p"
816, // "v"
816, // "c"
816, // "f"
816, // "i"
816, // "l"
816, // "o"
816, // "u"
816, // "x"
816, // "b"
816, // "e"
816, // "h"
816, // "t"
816, // "w"
374, // letter128
189, // {199..218 231..250}
189, // {193..198 225..230}
-1, // digit
269, // {"1".."9"}
1084, // "0"
591, // digit128
1279, // {176..185}
-1, // ws
-1, // " "
-1, // {10}
395, // "#"
-1, // "+"
-1, // "*"
960, // "("
-1, // ")"
887, // "{"
-1, // "}"
1296, // "-"
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
{ // state 272
68,1272, // digit
69,1100, // {"1".."9"}
70,1100, // "0"
71,1283, // digit128
72,1282, // {176..185}
90,666, // digit*
91,502, // $$1
  }
,
{ // state 273
23,MIN_REDUCTION+108, // `[
85,MIN_REDUCTION+108, // "["
MIN_REDUCTION+108, // (default reduction)
  }
,
{ // state 274
73,965, // ws
74,166, // " "
75,190, // {10}
MIN_REDUCTION+71, // (default reduction)
  }
,
{ // state 275
23,MIN_REDUCTION+108, // `[
85,MIN_REDUCTION+108, // "["
MIN_REDUCTION+108, // (default reduction)
  }
,
{ // state 276
0x80000000|646, // match move
0x80000000|10, // no-match move
0x80000000|1145, // NT-test-match state for `else
  }
,
{ // state 277
23,MIN_REDUCTION+48, // `[
85,MIN_REDUCTION+48, // "["
101,MIN_REDUCTION+48, // $NT
MIN_REDUCTION+48, // (default reduction)
  }
,
{ // state 278
23,MIN_REDUCTION+93, // `[
73,8, // ws
74,126, // " "
75,123, // {10}
85,MIN_REDUCTION+93, // "["
MIN_REDUCTION+93, // (default reduction)
  }
,
{ // state 279
MIN_REDUCTION+14, // (default reduction)
  }
,
{ // state 280
0x80000000|1, // match move
0x80000000|707, // no-match move
0x80000000|47, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 281
0x80000000|1340, // match move
0x80000000|1094, // no-match move
0x80000000|1145, // NT-test-match state for `else
  }
,
{ // state 282
MIN_REDUCTION+50, // (default reduction)
  }
,
{ // state 283
MIN_REDUCTION+22, // (default reduction)
  }
,
{ // state 284
MIN_REDUCTION+50, // (default reduction)
  }
,
{ // state 285
23,MIN_REDUCTION+93, // `[
73,39, // ws
74,139, // " "
75,162, // {10}
85,MIN_REDUCTION+93, // "["
MIN_REDUCTION+93, // (default reduction)
  }
,
{ // state 286
7,218, // ID
16,523, // `(
30,1149, // <exp>
35,1156, // <exp8>
36,320, // <exp7>
37,24, // <exp6>
38,22, // <exp5>
39,138, // <exp4>
41,480, // <exp3>
43,83, // <exp2>
44,256, // <cast exp>
45,491, // <unary exp>
46,111, // <exp1>
47,851, // `-
48,465, // INTLIT
49,972, // letter
50,816, // {"A".."Z" "a" "d" "g" "j".."k" "m".."n" "q".."s" "y".."z"}
51,816, // "p"
52,816, // "v"
53,816, // "c"
54,816, // "f"
55,816, // "i"
56,816, // "l"
57,816, // "o"
58,816, // "u"
59,816, // "x"
60,816, // "b"
61,816, // "e"
62,816, // "h"
63,816, // "t"
64,816, // "w"
65,1229, // letter128
66,735, // {199..218 231..250}
67,735, // {193..198 225..230}
69,272, // {"1".."9"}
70,1080, // "0"
71,593, // digit128
72,1282, // {176..185}
79,960, // "("
83,1296, // "-"
  }
,
{ // state 287
MIN_REDUCTION+48, // (default reduction)
  }
,
{ // state 288
MIN_REDUCTION+36, // (default reduction)
  }
,
{ // state 289
MIN_REDUCTION+123, // (default reduction)
  }
,
{ // state 290
MIN_REDUCTION+104, // (default reduction)
  }
,
{ // state 291
52,668, // "v"
  }
,
{ // state 292
23,MIN_REDUCTION+49, // `[
85,MIN_REDUCTION+49, // "["
MIN_REDUCTION+49, // (default reduction)
  }
,
{ // state 293
2,280, // ws*
23,MIN_REDUCTION+90, // `[
73,1128, // ws
74,161, // " "
75,28, // {10}
85,MIN_REDUCTION+90, // "["
MIN_REDUCTION+90, // (default reduction)
  }
,
{ // state 294
23,MIN_REDUCTION+49, // `[
85,MIN_REDUCTION+49, // "["
MIN_REDUCTION+49, // (default reduction)
  }
,
{ // state 295
0x80000000|1, // match move
0x80000000|935, // no-match move
0x80000000|47, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 296
23,MIN_REDUCTION+108, // `[
85,MIN_REDUCTION+108, // "["
MIN_REDUCTION+108, // (default reduction)
  }
,
{ // state 297
-1, // $$start
-1, // <start>
-1, // ws*
-1, // <program>
-1, // <class decl>+
-1, // <class decl>
-1, // `class
264, // ID
51, // `{
-1, // <decl in class>*
-1, // `}
-1, // `extends
-1, // <decl in class>
-1, // <method decl>
-1, // `public
-1, // `void
518, // `(
-1, // `)
-1, // <stmt>*
209, // <type>
924, // `int
930, // `boolean
-1, // <empty bracket pair>
-1, // `[
-1, // `]
1190, // <stmt>
1046, // <assign>
-1, // `;
30, // <local var decl>
238, // `if
592, // <exp>
-1, // `else
1312, // `while
185, // `for
-1, // `=
1153, // <exp8>
325, // <exp7>
19, // <exp6>
25, // <exp5>
101, // <exp4>
-1, // `+
483, // <exp3>
-1, // `*
78, // <exp2>
258, // <cast exp>
490, // <unary exp>
95, // <exp1>
854, // `-
461, // INTLIT
1239, // letter
816, // {"A".."Z" "a" "d" "g" "j".."k" "m".."n" "q".."s" "y".."z"}
816, // "p"
816, // "v"
816, // "c"
816, // "f"
816, // "i"
816, // "l"
816, // "o"
816, // "u"
816, // "x"
816, // "b"
816, // "e"
816, // "h"
816, // "t"
816, // "w"
374, // letter128
189, // {199..218 231..250}
189, // {193..198 225..230}
-1, // digit
269, // {"1".."9"}
1084, // "0"
591, // digit128
1279, // {176..185}
-1, // ws
-1, // " "
-1, // {10}
395, // "#"
-1, // "+"
-1, // "*"
960, // "("
-1, // ")"
887, // "{"
-1, // "}"
1296, // "-"
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
{ // state 298
68,1272, // digit
69,1100, // {"1".."9"}
70,1100, // "0"
71,1292, // digit128
72,1269, // {176..185}
90,681, // digit*
91,530, // $$1
  }
,
{ // state 299
0x80000000|194, // match move
0x80000000|610, // no-match move
0x80000000|1145, // NT-test-match state for `else
  }
,
{ // state 300
23,MIN_REDUCTION+49, // `[
85,MIN_REDUCTION+49, // "["
MIN_REDUCTION+49, // (default reduction)
  }
,
{ // state 301
MIN_REDUCTION+124, // (default reduction)
  }
,
{ // state 302
23,MIN_REDUCTION+93, // `[
73,41, // ws
74,142, // " "
75,158, // {10}
85,MIN_REDUCTION+93, // "["
MIN_REDUCTION+93, // (default reduction)
  }
,
{ // state 303
0x80000000|1, // match move
0x80000000|810, // no-match move
0x80000000|47, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 304
0x80000000|1186, // match move
0x80000000|641, // no-match move
0x80000000|47, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 305
0x80000000|1, // match move
0x80000000|813, // no-match move
0x80000000|47, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 306
55,963, // "i"
60,722, // "b"
  }
,
{ // state 307
27,773, // `;
87,1097, // ";"
  }
,
{ // state 308
-1, // $$start
-1, // <start>
-1, // ws*
-1, // <program>
-1, // <class decl>+
-1, // <class decl>
-1, // `class
264, // ID
734, // `{
-1, // <decl in class>*
-1, // `}
-1, // `extends
-1, // <decl in class>
-1, // <method decl>
-1, // `public
-1, // `void
518, // `(
-1, // `)
-1, // <stmt>*
209, // <type>
924, // `int
930, // `boolean
-1, // <empty bracket pair>
-1, // `[
-1, // `]
421, // <stmt>
170, // <assign>
-1, // `;
1063, // <local var decl>
1276, // `if
592, // <exp>
-1, // `else
578, // `while
1245, // `for
-1, // `=
1153, // <exp8>
325, // <exp7>
19, // <exp6>
25, // <exp5>
101, // <exp4>
-1, // `+
483, // <exp3>
-1, // `*
78, // <exp2>
258, // <cast exp>
490, // <unary exp>
95, // <exp1>
854, // `-
461, // INTLIT
1239, // letter
816, // {"A".."Z" "a" "d" "g" "j".."k" "m".."n" "q".."s" "y".."z"}
816, // "p"
816, // "v"
816, // "c"
816, // "f"
816, // "i"
816, // "l"
816, // "o"
816, // "u"
816, // "x"
816, // "b"
816, // "e"
816, // "h"
816, // "t"
816, // "w"
374, // letter128
189, // {199..218 231..250}
189, // {193..198 225..230}
-1, // digit
269, // {"1".."9"}
1084, // "0"
591, // digit128
1279, // {176..185}
-1, // ws
-1, // " "
-1, // {10}
395, // "#"
-1, // "+"
-1, // "*"
960, // "("
-1, // ")"
887, // "{"
-1, // "}"
1296, // "-"
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
{ // state 309
2,639, // ws*
73,515, // ws
74,91, // " "
75,1170, // {10}
MIN_REDUCTION+80, // (default reduction)
  }
,
{ // state 310
15,1277, // `void
76,291, // "#"
  }
,
{ // state 311
23,MIN_REDUCTION+108, // `[
85,MIN_REDUCTION+108, // "["
MIN_REDUCTION+108, // (default reduction)
  }
,
{ // state 312
MIN_REDUCTION+123, // (default reduction)
  }
,
{ // state 313
MIN_REDUCTION+28, // (default reduction)
  }
,
{ // state 314
0x80000000|88, // match move
0x80000000|677, // no-match move
0x80000000|47, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 315
MIN_REDUCTION+50, // (default reduction)
  }
,
{ // state 316
MIN_REDUCTION+49, // (default reduction)
  }
,
{ // state 317
73,909, // ws
74,1164, // " "
75,453, // {10}
MIN_REDUCTION+93, // (default reduction)
  }
,
{ // state 318
0x80000000|1121, // match move
0x80000000|729, // no-match move
0x80000000|47, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 319
23,MIN_REDUCTION+48, // `[
85,MIN_REDUCTION+48, // "["
MIN_REDUCTION+48, // (default reduction)
  }
,
{ // state 320
MIN_REDUCTION+28, // (default reduction)
  }
,
{ // state 321
0x80000000|1, // match move
0x80000000|839, // no-match move
0x80000000|47, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 322
23,MIN_REDUCTION+93, // `[
73,53, // ws
74,161, // " "
75,28, // {10}
85,MIN_REDUCTION+93, // "["
MIN_REDUCTION+93, // (default reduction)
  }
,
{ // state 323
23,MIN_REDUCTION+108, // `[
85,MIN_REDUCTION+108, // "["
MIN_REDUCTION+108, // (default reduction)
  }
,
{ // state 324
MIN_REDUCTION+48, // (default reduction)
  }
,
{ // state 325
MIN_REDUCTION+28, // (default reduction)
  }
,
{ // state 326
-1, // $$start
-1, // <start>
-1, // ws*
-1, // <program>
-1, // <class decl>+
-1, // <class decl>
-1, // `class
264, // ID
774, // `{
-1, // <decl in class>*
-1, // `}
-1, // `extends
-1, // <decl in class>
-1, // <method decl>
-1, // `public
-1, // `void
518, // `(
-1, // `)
-1, // <stmt>*
209, // <type>
924, // `int
930, // `boolean
-1, // <empty bracket pair>
-1, // `[
-1, // `]
434, // <stmt>
183, // <assign>
-1, // `;
1035, // <local var decl>
1327, // `if
592, // <exp>
-1, // `else
660, // `while
1224, // `for
-1, // `=
1153, // <exp8>
325, // <exp7>
19, // <exp6>
25, // <exp5>
101, // <exp4>
-1, // `+
483, // <exp3>
-1, // `*
78, // <exp2>
258, // <cast exp>
490, // <unary exp>
95, // <exp1>
854, // `-
461, // INTLIT
1239, // letter
816, // {"A".."Z" "a" "d" "g" "j".."k" "m".."n" "q".."s" "y".."z"}
816, // "p"
816, // "v"
816, // "c"
816, // "f"
816, // "i"
816, // "l"
816, // "o"
816, // "u"
816, // "x"
816, // "b"
816, // "e"
816, // "h"
816, // "t"
816, // "w"
374, // letter128
189, // {199..218 231..250}
189, // {193..198 225..230}
-1, // digit
269, // {"1".."9"}
1084, // "0"
591, // digit128
1279, // {176..185}
-1, // ws
-1, // " "
-1, // {10}
395, // "#"
-1, // "+"
-1, // "*"
960, // "("
-1, // ")"
887, // "{"
-1, // "}"
1296, // "-"
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
{ // state 327
-1, // $$start
-1, // <start>
-1, // ws*
-1, // <program>
-1, // <class decl>+
-1, // <class decl>
-1, // `class
264, // ID
855, // `{
-1, // <decl in class>*
-1, // `}
-1, // `extends
-1, // <decl in class>
-1, // <method decl>
-1, // `public
-1, // `void
518, // `(
-1, // `)
-1, // <stmt>*
209, // <type>
924, // `int
930, // `boolean
-1, // <empty bracket pair>
-1, // `[
-1, // `]
792, // <stmt>
1176, // <assign>
-1, // `;
533, // <local var decl>
624, // `if
592, // <exp>
-1, // `else
1131, // `while
840, // `for
-1, // `=
1153, // <exp8>
325, // <exp7>
19, // <exp6>
25, // <exp5>
101, // <exp4>
-1, // `+
483, // <exp3>
-1, // `*
78, // <exp2>
258, // <cast exp>
490, // <unary exp>
95, // <exp1>
854, // `-
461, // INTLIT
1239, // letter
816, // {"A".."Z" "a" "d" "g" "j".."k" "m".."n" "q".."s" "y".."z"}
816, // "p"
816, // "v"
816, // "c"
816, // "f"
816, // "i"
816, // "l"
816, // "o"
816, // "u"
816, // "x"
816, // "b"
816, // "e"
816, // "h"
816, // "t"
816, // "w"
374, // letter128
189, // {199..218 231..250}
189, // {193..198 225..230}
-1, // digit
269, // {"1".."9"}
1084, // "0"
591, // digit128
1279, // {176..185}
-1, // ws
-1, // " "
-1, // {10}
395, // "#"
-1, // "+"
-1, // "*"
960, // "("
-1, // ")"
887, // "{"
-1, // "}"
1296, // "-"
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
{ // state 328
0x80000000|806, // match move
0x80000000|573, // no-match move
0x80000000|47, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 329
101,MIN_REDUCTION+50, // $NT
MIN_REDUCTION+50, // (default reduction)
  }
,
{ // state 330
23,MIN_REDUCTION+48, // `[
85,MIN_REDUCTION+48, // "["
MIN_REDUCTION+48, // (default reduction)
  }
,
{ // state 331
MIN_REDUCTION+124, // (default reduction)
  }
,
{ // state 332
23,MIN_REDUCTION+48, // `[
85,MIN_REDUCTION+48, // "["
MIN_REDUCTION+48, // (default reduction)
  }
,
{ // state 333
0x80000000|501, // match move
0x80000000|184, // no-match move
0x80000000|47, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 334
73,1025, // ws
74,744, // " "
75,1256, // {10}
MIN_REDUCTION+89, // (default reduction)
  }
,
{ // state 335
0x80000000|157, // match move
0x80000000|1027, // no-match move
0x80000000|47, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 336
MIN_REDUCTION+36, // (default reduction)
  }
,
{ // state 337
MIN_REDUCTION+123, // (default reduction)
  }
,
{ // state 338
MIN_REDUCTION+29, // (default reduction)
  }
,
{ // state 339
-1, // $$start
-1, // <start>
-1, // ws*
-1, // <program>
-1, // <class decl>+
-1, // <class decl>
-1, // `class
264, // ID
855, // `{
-1, // <decl in class>*
-1, // `}
-1, // `extends
-1, // <decl in class>
-1, // <method decl>
-1, // `public
-1, // `void
518, // `(
-1, // `)
-1, // <stmt>*
209, // <type>
924, // `int
930, // `boolean
-1, // <empty bracket pair>
-1, // `[
-1, // `]
742, // <stmt>
1176, // <assign>
-1, // `;
533, // <local var decl>
624, // `if
592, // <exp>
-1, // `else
1131, // `while
840, // `for
-1, // `=
1153, // <exp8>
325, // <exp7>
19, // <exp6>
25, // <exp5>
101, // <exp4>
-1, // `+
483, // <exp3>
-1, // `*
78, // <exp2>
258, // <cast exp>
490, // <unary exp>
95, // <exp1>
854, // `-
461, // INTLIT
1239, // letter
816, // {"A".."Z" "a" "d" "g" "j".."k" "m".."n" "q".."s" "y".."z"}
816, // "p"
816, // "v"
816, // "c"
816, // "f"
816, // "i"
816, // "l"
816, // "o"
816, // "u"
816, // "x"
816, // "b"
816, // "e"
816, // "h"
816, // "t"
816, // "w"
374, // letter128
189, // {199..218 231..250}
189, // {193..198 225..230}
-1, // digit
269, // {"1".."9"}
1084, // "0"
591, // digit128
1279, // {176..185}
-1, // ws
-1, // " "
-1, // {10}
395, // "#"
-1, // "+"
-1, // "*"
960, // "("
-1, // ")"
887, // "{"
-1, // "}"
1296, // "-"
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
{ // state 340
MIN_REDUCTION+30, // (default reduction)
  }
,
{ // state 341
0x80000000|1323, // match move
0x80000000|1073, // no-match move
0x80000000|1145, // NT-test-match state for `else
  }
,
{ // state 342
MIN_REDUCTION+50, // (default reduction)
  }
,
{ // state 343
2,639, // ws*
MIN_REDUCTION+80, // (default reduction)
  }
,
{ // state 344
MIN_REDUCTION+24, // (default reduction)
  }
,
{ // state 345
MIN_REDUCTION+124, // (default reduction)
  }
,
{ // state 346
73,598, // ws
74,376, // " "
75,228, // {10}
MIN_REDUCTION+125, // (default reduction)
  }
,
{ // state 347
MIN_REDUCTION+46, // (default reduction)
  }
,
{ // state 348
MIN_REDUCTION+124, // (default reduction)
  }
,
{ // state 349
73,1250, // ws
74,975, // " "
75,581, // {10}
MIN_REDUCTION+91, // (default reduction)
  }
,
{ // state 350
MIN_REDUCTION+49, // (default reduction)
  }
,
{ // state 351
MIN_REDUCTION+50, // (default reduction)
  }
,
{ // state 352
MIN_REDUCTION+49, // (default reduction)
  }
,
{ // state 353
27,466, // `;
87,1097, // ";"
  }
,
{ // state 354
MIN_REDUCTION+108, // (default reduction)
  }
,
{ // state 355
17,599, // `)
22,1057, // <empty bracket pair>
23,1339, // `[
80,1126, // ")"
85,895, // "["
  }
,
{ // state 356
73,1236, // ws
74,1018, // " "
75,998, // {10}
MIN_REDUCTION+79, // (default reduction)
  }
,
{ // state 357
73,163, // ws
74,1000, // " "
75,1031, // {10}
MIN_REDUCTION+85, // (default reduction)
  }
,
{ // state 358
MIN_REDUCTION+108, // (default reduction)
  }
,
{ // state 359
0x80000000|569, // match move
0x80000000|464, // no-match move
0x80000000|47, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 360
MIN_REDUCTION+22, // (default reduction)
  }
,
{ // state 361
MIN_REDUCTION+113, // (default reduction)
  }
,
{ // state 362
0x80000000|1, // match move
0x80000000|683, // no-match move
0x80000000|47, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 363
2,604, // ws*
73,780, // ws
74,352, // " "
75,284, // {10}
MIN_REDUCTION+64, // (default reduction)
  }
,
{ // state 364
MIN_REDUCTION+48, // (default reduction)
  }
,
{ // state 365
49,676, // letter
50,67, // {"A".."Z" "a" "d" "g" "j".."k" "m".."n" "q".."s" "y".."z"}
51,67, // "p"
52,67, // "v"
53,67, // "c"
54,67, // "f"
55,67, // "i"
56,67, // "l"
57,67, // "o"
58,67, // "u"
59,67, // "x"
60,67, // "b"
61,67, // "e"
62,67, // "h"
63,67, // "t"
64,67, // "w"
65,56, // letter128
66,1109, // {199..218 231..250}
67,1109, // {193..198 225..230}
68,290, // digit
69,253, // {"1".."9"}
70,253, // "0"
71,1337, // digit128
72,287, // {176..185}
89,259, // $$0
94,1268, // idChar
95,1227, // "_"
96,860, // idChar128
97,354, // {223}
  }
,
{ // state 366
27,119, // `;
87,108, // ";"
  }
,
{ // state 367
2,937, // ws*
73,251, // ws
74,1179, // " "
75,827, // {10}
MIN_REDUCTION+126, // (default reduction)
  }
,
{ // state 368
7,243, // ID
16,370, // `(
43,1254, // <exp2>
44,288, // <cast exp>
45,520, // <unary exp>
46,130, // <exp1>
47,870, // `-
48,445, // INTLIT
49,777, // letter
50,816, // {"A".."Z" "a" "d" "g" "j".."k" "m".."n" "q".."s" "y".."z"}
51,816, // "p"
52,816, // "v"
53,816, // "c"
54,816, // "f"
55,816, // "i"
56,816, // "l"
57,816, // "o"
58,816, // "u"
59,816, // "x"
60,816, // "b"
61,816, // "e"
62,816, // "h"
63,816, // "t"
64,816, // "w"
65,1193, // letter128
66,709, // {199..218 231..250}
67,709, // {193..198 225..230}
69,225, // {"1".."9"}
70,1039, // "0"
71,554, // digit128
72,1298, // {176..185}
79,960, // "("
83,1296, // "-"
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
{ // state 369
2,829, // ws*
73,301, // ws
74,1000, // " "
75,1031, // {10}
MIN_REDUCTION+88, // (default reduction)
  }
,
{ // state 370
7,450, // ID
19,521, // <type>
20,1060, // `int
21,122, // `boolean
49,196, // letter
50,816, // {"A".."Z" "a" "d" "g" "j".."k" "m".."n" "q".."s" "y".."z"}
51,816, // "p"
52,816, // "v"
53,816, // "c"
54,816, // "f"
55,816, // "i"
56,816, // "l"
57,816, // "o"
58,816, // "u"
59,816, // "x"
60,816, // "b"
61,816, // "e"
62,816, // "h"
63,816, // "t"
64,816, // "w"
65,134, // letter128
66,1028, // {199..218 231..250}
67,1028, // {193..198 225..230}
76,306, // "#"
  }
,
{ // state 371
-1, // $$start
-1, // <start>
-1, // ws*
-1, // <program>
-1, // <class decl>+
-1, // <class decl>
-1, // `class
264, // ID
855, // `{
-1, // <decl in class>*
-1, // `}
-1, // `extends
-1, // <decl in class>
-1, // <method decl>
-1, // `public
-1, // `void
518, // `(
-1, // `)
-1, // <stmt>*
209, // <type>
924, // `int
930, // `boolean
-1, // <empty bracket pair>
-1, // `[
-1, // `]
1115, // <stmt>
1176, // <assign>
-1, // `;
533, // <local var decl>
624, // `if
592, // <exp>
-1, // `else
1131, // `while
840, // `for
-1, // `=
1153, // <exp8>
325, // <exp7>
19, // <exp6>
25, // <exp5>
101, // <exp4>
-1, // `+
483, // <exp3>
-1, // `*
78, // <exp2>
258, // <cast exp>
490, // <unary exp>
95, // <exp1>
854, // `-
461, // INTLIT
1239, // letter
816, // {"A".."Z" "a" "d" "g" "j".."k" "m".."n" "q".."s" "y".."z"}
816, // "p"
816, // "v"
816, // "c"
816, // "f"
816, // "i"
816, // "l"
816, // "o"
816, // "u"
816, // "x"
816, // "b"
816, // "e"
816, // "h"
816, // "t"
816, // "w"
374, // letter128
189, // {199..218 231..250}
189, // {193..198 225..230}
-1, // digit
269, // {"1".."9"}
1084, // "0"
591, // digit128
1279, // {176..185}
-1, // ws
-1, // " "
-1, // {10}
395, // "#"
-1, // "+"
-1, // "*"
960, // "("
-1, // ")"
887, // "{"
-1, // "}"
1296, // "-"
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
{ // state 372
0x80000000|1, // match move
0x80000000|35, // no-match move
0x80000000|47, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 373
MIN_REDUCTION+124, // (default reduction)
  }
,
{ // state 374
0x80000000|149, // match move
0x80000000|27, // no-match move
0x80000000|47, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 375
17,842, // `)
22,1057, // <empty bracket pair>
23,1339, // `[
80,1126, // ")"
85,895, // "["
  }
,
{ // state 376
MIN_REDUCTION+49, // (default reduction)
  }
,
{ // state 377
17,794, // `)
22,1057, // <empty bracket pair>
23,1339, // `[
80,1126, // ")"
85,895, // "["
  }
,
{ // state 378
68,1272, // digit
69,1100, // {"1".."9"}
70,1100, // "0"
71,1162, // digit128
72,1214, // {176..185}
90,615, // digit*
91,388, // $$1
  }
,
{ // state 379
MIN_REDUCTION+21, // (default reduction)
  }
,
{ // state 380
27,745, // `;
87,1097, // ";"
  }
,
{ // state 381
MIN_REDUCTION+24, // (default reduction)
  }
,
{ // state 382
0x80000000|1328, // match move
0x80000000|992, // no-match move
0x80000000|1145, // NT-test-match state for `else
  }
,
{ // state 383
0x80000000|1, // match move
0x80000000|31, // no-match move
0x80000000|47, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 384
7,218, // ID
16,523, // `(
30,32, // <exp>
35,1156, // <exp8>
36,320, // <exp7>
37,24, // <exp6>
38,22, // <exp5>
39,138, // <exp4>
41,480, // <exp3>
43,83, // <exp2>
44,256, // <cast exp>
45,491, // <unary exp>
46,111, // <exp1>
47,851, // `-
48,465, // INTLIT
49,972, // letter
50,816, // {"A".."Z" "a" "d" "g" "j".."k" "m".."n" "q".."s" "y".."z"}
51,816, // "p"
52,816, // "v"
53,816, // "c"
54,816, // "f"
55,816, // "i"
56,816, // "l"
57,816, // "o"
58,816, // "u"
59,816, // "x"
60,816, // "b"
61,816, // "e"
62,816, // "h"
63,816, // "t"
64,816, // "w"
65,1229, // letter128
66,735, // {199..218 231..250}
67,735, // {193..198 225..230}
69,272, // {"1".."9"}
70,1080, // "0"
71,593, // digit128
72,1282, // {176..185}
79,960, // "("
83,1296, // "-"
  }
,
{ // state 385
73,72, // ws
74,91, // " "
75,1170, // {10}
MIN_REDUCTION+79, // (default reduction)
  }
,
{ // state 386
27,766, // `;
87,1097, // ";"
  }
,
{ // state 387
0x80000000|1, // match move
0x80000000|29, // no-match move
0x80000000|47, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 388
0x80000000|883, // match move
0x80000000|234, // no-match move
0x80000000|47, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 389
73,550, // ws
74,352, // " "
75,284, // {10}
MIN_REDUCTION+125, // (default reduction)
  }
,
{ // state 390
16,602, // `(
79,1065, // "("
  }
,
{ // state 391
101,MIN_REDUCTION+36, // $NT
MIN_REDUCTION+36, // (default reduction)
  }
,
{ // state 392
MIN_REDUCTION+49, // (default reduction)
  }
,
{ // state 393
2,1197, // ws*
23,MIN_REDUCTION+126, // `[
73,1143, // ws
74,139, // " "
75,162, // {10}
85,MIN_REDUCTION+126, // "["
MIN_REDUCTION+126, // (default reduction)
  }
,
{ // state 394
49,676, // letter
50,67, // {"A".."Z" "a" "d" "g" "j".."k" "m".."n" "q".."s" "y".."z"}
51,67, // "p"
52,67, // "v"
53,67, // "c"
54,67, // "f"
55,67, // "i"
56,67, // "l"
57,67, // "o"
58,67, // "u"
59,67, // "x"
60,67, // "b"
61,67, // "e"
62,67, // "h"
63,67, // "t"
64,67, // "w"
65,56, // letter128
66,1109, // {199..218 231..250}
67,1109, // {193..198 225..230}
68,290, // digit
69,253, // {"1".."9"}
70,253, // "0"
71,1337, // digit128
72,287, // {176..185}
88,365, // idChar*
89,96, // $$0
94,532, // idChar
95,1227, // "_"
96,860, // idChar128
97,354, // {223}
  }
,
{ // state 395
54,420, // "f"
55,165, // "i"
60,497, // "b"
64,583, // "w"
77,363, // "+"
  }
,
{ // state 396
23,MIN_REDUCTION+99, // `[
73,53, // ws
74,161, // " "
75,28, // {10}
85,MIN_REDUCTION+99, // "["
MIN_REDUCTION+99, // (default reduction)
  }
,
{ // state 397
2,136, // ws*
  }
,
{ // state 398
0x80000000|197, // match move
0x80000000|252, // no-match move
0x80000000|1145, // NT-test-match state for `else
  }
,
{ // state 399
2,1195, // ws*
23,MIN_REDUCTION+126, // `[
73,1146, // ws
74,142, // " "
75,158, // {10}
85,MIN_REDUCTION+126, // "["
MIN_REDUCTION+126, // (default reduction)
  }
,
{ // state 400
17,696, // `)
80,588, // ")"
  }
,
{ // state 401
27,240, // `;
87,913, // ";"
  }
,
{ // state 402
0x80000000|1048, // match move
0x80000000|1222, // no-match move
0x80000000|1145, // NT-test-match state for `else
  }
,
{ // state 403
MIN_REDUCTION+49, // (default reduction)
  }
,
{ // state 404
MIN_REDUCTION+108, // (default reduction)
  }
,
{ // state 405
MIN_REDUCTION+24, // (default reduction)
  }
,
{ // state 406
23,MIN_REDUCTION+110, // `[
85,MIN_REDUCTION+110, // "["
MIN_REDUCTION+110, // (default reduction)
  }
,
{ // state 407
MIN_REDUCTION+50, // (default reduction)
  }
,
{ // state 408
-1, // $$start
-1, // <start>
-1, // ws*
-1, // <program>
-1, // <class decl>+
-1, // <class decl>
-1, // `class
264, // ID
52, // `{
-1, // <decl in class>*
-1, // `}
-1, // `extends
-1, // <decl in class>
-1, // <method decl>
-1, // `public
-1, // `void
518, // `(
-1, // `)
-1, // <stmt>*
209, // <type>
924, // `int
930, // `boolean
-1, // <empty bracket pair>
-1, // `[
-1, // `]
1070, // <stmt>
925, // <assign>
-1, // `;
757, // <local var decl>
1338, // `if
592, // <exp>
-1, // `else
471, // `while
654, // `for
-1, // `=
1153, // <exp8>
325, // <exp7>
19, // <exp6>
25, // <exp5>
101, // <exp4>
-1, // `+
483, // <exp3>
-1, // `*
78, // <exp2>
258, // <cast exp>
490, // <unary exp>
95, // <exp1>
854, // `-
461, // INTLIT
1239, // letter
816, // {"A".."Z" "a" "d" "g" "j".."k" "m".."n" "q".."s" "y".."z"}
816, // "p"
816, // "v"
816, // "c"
816, // "f"
816, // "i"
816, // "l"
816, // "o"
816, // "u"
816, // "x"
816, // "b"
816, // "e"
816, // "h"
816, // "t"
816, // "w"
374, // letter128
189, // {199..218 231..250}
189, // {193..198 225..230}
-1, // digit
269, // {"1".."9"}
1084, // "0"
591, // digit128
1279, // {176..185}
-1, // ws
-1, // " "
-1, // {10}
395, // "#"
-1, // "+"
-1, // "*"
960, // "("
-1, // ")"
887, // "{"
-1, // "}"
1296, // "-"
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
{ // state 409
23,MIN_REDUCTION+110, // `[
85,MIN_REDUCTION+110, // "["
MIN_REDUCTION+110, // (default reduction)
  }
,
{ // state 410
MIN_REDUCTION+49, // (default reduction)
  }
,
{ // state 411
42,428, // `*
78,1150, // "*"
MIN_REDUCTION+33, // (default reduction)
  }
,
{ // state 412
0x80000000|1048, // match move
0x80000000|1231, // no-match move
0x80000000|1145, // NT-test-match state for `else
  }
,
{ // state 413
23,1067, // `[
85,369, // "["
MIN_REDUCTION+39, // (default reduction)
  }
,
{ // state 414
2,740, // ws*
MIN_REDUCTION+92, // (default reduction)
  }
,
{ // state 415
0x80000000|197, // match move
0x80000000|219, // no-match move
0x80000000|1145, // NT-test-match state for `else
  }
,
{ // state 416
101,MIN_REDUCTION+96, // $NT
  }
,
{ // state 417
17,1311, // `)
80,588, // ")"
  }
,
{ // state 418
0x80000000|556, // match move
0x80000000|1297, // no-match move
0x80000000|1145, // NT-test-match state for `else
  }
,
{ // state 419
MIN_REDUCTION+24, // (default reduction)
  }
,
{ // state 420
57,1199, // "o"
  }
,
{ // state 421
0x80000000|786, // match move
0x80000000|283, // no-match move
0x80000000|1145, // NT-test-match state for `else
  }
,
{ // state 422
2,1197, // ws*
  }
,
{ // state 423
56,1064, // "l"
  }
,
{ // state 424
2,1195, // ws*
  }
,
{ // state 425
73,553, // ws
74,697, // " "
75,976, // {10}
MIN_REDUCTION+65, // (default reduction)
  }
,
{ // state 426
MIN_REDUCTION+107, // (default reduction)
  }
,
{ // state 427
2,1212, // ws*
23,MIN_REDUCTION+126, // `[
73,1138, // ws
74,126, // " "
75,123, // {10}
85,MIN_REDUCTION+126, // "["
MIN_REDUCTION+126, // (default reduction)
  }
,
{ // state 428
7,236, // ID
16,482, // `(
43,1208, // <exp2>
44,336, // <cast exp>
45,507, // <unary exp>
46,230, // <exp1>
47,859, // `-
48,478, // INTLIT
49,1033, // letter
50,816, // {"A".."Z" "a" "d" "g" "j".."k" "m".."n" "q".."s" "y".."z"}
51,816, // "p"
52,816, // "v"
53,816, // "c"
54,816, // "f"
55,816, // "i"
56,816, // "l"
57,816, // "o"
58,816, // "u"
59,816, // "x"
60,816, // "b"
61,816, // "e"
62,816, // "h"
63,816, // "t"
64,816, // "w"
65,1288, // letter128
66,752, // {199..218 231..250}
67,752, // {193..198 225..230}
69,298, // {"1".."9"}
70,1119, // "0"
71,597, // digit128
72,1269, // {176..185}
79,960, // "("
83,1296, // "-"
  }
,
{ // state 429
17,778, // `)
80,588, // ")"
  }
,
{ // state 430
27,519, // `;
87,1097, // ";"
  }
,
{ // state 431
2,1139, // ws*
73,251, // ws
74,1179, // " "
75,827, // {10}
MIN_REDUCTION+90, // (default reduction)
  }
,
{ // state 432
23,MIN_REDUCTION+110, // `[
85,MIN_REDUCTION+110, // "["
MIN_REDUCTION+110, // (default reduction)
  }
,
{ // state 433
101,MIN_REDUCTION+37, // $NT
MIN_REDUCTION+37, // (default reduction)
  }
,
{ // state 434
0x80000000|786, // match move
0x80000000|1082, // no-match move
0x80000000|1145, // NT-test-match state for `else
  }
,
{ // state 435
7,218, // ID
16,523, // `(
43,1201, // <exp2>
44,256, // <cast exp>
45,491, // <unary exp>
46,111, // <exp1>
47,851, // `-
48,465, // INTLIT
49,972, // letter
50,816, // {"A".."Z" "a" "d" "g" "j".."k" "m".."n" "q".."s" "y".."z"}
51,816, // "p"
52,816, // "v"
53,816, // "c"
54,816, // "f"
55,816, // "i"
56,816, // "l"
57,816, // "o"
58,816, // "u"
59,816, // "x"
60,816, // "b"
61,816, // "e"
62,816, // "h"
63,816, // "t"
64,816, // "w"
65,1229, // letter128
66,735, // {199..218 231..250}
67,735, // {193..198 225..230}
69,272, // {"1".."9"}
70,1080, // "0"
71,593, // digit128
72,1282, // {176..185}
79,960, // "("
83,1296, // "-"
  }
,
{ // state 436
2,1212, // ws*
  }
,
{ // state 437
24,939, // `]
86,85, // "]"
  }
,
{ // state 438
0x80000000|205, // match move
0x80000000|866, // no-match move
0x80000000|801, // NT-test-match state for <exp>
  }
,
{ // state 439
0x80000000|1326, // match move
0x80000000|917, // no-match move
0x80000000|47, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 440
MIN_REDUCTION+108, // (default reduction)
  }
,
{ // state 441
MIN_REDUCTION+49, // (default reduction)
  }
,
{ // state 442
23,1078, // `[
85,369, // "["
MIN_REDUCTION+39, // (default reduction)
  }
,
{ // state 443
7,222, // ID
16,518, // `(
43,1200, // <exp2>
44,258, // <cast exp>
45,490, // <unary exp>
46,95, // <exp1>
47,854, // `-
48,461, // INTLIT
49,974, // letter
50,816, // {"A".."Z" "a" "d" "g" "j".."k" "m".."n" "q".."s" "y".."z"}
51,816, // "p"
52,816, // "v"
53,816, // "c"
54,816, // "f"
55,816, // "i"
56,816, // "l"
57,816, // "o"
58,816, // "u"
59,816, // "x"
60,816, // "b"
61,816, // "e"
62,816, // "h"
63,816, // "t"
64,816, // "w"
65,1228, // letter128
66,737, // {199..218 231..250}
67,737, // {193..198 225..230}
69,269, // {"1".."9"}
70,1084, // "0"
71,591, // digit128
72,1279, // {176..185}
79,960, // "("
83,1296, // "-"
  }
,
{ // state 444
73,1270, // ws
74,996, // " "
75,571, // {10}
MIN_REDUCTION+91, // (default reduction)
  }
,
{ // state 445
0x80000000|1, // match move
0x80000000|539, // no-match move
0x80000000|47, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 446
23,1085, // `[
85,369, // "["
MIN_REDUCTION+39, // (default reduction)
  }
,
{ // state 447
101,MIN_REDUCTION+93, // $NT
  }
,
{ // state 448
0x80000000|1202, // match move
0x80000000|575, // no-match move
0x80000000|801, // NT-test-match state for <exp>
  }
,
{ // state 449
23,MIN_REDUCTION+99, // `[
73,39, // ws
74,139, // " "
75,162, // {10}
85,MIN_REDUCTION+99, // "["
MIN_REDUCTION+99, // (default reduction)
  }
,
{ // state 450
MIN_REDUCTION+13, // (default reduction)
  }
,
{ // state 451
101,MIN_REDUCTION+129, // $NT
  }
,
{ // state 452
73,550, // ws
74,352, // " "
75,284, // {10}
MIN_REDUCTION+61, // (default reduction)
  }
,
{ // state 453
MIN_REDUCTION+50, // (default reduction)
  }
,
{ // state 454
73,594, // ws
74,441, // " "
75,182, // {10}
MIN_REDUCTION+125, // (default reduction)
  }
,
{ // state 455
23,MIN_REDUCTION+97, // `[
85,MIN_REDUCTION+97, // "["
MIN_REDUCTION+97, // (default reduction)
  }
,
{ // state 456
0x80000000|1, // match move
0x80000000|1265, // no-match move
0x80000000|47, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 457
-1, // $$start
-1, // <start>
-1, // ws*
-1, // <program>
-1, // <class decl>+
-1, // <class decl>
-1, // `class
264, // ID
759, // `{
-1, // <decl in class>*
-1, // `}
-1, // `extends
-1, // <decl in class>
-1, // <method decl>
-1, // `public
-1, // `void
518, // `(
-1, // `)
-1, // <stmt>*
209, // <type>
924, // `int
930, // `boolean
-1, // <empty bracket pair>
-1, // `[
-1, // `]
1096, // <stmt>
787, // <assign>
-1, // `;
1093, // <local var decl>
985, // `if
592, // <exp>
-1, // `else
726, // `while
177, // `for
-1, // `=
1153, // <exp8>
325, // <exp7>
19, // <exp6>
25, // <exp5>
101, // <exp4>
-1, // `+
483, // <exp3>
-1, // `*
78, // <exp2>
258, // <cast exp>
490, // <unary exp>
95, // <exp1>
854, // `-
461, // INTLIT
1239, // letter
816, // {"A".."Z" "a" "d" "g" "j".."k" "m".."n" "q".."s" "y".."z"}
816, // "p"
816, // "v"
816, // "c"
816, // "f"
816, // "i"
816, // "l"
816, // "o"
816, // "u"
816, // "x"
816, // "b"
816, // "e"
816, // "h"
816, // "t"
816, // "w"
374, // letter128
189, // {199..218 231..250}
189, // {193..198 225..230}
-1, // digit
269, // {"1".."9"}
1084, // "0"
591, // digit128
1279, // {176..185}
-1, // ws
-1, // " "
-1, // {10}
395, // "#"
-1, // "+"
-1, // "*"
960, // "("
-1, // ")"
887, // "{"
-1, // "}"
1296, // "-"
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
{ // state 458
9,495, // <decl in class>*
10,195, // `}
12,647, // <decl in class>
13,212, // <method decl>
14,310, // `public
76,1253, // "#"
82,21, // "}"
  }
,
{ // state 459
0x80000000|215, // match move
0x80000000|73, // no-match move
0x80000000|47, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 460
73,72, // ws
74,91, // " "
75,1170, // {10}
MIN_REDUCTION+91, // (default reduction)
  }
,
{ // state 461
0x80000000|1, // match move
0x80000000|509, // no-match move
0x80000000|47, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 462
MIN_REDUCTION+18, // (default reduction)
  }
,
{ // state 463
23,MIN_REDUCTION+99, // `[
73,41, // ws
74,142, // " "
75,158, // {10}
85,MIN_REDUCTION+99, // "["
MIN_REDUCTION+99, // (default reduction)
  }
,
{ // state 464
2,645, // ws*
23,MIN_REDUCTION+100, // `[
73,1174, // ws
74,90, // " "
75,99, // {10}
85,MIN_REDUCTION+100, // "["
101,MIN_REDUCTION+100, // $NT
MIN_REDUCTION+100, // (default reduction)
  }
,
{ // state 465
0x80000000|1, // match move
0x80000000|508, // no-match move
0x80000000|47, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 466
7,218, // ID
16,523, // `(
30,1241, // <exp>
35,1156, // <exp8>
36,320, // <exp7>
37,24, // <exp6>
38,22, // <exp5>
39,138, // <exp4>
41,480, // <exp3>
43,83, // <exp2>
44,256, // <cast exp>
45,491, // <unary exp>
46,111, // <exp1>
47,851, // `-
48,465, // INTLIT
49,972, // letter
50,816, // {"A".."Z" "a" "d" "g" "j".."k" "m".."n" "q".."s" "y".."z"}
51,816, // "p"
52,816, // "v"
53,816, // "c"
54,816, // "f"
55,816, // "i"
56,816, // "l"
57,816, // "o"
58,816, // "u"
59,816, // "x"
60,816, // "b"
61,816, // "e"
62,816, // "h"
63,816, // "t"
64,816, // "w"
65,1229, // letter128
66,735, // {199..218 231..250}
67,735, // {193..198 225..230}
69,272, // {"1".."9"}
70,1080, // "0"
71,593, // digit128
72,1282, // {176..185}
79,960, // "("
83,1296, // "-"
  }
,
{ // state 467
7,328, // ID
16,904, // `(
43,1331, // <exp2>
44,391, // <cast exp>
45,433, // <unary exp>
46,304, // <exp1>
47,926, // `-
48,534, // INTLIT
49,936, // letter
50,816, // {"A".."Z" "a" "d" "g" "j".."k" "m".."n" "q".."s" "y".."z"}
51,816, // "p"
52,816, // "v"
53,816, // "c"
54,816, // "f"
55,816, // "i"
56,816, // "l"
57,816, // "o"
58,816, // "u"
59,816, // "x"
60,816, // "b"
61,816, // "e"
62,816, // "h"
63,816, // "t"
64,816, // "w"
65,1059, // letter128
66,828, // {199..218 231..250}
67,828, // {193..198 225..230}
69,378, // {"1".."9"}
70,191, // "0"
71,359, // digit128
72,1214, // {176..185}
79,960, // "("
83,1296, // "-"
  }
,
{ // state 468
MIN_REDUCTION+123, // (default reduction)
  }
,
{ // state 469
0x80000000|1194, // match move
0x80000000|568, // no-match move
0x80000000|801, // NT-test-match state for <exp>
  }
,
{ // state 470
73,163, // ws
74,1000, // " "
75,1031, // {10}
MIN_REDUCTION+91, // (default reduction)
  }
,
{ // state 471
16,901, // `(
79,1065, // "("
  }
,
{ // state 472
2,98, // ws*
23,MIN_REDUCTION+90, // `[
73,1174, // ws
74,90, // " "
75,99, // {10}
85,MIN_REDUCTION+90, // "["
101,MIN_REDUCTION+90, // $NT
MIN_REDUCTION+90, // (default reduction)
  }
,
{ // state 473
2,1198, // ws*
101,MIN_REDUCTION+128, // $NT
  }
,
{ // state 474
MIN_REDUCTION+22, // (default reduction)
  }
,
{ // state 475
61,712, // "e"
  }
,
{ // state 476
7,236, // ID
16,482, // `(
41,153, // <exp3>
43,11, // <exp2>
44,336, // <cast exp>
45,507, // <unary exp>
46,230, // <exp1>
47,859, // `-
48,478, // INTLIT
49,1033, // letter
50,816, // {"A".."Z" "a" "d" "g" "j".."k" "m".."n" "q".."s" "y".."z"}
51,816, // "p"
52,816, // "v"
53,816, // "c"
54,816, // "f"
55,816, // "i"
56,816, // "l"
57,816, // "o"
58,816, // "u"
59,816, // "x"
60,816, // "b"
61,816, // "e"
62,816, // "h"
63,816, // "t"
64,816, // "w"
65,1288, // letter128
66,752, // {199..218 231..250}
67,752, // {193..198 225..230}
69,298, // {"1".."9"}
70,1119, // "0"
71,597, // digit128
72,1269, // {176..185}
79,960, // "("
83,1296, // "-"
  }
,
{ // state 477
MIN_REDUCTION+18, // (default reduction)
  }
,
{ // state 478
0x80000000|1, // match move
0x80000000|576, // no-match move
0x80000000|47, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 479
0x80000000|1, // match move
0x80000000|1159, // no-match move
0x80000000|47, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 480
42,435, // `*
78,1150, // "*"
MIN_REDUCTION+33, // (default reduction)
  }
,
{ // state 481
27,145, // `;
87,857, // ";"
  }
,
{ // state 482
7,450, // ID
19,355, // <type>
20,1060, // `int
21,122, // `boolean
49,196, // letter
50,816, // {"A".."Z" "a" "d" "g" "j".."k" "m".."n" "q".."s" "y".."z"}
51,816, // "p"
52,816, // "v"
53,816, // "c"
54,816, // "f"
55,816, // "i"
56,816, // "l"
57,816, // "o"
58,816, // "u"
59,816, // "x"
60,816, // "b"
61,816, // "e"
62,816, // "h"
63,816, // "t"
64,816, // "w"
65,134, // letter128
66,1028, // {199..218 231..250}
67,1028, // {193..198 225..230}
76,306, // "#"
  }
,
{ // state 483
42,443, // `*
78,1150, // "*"
MIN_REDUCTION+33, // (default reduction)
  }
,
{ // state 484
23,1055, // `[
85,369, // "["
MIN_REDUCTION+39, // (default reduction)
  }
,
{ // state 485
23,MIN_REDUCTION+97, // `[
85,MIN_REDUCTION+97, // "["
MIN_REDUCTION+97, // (default reduction)
  }
,
{ // state 486
0x80000000|918, // match move
0x80000000|753, // no-match move
0x80000000|1145, // NT-test-match state for `else
  }
,
{ // state 487
MIN_REDUCTION+123, // (default reduction)
  }
,
{ // state 488
23,MIN_REDUCTION+97, // `[
85,MIN_REDUCTION+97, // "["
MIN_REDUCTION+97, // (default reduction)
  }
,
{ // state 489
2,1007, // ws*
MIN_REDUCTION+80, // (default reduction)
  }
,
{ // state 490
MIN_REDUCTION+37, // (default reduction)
  }
,
{ // state 491
MIN_REDUCTION+37, // (default reduction)
  }
,
{ // state 492
101,MIN_REDUCTION+123, // $NT
MIN_REDUCTION+123, // (default reduction)
  }
,
{ // state 493
0x80000000|1, // match move
0x80000000|1316, // no-match move
0x80000000|47, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 494
7,236, // ID
16,482, // `(
30,946, // <exp>
35,1051, // <exp8>
36,313, // <exp7>
37,36, // <exp6>
38,33, // <exp5>
39,164, // <exp4>
41,411, // <exp3>
43,11, // <exp2>
44,336, // <cast exp>
45,507, // <unary exp>
46,230, // <exp1>
47,859, // `-
48,478, // INTLIT
49,1033, // letter
50,816, // {"A".."Z" "a" "d" "g" "j".."k" "m".."n" "q".."s" "y".."z"}
51,816, // "p"
52,816, // "v"
53,816, // "c"
54,816, // "f"
55,816, // "i"
56,816, // "l"
57,816, // "o"
58,816, // "u"
59,816, // "x"
60,816, // "b"
61,816, // "e"
62,816, // "h"
63,816, // "t"
64,816, // "w"
65,1288, // letter128
66,752, // {199..218 231..250}
67,752, // {193..198 225..230}
69,298, // {"1".."9"}
70,1119, // "0"
71,597, // digit128
72,1269, // {176..185}
79,960, // "("
83,1296, // "-"
  }
,
{ // state 495
10,1183, // `}
12,361, // <decl in class>
13,212, // <method decl>
14,310, // `public
76,1253, // "#"
82,21, // "}"
  }
,
{ // state 496
MIN_REDUCTION+107, // (default reduction)
  }
,
{ // state 497
57,9, // "o"
  }
,
{ // state 498
MIN_REDUCTION+17, // (default reduction)
  }
,
{ // state 499
27,206, // `;
87,1097, // ";"
  }
,
{ // state 500
2,958, // ws*
MIN_REDUCTION+80, // (default reduction)
  }
,
{ // state 501
2,6, // ws*
  }
,
{ // state 502
0x80000000|1, // match move
0x80000000|200, // no-match move
0x80000000|47, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 503
7,222, // ID
16,518, // `(
41,128, // <exp3>
43,78, // <exp2>
44,258, // <cast exp>
45,490, // <unary exp>
46,95, // <exp1>
47,854, // `-
48,461, // INTLIT
49,974, // letter
50,816, // {"A".."Z" "a" "d" "g" "j".."k" "m".."n" "q".."s" "y".."z"}
51,816, // "p"
52,816, // "v"
53,816, // "c"
54,816, // "f"
55,816, // "i"
56,816, // "l"
57,816, // "o"
58,816, // "u"
59,816, // "x"
60,816, // "b"
61,816, // "e"
62,816, // "h"
63,816, // "t"
64,816, // "w"
65,1228, // letter128
66,737, // {199..218 231..250}
67,737, // {193..198 225..230}
69,269, // {"1".."9"}
70,1084, // "0"
71,591, // digit128
72,1279, // {176..185}
79,960, // "("
83,1296, // "-"
  }
,
{ // state 504
49,676, // letter
50,67, // {"A".."Z" "a" "d" "g" "j".."k" "m".."n" "q".."s" "y".."z"}
51,67, // "p"
52,67, // "v"
53,67, // "c"
54,67, // "f"
55,67, // "i"
56,67, // "l"
57,67, // "o"
58,67, // "u"
59,67, // "x"
60,67, // "b"
61,67, // "e"
62,67, // "h"
63,67, // "t"
64,67, // "w"
65,12, // letter128
66,1049, // {199..218 231..250}
67,1049, // {193..198 225..230}
68,290, // digit
69,253, // {"1".."9"}
70,253, // "0"
71,1305, // digit128
72,324, // {176..185}
89,45, // $$0
94,1268, // idChar
95,1227, // "_"
96,762, // idChar128
97,404, // {223}
  }
,
{ // state 505
-1, // $$start
-1, // <start>
-1, // ws*
-1, // <program>
-1, // <class decl>+
-1, // <class decl>
-1, // `class
264, // ID
855, // `{
-1, // <decl in class>*
-1, // `}
-1, // `extends
-1, // <decl in class>
-1, // <method decl>
-1, // `public
-1, // `void
518, // `(
-1, // `)
-1, // <stmt>*
209, // <type>
924, // `int
930, // `boolean
-1, // <empty bracket pair>
-1, // `[
-1, // `]
417, // <stmt>
1176, // <assign>
-1, // `;
533, // <local var decl>
624, // `if
592, // <exp>
-1, // `else
1131, // `while
840, // `for
-1, // `=
1153, // <exp8>
325, // <exp7>
19, // <exp6>
25, // <exp5>
101, // <exp4>
-1, // `+
483, // <exp3>
-1, // `*
78, // <exp2>
258, // <cast exp>
490, // <unary exp>
95, // <exp1>
854, // `-
461, // INTLIT
1239, // letter
816, // {"A".."Z" "a" "d" "g" "j".."k" "m".."n" "q".."s" "y".."z"}
816, // "p"
816, // "v"
816, // "c"
816, // "f"
816, // "i"
816, // "l"
816, // "o"
816, // "u"
816, // "x"
816, // "b"
816, // "e"
816, // "h"
816, // "t"
816, // "w"
374, // letter128
189, // {199..218 231..250}
189, // {193..198 225..230}
-1, // digit
269, // {"1".."9"}
1084, // "0"
591, // digit128
1279, // {176..185}
-1, // ws
-1, // " "
-1, // {10}
395, // "#"
-1, // "+"
-1, // "*"
960, // "("
-1, // ")"
887, // "{"
-1, // "}"
1296, // "-"
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
{ // state 506
0x80000000|1, // match move
0x80000000|202, // no-match move
0x80000000|47, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 507
MIN_REDUCTION+37, // (default reduction)
  }
,
{ // state 508
23,MIN_REDUCTION+44, // `[
85,MIN_REDUCTION+44, // "["
MIN_REDUCTION+44, // (default reduction)
  }
,
{ // state 509
23,MIN_REDUCTION+44, // `[
85,MIN_REDUCTION+44, // "["
MIN_REDUCTION+44, // (default reduction)
  }
,
{ // state 510
23,MIN_REDUCTION+97, // `[
85,MIN_REDUCTION+97, // "["
MIN_REDUCTION+97, // (default reduction)
  }
,
{ // state 511
0x80000000|820, // match move
0x80000000|1133, // no-match move
0x80000000|1145, // NT-test-match state for `else
  }
,
{ // state 512
MIN_REDUCTION+21, // (default reduction)
  }
,
{ // state 513
2,1313, // ws*
73,836, // ws
74,116, // " "
75,438, // {10}
MIN_REDUCTION+74, // (default reduction)
  }
,
{ // state 514
27,199, // `;
87,1097, // ";"
  }
,
{ // state 515
0x80000000|197, // match move
0x80000000|1120, // no-match move
0x80000000|1145, // NT-test-match state for `else
  }
,
{ // state 516
7,218, // ID
16,523, // `(
41,124, // <exp3>
43,83, // <exp2>
44,256, // <cast exp>
45,491, // <unary exp>
46,111, // <exp1>
47,851, // `-
48,465, // INTLIT
49,972, // letter
50,816, // {"A".."Z" "a" "d" "g" "j".."k" "m".."n" "q".."s" "y".."z"}
51,816, // "p"
52,816, // "v"
53,816, // "c"
54,816, // "f"
55,816, // "i"
56,816, // "l"
57,816, // "o"
58,816, // "u"
59,816, // "x"
60,816, // "b"
61,816, // "e"
62,816, // "h"
63,816, // "t"
64,816, // "w"
65,1229, // letter128
66,735, // {199..218 231..250}
67,735, // {193..198 225..230}
69,272, // {"1".."9"}
70,1080, // "0"
71,593, // digit128
72,1282, // {176..185}
79,960, // "("
83,1296, // "-"
  }
,
{ // state 517
23,MIN_REDUCTION+124, // `[
85,MIN_REDUCTION+124, // "["
MIN_REDUCTION+124, // (default reduction)
  }
,
{ // state 518
7,450, // ID
19,375, // <type>
20,1060, // `int
21,122, // `boolean
49,196, // letter
50,816, // {"A".."Z" "a" "d" "g" "j".."k" "m".."n" "q".."s" "y".."z"}
51,816, // "p"
52,816, // "v"
53,816, // "c"
54,816, // "f"
55,816, // "i"
56,816, // "l"
57,816, // "o"
58,816, // "u"
59,816, // "x"
60,816, // "b"
61,816, // "e"
62,816, // "h"
63,816, // "t"
64,816, // "w"
65,134, // letter128
66,1028, // {199..218 231..250}
67,1028, // {193..198 225..230}
76,306, // "#"
  }
,
{ // state 519
7,218, // ID
16,523, // `(
30,1257, // <exp>
35,1156, // <exp8>
36,320, // <exp7>
37,24, // <exp6>
38,22, // <exp5>
39,138, // <exp4>
41,480, // <exp3>
43,83, // <exp2>
44,256, // <cast exp>
45,491, // <unary exp>
46,111, // <exp1>
47,851, // `-
48,465, // INTLIT
49,972, // letter
50,816, // {"A".."Z" "a" "d" "g" "j".."k" "m".."n" "q".."s" "y".."z"}
51,816, // "p"
52,816, // "v"
53,816, // "c"
54,816, // "f"
55,816, // "i"
56,816, // "l"
57,816, // "o"
58,816, // "u"
59,816, // "x"
60,816, // "b"
61,816, // "e"
62,816, // "h"
63,816, // "t"
64,816, // "w"
65,1229, // letter128
66,735, // {199..218 231..250}
67,735, // {193..198 225..230}
69,272, // {"1".."9"}
70,1080, // "0"
71,593, // digit128
72,1282, // {176..185}
79,960, // "("
83,1296, // "-"
  }
,
{ // state 520
MIN_REDUCTION+37, // (default reduction)
  }
,
{ // state 521
17,882, // `)
22,1057, // <empty bracket pair>
23,1339, // `[
80,1126, // ")"
85,895, // "["
  }
,
{ // state 522
0x80000000|1, // match move
0x80000000|1299, // no-match move
0x80000000|47, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 523
7,450, // ID
19,377, // <type>
20,1060, // `int
21,122, // `boolean
49,196, // letter
50,816, // {"A".."Z" "a" "d" "g" "j".."k" "m".."n" "q".."s" "y".."z"}
51,816, // "p"
52,816, // "v"
53,816, // "c"
54,816, // "f"
55,816, // "i"
56,816, // "l"
57,816, // "o"
58,816, // "u"
59,816, // "x"
60,816, // "b"
61,816, // "e"
62,816, // "h"
63,816, // "t"
64,816, // "w"
65,134, // letter128
66,1028, // {199..218 231..250}
67,1028, // {193..198 225..230}
76,306, // "#"
  }
,
{ // state 524
0x80000000|1, // match move
0x80000000|1300, // no-match move
0x80000000|47, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 525
17,692, // `)
80,588, // ")"
  }
,
{ // state 526
2,1152, // ws*
23,MIN_REDUCTION+130, // `[
73,1128, // ws
74,161, // " "
75,28, // {10}
85,MIN_REDUCTION+130, // "["
MIN_REDUCTION+130, // (default reduction)
  }
,
{ // state 527
7,236, // ID
16,482, // `(
30,921, // <exp>
35,1051, // <exp8>
36,313, // <exp7>
37,36, // <exp6>
38,33, // <exp5>
39,164, // <exp4>
41,411, // <exp3>
43,11, // <exp2>
44,336, // <cast exp>
45,507, // <unary exp>
46,230, // <exp1>
47,859, // `-
48,478, // INTLIT
49,1033, // letter
50,816, // {"A".."Z" "a" "d" "g" "j".."k" "m".."n" "q".."s" "y".."z"}
51,816, // "p"
52,816, // "v"
53,816, // "c"
54,816, // "f"
55,816, // "i"
56,816, // "l"
57,816, // "o"
58,816, // "u"
59,816, // "x"
60,816, // "b"
61,816, // "e"
62,816, // "h"
63,816, // "t"
64,816, // "w"
65,1288, // letter128
66,752, // {199..218 231..250}
67,752, // {193..198 225..230}
69,298, // {"1".."9"}
70,1119, // "0"
71,597, // digit128
72,1269, // {176..185}
79,960, // "("
83,1296, // "-"
  }
,
{ // state 528
23,MIN_REDUCTION+93, // `[
73,318, // ws
74,90, // " "
75,99, // {10}
85,MIN_REDUCTION+93, // "["
101,MIN_REDUCTION+93, // $NT
MIN_REDUCTION+93, // (default reduction)
  }
,
{ // state 529
101,MIN_REDUCTION+124, // $NT
  }
,
{ // state 530
0x80000000|1, // match move
0x80000000|171, // no-match move
0x80000000|47, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 531
7,243, // ID
16,370, // `(
41,176, // <exp3>
43,55, // <exp2>
44,288, // <cast exp>
45,520, // <unary exp>
46,130, // <exp1>
47,870, // `-
48,445, // INTLIT
49,777, // letter
50,816, // {"A".."Z" "a" "d" "g" "j".."k" "m".."n" "q".."s" "y".."z"}
51,816, // "p"
52,816, // "v"
53,816, // "c"
54,816, // "f"
55,816, // "i"
56,816, // "l"
57,816, // "o"
58,816, // "u"
59,816, // "x"
60,816, // "b"
61,816, // "e"
62,816, // "h"
63,816, // "t"
64,816, // "w"
65,1193, // letter128
66,709, // {199..218 231..250}
67,709, // {193..198 225..230}
69,225, // {"1".."9"}
70,1039, // "0"
71,554, // digit128
72,1298, // {176..185}
79,960, // "("
83,1296, // "-"
  }
,
{ // state 532
MIN_REDUCTION+120, // (default reduction)
  }
,
{ // state 533
27,50, // `;
87,133, // ";"
  }
,
{ // state 534
0x80000000|566, // match move
0x80000000|614, // no-match move
0x80000000|47, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 535
42,368, // `*
78,1150, // "*"
MIN_REDUCTION+33, // (default reduction)
  }
,
{ // state 536
23,MIN_REDUCTION+99, // `[
73,8, // ws
74,126, // " "
75,123, // {10}
85,MIN_REDUCTION+99, // "["
MIN_REDUCTION+99, // (default reduction)
  }
,
{ // state 537
2,58, // ws*
  }
,
{ // state 538
49,676, // letter
50,67, // {"A".."Z" "a" "d" "g" "j".."k" "m".."n" "q".."s" "y".."z"}
51,67, // "p"
52,67, // "v"
53,67, // "c"
54,67, // "f"
55,67, // "i"
56,67, // "l"
57,67, // "o"
58,67, // "u"
59,67, // "x"
60,67, // "b"
61,67, // "e"
62,67, // "h"
63,67, // "t"
64,67, // "w"
65,150, // letter128
66,1037, // {199..218 231..250}
67,1037, // {193..198 225..230}
68,290, // digit
69,253, // {"1".."9"}
70,253, // "0"
71,1295, // digit128
72,364, // {176..185}
89,70, // $$0
94,1268, // idChar
95,1227, // "_"
96,689, // idChar128
97,440, // {223}
  }
,
{ // state 539
23,MIN_REDUCTION+44, // `[
85,MIN_REDUCTION+44, // "["
MIN_REDUCTION+44, // (default reduction)
  }
,
{ // state 540
2,57, // ws*
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
264, // ID
731, // `{
-1, // <decl in class>*
-1, // `}
-1, // `extends
-1, // <decl in class>
-1, // <method decl>
-1, // `public
-1, // `void
518, // `(
-1, // `)
-1, // <stmt>*
209, // <type>
924, // `int
930, // `boolean
-1, // <empty bracket pair>
-1, // `[
-1, // `]
1042, // <stmt>
691, // <assign>
-1, // `;
1106, // <local var decl>
920, // `if
592, // <exp>
-1, // `else
701, // `while
208, // `for
-1, // `=
1153, // <exp8>
325, // <exp7>
19, // <exp6>
25, // <exp5>
101, // <exp4>
-1, // `+
483, // <exp3>
-1, // `*
78, // <exp2>
258, // <cast exp>
490, // <unary exp>
95, // <exp1>
854, // `-
461, // INTLIT
1239, // letter
816, // {"A".."Z" "a" "d" "g" "j".."k" "m".."n" "q".."s" "y".."z"}
816, // "p"
816, // "v"
816, // "c"
816, // "f"
816, // "i"
816, // "l"
816, // "o"
816, // "u"
816, // "x"
816, // "b"
816, // "e"
816, // "h"
816, // "t"
816, // "w"
374, // letter128
189, // {199..218 231..250}
189, // {193..198 225..230}
-1, // digit
269, // {"1".."9"}
1084, // "0"
591, // digit128
1279, // {176..185}
-1, // ws
-1, // " "
-1, // {10}
395, // "#"
-1, // "+"
-1, // "*"
960, // "("
-1, // ")"
887, // "{"
-1, // "}"
1296, // "-"
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
MIN_REDUCTION+93, // (default reduction)
  }
,
{ // state 543
2,136, // ws*
23,MIN_REDUCTION+126, // `[
73,1128, // ws
74,161, // " "
75,28, // {10}
85,MIN_REDUCTION+126, // "["
MIN_REDUCTION+126, // (default reduction)
  }
,
{ // state 544
0x80000000|18, // match move
0x80000000|498, // no-match move
0x80000000|1145, // NT-test-match state for `else
  }
,
{ // state 545
MIN_REDUCTION+96, // (default reduction)
  }
,
{ // state 546
0x80000000|113, // match move
0x80000000|105, // no-match move
0x80000000|47, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 547
0x80000000|651, // match move
0x80000000|1021, // no-match move
0x80000000|47, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 548
MIN_REDUCTION+15, // (default reduction)
  }
,
{ // state 549
0x80000000|959, // match move
0x80000000|601, // no-match move
0x80000000|1145, // NT-test-match state for `else
  }
,
{ // state 550
MIN_REDUCTION+123, // (default reduction)
  }
,
{ // state 551
MIN_REDUCTION+123, // (default reduction)
  }
,
{ // state 552
68,1052, // digit
69,1100, // {"1".."9"}
70,1100, // "0"
71,1314, // digit128
72,1298, // {176..185}
91,203, // $$1
  }
,
{ // state 553
MIN_REDUCTION+123, // (default reduction)
  }
,
{ // state 554
0x80000000|618, // match move
0x80000000|623, // no-match move
0x80000000|47, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 555
-1, // $$start
-1, // <start>
-1, // ws*
-1, // <program>
-1, // <class decl>+
-1, // <class decl>
-1, // `class
264, // ID
51, // `{
-1, // <decl in class>*
-1, // `}
-1, // `extends
-1, // <decl in class>
-1, // <method decl>
-1, // `public
-1, // `void
518, // `(
-1, // `)
-1, // <stmt>*
209, // <type>
924, // `int
930, // `boolean
-1, // <empty bracket pair>
-1, // `[
-1, // `]
1032, // <stmt>
1046, // <assign>
-1, // `;
30, // <local var decl>
238, // `if
592, // <exp>
-1, // `else
1312, // `while
185, // `for
-1, // `=
1153, // <exp8>
325, // <exp7>
19, // <exp6>
25, // <exp5>
101, // <exp4>
-1, // `+
483, // <exp3>
-1, // `*
78, // <exp2>
258, // <cast exp>
490, // <unary exp>
95, // <exp1>
854, // `-
461, // INTLIT
1239, // letter
816, // {"A".."Z" "a" "d" "g" "j".."k" "m".."n" "q".."s" "y".."z"}
816, // "p"
816, // "v"
816, // "c"
816, // "f"
816, // "i"
816, // "l"
816, // "o"
816, // "u"
816, // "x"
816, // "b"
816, // "e"
816, // "h"
816, // "t"
816, // "w"
374, // letter128
189, // {199..218 231..250}
189, // {193..198 225..230}
-1, // digit
269, // {"1".."9"}
1084, // "0"
591, // digit128
1279, // {176..185}
-1, // ws
-1, // " "
-1, // {10}
395, // "#"
-1, // "+"
-1, // "*"
960, // "("
-1, // ")"
887, // "{"
-1, // "}"
1296, // "-"
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
{ // state 556
MIN_REDUCTION+18, // (default reduction)
  }
,
{ // state 557
7,236, // ID
16,482, // `(
30,1023, // <exp>
35,1051, // <exp8>
36,313, // <exp7>
37,36, // <exp6>
38,33, // <exp5>
39,164, // <exp4>
41,411, // <exp3>
43,11, // <exp2>
44,336, // <cast exp>
45,507, // <unary exp>
46,230, // <exp1>
47,859, // `-
48,478, // INTLIT
49,1033, // letter
50,816, // {"A".."Z" "a" "d" "g" "j".."k" "m".."n" "q".."s" "y".."z"}
51,816, // "p"
52,816, // "v"
53,816, // "c"
54,816, // "f"
55,816, // "i"
56,816, // "l"
57,816, // "o"
58,816, // "u"
59,816, // "x"
60,816, // "b"
61,816, // "e"
62,816, // "h"
63,816, // "t"
64,816, // "w"
65,1288, // letter128
66,752, // {199..218 231..250}
67,752, // {193..198 225..230}
69,298, // {"1".."9"}
70,1119, // "0"
71,597, // digit128
72,1269, // {176..185}
79,960, // "("
83,1296, // "-"
  }
,
{ // state 558
MIN_REDUCTION+123, // (default reduction)
  }
,
{ // state 559
MIN_REDUCTION+123, // (default reduction)
  }
,
{ // state 560
MIN_REDUCTION+124, // (default reduction)
  }
,
{ // state 561
2,1118, // ws*
23,MIN_REDUCTION+130, // `[
73,1146, // ws
74,142, // " "
75,158, // {10}
85,MIN_REDUCTION+130, // "["
MIN_REDUCTION+130, // (default reduction)
  }
,
{ // state 562
-1, // $$start
-1, // <start>
-1, // ws*
-1, // <program>
-1, // <class decl>+
-1, // <class decl>
-1, // `class
264, // ID
774, // `{
-1, // <decl in class>*
-1, // `}
-1, // `extends
-1, // <decl in class>
-1, // <method decl>
-1, // `public
-1, // `void
518, // `(
-1, // `)
-1, // <stmt>*
209, // <type>
924, // `int
930, // `boolean
-1, // <empty bracket pair>
-1, // `[
-1, // `]
587, // <stmt>
183, // <assign>
-1, // `;
1035, // <local var decl>
1327, // `if
592, // <exp>
-1, // `else
660, // `while
1224, // `for
-1, // `=
1153, // <exp8>
325, // <exp7>
19, // <exp6>
25, // <exp5>
101, // <exp4>
-1, // `+
483, // <exp3>
-1, // `*
78, // <exp2>
258, // <cast exp>
490, // <unary exp>
95, // <exp1>
854, // `-
461, // INTLIT
1239, // letter
816, // {"A".."Z" "a" "d" "g" "j".."k" "m".."n" "q".."s" "y".."z"}
816, // "p"
816, // "v"
816, // "c"
816, // "f"
816, // "i"
816, // "l"
816, // "o"
816, // "u"
816, // "x"
816, // "b"
816, // "e"
816, // "h"
816, // "t"
816, // "w"
374, // letter128
189, // {199..218 231..250}
189, // {193..198 225..230}
-1, // digit
269, // {"1".."9"}
1084, // "0"
591, // digit128
1279, // {176..185}
-1, // ws
-1, // " "
-1, // {10}
395, // "#"
-1, // "+"
-1, // "*"
960, // "("
-1, // ")"
887, // "{"
-1, // "}"
1296, // "-"
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
{ // state 563
-1, // $$start
-1, // <start>
-1, // ws*
-1, // <program>
-1, // <class decl>+
-1, // <class decl>
-1, // `class
264, // ID
731, // `{
-1, // <decl in class>*
-1, // `}
-1, // `extends
-1, // <decl in class>
-1, // <method decl>
-1, // `public
-1, // `void
518, // `(
-1, // `)
-1, // <stmt>*
209, // <type>
924, // `int
930, // `boolean
-1, // <empty bracket pair>
-1, // `[
-1, // `]
434, // <stmt>
691, // <assign>
-1, // `;
1106, // <local var decl>
920, // `if
592, // <exp>
-1, // `else
701, // `while
208, // `for
-1, // `=
1153, // <exp8>
325, // <exp7>
19, // <exp6>
25, // <exp5>
101, // <exp4>
-1, // `+
483, // <exp3>
-1, // `*
78, // <exp2>
258, // <cast exp>
490, // <unary exp>
95, // <exp1>
854, // `-
461, // INTLIT
1239, // letter
816, // {"A".."Z" "a" "d" "g" "j".."k" "m".."n" "q".."s" "y".."z"}
816, // "p"
816, // "v"
816, // "c"
816, // "f"
816, // "i"
816, // "l"
816, // "o"
816, // "u"
816, // "x"
816, // "b"
816, // "e"
816, // "h"
816, // "t"
816, // "w"
374, // letter128
189, // {199..218 231..250}
189, // {193..198 225..230}
-1, // digit
269, // {"1".."9"}
1084, // "0"
591, // digit128
1279, // {176..185}
-1, // ws
-1, // " "
-1, // {10}
395, // "#"
-1, // "+"
-1, // "*"
960, // "("
-1, // ")"
887, // "{"
-1, // "}"
1296, // "-"
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
{ // state 564
2,1116, // ws*
23,MIN_REDUCTION+130, // `[
73,1143, // ws
74,139, // " "
75,162, // {10}
85,MIN_REDUCTION+130, // "["
MIN_REDUCTION+130, // (default reduction)
  }
,
{ // state 565
17,308, // `)
80,588, // ")"
  }
,
{ // state 566
101,MIN_REDUCTION+44, // $NT
  }
,
{ // state 567
23,MIN_REDUCTION+89, // `[
73,318, // ws
74,90, // " "
75,99, // {10}
85,MIN_REDUCTION+89, // "["
101,MIN_REDUCTION+89, // $NT
MIN_REDUCTION+89, // (default reduction)
  }
,
{ // state 568
17,579, // `)
80,588, // ")"
  }
,
{ // state 569
2,645, // ws*
101,MIN_REDUCTION+100, // $NT
  }
,
{ // state 570
-1, // $$start
-1, // <start>
-1, // ws*
-1, // <program>
-1, // <class decl>+
-1, // <class decl>
-1, // `class
264, // ID
708, // `{
-1, // <decl in class>*
822, // `}
-1, // `extends
-1, // <decl in class>
-1, // <method decl>
-1, // `public
-1, // `void
518, // `(
-1, // `)
-1, // <stmt>*
209, // <type>
924, // `int
930, // `boolean
-1, // <empty bracket pair>
-1, // `[
-1, // `]
847, // <stmt>
957, // <assign>
-1, // `;
401, // <local var decl>
1310, // `if
592, // <exp>
-1, // `else
390, // `while
905, // `for
-1, // `=
1153, // <exp8>
325, // <exp7>
19, // <exp6>
25, // <exp5>
101, // <exp4>
-1, // `+
483, // <exp3>
-1, // `*
78, // <exp2>
258, // <cast exp>
490, // <unary exp>
95, // <exp1>
854, // `-
461, // INTLIT
1239, // letter
816, // {"A".."Z" "a" "d" "g" "j".."k" "m".."n" "q".."s" "y".."z"}
816, // "p"
816, // "v"
816, // "c"
816, // "f"
816, // "i"
816, // "l"
816, // "o"
816, // "u"
816, // "x"
816, // "b"
816, // "e"
816, // "h"
816, // "t"
816, // "w"
374, // letter128
189, // {199..218 231..250}
189, // {193..198 225..230}
-1, // digit
269, // {"1".."9"}
1084, // "0"
591, // digit128
1279, // {176..185}
-1, // ws
-1, // " "
-1, // {10}
395, // "#"
-1, // "+"
-1, // "*"
960, // "("
-1, // ")"
887, // "{"
885, // "}"
1296, // "-"
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
{ // state 571
0x80000000|315, // match move
0x80000000|1003, // no-match move
0x80000000|1145, // NT-test-match state for `else
  }
,
{ // state 572
MIN_REDUCTION+123, // (default reduction)
  }
,
{ // state 573
23,MIN_REDUCTION+42, // `[
85,MIN_REDUCTION+42, // "["
101,MIN_REDUCTION+42, // $NT
MIN_REDUCTION+42, // (default reduction)
  }
,
{ // state 574
7,236, // ID
16,482, // `(
30,951, // <exp>
35,1051, // <exp8>
36,313, // <exp7>
37,36, // <exp6>
38,33, // <exp5>
39,164, // <exp4>
41,411, // <exp3>
43,11, // <exp2>
44,336, // <cast exp>
45,507, // <unary exp>
46,230, // <exp1>
47,859, // `-
48,478, // INTLIT
49,1033, // letter
50,816, // {"A".."Z" "a" "d" "g" "j".."k" "m".."n" "q".."s" "y".."z"}
51,816, // "p"
52,816, // "v"
53,816, // "c"
54,816, // "f"
55,816, // "i"
56,816, // "l"
57,816, // "o"
58,816, // "u"
59,816, // "x"
60,816, // "b"
61,816, // "e"
62,816, // "h"
63,816, // "t"
64,816, // "w"
65,1288, // letter128
66,752, // {199..218 231..250}
67,752, // {193..198 225..230}
69,298, // {"1".."9"}
70,1119, // "0"
71,597, // digit128
72,1269, // {176..185}
79,960, // "("
83,1296, // "-"
  }
,
{ // state 575
17,563, // `)
80,588, // ")"
  }
,
{ // state 576
23,MIN_REDUCTION+44, // `[
85,MIN_REDUCTION+44, // "["
MIN_REDUCTION+44, // (default reduction)
  }
,
{ // state 577
17,326, // `)
80,588, // ")"
  }
,
{ // state 578
16,858, // `(
79,1065, // "("
  }
,
{ // state 579
-1, // $$start
-1, // <start>
-1, // ws*
-1, // <program>
-1, // <class decl>+
-1, // <class decl>
-1, // `class
264, // ID
759, // `{
-1, // <decl in class>*
-1, // `}
-1, // `extends
-1, // <decl in class>
-1, // <method decl>
-1, // `public
-1, // `void
518, // `(
-1, // `)
-1, // <stmt>*
209, // <type>
924, // `int
930, // `boolean
-1, // <empty bracket pair>
-1, // `[
-1, // `]
421, // <stmt>
787, // <assign>
-1, // `;
1093, // <local var decl>
985, // `if
592, // <exp>
-1, // `else
726, // `while
177, // `for
-1, // `=
1153, // <exp8>
325, // <exp7>
19, // <exp6>
25, // <exp5>
101, // <exp4>
-1, // `+
483, // <exp3>
-1, // `*
78, // <exp2>
258, // <cast exp>
490, // <unary exp>
95, // <exp1>
854, // `-
461, // INTLIT
1239, // letter
816, // {"A".."Z" "a" "d" "g" "j".."k" "m".."n" "q".."s" "y".."z"}
816, // "p"
816, // "v"
816, // "c"
816, // "f"
816, // "i"
816, // "l"
816, // "o"
816, // "u"
816, // "x"
816, // "b"
816, // "e"
816, // "h"
816, // "t"
816, // "w"
374, // letter128
189, // {199..218 231..250}
189, // {193..198 225..230}
-1, // digit
269, // {"1".."9"}
1084, // "0"
591, // digit128
1279, // {176..185}
-1, // ws
-1, // " "
-1, // {10}
395, // "#"
-1, // "+"
-1, // "*"
960, // "("
-1, // ")"
887, // "{"
-1, // "}"
1296, // "-"
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
{ // state 580
31,5, // `else
76,475, // "#"
  }
,
{ // state 581
0x80000000|315, // match move
0x80000000|1026, // no-match move
0x80000000|1145, // NT-test-match state for `else
  }
,
{ // state 582
7,236, // ID
16,482, // `(
30,758, // <exp>
35,1051, // <exp8>
36,313, // <exp7>
37,36, // <exp6>
38,33, // <exp5>
39,164, // <exp4>
41,411, // <exp3>
43,11, // <exp2>
44,336, // <cast exp>
45,507, // <unary exp>
46,230, // <exp1>
47,859, // `-
48,478, // INTLIT
49,1033, // letter
50,816, // {"A".."Z" "a" "d" "g" "j".."k" "m".."n" "q".."s" "y".."z"}
51,816, // "p"
52,816, // "v"
53,816, // "c"
54,816, // "f"
55,816, // "i"
56,816, // "l"
57,816, // "o"
58,816, // "u"
59,816, // "x"
60,816, // "b"
61,816, // "e"
62,816, // "h"
63,816, // "t"
64,816, // "w"
65,1288, // letter128
66,752, // {199..218 231..250}
67,752, // {193..198 225..230}
69,298, // {"1".."9"}
70,1119, // "0"
71,597, // digit128
72,1269, // {176..185}
79,960, // "("
83,1296, // "-"
  }
,
{ // state 583
62,1335, // "h"
  }
,
{ // state 584
MIN_REDUCTION+123, // (default reduction)
  }
,
{ // state 585
17,MIN_REDUCTION+49, // `)
80,MIN_REDUCTION+49, // ")"
MIN_REDUCTION+49, // (default reduction)
  }
,
{ // state 586
101,MIN_REDUCTION+46, // $NT
MIN_REDUCTION+46, // (default reduction)
  }
,
{ // state 587
0x80000000|918, // match move
0x80000000|736, // no-match move
0x80000000|1145, // NT-test-match state for `else
  }
,
{ // state 588
2,1083, // ws*
73,1077, // ws
74,697, // " "
75,976, // {10}
MIN_REDUCTION+76, // (default reduction)
  }
,
{ // state 589
0x80000000|358, // match move
0x80000000|311, // no-match move
0x80000000|47, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 590
-1, // $$start
-1, // <start>
-1, // ws*
-1, // <program>
-1, // <class decl>+
-1, // <class decl>
-1, // `class
264, // ID
734, // `{
-1, // <decl in class>*
-1, // `}
-1, // `extends
-1, // <decl in class>
-1, // <method decl>
-1, // `public
-1, // `void
518, // `(
-1, // `)
-1, // <stmt>*
209, // <type>
924, // `int
930, // `boolean
-1, // <empty bracket pair>
-1, // `[
-1, // `]
486, // <stmt>
170, // <assign>
-1, // `;
1063, // <local var decl>
1276, // `if
592, // <exp>
-1, // `else
578, // `while
1245, // `for
-1, // `=
1153, // <exp8>
325, // <exp7>
19, // <exp6>
25, // <exp5>
101, // <exp4>
-1, // `+
483, // <exp3>
-1, // `*
78, // <exp2>
258, // <cast exp>
490, // <unary exp>
95, // <exp1>
854, // `-
461, // INTLIT
1239, // letter
816, // {"A".."Z" "a" "d" "g" "j".."k" "m".."n" "q".."s" "y".."z"}
816, // "p"
816, // "v"
816, // "c"
816, // "f"
816, // "i"
816, // "l"
816, // "o"
816, // "u"
816, // "x"
816, // "b"
816, // "e"
816, // "h"
816, // "t"
816, // "w"
374, // letter128
189, // {199..218 231..250}
189, // {193..198 225..230}
-1, // digit
269, // {"1".."9"}
1084, // "0"
591, // digit128
1279, // {176..185}
-1, // ws
-1, // " "
-1, // {10}
395, // "#"
-1, // "+"
-1, // "*"
960, // "("
-1, // ")"
887, // "{"
-1, // "}"
1296, // "-"
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
{ // state 591
0x80000000|633, // match move
0x80000000|656, // no-match move
0x80000000|47, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 592
34,384, // `=
84,1204, // "="
  }
,
{ // state 593
0x80000000|631, // match move
0x80000000|652, // no-match move
0x80000000|47, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 594
MIN_REDUCTION+123, // (default reduction)
  }
,
{ // state 595
2,1079, // ws*
23,MIN_REDUCTION+130, // `[
73,1138, // ws
74,126, // " "
75,123, // {10}
85,MIN_REDUCTION+130, // "["
MIN_REDUCTION+130, // (default reduction)
  }
,
{ // state 596
73,MIN_REDUCTION+49, // ws
74,MIN_REDUCTION+49, // " "
75,MIN_REDUCTION+49, // {10}
MIN_REDUCTION+49, // (default reduction)
  }
,
{ // state 597
0x80000000|640, // match move
0x80000000|670, // no-match move
0x80000000|47, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 598
MIN_REDUCTION+123, // (default reduction)
  }
,
{ // state 599
7,236, // ID
16,482, // `(
44,793, // <cast exp>
46,1158, // <exp1>
48,478, // INTLIT
49,1033, // letter
50,816, // {"A".."Z" "a" "d" "g" "j".."k" "m".."n" "q".."s" "y".."z"}
51,816, // "p"
52,816, // "v"
53,816, // "c"
54,816, // "f"
55,816, // "i"
56,816, // "l"
57,816, // "o"
58,816, // "u"
59,816, // "x"
60,816, // "b"
61,816, // "e"
62,816, // "h"
63,816, // "t"
64,816, // "w"
65,1288, // letter128
66,752, // {199..218 231..250}
67,752, // {193..198 225..230}
69,298, // {"1".."9"}
70,1119, // "0"
71,597, // digit128
72,1269, // {176..185}
79,960, // "("
  }
,
{ // state 600
2,356, // ws*
73,1101, // ws
74,1018, // " "
75,998, // {10}
MIN_REDUCTION+80, // (default reduction)
  }
,
{ // state 601
MIN_REDUCTION+20, // (default reduction)
  }
,
{ // state 602
0x80000000|837, // match move
0x80000000|899, // no-match move
0x80000000|801, // NT-test-match state for <exp>
  }
,
{ // state 603
56,718, // "l"
  }
,
{ // state 604
73,550, // ws
74,352, // " "
75,284, // {10}
MIN_REDUCTION+63, // (default reduction)
  }
,
{ // state 605
27,MIN_REDUCTION+49, // `;
87,MIN_REDUCTION+49, // ";"
MIN_REDUCTION+49, // (default reduction)
  }
,
{ // state 606
31,622, // `else
76,475, // "#"
  }
,
{ // state 607
7,328, // ID
16,904, // `(
41,80, // <exp3>
43,131, // <exp2>
44,391, // <cast exp>
45,433, // <unary exp>
46,304, // <exp1>
47,926, // `-
48,534, // INTLIT
49,936, // letter
50,816, // {"A".."Z" "a" "d" "g" "j".."k" "m".."n" "q".."s" "y".."z"}
51,816, // "p"
52,816, // "v"
53,816, // "c"
54,816, // "f"
55,816, // "i"
56,816, // "l"
57,816, // "o"
58,816, // "u"
59,816, // "x"
60,816, // "b"
61,816, // "e"
62,816, // "h"
63,816, // "t"
64,816, // "w"
65,1059, // letter128
66,828, // {199..218 231..250}
67,828, // {193..198 225..230}
69,378, // {"1".."9"}
70,191, // "0"
71,359, // digit128
72,1214, // {176..185}
79,960, // "("
83,1296, // "-"
  }
,
{ // state 608
2,910, // ws*
73,705, // ws
74,441, // " "
75,182, // {10}
MIN_REDUCTION+76, // (default reduction)
  }
,
{ // state 609
0x80000000|1030, // match move
0x80000000|610, // no-match move
0x80000000|1145, // NT-test-match state for `else
  }
,
{ // state 610
MIN_REDUCTION+20, // (default reduction)
  }
,
{ // state 611
2,1087, // ws*
73,973, // ws
74,997, // " "
75,329, // {10}
101,MIN_REDUCTION+90, // $NT
  }
,
{ // state 612
100,MIN_REDUCTION+0, // $
  }
,
{ // state 613
17,1151, // `)
80,588, // ")"
  }
,
{ // state 614
23,MIN_REDUCTION+44, // `[
85,MIN_REDUCTION+44, // "["
101,MIN_REDUCTION+44, // $NT
MIN_REDUCTION+44, // (default reduction)
  }
,
{ // state 615
68,1052, // digit
69,1100, // {"1".."9"}
70,1100, // "0"
71,1162, // digit128
72,1214, // {176..185}
91,120, // $$1
  }
,
{ // state 616
49,676, // letter
50,67, // {"A".."Z" "a" "d" "g" "j".."k" "m".."n" "q".."s" "y".."z"}
51,67, // "p"
52,67, // "v"
53,67, // "c"
54,67, // "f"
55,67, // "i"
56,67, // "l"
57,67, // "o"
58,67, // "u"
59,67, // "x"
60,67, // "b"
61,67, // "e"
62,67, // "h"
63,67, // "t"
64,67, // "w"
65,150, // letter128
66,1037, // {199..218 231..250}
67,1037, // {193..198 225..230}
68,290, // digit
69,253, // {"1".."9"}
70,253, // "0"
71,1295, // digit128
72,364, // {176..185}
88,538, // idChar*
89,193, // $$0
94,532, // idChar
95,1227, // "_"
96,689, // idChar128
97,440, // {223}
  }
,
{ // state 617
101,MIN_REDUCTION+50, // $NT
  }
,
{ // state 618
2,818, // ws*
  }
,
{ // state 619
2,1304, // ws*
73,301, // ws
74,1000, // " "
75,1031, // {10}
MIN_REDUCTION+74, // (default reduction)
  }
,
{ // state 620
0x80000000|716, // match move
0x80000000|526, // no-match move
0x80000000|47, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 621
24,894, // `]
86,173, // "]"
  }
,
{ // state 622
-1, // $$start
-1, // <start>
-1, // ws*
-1, // <program>
-1, // <class decl>+
-1, // <class decl>
-1, // `class
264, // ID
51, // `{
-1, // <decl in class>*
-1, // `}
-1, // `extends
-1, // <decl in class>
-1, // <method decl>
-1, // `public
-1, // `void
518, // `(
-1, // `)
-1, // <stmt>*
209, // <type>
924, // `int
930, // `boolean
-1, // <empty bracket pair>
-1, // `[
-1, // `]
1237, // <stmt>
1046, // <assign>
-1, // `;
30, // <local var decl>
238, // `if
592, // <exp>
-1, // `else
1312, // `while
185, // `for
-1, // `=
1153, // <exp8>
325, // <exp7>
19, // <exp6>
25, // <exp5>
101, // <exp4>
-1, // `+
483, // <exp3>
-1, // `*
78, // <exp2>
258, // <cast exp>
490, // <unary exp>
95, // <exp1>
854, // `-
461, // INTLIT
1239, // letter
816, // {"A".."Z" "a" "d" "g" "j".."k" "m".."n" "q".."s" "y".."z"}
816, // "p"
816, // "v"
816, // "c"
816, // "f"
816, // "i"
816, // "l"
816, // "o"
816, // "u"
816, // "x"
816, // "b"
816, // "e"
816, // "h"
816, // "t"
816, // "w"
374, // letter128
189, // {199..218 231..250}
189, // {193..198 225..230}
-1, // digit
269, // {"1".."9"}
1084, // "0"
591, // digit128
1279, // {176..185}
-1, // ws
-1, // " "
-1, // {10}
395, // "#"
-1, // "+"
-1, // "*"
960, // "("
-1, // ")"
887, // "{"
-1, // "}"
1296, // "-"
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
{ // state 623
2,818, // ws*
23,MIN_REDUCTION+100, // `[
73,1128, // ws
74,161, // " "
75,28, // {10}
85,MIN_REDUCTION+100, // "["
MIN_REDUCTION+100, // (default reduction)
  }
,
{ // state 624
16,68, // `(
79,619, // "("
  }
,
{ // state 625
7,1002, // ID
49,121, // letter
50,816, // {"A".."Z" "a" "d" "g" "j".."k" "m".."n" "q".."s" "y".."z"}
51,816, // "p"
52,816, // "v"
53,816, // "c"
54,816, // "f"
55,816, // "i"
56,816, // "l"
57,816, // "o"
58,816, // "u"
59,816, // "x"
60,816, // "b"
61,816, // "e"
62,816, // "h"
63,816, // "t"
64,816, // "w"
65,237, // letter128
66,658, // {199..218 231..250}
67,658, // {193..198 225..230}
  }
,
{ // state 626
17,679, // `)
22,1057, // <empty bracket pair>
23,1339, // `[
80,1126, // ")"
85,895, // "["
  }
,
{ // state 627
73,1270, // ws
74,996, // " "
75,571, // {10}
MIN_REDUCTION+79, // (default reduction)
  }
,
{ // state 628
2,79, // ws*
73,989, // ws
74,316, // " "
75,342, // {10}
MIN_REDUCTION+70, // (default reduction)
  }
,
{ // state 629
24,898, // `]
86,175, // "]"
  }
,
{ // state 630
23,1306, // `[
85,369, // "["
101,MIN_REDUCTION+39, // $NT
MIN_REDUCTION+39, // (default reduction)
  }
,
{ // state 631
2,775, // ws*
  }
,
{ // state 632
17,MIN_REDUCTION+49, // `)
80,MIN_REDUCTION+49, // ")"
MIN_REDUCTION+49, // (default reduction)
  }
,
{ // state 633
2,771, // ws*
  }
,
{ // state 634
MIN_REDUCTION+124, // (default reduction)
  }
,
{ // state 635
24,906, // `]
86,333, // "]"
  }
,
{ // state 636
0x80000000|181, // match move
0x80000000|1016, // no-match move
0x80000000|47, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 637
73,1250, // ws
74,975, // " "
75,581, // {10}
MIN_REDUCTION+79, // (default reduction)
  }
,
{ // state 638
MIN_REDUCTION+48, // (default reduction)
  }
,
{ // state 639
0x80000000|1235, // match move
0x80000000|154, // no-match move
0x80000000|1145, // NT-test-match state for `else
  }
,
{ // state 640
2,693, // ws*
  }
,
{ // state 641
23,1306, // `[
85,369, // "["
101,MIN_REDUCTION+41, // $NT
MIN_REDUCTION+41, // (default reduction)
  }
,
{ // state 642
23,MIN_REDUCTION+89, // `[
73,8, // ws
74,126, // " "
75,123, // {10}
85,MIN_REDUCTION+89, // "["
MIN_REDUCTION+89, // (default reduction)
  }
,
{ // state 643
23,MIN_REDUCTION+110, // `[
85,MIN_REDUCTION+110, // "["
MIN_REDUCTION+110, // (default reduction)
  }
,
{ // state 644
49,676, // letter
50,67, // {"A".."Z" "a" "d" "g" "j".."k" "m".."n" "q".."s" "y".."z"}
51,67, // "p"
52,67, // "v"
53,67, // "c"
54,67, // "f"
55,67, // "i"
56,67, // "l"
57,67, // "o"
58,67, // "u"
59,67, // "x"
60,67, // "b"
61,67, // "e"
62,67, // "h"
63,67, // "t"
64,67, // "w"
65,12, // letter128
66,1049, // {199..218 231..250}
67,1049, // {193..198 225..230}
68,290, // digit
69,253, // {"1".."9"}
70,253, // "0"
71,1305, // digit128
72,324, // {176..185}
88,504, // idChar*
89,129, // $$0
94,532, // idChar
95,1227, // "_"
96,762, // idChar128
97,404, // {223}
  }
,
{ // state 645
0x80000000|148, // match move
0x80000000|220, // no-match move
0x80000000|47, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 646
31,968, // `else
76,475, // "#"
  }
,
{ // state 647
MIN_REDUCTION+114, // (default reduction)
  }
,
{ // state 648
MIN_REDUCTION+95, // (default reduction)
  }
,
{ // state 649
42,467, // `*
78,1150, // "*"
101,MIN_REDUCTION+33, // $NT
MIN_REDUCTION+33, // (default reduction)
  }
,
{ // state 650
MIN_REDUCTION+10, // (default reduction)
  }
,
{ // state 651
MIN_REDUCTION+106, // (default reduction)
  }
,
{ // state 652
2,775, // ws*
23,MIN_REDUCTION+100, // `[
73,1146, // ws
74,142, // " "
75,158, // {10}
85,MIN_REDUCTION+100, // "["
MIN_REDUCTION+100, // (default reduction)
  }
,
{ // state 653
23,MIN_REDUCTION+42, // `[
85,MIN_REDUCTION+42, // "["
MIN_REDUCTION+42, // (default reduction)
  }
,
{ // state 654
16,151, // `(
79,16, // "("
  }
,
{ // state 655
101,MIN_REDUCTION+97, // $NT
  }
,
{ // state 656
2,771, // ws*
23,MIN_REDUCTION+100, // `[
73,1143, // ws
74,139, // " "
75,162, // {10}
85,MIN_REDUCTION+100, // "["
MIN_REDUCTION+100, // (default reduction)
  }
,
{ // state 657
73,1025, // ws
74,744, // " "
75,1256, // {10}
MIN_REDUCTION+51, // (default reduction)
  }
,
{ // state 658
MIN_REDUCTION+46, // (default reduction)
  }
,
{ // state 659
73,63, // ws
74,1259, // " "
75,700, // {10}
MIN_REDUCTION+53, // (default reduction)
  }
,
{ // state 660
16,728, // `(
79,1065, // "("
  }
,
{ // state 661
-1, // $$start
-1, // <start>
-1, // ws*
-1, // <program>
-1, // <class decl>+
-1, // <class decl>
-1, // `class
264, // ID
711, // `{
-1, // <decl in class>*
-1, // `}
-1, // `extends
-1, // <decl in class>
-1, // <method decl>
-1, // `public
-1, // `void
518, // `(
-1, // `)
-1, // <stmt>*
209, // <type>
924, // `int
930, // `boolean
-1, // <empty bracket pair>
-1, // `[
-1, // `]
499, // <stmt>
1167, // <assign>
-1, // `;
366, // <local var decl>
680, // `if
592, // <exp>
-1, // `else
210, // `while
803, // `for
-1, // `=
1153, // <exp8>
325, // <exp7>
19, // <exp6>
25, // <exp5>
101, // <exp4>
-1, // `+
483, // <exp3>
-1, // `*
78, // <exp2>
258, // <cast exp>
490, // <unary exp>
95, // <exp1>
854, // `-
461, // INTLIT
1239, // letter
816, // {"A".."Z" "a" "d" "g" "j".."k" "m".."n" "q".."s" "y".."z"}
816, // "p"
816, // "v"
816, // "c"
816, // "f"
816, // "i"
816, // "l"
816, // "o"
816, // "u"
816, // "x"
816, // "b"
816, // "e"
816, // "h"
816, // "t"
816, // "w"
374, // letter128
189, // {199..218 231..250}
189, // {193..198 225..230}
-1, // digit
269, // {"1".."9"}
1084, // "0"
591, // digit128
1279, // {176..185}
-1, // ws
-1, // " "
-1, // {10}
395, // "#"
-1, // "+"
-1, // "*"
960, // "("
-1, // ")"
887, // "{"
-1, // "}"
1296, // "-"
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
{ // state 662
2,769, // ws*
MIN_REDUCTION+92, // (default reduction)
  }
,
{ // state 663
23,MIN_REDUCTION+89, // `[
73,41, // ws
74,142, // " "
75,158, // {10}
85,MIN_REDUCTION+89, // "["
MIN_REDUCTION+89, // (default reduction)
  }
,
{ // state 664
73,1025, // ws
74,744, // " "
75,1256, // {10}
MIN_REDUCTION+59, // (default reduction)
  }
,
{ // state 665
23,MIN_REDUCTION+89, // `[
73,39, // ws
74,139, // " "
75,162, // {10}
85,MIN_REDUCTION+89, // "["
MIN_REDUCTION+89, // (default reduction)
  }
,
{ // state 666
68,1052, // digit
69,1100, // {"1".."9"}
70,1100, // "0"
71,1283, // digit128
72,1282, // {176..185}
91,188, // $$1
  }
,
{ // state 667
23,MIN_REDUCTION+42, // `[
85,MIN_REDUCTION+42, // "["
MIN_REDUCTION+42, // (default reduction)
  }
,
{ // state 668
57,1144, // "o"
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
264, // ID
734, // `{
-1, // <decl in class>*
-1, // `}
-1, // `extends
-1, // <decl in class>
-1, // <method decl>
-1, // `public
-1, // `void
518, // `(
-1, // `)
-1, // <stmt>*
209, // <type>
924, // `int
930, // `boolean
-1, // <empty bracket pair>
-1, // `[
-1, // `]
38, // <stmt>
170, // <assign>
-1, // `;
1063, // <local var decl>
1276, // `if
592, // <exp>
-1, // `else
578, // `while
1245, // `for
-1, // `=
1153, // <exp8>
325, // <exp7>
19, // <exp6>
25, // <exp5>
101, // <exp4>
-1, // `+
483, // <exp3>
-1, // `*
78, // <exp2>
258, // <cast exp>
490, // <unary exp>
95, // <exp1>
854, // `-
461, // INTLIT
1239, // letter
816, // {"A".."Z" "a" "d" "g" "j".."k" "m".."n" "q".."s" "y".."z"}
816, // "p"
816, // "v"
816, // "c"
816, // "f"
816, // "i"
816, // "l"
816, // "o"
816, // "u"
816, // "x"
816, // "b"
816, // "e"
816, // "h"
816, // "t"
816, // "w"
374, // letter128
189, // {199..218 231..250}
189, // {193..198 225..230}
-1, // digit
269, // {"1".."9"}
1084, // "0"
591, // digit128
1279, // {176..185}
-1, // ws
-1, // " "
-1, // {10}
395, // "#"
-1, // "+"
-1, // "*"
960, // "("
-1, // ")"
887, // "{"
-1, // "}"
1296, // "-"
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
{ // state 670
2,693, // ws*
23,MIN_REDUCTION+100, // `[
73,1138, // ws
74,126, // " "
75,123, // {10}
85,MIN_REDUCTION+100, // "["
MIN_REDUCTION+100, // (default reduction)
  }
,
{ // state 671
68,1052, // digit
69,1100, // {"1".."9"}
70,1100, // "0"
71,1278, // digit128
72,1279, // {176..185}
91,186, // $$1
  }
,
{ // state 672
23,MIN_REDUCTION+42, // `[
85,MIN_REDUCTION+42, // "["
MIN_REDUCTION+42, // (default reduction)
  }
,
{ // state 673
-1, // $$start
-1, // <start>
-1, // ws*
-1, // <program>
-1, // <class decl>+
-1, // <class decl>
-1, // `class
264, // ID
711, // `{
-1, // <decl in class>*
-1, // `}
-1, // `extends
-1, // <decl in class>
-1, // <method decl>
-1, // `public
-1, // `void
518, // `(
-1, // `)
-1, // <stmt>*
209, // <type>
924, // `int
930, // `boolean
-1, // <empty bracket pair>
-1, // `[
-1, // `]
514, // <stmt>
1167, // <assign>
-1, // `;
366, // <local var decl>
680, // `if
592, // <exp>
-1, // `else
210, // `while
803, // `for
-1, // `=
1153, // <exp8>
325, // <exp7>
19, // <exp6>
25, // <exp5>
101, // <exp4>
-1, // `+
483, // <exp3>
-1, // `*
78, // <exp2>
258, // <cast exp>
490, // <unary exp>
95, // <exp1>
854, // `-
461, // INTLIT
1239, // letter
816, // {"A".."Z" "a" "d" "g" "j".."k" "m".."n" "q".."s" "y".."z"}
816, // "p"
816, // "v"
816, // "c"
816, // "f"
816, // "i"
816, // "l"
816, // "o"
816, // "u"
816, // "x"
816, // "b"
816, // "e"
816, // "h"
816, // "t"
816, // "w"
374, // letter128
189, // {199..218 231..250}
189, // {193..198 225..230}
-1, // digit
269, // {"1".."9"}
1084, // "0"
591, // digit128
1279, // {176..185}
-1, // ws
-1, // " "
-1, // {10}
395, // "#"
-1, // "+"
-1, // "*"
960, // "("
-1, // ")"
887, // "{"
-1, // "}"
1296, // "-"
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
{ // state 674
2,1309, // ws*
23,MIN_REDUCTION+130, // `[
73,1174, // ws
74,90, // " "
75,99, // {10}
85,MIN_REDUCTION+130, // "["
101,MIN_REDUCTION+130, // $NT
MIN_REDUCTION+130, // (default reduction)
  }
,
{ // state 675
24,1181, // `]
86,213, // "]"
  }
,
{ // state 676
MIN_REDUCTION+103, // (default reduction)
  }
,
{ // state 677
23,MIN_REDUCTION+110, // `[
85,MIN_REDUCTION+110, // "["
101,MIN_REDUCTION+110, // $NT
MIN_REDUCTION+110, // (default reduction)
  }
,
{ // state 678
2,795, // ws*
MIN_REDUCTION+92, // (default reduction)
  }
,
{ // state 679
7,328, // ID
16,904, // `(
44,798, // <cast exp>
46,242, // <exp1>
48,534, // INTLIT
49,936, // letter
50,816, // {"A".."Z" "a" "d" "g" "j".."k" "m".."n" "q".."s" "y".."z"}
51,816, // "p"
52,816, // "v"
53,816, // "c"
54,816, // "f"
55,816, // "i"
56,816, // "l"
57,816, // "o"
58,816, // "u"
59,816, // "x"
60,816, // "b"
61,816, // "e"
62,816, // "h"
63,816, // "t"
64,816, // "w"
65,1059, // letter128
66,828, // {199..218 231..250}
67,828, // {193..198 225..230}
69,378, // {"1".."9"}
70,191, // "0"
71,359, // digit128
72,1214, // {176..185}
79,960, // "("
  }
,
{ // state 680
16,4, // `(
79,619, // "("
  }
,
{ // state 681
68,1052, // digit
69,1100, // {"1".."9"}
70,1100, // "0"
71,1292, // digit128
72,1269, // {176..185}
91,250, // $$1
  }
,
{ // state 682
23,MIN_REDUCTION+42, // `[
85,MIN_REDUCTION+42, // "["
MIN_REDUCTION+42, // (default reduction)
  }
,
{ // state 683
23,MIN_REDUCTION+102, // `[
85,MIN_REDUCTION+102, // "["
MIN_REDUCTION+102, // (default reduction)
  }
,
{ // state 684
-1, // $$start
-1, // <start>
-1, // ws*
-1, // <program>
-1, // <class decl>+
-1, // <class decl>
-1, // `class
264, // ID
708, // `{
-1, // <decl in class>*
-1, // `}
-1, // `extends
-1, // <decl in class>
-1, // <method decl>
-1, // `public
-1, // `void
518, // `(
-1, // `)
-1, // <stmt>*
209, // <type>
924, // `int
930, // `boolean
-1, // <empty bracket pair>
-1, // `[
-1, // `]
1191, // <stmt>
957, // <assign>
-1, // `;
401, // <local var decl>
1310, // `if
592, // <exp>
-1, // `else
390, // `while
905, // `for
-1, // `=
1153, // <exp8>
325, // <exp7>
19, // <exp6>
25, // <exp5>
101, // <exp4>
-1, // `+
483, // <exp3>
-1, // `*
78, // <exp2>
258, // <cast exp>
490, // <unary exp>
95, // <exp1>
854, // `-
461, // INTLIT
1239, // letter
816, // {"A".."Z" "a" "d" "g" "j".."k" "m".."n" "q".."s" "y".."z"}
816, // "p"
816, // "v"
816, // "c"
816, // "f"
816, // "i"
816, // "l"
816, // "o"
816, // "u"
816, // "x"
816, // "b"
816, // "e"
816, // "h"
816, // "t"
816, // "w"
374, // letter128
189, // {199..218 231..250}
189, // {193..198 225..230}
-1, // digit
269, // {"1".."9"}
1084, // "0"
591, // digit128
1279, // {176..185}
-1, // ws
-1, // " "
-1, // {10}
395, // "#"
-1, // "+"
-1, // "*"
960, // "("
-1, // ")"
887, // "{"
-1, // "}"
1296, // "-"
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
{ // state 685
-1, // $$start
-1, // <start>
-1, // ws*
-1, // <program>
-1, // <class decl>+
-1, // <class decl>
-1, // `class
264, // ID
774, // `{
-1, // <decl in class>*
-1, // `}
-1, // `extends
-1, // <decl in class>
-1, // <method decl>
-1, // `public
-1, // `void
518, // `(
-1, // `)
-1, // <stmt>*
209, // <type>
924, // `int
930, // `boolean
-1, // <empty bracket pair>
-1, // `[
-1, // `]
34, // <stmt>
183, // <assign>
-1, // `;
1035, // <local var decl>
1327, // `if
592, // <exp>
-1, // `else
660, // `while
1224, // `for
-1, // `=
1153, // <exp8>
325, // <exp7>
19, // <exp6>
25, // <exp5>
101, // <exp4>
-1, // `+
483, // <exp3>
-1, // `*
78, // <exp2>
258, // <cast exp>
490, // <unary exp>
95, // <exp1>
854, // `-
461, // INTLIT
1239, // letter
816, // {"A".."Z" "a" "d" "g" "j".."k" "m".."n" "q".."s" "y".."z"}
816, // "p"
816, // "v"
816, // "c"
816, // "f"
816, // "i"
816, // "l"
816, // "o"
816, // "u"
816, // "x"
816, // "b"
816, // "e"
816, // "h"
816, // "t"
816, // "w"
374, // letter128
189, // {199..218 231..250}
189, // {193..198 225..230}
-1, // digit
269, // {"1".."9"}
1084, // "0"
591, // digit128
1279, // {176..185}
-1, // ws
-1, // " "
-1, // {10}
395, // "#"
-1, // "+"
-1, // "*"
960, // "("
-1, // ")"
887, // "{"
-1, // "}"
1296, // "-"
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
{ // state 686
MIN_REDUCTION+38, // (default reduction)
  }
,
{ // state 687
23,1067, // `[
85,369, // "["
MIN_REDUCTION+41, // (default reduction)
  }
,
{ // state 688
2,940, // ws*
73,515, // ws
74,91, // " "
75,1170, // {10}
MIN_REDUCTION+92, // (default reduction)
  }
,
{ // state 689
2,389, // ws*
73,780, // ws
74,352, // " "
75,284, // {10}
MIN_REDUCTION+126, // (default reduction)
  }
,
{ // state 690
23,MIN_REDUCTION+127, // `[
73,53, // ws
74,161, // " "
75,28, // {10}
85,MIN_REDUCTION+127, // "["
MIN_REDUCTION+127, // (default reduction)
  }
,
{ // state 691
27,412, // `;
87,227, // ";"
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
264, // ID
855, // `{
-1, // <decl in class>*
-1, // `}
-1, // `extends
-1, // <decl in class>
-1, // <method decl>
-1, // `public
-1, // `void
518, // `(
-1, // `)
-1, // <stmt>*
209, // <type>
924, // `int
930, // `boolean
-1, // <empty bracket pair>
-1, // `[
-1, // `]
1105, // <stmt>
1176, // <assign>
-1, // `;
533, // <local var decl>
624, // `if
592, // <exp>
-1, // `else
1131, // `while
840, // `for
-1, // `=
1153, // <exp8>
325, // <exp7>
19, // <exp6>
25, // <exp5>
101, // <exp4>
-1, // `+
483, // <exp3>
-1, // `*
78, // <exp2>
258, // <cast exp>
490, // <unary exp>
95, // <exp1>
854, // `-
461, // INTLIT
1239, // letter
816, // {"A".."Z" "a" "d" "g" "j".."k" "m".."n" "q".."s" "y".."z"}
816, // "p"
816, // "v"
816, // "c"
816, // "f"
816, // "i"
816, // "l"
816, // "o"
816, // "u"
816, // "x"
816, // "b"
816, // "e"
816, // "h"
816, // "t"
816, // "w"
374, // letter128
189, // {199..218 231..250}
189, // {193..198 225..230}
-1, // digit
269, // {"1".."9"}
1084, // "0"
591, // digit128
1279, // {176..185}
-1, // ws
-1, // " "
-1, // {10}
395, // "#"
-1, // "+"
-1, // "*"
960, // "("
-1, // ")"
887, // "{"
-1, // "}"
1296, // "-"
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
{ // state 693
0x80000000|1, // match move
0x80000000|536, // no-match move
0x80000000|47, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 694
2,1165, // ws*
73,783, // ws
74,350, // " "
75,282, // {10}
MIN_REDUCTION+74, // (default reduction)
  }
,
{ // state 695
23,MIN_REDUCTION+106, // `[
85,MIN_REDUCTION+106, // "["
MIN_REDUCTION+106, // (default reduction)
  }
,
{ // state 696
-1, // $$start
-1, // <start>
-1, // ws*
-1, // <program>
-1, // <class decl>+
-1, // <class decl>
-1, // `class
264, // ID
731, // `{
-1, // <decl in class>*
-1, // `}
-1, // `extends
-1, // <decl in class>
-1, // <method decl>
-1, // `public
-1, // `void
518, // `(
-1, // `)
-1, // <stmt>*
209, // <type>
924, // `int
930, // `boolean
-1, // <empty bracket pair>
-1, // `[
-1, // `]
1290, // <stmt>
691, // <assign>
-1, // `;
1106, // <local var decl>
920, // `if
592, // <exp>
-1, // `else
701, // `while
208, // `for
-1, // `=
1153, // <exp8>
325, // <exp7>
19, // <exp6>
25, // <exp5>
101, // <exp4>
-1, // `+
483, // <exp3>
-1, // `*
78, // <exp2>
258, // <cast exp>
490, // <unary exp>
95, // <exp1>
854, // `-
461, // INTLIT
1239, // letter
816, // {"A".."Z" "a" "d" "g" "j".."k" "m".."n" "q".."s" "y".."z"}
816, // "p"
816, // "v"
816, // "c"
816, // "f"
816, // "i"
816, // "l"
816, // "o"
816, // "u"
816, // "x"
816, // "b"
816, // "e"
816, // "h"
816, // "t"
816, // "w"
374, // letter128
189, // {199..218 231..250}
189, // {193..198 225..230}
-1, // digit
269, // {"1".."9"}
1084, // "0"
591, // digit128
1279, // {176..185}
-1, // ws
-1, // " "
-1, // {10}
395, // "#"
-1, // "+"
-1, // "*"
960, // "("
-1, // ")"
887, // "{"
-1, // "}"
1296, // "-"
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
{ // state 697
MIN_REDUCTION+49, // (default reduction)
  }
,
{ // state 698
0x80000000|1235, // match move
0x80000000|1261, // no-match move
0x80000000|1145, // NT-test-match state for `else
  }
,
{ // state 699
MIN_REDUCTION+22, // (default reduction)
  }
,
{ // state 700
MIN_REDUCTION+50, // (default reduction)
  }
,
{ // state 701
16,448, // `(
79,1065, // "("
  }
,
{ // state 702
MIN_REDUCTION+108, // (default reduction)
  }
,
{ // state 703
27,286, // `;
87,1097, // ";"
  }
,
{ // state 704
17,684, // `)
80,588, // ")"
  }
,
{ // state 705
MIN_REDUCTION+124, // (default reduction)
  }
,
{ // state 706
MIN_REDUCTION+124, // (default reduction)
  }
,
{ // state 707
23,MIN_REDUCTION+89, // `[
73,53, // ws
74,161, // " "
75,28, // {10}
85,MIN_REDUCTION+89, // "["
MIN_REDUCTION+89, // (default reduction)
  }
,
{ // state 708
-1, // $$start
-1, // <start>
-1, // ws*
-1, // <program>
-1, // <class decl>+
-1, // <class decl>
-1, // `class
264, // ID
708, // `{
-1, // <decl in class>*
908, // `}
-1, // `extends
-1, // <decl in class>
-1, // <method decl>
-1, // `public
-1, // `void
518, // `(
-1, // `)
168, // <stmt>*
209, // <type>
924, // `int
930, // `boolean
-1, // <empty bracket pair>
-1, // `[
-1, // `]
1287, // <stmt>
957, // <assign>
-1, // `;
401, // <local var decl>
1310, // `if
592, // <exp>
-1, // `else
390, // `while
905, // `for
-1, // `=
1153, // <exp8>
325, // <exp7>
19, // <exp6>
25, // <exp5>
101, // <exp4>
-1, // `+
483, // <exp3>
-1, // `*
78, // <exp2>
258, // <cast exp>
490, // <unary exp>
95, // <exp1>
854, // `-
461, // INTLIT
1239, // letter
816, // {"A".."Z" "a" "d" "g" "j".."k" "m".."n" "q".."s" "y".."z"}
816, // "p"
816, // "v"
816, // "c"
816, // "f"
816, // "i"
816, // "l"
816, // "o"
816, // "u"
816, // "x"
816, // "b"
816, // "e"
816, // "h"
816, // "t"
816, // "w"
374, // letter128
189, // {199..218 231..250}
189, // {193..198 225..230}
-1, // digit
269, // {"1".."9"}
1084, // "0"
591, // digit128
1279, // {176..185}
-1, // ws
-1, // " "
-1, // {10}
395, // "#"
-1, // "+"
-1, // "*"
960, // "("
-1, // ")"
887, // "{"
600, // "}"
1296, // "-"
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
{ // state 709
0x80000000|347, // match move
0x80000000|146, // no-match move
0x80000000|47, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 710
0x80000000|1235, // match move
0x80000000|1219, // no-match move
0x80000000|1145, // NT-test-match state for `else
  }
,
{ // state 711
-1, // $$start
-1, // <start>
-1, // ws*
-1, // <program>
-1, // <class decl>+
-1, // <class decl>
-1, // `class
264, // ID
708, // `{
-1, // <decl in class>*
462, // `}
-1, // `extends
-1, // <decl in class>
-1, // <method decl>
-1, // `public
-1, // `void
518, // `(
-1, // `)
20, // <stmt>*
209, // <type>
924, // `int
930, // `boolean
-1, // <empty bracket pair>
-1, // `[
-1, // `]
1287, // <stmt>
957, // <assign>
-1, // `;
401, // <local var decl>
1310, // `if
592, // <exp>
-1, // `else
390, // `while
905, // `for
-1, // `=
1153, // <exp8>
325, // <exp7>
19, // <exp6>
25, // <exp5>
101, // <exp4>
-1, // `+
483, // <exp3>
-1, // `*
78, // <exp2>
258, // <cast exp>
490, // <unary exp>
95, // <exp1>
854, // `-
461, // INTLIT
1239, // letter
816, // {"A".."Z" "a" "d" "g" "j".."k" "m".."n" "q".."s" "y".."z"}
816, // "p"
816, // "v"
816, // "c"
816, // "f"
816, // "i"
816, // "l"
816, // "o"
816, // "u"
816, // "x"
816, // "b"
816, // "e"
816, // "h"
816, // "t"
816, // "w"
374, // letter128
189, // {199..218 231..250}
189, // {193..198 225..230}
-1, // digit
269, // {"1".."9"}
1084, // "0"
591, // digit128
1279, // {176..185}
-1, // ws
-1, // " "
-1, // {10}
395, // "#"
-1, // "+"
-1, // "*"
960, // "("
-1, // ")"
887, // "{"
993, // "}"
1296, // "-"
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
{ // state 712
56,1267, // "l"
  }
,
{ // state 713
16,160, // `(
79,694, // "("
  }
,
{ // state 714
MIN_REDUCTION+22, // (default reduction)
  }
,
{ // state 715
23,MIN_REDUCTION+106, // `[
85,MIN_REDUCTION+106, // "["
MIN_REDUCTION+106, // (default reduction)
  }
,
{ // state 716
2,1152, // ws*
  }
,
{ // state 717
73,1250, // ws
74,975, // " "
75,581, // {10}
MIN_REDUCTION+91, // (default reduction)
  }
,
{ // state 718
2,265, // ws*
73,973, // ws
74,997, // " "
75,329, // {10}
101,MIN_REDUCTION+66, // $NT
  }
,
{ // state 719
73,MIN_REDUCTION+50, // ws
74,MIN_REDUCTION+50, // " "
75,MIN_REDUCTION+50, // {10}
MIN_REDUCTION+50, // (default reduction)
  }
,
{ // state 720
23,MIN_REDUCTION+106, // `[
85,MIN_REDUCTION+106, // "["
MIN_REDUCTION+106, // (default reduction)
  }
,
{ // state 721
MIN_REDUCTION+49, // (default reduction)
  }
,
{ // state 722
57,1135, // "o"
  }
,
{ // state 723
0x80000000|1206, // match move
0x80000000|964, // no-match move
0x80000000|47, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 724
0x80000000|782, // match move
0x80000000|595, // no-match move
0x80000000|47, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 725
17,297, // `)
80,588, // ")"
  }
,
{ // state 726
16,469, // `(
79,1065, // "("
  }
,
{ // state 727
0x80000000|405, // match move
0x80000000|204, // no-match move
0x80000000|1145, // NT-test-match state for `else
  }
,
{ // state 728
0x80000000|557, // match move
0x80000000|577, // no-match move
0x80000000|801, // NT-test-match state for <exp>
  }
,
{ // state 729
23,MIN_REDUCTION+123, // `[
85,MIN_REDUCTION+123, // "["
101,MIN_REDUCTION+123, // $NT
MIN_REDUCTION+123, // (default reduction)
  }
,
{ // state 730
0x80000000|884, // match move
0x80000000|444, // no-match move
0x80000000|1145, // NT-test-match state for `else
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
264, // ID
708, // `{
-1, // <decl in class>*
198, // `}
-1, // `extends
-1, // <decl in class>
-1, // <method decl>
-1, // `public
-1, // `void
518, // `(
-1, // `)
980, // <stmt>*
209, // <type>
924, // `int
930, // `boolean
-1, // <empty bracket pair>
-1, // `[
-1, // `]
1287, // <stmt>
957, // <assign>
-1, // `;
401, // <local var decl>
1310, // `if
592, // <exp>
-1, // `else
390, // `while
905, // `for
-1, // `=
1153, // <exp8>
325, // <exp7>
19, // <exp6>
25, // <exp5>
101, // <exp4>
-1, // `+
483, // <exp3>
-1, // `*
78, // <exp2>
258, // <cast exp>
490, // <unary exp>
95, // <exp1>
854, // `-
461, // INTLIT
1239, // letter
816, // {"A".."Z" "a" "d" "g" "j".."k" "m".."n" "q".."s" "y".."z"}
816, // "p"
816, // "v"
816, // "c"
816, // "f"
816, // "i"
816, // "l"
816, // "o"
816, // "u"
816, // "x"
816, // "b"
816, // "e"
816, // "h"
816, // "t"
816, // "w"
374, // letter128
189, // {199..218 231..250}
189, // {193..198 225..230}
-1, // digit
269, // {"1".."9"}
1084, // "0"
591, // digit128
1279, // {176..185}
-1, // ws
-1, // " "
-1, // {10}
395, // "#"
-1, // "+"
-1, // "*"
960, // "("
-1, // ")"
887, // "{"
281, // "}"
1296, // "-"
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
{ // state 732
101,MIN_REDUCTION+15, // $NT
  }
,
{ // state 733
MIN_REDUCTION+124, // (default reduction)
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
264, // ID
708, // `{
-1, // <decl in class>*
192, // `}
-1, // `extends
-1, // <decl in class>
-1, // <method decl>
-1, // `public
-1, // `void
518, // `(
-1, // `)
180, // <stmt>*
209, // <type>
924, // `int
930, // `boolean
-1, // <empty bracket pair>
-1, // `[
-1, // `]
1287, // <stmt>
957, // <assign>
-1, // `;
401, // <local var decl>
1310, // `if
592, // <exp>
-1, // `else
390, // `while
905, // `for
-1, // `=
1153, // <exp8>
325, // <exp7>
19, // <exp6>
25, // <exp5>
101, // <exp4>
-1, // `+
483, // <exp3>
-1, // `*
78, // <exp2>
258, // <cast exp>
490, // <unary exp>
95, // <exp1>
854, // `-
461, // INTLIT
1239, // letter
816, // {"A".."Z" "a" "d" "g" "j".."k" "m".."n" "q".."s" "y".."z"}
816, // "p"
816, // "v"
816, // "c"
816, // "f"
816, // "i"
816, // "l"
816, // "o"
816, // "u"
816, // "x"
816, // "b"
816, // "e"
816, // "h"
816, // "t"
816, // "w"
374, // letter128
189, // {199..218 231..250}
189, // {193..198 225..230}
-1, // digit
269, // {"1".."9"}
1084, // "0"
591, // digit128
1279, // {176..185}
-1, // ws
-1, // " "
-1, // {10}
395, // "#"
-1, // "+"
-1, // "*"
960, // "("
-1, // ")"
887, // "{"
1071, // "}"
1296, // "-"
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
{ // state 735
0x80000000|347, // match move
0x80000000|1188, // no-match move
0x80000000|47, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 736
MIN_REDUCTION+23, // (default reduction)
  }
,
{ // state 737
0x80000000|347, // match move
0x80000000|167, // no-match move
0x80000000|47, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 738
2,1309, // ws*
101,MIN_REDUCTION+130, // $NT
  }
,
{ // state 739
50,1066, // {"A".."Z" "a" "d" "g" "j".."k" "m".."n" "q".."s" "y".."z"}
51,1066, // "p"
52,1066, // "v"
53,1066, // "c"
54,1066, // "f"
55,1066, // "i"
56,1066, // "l"
57,1066, // "o"
58,1066, // "u"
59,1066, // "x"
60,1066, // "b"
61,1066, // "e"
62,1066, // "h"
63,1066, // "t"
64,1066, // "w"
67,65, // {193..198 225..230}
69,1066, // {"1".."9"}
70,1066, // "0"
72,65, // {176..185}
93,493, // $$2
98,779, // hexDigit
99,620, // hexDigit128
  }
,
{ // state 740
0x80000000|884, // match move
0x80000000|460, // no-match move
0x80000000|1145, // NT-test-match state for `else
  }
,
{ // state 741
-1, // $$start
-1, // <start>
-1, // ws*
-1, // <program>
-1, // <class decl>+
-1, // <class decl>
-1, // `class
264, // ID
774, // `{
-1, // <decl in class>*
-1, // `}
-1, // `extends
-1, // <decl in class>
-1, // <method decl>
-1, // `public
-1, // `void
518, // `(
-1, // `)
-1, // <stmt>*
209, // <type>
924, // `int
930, // `boolean
-1, // <empty bracket pair>
-1, // `[
-1, // `]
1042, // <stmt>
183, // <assign>
-1, // `;
1035, // <local var decl>
1327, // `if
592, // <exp>
-1, // `else
660, // `while
1224, // `for
-1, // `=
1153, // <exp8>
325, // <exp7>
19, // <exp6>
25, // <exp5>
101, // <exp4>
-1, // `+
483, // <exp3>
-1, // `*
78, // <exp2>
258, // <cast exp>
490, // <unary exp>
95, // <exp1>
854, // `-
461, // INTLIT
1239, // letter
816, // {"A".."Z" "a" "d" "g" "j".."k" "m".."n" "q".."s" "y".."z"}
816, // "p"
816, // "v"
816, // "c"
816, // "f"
816, // "i"
816, // "l"
816, // "o"
816, // "u"
816, // "x"
816, // "b"
816, // "e"
816, // "h"
816, // "t"
816, // "w"
374, // letter128
189, // {199..218 231..250}
189, // {193..198 225..230}
-1, // digit
269, // {"1".."9"}
1084, // "0"
591, // digit128
1279, // {176..185}
-1, // ws
-1, // " "
-1, // {10}
395, // "#"
-1, // "+"
-1, // "*"
960, // "("
-1, // ")"
887, // "{"
-1, // "}"
1296, // "-"
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
{ // state 742
17,144, // `)
80,588, // ")"
  }
,
{ // state 743
23,MIN_REDUCTION+49, // `[
85,MIN_REDUCTION+49, // "["
MIN_REDUCTION+49, // (default reduction)
  }
,
{ // state 744
MIN_REDUCTION+49, // (default reduction)
  }
,
{ // state 745
7,218, // ID
16,523, // `(
30,1114, // <exp>
35,1156, // <exp8>
36,320, // <exp7>
37,24, // <exp6>
38,22, // <exp5>
39,138, // <exp4>
41,480, // <exp3>
43,83, // <exp2>
44,256, // <cast exp>
45,491, // <unary exp>
46,111, // <exp1>
47,851, // `-
48,465, // INTLIT
49,972, // letter
50,816, // {"A".."Z" "a" "d" "g" "j".."k" "m".."n" "q".."s" "y".."z"}
51,816, // "p"
52,816, // "v"
53,816, // "c"
54,816, // "f"
55,816, // "i"
56,816, // "l"
57,816, // "o"
58,816, // "u"
59,816, // "x"
60,816, // "b"
61,816, // "e"
62,816, // "h"
63,816, // "t"
64,816, // "w"
65,1229, // letter128
66,735, // {199..218 231..250}
67,735, // {193..198 225..230}
69,272, // {"1".."9"}
70,1080, // "0"
71,593, // digit128
72,1282, // {176..185}
79,960, // "("
83,1296, // "-"
  }
,
{ // state 746
23,MIN_REDUCTION+107, // `[
85,MIN_REDUCTION+107, // "["
MIN_REDUCTION+107, // (default reduction)
  }
,
{ // state 747
23,MIN_REDUCTION+106, // `[
85,MIN_REDUCTION+106, // "["
MIN_REDUCTION+106, // (default reduction)
  }
,
{ // state 748
0x80000000|749, // match move
0x80000000|564, // no-match move
0x80000000|47, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 749
2,1116, // ws*
  }
,
{ // state 750
MIN_REDUCTION+15, // (default reduction)
  }
,
{ // state 751
0x80000000|884, // match move
0x80000000|349, // no-match move
0x80000000|1145, // NT-test-match state for `else
  }
,
{ // state 752
0x80000000|347, // match move
0x80000000|1196, // no-match move
0x80000000|47, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 753
MIN_REDUCTION+23, // (default reduction)
  }
,
{ // state 754
MIN_REDUCTION+48, // (default reduction)
  }
,
{ // state 755
73,MIN_REDUCTION+123, // ws
74,MIN_REDUCTION+123, // " "
75,MIN_REDUCTION+123, // {10}
MIN_REDUCTION+123, // (default reduction)
  }
,
{ // state 756
0x80000000|1280, // match move
0x80000000|688, // no-match move
0x80000000|1145, // NT-test-match state for `else
  }
,
{ // state 757
27,382, // `;
87,178, // ";"
  }
,
{ // state 758
17,1324, // `)
80,588, // ")"
  }
,
{ // state 759
-1, // $$start
-1, // <start>
-1, // ws*
-1, // <program>
-1, // <class decl>+
-1, // <class decl>
-1, // `class
264, // ID
708, // `{
-1, // <decl in class>*
192, // `}
-1, // `extends
-1, // <decl in class>
-1, // <method decl>
-1, // `public
-1, // `void
518, // `(
-1, // `)
999, // <stmt>*
209, // <type>
924, // `int
930, // `boolean
-1, // <empty bracket pair>
-1, // `[
-1, // `]
1287, // <stmt>
957, // <assign>
-1, // `;
401, // <local var decl>
1310, // `if
592, // <exp>
-1, // `else
390, // `while
905, // `for
-1, // `=
1153, // <exp8>
325, // <exp7>
19, // <exp6>
25, // <exp5>
101, // <exp4>
-1, // `+
483, // <exp3>
-1, // `*
78, // <exp2>
258, // <cast exp>
490, // <unary exp>
95, // <exp1>
854, // `-
461, // INTLIT
1239, // letter
816, // {"A".."Z" "a" "d" "g" "j".."k" "m".."n" "q".."s" "y".."z"}
816, // "p"
816, // "v"
816, // "c"
816, // "f"
816, // "i"
816, // "l"
816, // "o"
816, // "u"
816, // "x"
816, // "b"
816, // "e"
816, // "h"
816, // "t"
816, // "w"
374, // letter128
189, // {199..218 231..250}
189, // {193..198 225..230}
-1, // digit
269, // {"1".."9"}
1084, // "0"
591, // digit128
1279, // {176..185}
-1, // ws
-1, // " "
-1, // {10}
395, // "#"
-1, // "+"
-1, // "*"
960, // "("
-1, // ")"
887, // "{"
341, // "}"
1296, // "-"
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
{ // state 760
-1, // $$start
-1, // <start>
-1, // ws*
-1, // <program>
-1, // <class decl>+
-1, // <class decl>
-1, // `class
264, // ID
734, // `{
-1, // <decl in class>*
-1, // `}
-1, // `extends
-1, // <decl in class>
-1, // <method decl>
-1, // `public
-1, // `void
518, // `(
-1, // `)
-1, // <stmt>*
209, // <type>
924, // `int
930, // `boolean
-1, // <empty bracket pair>
-1, // `[
-1, // `]
1096, // <stmt>
170, // <assign>
-1, // `;
1063, // <local var decl>
1276, // `if
592, // <exp>
-1, // `else
578, // `while
1245, // `for
-1, // `=
1153, // <exp8>
325, // <exp7>
19, // <exp6>
25, // <exp5>
101, // <exp4>
-1, // `+
483, // <exp3>
-1, // `*
78, // <exp2>
258, // <cast exp>
490, // <unary exp>
95, // <exp1>
854, // `-
461, // INTLIT
1239, // letter
816, // {"A".."Z" "a" "d" "g" "j".."k" "m".."n" "q".."s" "y".."z"}
816, // "p"
816, // "v"
816, // "c"
816, // "f"
816, // "i"
816, // "l"
816, // "o"
816, // "u"
816, // "x"
816, // "b"
816, // "e"
816, // "h"
816, // "t"
816, // "w"
374, // letter128
189, // {199..218 231..250}
189, // {193..198 225..230}
-1, // digit
269, // {"1".."9"}
1084, // "0"
591, // digit128
1279, // {176..185}
-1, // ws
-1, // " "
-1, // {10}
395, // "#"
-1, // "+"
-1, // "*"
960, // "("
-1, // ")"
887, // "{"
-1, // "}"
1296, // "-"
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
{ // state 761
0x80000000|763, // match move
0x80000000|561, // no-match move
0x80000000|47, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 762
2,346, // ws*
73,733, // ws
74,376, // " "
75,228, // {10}
MIN_REDUCTION+126, // (default reduction)
  }
,
{ // state 763
2,1118, // ws*
  }
,
{ // state 764
MIN_REDUCTION+124, // (default reduction)
  }
,
{ // state 765
2,769, // ws*
73,415, // ws
74,975, // " "
75,581, // {10}
MIN_REDUCTION+92, // (default reduction)
  }
,
{ // state 766
7,218, // ID
16,523, // `(
30,1178, // <exp>
35,1156, // <exp8>
36,320, // <exp7>
37,24, // <exp6>
38,22, // <exp5>
39,138, // <exp4>
41,480, // <exp3>
43,83, // <exp2>
44,256, // <cast exp>
45,491, // <unary exp>
46,111, // <exp1>
47,851, // `-
48,465, // INTLIT
49,972, // letter
50,816, // {"A".."Z" "a" "d" "g" "j".."k" "m".."n" "q".."s" "y".."z"}
51,816, // "p"
52,816, // "v"
53,816, // "c"
54,816, // "f"
55,816, // "i"
56,816, // "l"
57,816, // "o"
58,816, // "u"
59,816, // "x"
60,816, // "b"
61,816, // "e"
62,816, // "h"
63,816, // "t"
64,816, // "w"
65,1229, // letter128
66,735, // {199..218 231..250}
67,735, // {193..198 225..230}
69,272, // {"1".."9"}
70,1080, // "0"
71,593, // digit128
72,1282, // {176..185}
79,960, // "("
83,1296, // "-"
  }
,
{ // state 767
23,1085, // `[
85,369, // "["
MIN_REDUCTION+41, // (default reduction)
  }
,
{ // state 768
MIN_REDUCTION+38, // (default reduction)
  }
,
{ // state 769
0x80000000|884, // match move
0x80000000|717, // no-match move
0x80000000|1145, // NT-test-match state for `else
  }
,
{ // state 770
MIN_REDUCTION+7, // (default reduction)
  }
,
{ // state 771
0x80000000|1, // match move
0x80000000|449, // no-match move
0x80000000|47, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 772
MIN_REDUCTION+38, // (default reduction)
  }
,
{ // state 773
7,218, // ID
16,523, // `(
30,481, // <exp>
35,1156, // <exp8>
36,320, // <exp7>
37,24, // <exp6>
38,22, // <exp5>
39,138, // <exp4>
41,480, // <exp3>
43,83, // <exp2>
44,256, // <cast exp>
45,491, // <unary exp>
46,111, // <exp1>
47,851, // `-
48,465, // INTLIT
49,972, // letter
50,816, // {"A".."Z" "a" "d" "g" "j".."k" "m".."n" "q".."s" "y".."z"}
51,816, // "p"
52,816, // "v"
53,816, // "c"
54,816, // "f"
55,816, // "i"
56,816, // "l"
57,816, // "o"
58,816, // "u"
59,816, // "x"
60,816, // "b"
61,816, // "e"
62,816, // "h"
63,816, // "t"
64,816, // "w"
65,1229, // letter128
66,735, // {199..218 231..250}
67,735, // {193..198 225..230}
69,272, // {"1".."9"}
70,1080, // "0"
71,593, // digit128
72,1282, // {176..185}
79,960, // "("
83,1296, // "-"
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
264, // ID
708, // `{
-1, // <decl in class>*
198, // `}
-1, // `extends
-1, // <decl in class>
-1, // <method decl>
-1, // `public
-1, // `void
518, // `(
-1, // `)
239, // <stmt>*
209, // <type>
924, // `int
930, // `boolean
-1, // <empty bracket pair>
-1, // `[
-1, // `]
1287, // <stmt>
957, // <assign>
-1, // `;
401, // <local var decl>
1310, // `if
592, // <exp>
-1, // `else
390, // `while
905, // `for
-1, // `=
1153, // <exp8>
325, // <exp7>
19, // <exp6>
25, // <exp5>
101, // <exp4>
-1, // `+
483, // <exp3>
-1, // `*
78, // <exp2>
258, // <cast exp>
490, // <unary exp>
95, // <exp1>
854, // `-
461, // INTLIT
1239, // letter
816, // {"A".."Z" "a" "d" "g" "j".."k" "m".."n" "q".."s" "y".."z"}
816, // "p"
816, // "v"
816, // "c"
816, // "f"
816, // "i"
816, // "l"
816, // "o"
816, // "u"
816, // "x"
816, // "b"
816, // "e"
816, // "h"
816, // "t"
816, // "w"
374, // letter128
189, // {199..218 231..250}
189, // {193..198 225..230}
-1, // digit
269, // {"1".."9"}
1084, // "0"
591, // digit128
1279, // {176..185}
-1, // ws
-1, // " "
-1, // {10}
395, // "#"
-1, // "+"
-1, // "*"
960, // "("
-1, // ")"
887, // "{"
987, // "}"
1296, // "-"
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
{ // state 775
0x80000000|1, // match move
0x80000000|463, // no-match move
0x80000000|47, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 776
2,1161, // ws*
23,MIN_REDUCTION+94, // `[
73,1174, // ws
74,90, // " "
75,99, // {10}
85,MIN_REDUCTION+94, // "["
101,MIN_REDUCTION+94, // $NT
MIN_REDUCTION+94, // (default reduction)
  }
,
{ // state 777
49,676, // letter
50,67, // {"A".."Z" "a" "d" "g" "j".."k" "m".."n" "q".."s" "y".."z"}
51,67, // "p"
52,67, // "v"
53,67, // "c"
54,67, // "f"
55,67, // "i"
56,67, // "l"
57,67, // "o"
58,67, // "u"
59,67, // "x"
60,67, // "b"
61,67, // "e"
62,67, // "h"
63,67, // "t"
64,67, // "w"
65,1184, // letter128
66,709, // {199..218 231..250}
67,709, // {193..198 225..230}
68,290, // digit
69,253, // {"1".."9"}
70,253, // "0"
71,791, // digit128
72,1298, // {176..185}
88,117, // idChar*
89,321, // $$0
94,532, // idChar
95,1227, // "_"
96,137, // idChar128
97,947, // {223}
  }
,
{ // state 778
-1, // $$start
-1, // <start>
-1, // ws*
-1, // <program>
-1, // <class decl>+
-1, // <class decl>
-1, // `class
264, // ID
759, // `{
-1, // <decl in class>*
-1, // `}
-1, // `extends
-1, // <decl in class>
-1, // <method decl>
-1, // `public
-1, // `void
518, // `(
-1, // `)
-1, // <stmt>*
209, // <type>
924, // `int
930, // `boolean
-1, // <empty bracket pair>
-1, // `[
-1, // `]
1308, // <stmt>
787, // <assign>
-1, // `;
1093, // <local var decl>
985, // `if
592, // <exp>
-1, // `else
726, // `while
177, // `for
-1, // `=
1153, // <exp8>
325, // <exp7>
19, // <exp6>
25, // <exp5>
101, // <exp4>
-1, // `+
483, // <exp3>
-1, // `*
78, // <exp2>
258, // <cast exp>
490, // <unary exp>
95, // <exp1>
854, // `-
461, // INTLIT
1239, // letter
816, // {"A".."Z" "a" "d" "g" "j".."k" "m".."n" "q".."s" "y".."z"}
816, // "p"
816, // "v"
816, // "c"
816, // "f"
816, // "i"
816, // "l"
816, // "o"
816, // "u"
816, // "x"
816, // "b"
816, // "e"
816, // "h"
816, // "t"
816, // "w"
374, // letter128
189, // {199..218 231..250}
189, // {193..198 225..230}
-1, // digit
269, // {"1".."9"}
1084, // "0"
591, // digit128
1279, // {176..185}
-1, // ws
-1, // " "
-1, // {10}
395, // "#"
-1, // "+"
-1, // "*"
960, // "("
-1, // ")"
887, // "{"
-1, // "}"
1296, // "-"
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
{ // state 779
MIN_REDUCTION+115, // (default reduction)
  }
,
{ // state 780
MIN_REDUCTION+124, // (default reduction)
  }
,
{ // state 781
7,236, // ID
16,482, // `(
30,172, // <exp>
35,1051, // <exp8>
36,313, // <exp7>
37,36, // <exp6>
38,33, // <exp5>
39,164, // <exp4>
41,411, // <exp3>
43,11, // <exp2>
44,336, // <cast exp>
45,507, // <unary exp>
46,230, // <exp1>
47,859, // `-
48,478, // INTLIT
49,1033, // letter
50,816, // {"A".."Z" "a" "d" "g" "j".."k" "m".."n" "q".."s" "y".."z"}
51,816, // "p"
52,816, // "v"
53,816, // "c"
54,816, // "f"
55,816, // "i"
56,816, // "l"
57,816, // "o"
58,816, // "u"
59,816, // "x"
60,816, // "b"
61,816, // "e"
62,816, // "h"
63,816, // "t"
64,816, // "w"
65,1288, // letter128
66,752, // {199..218 231..250}
67,752, // {193..198 225..230}
69,298, // {"1".."9"}
70,1119, // "0"
71,597, // digit128
72,1269, // {176..185}
79,960, // "("
83,1296, // "-"
  }
,
{ // state 782
2,1079, // ws*
  }
,
{ // state 783
MIN_REDUCTION+124, // (default reduction)
  }
,
{ // state 784
101,MIN_REDUCTION+106, // $NT
MIN_REDUCTION+106, // (default reduction)
  }
,
{ // state 785
73,1111, // ws
74,116, // " "
75,438, // {10}
MIN_REDUCTION+73, // (default reduction)
  }
,
{ // state 786
MIN_REDUCTION+22, // (default reduction)
  }
,
{ // state 787
27,402, // `;
87,179, // ";"
  }
,
{ // state 788
23,MIN_REDUCTION+123, // `[
85,MIN_REDUCTION+123, // "["
MIN_REDUCTION+123, // (default reduction)
  }
,
{ // state 789
2,795, // ws*
73,398, // ws
74,996, // " "
75,571, // {10}
MIN_REDUCTION+92, // (default reduction)
  }
,
{ // state 790
23,1078, // `[
85,369, // "["
MIN_REDUCTION+41, // (default reduction)
  }
,
{ // state 791
0x80000000|496, // match move
0x80000000|1291, // no-match move
0x80000000|47, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 792
17,156, // `)
80,588, // ")"
  }
,
{ // state 793
MIN_REDUCTION+38, // (default reduction)
  }
,
{ // state 794
7,218, // ID
16,523, // `(
44,768, // <cast exp>
46,1053, // <exp1>
48,465, // INTLIT
49,972, // letter
50,816, // {"A".."Z" "a" "d" "g" "j".."k" "m".."n" "q".."s" "y".."z"}
51,816, // "p"
52,816, // "v"
53,816, // "c"
54,816, // "f"
55,816, // "i"
56,816, // "l"
57,816, // "o"
58,816, // "u"
59,816, // "x"
60,816, // "b"
61,816, // "e"
62,816, // "h"
63,816, // "t"
64,816, // "w"
65,1229, // letter128
66,735, // {199..218 231..250}
67,735, // {193..198 225..230}
69,272, // {"1".."9"}
70,1080, // "0"
71,593, // digit128
72,1282, // {176..185}
79,960, // "("
  }
,
{ // state 795
0x80000000|884, // match move
0x80000000|1012, // no-match move
0x80000000|1145, // NT-test-match state for `else
  }
,
{ // state 796
-1, // $$start
-1, // <start>
-1, // ws*
-1, // <program>
-1, // <class decl>+
-1, // <class decl>
-1, // `class
264, // ID
855, // `{
-1, // <decl in class>*
-1, // `}
-1, // `extends
-1, // <decl in class>
-1, // <method decl>
-1, // `public
-1, // `void
518, // `(
-1, // `)
-1, // <stmt>*
209, // <type>
924, // `int
930, // `boolean
-1, // <empty bracket pair>
-1, // `[
-1, // `]
419, // <stmt>
1176, // <assign>
-1, // `;
533, // <local var decl>
624, // `if
592, // <exp>
-1, // `else
1131, // `while
840, // `for
-1, // `=
1153, // <exp8>
325, // <exp7>
19, // <exp6>
25, // <exp5>
101, // <exp4>
-1, // `+
483, // <exp3>
-1, // `*
78, // <exp2>
258, // <cast exp>
490, // <unary exp>
95, // <exp1>
854, // `-
461, // INTLIT
1239, // letter
816, // {"A".."Z" "a" "d" "g" "j".."k" "m".."n" "q".."s" "y".."z"}
816, // "p"
816, // "v"
816, // "c"
816, // "f"
816, // "i"
816, // "l"
816, // "o"
816, // "u"
816, // "x"
816, // "b"
816, // "e"
816, // "h"
816, // "t"
816, // "w"
374, // letter128
189, // {199..218 231..250}
189, // {193..198 225..230}
-1, // digit
269, // {"1".."9"}
1084, // "0"
591, // digit128
1279, // {176..185}
-1, // ws
-1, // " "
-1, // {10}
395, // "#"
-1, // "+"
-1, // "*"
960, // "("
-1, // ")"
887, // "{"
-1, // "}"
1296, // "-"
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
{ // state 797
MIN_REDUCTION+17, // (default reduction)
  }
,
{ // state 798
101,MIN_REDUCTION+38, // $NT
MIN_REDUCTION+38, // (default reduction)
  }
,
{ // state 799
MIN_REDUCTION+49, // (default reduction)
  }
,
{ // state 800
0x80000000|496, // match move
0x80000000|1246, // no-match move
0x80000000|47, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 801
7,328, // ID
16,904, // `(
35,1098, // <exp8>
36,267, // <exp7>
37,74, // <exp6>
38,71, // <exp5>
39,1242, // <exp4>
41,649, // <exp3>
43,131, // <exp2>
44,391, // <cast exp>
45,433, // <unary exp>
46,304, // <exp1>
47,926, // `-
48,534, // INTLIT
49,936, // letter
50,816, // {"A".."Z" "a" "d" "g" "j".."k" "m".."n" "q".."s" "y".."z"}
51,816, // "p"
52,816, // "v"
53,816, // "c"
54,816, // "f"
55,816, // "i"
56,816, // "l"
57,816, // "o"
58,816, // "u"
59,816, // "x"
60,816, // "b"
61,816, // "e"
62,816, // "h"
63,816, // "t"
64,816, // "w"
65,1059, // letter128
66,828, // {199..218 231..250}
67,828, // {193..198 225..230}
69,378, // {"1".."9"}
70,191, // "0"
71,359, // digit128
72,1214, // {176..185}
79,960, // "("
83,1296, // "-"
  }
,
{ // state 802
2,98, // ws*
101,MIN_REDUCTION+90, // $NT
  }
,
{ // state 803
16,661, // `(
79,16, // "("
  }
,
{ // state 804
-1, // $$start
-1, // <start>
-1, // ws*
-1, // <program>
-1, // <class decl>+
-1, // <class decl>
-1, // `class
264, // ID
734, // `{
-1, // <decl in class>*
-1, // `}
-1, // `extends
-1, // <decl in class>
-1, // <method decl>
-1, // `public
-1, // `void
518, // `(
-1, // `)
-1, // <stmt>*
209, // <type>
924, // `int
930, // `boolean
-1, // <empty bracket pair>
-1, // `[
-1, // `]
609, // <stmt>
170, // <assign>
-1, // `;
1063, // <local var decl>
1276, // `if
592, // <exp>
-1, // `else
578, // `while
1245, // `for
-1, // `=
1153, // <exp8>
325, // <exp7>
19, // <exp6>
25, // <exp5>
101, // <exp4>
-1, // `+
483, // <exp3>
-1, // `*
78, // <exp2>
258, // <cast exp>
490, // <unary exp>
95, // <exp1>
854, // `-
461, // INTLIT
1239, // letter
816, // {"A".."Z" "a" "d" "g" "j".."k" "m".."n" "q".."s" "y".."z"}
816, // "p"
816, // "v"
816, // "c"
816, // "f"
816, // "i"
816, // "l"
816, // "o"
816, // "u"
816, // "x"
816, // "b"
816, // "e"
816, // "h"
816, // "t"
816, // "w"
374, // letter128
189, // {199..218 231..250}
189, // {193..198 225..230}
-1, // digit
269, // {"1".."9"}
1084, // "0"
591, // digit128
1279, // {176..185}
-1, // ws
-1, // " "
-1, // {10}
395, // "#"
-1, // "+"
-1, // "*"
960, // "("
-1, // ")"
887, // "{"
-1, // "}"
1296, // "-"
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
{ // state 805
MIN_REDUCTION+123, // (default reduction)
  }
,
{ // state 806
101,MIN_REDUCTION+42, // $NT
  }
,
{ // state 807
MIN_REDUCTION+50, // (default reduction)
  }
,
{ // state 808
2,1092, // ws*
23,MIN_REDUCTION+94, // `[
73,1138, // ws
74,126, // " "
75,123, // {10}
85,MIN_REDUCTION+94, // "["
MIN_REDUCTION+94, // (default reduction)
  }
,
{ // state 809
17,1086, // `)
80,588, // ")"
  }
,
{ // state 810
23,MIN_REDUCTION+96, // `[
85,MIN_REDUCTION+96, // "["
MIN_REDUCTION+96, // (default reduction)
  }
,
{ // state 811
0x80000000|1029, // match move
0x80000000|273, // no-match move
0x80000000|47, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 812
0x80000000|496, // match move
0x80000000|1217, // no-match move
0x80000000|47, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 813
23,MIN_REDUCTION+96, // `[
85,MIN_REDUCTION+96, // "["
MIN_REDUCTION+96, // (default reduction)
  }
,
{ // state 814
0x80000000|1029, // match move
0x80000000|275, // no-match move
0x80000000|47, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 815
0x80000000|496, // match move
0x80000000|1221, // no-match move
0x80000000|47, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 816
MIN_REDUCTION+45, // (default reduction)
  }
,
{ // state 817
MIN_REDUCTION+96, // (default reduction)
  }
,
{ // state 818
0x80000000|1, // match move
0x80000000|396, // no-match move
0x80000000|47, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 819
MIN_REDUCTION+16, // (default reduction)
  }
,
{ // state 820
2,1019, // ws*
MIN_REDUCTION+80, // (default reduction)
  }
,
{ // state 821
73,312, // ws
74,1248, // " "
75,807, // {10}
MIN_REDUCTION+79, // (default reduction)
  }
,
{ // state 822
MIN_REDUCTION+9, // (default reduction)
  }
,
{ // state 823
50,1066, // {"A".."Z" "a" "d" "g" "j".."k" "m".."n" "q".."s" "y".."z"}
51,1066, // "p"
52,1066, // "v"
53,1066, // "c"
54,1066, // "f"
55,1066, // "i"
56,1066, // "l"
57,1066, // "o"
58,1066, // "u"
59,1066, // "x"
60,1066, // "b"
61,1066, // "e"
62,1066, // "h"
63,1066, // "t"
64,1066, // "w"
67,261, // {193..198 225..230}
69,1066, // {"1".."9"}
70,1066, // "0"
72,261, // {176..185}
93,522, // $$2
98,779, // hexDigit
99,761, // hexDigit128
  }
,
{ // state 824
0x80000000|738, // match move
0x80000000|674, // no-match move
0x80000000|47, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 825
0x80000000|1029, // match move
0x80000000|323, // no-match move
0x80000000|47, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 826
50,1066, // {"A".."Z" "a" "d" "g" "j".."k" "m".."n" "q".."s" "y".."z"}
51,1066, // "p"
52,1066, // "v"
53,1066, // "c"
54,1066, // "f"
55,1066, // "i"
56,1066, // "l"
57,1066, // "o"
58,1066, // "u"
59,1066, // "x"
60,1066, // "b"
61,1066, // "e"
62,1066, // "h"
63,1066, // "t"
64,1066, // "w"
67,257, // {193..198 225..230}
69,1066, // {"1".."9"}
70,1066, // "0"
72,257, // {176..185}
93,524, // $$2
98,779, // hexDigit
99,748, // hexDigit128
  }
,
{ // state 827
MIN_REDUCTION+50, // (default reduction)
  }
,
{ // state 828
0x80000000|586, // match move
0x80000000|1234, // no-match move
0x80000000|47, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 829
73,163, // ws
74,1000, // " "
75,1031, // {10}
MIN_REDUCTION+87, // (default reduction)
  }
,
{ // state 830
2,969, // ws*
23,MIN_REDUCTION+94, // `[
73,1143, // ws
74,139, // " "
75,162, // {10}
85,MIN_REDUCTION+94, // "["
MIN_REDUCTION+94, // (default reduction)
  }
,
{ // state 831
2,846, // ws*
73,373, // ws
74,1164, // " "
75,453, // {10}
MIN_REDUCTION+126, // (default reduction)
  }
,
{ // state 832
2,966, // ws*
23,MIN_REDUCTION+94, // `[
73,1146, // ws
74,142, // " "
75,158, // {10}
85,MIN_REDUCTION+94, // "["
MIN_REDUCTION+94, // (default reduction)
  }
,
{ // state 833
53,423, // "c"
  }
,
{ // state 834
MIN_REDUCTION+16, // (default reduction)
  }
,
{ // state 835
50,1066, // {"A".."Z" "a" "d" "g" "j".."k" "m".."n" "q".."s" "y".."z"}
51,1066, // "p"
52,1066, // "v"
53,1066, // "c"
54,1066, // "f"
55,1066, // "i"
56,1066, // "l"
57,1066, // "o"
58,1066, // "u"
59,1066, // "x"
60,1066, // "b"
61,1066, // "e"
62,1066, // "h"
63,1066, // "t"
64,1066, // "w"
67,270, // {193..198 225..230}
69,1066, // {"1".."9"}
70,1066, // "0"
72,270, // {176..185}
93,456, // $$2
98,779, // hexDigit
99,724, // hexDigit128
  }
,
{ // state 836
0x80000000|1251, // match move
0x80000000|1134, // no-match move
0x80000000|801, // NT-test-match state for <exp>
  }
,
{ // state 837
7,236, // ID
16,482, // `(
30,704, // <exp>
35,1051, // <exp8>
36,313, // <exp7>
37,36, // <exp6>
38,33, // <exp5>
39,164, // <exp4>
41,411, // <exp3>
43,11, // <exp2>
44,336, // <cast exp>
45,507, // <unary exp>
46,230, // <exp1>
47,859, // `-
48,478, // INTLIT
49,1033, // letter
50,816, // {"A".."Z" "a" "d" "g" "j".."k" "m".."n" "q".."s" "y".."z"}
51,816, // "p"
52,816, // "v"
53,816, // "c"
54,816, // "f"
55,816, // "i"
56,816, // "l"
57,816, // "o"
58,816, // "u"
59,816, // "x"
60,816, // "b"
61,816, // "e"
62,816, // "h"
63,816, // "t"
64,816, // "w"
65,1288, // letter128
66,752, // {199..218 231..250}
67,752, // {193..198 225..230}
69,298, // {"1".."9"}
70,1119, // "0"
71,597, // digit128
72,1269, // {176..185}
79,960, // "("
83,1296, // "-"
  }
,
{ // state 838
23,MIN_REDUCTION+125, // `[
73,53, // ws
74,161, // " "
75,28, // {10}
85,MIN_REDUCTION+125, // "["
MIN_REDUCTION+125, // (default reduction)
  }
,
{ // state 839
23,MIN_REDUCTION+96, // `[
85,MIN_REDUCTION+96, // "["
MIN_REDUCTION+96, // (default reduction)
  }
,
{ // state 840
16,673, // `(
79,16, // "("
  }
,
{ // state 841
23,1055, // `[
85,369, // "["
MIN_REDUCTION+41, // (default reduction)
  }
,
{ // state 842
7,222, // ID
16,518, // `(
44,772, // <cast exp>
46,1054, // <exp1>
48,461, // INTLIT
49,974, // letter
50,816, // {"A".."Z" "a" "d" "g" "j".."k" "m".."n" "q".."s" "y".."z"}
51,816, // "p"
52,816, // "v"
53,816, // "c"
54,816, // "f"
55,816, // "i"
56,816, // "l"
57,816, // "o"
58,816, // "u"
59,816, // "x"
60,816, // "b"
61,816, // "e"
62,816, // "h"
63,816, // "t"
64,816, // "w"
65,1228, // letter128
66,737, // {199..218 231..250}
67,737, // {193..198 225..230}
69,269, // {"1".."9"}
70,1084, // "0"
71,591, // digit128
72,1279, // {176..185}
79,960, // "("
  }
,
{ // state 843
MIN_REDUCTION+49, // (default reduction)
  }
,
{ // state 844
0x80000000|1218, // match move
0x80000000|1211, // no-match move
0x80000000|47, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 845
10,1122, // `}
12,361, // <decl in class>
13,212, // <method decl>
14,310, // `public
76,1253, // "#"
82,21, // "}"
  }
,
{ // state 846
73,909, // ws
74,1164, // " "
75,453, // {10}
MIN_REDUCTION+125, // (default reduction)
  }
,
{ // state 847
MIN_REDUCTION+117, // (default reduction)
  }
,
{ // state 848
MIN_REDUCTION+124, // (default reduction)
  }
,
{ // state 849
-1, // $$start
-1, // <start>
-1, // ws*
-1, // <program>
-1, // <class decl>+
-1, // <class decl>
-1, // `class
264, // ID
708, // `{
-1, // <decl in class>*
544, // `}
-1, // `extends
-1, // <decl in class>
-1, // <method decl>
-1, // `public
-1, // `void
518, // `(
-1, // `)
-1, // <stmt>*
209, // <type>
924, // `int
930, // `boolean
-1, // <empty bracket pair>
-1, // `[
-1, // `]
847, // <stmt>
957, // <assign>
-1, // `;
401, // <local var decl>
1310, // `if
592, // <exp>
-1, // `else
390, // `while
905, // `for
-1, // `=
1153, // <exp8>
325, // <exp7>
19, // <exp6>
25, // <exp5>
101, // <exp4>
-1, // `+
483, // <exp3>
-1, // `*
78, // <exp2>
258, // <cast exp>
490, // <unary exp>
95, // <exp1>
854, // `-
461, // INTLIT
1239, // letter
816, // {"A".."Z" "a" "d" "g" "j".."k" "m".."n" "q".."s" "y".."z"}
816, // "p"
816, // "v"
816, // "c"
816, // "f"
816, // "i"
816, // "l"
816, // "o"
816, // "u"
816, // "x"
816, // "b"
816, // "e"
816, // "h"
816, // "t"
816, // "w"
374, // letter128
189, // {199..218 231..250}
189, // {193..198 225..230}
-1, // digit
269, // {"1".."9"}
1084, // "0"
591, // digit128
1279, // {176..185}
-1, // ws
-1, // " "
-1, // {10}
395, // "#"
-1, // "+"
-1, // "*"
960, // "("
-1, // ")"
887, // "{"
511, // "}"
1296, // "-"
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
{ // state 850
-1, // $$start
-1, // <start>
-1, // ws*
-1, // <program>
-1, // <class decl>+
-1, // <class decl>
-1, // `class
264, // ID
708, // `{
-1, // <decl in class>*
650, // `}
-1, // `extends
-1, // <decl in class>
-1, // <method decl>
-1, // `public
-1, // `void
518, // `(
-1, // `)
570, // <stmt>*
209, // <type>
924, // `int
930, // `boolean
-1, // <empty bracket pair>
-1, // `[
-1, // `]
1287, // <stmt>
957, // <assign>
-1, // `;
401, // <local var decl>
1310, // `if
592, // <exp>
-1, // `else
390, // `while
905, // `for
-1, // `=
1153, // <exp8>
325, // <exp7>
19, // <exp6>
25, // <exp5>
101, // <exp4>
-1, // `+
483, // <exp3>
-1, // `*
78, // <exp2>
258, // <cast exp>
490, // <unary exp>
95, // <exp1>
854, // `-
461, // INTLIT
1239, // letter
816, // {"A".."Z" "a" "d" "g" "j".."k" "m".."n" "q".."s" "y".."z"}
816, // "p"
816, // "v"
816, // "c"
816, // "f"
816, // "i"
816, // "l"
816, // "o"
816, // "u"
816, // "x"
816, // "b"
816, // "e"
816, // "h"
816, // "t"
816, // "w"
374, // letter128
189, // {199..218 231..250}
189, // {193..198 225..230}
-1, // digit
269, // {"1".."9"}
1084, // "0"
591, // digit128
1279, // {176..185}
-1, // ws
-1, // " "
-1, // {10}
395, // "#"
-1, // "+"
-1, // "*"
960, // "("
-1, // ")"
887, // "{"
885, // "}"
1296, // "-"
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
{ // state 851
7,218, // ID
45,1321, // <unary exp>
46,111, // <exp1>
47,851, // `-
48,465, // INTLIT
49,972, // letter
50,816, // {"A".."Z" "a" "d" "g" "j".."k" "m".."n" "q".."s" "y".."z"}
51,816, // "p"
52,816, // "v"
53,816, // "c"
54,816, // "f"
55,816, // "i"
56,816, // "l"
57,816, // "o"
58,816, // "u"
59,816, // "x"
60,816, // "b"
61,816, // "e"
62,816, // "h"
63,816, // "t"
64,816, // "w"
65,1229, // letter128
66,735, // {199..218 231..250}
67,735, // {193..198 225..230}
69,272, // {"1".."9"}
70,1080, // "0"
71,593, // digit128
72,1282, // {176..185}
83,1296, // "-"
  }
,
{ // state 852
2,334, // ws*
73,848, // ws
74,744, // " "
75,1256, // {10}
MIN_REDUCTION+90, // (default reduction)
  }
,
{ // state 853
50,1066, // {"A".."Z" "a" "d" "g" "j".."k" "m".."n" "q".."s" "y".."z"}
51,1066, // "p"
52,1066, // "v"
53,1066, // "c"
54,1066, // "f"
55,1066, // "i"
56,1066, // "l"
57,1066, // "o"
58,1066, // "u"
59,1066, // "x"
60,1066, // "b"
61,1066, // "e"
62,1066, // "h"
63,1066, // "t"
64,1066, // "w"
67,314, // {193..198 225..230}
69,1066, // {"1".."9"}
70,1066, // "0"
72,314, // {176..185}
93,232, // $$2
98,779, // hexDigit
99,824, // hexDigit128
  }
,
{ // state 854
7,222, // ID
45,1317, // <unary exp>
46,95, // <exp1>
47,854, // `-
48,461, // INTLIT
49,974, // letter
50,816, // {"A".."Z" "a" "d" "g" "j".."k" "m".."n" "q".."s" "y".."z"}
51,816, // "p"
52,816, // "v"
53,816, // "c"
54,816, // "f"
55,816, // "i"
56,816, // "l"
57,816, // "o"
58,816, // "u"
59,816, // "x"
60,816, // "b"
61,816, // "e"
62,816, // "h"
63,816, // "t"
64,816, // "w"
65,1228, // letter128
66,737, // {199..218 231..250}
67,737, // {193..198 225..230}
69,269, // {"1".."9"}
70,1084, // "0"
71,591, // digit128
72,1279, // {176..185}
83,1296, // "-"
  }
,
{ // state 855
-1, // $$start
-1, // <start>
-1, // ws*
-1, // <program>
-1, // <class decl>+
-1, // <class decl>
-1, // `class
264, // ID
708, // `{
-1, // <decl in class>*
477, // `}
-1, // `extends
-1, // <decl in class>
-1, // <method decl>
-1, // `public
-1, // `void
518, // `(
-1, // `)
69, // <stmt>*
209, // <type>
924, // `int
930, // `boolean
-1, // <empty bracket pair>
-1, // `[
-1, // `]
1287, // <stmt>
957, // <assign>
-1, // `;
401, // <local var decl>
1310, // `if
592, // <exp>
-1, // `else
390, // `while
905, // `for
-1, // `=
1153, // <exp8>
325, // <exp7>
19, // <exp6>
25, // <exp5>
101, // <exp4>
-1, // `+
483, // <exp3>
-1, // `*
78, // <exp2>
258, // <cast exp>
490, // <unary exp>
95, // <exp1>
854, // `-
461, // INTLIT
1239, // letter
816, // {"A".."Z" "a" "d" "g" "j".."k" "m".."n" "q".."s" "y".."z"}
816, // "p"
816, // "v"
816, // "c"
816, // "f"
816, // "i"
816, // "l"
816, // "o"
816, // "u"
816, // "x"
816, // "b"
816, // "e"
816, // "h"
816, // "t"
816, // "w"
374, // letter128
189, // {199..218 231..250}
189, // {193..198 225..230}
-1, // digit
269, // {"1".."9"}
1084, // "0"
591, // digit128
1279, // {176..185}
-1, // ws
-1, // " "
-1, // {10}
395, // "#"
-1, // "+"
-1, // "*"
960, // "("
-1, // ")"
887, // "{"
1010, // "}"
1296, // "-"
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
{ // state 856
MIN_REDUCTION+19, // (default reduction)
  }
,
{ // state 857
2,881, // ws*
73,1077, // ws
74,697, // " "
75,976, // {10}
MIN_REDUCTION+92, // (default reduction)
  }
,
{ // state 858
0x80000000|574, // match move
0x80000000|565, // no-match move
0x80000000|801, // NT-test-match state for <exp>
  }
,
{ // state 859
7,236, // ID
45,1062, // <unary exp>
46,230, // <exp1>
47,859, // `-
48,478, // INTLIT
49,1033, // letter
50,816, // {"A".."Z" "a" "d" "g" "j".."k" "m".."n" "q".."s" "y".."z"}
51,816, // "p"
52,816, // "v"
53,816, // "c"
54,816, // "f"
55,816, // "i"
56,816, // "l"
57,816, // "o"
58,816, // "u"
59,816, // "x"
60,816, // "b"
61,816, // "e"
62,816, // "h"
63,816, // "t"
64,816, // "w"
65,1288, // letter128
66,752, // {199..218 231..250}
67,752, // {193..198 225..230}
69,298, // {"1".."9"}
70,1119, // "0"
71,597, // digit128
72,1269, // {176..185}
83,1296, // "-"
  }
,
{ // state 860
2,454, // ws*
73,705, // ws
74,441, // " "
75,182, // {10}
MIN_REDUCTION+126, // (default reduction)
  }
,
{ // state 861
23,MIN_REDUCTION+124, // `[
85,MIN_REDUCTION+124, // "["
MIN_REDUCTION+124, // (default reduction)
  }
,
{ // state 862
-1, // $$start
-1, // <start>
-1, // ws*
-1, // <program>
-1, // <class decl>+
-1, // <class decl>
-1, // `class
264, // ID
774, // `{
-1, // <decl in class>*
-1, // `}
-1, // `extends
-1, // <decl in class>
-1, // <method decl>
-1, // `public
-1, // `void
518, // `(
-1, // `)
-1, // <stmt>*
209, // <type>
924, // `int
930, // `boolean
-1, // <empty bracket pair>
-1, // `[
-1, // `]
549, // <stmt>
183, // <assign>
-1, // `;
1035, // <local var decl>
1327, // `if
592, // <exp>
-1, // `else
660, // `while
1224, // `for
-1, // `=
1153, // <exp8>
325, // <exp7>
19, // <exp6>
25, // <exp5>
101, // <exp4>
-1, // `+
483, // <exp3>
-1, // `*
78, // <exp2>
258, // <cast exp>
490, // <unary exp>
95, // <exp1>
854, // `-
461, // INTLIT
1239, // letter
816, // {"A".."Z" "a" "d" "g" "j".."k" "m".."n" "q".."s" "y".."z"}
816, // "p"
816, // "v"
816, // "c"
816, // "f"
816, // "i"
816, // "l"
816, // "o"
816, // "u"
816, // "x"
816, // "b"
816, // "e"
816, // "h"
816, // "t"
816, // "w"
374, // letter128
189, // {199..218 231..250}
189, // {193..198 225..230}
-1, // digit
269, // {"1".."9"}
1084, // "0"
591, // digit128
1279, // {176..185}
-1, // ws
-1, // " "
-1, // {10}
395, // "#"
-1, // "+"
-1, // "*"
960, // "("
-1, // ")"
887, // "{"
-1, // "}"
1296, // "-"
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
{ // state 863
MIN_REDUCTION+19, // (default reduction)
  }
,
{ // state 864
MIN_REDUCTION+21, // (default reduction)
  }
,
{ // state 865
0x80000000|1328, // match move
0x80000000|856, // no-match move
0x80000000|1145, // NT-test-match state for `else
  }
,
{ // state 866
17,MIN_REDUCTION+50, // `)
80,MIN_REDUCTION+50, // ")"
MIN_REDUCTION+50, // (default reduction)
  }
,
{ // state 867
MIN_REDUCTION+110, // (default reduction)
  }
,
{ // state 868
23,MIN_REDUCTION+124, // `[
85,MIN_REDUCTION+124, // "["
MIN_REDUCTION+124, // (default reduction)
  }
,
{ // state 869
-1, // $$start
-1, // <start>
-1, // ws*
-1, // <program>
-1, // <class decl>+
-1, // <class decl>
-1, // `class
264, // ID
711, // `{
-1, // <decl in class>*
-1, // `}
-1, // `extends
-1, // <decl in class>
-1, // <method decl>
-1, // `public
-1, // `void
518, // `(
-1, // `)
-1, // <stmt>*
209, // <type>
924, // `int
930, // `boolean
-1, // <empty bracket pair>
-1, // `[
-1, // `]
381, // <stmt>
1167, // <assign>
-1, // `;
366, // <local var decl>
680, // `if
592, // <exp>
-1, // `else
210, // `while
803, // `for
-1, // `=
1153, // <exp8>
325, // <exp7>
19, // <exp6>
25, // <exp5>
101, // <exp4>
-1, // `+
483, // <exp3>
-1, // `*
78, // <exp2>
258, // <cast exp>
490, // <unary exp>
95, // <exp1>
854, // `-
461, // INTLIT
1239, // letter
816, // {"A".."Z" "a" "d" "g" "j".."k" "m".."n" "q".."s" "y".."z"}
816, // "p"
816, // "v"
816, // "c"
816, // "f"
816, // "i"
816, // "l"
816, // "o"
816, // "u"
816, // "x"
816, // "b"
816, // "e"
816, // "h"
816, // "t"
816, // "w"
374, // letter128
189, // {199..218 231..250}
189, // {193..198 225..230}
-1, // digit
269, // {"1".."9"}
1084, // "0"
591, // digit128
1279, // {176..185}
-1, // ws
-1, // " "
-1, // {10}
395, // "#"
-1, // "+"
-1, // "*"
960, // "("
-1, // ")"
887, // "{"
-1, // "}"
1296, // "-"
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
{ // state 870
7,243, // ID
45,1333, // <unary exp>
46,130, // <exp1>
47,870, // `-
48,445, // INTLIT
49,777, // letter
50,816, // {"A".."Z" "a" "d" "g" "j".."k" "m".."n" "q".."s" "y".."z"}
51,816, // "p"
52,816, // "v"
53,816, // "c"
54,816, // "f"
55,816, // "i"
56,816, // "l"
57,816, // "o"
58,816, // "u"
59,816, // "x"
60,816, // "b"
61,816, // "e"
62,816, // "h"
63,816, // "t"
64,816, // "w"
65,1193, // letter128
66,709, // {199..218 231..250}
67,709, // {193..198 225..230}
69,225, // {"1".."9"}
70,1039, // "0"
71,554, // digit128
72,1298, // {176..185}
83,1296, // "-"
  }
,
{ // state 871
MIN_REDUCTION+50, // (default reduction)
  }
,
{ // state 872
0x80000000|919, // match move
0x80000000|37, // no-match move
0x80000000|47, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 873
-1, // $$start
-1, // <start>
-1, // ws*
-1, // <program>
-1, // <class decl>+
-1, // <class decl>
-1, // `class
264, // ID
711, // `{
-1, // <decl in class>*
-1, // `}
-1, // `extends
-1, // <decl in class>
-1, // <method decl>
-1, // `public
-1, // `void
518, // `(
-1, // `)
-1, // <stmt>*
209, // <type>
924, // `int
930, // `boolean
-1, // <empty bracket pair>
-1, // `[
-1, // `]
82, // <stmt>
1167, // <assign>
-1, // `;
366, // <local var decl>
680, // `if
592, // <exp>
-1, // `else
210, // `while
803, // `for
-1, // `=
1153, // <exp8>
325, // <exp7>
19, // <exp6>
25, // <exp5>
101, // <exp4>
-1, // `+
483, // <exp3>
-1, // `*
78, // <exp2>
258, // <cast exp>
490, // <unary exp>
95, // <exp1>
854, // `-
461, // INTLIT
1239, // letter
816, // {"A".."Z" "a" "d" "g" "j".."k" "m".."n" "q".."s" "y".."z"}
816, // "p"
816, // "v"
816, // "c"
816, // "f"
816, // "i"
816, // "l"
816, // "o"
816, // "u"
816, // "x"
816, // "b"
816, // "e"
816, // "h"
816, // "t"
816, // "w"
374, // letter128
189, // {199..218 231..250}
189, // {193..198 225..230}
-1, // digit
269, // {"1".."9"}
1084, // "0"
591, // digit128
1279, // {176..185}
-1, // ws
-1, // " "
-1, // {10}
395, // "#"
-1, // "+"
-1, // "*"
960, // "("
-1, // ")"
887, // "{"
-1, // "}"
1296, // "-"
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
{ // state 874
MIN_REDUCTION+123, // (default reduction)
  }
,
{ // state 875
0x80000000|468, // match move
0x80000000|788, // no-match move
0x80000000|47, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 876
23,MIN_REDUCTION+124, // `[
85,MIN_REDUCTION+124, // "["
MIN_REDUCTION+124, // (default reduction)
  }
,
{ // state 877
MIN_REDUCTION+108, // (default reduction)
  }
,
{ // state 878
0x80000000|1328, // match move
0x80000000|863, // no-match move
0x80000000|1145, // NT-test-match state for `else
  }
,
{ // state 879
23,MIN_REDUCTION+124, // `[
85,MIN_REDUCTION+124, // "["
MIN_REDUCTION+124, // (default reduction)
  }
,
{ // state 880
73,550, // ws
74,352, // " "
75,284, // {10}
MIN_REDUCTION+67, // (default reduction)
  }
,
{ // state 881
73,553, // ws
74,697, // " "
75,976, // {10}
MIN_REDUCTION+91, // (default reduction)
  }
,
{ // state 882
7,243, // ID
16,370, // `(
44,686, // <cast exp>
46,1095, // <exp1>
48,445, // INTLIT
49,777, // letter
50,816, // {"A".."Z" "a" "d" "g" "j".."k" "m".."n" "q".."s" "y".."z"}
51,816, // "p"
52,816, // "v"
53,816, // "c"
54,816, // "f"
55,816, // "i"
56,816, // "l"
57,816, // "o"
58,816, // "u"
59,816, // "x"
60,816, // "b"
61,816, // "e"
62,816, // "h"
63,816, // "t"
64,816, // "w"
65,1193, // letter128
66,709, // {199..218 231..250}
67,709, // {193..198 225..230}
69,225, // {"1".."9"}
70,1039, // "0"
71,554, // digit128
72,1298, // {176..185}
79,960, // "("
  }
,
{ // state 883
101,MIN_REDUCTION+98, // $NT
  }
,
{ // state 884
MIN_REDUCTION+91, // (default reduction)
  }
,
{ // state 885
2,821, // ws*
73,152, // ws
74,1248, // " "
75,807, // {10}
MIN_REDUCTION+80, // (default reduction)
  }
,
{ // state 886
MIN_REDUCTION+2, // (default reduction)
  }
,
{ // state 887
2,1203, // ws*
73,978, // ws
74,721, // " "
75,1325, // {10}
MIN_REDUCTION+78, // (default reduction)
  }
,
{ // state 888
MIN_REDUCTION+49, // (default reduction)
  }
,
{ // state 889
23,MIN_REDUCTION+50, // `[
85,MIN_REDUCTION+50, // "["
MIN_REDUCTION+50, // (default reduction)
  }
,
{ // state 890
MIN_REDUCTION+50, // (default reduction)
  }
,
{ // state 891
23,MIN_REDUCTION+125, // `[
73,8, // ws
74,126, // " "
75,123, // {10}
85,MIN_REDUCTION+125, // "["
MIN_REDUCTION+125, // (default reduction)
  }
,
{ // state 892
23,MIN_REDUCTION+50, // `[
85,MIN_REDUCTION+50, // "["
MIN_REDUCTION+50, // (default reduction)
  }
,
{ // state 893
17,1024, // `)
80,588, // ")"
  }
,
{ // state 894
0x80000000|1, // match move
0x80000000|1334, // no-match move
0x80000000|47, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 895
2,983, // ws*
73,706, // ws
74,403, // " "
75,249, // {10}
MIN_REDUCTION+88, // (default reduction)
  }
,
{ // state 896
23,MIN_REDUCTION+50, // `[
85,MIN_REDUCTION+50, // "["
MIN_REDUCTION+50, // (default reduction)
  }
,
{ // state 897
61,603, // "e"
  }
,
{ // state 898
0x80000000|1, // match move
0x80000000|1336, // no-match move
0x80000000|47, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 899
17,1247, // `)
80,588, // ")"
  }
,
{ // state 900
-1, // $$start
-1, // <start>
-1, // ws*
-1, // <program>
-1, // <class decl>+
-1, // <class decl>
-1, // `class
264, // ID
711, // `{
-1, // <decl in class>*
-1, // `}
-1, // `extends
-1, // <decl in class>
-1, // <method decl>
-1, // `public
-1, // `void
518, // `(
-1, // `)
-1, // <stmt>*
209, // <type>
924, // `int
930, // `boolean
-1, // <empty bracket pair>
-1, // `[
-1, // `]
1255, // <stmt>
1167, // <assign>
-1, // `;
366, // <local var decl>
680, // `if
592, // <exp>
-1, // `else
210, // `while
803, // `for
-1, // `=
1153, // <exp8>
325, // <exp7>
19, // <exp6>
25, // <exp5>
101, // <exp4>
-1, // `+
483, // <exp3>
-1, // `*
78, // <exp2>
258, // <cast exp>
490, // <unary exp>
95, // <exp1>
854, // `-
461, // INTLIT
1239, // letter
816, // {"A".."Z" "a" "d" "g" "j".."k" "m".."n" "q".."s" "y".."z"}
816, // "p"
816, // "v"
816, // "c"
816, // "f"
816, // "i"
816, // "l"
816, // "o"
816, // "u"
816, // "x"
816, // "b"
816, // "e"
816, // "h"
816, // "t"
816, // "w"
374, // letter128
189, // {199..218 231..250}
189, // {193..198 225..230}
-1, // digit
269, // {"1".."9"}
1084, // "0"
591, // digit128
1279, // {176..185}
-1, // ws
-1, // " "
-1, // {10}
395, // "#"
-1, // "+"
-1, // "*"
960, // "("
-1, // ")"
887, // "{"
-1, // "}"
1296, // "-"
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
{ // state 901
0x80000000|582, // match move
0x80000000|809, // no-match move
0x80000000|801, // NT-test-match state for <exp>
  }
,
{ // state 902
23,MIN_REDUCTION+96, // `[
85,MIN_REDUCTION+96, // "["
101,MIN_REDUCTION+96, // $NT
MIN_REDUCTION+96, // (default reduction)
  }
,
{ // state 903
3,1318, // <program>
4,962, // <class decl>+
5,1091, // <class decl>
6,625, // `class
73,289, // ws
74,843, // " "
75,890, // {10}
76,833, // "#"
  }
,
{ // state 904
7,450, // ID
19,626, // <type>
20,1060, // `int
21,122, // `boolean
49,196, // letter
50,816, // {"A".."Z" "a" "d" "g" "j".."k" "m".."n" "q".."s" "y".."z"}
51,816, // "p"
52,816, // "v"
53,816, // "c"
54,816, // "f"
55,816, // "i"
56,816, // "l"
57,816, // "o"
58,816, // "u"
59,816, // "x"
60,816, // "b"
61,816, // "e"
62,816, // "h"
63,816, // "t"
64,816, // "w"
65,134, // letter128
66,1028, // {199..218 231..250}
67,1028, // {193..198 225..230}
76,306, // "#"
  }
,
{ // state 905
16,1275, // `(
79,16, // "("
  }
,
{ // state 906
0x80000000|1, // match move
0x80000000|1271, // no-match move
0x80000000|47, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 907
-1, // $$start
-1, // <start>
-1, // ws*
-1, // <program>
-1, // <class decl>+
-1, // <class decl>
-1, // `class
264, // ID
855, // `{
-1, // <decl in class>*
-1, // `}
-1, // `extends
-1, // <decl in class>
-1, // <method decl>
-1, // `public
-1, // `void
518, // `(
-1, // `)
-1, // <stmt>*
209, // <type>
924, // `int
930, // `boolean
-1, // <empty bracket pair>
-1, // `[
-1, // `]
1243, // <stmt>
1176, // <assign>
-1, // `;
533, // <local var decl>
624, // `if
592, // <exp>
-1, // `else
1131, // `while
840, // `for
-1, // `=
1153, // <exp8>
325, // <exp7>
19, // <exp6>
25, // <exp5>
101, // <exp4>
-1, // `+
483, // <exp3>
-1, // `*
78, // <exp2>
258, // <cast exp>
490, // <unary exp>
95, // <exp1>
854, // `-
461, // INTLIT
1239, // letter
816, // {"A".."Z" "a" "d" "g" "j".."k" "m".."n" "q".."s" "y".."z"}
816, // "p"
816, // "v"
816, // "c"
816, // "f"
816, // "i"
816, // "l"
816, // "o"
816, // "u"
816, // "x"
816, // "b"
816, // "e"
816, // "h"
816, // "t"
816, // "w"
374, // letter128
189, // {199..218 231..250}
189, // {193..198 225..230}
-1, // digit
269, // {"1".."9"}
1084, // "0"
591, // digit128
1279, // {176..185}
-1, // ws
-1, // " "
-1, // {10}
395, // "#"
-1, // "+"
-1, // "*"
960, // "("
-1, // ")"
887, // "{"
-1, // "}"
1296, // "-"
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
{ // state 908
MIN_REDUCTION+18, // (default reduction)
  }
,
{ // state 909
MIN_REDUCTION+123, // (default reduction)
  }
,
{ // state 910
73,594, // ws
74,441, // " "
75,182, // {10}
MIN_REDUCTION+75, // (default reduction)
  }
,
{ // state 911
MIN_REDUCTION+96, // (default reduction)
  }
,
{ // state 912
17,669, // `)
80,588, // ")"
  }
,
{ // state 913
2,61, // ws*
73,1101, // ws
74,1018, // " "
75,998, // {10}
MIN_REDUCTION+92, // (default reduction)
  }
,
{ // state 914
23,MIN_REDUCTION+93, // `[
73,875, // ws
74,14, // " "
75,102, // {10}
85,MIN_REDUCTION+93, // "["
MIN_REDUCTION+93, // (default reduction)
  }
,
{ // state 915
23,MIN_REDUCTION+127, // `[
73,318, // ws
74,90, // " "
75,99, // {10}
85,MIN_REDUCTION+127, // "["
101,MIN_REDUCTION+127, // $NT
MIN_REDUCTION+127, // (default reduction)
  }
,
{ // state 916
-1, // $$start
-1, // <start>
-1, // ws*
-1, // <program>
-1, // <class decl>+
-1, // <class decl>
-1, // `class
264, // ID
52, // `{
-1, // <decl in class>*
-1, // `}
-1, // `extends
-1, // <decl in class>
-1, // <method decl>
-1, // `public
-1, // `void
518, // `(
-1, // `)
-1, // <stmt>*
209, // <type>
924, // `int
930, // `boolean
-1, // <empty bracket pair>
-1, // `[
-1, // `]
727, // <stmt>
925, // <assign>
-1, // `;
757, // <local var decl>
1338, // `if
592, // <exp>
-1, // `else
471, // `while
654, // `for
-1, // `=
1153, // <exp8>
325, // <exp7>
19, // <exp6>
25, // <exp5>
101, // <exp4>
-1, // `+
483, // <exp3>
-1, // `*
78, // <exp2>
258, // <cast exp>
490, // <unary exp>
95, // <exp1>
854, // `-
461, // INTLIT
1239, // letter
816, // {"A".."Z" "a" "d" "g" "j".."k" "m".."n" "q".."s" "y".."z"}
816, // "p"
816, // "v"
816, // "c"
816, // "f"
816, // "i"
816, // "l"
816, // "o"
816, // "u"
816, // "x"
816, // "b"
816, // "e"
816, // "h"
816, // "t"
816, // "w"
374, // letter128
189, // {199..218 231..250}
189, // {193..198 225..230}
-1, // digit
269, // {"1".."9"}
1084, // "0"
591, // digit128
1279, // {176..185}
-1, // ws
-1, // " "
-1, // {10}
395, // "#"
-1, // "+"
-1, // "*"
960, // "("
-1, // ")"
887, // "{"
-1, // "}"
1296, // "-"
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
{ // state 917
23,MIN_REDUCTION+125, // `[
73,875, // ws
74,14, // " "
75,102, // {10}
85,MIN_REDUCTION+125, // "["
MIN_REDUCTION+125, // (default reduction)
  }
,
{ // state 918
MIN_REDUCTION+23, // (default reduction)
  }
,
{ // state 919
101,MIN_REDUCTION+108, // $NT
MIN_REDUCTION+108, // (default reduction)
  }
,
{ // state 920
16,81, // `(
79,619, // "("
  }
,
{ // state 921
17,233, // `)
80,588, // ")"
  }
,
{ // state 922
17,685, // `)
80,588, // ")"
  }
,
{ // state 923
73,337, // ws
74,1154, // " "
75,871, // {10}
MIN_REDUCTION+73, // (default reduction)
  }
,
{ // state 924
MIN_REDUCTION+11, // (default reduction)
  }
,
{ // state 925
27,1244, // `;
87,178, // ";"
  }
,
{ // state 926
7,328, // ID
45,1102, // <unary exp>
46,304, // <exp1>
47,926, // `-
48,534, // INTLIT
49,936, // letter
50,816, // {"A".."Z" "a" "d" "g" "j".."k" "m".."n" "q".."s" "y".."z"}
51,816, // "p"
52,816, // "v"
53,816, // "c"
54,816, // "f"
55,816, // "i"
56,816, // "l"
57,816, // "o"
58,816, // "u"
59,816, // "x"
60,816, // "b"
61,816, // "e"
62,816, // "h"
63,816, // "t"
64,816, // "w"
65,1059, // letter128
66,828, // {199..218 231..250}
67,828, // {193..198 225..230}
69,378, // {"1".."9"}
70,191, // "0"
71,359, // digit128
72,1214, // {176..185}
83,1296, // "-"
  }
,
{ // state 927
101,MIN_REDUCTION+101, // $NT
  }
,
{ // state 928
101,MIN_REDUCTION+125, // $NT
  }
,
{ // state 929
27,MIN_REDUCTION+123, // `;
87,MIN_REDUCTION+123, // ";"
MIN_REDUCTION+123, // (default reduction)
  }
,
{ // state 930
MIN_REDUCTION+12, // (default reduction)
  }
,
{ // state 931
MIN_REDUCTION+17, // (default reduction)
  }
,
{ // state 932
MIN_REDUCTION+124, // (default reduction)
  }
,
{ // state 933
2,1013, // ws*
23,MIN_REDUCTION+94, // `[
73,1128, // ws
74,161, // " "
75,28, // {10}
85,MIN_REDUCTION+94, // "["
MIN_REDUCTION+94, // (default reduction)
  }
,
{ // state 934
MIN_REDUCTION+50, // (default reduction)
  }
,
{ // state 935
23,MIN_REDUCTION+96, // `[
85,MIN_REDUCTION+96, // "["
MIN_REDUCTION+96, // (default reduction)
  }
,
{ // state 936
49,676, // letter
50,67, // {"A".."Z" "a" "d" "g" "j".."k" "m".."n" "q".."s" "y".."z"}
51,67, // "p"
52,67, // "v"
53,67, // "c"
54,67, // "f"
55,67, // "i"
56,67, // "l"
57,67, // "o"
58,67, // "u"
59,67, // "x"
60,67, // "b"
61,67, // "e"
62,67, // "h"
63,67, // "t"
64,67, // "w"
65,1107, // letter128
66,828, // {199..218 231..250}
67,828, // {193..198 225..230}
68,290, // digit
69,253, // {"1".."9"}
70,253, // "0"
71,844, // digit128
72,1214, // {176..185}
88,7, // idChar*
89,86, // $$0
94,532, // idChar
95,1227, // "_"
96,335, // idChar128
97,872, // {223}
  }
,
{ // state 937
73,1041, // ws
74,1179, // " "
75,827, // {10}
MIN_REDUCTION+125, // (default reduction)
  }
,
{ // state 938
0x80000000|1141, // match move
0x80000000|114, // no-match move
0x80000000|801, // NT-test-match state for <exp>
  }
,
{ // state 939
0x80000000|953, // match move
0x80000000|1081, // no-match move
0x80000000|47, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 940
0x80000000|884, // match move
0x80000000|995, // no-match move
0x80000000|1145, // NT-test-match state for `else
  }
,
{ // state 941
23,MIN_REDUCTION+125, // `[
73,41, // ws
74,142, // " "
75,158, // {10}
85,MIN_REDUCTION+125, // "["
MIN_REDUCTION+125, // (default reduction)
  }
,
{ // state 942
23,MIN_REDUCTION+50, // `[
85,MIN_REDUCTION+50, // "["
MIN_REDUCTION+50, // (default reduction)
  }
,
{ // state 943
MIN_REDUCTION+106, // (default reduction)
  }
,
{ // state 944
MIN_REDUCTION+17, // (default reduction)
  }
,
{ // state 945
23,MIN_REDUCTION+125, // `[
73,39, // ws
74,139, // " "
75,162, // {10}
85,MIN_REDUCTION+125, // "["
MIN_REDUCTION+125, // (default reduction)
  }
,
{ // state 946
17,262, // `)
80,588, // ")"
  }
,
{ // state 947
0x80000000|1029, // match move
0x80000000|296, // no-match move
0x80000000|47, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 948
73,598, // ws
74,376, // " "
75,228, // {10}
MIN_REDUCTION+93, // (default reduction)
  }
,
{ // state 949
MIN_REDUCTION+26, // (default reduction)
  }
,
{ // state 950
23,MIN_REDUCTION+125, // `[
73,318, // ws
74,90, // " "
75,99, // {10}
85,MIN_REDUCTION+125, // "["
101,MIN_REDUCTION+125, // $NT
MIN_REDUCTION+125, // (default reduction)
  }
,
{ // state 951
17,590, // `)
80,588, // ")"
  }
,
{ // state 952
0x80000000|217, // match move
0x80000000|104, // no-match move
0x80000000|801, // NT-test-match state for <exp>
  }
,
{ // state 953
101,MIN_REDUCTION+43, // $NT
  }
,
{ // state 954
MIN_REDUCTION+21, // (default reduction)
  }
,
{ // state 955
73,550, // ws
74,352, // " "
75,284, // {10}
MIN_REDUCTION+93, // (default reduction)
  }
,
{ // state 956
MIN_REDUCTION+48, // (default reduction)
  }
,
{ // state 957
27,241, // `;
87,913, // ";"
  }
,
{ // state 958
0x80000000|1235, // match move
0x80000000|637, // no-match move
0x80000000|1145, // NT-test-match state for `else
  }
,
{ // state 959
31,900, // `else
76,475, // "#"
  }
,
{ // state 960
2,923, // ws*
73,110, // ws
74,1154, // " "
75,871, // {10}
MIN_REDUCTION+74, // (default reduction)
  }
,
{ // state 961
MIN_REDUCTION+49, // (default reduction)
  }
,
{ // state 962
5,223, // <class decl>
6,625, // `class
76,833, // "#"
MIN_REDUCTION+3, // (default reduction)
  }
,
{ // state 963
63,1160, // "t"
  }
,
{ // state 964
23,MIN_REDUCTION+95, // `[
85,MIN_REDUCTION+95, // "["
MIN_REDUCTION+95, // (default reduction)
  }
,
{ // state 965
MIN_REDUCTION+123, // (default reduction)
  }
,
{ // state 966
0x80000000|1, // match move
0x80000000|302, // no-match move
0x80000000|47, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 967
17,MIN_REDUCTION+123, // `)
80,MIN_REDUCTION+123, // ")"
MIN_REDUCTION+123, // (default reduction)
  }
,
{ // state 968
-1, // $$start
-1, // <start>
-1, // ws*
-1, // <program>
-1, // <class decl>+
-1, // <class decl>
-1, // `class
264, // ID
52, // `{
-1, // <decl in class>*
-1, // `}
-1, // `extends
-1, // <decl in class>
-1, // <method decl>
-1, // `public
-1, // `void
518, // `(
-1, // `)
-1, // <stmt>*
209, // <type>
924, // `int
930, // `boolean
-1, // <empty bracket pair>
-1, // `[
-1, // `]
1237, // <stmt>
925, // <assign>
-1, // `;
757, // <local var decl>
1338, // `if
592, // <exp>
-1, // `else
471, // `while
654, // `for
-1, // `=
1153, // <exp8>
325, // <exp7>
19, // <exp6>
25, // <exp5>
101, // <exp4>
-1, // `+
483, // <exp3>
-1, // `*
78, // <exp2>
258, // <cast exp>
490, // <unary exp>
95, // <exp1>
854, // `-
461, // INTLIT
1239, // letter
816, // {"A".."Z" "a" "d" "g" "j".."k" "m".."n" "q".."s" "y".."z"}
816, // "p"
816, // "v"
816, // "c"
816, // "f"
816, // "i"
816, // "l"
816, // "o"
816, // "u"
816, // "x"
816, // "b"
816, // "e"
816, // "h"
816, // "t"
816, // "w"
374, // letter128
189, // {199..218 231..250}
189, // {193..198 225..230}
-1, // digit
269, // {"1".."9"}
1084, // "0"
591, // digit128
1279, // {176..185}
-1, // ws
-1, // " "
-1, // {10}
395, // "#"
-1, // "+"
-1, // "*"
960, // "("
-1, // ")"
887, // "{"
-1, // "}"
1296, // "-"
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
{ // state 969
0x80000000|1, // match move
0x80000000|285, // no-match move
0x80000000|47, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 970
2,740, // ws*
73,515, // ws
74,91, // " "
75,1170, // {10}
MIN_REDUCTION+92, // (default reduction)
  }
,
{ // state 971
-1, // $$start
-1, // <start>
-1, // ws*
-1, // <program>
-1, // <class decl>+
-1, // <class decl>
-1, // `class
264, // ID
708, // `{
-1, // <decl in class>*
-1, // `}
-1, // `extends
-1, // <decl in class>
-1, // <method decl>
-1, // `public
-1, // `void
518, // `(
-1, // `)
-1, // <stmt>*
209, // <type>
924, // `int
930, // `boolean
-1, // <empty bracket pair>
-1, // `[
-1, // `]
344, // <stmt>
957, // <assign>
-1, // `;
401, // <local var decl>
1310, // `if
592, // <exp>
-1, // `else
390, // `while
905, // `for
-1, // `=
1153, // <exp8>
325, // <exp7>
19, // <exp6>
25, // <exp5>
101, // <exp4>
-1, // `+
483, // <exp3>
-1, // `*
78, // <exp2>
258, // <cast exp>
490, // <unary exp>
95, // <exp1>
854, // `-
461, // INTLIT
1239, // letter
816, // {"A".."Z" "a" "d" "g" "j".."k" "m".."n" "q".."s" "y".."z"}
816, // "p"
816, // "v"
816, // "c"
816, // "f"
816, // "i"
816, // "l"
816, // "o"
816, // "u"
816, // "x"
816, // "b"
816, // "e"
816, // "h"
816, // "t"
816, // "w"
374, // letter128
189, // {199..218 231..250}
189, // {193..198 225..230}
-1, // digit
269, // {"1".."9"}
1084, // "0"
591, // digit128
1279, // {176..185}
-1, // ws
-1, // " "
-1, // {10}
395, // "#"
-1, // "+"
-1, // "*"
960, // "("
-1, // ")"
887, // "{"
-1, // "}"
1296, // "-"
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
{ // state 972
49,676, // letter
50,67, // {"A".."Z" "a" "d" "g" "j".."k" "m".."n" "q".."s" "y".."z"}
51,67, // "p"
52,67, // "v"
53,67, // "c"
54,67, // "f"
55,67, // "i"
56,67, // "l"
57,67, // "o"
58,67, // "u"
59,67, // "x"
60,67, // "b"
61,67, // "e"
62,67, // "h"
63,67, // "t"
64,67, // "w"
65,1047, // letter128
66,735, // {199..218 231..250}
67,735, // {193..198 225..230}
68,290, // digit
69,253, // {"1".."9"}
70,253, // "0"
71,812, // digit128
72,1282, // {176..185}
88,143, // idChar*
89,305, // $$0
94,532, // idChar
95,1227, // "_"
96,17, // idChar128
97,811, // {223}
  }
,
{ // state 973
101,MIN_REDUCTION+124, // $NT
MIN_REDUCTION+124, // (default reduction)
  }
,
{ // state 974
49,676, // letter
50,67, // {"A".."Z" "a" "d" "g" "j".."k" "m".."n" "q".."s" "y".."z"}
51,67, // "p"
52,67, // "v"
53,67, // "c"
54,67, // "f"
55,67, // "i"
56,67, // "l"
57,67, // "o"
58,67, // "u"
59,67, // "x"
60,67, // "b"
61,67, // "e"
62,67, // "h"
63,67, // "t"
64,67, // "w"
65,1044, // letter128
66,737, // {199..218 231..250}
67,737, // {193..198 225..230}
68,290, // digit
69,253, // {"1".."9"}
70,253, // "0"
71,815, // digit128
72,1279, // {176..185}
88,141, // idChar*
89,303, // $$0
94,532, // idChar
95,1227, // "_"
96,23, // idChar128
97,814, // {223}
  }
,
{ // state 975
0x80000000|799, // match move
0x80000000|605, // no-match move
0x80000000|1145, // NT-test-match state for `else
  }
,
{ // state 976
MIN_REDUCTION+50, // (default reduction)
  }
,
{ // state 977
23,MIN_REDUCTION+127, // `[
73,8, // ws
74,126, // " "
75,123, // {10}
85,MIN_REDUCTION+127, // "["
MIN_REDUCTION+127, // (default reduction)
  }
,
{ // state 978
MIN_REDUCTION+124, // (default reduction)
  }
,
{ // state 979
23,MIN_REDUCTION+123, // `[
85,MIN_REDUCTION+123, // "["
MIN_REDUCTION+123, // (default reduction)
  }
,
{ // state 980
-1, // $$start
-1, // <start>
-1, // ws*
-1, // <program>
-1, // <class decl>+
-1, // <class decl>
-1, // `class
264, // ID
708, // `{
-1, // <decl in class>*
1036, // `}
-1, // `extends
-1, // <decl in class>
-1, // <method decl>
-1, // `public
-1, // `void
518, // `(
-1, // `)
-1, // <stmt>*
209, // <type>
924, // `int
930, // `boolean
-1, // <empty bracket pair>
-1, // `[
-1, // `]
847, // <stmt>
957, // <assign>
-1, // `;
401, // <local var decl>
1310, // `if
592, // <exp>
-1, // `else
390, // `while
905, // `for
-1, // `=
1153, // <exp8>
325, // <exp7>
19, // <exp6>
25, // <exp5>
101, // <exp4>
-1, // `+
483, // <exp3>
-1, // `*
78, // <exp2>
258, // <cast exp>
490, // <unary exp>
95, // <exp1>
854, // `-
461, // INTLIT
1239, // letter
816, // {"A".."Z" "a" "d" "g" "j".."k" "m".."n" "q".."s" "y".."z"}
816, // "p"
816, // "v"
816, // "c"
816, // "f"
816, // "i"
816, // "l"
816, // "o"
816, // "u"
816, // "x"
816, // "b"
816, // "e"
816, // "h"
816, // "t"
816, // "w"
374, // letter128
189, // {199..218 231..250}
189, // {193..198 225..230}
-1, // digit
269, // {"1".."9"}
1084, // "0"
591, // digit128
1279, // {176..185}
-1, // ws
-1, // " "
-1, // {10}
395, // "#"
-1, // "+"
-1, // "*"
960, // "("
-1, // ")"
887, // "{"
281, // "}"
1296, // "-"
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
{ // state 981
2,155, // ws*
73,560, // ws
74,1259, // " "
75,700, // {10}
MIN_REDUCTION+56, // (default reduction)
  }
,
{ // state 982
7,236, // ID
16,482, // `(
30,613, // <exp>
35,1051, // <exp8>
36,313, // <exp7>
37,36, // <exp6>
38,33, // <exp5>
39,164, // <exp4>
41,411, // <exp3>
43,11, // <exp2>
44,336, // <cast exp>
45,507, // <unary exp>
46,230, // <exp1>
47,859, // `-
48,478, // INTLIT
49,1033, // letter
50,816, // {"A".."Z" "a" "d" "g" "j".."k" "m".."n" "q".."s" "y".."z"}
51,816, // "p"
52,816, // "v"
53,816, // "c"
54,816, // "f"
55,816, // "i"
56,816, // "l"
57,816, // "o"
58,816, // "u"
59,816, // "x"
60,816, // "b"
61,816, // "e"
62,816, // "h"
63,816, // "t"
64,816, // "w"
65,1288, // letter128
66,752, // {199..218 231..250}
67,752, // {193..198 225..230}
69,298, // {"1".."9"}
70,1119, // "0"
71,597, // digit128
72,1269, // {176..185}
79,960, // "("
83,1296, // "-"
  }
,
{ // state 983
73,584, // ws
74,403, // " "
75,249, // {10}
MIN_REDUCTION+87, // (default reduction)
  }
,
{ // state 984
MIN_REDUCTION+50, // (default reduction)
  }
,
{ // state 985
16,59, // `(
79,619, // "("
  }
,
{ // state 986
2,751, // ws*
73,415, // ws
74,975, // " "
75,581, // {10}
MIN_REDUCTION+92, // (default reduction)
  }
,
{ // state 987
0x80000000|500, // match move
0x80000000|1274, // no-match move
0x80000000|1145, // NT-test-match state for `else
  }
,
{ // state 988
MIN_REDUCTION+50, // (default reduction)
  }
,
{ // state 989
MIN_REDUCTION+124, // (default reduction)
  }
,
{ // state 990
23,MIN_REDUCTION+46, // `[
85,MIN_REDUCTION+46, // "["
MIN_REDUCTION+46, // (default reduction)
  }
,
{ // state 991
MIN_REDUCTION+123, // (default reduction)
  }
,
{ // state 992
MIN_REDUCTION+19, // (default reduction)
  }
,
{ // state 993
2,1322, // ws*
73,764, // ws
74,392, // " "
75,226, // {10}
MIN_REDUCTION+80, // (default reduction)
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
{ // state 994
8,850, // `{
81,887, // "{"
  }
,
{ // state 995
73,72, // ws
74,91, // " "
75,1170, // {10}
MIN_REDUCTION+91, // (default reduction)
  }
,
{ // state 996
0x80000000|799, // match move
0x80000000|585, // no-match move
0x80000000|1145, // NT-test-match state for `else
  }
,
{ // state 997
101,MIN_REDUCTION+49, // $NT
MIN_REDUCTION+49, // (default reduction)
  }
,
{ // state 998
MIN_REDUCTION+50, // (default reduction)
  }
,
{ // state 999
-1, // $$start
-1, // <start>
-1, // ws*
-1, // <program>
-1, // <class decl>+
-1, // <class decl>
-1, // `class
264, // ID
708, // `{
-1, // <decl in class>*
1061, // `}
-1, // `extends
-1, // <decl in class>
-1, // <method decl>
-1, // `public
-1, // `void
518, // `(
-1, // `)
-1, // <stmt>*
209, // <type>
924, // `int
930, // `boolean
-1, // <empty bracket pair>
-1, // `[
-1, // `]
847, // <stmt>
957, // <assign>
-1, // `;
401, // <local var decl>
1310, // `if
592, // <exp>
-1, // `else
390, // `while
905, // `for
-1, // `=
1153, // <exp8>
325, // <exp7>
19, // <exp6>
25, // <exp5>
101, // <exp4>
-1, // `+
483, // <exp3>
-1, // `*
78, // <exp2>
258, // <cast exp>
490, // <unary exp>
95, // <exp1>
854, // `-
461, // INTLIT
1239, // letter
816, // {"A".."Z" "a" "d" "g" "j".."k" "m".."n" "q".."s" "y".."z"}
816, // "p"
816, // "v"
816, // "c"
816, // "f"
816, // "i"
816, // "l"
816, // "o"
816, // "u"
816, // "x"
816, // "b"
816, // "e"
816, // "h"
816, // "t"
816, // "w"
374, // letter128
189, // {199..218 231..250}
189, // {193..198 225..230}
-1, // digit
269, // {"1".."9"}
1084, // "0"
591, // digit128
1279, // {176..185}
-1, // ws
-1, // " "
-1, // {10}
395, // "#"
-1, // "+"
-1, // "*"
960, // "("
-1, // ")"
887, // "{"
341, // "}"
1296, // "-"
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
{ // state 1000
MIN_REDUCTION+49, // (default reduction)
  }
,
{ // state 1001
23,MIN_REDUCTION+127, // `[
73,39, // ws
74,139, // " "
75,162, // {10}
85,MIN_REDUCTION+127, // "["
MIN_REDUCTION+127, // (default reduction)
  }
,
{ // state 1002
8,458, // `{
11,1209, // `extends
76,1113, // "#"
81,1058, // "{"
  }
,
{ // state 1003
17,MIN_REDUCTION+50, // `)
80,MIN_REDUCTION+50, // ")"
MIN_REDUCTION+50, // (default reduction)
  }
,
{ // state 1004
23,MIN_REDUCTION+127, // `[
73,41, // ws
74,142, // " "
75,158, // {10}
85,MIN_REDUCTION+127, // "["
MIN_REDUCTION+127, // (default reduction)
  }
,
{ // state 1005
23,MIN_REDUCTION+123, // `[
85,MIN_REDUCTION+123, // "["
MIN_REDUCTION+123, // (default reduction)
  }
,
{ // state 1006
73,221, // ws
74,410, // " "
75,407, // {10}
MIN_REDUCTION+81, // (default reduction)
  }
,
{ // state 1007
0x80000000|1235, // match move
0x80000000|627, // no-match move
0x80000000|1145, // NT-test-match state for `else
  }
,
{ // state 1008
23,MIN_REDUCTION+106, // `[
85,MIN_REDUCTION+106, // "["
101,MIN_REDUCTION+106, // $NT
MIN_REDUCTION+106, // (default reduction)
  }
,
{ // state 1009
23,MIN_REDUCTION+123, // `[
85,MIN_REDUCTION+123, // "["
MIN_REDUCTION+123, // (default reduction)
  }
,
{ // state 1010
2,1189, // ws*
73,783, // ws
74,350, // " "
75,282, // {10}
MIN_REDUCTION+80, // (default reduction)
  }
,
{ // state 1011
2,730, // ws*
73,398, // ws
74,996, // " "
75,571, // {10}
MIN_REDUCTION+92, // (default reduction)
  }
,
{ // state 1012
73,1270, // ws
74,996, // " "
75,571, // {10}
MIN_REDUCTION+91, // (default reduction)
  }
,
{ // state 1013
0x80000000|1, // match move
0x80000000|322, // no-match move
0x80000000|47, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 1014
0x80000000|545, // match move
0x80000000|1072, // no-match move
0x80000000|47, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 1015
7,218, // ID
16,523, // `(
30,1240, // <exp>
35,1156, // <exp8>
36,320, // <exp7>
37,24, // <exp6>
38,22, // <exp5>
39,138, // <exp4>
41,480, // <exp3>
43,83, // <exp2>
44,256, // <cast exp>
45,491, // <unary exp>
46,111, // <exp1>
47,851, // `-
48,465, // INTLIT
49,972, // letter
50,816, // {"A".."Z" "a" "d" "g" "j".."k" "m".."n" "q".."s" "y".."z"}
51,816, // "p"
52,816, // "v"
53,816, // "c"
54,816, // "f"
55,816, // "i"
56,816, // "l"
57,816, // "o"
58,816, // "u"
59,816, // "x"
60,816, // "b"
61,816, // "e"
62,816, // "h"
63,816, // "t"
64,816, // "w"
65,1229, // letter128
66,735, // {199..218 231..250}
67,735, // {193..198 225..230}
69,272, // {"1".."9"}
70,1080, // "0"
71,593, // digit128
72,1282, // {176..185}
79,960, // "("
83,1296, // "-"
  }
,
{ // state 1016
2,439, // ws*
23,MIN_REDUCTION+126, // `[
73,109, // ws
74,14, // " "
75,102, // {10}
85,MIN_REDUCTION+126, // "["
MIN_REDUCTION+126, // (default reduction)
  }
,
{ // state 1017
23,MIN_REDUCTION+123, // `[
85,MIN_REDUCTION+123, // "["
MIN_REDUCTION+123, // (default reduction)
  }
,
{ // state 1018
MIN_REDUCTION+49, // (default reduction)
  }
,
{ // state 1019
0x80000000|1235, // match move
0x80000000|385, // no-match move
0x80000000|1145, // NT-test-match state for `else
  }
,
{ // state 1020
MIN_REDUCTION+106, // (default reduction)
  }
,
{ // state 1021
23,MIN_REDUCTION+106, // `[
85,MIN_REDUCTION+106, // "["
MIN_REDUCTION+106, // (default reduction)
  }
,
{ // state 1022
23,MIN_REDUCTION+50, // `[
85,MIN_REDUCTION+50, // "["
101,MIN_REDUCTION+50, // $NT
MIN_REDUCTION+50, // (default reduction)
  }
,
{ // state 1023
17,562, // `)
80,588, // ")"
  }
,
{ // state 1024
-1, // $$start
-1, // <start>
-1, // ws*
-1, // <program>
-1, // <class decl>+
-1, // <class decl>
-1, // `class
264, // ID
711, // `{
-1, // <decl in class>*
-1, // `}
-1, // `extends
-1, // <decl in class>
-1, // <method decl>
-1, // `public
-1, // `void
518, // `(
-1, // `)
-1, // <stmt>*
209, // <type>
924, // `int
930, // `boolean
-1, // <empty bracket pair>
-1, // `[
-1, // `]
1284, // <stmt>
1167, // <assign>
-1, // `;
366, // <local var decl>
680, // `if
592, // <exp>
-1, // `else
210, // `while
803, // `for
-1, // `=
1153, // <exp8>
325, // <exp7>
19, // <exp6>
25, // <exp5>
101, // <exp4>
-1, // `+
483, // <exp3>
-1, // `*
78, // <exp2>
258, // <cast exp>
490, // <unary exp>
95, // <exp1>
854, // `-
461, // INTLIT
1239, // letter
816, // {"A".."Z" "a" "d" "g" "j".."k" "m".."n" "q".."s" "y".."z"}
816, // "p"
816, // "v"
816, // "c"
816, // "f"
816, // "i"
816, // "l"
816, // "o"
816, // "u"
816, // "x"
816, // "b"
816, // "e"
816, // "h"
816, // "t"
816, // "w"
374, // letter128
189, // {199..218 231..250}
189, // {193..198 225..230}
-1, // digit
269, // {"1".."9"}
1084, // "0"
591, // digit128
1279, // {176..185}
-1, // ws
-1, // " "
-1, // {10}
395, // "#"
-1, // "+"
-1, // "*"
960, // "("
-1, // ")"
887, // "{"
-1, // "}"
1296, // "-"
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
{ // state 1025
MIN_REDUCTION+123, // (default reduction)
  }
,
{ // state 1026
27,MIN_REDUCTION+50, // `;
87,MIN_REDUCTION+50, // ";"
MIN_REDUCTION+50, // (default reduction)
  }
,
{ // state 1027
2,1294, // ws*
23,MIN_REDUCTION+126, // `[
73,1174, // ws
74,90, // " "
75,99, // {10}
85,MIN_REDUCTION+126, // "["
101,MIN_REDUCTION+126, // $NT
MIN_REDUCTION+126, // (default reduction)
  }
,
{ // state 1028
MIN_REDUCTION+46, // (default reduction)
  }
,
{ // state 1029
MIN_REDUCTION+108, // (default reduction)
  }
,
{ // state 1030
31,907, // `else
76,475, // "#"
  }
,
{ // state 1031
MIN_REDUCTION+50, // (default reduction)
  }
,
{ // state 1032
0x80000000|786, // match move
0x80000000|474, // no-match move
0x80000000|1145, // NT-test-match state for `else
  }
,
{ // state 1033
49,676, // letter
50,67, // {"A".."Z" "a" "d" "g" "j".."k" "m".."n" "q".."s" "y".."z"}
51,67, // "p"
52,67, // "v"
53,67, // "c"
54,67, // "f"
55,67, // "i"
56,67, // "l"
57,67, // "o"
58,67, // "u"
59,67, // "x"
60,67, // "b"
61,67, // "e"
62,67, // "h"
63,67, // "t"
64,67, // "w"
65,1056, // letter128
66,752, // {199..218 231..250}
67,752, // {193..198 225..230}
68,290, // digit
69,253, // {"1".."9"}
70,253, // "0"
71,800, // digit128
72,1269, // {176..185}
88,127, // idChar*
89,295, // $$0
94,532, // idChar
95,1227, // "_"
96,87, // idChar128
97,825, // {223}
  }
,
{ // state 1034
-1, // $$start
-1, // <start>
-1, // ws*
-1, // <program>
-1, // <class decl>+
-1, // <class decl>
-1, // `class
264, // ID
51, // `{
-1, // <decl in class>*
-1, // `}
-1, // `extends
-1, // <decl in class>
-1, // <method decl>
-1, // `public
-1, // `void
518, // `(
-1, // `)
-1, // <stmt>*
209, // <type>
924, // `int
930, // `boolean
-1, // <empty bracket pair>
-1, // `[
-1, // `]
1099, // <stmt>
1046, // <assign>
-1, // `;
30, // <local var decl>
238, // `if
592, // <exp>
-1, // `else
1312, // `while
185, // `for
-1, // `=
1153, // <exp8>
325, // <exp7>
19, // <exp6>
25, // <exp5>
101, // <exp4>
-1, // `+
483, // <exp3>
-1, // `*
78, // <exp2>
258, // <cast exp>
490, // <unary exp>
95, // <exp1>
854, // `-
461, // INTLIT
1239, // letter
816, // {"A".."Z" "a" "d" "g" "j".."k" "m".."n" "q".."s" "y".."z"}
816, // "p"
816, // "v"
816, // "c"
816, // "f"
816, // "i"
816, // "l"
816, // "o"
816, // "u"
816, // "x"
816, // "b"
816, // "e"
816, // "h"
816, // "t"
816, // "w"
374, // letter128
189, // {199..218 231..250}
189, // {193..198 225..230}
-1, // digit
269, // {"1".."9"}
1084, // "0"
591, // digit128
1279, // {176..185}
-1, // ws
-1, // " "
-1, // {10}
395, // "#"
-1, // "+"
-1, // "*"
960, // "("
-1, // ")"
887, // "{"
-1, // "}"
1296, // "-"
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
{ // state 1035
27,865, // `;
87,1330, // ";"
  }
,
{ // state 1036
0x80000000|18, // match move
0x80000000|1075, // no-match move
0x80000000|1145, // NT-test-match state for `else
  }
,
{ // state 1037
MIN_REDUCTION+46, // (default reduction)
  }
,
{ // state 1038
23,MIN_REDUCTION+48, // `[
85,MIN_REDUCTION+48, // "["
MIN_REDUCTION+48, // (default reduction)
  }
,
{ // state 1039
50,1066, // {"A".."Z" "a" "d" "g" "j".."k" "m".."n" "q".."s" "y".."z"}
51,1066, // "p"
52,1066, // "v"
53,1066, // "c"
54,1066, // "f"
55,1066, // "i"
56,1066, // "l"
57,1066, // "o"
58,1066, // "u"
59,1066, // "x"
60,1066, // "b"
61,1066, // "e"
62,1066, // "h"
63,1066, // "t"
64,1066, // "w"
67,65, // {193..198 225..230}
69,1066, // {"1".."9"}
70,1066, // "0"
72,65, // {176..185}
92,739, // hexDigit*
93,362, // $$2
98,1216, // hexDigit
99,620, // hexDigit128
  }
,
{ // state 1040
MIN_REDUCTION+46, // (default reduction)
  }
,
{ // state 1041
MIN_REDUCTION+123, // (default reduction)
  }
,
{ // state 1042
0x80000000|1172, // match move
0x80000000|512, // no-match move
0x80000000|1145, // NT-test-match state for `else
  }
,
{ // state 1043
0x80000000|1, // match move
0x80000000|690, // no-match move
0x80000000|47, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 1044
0x80000000|1020, // match move
0x80000000|715, // no-match move
0x80000000|47, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 1045
73,553, // ws
74,697, // " "
75,976, // {10}
MIN_REDUCTION+73, // (default reduction)
  }
,
{ // state 1046
27,1244, // `;
87,756, // ";"
  }
,
{ // state 1047
0x80000000|1020, // match move
0x80000000|720, // no-match move
0x80000000|47, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 1048
MIN_REDUCTION+16, // (default reduction)
  }
,
{ // state 1049
MIN_REDUCTION+46, // (default reduction)
  }
,
{ // state 1050
17,1142, // `)
80,588, // ")"
  }
,
{ // state 1051
MIN_REDUCTION+27, // (default reduction)
  }
,
{ // state 1052
MIN_REDUCTION+111, // (default reduction)
  }
,
{ // state 1053
0x80000000|1, // match move
0x80000000|446, // no-match move
0x80000000|47, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 1054
0x80000000|1, // match move
0x80000000|442, // no-match move
0x80000000|47, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 1055
7,243, // ID
16,370, // `(
30,675, // <exp>
35,1175, // <exp8>
36,2, // <exp7>
37,338, // <exp6>
38,340, // <exp5>
39,64, // <exp4>
41,535, // <exp3>
43,55, // <exp2>
44,288, // <cast exp>
45,520, // <unary exp>
46,130, // <exp1>
47,870, // `-
48,445, // INTLIT
49,777, // letter
50,816, // {"A".."Z" "a" "d" "g" "j".."k" "m".."n" "q".."s" "y".."z"}
51,816, // "p"
52,816, // "v"
53,816, // "c"
54,816, // "f"
55,816, // "i"
56,816, // "l"
57,816, // "o"
58,816, // "u"
59,816, // "x"
60,816, // "b"
61,816, // "e"
62,816, // "h"
63,816, // "t"
64,816, // "w"
65,1193, // letter128
66,709, // {199..218 231..250}
67,709, // {193..198 225..230}
69,225, // {"1".."9"}
70,1039, // "0"
71,554, // digit128
72,1298, // {176..185}
79,960, // "("
83,1296, // "-"
  }
,
{ // state 1056
0x80000000|1020, // match move
0x80000000|695, // no-match move
0x80000000|47, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 1057
MIN_REDUCTION+14, // (default reduction)
  }
,
{ // state 1058
2,43, // ws*
73,345, // ws
74,961, // " "
75,988, // {10}
MIN_REDUCTION+78, // (default reduction)
  }
,
{ // state 1059
0x80000000|1207, // match move
0x80000000|776, // no-match move
0x80000000|47, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 1060
MIN_REDUCTION+11, // (default reduction)
  }
,
{ // state 1061
0x80000000|18, // match move
0x80000000|1110, // no-match move
0x80000000|1145, // NT-test-match state for `else
  }
,
{ // state 1062
MIN_REDUCTION+40, // (default reduction)
  }
,
{ // state 1063
27,878, // `;
87,1320, // ";"
  }
,
{ // state 1064
2,659, // ws*
73,560, // ws
74,1259, // " "
75,700, // {10}
MIN_REDUCTION+54, // (default reduction)
  }
,
{ // state 1065
0x80000000|49, // match move
0x80000000|513, // no-match move
0x80000000|801, // NT-test-match state for <exp>
  }
,
{ // state 1066
MIN_REDUCTION+109, // (default reduction)
  }
,
{ // state 1067
7,243, // ID
16,370, // `(
30,635, // <exp>
35,1175, // <exp8>
36,2, // <exp7>
37,338, // <exp6>
38,340, // <exp5>
39,64, // <exp4>
41,535, // <exp3>
43,55, // <exp2>
44,288, // <cast exp>
45,520, // <unary exp>
46,130, // <exp1>
47,870, // `-
48,445, // INTLIT
49,777, // letter
50,816, // {"A".."Z" "a" "d" "g" "j".."k" "m".."n" "q".."s" "y".."z"}
51,816, // "p"
52,816, // "v"
53,816, // "c"
54,816, // "f"
55,816, // "i"
56,816, // "l"
57,816, // "o"
58,816, // "u"
59,816, // "x"
60,816, // "b"
61,816, // "e"
62,816, // "h"
63,816, // "t"
64,816, // "w"
65,1193, // letter128
66,709, // {199..218 231..250}
67,709, // {193..198 225..230}
69,225, // {"1".."9"}
70,1039, // "0"
71,554, // digit128
72,1298, // {176..185}
79,960, // "("
83,1296, // "-"
  }
,
{ // state 1068
MIN_REDUCTION+106, // (default reduction)
  }
,
{ // state 1069
73,1041, // ws
74,1179, // " "
75,827, // {10}
MIN_REDUCTION+93, // (default reduction)
  }
,
{ // state 1070
0x80000000|606, // match move
0x80000000|10, // no-match move
0x80000000|1145, // NT-test-match state for `else
  }
,
{ // state 1071
0x80000000|489, // match move
0x80000000|1286, // no-match move
0x80000000|1145, // NT-test-match state for `else
  }
,
{ // state 1072
23,MIN_REDUCTION+96, // `[
85,MIN_REDUCTION+96, // "["
MIN_REDUCTION+96, // (default reduction)
  }
,
{ // state 1073
2,698, // ws*
73,398, // ws
74,996, // " "
75,571, // {10}
MIN_REDUCTION+80, // (default reduction)
  }
,
{ // state 1074
23,MIN_REDUCTION+42, // `[
34,MIN_REDUCTION+42, // `=
40,MIN_REDUCTION+42, // `+
42,MIN_REDUCTION+42, // `*
77,MIN_REDUCTION+42, // "+"
78,MIN_REDUCTION+42, // "*"
84,MIN_REDUCTION+42, // "="
85,MIN_REDUCTION+42, // "["
MIN_REDUCTION+13, // (default reduction)
  }
,
{ // state 1075
MIN_REDUCTION+17, // (default reduction)
  }
,
{ // state 1076
0x80000000|343, // match move
0x80000000|309, // no-match move
0x80000000|1145, // NT-test-match state for `else
  }
,
{ // state 1077
MIN_REDUCTION+124, // (default reduction)
  }
,
{ // state 1078
7,243, // ID
16,370, // `(
30,621, // <exp>
35,1175, // <exp8>
36,2, // <exp7>
37,338, // <exp6>
38,340, // <exp5>
39,64, // <exp4>
41,535, // <exp3>
43,55, // <exp2>
44,288, // <cast exp>
45,520, // <unary exp>
46,130, // <exp1>
47,870, // `-
48,445, // INTLIT
49,777, // letter
50,816, // {"A".."Z" "a" "d" "g" "j".."k" "m".."n" "q".."s" "y".."z"}
51,816, // "p"
52,816, // "v"
53,816, // "c"
54,816, // "f"
55,816, // "i"
56,816, // "l"
57,816, // "o"
58,816, // "u"
59,816, // "x"
60,816, // "b"
61,816, // "e"
62,816, // "h"
63,816, // "t"
64,816, // "w"
65,1193, // letter128
66,709, // {199..218 231..250}
67,709, // {193..198 225..230}
69,225, // {"1".."9"}
70,1039, // "0"
71,554, // digit128
72,1298, // {176..185}
79,960, // "("
83,1296, // "-"
  }
,
{ // state 1079
0x80000000|1, // match move
0x80000000|103, // no-match move
0x80000000|47, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 1080
50,1066, // {"A".."Z" "a" "d" "g" "j".."k" "m".."n" "q".."s" "y".."z"}
51,1066, // "p"
52,1066, // "v"
53,1066, // "c"
54,1066, // "f"
55,1066, // "i"
56,1066, // "l"
57,1066, // "o"
58,1066, // "u"
59,1066, // "x"
60,1066, // "b"
61,1066, // "e"
62,1066, // "h"
63,1066, // "t"
64,1066, // "w"
67,261, // {193..198 225..230}
69,1066, // {"1".."9"}
70,1066, // "0"
72,261, // {176..185}
92,823, // hexDigit*
93,383, // $$2
98,1216, // hexDigit
99,761, // hexDigit128
  }
,
{ // state 1081
23,MIN_REDUCTION+43, // `[
85,MIN_REDUCTION+43, // "["
101,MIN_REDUCTION+43, // $NT
MIN_REDUCTION+43, // (default reduction)
  }
,
{ // state 1082
MIN_REDUCTION+22, // (default reduction)
  }
,
{ // state 1083
73,553, // ws
74,697, // " "
75,976, // {10}
MIN_REDUCTION+75, // (default reduction)
  }
,
{ // state 1084
50,1066, // {"A".."Z" "a" "d" "g" "j".."k" "m".."n" "q".."s" "y".."z"}
51,1066, // "p"
52,1066, // "v"
53,1066, // "c"
54,1066, // "f"
55,1066, // "i"
56,1066, // "l"
57,1066, // "o"
58,1066, // "u"
59,1066, // "x"
60,1066, // "b"
61,1066, // "e"
62,1066, // "h"
63,1066, // "t"
64,1066, // "w"
67,257, // {193..198 225..230}
69,1066, // {"1".."9"}
70,1066, // "0"
72,257, // {176..185}
92,826, // hexDigit*
93,387, // $$2
98,1216, // hexDigit
99,748, // hexDigit128
  }
,
{ // state 1085
7,243, // ID
16,370, // `(
30,629, // <exp>
35,1175, // <exp8>
36,2, // <exp7>
37,338, // <exp6>
38,340, // <exp5>
39,64, // <exp4>
41,535, // <exp3>
43,55, // <exp2>
44,288, // <cast exp>
45,520, // <unary exp>
46,130, // <exp1>
47,870, // `-
48,445, // INTLIT
49,777, // letter
50,816, // {"A".."Z" "a" "d" "g" "j".."k" "m".."n" "q".."s" "y".."z"}
51,816, // "p"
52,816, // "v"
53,816, // "c"
54,816, // "f"
55,816, // "i"
56,816, // "l"
57,816, // "o"
58,816, // "u"
59,816, // "x"
60,816, // "b"
61,816, // "e"
62,816, // "h"
63,816, // "t"
64,816, // "w"
65,1193, // letter128
66,709, // {199..218 231..250}
67,709, // {193..198 225..230}
69,225, // {"1".."9"}
70,1039, // "0"
71,554, // digit128
72,1298, // {176..185}
79,960, // "("
83,1296, // "-"
  }
,
{ // state 1086
-1, // $$start
-1, // <start>
-1, // ws*
-1, // <program>
-1, // <class decl>+
-1, // <class decl>
-1, // `class
264, // ID
52, // `{
-1, // <decl in class>*
-1, // `}
-1, // `extends
-1, // <decl in class>
-1, // <method decl>
-1, // `public
-1, // `void
518, // `(
-1, // `)
-1, // <stmt>*
209, // <type>
924, // `int
930, // `boolean
-1, // <empty bracket pair>
-1, // `[
-1, // `]
1032, // <stmt>
925, // <assign>
-1, // `;
757, // <local var decl>
1338, // `if
592, // <exp>
-1, // `else
471, // `while
654, // `for
-1, // `=
1153, // <exp8>
325, // <exp7>
19, // <exp6>
25, // <exp5>
101, // <exp4>
-1, // `+
483, // <exp3>
-1, // `*
78, // <exp2>
258, // <cast exp>
490, // <unary exp>
95, // <exp1>
854, // `-
461, // INTLIT
1239, // letter
816, // {"A".."Z" "a" "d" "g" "j".."k" "m".."n" "q".."s" "y".."z"}
816, // "p"
816, // "v"
816, // "c"
816, // "f"
816, // "i"
816, // "l"
816, // "o"
816, // "u"
816, // "x"
816, // "b"
816, // "e"
816, // "h"
816, // "t"
816, // "w"
374, // letter128
189, // {199..218 231..250}
189, // {193..198 225..230}
-1, // digit
269, // {"1".."9"}
1084, // "0"
591, // digit128
1279, // {176..185}
-1, // ws
-1, // " "
-1, // {10}
395, // "#"
-1, // "+"
-1, // "*"
960, // "("
-1, // ")"
887, // "{"
-1, // "}"
1296, // "-"
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
{ // state 1087
73,492, // ws
74,997, // " "
75,329, // {10}
101,MIN_REDUCTION+89, // $NT
  }
,
{ // state 1088
MIN_REDUCTION+124, // (default reduction)
  }
,
{ // state 1089
-1, // $$start
-1, // <start>
-1, // ws*
-1, // <program>
-1, // <class decl>+
-1, // <class decl>
-1, // `class
264, // ID
731, // `{
-1, // <decl in class>*
-1, // `}
-1, // `extends
-1, // <decl in class>
-1, // <method decl>
-1, // `public
-1, // `void
518, // `(
-1, // `)
-1, // <stmt>*
209, // <type>
924, // `int
930, // `boolean
-1, // <empty bracket pair>
-1, // `[
-1, // `]
587, // <stmt>
691, // <assign>
-1, // `;
1106, // <local var decl>
920, // `if
592, // <exp>
-1, // `else
701, // `while
208, // `for
-1, // `=
1153, // <exp8>
325, // <exp7>
19, // <exp6>
25, // <exp5>
101, // <exp4>
-1, // `+
483, // <exp3>
-1, // `*
78, // <exp2>
258, // <cast exp>
490, // <unary exp>
95, // <exp1>
854, // `-
461, // INTLIT
1239, // letter
816, // {"A".."Z" "a" "d" "g" "j".."k" "m".."n" "q".."s" "y".."z"}
816, // "p"
816, // "v"
816, // "c"
816, // "f"
816, // "i"
816, // "l"
816, // "o"
816, // "u"
816, // "x"
816, // "b"
816, // "e"
816, // "h"
816, // "t"
816, // "w"
374, // letter128
189, // {199..218 231..250}
189, // {193..198 225..230}
-1, // digit
269, // {"1".."9"}
1084, // "0"
591, // digit128
1279, // {176..185}
-1, // ws
-1, // " "
-1, // {10}
395, // "#"
-1, // "+"
-1, // "*"
960, // "("
-1, // ")"
887, // "{"
-1, // "}"
1296, // "-"
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
{ // state 1090
0x80000000|201, // match move
0x80000000|140, // no-match move
0x80000000|801, // NT-test-match state for <exp>
  }
,
{ // state 1091
MIN_REDUCTION+121, // (default reduction)
  }
,
{ // state 1092
0x80000000|1, // match move
0x80000000|278, // no-match move
0x80000000|47, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 1093
27,878, // `;
87,179, // ";"
  }
,
{ // state 1094
2,710, // ws*
73,415, // ws
74,975, // " "
75,581, // {10}
MIN_REDUCTION+80, // (default reduction)
  }
,
{ // state 1095
0x80000000|1, // match move
0x80000000|484, // no-match move
0x80000000|47, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 1096
0x80000000|1172, // match move
0x80000000|379, // no-match move
0x80000000|1145, // NT-test-match state for `else
  }
,
{ // state 1097
2,470, // ws*
73,301, // ws
74,1000, // " "
75,1031, // {10}
MIN_REDUCTION+92, // (default reduction)
  }
,
{ // state 1098
101,MIN_REDUCTION+27, // $NT
  }
,
{ // state 1099
0x80000000|580, // match move
0x80000000|10, // no-match move
0x80000000|1145, // NT-test-match state for `else
  }
,
{ // state 1100
MIN_REDUCTION+47, // (default reduction)
  }
,
{ // state 1101
MIN_REDUCTION+124, // (default reduction)
  }
,
{ // state 1102
101,MIN_REDUCTION+40, // $NT
MIN_REDUCTION+40, // (default reduction)
  }
,
{ // state 1103
23,MIN_REDUCTION+49, // `[
85,MIN_REDUCTION+49, // "["
101,MIN_REDUCTION+49, // $NT
MIN_REDUCTION+49, // (default reduction)
  }
,
{ // state 1104
2,948, // ws*
73,733, // ws
74,376, // " "
75,228, // {10}
MIN_REDUCTION+94, // (default reduction)
  }
,
{ // state 1105
MIN_REDUCTION+23, // (default reduction)
  }
,
{ // state 1106
27,865, // `;
87,227, // ";"
  }
,
{ // state 1107
0x80000000|784, // match move
0x80000000|1008, // no-match move
0x80000000|47, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 1108
MIN_REDUCTION+124, // (default reduction)
  }
,
{ // state 1109
MIN_REDUCTION+46, // (default reduction)
  }
,
{ // state 1110
MIN_REDUCTION+17, // (default reduction)
  }
,
{ // state 1111
0x80000000|559, // match move
0x80000000|125, // no-match move
0x80000000|801, // NT-test-match state for <exp>
  }
,
{ // state 1112
9,845, // <decl in class>*
10,770, // `}
12,647, // <decl in class>
13,212, // <method decl>
14,310, // `public
76,1253, // "#"
82,21, // "}"
  }
,
{ // state 1113
61,132, // "e"
  }
,
{ // state 1114
27,1210, // `;
87,857, // ";"
  }
,
{ // state 1115
17,916, // `)
80,588, // ")"
  }
,
{ // state 1116
0x80000000|1, // match move
0x80000000|1260, // no-match move
0x80000000|47, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 1117
2,1092, // ws*
  }
,
{ // state 1118
0x80000000|1, // match move
0x80000000|1258, // no-match move
0x80000000|47, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 1119
50,1066, // {"A".."Z" "a" "d" "g" "j".."k" "m".."n" "q".."s" "y".."z"}
51,1066, // "p"
52,1066, // "v"
53,1066, // "c"
54,1066, // "f"
55,1066, // "i"
56,1066, // "l"
57,1066, // "o"
58,1066, // "u"
59,1066, // "x"
60,1066, // "b"
61,1066, // "e"
62,1066, // "h"
63,1066, // "t"
64,1066, // "w"
67,270, // {193..198 225..230}
69,1066, // {"1".."9"}
70,1066, // "0"
72,270, // {176..185}
92,835, // hexDigit*
93,372, // $$2
98,1216, // hexDigit
99,724, // hexDigit128
  }
,
{ // state 1120
73,MIN_REDUCTION+124, // ws
74,MIN_REDUCTION+124, // " "
75,MIN_REDUCTION+124, // {10}
MIN_REDUCTION+124, // (default reduction)
  }
,
{ // state 1121
101,MIN_REDUCTION+123, // $NT
  }
,
{ // state 1122
MIN_REDUCTION+6, // (default reduction)
  }
,
{ // state 1123
24,732, // `]
86,611, // "]"
  }
,
{ // state 1124
MIN_REDUCTION+24, // (default reduction)
  }
,
{ // state 1125
101,MIN_REDUCTION+127, // $NT
  }
,
{ // state 1126
2,231, // ws*
73,1264, // ws
74,44, // " "
75,934, // {10}
MIN_REDUCTION+76, // (default reduction)
  }
,
{ // state 1127
2,969, // ws*
  }
,
{ // state 1128
0x80000000|1, // match move
0x80000000|861, // no-match move
0x80000000|47, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 1129
2,966, // ws*
  }
,
{ // state 1130
MIN_REDUCTION+48, // (default reduction)
  }
,
{ // state 1131
16,938, // `(
79,1065, // "("
  }
,
{ // state 1132
MIN_REDUCTION+24, // (default reduction)
  }
,
{ // state 1133
2,1019, // ws*
73,515, // ws
74,91, // " "
75,1170, // {10}
MIN_REDUCTION+80, // (default reduction)
  }
,
{ // state 1134
17,MIN_REDUCTION+124, // `)
80,MIN_REDUCTION+124, // ")"
MIN_REDUCTION+124, // (default reduction)
  }
,
{ // state 1135
2,92, // ws*
73,251, // ws
74,1179, // " "
75,827, // {10}
MIN_REDUCTION+52, // (default reduction)
  }
,
{ // state 1136
MIN_REDUCTION+13, // (default reduction)
  }
,
{ // state 1137
2,955, // ws*
73,780, // ws
74,352, // " "
75,284, // {10}
MIN_REDUCTION+94, // (default reduction)
  }
,
{ // state 1138
0x80000000|1, // match move
0x80000000|868, // no-match move
0x80000000|47, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 1139
73,1041, // ws
74,1179, // " "
75,827, // {10}
MIN_REDUCTION+89, // (default reduction)
  }
,
{ // state 1140
17,862, // `)
80,588, // ")"
  }
,
{ // state 1141
7,236, // ID
16,482, // `(
30,525, // <exp>
35,1051, // <exp8>
36,313, // <exp7>
37,36, // <exp6>
38,33, // <exp5>
39,164, // <exp4>
41,411, // <exp3>
43,11, // <exp2>
44,336, // <cast exp>
45,507, // <unary exp>
46,230, // <exp1>
47,859, // `-
48,478, // INTLIT
49,1033, // letter
50,816, // {"A".."Z" "a" "d" "g" "j".."k" "m".."n" "q".."s" "y".."z"}
51,816, // "p"
52,816, // "v"
53,816, // "c"
54,816, // "f"
55,816, // "i"
56,816, // "l"
57,816, // "o"
58,816, // "u"
59,816, // "x"
60,816, // "b"
61,816, // "e"
62,816, // "h"
63,816, // "t"
64,816, // "w"
65,1288, // letter128
66,752, // {199..218 231..250}
67,752, // {193..198 225..230}
69,298, // {"1".."9"}
70,1119, // "0"
71,597, // digit128
72,1269, // {176..185}
79,960, // "("
83,1296, // "-"
  }
,
{ // state 1142
-1, // $$start
-1, // <start>
-1, // ws*
-1, // <program>
-1, // <class decl>+
-1, // <class decl>
-1, // `class
264, // ID
759, // `{
-1, // <decl in class>*
-1, // `}
-1, // `extends
-1, // <decl in class>
-1, // <method decl>
-1, // `public
-1, // `void
518, // `(
-1, // `)
-1, // <stmt>*
209, // <type>
924, // `int
930, // `boolean
-1, // <empty bracket pair>
-1, // `[
-1, // `]
486, // <stmt>
787, // <assign>
-1, // `;
1093, // <local var decl>
985, // `if
592, // <exp>
-1, // `else
726, // `while
177, // `for
-1, // `=
1153, // <exp8>
325, // <exp7>
19, // <exp6>
25, // <exp5>
101, // <exp4>
-1, // `+
483, // <exp3>
-1, // `*
78, // <exp2>
258, // <cast exp>
490, // <unary exp>
95, // <exp1>
854, // `-
461, // INTLIT
1239, // letter
816, // {"A".."Z" "a" "d" "g" "j".."k" "m".."n" "q".."s" "y".."z"}
816, // "p"
816, // "v"
816, // "c"
816, // "f"
816, // "i"
816, // "l"
816, // "o"
816, // "u"
816, // "x"
816, // "b"
816, // "e"
816, // "h"
816, // "t"
816, // "w"
374, // letter128
189, // {199..218 231..250}
189, // {193..198 225..230}
-1, // digit
269, // {"1".."9"}
1084, // "0"
591, // digit128
1279, // {176..185}
-1, // ws
-1, // " "
-1, // {10}
395, // "#"
-1, // "+"
-1, // "*"
960, // "("
-1, // ")"
887, // "{"
-1, // "}"
1296, // "-"
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
{ // state 1143
0x80000000|1, // match move
0x80000000|879, // no-match move
0x80000000|47, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 1144
2,1285, // ws*
73,560, // ws
74,1259, // " "
75,700, // {10}
MIN_REDUCTION+58, // (default reduction)
  }
,
{ // state 1145
76,897, // "#"
  }
,
{ // state 1146
0x80000000|1, // match move
0x80000000|876, // no-match move
0x80000000|47, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 1147
2,1043, // ws*
  }
,
{ // state 1148
58,628, // "u"
  }
,
{ // state 1149
27,371, // `;
87,857, // ";"
  }
,
{ // state 1150
2,274, // ws*
73,1088, // ws
74,166, // " "
75,190, // {10}
MIN_REDUCTION+72, // (default reduction)
  }
,
{ // state 1151
-1, // $$start
-1, // <start>
-1, // ws*
-1, // <program>
-1, // <class decl>+
-1, // <class decl>
-1, // `class
264, // ID
52, // `{
-1, // <decl in class>*
-1, // `}
-1, // `extends
-1, // <decl in class>
-1, // <method decl>
-1, // `public
-1, // `void
518, // `(
-1, // `)
-1, // <stmt>*
209, // <type>
924, // `int
930, // `boolean
-1, // <empty bracket pair>
-1, // `[
-1, // `]
276, // <stmt>
925, // <assign>
-1, // `;
757, // <local var decl>
1338, // `if
592, // <exp>
-1, // `else
471, // `while
654, // `for
-1, // `=
1153, // <exp8>
325, // <exp7>
19, // <exp6>
25, // <exp5>
101, // <exp4>
-1, // `+
483, // <exp3>
-1, // `*
78, // <exp2>
258, // <cast exp>
490, // <unary exp>
95, // <exp1>
854, // `-
461, // INTLIT
1239, // letter
816, // {"A".."Z" "a" "d" "g" "j".."k" "m".."n" "q".."s" "y".."z"}
816, // "p"
816, // "v"
816, // "c"
816, // "f"
816, // "i"
816, // "l"
816, // "o"
816, // "u"
816, // "x"
816, // "b"
816, // "e"
816, // "h"
816, // "t"
816, // "w"
374, // letter128
189, // {199..218 231..250}
189, // {193..198 225..230}
-1, // digit
269, // {"1".."9"}
1084, // "0"
591, // digit128
1279, // {176..185}
-1, // ws
-1, // " "
-1, // {10}
395, // "#"
-1, // "+"
-1, // "*"
960, // "("
-1, // ")"
887, // "{"
-1, // "}"
1296, // "-"
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
{ // state 1152
0x80000000|1, // match move
0x80000000|1213, // no-match move
0x80000000|47, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 1153
MIN_REDUCTION+27, // (default reduction)
  }
,
{ // state 1154
MIN_REDUCTION+49, // (default reduction)
  }
,
{ // state 1155
17,1089, // `)
80,588, // ")"
  }
,
{ // state 1156
MIN_REDUCTION+27, // (default reduction)
  }
,
{ // state 1157
17,804, // `)
80,588, // ")"
  }
,
{ // state 1158
0x80000000|1, // match move
0x80000000|413, // no-match move
0x80000000|47, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 1159
23,MIN_REDUCTION+98, // `[
85,MIN_REDUCTION+98, // "["
MIN_REDUCTION+98, // (default reduction)
  }
,
{ // state 1160
2,248, // ws*
73,251, // ws
74,1179, // " "
75,827, // {10}
MIN_REDUCTION+60, // (default reduction)
  }
,
{ // state 1161
0x80000000|447, // match move
0x80000000|528, // no-match move
0x80000000|47, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 1162
0x80000000|473, // match move
0x80000000|1185, // no-match move
0x80000000|47, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 1163
0x80000000|1, // match move
0x80000000|1004, // no-match move
0x80000000|47, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 1164
MIN_REDUCTION+49, // (default reduction)
  }
,
{ // state 1165
73,551, // ws
74,350, // " "
75,282, // {10}
MIN_REDUCTION+73, // (default reduction)
  }
,
{ // state 1166
MIN_REDUCTION+49, // (default reduction)
  }
,
{ // state 1167
27,834, // `;
87,108, // ";"
  }
,
{ // state 1168
0x80000000|1, // match move
0x80000000|1001, // no-match move
0x80000000|47, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 1169
2,1168, // ws*
  }
,
{ // state 1170
0x80000000|315, // match move
0x80000000|719, // no-match move
0x80000000|1145, // NT-test-match state for `else
  }
,
{ // state 1171
0x80000000|1, // match move
0x80000000|977, // no-match move
0x80000000|47, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 1172
MIN_REDUCTION+21, // (default reduction)
  }
,
{ // state 1173
2,1163, // ws*
  }
,
{ // state 1174
0x80000000|529, // match move
0x80000000|1205, // no-match move
0x80000000|47, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 1175
MIN_REDUCTION+27, // (default reduction)
  }
,
{ // state 1176
27,819, // `;
87,133, // ";"
  }
,
{ // state 1177
73,594, // ws
74,441, // " "
75,182, // {10}
MIN_REDUCTION+93, // (default reduction)
  }
,
{ // state 1178
27,1223, // `;
87,857, // ";"
  }
,
{ // state 1179
MIN_REDUCTION+49, // (default reduction)
  }
,
{ // state 1180
2,1171, // ws*
  }
,
{ // state 1181
0x80000000|1, // match move
0x80000000|1319, // no-match move
0x80000000|47, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 1182
2,1013, // ws*
  }
,
{ // state 1183
MIN_REDUCTION+4, // (default reduction)
  }
,
{ // state 1184
0x80000000|1020, // match move
0x80000000|747, // no-match move
0x80000000|47, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 1185
2,1198, // ws*
23,MIN_REDUCTION+128, // `[
73,1174, // ws
74,90, // " "
75,99, // {10}
85,MIN_REDUCTION+128, // "["
101,MIN_REDUCTION+128, // $NT
MIN_REDUCTION+128, // (default reduction)
  }
,
{ // state 1186
101,MIN_REDUCTION+41, // $NT
  }
,
{ // state 1187
MIN_REDUCTION+23, // (default reduction)
  }
,
{ // state 1188
23,MIN_REDUCTION+46, // `[
85,MIN_REDUCTION+46, // "["
MIN_REDUCTION+46, // (default reduction)
  }
,
{ // state 1189
73,551, // ws
74,350, // " "
75,282, // {10}
MIN_REDUCTION+79, // (default reduction)
  }
,
{ // state 1190
0x80000000|918, // match move
0x80000000|1187, // no-match move
0x80000000|1145, // NT-test-match state for `else
  }
,
{ // state 1191
MIN_REDUCTION+23, // (default reduction)
  }
,
{ // state 1192
34,60, // `=
84,1204, // "="
  }
,
{ // state 1193
0x80000000|1182, // match move
0x80000000|933, // no-match move
0x80000000|47, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 1194
7,236, // ID
16,482, // `(
30,1050, // <exp>
35,1051, // <exp8>
36,313, // <exp7>
37,36, // <exp6>
38,33, // <exp5>
39,164, // <exp4>
41,411, // <exp3>
43,11, // <exp2>
44,336, // <cast exp>
45,507, // <unary exp>
46,230, // <exp1>
47,859, // `-
48,478, // INTLIT
49,1033, // letter
50,816, // {"A".."Z" "a" "d" "g" "j".."k" "m".."n" "q".."s" "y".."z"}
51,816, // "p"
52,816, // "v"
53,816, // "c"
54,816, // "f"
55,816, // "i"
56,816, // "l"
57,816, // "o"
58,816, // "u"
59,816, // "x"
60,816, // "b"
61,816, // "e"
62,816, // "h"
63,816, // "t"
64,816, // "w"
65,1288, // letter128
66,752, // {199..218 231..250}
67,752, // {193..198 225..230}
69,298, // {"1".."9"}
70,1119, // "0"
71,597, // digit128
72,1269, // {176..185}
79,960, // "("
83,1296, // "-"
  }
,
{ // state 1195
0x80000000|1, // match move
0x80000000|941, // no-match move
0x80000000|47, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 1196
23,MIN_REDUCTION+46, // `[
85,MIN_REDUCTION+46, // "["
MIN_REDUCTION+46, // (default reduction)
  }
,
{ // state 1197
0x80000000|1, // match move
0x80000000|945, // no-match move
0x80000000|47, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 1198
0x80000000|1125, // match move
0x80000000|915, // no-match move
0x80000000|47, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 1199
2,880, // ws*
73,780, // ws
74,352, // " "
75,284, // {10}
MIN_REDUCTION+68, // (default reduction)
  }
,
{ // state 1200
MIN_REDUCTION+34, // (default reduction)
  }
,
{ // state 1201
MIN_REDUCTION+34, // (default reduction)
  }
,
{ // state 1202
7,236, // ID
16,482, // `(
30,1155, // <exp>
35,1051, // <exp8>
36,313, // <exp7>
37,36, // <exp6>
38,33, // <exp5>
39,164, // <exp4>
41,411, // <exp3>
43,11, // <exp2>
44,336, // <cast exp>
45,507, // <unary exp>
46,230, // <exp1>
47,859, // `-
48,478, // INTLIT
49,1033, // letter
50,816, // {"A".."Z" "a" "d" "g" "j".."k" "m".."n" "q".."s" "y".."z"}
51,816, // "p"
52,816, // "v"
53,816, // "c"
54,816, // "f"
55,816, // "i"
56,816, // "l"
57,816, // "o"
58,816, // "u"
59,816, // "x"
60,816, // "b"
61,816, // "e"
62,816, // "h"
63,816, // "t"
64,816, // "w"
65,1288, // letter128
66,752, // {199..218 231..250}
67,752, // {193..198 225..230}
69,298, // {"1".."9"}
70,1119, // "0"
71,597, // digit128
72,1269, // {176..185}
79,960, // "("
83,1296, // "-"
  }
,
{ // state 1203
73,805, // ws
74,721, // " "
75,1325, // {10}
MIN_REDUCTION+77, // (default reduction)
  }
,
{ // state 1204
2,357, // ws*
73,301, // ws
74,1000, // " "
75,1031, // {10}
MIN_REDUCTION+86, // (default reduction)
  }
,
{ // state 1205
23,MIN_REDUCTION+124, // `[
85,MIN_REDUCTION+124, // "["
101,MIN_REDUCTION+124, // $NT
MIN_REDUCTION+124, // (default reduction)
  }
,
{ // state 1206
MIN_REDUCTION+95, // (default reduction)
  }
,
{ // state 1207
2,1161, // ws*
101,MIN_REDUCTION+94, // $NT
  }
,
{ // state 1208
MIN_REDUCTION+34, // (default reduction)
  }
,
{ // state 1209
7,76, // ID
49,394, // letter
50,816, // {"A".."Z" "a" "d" "g" "j".."k" "m".."n" "q".."s" "y".."z"}
51,816, // "p"
52,816, // "v"
53,816, // "c"
54,816, // "f"
55,816, // "i"
56,816, // "l"
57,816, // "o"
58,816, // "u"
59,816, // "x"
60,816, // "b"
61,816, // "e"
62,816, // "h"
63,816, // "t"
64,816, // "w"
65,1329, // letter128
66,1109, // {199..218 231..250}
67,1109, // {193..198 225..230}
  }
,
{ // state 1210
-1, // $$start
-1, // <start>
-1, // ws*
-1, // <program>
-1, // <class decl>+
-1, // <class decl>
-1, // `class
264, // ID
855, // `{
-1, // <decl in class>*
-1, // `}
-1, // `extends
-1, // <decl in class>
-1, // <method decl>
-1, // `public
-1, // `void
518, // `(
-1, // `)
-1, // <stmt>*
209, // <type>
924, // `int
930, // `boolean
-1, // <empty bracket pair>
-1, // `[
-1, // `]
922, // <stmt>
1176, // <assign>
-1, // `;
533, // <local var decl>
624, // `if
592, // <exp>
-1, // `else
1131, // `while
840, // `for
-1, // `=
1153, // <exp8>
325, // <exp7>
19, // <exp6>
25, // <exp5>
101, // <exp4>
-1, // `+
483, // <exp3>
-1, // `*
78, // <exp2>
258, // <cast exp>
490, // <unary exp>
95, // <exp1>
854, // `-
461, // INTLIT
1239, // letter
816, // {"A".."Z" "a" "d" "g" "j".."k" "m".."n" "q".."s" "y".."z"}
816, // "p"
816, // "v"
816, // "c"
816, // "f"
816, // "i"
816, // "l"
816, // "o"
816, // "u"
816, // "x"
816, // "b"
816, // "e"
816, // "h"
816, // "t"
816, // "w"
374, // letter128
189, // {199..218 231..250}
189, // {193..198 225..230}
-1, // digit
269, // {"1".."9"}
1084, // "0"
591, // digit128
1279, // {176..185}
-1, // ws
-1, // " "
-1, // {10}
395, // "#"
-1, // "+"
-1, // "*"
960, // "("
-1, // ")"
887, // "{"
-1, // "}"
1296, // "-"
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
{ // state 1211
23,MIN_REDUCTION+107, // `[
85,MIN_REDUCTION+107, // "["
101,MIN_REDUCTION+107, // $NT
MIN_REDUCTION+107, // (default reduction)
  }
,
{ // state 1212
0x80000000|1, // match move
0x80000000|891, // no-match move
0x80000000|47, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 1213
23,MIN_REDUCTION+129, // `[
73,53, // ws
74,161, // " "
75,28, // {10}
85,MIN_REDUCTION+129, // "["
MIN_REDUCTION+129, // (default reduction)
  }
,
{ // state 1214
0x80000000|1315, // match move
0x80000000|277, // no-match move
0x80000000|47, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 1215
MIN_REDUCTION+107, // (default reduction)
  }
,
{ // state 1216
MIN_REDUCTION+116, // (default reduction)
  }
,
{ // state 1217
23,MIN_REDUCTION+107, // `[
85,MIN_REDUCTION+107, // "["
MIN_REDUCTION+107, // (default reduction)
  }
,
{ // state 1218
101,MIN_REDUCTION+107, // $NT
MIN_REDUCTION+107, // (default reduction)
  }
,
{ // state 1219
73,1250, // ws
74,975, // " "
75,581, // {10}
MIN_REDUCTION+79, // (default reduction)
  }
,
{ // state 1220
17,408, // `)
80,588, // ")"
  }
,
{ // state 1221
23,MIN_REDUCTION+107, // `[
85,MIN_REDUCTION+107, // "["
MIN_REDUCTION+107, // (default reduction)
  }
,
{ // state 1222
MIN_REDUCTION+16, // (default reduction)
  }
,
{ // state 1223
-1, // $$start
-1, // <start>
-1, // ws*
-1, // <program>
-1, // <class decl>+
-1, // <class decl>
-1, // `class
264, // ID
855, // `{
-1, // <decl in class>*
-1, // `}
-1, // `extends
-1, // <decl in class>
-1, // <method decl>
-1, // `public
-1, // `void
518, // `(
-1, // `)
-1, // <stmt>*
209, // <type>
924, // `int
930, // `boolean
-1, // <empty bracket pair>
-1, // `[
-1, // `]
912, // <stmt>
1176, // <assign>
-1, // `;
533, // <local var decl>
624, // `if
592, // <exp>
-1, // `else
1131, // `while
840, // `for
-1, // `=
1153, // <exp8>
325, // <exp7>
19, // <exp6>
25, // <exp5>
101, // <exp4>
-1, // `+
483, // <exp3>
-1, // `*
78, // <exp2>
258, // <cast exp>
490, // <unary exp>
95, // <exp1>
854, // `-
461, // INTLIT
1239, // letter
816, // {"A".."Z" "a" "d" "g" "j".."k" "m".."n" "q".."s" "y".."z"}
816, // "p"
816, // "v"
816, // "c"
816, // "f"
816, // "i"
816, // "l"
816, // "o"
816, // "u"
816, // "x"
816, // "b"
816, // "e"
816, // "h"
816, // "t"
816, // "w"
374, // letter128
189, // {199..218 231..250}
189, // {193..198 225..230}
-1, // digit
269, // {"1".."9"}
1084, // "0"
591, // digit128
1279, // {176..185}
-1, // ws
-1, // " "
-1, // {10}
395, // "#"
-1, // "+"
-1, // "*"
960, // "("
-1, // ")"
887, // "{"
-1, // "}"
1296, // "-"
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
{ // state 1224
16,271, // `(
79,16, // "("
  }
,
{ // state 1225
-1, // $$start
-1, // <start>
-1, // ws*
-1, // <program>
-1, // <class decl>+
-1, // <class decl>
-1, // `class
264, // ID
855, // `{
-1, // <decl in class>*
-1, // `}
-1, // `extends
-1, // <decl in class>
-1, // <method decl>
-1, // `public
-1, // `void
518, // `(
-1, // `)
-1, // <stmt>*
209, // <type>
924, // `int
930, // `boolean
-1, // <empty bracket pair>
-1, // `[
-1, // `]
1303, // <stmt>
1176, // <assign>
-1, // `;
533, // <local var decl>
624, // `if
592, // <exp>
-1, // `else
1131, // `while
840, // `for
-1, // `=
1153, // <exp8>
325, // <exp7>
19, // <exp6>
25, // <exp5>
101, // <exp4>
-1, // `+
483, // <exp3>
-1, // `*
78, // <exp2>
258, // <cast exp>
490, // <unary exp>
95, // <exp1>
854, // `-
461, // INTLIT
1239, // letter
816, // {"A".."Z" "a" "d" "g" "j".."k" "m".."n" "q".."s" "y".."z"}
816, // "p"
816, // "v"
816, // "c"
816, // "f"
816, // "i"
816, // "l"
816, // "o"
816, // "u"
816, // "x"
816, // "b"
816, // "e"
816, // "h"
816, // "t"
816, // "w"
374, // letter128
189, // {199..218 231..250}
189, // {193..198 225..230}
-1, // digit
269, // {"1".."9"}
1084, // "0"
591, // digit128
1279, // {176..185}
-1, // ws
-1, // " "
-1, // {10}
395, // "#"
-1, // "+"
-1, // "*"
960, // "("
-1, // ")"
887, // "{"
-1, // "}"
1296, // "-"
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
{ // state 1226
23,MIN_REDUCTION+101, // `[
85,MIN_REDUCTION+101, // "["
101,MIN_REDUCTION+101, // $NT
MIN_REDUCTION+101, // (default reduction)
  }
,
{ // state 1227
MIN_REDUCTION+105, // (default reduction)
  }
,
{ // state 1228
0x80000000|1127, // match move
0x80000000|830, // no-match move
0x80000000|47, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 1229
0x80000000|1129, // match move
0x80000000|832, // no-match move
0x80000000|47, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 1230
0x80000000|263, // match move
0x80000000|746, // no-match move
0x80000000|47, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 1231
MIN_REDUCTION+16, // (default reduction)
  }
,
{ // state 1232
-1, // $$start
-1, // <start>
-1, // ws*
-1, // <program>
-1, // <class decl>+
-1, // <class decl>
-1, // `class
264, // ID
855, // `{
-1, // <decl in class>*
-1, // `}
-1, // `extends
-1, // <decl in class>
-1, // <method decl>
-1, // `public
-1, // `void
518, // `(
-1, // `)
-1, // <stmt>*
209, // <type>
924, // `int
930, // `boolean
-1, // <empty bracket pair>
-1, // `[
-1, // `]
1289, // <stmt>
1176, // <assign>
-1, // `;
533, // <local var decl>
624, // `if
592, // <exp>
-1, // `else
1131, // `while
840, // `for
-1, // `=
1153, // <exp8>
325, // <exp7>
19, // <exp6>
25, // <exp5>
101, // <exp4>
-1, // `+
483, // <exp3>
-1, // `*
78, // <exp2>
258, // <cast exp>
490, // <unary exp>
95, // <exp1>
854, // `-
461, // INTLIT
1239, // letter
816, // {"A".."Z" "a" "d" "g" "j".."k" "m".."n" "q".."s" "y".."z"}
816, // "p"
816, // "v"
816, // "c"
816, // "f"
816, // "i"
816, // "l"
816, // "o"
816, // "u"
816, // "x"
816, // "b"
816, // "e"
816, // "h"
816, // "t"
816, // "w"
374, // letter128
189, // {199..218 231..250}
189, // {193..198 225..230}
-1, // digit
269, // {"1".."9"}
1084, // "0"
591, // digit128
1279, // {176..185}
-1, // ws
-1, // " "
-1, // {10}
395, // "#"
-1, // "+"
-1, // "*"
960, // "("
-1, // ")"
887, // "{"
-1, // "}"
1296, // "-"
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
{ // state 1233
23,MIN_REDUCTION+95, // `[
85,MIN_REDUCTION+95, // "["
MIN_REDUCTION+95, // (default reduction)
  }
,
{ // state 1234
23,MIN_REDUCTION+46, // `[
85,MIN_REDUCTION+46, // "["
101,MIN_REDUCTION+46, // $NT
MIN_REDUCTION+46, // (default reduction)
  }
,
{ // state 1235
MIN_REDUCTION+79, // (default reduction)
  }
,
{ // state 1236
MIN_REDUCTION+123, // (default reduction)
  }
,
{ // state 1237
0x80000000|1172, // match move
0x80000000|954, // no-match move
0x80000000|1145, // NT-test-match state for `else
  }
,
{ // state 1238
23,MIN_REDUCTION+95, // `[
85,MIN_REDUCTION+95, // "["
MIN_REDUCTION+95, // (default reduction)
  }
,
{ // state 1239
49,676, // letter
50,67, // {"A".."Z" "a" "d" "g" "j".."k" "m".."n" "q".."s" "y".."z"}
51,67, // "p"
52,67, // "v"
53,67, // "c"
54,67, // "f"
55,67, // "i"
56,67, // "l"
57,67, // "o"
58,67, // "u"
59,67, // "x"
60,67, // "b"
61,67, // "e"
62,67, // "h"
63,67, // "t"
64,67, // "w"
65,547, // letter128
66,189, // {199..218 231..250}
67,189, // {193..198 225..230}
68,290, // digit
69,253, // {"1".."9"}
70,253, // "0"
71,1230, // digit128
72,159, // {176..185}
88,46, // idChar*
89,1014, // $$0
94,532, // idChar
95,1227, // "_"
96,636, // idChar128
97,589, // {223}
  }
,
{ // state 1240
27,505, // `;
87,857, // ";"
  }
,
{ // state 1241
27,327, // `;
87,857, // ";"
  }
,
{ // state 1242
40,607, // `+
77,1263, // "+"
101,MIN_REDUCTION+31, // $NT
  }
,
{ // state 1243
MIN_REDUCTION+21, // (default reduction)
  }
,
{ // state 1244
0x80000000|1048, // match move
0x80000000|62, // no-match move
0x80000000|1145, // NT-test-match state for `else
  }
,
{ // state 1245
16,255, // `(
79,16, // "("
  }
,
{ // state 1246
23,MIN_REDUCTION+107, // `[
85,MIN_REDUCTION+107, // "["
MIN_REDUCTION+107, // (default reduction)
  }
,
{ // state 1247
-1, // $$start
-1, // <start>
-1, // ws*
-1, // <program>
-1, // <class decl>+
-1, // <class decl>
-1, // `class
264, // ID
708, // `{
-1, // <decl in class>*
-1, // `}
-1, // `extends
-1, // <decl in class>
-1, // <method decl>
-1, // `public
-1, // `void
518, // `(
-1, // `)
-1, // <stmt>*
209, // <type>
924, // `int
930, // `boolean
-1, // <empty bracket pair>
-1, // `[
-1, // `]
360, // <stmt>
957, // <assign>
-1, // `;
401, // <local var decl>
1310, // `if
592, // <exp>
-1, // `else
390, // `while
905, // `for
-1, // `=
1153, // <exp8>
325, // <exp7>
19, // <exp6>
25, // <exp5>
101, // <exp4>
-1, // `+
483, // <exp3>
-1, // `*
78, // <exp2>
258, // <cast exp>
490, // <unary exp>
95, // <exp1>
854, // `-
461, // INTLIT
1239, // letter
816, // {"A".."Z" "a" "d" "g" "j".."k" "m".."n" "q".."s" "y".."z"}
816, // "p"
816, // "v"
816, // "c"
816, // "f"
816, // "i"
816, // "l"
816, // "o"
816, // "u"
816, // "x"
816, // "b"
816, // "e"
816, // "h"
816, // "t"
816, // "w"
374, // letter128
189, // {199..218 231..250}
189, // {193..198 225..230}
-1, // digit
269, // {"1".."9"}
1084, // "0"
591, // digit128
1279, // {176..185}
-1, // ws
-1, // " "
-1, // {10}
395, // "#"
-1, // "+"
-1, // "*"
960, // "("
-1, // ")"
887, // "{"
-1, // "}"
1296, // "-"
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
{ // state 1248
MIN_REDUCTION+49, // (default reduction)
  }
,
{ // state 1249
23,MIN_REDUCTION+95, // `[
85,MIN_REDUCTION+95, // "["
MIN_REDUCTION+95, // (default reduction)
  }
,
{ // state 1250
0x80000000|487, // match move
0x80000000|929, // no-match move
0x80000000|1145, // NT-test-match state for `else
  }
,
{ // state 1251
MIN_REDUCTION+124, // (default reduction)
  }
,
{ // state 1252
23,MIN_REDUCTION+95, // `[
85,MIN_REDUCTION+95, // "["
MIN_REDUCTION+95, // (default reduction)
  }
,
{ // state 1253
51,1148, // "p"
  }
,
{ // state 1254
MIN_REDUCTION+34, // (default reduction)
  }
,
{ // state 1255
MIN_REDUCTION+21, // (default reduction)
  }
,
{ // state 1256
MIN_REDUCTION+50, // (default reduction)
  }
,
{ // state 1257
27,339, // `;
87,857, // ";"
  }
,
{ // state 1258
23,MIN_REDUCTION+129, // `[
73,41, // ws
74,142, // " "
75,158, // {10}
85,MIN_REDUCTION+129, // "["
MIN_REDUCTION+129, // (default reduction)
  }
,
{ // state 1259
MIN_REDUCTION+49, // (default reduction)
  }
,
{ // state 1260
23,MIN_REDUCTION+129, // `[
73,39, // ws
74,139, // " "
75,162, // {10}
85,MIN_REDUCTION+129, // "["
MIN_REDUCTION+129, // (default reduction)
  }
,
{ // state 1261
73,1270, // ws
74,996, // " "
75,571, // {10}
MIN_REDUCTION+79, // (default reduction)
  }
,
{ // state 1262
17,971, // `)
80,588, // ")"
  }
,
{ // state 1263
2,3, // ws*
73,1108, // ws
74,147, // " "
75,207, // {10}
MIN_REDUCTION+84, // (default reduction)
  }
,
{ // state 1264
MIN_REDUCTION+124, // (default reduction)
  }
,
{ // state 1265
23,MIN_REDUCTION+101, // `[
85,MIN_REDUCTION+101, // "["
MIN_REDUCTION+101, // (default reduction)
  }
,
{ // state 1266
-1, // $$start
-1, // <start>
-1, // ws*
-1, // <program>
-1, // <class decl>+
-1, // <class decl>
-1, // `class
264, // ID
711, // `{
-1, // <decl in class>*
-1, // `}
-1, // `extends
-1, // <decl in class>
-1, // <method decl>
-1, // `public
-1, // `void
518, // `(
-1, // `)
-1, // <stmt>*
209, // <type>
924, // `int
930, // `boolean
-1, // <empty bracket pair>
-1, // `[
-1, // `]
353, // <stmt>
1167, // <assign>
-1, // `;
366, // <local var decl>
680, // `if
592, // <exp>
-1, // `else
210, // `while
803, // `for
-1, // `=
1153, // <exp8>
325, // <exp7>
19, // <exp6>
25, // <exp5>
101, // <exp4>
-1, // `+
483, // <exp3>
-1, // `*
78, // <exp2>
258, // <cast exp>
490, // <unary exp>
95, // <exp1>
854, // `-
461, // INTLIT
1239, // letter
816, // {"A".."Z" "a" "d" "g" "j".."k" "m".."n" "q".."s" "y".."z"}
816, // "p"
816, // "v"
816, // "c"
816, // "f"
816, // "i"
816, // "l"
816, // "o"
816, // "u"
816, // "x"
816, // "b"
816, // "e"
816, // "h"
816, // "t"
816, // "w"
374, // letter128
189, // {199..218 231..250}
189, // {193..198 225..230}
-1, // digit
269, // {"1".."9"}
1084, // "0"
591, // digit128
1279, // {176..185}
-1, // ws
-1, // " "
-1, // {10}
395, // "#"
-1, // "+"
-1, // "*"
960, // "("
-1, // ")"
887, // "{"
-1, // "}"
1296, // "-"
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
{ // state 1267
2,425, // ws*
73,1077, // ws
74,697, // " "
75,976, // {10}
MIN_REDUCTION+66, // (default reduction)
  }
,
{ // state 1268
MIN_REDUCTION+119, // (default reduction)
  }
,
{ // state 1269
0x80000000|754, // match move
0x80000000|319, // no-match move
0x80000000|47, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 1270
0x80000000|487, // match move
0x80000000|967, // no-match move
0x80000000|1145, // NT-test-match state for `else
  }
,
{ // state 1271
23,MIN_REDUCTION+43, // `[
85,MIN_REDUCTION+43, // "["
MIN_REDUCTION+43, // (default reduction)
  }
,
{ // state 1272
MIN_REDUCTION+112, // (default reduction)
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
264, // ID
855, // `{
-1, // <decl in class>*
-1, // `}
-1, // `extends
-1, // <decl in class>
-1, // <method decl>
-1, // `public
-1, // `void
518, // `(
-1, // `)
-1, // <stmt>*
209, // <type>
924, // `int
930, // `boolean
-1, // <empty bracket pair>
-1, // `[
-1, // `]
714, // <stmt>
1176, // <assign>
-1, // `;
533, // <local var decl>
624, // `if
592, // <exp>
-1, // `else
1131, // `while
840, // `for
-1, // `=
1153, // <exp8>
325, // <exp7>
19, // <exp6>
25, // <exp5>
101, // <exp4>
-1, // `+
483, // <exp3>
-1, // `*
78, // <exp2>
258, // <cast exp>
490, // <unary exp>
95, // <exp1>
854, // `-
461, // INTLIT
1239, // letter
816, // {"A".."Z" "a" "d" "g" "j".."k" "m".."n" "q".."s" "y".."z"}
816, // "p"
816, // "v"
816, // "c"
816, // "f"
816, // "i"
816, // "l"
816, // "o"
816, // "u"
816, // "x"
816, // "b"
816, // "e"
816, // "h"
816, // "t"
816, // "w"
374, // letter128
189, // {199..218 231..250}
189, // {193..198 225..230}
-1, // digit
269, // {"1".."9"}
1084, // "0"
591, // digit128
1279, // {176..185}
-1, // ws
-1, // " "
-1, // {10}
395, // "#"
-1, // "+"
-1, // "*"
960, // "("
-1, // ")"
887, // "{"
-1, // "}"
1296, // "-"
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
{ // state 1274
2,958, // ws*
73,415, // ws
74,975, // " "
75,581, // {10}
MIN_REDUCTION+80, // (default reduction)
  }
,
{ // state 1275
-1, // $$start
-1, // <start>
-1, // ws*
-1, // <program>
-1, // <class decl>+
-1, // <class decl>
-1, // `class
264, // ID
711, // `{
-1, // <decl in class>*
-1, // `}
-1, // `extends
-1, // <decl in class>
-1, // <method decl>
-1, // `public
-1, // `void
518, // `(
-1, // `)
-1, // <stmt>*
209, // <type>
924, // `int
930, // `boolean
-1, // <empty bracket pair>
-1, // `[
-1, // `]
307, // <stmt>
1167, // <assign>
-1, // `;
366, // <local var decl>
680, // `if
592, // <exp>
-1, // `else
210, // `while
803, // `for
-1, // `=
1153, // <exp8>
325, // <exp7>
19, // <exp6>
25, // <exp5>
101, // <exp4>
-1, // `+
483, // <exp3>
-1, // `*
78, // <exp2>
258, // <cast exp>
490, // <unary exp>
95, // <exp1>
854, // `-
461, // INTLIT
1239, // letter
816, // {"A".."Z" "a" "d" "g" "j".."k" "m".."n" "q".."s" "y".."z"}
816, // "p"
816, // "v"
816, // "c"
816, // "f"
816, // "i"
816, // "l"
816, // "o"
816, // "u"
816, // "x"
816, // "b"
816, // "e"
816, // "h"
816, // "t"
816, // "w"
374, // letter128
189, // {199..218 231..250}
189, // {193..198 225..230}
-1, // digit
269, // {"1".."9"}
1084, // "0"
591, // digit128
1279, // {176..185}
-1, // ws
-1, // " "
-1, // {10}
395, // "#"
-1, // "+"
-1, // "*"
960, // "("
-1, // ")"
887, // "{"
-1, // "}"
1296, // "-"
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
{ // state 1276
16,527, // `(
79,619, // "("
  }
,
{ // state 1277
7,713, // ID
49,616, // letter
50,816, // {"A".."Z" "a" "d" "g" "j".."k" "m".."n" "q".."s" "y".."z"}
51,816, // "p"
52,816, // "v"
53,816, // "c"
54,816, // "f"
55,816, // "i"
56,816, // "l"
57,816, // "o"
58,816, // "u"
59,816, // "x"
60,816, // "b"
61,816, // "e"
62,816, // "h"
63,816, // "t"
64,816, // "w"
65,1137, // letter128
66,1037, // {199..218 231..250}
67,1037, // {193..198 225..230}
  }
,
{ // state 1278
0x80000000|1169, // match move
0x80000000|214, // no-match move
0x80000000|47, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 1279
0x80000000|754, // match move
0x80000000|332, // no-match move
0x80000000|47, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 1280
2,940, // ws*
MIN_REDUCTION+92, // (default reduction)
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
264, // ID
711, // `{
-1, // <decl in class>*
-1, // `}
-1, // `extends
-1, // <decl in class>
-1, // <method decl>
-1, // `public
-1, // `void
518, // `(
-1, // `)
-1, // <stmt>*
209, // <type>
924, // `int
930, // `boolean
-1, // <empty bracket pair>
-1, // `[
-1, // `]
430, // <stmt>
1167, // <assign>
-1, // `;
366, // <local var decl>
680, // `if
592, // <exp>
-1, // `else
210, // `while
803, // `for
-1, // `=
1153, // <exp8>
325, // <exp7>
19, // <exp6>
25, // <exp5>
101, // <exp4>
-1, // `+
483, // <exp3>
-1, // `*
78, // <exp2>
258, // <cast exp>
490, // <unary exp>
95, // <exp1>
854, // `-
461, // INTLIT
1239, // letter
816, // {"A".."Z" "a" "d" "g" "j".."k" "m".."n" "q".."s" "y".."z"}
816, // "p"
816, // "v"
816, // "c"
816, // "f"
816, // "i"
816, // "l"
816, // "o"
816, // "u"
816, // "x"
816, // "b"
816, // "e"
816, // "h"
816, // "t"
816, // "w"
374, // letter128
189, // {199..218 231..250}
189, // {193..198 225..230}
-1, // digit
269, // {"1".."9"}
1084, // "0"
591, // digit128
1279, // {176..185}
-1, // ws
-1, // " "
-1, // {10}
395, // "#"
-1, // "+"
-1, // "*"
960, // "("
-1, // ")"
887, // "{"
-1, // "}"
1296, // "-"
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
{ // state 1282
0x80000000|754, // match move
0x80000000|330, // no-match move
0x80000000|47, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 1283
0x80000000|1173, // match move
0x80000000|211, // no-match move
0x80000000|47, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 1284
MIN_REDUCTION+23, // (default reduction)
  }
,
{ // state 1285
73,63, // ws
74,1259, // " "
75,700, // {10}
MIN_REDUCTION+57, // (default reduction)
  }
,
{ // state 1286
2,1007, // ws*
73,398, // ws
74,996, // " "
75,571, // {10}
MIN_REDUCTION+80, // (default reduction)
  }
,
{ // state 1287
MIN_REDUCTION+118, // (default reduction)
  }
,
{ // state 1288
0x80000000|1117, // match move
0x80000000|808, // no-match move
0x80000000|47, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 1289
17,796, // `)
80,588, // ")"
  }
,
{ // state 1290
0x80000000|169, // match move
0x80000000|601, // no-match move
0x80000000|1145, // NT-test-match state for `else
  }
,
{ // state 1291
23,MIN_REDUCTION+107, // `[
85,MIN_REDUCTION+107, // "["
MIN_REDUCTION+107, // (default reduction)
  }
,
{ // state 1292
0x80000000|1180, // match move
0x80000000|244, // no-match move
0x80000000|47, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 1293
23,MIN_REDUCTION+48, // `[
85,MIN_REDUCTION+48, // "["
MIN_REDUCTION+48, // (default reduction)
  }
,
{ // state 1294
0x80000000|928, // match move
0x80000000|950, // no-match move
0x80000000|47, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 1295
MIN_REDUCTION+107, // (default reduction)
  }
,
{ // state 1296
2,1006, // ws*
73,331, // ws
74,410, // " "
75,407, // {10}
MIN_REDUCTION+82, // (default reduction)
  }
,
{ // state 1297
MIN_REDUCTION+18, // (default reduction)
  }
,
{ // state 1298
0x80000000|754, // match move
0x80000000|1038, // no-match move
0x80000000|47, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 1299
23,MIN_REDUCTION+101, // `[
85,MIN_REDUCTION+101, // "["
MIN_REDUCTION+101, // (default reduction)
  }
,
{ // state 1300
23,MIN_REDUCTION+101, // `[
85,MIN_REDUCTION+101, // "["
MIN_REDUCTION+101, // (default reduction)
  }
,
{ // state 1301
49,676, // letter
50,67, // {"A".."Z" "a" "d" "g" "j".."k" "m".."n" "q".."s" "y".."z"}
51,67, // "p"
52,67, // "v"
53,67, // "c"
54,67, // "f"
55,67, // "i"
56,67, // "l"
57,67, // "o"
58,67, // "u"
59,67, // "x"
60,67, // "b"
61,67, // "e"
62,67, // "h"
63,67, // "t"
64,67, // "w"
65,943, // letter128
66,658, // {199..218 231..250}
67,658, // {193..198 225..230}
68,290, // digit
69,253, // {"1".."9"}
70,253, // "0"
71,426, // digit128
72,638, // {176..185}
89,266, // $$0
94,1268, // idChar
95,1227, // "_"
96,831, // idChar128
97,702, // {223}
  }
,
{ // state 1302
0x80000000|542, // match move
0x80000000|914, // no-match move
0x80000000|47, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 1303
17,869, // `)
80,588, // ")"
  }
,
{ // state 1304
73,163, // ws
74,1000, // " "
75,1031, // {10}
MIN_REDUCTION+73, // (default reduction)
  }
,
{ // state 1305
MIN_REDUCTION+107, // (default reduction)
  }
,
{ // state 1306
7,243, // ID
16,370, // `(
30,437, // <exp>
35,1175, // <exp8>
36,2, // <exp7>
37,338, // <exp6>
38,340, // <exp5>
39,64, // <exp4>
41,535, // <exp3>
43,55, // <exp2>
44,288, // <cast exp>
45,520, // <unary exp>
46,130, // <exp1>
47,870, // `-
48,445, // INTLIT
49,777, // letter
50,816, // {"A".."Z" "a" "d" "g" "j".."k" "m".."n" "q".."s" "y".."z"}
51,816, // "p"
52,816, // "v"
53,816, // "c"
54,816, // "f"
55,816, // "i"
56,816, // "l"
57,816, // "o"
58,816, // "u"
59,816, // "x"
60,816, // "b"
61,816, // "e"
62,816, // "h"
63,816, // "t"
64,816, // "w"
65,1193, // letter128
66,709, // {199..218 231..250}
67,709, // {193..198 225..230}
69,225, // {"1".."9"}
70,1039, // "0"
71,554, // digit128
72,1298, // {176..185}
79,960, // "("
83,1296, // "-"
  }
,
{ // state 1307
-1, // $$start
-1, // <start>
-1, // ws*
-1, // <program>
-1, // <class decl>+
-1, // <class decl>
-1, // `class
264, // ID
711, // `{
-1, // <decl in class>*
-1, // `}
-1, // `extends
-1, // <decl in class>
-1, // <method decl>
-1, // `public
-1, // `void
518, // `(
-1, // `)
-1, // <stmt>*
209, // <type>
924, // `int
930, // `boolean
-1, // <empty bracket pair>
-1, // `[
-1, // `]
699, // <stmt>
1167, // <assign>
-1, // `;
366, // <local var decl>
680, // `if
592, // <exp>
-1, // `else
210, // `while
803, // `for
-1, // `=
1153, // <exp8>
325, // <exp7>
19, // <exp6>
25, // <exp5>
101, // <exp4>
-1, // `+
483, // <exp3>
-1, // `*
78, // <exp2>
258, // <cast exp>
490, // <unary exp>
95, // <exp1>
854, // `-
461, // INTLIT
1239, // letter
816, // {"A".."Z" "a" "d" "g" "j".."k" "m".."n" "q".."s" "y".."z"}
816, // "p"
816, // "v"
816, // "c"
816, // "f"
816, // "i"
816, // "l"
816, // "o"
816, // "u"
816, // "x"
816, // "b"
816, // "e"
816, // "h"
816, // "t"
816, // "w"
374, // letter128
189, // {199..218 231..250}
189, // {193..198 225..230}
-1, // digit
269, // {"1".."9"}
1084, // "0"
591, // digit128
1279, // {176..185}
-1, // ws
-1, // " "
-1, // {10}
395, // "#"
-1, // "+"
-1, // "*"
960, // "("
-1, // ")"
887, // "{"
-1, // "}"
1296, // "-"
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
{ // state 1308
0x80000000|246, // match move
0x80000000|610, // no-match move
0x80000000|1145, // NT-test-match state for `else
  }
,
{ // state 1309
0x80000000|451, // match move
0x80000000|42, // no-match move
0x80000000|47, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 1310
16,781, // `(
79,619, // "("
  }
,
{ // state 1311
-1, // $$start
-1, // <start>
-1, // ws*
-1, // <program>
-1, // <class decl>+
-1, // <class decl>
-1, // `class
264, // ID
51, // `{
-1, // <decl in class>*
-1, // `}
-1, // `extends
-1, // <decl in class>
-1, // <method decl>
-1, // `public
-1, // `void
518, // `(
-1, // `)
-1, // <stmt>*
209, // <type>
924, // `int
930, // `boolean
-1, // <empty bracket pair>
-1, // `[
-1, // `]
727, // <stmt>
1046, // <assign>
-1, // `;
30, // <local var decl>
238, // `if
592, // <exp>
-1, // `else
1312, // `while
185, // `for
-1, // `=
1153, // <exp8>
325, // <exp7>
19, // <exp6>
25, // <exp5>
101, // <exp4>
-1, // `+
483, // <exp3>
-1, // `*
78, // <exp2>
258, // <cast exp>
490, // <unary exp>
95, // <exp1>
854, // `-
461, // INTLIT
1239, // letter
816, // {"A".."Z" "a" "d" "g" "j".."k" "m".."n" "q".."s" "y".."z"}
816, // "p"
816, // "v"
816, // "c"
816, // "f"
816, // "i"
816, // "l"
816, // "o"
816, // "u"
816, // "x"
816, // "b"
816, // "e"
816, // "h"
816, // "t"
816, // "w"
374, // letter128
189, // {199..218 231..250}
189, // {193..198 225..230}
-1, // digit
269, // {"1".."9"}
1084, // "0"
591, // digit128
1279, // {176..185}
-1, // ws
-1, // " "
-1, // {10}
395, // "#"
-1, // "+"
-1, // "*"
960, // "("
-1, // ")"
887, // "{"
-1, // "}"
1296, // "-"
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
{ // state 1312
16,1090, // `(
79,1065, // "("
  }
,
{ // state 1313
0x80000000|224, // match move
0x80000000|785, // no-match move
0x80000000|801, // NT-test-match state for <exp>
  }
,
{ // state 1314
0x80000000|1147, // match move
0x80000000|174, // no-match move
0x80000000|47, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 1315
101,MIN_REDUCTION+48, // $NT
MIN_REDUCTION+48, // (default reduction)
  }
,
{ // state 1316
23,MIN_REDUCTION+101, // `[
85,MIN_REDUCTION+101, // "["
MIN_REDUCTION+101, // (default reduction)
  }
,
{ // state 1317
MIN_REDUCTION+40, // (default reduction)
  }
,
{ // state 1318
MIN_REDUCTION+1, // (default reduction)
  }
,
{ // state 1319
23,MIN_REDUCTION+43, // `[
85,MIN_REDUCTION+43, // "["
MIN_REDUCTION+43, // (default reduction)
  }
,
{ // state 1320
0x80000000|678, // match move
0x80000000|789, // no-match move
0x80000000|1145, // NT-test-match state for `else
  }
,
{ // state 1321
MIN_REDUCTION+40, // (default reduction)
  }
,
{ // state 1322
73,558, // ws
74,392, // " "
75,226, // {10}
MIN_REDUCTION+79, // (default reduction)
  }
,
{ // state 1323
2,698, // ws*
MIN_REDUCTION+80, // (default reduction)
  }
,
{ // state 1324
-1, // $$start
-1, // <start>
-1, // ws*
-1, // <program>
-1, // <class decl>+
-1, // <class decl>
-1, // `class
264, // ID
52, // `{
-1, // <decl in class>*
-1, // `}
-1, // `extends
-1, // <decl in class>
-1, // <method decl>
-1, // `public
-1, // `void
518, // `(
-1, // `)
-1, // <stmt>*
209, // <type>
924, // `int
930, // `boolean
-1, // <empty bracket pair>
-1, // `[
-1, // `]
1190, // <stmt>
925, // <assign>
-1, // `;
757, // <local var decl>
1338, // `if
592, // <exp>
-1, // `else
471, // `while
654, // `for
-1, // `=
1153, // <exp8>
325, // <exp7>
19, // <exp6>
25, // <exp5>
101, // <exp4>
-1, // `+
483, // <exp3>
-1, // `*
78, // <exp2>
258, // <cast exp>
490, // <unary exp>
95, // <exp1>
854, // `-
461, // INTLIT
1239, // letter
816, // {"A".."Z" "a" "d" "g" "j".."k" "m".."n" "q".."s" "y".."z"}
816, // "p"
816, // "v"
816, // "c"
816, // "f"
816, // "i"
816, // "l"
816, // "o"
816, // "u"
816, // "x"
816, // "b"
816, // "e"
816, // "h"
816, // "t"
816, // "w"
374, // letter128
189, // {199..218 231..250}
189, // {193..198 225..230}
-1, // digit
269, // {"1".."9"}
1084, // "0"
591, // digit128
1279, // {176..185}
-1, // ws
-1, // " "
-1, // {10}
395, // "#"
-1, // "+"
-1, // "*"
960, // "("
-1, // ")"
887, // "{"
-1, // "}"
1296, // "-"
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
{ // state 1325
MIN_REDUCTION+50, // (default reduction)
  }
,
{ // state 1326
MIN_REDUCTION+125, // (default reduction)
  }
,
{ // state 1327
16,494, // `(
79,619, // "("
  }
,
{ // state 1328
MIN_REDUCTION+19, // (default reduction)
  }
,
{ // state 1329
2,1177, // ws*
73,705, // ws
74,441, // " "
75,182, // {10}
MIN_REDUCTION+94, // (default reduction)
  }
,
{ // state 1330
0x80000000|662, // match move
0x80000000|765, // no-match move
0x80000000|1145, // NT-test-match state for `else
  }
,
{ // state 1331
101,MIN_REDUCTION+34, // $NT
MIN_REDUCTION+34, // (default reduction)
  }
,
{ // state 1332
-1, // $$start
-1, // <start>
-1, // ws*
-1, // <program>
-1, // <class decl>+
-1, // <class decl>
-1, // `class
264, // ID
708, // `{
-1, // <decl in class>*
544, // `}
-1, // `extends
-1, // <decl in class>
-1, // <method decl>
-1, // `public
-1, // `void
518, // `(
-1, // `)
-1, // <stmt>*
209, // <type>
924, // `int
930, // `boolean
-1, // <empty bracket pair>
-1, // `[
-1, // `]
847, // <stmt>
957, // <assign>
-1, // `;
401, // <local var decl>
1310, // `if
592, // <exp>
-1, // `else
390, // `while
905, // `for
-1, // `=
1153, // <exp8>
325, // <exp7>
19, // <exp6>
25, // <exp5>
101, // <exp4>
-1, // `+
483, // <exp3>
-1, // `*
78, // <exp2>
258, // <cast exp>
490, // <unary exp>
95, // <exp1>
854, // `-
461, // INTLIT
1239, // letter
816, // {"A".."Z" "a" "d" "g" "j".."k" "m".."n" "q".."s" "y".."z"}
816, // "p"
816, // "v"
816, // "c"
816, // "f"
816, // "i"
816, // "l"
816, // "o"
816, // "u"
816, // "x"
816, // "b"
816, // "e"
816, // "h"
816, // "t"
816, // "w"
374, // letter128
189, // {199..218 231..250}
189, // {193..198 225..230}
-1, // digit
269, // {"1".."9"}
1084, // "0"
591, // digit128
1279, // {176..185}
-1, // ws
-1, // " "
-1, // {10}
395, // "#"
-1, // "+"
-1, // "*"
960, // "("
-1, // ")"
887, // "{"
1076, // "}"
1296, // "-"
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
{ // state 1333
MIN_REDUCTION+40, // (default reduction)
  }
,
{ // state 1334
23,MIN_REDUCTION+43, // `[
85,MIN_REDUCTION+43, // "["
MIN_REDUCTION+43, // (default reduction)
  }
,
{ // state 1335
2,452, // ws*
73,780, // ws
74,352, // " "
75,284, // {10}
MIN_REDUCTION+62, // (default reduction)
  }
,
{ // state 1336
23,MIN_REDUCTION+43, // `[
85,MIN_REDUCTION+43, // "["
MIN_REDUCTION+43, // (default reduction)
  }
,
{ // state 1337
MIN_REDUCTION+107, // (default reduction)
  }
,
{ // state 1338
16,982, // `(
79,619, // "("
  }
,
{ // state 1339
24,548, // `]
86,431, // "]"
  }
,
{ // state 1340
2,710, // ws*
MIN_REDUCTION+80, // (default reduction)
  }
,
{ // state 1341
MIN_REDUCTION+18, // (default reduction)
  }
,
};
}
public MJGrammarParseTable(MJGrammar actionObj) {
  actionObject = actionObj;
  parseTable = new int[1342][];
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
// <local var decl> ::= <type> ID `= <exp>
(28<<16)+4,
// <exp> ::= <exp8>
(30<<16)+1,
// <exp8> ::= <exp7>
(35<<16)+1,
// <exp7> ::= <exp6>
(36<<16)+1,
// <exp6> ::= <exp5>
(37<<16)+1,
// <exp5> ::= <exp4>
(38<<16)+1,
// <exp4> ::= <exp4> `+ <exp3>
(39<<16)+3,
// <exp4> ::= <exp3>
(39<<16)+1,
// <exp3> ::= <exp3> `* <exp2>
(41<<16)+3,
// <exp3> ::= <exp2>
(41<<16)+1,
// <exp2> ::= <cast exp>
(43<<16)+1,
// <exp2> ::= <unary exp>
(43<<16)+1,
// <cast exp> ::= `( <type> `) <cast exp>
(44<<16)+4,
// <cast exp> ::= `( <type> `) <exp1>
(44<<16)+4,
// <unary exp> ::= `- <unary exp>
(45<<16)+2,
// <unary exp> ::= <exp1>
(45<<16)+1,
// <exp1> ::= ID
(46<<16)+1,
// <exp1> ::= <exp1> !<empty bracket pair> `[ <exp> `]
(46<<16)+4,
// <exp1> ::= INTLIT
(46<<16)+1,
// letter ::= {"A".."Z" "a".."z"}
(49<<16)+1,
// letter128 ::= {193..218 225..250}
(65<<16)+1,
// digit ::= {"0".."9"}
(68<<16)+1,
// digit128 ::= {176..185}
(71<<16)+1,
// ws ::= " "
(73<<16)+1,
// ws ::= {10}
(73<<16)+1,
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
(42<<16)+2,
// `* ::= "*"
(42<<16)+1,
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
(47<<16)+2,
// `- ::= "-"
(47<<16)+1,
// `+ ::= "+" ws*
(40<<16)+2,
// `+ ::= "+"
(40<<16)+1,
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
// ID ::= letter128 ws*
(7<<16)+2,
// ID ::= letter128
(7<<16)+1,
// ID ::= letter idChar* $$0
(7<<16)+3,
// ID ::= letter $$0
(7<<16)+2,
// INTLIT ::= {"1".."9"} digit* $$1
(48<<16)+3,
// INTLIT ::= {"1".."9"} $$1
(48<<16)+2,
// INTLIT ::= digit128 ws*
(48<<16)+2,
// INTLIT ::= digit128
(48<<16)+1,
// INTLIT ::= "0" hexDigit* $$2
(48<<16)+3,
// INTLIT ::= "0" $$2
(48<<16)+2,
// idChar ::= letter
(94<<16)+1,
// idChar ::= digit
(94<<16)+1,
// idChar ::= "_"
(94<<16)+1,
// idChar128 ::= letter128
(96<<16)+1,
// idChar128 ::= digit128
(96<<16)+1,
// idChar128 ::= {223}
(96<<16)+1,
// hexDigit ::= {"0".."9" "A".."Z" "a".."z"}
(98<<16)+1,
// hexDigit128 ::= {176..185 193..198 225..230}
(99<<16)+1,
// digit* ::= digit* digit
(90<<16)+2,
// digit* ::= digit
(90<<16)+1,
// <decl in class>* ::= <decl in class>* <decl in class>
(9<<16)+2,
// <decl in class>* ::= <decl in class>
(9<<16)+1,
// hexDigit* ::= hexDigit* hexDigit
(92<<16)+2,
// hexDigit* ::= hexDigit
(92<<16)+1,
// <stmt>* ::= <stmt>* <stmt>
(18<<16)+2,
// <stmt>* ::= <stmt>
(18<<16)+1,
// idChar* ::= idChar* idChar
(88<<16)+2,
// idChar* ::= idChar
(88<<16)+1,
// <class decl>+ ::= <class decl>
(4<<16)+1,
// <class decl>+ ::= <class decl>+ <class decl>
(4<<16)+2,
// ws* ::= ws* ws
(2<<16)+2,
// ws* ::= ws
(2<<16)+1,
// $$0 ::= idChar128 ws*
(89<<16)+2,
// $$0 ::= idChar128
(89<<16)+1,
// $$1 ::= digit128 ws*
(91<<16)+2,
// $$1 ::= digit128
(91<<16)+1,
// $$2 ::= hexDigit128 ws*
(93<<16)+2,
// $$2 ::= hexDigit128
(93<<16)+1,
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
75, // 10
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
74, // " "
-1, // "!"
-1, // '"'
76, // "#"
-1, // "$"
-1, // "%"
-1, // "&"
-1, // "'"
79, // "("
80, // ")"
78, // "*"
77, // "+"
-1, // ","
83, // "-"
-1, // "."
-1, // "/"
70, // "0"
69, // "1"
69, // "2"
69, // "3"
69, // "4"
69, // "5"
69, // "6"
69, // "7"
69, // "8"
69, // "9"
-1, // ":"
87, // ";"
-1, // "<"
84, // "="
-1, // ">"
-1, // "?"
-1, // "@"
50, // "A"
50, // "B"
50, // "C"
50, // "D"
50, // "E"
50, // "F"
50, // "G"
50, // "H"
50, // "I"
50, // "J"
50, // "K"
50, // "L"
50, // "M"
50, // "N"
50, // "O"
50, // "P"
50, // "Q"
50, // "R"
50, // "S"
50, // "T"
50, // "U"
50, // "V"
50, // "W"
50, // "X"
50, // "Y"
50, // "Z"
85, // "["
-1, // "\"
86, // "]"
-1, // "^"
95, // "_"
-1, // "`"
50, // "a"
60, // "b"
53, // "c"
50, // "d"
61, // "e"
54, // "f"
50, // "g"
62, // "h"
55, // "i"
50, // "j"
50, // "k"
56, // "l"
50, // "m"
50, // "n"
57, // "o"
51, // "p"
50, // "q"
50, // "r"
50, // "s"
63, // "t"
58, // "u"
52, // "v"
64, // "w"
59, // "x"
50, // "y"
50, // "z"
81, // "{"
-1, // "|"
82, // "}"
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
72, // 176
72, // 177
72, // 178
72, // 179
72, // 180
72, // 181
72, // 182
72, // 183
72, // 184
72, // 185
-1, // 186
-1, // 187
-1, // 188
-1, // 189
-1, // 190
-1, // 191
-1, // 192
67, // 193
67, // 194
67, // 195
67, // 196
67, // 197
67, // 198
66, // 199
66, // 200
66, // 201
66, // 202
66, // 203
66, // 204
66, // 205
66, // 206
66, // 207
66, // 208
66, // 209
66, // 210
66, // 211
66, // 212
66, // 213
66, // 214
66, // 215
66, // 216
66, // 217
66, // 218
-1, // 219
-1, // 220
-1, // 221
-1, // 222
97, // 223
-1, // 224
67, // 225
67, // 226
67, // 227
67, // 228
67, // 229
67, // 230
66, // 231
66, // 232
66, // 233
66, // 234
66, // 235
66, // 236
66, // 237
66, // 238
66, // 239
66, // 240
66, // 241
66, // 242
66, // 243
66, // 244
66, // 245
66, // 246
66, // 247
66, // 248
66, // 249
66, // 250
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
"digit* ::= digit* digit", // 111
"digit* ::= digit* digit", // 112
"<decl in class>* ::= <decl in class>* <decl in class>", // 113
"<decl in class>* ::= <decl in class>* <decl in class>", // 114
"hexDigit* ::= hexDigit* hexDigit", // 115
"hexDigit* ::= hexDigit* hexDigit", // 116
"<stmt>* ::= <stmt>* <stmt>", // 117
"<stmt>* ::= <stmt>* <stmt>", // 118
"idChar* ::= idChar* idChar", // 119
"idChar* ::= idChar* idChar", // 120
"<class decl>+ ::= <class decl>", // 121
"<class decl>+ ::= <class decl>+ <class decl>", // 122
"ws* ::= ws* ws", // 123
"ws* ::= ws* ws", // 124
"", // 125
"", // 126
"", // 127
"", // 128
"", // 129
"", // 130
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
    { // 26: <local var decl> ::= <type> [#] ID `= <exp> @localVarDecl(Type,int,String,Exp)=>Statement
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((6<<5)|0x6)/*nullProductionAction:6*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((16<<5)|0x5)/*methodCall:16*/,
    },
    { // 27: <exp> ::= <exp8> @pass
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
    },
    { // 28: <exp8> ::= <exp7> @pass
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
    },
    { // 29: <exp7> ::= <exp6> @pass
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
    },
    { // 30: <exp6> ::= <exp5> @pass
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
    },
    { // 31: <exp5> ::= <exp4> @pass
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
    },
    { // 32: <exp4> ::= <exp4> [#] `+ <exp3> @newPlus(Exp,int,Exp)=>Exp
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((6<<5)|0x6)/*nullProductionAction:6*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((17<<5)|0x5)/*methodCall:17*/,
    },
    { // 33: <exp4> ::= <exp3> @pass
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
    },
    { // 34: <exp3> ::= <exp3> [#] `* <exp2> @newTimes(Exp,int,Exp)=>Exp
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((6<<5)|0x6)/*nullProductionAction:6*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((18<<5)|0x5)/*methodCall:18*/,
    },
    { // 35: <exp3> ::= <exp2> @pass
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
    },
    { // 36: <exp2> ::= <cast exp> @pass
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
    },
    { // 37: <exp2> ::= <unary exp> @pass
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
    },
    { // 38: <cast exp> ::= [#] `( <type> `) <cast exp> @newCast(int,Type,Exp)=>Exp
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((6<<5)|0x6)/*nullProductionAction:6*/,
      ((19<<5)|0x5)/*methodCall:19*/,
    },
    { // 39: <cast exp> ::= [#] `( <type> `) <exp1> @newCast(int,Type,Exp)=>Exp
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((6<<5)|0x6)/*nullProductionAction:6*/,
      ((19<<5)|0x5)/*methodCall:19*/,
    },
    { // 40: <unary exp> ::= [#] `- <unary exp> @newUnaryMinus(int,Exp)=>Exp
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((6<<5)|0x6)/*nullProductionAction:6*/,
      ((20<<5)|0x5)/*methodCall:20*/,
    },
    { // 41: <unary exp> ::= <exp1> @pass
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
    },
    { // 42: <exp1> ::= [#] ID @newIdentfierExp(int,String)=>Exp
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((6<<5)|0x6)/*nullProductionAction:6*/,
      ((21<<5)|0x5)/*methodCall:21*/,
    },
    { // 43: <exp1> ::= <exp1> !<empty bracket pair> [#] `[ <exp> `] @newArrayLookup(Exp,int,Exp)=>Exp
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((6<<5)|0x6)/*nullProductionAction:6*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((22<<5)|0x5)/*methodCall:22*/,
    },
    { // 44: <exp1> ::= [#] INTLIT @newIntegerLiteral(int,int)=>Exp
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((6<<5)|0x6)/*nullProductionAction:6*/,
      ((23<<5)|0x5)/*methodCall:23*/,
    },
    { // 45: letter ::= {"A".."Z" "a".."z"} @pass
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
    },
    { // 46: letter128 ::= {193..218 225..250} @sub128(char)=>char
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((24<<5)|0x5)/*methodCall:24*/,
    },
    { // 47: digit ::= {"0".."9"} @pass
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
    },
    { // 48: digit128 ::= {176..185} @sub128(char)=>char
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((24<<5)|0x5)/*methodCall:24*/,
    },
    { // 49: ws ::= " " @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 50: ws ::= {10} [registerNewline] @void
      ((7<<5)|0x6)/*nullProductionAction:7*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 51: `boolean ::= "#" "b" "o" ws* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((3<<5)|0x3)/*popOffPushBack:3*/,
    },
    { // 52: `boolean ::= "#" "b" "o" [ws*] @void
      ((3<<5)|0x6)/*nullProductionAction:3*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((3<<5)|0x3)/*popOffPushBack:3*/,
    },
    { // 53: `class ::= "#" "c" "l" ws* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((3<<5)|0x3)/*popOffPushBack:3*/,
    },
    { // 54: `class ::= "#" "c" "l" [ws*] @void
      ((3<<5)|0x6)/*nullProductionAction:3*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((3<<5)|0x3)/*popOffPushBack:3*/,
    },
    { // 55: `extends ::= "#" "e" "x" ws* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((3<<5)|0x3)/*popOffPushBack:3*/,
    },
    { // 56: `extends ::= "#" "e" "x" [ws*] @void
      ((3<<5)|0x6)/*nullProductionAction:3*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((3<<5)|0x3)/*popOffPushBack:3*/,
    },
    { // 57: `void ::= "#" "v" "o" ws* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((3<<5)|0x3)/*popOffPushBack:3*/,
    },
    { // 58: `void ::= "#" "v" "o" [ws*] @void
      ((3<<5)|0x6)/*nullProductionAction:3*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((3<<5)|0x3)/*popOffPushBack:3*/,
    },
    { // 59: `int ::= "#" "i" "t" ws* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((3<<5)|0x3)/*popOffPushBack:3*/,
    },
    { // 60: `int ::= "#" "i" "t" [ws*] @void
      ((3<<5)|0x6)/*nullProductionAction:3*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((3<<5)|0x3)/*popOffPushBack:3*/,
    },
    { // 61: `while ::= "#" "w" "h" ws* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((3<<5)|0x3)/*popOffPushBack:3*/,
    },
    { // 62: `while ::= "#" "w" "h" [ws*] @void
      ((3<<5)|0x6)/*nullProductionAction:3*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((3<<5)|0x3)/*popOffPushBack:3*/,
    },
    { // 63: `if ::= "#" "+" ws* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((2<<5)|0x3)/*popOffPushBack:2*/,
    },
    { // 64: `if ::= "#" "+" [ws*] @void
      ((3<<5)|0x6)/*nullProductionAction:3*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((2<<5)|0x3)/*popOffPushBack:2*/,
    },
    { // 65: `else ::= "#" "e" "l" ws* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((3<<5)|0x3)/*popOffPushBack:3*/,
    },
    { // 66: `else ::= "#" "e" "l" [ws*] @void
      ((3<<5)|0x6)/*nullProductionAction:3*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((3<<5)|0x3)/*popOffPushBack:3*/,
    },
    { // 67: `for ::= "#" "f" "o" ws* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((3<<5)|0x3)/*popOffPushBack:3*/,
    },
    { // 68: `for ::= "#" "f" "o" [ws*] @void
      ((3<<5)|0x6)/*nullProductionAction:3*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((3<<5)|0x3)/*popOffPushBack:3*/,
    },
    { // 69: `public ::= "#" "p" "u" ws* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((3<<5)|0x3)/*popOffPushBack:3*/,
    },
    { // 70: `public ::= "#" "p" "u" [ws*] @void
      ((3<<5)|0x6)/*nullProductionAction:3*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((3<<5)|0x3)/*popOffPushBack:3*/,
    },
    { // 71: `* ::= "*" ws* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 72: `* ::= "*" [ws*] @void
      ((3<<5)|0x6)/*nullProductionAction:3*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 73: `( ::= "(" ws* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 74: `( ::= "(" [ws*] @void
      ((3<<5)|0x6)/*nullProductionAction:3*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 75: `) ::= ")" ws* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 76: `) ::= ")" [ws*] @void
      ((3<<5)|0x6)/*nullProductionAction:3*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 77: `{ ::= "{" ws* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 78: `{ ::= "{" [ws*] @void
      ((3<<5)|0x6)/*nullProductionAction:3*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 79: `} ::= "}" ws* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 80: `} ::= "}" [ws*] @void
      ((3<<5)|0x6)/*nullProductionAction:3*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 81: `- ::= "-" ws* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 82: `- ::= "-" [ws*] @void
      ((3<<5)|0x6)/*nullProductionAction:3*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 83: `+ ::= "+" ws* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 84: `+ ::= "+" [ws*] @void
      ((3<<5)|0x6)/*nullProductionAction:3*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 85: `= ::= "=" ws* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 86: `= ::= "=" [ws*] @void
      ((3<<5)|0x6)/*nullProductionAction:3*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 87: `[ ::= "[" ws* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 88: `[ ::= "[" [ws*] @void
      ((3<<5)|0x6)/*nullProductionAction:3*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 89: `] ::= "]" ws* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 90: `] ::= "]" [ws*] @void
      ((3<<5)|0x6)/*nullProductionAction:3*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 91: `; ::= ";" ws* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 92: `; ::= ";" [ws*] @void
      ((3<<5)|0x6)/*nullProductionAction:3*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 93: ID ::= letter128 ws* @text
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x4)/*stringConcat:1*/,
    },
    { // 94: ID ::= letter128 [ws*] @text
      ((3<<5)|0x6)/*nullProductionAction:3*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x4)/*stringConcat:1*/,
    },
    { // 95: ID ::= letter idChar* $$0 @text
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((3<<5)|0x4)/*stringConcat:3*/,
    },
    { // 96: ID ::= letter [idChar*] $$0 @text
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((4<<5)|0x6)/*nullProductionAction:4*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((3<<5)|0x4)/*stringConcat:3*/,
    },
    { // 97: INTLIT ::= {"1".."9"} digit* $$1 @convertToInt(char,List<Character>,char)=>int
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((25<<5)|0x5)/*methodCall:25*/,
    },
    { // 98: INTLIT ::= {"1".."9"} [digit*] $$1 @convertToInt(char,List<Character>,char)=>int
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((5<<5)|0x6)/*nullProductionAction:5*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((25<<5)|0x5)/*methodCall:25*/,
    },
    { // 99: INTLIT ::= digit128 ws* @convertToInt(char)=>int
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((26<<5)|0x5)/*methodCall:26*/,
    },
    { // 100: INTLIT ::= digit128 [ws*] @convertToInt(char)=>int
      ((3<<5)|0x6)/*nullProductionAction:3*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((26<<5)|0x5)/*methodCall:26*/,
    },
    { // 101: INTLIT ::= "0" hexDigit* $$2 @convert16ToInt(char,List<Character>,char)=>int
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((27<<5)|0x5)/*methodCall:27*/,
    },
    { // 102: INTLIT ::= "0" [hexDigit*] $$2 @convert16ToInt(char,List<Character>,char)=>int
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((0<<5)|0x6)/*nullProductionAction:0*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((27<<5)|0x5)/*methodCall:27*/,
    },
    { // 103: idChar ::= letter @pass
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
    },
    { // 104: idChar ::= digit @pass
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
    },
    { // 105: idChar ::= "_" @pass
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
    },
    { // 106: idChar128 ::= letter128 @pass
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
    },
    { // 107: idChar128 ::= digit128 @pass
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
    },
    { // 108: idChar128 ::= {223} @underscore(char)=>char
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((28<<5)|0x5)/*methodCall:28*/,
    },
    { // 109: hexDigit ::= {"0".."9" "A".."Z" "a".."z"} @pass
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
    },
    { // 110: hexDigit128 ::= {176..185 193..198 225..230} @sub128(char)=>char
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((24<<5)|0x5)/*methodCall:24*/,
    },
    { // 111: digit* ::= digit* digit @append
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xb)/*append:1*/,
    },
    { // 112: digit* ::= [digit*] digit @append
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((5<<5)|0x6)/*nullProductionAction:5*/,
      ((1<<5)|0xb)/*append:1*/,
    },
    { // 113: <decl in class>* ::= <decl in class>* <decl in class> @append
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xb)/*append:1*/,
    },
    { // 114: <decl in class>* ::= [<decl in class>*] <decl in class> @append
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((2<<5)|0x6)/*nullProductionAction:2*/,
      ((1<<5)|0xb)/*append:1*/,
    },
    { // 115: hexDigit* ::= hexDigit* hexDigit @append
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xb)/*append:1*/,
    },
    { // 116: hexDigit* ::= [hexDigit*] hexDigit @append
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((0<<5)|0x6)/*nullProductionAction:0*/,
      ((1<<5)|0xb)/*append:1*/,
    },
    { // 117: <stmt>* ::= <stmt>* <stmt> @append
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xb)/*append:1*/,
    },
    { // 118: <stmt>* ::= [<stmt>*] <stmt> @append
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x6)/*nullProductionAction:1*/,
      ((1<<5)|0xb)/*append:1*/,
    },
    { // 119: idChar* ::= idChar* idChar @append
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xb)/*append:1*/,
    },
    { // 120: idChar* ::= [idChar*] idChar @append
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((4<<5)|0x6)/*nullProductionAction:4*/,
      ((1<<5)|0xb)/*append:1*/,
    },
    { // 121: <class decl>+ ::= <class decl> @singleList
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xa)/*singleList:1*/,
    },
    { // 122: <class decl>+ ::= <class decl>+ <class decl> @append
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xb)/*append:1*/,
    },
    { // 123: ws* ::= ws* ws @append
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
    },
    { // 124: ws* ::= [ws*] ws @append
      ((1<<5)|0xe)/*popPos:1*/,
      ((3<<5)|0x6)/*nullProductionAction:3*/,
    },
    { // 125: $$0 ::= idChar128 ws* @pass
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
    },
    { // 126: $$0 ::= idChar128 [ws*] @pass
      ((3<<5)|0x6)/*nullProductionAction:3*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
    },
    { // 127: $$1 ::= digit128 ws* @pass
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
    },
    { // 128: $$1 ::= digit128 [ws*] @pass
      ((3<<5)|0x6)/*nullProductionAction:3*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
    },
    { // 129: $$2 ::= hexDigit128 ws* @pass
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
    },
    { // 130: $$2 ::= hexDigit128 [ws*] @pass
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
      ((29<<5)|0x5)/*methodCall:29*/,
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
      Type parm0 = (Type)si.popPb();
      int parm1 = (Integer)si.popPb();
      String parm2 = (String)si.popPb();
      Exp parm3 = (Exp)si.popPb();
      Statement result = actionObject.localVarDecl(parm0,parm1,parm2,parm3);
      si.pushPb(result);
    }
    break;
    case 17: {
      Exp parm0 = (Exp)si.popPb();
      int parm1 = (Integer)si.popPb();
      Exp parm2 = (Exp)si.popPb();
      Exp result = actionObject.newPlus(parm0,parm1,parm2);
      si.pushPb(result);
    }
    break;
    case 18: {
      Exp parm0 = (Exp)si.popPb();
      int parm1 = (Integer)si.popPb();
      Exp parm2 = (Exp)si.popPb();
      Exp result = actionObject.newTimes(parm0,parm1,parm2);
      si.pushPb(result);
    }
    break;
    case 19: {
      int parm0 = (Integer)si.popPb();
      Type parm1 = (Type)si.popPb();
      Exp parm2 = (Exp)si.popPb();
      Exp result = actionObject.newCast(parm0,parm1,parm2);
      si.pushPb(result);
    }
    break;
    case 20: {
      int parm0 = (Integer)si.popPb();
      Exp parm1 = (Exp)si.popPb();
      Exp result = actionObject.newUnaryMinus(parm0,parm1);
      si.pushPb(result);
    }
    break;
    case 21: {
      int parm0 = (Integer)si.popPb();
      String parm1 = (String)si.popPb();
      Exp result = actionObject.newIdentfierExp(parm0,parm1);
      si.pushPb(result);
    }
    break;
    case 22: {
      Exp parm0 = (Exp)si.popPb();
      int parm1 = (Integer)si.popPb();
      Exp parm2 = (Exp)si.popPb();
      Exp result = actionObject.newArrayLookup(parm0,parm1,parm2);
      si.pushPb(result);
    }
    break;
    case 23: {
      int parm0 = (Integer)si.popPb();
      int parm1 = (Integer)si.popPb();
      Exp result = actionObject.newIntegerLiteral(parm0,parm1);
      si.pushPb(result);
    }
    break;
    case 24: {
      char parm0 = (Character)si.popPb();
      char result = actionObject.sub128(parm0);
      si.pushPb(result);
    }
    break;
    case 25: {
      char parm0 = (Character)si.popPb();
      List<Character> parm1 = (List<Character>)si.popPb();
      char parm2 = (Character)si.popPb();
      int result = actionObject.convertToInt(parm0,parm1,parm2);
      si.pushPb(result);
    }
    break;
    case 26: {
      char parm0 = (Character)si.popPb();
      int result = actionObject.convertToInt(parm0);
      si.pushPb(result);
    }
    break;
    case 27: {
      char parm0 = (Character)si.popPb();
      List<Character> parm1 = (List<Character>)si.popPb();
      char parm2 = (Character)si.popPb();
      int result = actionObject.convert16ToInt(parm0,parm1,parm2);
      si.pushPb(result);
    }
    break;
    case 28: {
      char parm0 = (Character)si.popPb();
      char result = actionObject.underscore(parm0);
      si.pushPb(result);
    }
    break;
    case 29: {
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
