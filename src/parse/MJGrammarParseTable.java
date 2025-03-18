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
public int getEofSym() { return 93; }
public int getNttSym() { return 94; }
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
"<exp>",
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
"\"p\"",
"\"v\"",
"{\"A\"..\"Z\" \"a\" \"d\" \"f\"..\"h\" \"j\"..\"k\" \"m\"..\"n\" \"q\"..\"s\" \"w\" \"y\"..\"z\"}",
"\"b\"",
"\"e\"",
"\"t\"",
"\"c\"",
"\"i\"",
"\"l\"",
"\"o\"",
"\"u\"",
"\"x\"",
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
"\"*\"",
"\"(\"",
"\")\"",
"\"{\"",
"\"}\"",
"\"-\"",
"\"+\"",
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
public int numSymbols() { return 95;}
private static final int MIN_REDUCTION = 657;
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
1,584, // <start>
2,207, // ws*
3,188, // <program>
4,278, // <class decl>+
5,426, // <class decl>
6,600, // `class
66,357, // ws
67,135, // " "
68,194, // {10}
69,128, // "#"
  }
,
{ // state 1
  }
,
{ // state 2
MIN_REDUCTION+33, // (default reduction)
  }
,
{ // state 3
MIN_REDUCTION+23, // (default reduction)
  }
,
{ // state 4
66,309, // ws
67,162, // " "
68,219, // {10}
MIN_REDUCTION+70, // (default reduction)
  }
,
{ // state 5
2,397, // ws*
66,81, // ws
67,360, // " "
68,287, // {10}
MIN_REDUCTION+113, // (default reduction)
  }
,
{ // state 6
23,MIN_REDUCTION+114, // `[
66,56, // ws
67,175, // " "
68,20, // {10}
78,MIN_REDUCTION+114, // "["
MIN_REDUCTION+114, // (default reduction)
  }
,
{ // state 7
2,631, // ws*
66,141, // ws
67,50, // " "
68,580, // {10}
MIN_REDUCTION+47, // (default reduction)
  }
,
{ // state 8
MIN_REDUCTION+93, // (default reduction)
  }
,
{ // state 9
2,501, // ws*
66,82, // ws
67,358, // " "
68,286, // {10}
MIN_REDUCTION+61, // (default reduction)
  }
,
{ // state 10
0x80000000|93, // match move
0x80000000|49, // no-match move
0x80000000|47, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 11
0x80000000|424, // match move
0x80000000|403, // no-match move
0x80000000|47, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 12
MIN_REDUCTION+45, // (default reduction)
  }
,
{ // state 13
MIN_REDUCTION+24, // (default reduction)
  }
,
{ // state 14
2,108, // ws*
66,608, // ws
67,502, // " "
68,359, // {10}
MIN_REDUCTION+67, // (default reduction)
  }
,
{ // state 15
MIN_REDUCTION+25, // (default reduction)
  }
,
{ // state 16
0x80000000|422, // match move
0x80000000|398, // no-match move
0x80000000|47, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 17
MIN_REDUCTION+24, // (default reduction)
  }
,
{ // state 18
MIN_REDUCTION+25, // (default reduction)
  }
,
{ // state 19
2,618, // ws*
23,MIN_REDUCTION+81, // `[
66,124, // ws
67,10, // " "
68,113, // {10}
78,MIN_REDUCTION+81, // "["
MIN_REDUCTION+81, // (default reduction)
  }
,
{ // state 20
0x80000000|1, // match move
0x80000000|249, // no-match move
0x80000000|47, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 21
23,MIN_REDUCTION+89, // `[
78,MIN_REDUCTION+89, // "["
MIN_REDUCTION+89, // (default reduction)
  }
,
{ // state 22
MIN_REDUCTION+95, // (default reduction)
  }
,
{ // state 23
23,MIN_REDUCTION+89, // `[
78,MIN_REDUCTION+89, // "["
MIN_REDUCTION+89, // (default reduction)
  }
,
{ // state 24
MIN_REDUCTION+111, // (default reduction)
  }
,
{ // state 25
MIN_REDUCTION+111, // (default reduction)
  }
,
{ // state 26
MIN_REDUCTION+20, // (default reduction)
  }
,
{ // state 27
23,MIN_REDUCTION+76, // `[
66,56, // ws
67,175, // " "
68,20, // {10}
78,MIN_REDUCTION+76, // "["
MIN_REDUCTION+76, // (default reduction)
  }
,
{ // state 28
-1, // $$start
-1, // <start>
-1, // ws*
-1, // <program>
-1, // <class decl>+
-1, // <class decl>
-1, // `class
265, // ID
28, // `{
-1, // <decl in class>*
210, // `}
-1, // `extends
-1, // <decl in class>
-1, // <method decl>
-1, // `public
-1, // `void
506, // `(
-1, // `)
185, // <stmt>*
220, // <type>
235, // `int
239, // `boolean
-1, // <empty bracket pair>
-1, // `[
-1, // `]
604, // <stmt>
269, // <assign>
-1, // `;
404, // <local var decl>
567, // <exp>
-1, // `=
487, // <exp8>
337, // <exp7>
13, // <exp6>
18, // <exp5>
112, // <exp4>
-1, // `+
469, // <exp3>
-1, // `*
85, // <exp2>
260, // <cast exp>
477, // <unary exp>
97, // <exp1>
149, // `-
458, // INTLIT
572, // letter
109, // "p"
109, // "v"
109, // {"A".."Z" "a" "d" "f".."h" "j".."k" "m".."n" "q".."s" "w" "y".."z"}
109, // "b"
109, // "e"
109, // "t"
109, // "c"
109, // "i"
109, // "l"
109, // "o"
109, // "u"
109, // "x"
381, // letter128
203, // {199..218 231..250}
203, // {193..198 225..230}
-1, // digit
271, // {"1".."9"}
418, // "0"
566, // digit128
596, // {176..185}
-1, // ws
-1, // " "
-1, // {10}
91, // "#"
-1, // "*"
274, // "("
-1, // ")"
190, // "{"
573, // "}"
611, // "-"
-1, // "+"
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
{ // state 29
0x80000000|356, // match move
0x80000000|161, // no-match move
0x80000000|47, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 30
16,172, // `(
71,9, // "("
  }
,
{ // state 31
23,MIN_REDUCTION+93, // `[
78,MIN_REDUCTION+93, // "["
MIN_REDUCTION+93, // (default reduction)
  }
,
{ // state 32
2,484, // ws*
  }
,
{ // state 33
0x80000000|1, // match move
0x80000000|322, // no-match move
0x80000000|47, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 34
23,MIN_REDUCTION+93, // `[
78,MIN_REDUCTION+93, // "["
MIN_REDUCTION+93, // (default reduction)
  }
,
{ // state 35
MIN_REDUCTION+44, // (default reduction)
  }
,
{ // state 36
0x80000000|1, // match move
0x80000000|327, // no-match move
0x80000000|47, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 37
55,463, // "o"
  }
,
{ // state 38
0x80000000|550, // match move
0x80000000|280, // no-match move
0x80000000|47, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 39
66,552, // ws
67,277, // " "
68,306, // {10}
MIN_REDUCTION+64, // (default reduction)
  }
,
{ // state 40
MIN_REDUCTION+44, // (default reduction)
  }
,
{ // state 41
94,MIN_REDUCTION+15, // $NT
  }
,
{ // state 42
MIN_REDUCTION+111, // (default reduction)
  }
,
{ // state 43
MIN_REDUCTION+82, // (default reduction)
  }
,
{ // state 44
0x80000000|356, // match move
0x80000000|531, // no-match move
0x80000000|47, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 45
45,649, // letter
46,76, // "p"
47,76, // "v"
48,76, // {"A".."Z" "a" "d" "f".."h" "j".."k" "m".."n" "q".."s" "w" "y".."z"}
49,76, // "b"
50,76, // "e"
51,76, // "t"
52,76, // "c"
53,76, // "i"
54,76, // "l"
55,76, // "o"
56,76, // "u"
57,76, // "x"
58,533, // letter128
59,203, // {199..218 231..250}
60,203, // {193..198 225..230}
61,294, // digit
62,255, // {"1".."9"}
63,255, // "0"
64,564, // digit128
65,171, // {176..185}
82,38, // $$0
87,589, // idChar
88,560, // "_"
89,612, // idChar128
90,563, // {223}
  }
,
{ // state 46
0x80000000|356, // match move
0x80000000|184, // no-match move
0x80000000|47, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 47
23,452, // `[
78,199, // "["
  }
,
{ // state 48
46,405, // "p"
47,405, // "v"
48,405, // {"A".."Z" "a" "d" "f".."h" "j".."k" "m".."n" "q".."s" "w" "y".."z"}
49,405, // "b"
50,405, // "e"
51,405, // "t"
52,405, // "c"
53,405, // "i"
54,405, // "l"
55,405, // "o"
56,405, // "u"
57,405, // "x"
60,75, // {193..198 225..230}
62,405, // {"1".."9"}
63,405, // "0"
65,75, // {176..185}
86,482, // $$2
91,80, // hexDigit
92,594, // hexDigit128
  }
,
{ // state 49
23,MIN_REDUCTION+44, // `[
78,MIN_REDUCTION+44, // "["
MIN_REDUCTION+44, // (default reduction)
  }
,
{ // state 50
MIN_REDUCTION+44, // (default reduction)
  }
,
{ // state 51
23,MIN_REDUCTION+94, // `[
78,MIN_REDUCTION+94, // "["
MIN_REDUCTION+94, // (default reduction)
  }
,
{ // state 52
23,MIN_REDUCTION+93, // `[
78,MIN_REDUCTION+93, // "["
MIN_REDUCTION+93, // (default reduction)
  }
,
{ // state 53
0x80000000|54, // match move
0x80000000|549, // no-match move
0x80000000|47, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 54
2,447, // ws*
  }
,
{ // state 55
MIN_REDUCTION+15, // (default reduction)
  }
,
{ // state 56
0x80000000|1, // match move
0x80000000|301, // no-match move
0x80000000|47, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 57
24,55, // `]
79,145, // "]"
  }
,
{ // state 58
MIN_REDUCTION+30, // (default reduction)
  }
,
{ // state 59
MIN_REDUCTION+43, // (default reduction)
  }
,
{ // state 60
MIN_REDUCTION+93, // (default reduction)
  }
,
{ // state 61
0x80000000|1, // match move
0x80000000|637, // no-match move
0x80000000|47, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 62
0x80000000|67, // match move
0x80000000|548, // no-match move
0x80000000|47, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 63
0x80000000|1, // match move
0x80000000|639, // no-match move
0x80000000|47, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 64
7,226, // ID
16,511, // `(
29,257, // <exp>
31,493, // <exp8>
32,332, // <exp7>
33,17, // <exp6>
34,15, // <exp5>
35,154, // <exp4>
37,468, // <exp3>
39,88, // <exp2>
40,258, // <cast exp>
41,480, // <unary exp>
42,127, // <exp1>
43,143, // `-
44,461, // INTLIT
45,289, // letter
46,109, // "p"
47,109, // "v"
48,109, // {"A".."Z" "a" "d" "f".."h" "j".."k" "m".."n" "q".."s" "w" "y".."z"}
49,109, // "b"
50,109, // "e"
51,109, // "t"
52,109, // "c"
53,109, // "i"
54,109, // "l"
55,109, // "o"
56,109, // "u"
57,109, // "x"
58,562, // letter128
59,44, // {199..218 231..250}
60,44, // {193..198 225..230}
62,272, // {"1".."9"}
63,417, // "0"
64,568, // digit128
65,597, // {176..185}
71,274, // "("
75,611, // "-"
  }
,
{ // state 65
66,570, // ws
67,340, // " "
68,315, // {10}
MIN_REDUCTION+78, // (default reduction)
  }
,
{ // state 66
2,355, // ws*
66,42, // ws
67,384, // " "
68,231, // {10}
MIN_REDUCTION+113, // (default reduction)
  }
,
{ // state 67
2,449, // ws*
  }
,
{ // state 68
MIN_REDUCTION+110, // (default reduction)
  }
,
{ // state 69
23,419, // `[
78,376, // "["
MIN_REDUCTION+36, // (default reduction)
  }
,
{ // state 70
MIN_REDUCTION+33, // (default reduction)
  }
,
{ // state 71
MIN_REDUCTION+7, // (default reduction)
  }
,
{ // state 72
0x80000000|1, // match move
0x80000000|444, // no-match move
0x80000000|47, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 73
MIN_REDUCTION+33, // (default reduction)
  }
,
{ // state 74
36,516, // `+
76,586, // "+"
MIN_REDUCTION+26, // (default reduction)
  }
,
{ // state 75
0x80000000|166, // match move
0x80000000|429, // no-match move
0x80000000|47, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 76
MIN_REDUCTION+40, // (default reduction)
  }
,
{ // state 77
0x80000000|1, // match move
0x80000000|459, // no-match move
0x80000000|47, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 78
45,649, // letter
46,76, // "p"
47,76, // "v"
48,76, // {"A".."Z" "a" "d" "f".."h" "j".."k" "m".."n" "q".."s" "w" "y".."z"}
49,76, // "b"
50,76, // "e"
51,76, // "t"
52,76, // "c"
53,76, // "i"
54,76, // "l"
55,76, // "o"
56,76, // "u"
57,76, // "x"
58,529, // letter128
59,29, // {199..218 231..250}
60,29, // {193..198 225..230}
61,294, // digit
62,255, // {"1".."9"}
63,255, // "0"
64,90, // digit128
65,614, // {176..185}
81,130, // idChar*
82,333, // $$0
87,519, // idChar
88,560, // "_"
89,153, // idChar128
90,253, // {223}
  }
,
{ // state 79
MIN_REDUCTION+82, // (default reduction)
  }
,
{ // state 80
MIN_REDUCTION+102, // (default reduction)
  }
,
{ // state 81
MIN_REDUCTION+111, // (default reduction)
  }
,
{ // state 82
MIN_REDUCTION+111, // (default reduction)
  }
,
{ // state 83
8,443, // `{
73,394, // "{"
  }
,
{ // state 84
2,638, // ws*
66,141, // ws
67,50, // " "
68,580, // {10}
MIN_REDUCTION+55, // (default reduction)
  }
,
{ // state 85
MIN_REDUCTION+30, // (default reduction)
  }
,
{ // state 86
66,173, // ws
67,328, // " "
68,353, // {10}
MIN_REDUCTION+56, // (default reduction)
  }
,
{ // state 87
23,MIN_REDUCTION+110, // `[
78,MIN_REDUCTION+110, // "["
MIN_REDUCTION+110, // (default reduction)
  }
,
{ // state 88
MIN_REDUCTION+30, // (default reduction)
  }
,
{ // state 89
23,416, // `[
78,376, // "["
MIN_REDUCTION+36, // (default reduction)
  }
,
{ // state 90
0x80000000|485, // match move
0x80000000|606, // no-match move
0x80000000|47, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 91
49,486, // "b"
53,182, // "i"
  }
,
{ // state 92
7,226, // ID
16,511, // `(
40,70, // <cast exp>
42,388, // <exp1>
44,461, // INTLIT
45,289, // letter
46,109, // "p"
47,109, // "v"
48,109, // {"A".."Z" "a" "d" "f".."h" "j".."k" "m".."n" "q".."s" "w" "y".."z"}
49,109, // "b"
50,109, // "e"
51,109, // "t"
52,109, // "c"
53,109, // "i"
54,109, // "l"
55,109, // "o"
56,109, // "u"
57,109, // "x"
58,562, // letter128
59,44, // {199..218 231..250}
60,44, // {193..198 225..230}
62,272, // {"1".."9"}
63,417, // "0"
64,568, // digit128
65,597, // {176..185}
71,274, // "("
  }
,
{ // state 93
MIN_REDUCTION+44, // (default reduction)
  }
,
{ // state 94
MIN_REDUCTION+17, // (default reduction)
  }
,
{ // state 95
66,373, // ws
67,518, // " "
68,118, // {10}
MIN_REDUCTION+46, // (default reduction)
  }
,
{ // state 96
0x80000000|1, // match move
0x80000000|565, // no-match move
0x80000000|47, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 97
0x80000000|1, // match move
0x80000000|89, // no-match move
0x80000000|47, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 98
MIN_REDUCTION+110, // (default reduction)
  }
,
{ // state 99
MIN_REDUCTION+83, // (default reduction)
  }
,
{ // state 100
MIN_REDUCTION+110, // (default reduction)
  }
,
{ // state 101
MIN_REDUCTION+45, // (default reduction)
  }
,
{ // state 102
23,MIN_REDUCTION+83, // `[
78,MIN_REDUCTION+83, // "["
MIN_REDUCTION+83, // (default reduction)
  }
,
{ // state 103
0x80000000|351, // match move
0x80000000|273, // no-match move
0x80000000|47, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 104
0x80000000|485, // match move
0x80000000|557, // no-match move
0x80000000|47, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 105
23,MIN_REDUCTION+83, // `[
78,MIN_REDUCTION+83, // "["
MIN_REDUCTION+83, // (default reduction)
  }
,
{ // state 106
0x80000000|351, // match move
0x80000000|276, // no-match move
0x80000000|47, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 107
0x80000000|485, // match move
0x80000000|559, // no-match move
0x80000000|47, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 108
66,129, // ws
67,502, // " "
68,359, // {10}
MIN_REDUCTION+66, // (default reduction)
  }
,
{ // state 109
MIN_REDUCTION+40, // (default reduction)
  }
,
{ // state 110
MIN_REDUCTION+83, // (default reduction)
  }
,
{ // state 111
0x80000000|1, // match move
0x80000000|401, // no-match move
0x80000000|47, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 112
36,490, // `+
76,586, // "+"
MIN_REDUCTION+26, // (default reduction)
  }
,
{ // state 113
0x80000000|304, // match move
0x80000000|262, // no-match move
0x80000000|47, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 114
66,326, // ws
67,574, // " "
68,101, // {10}
MIN_REDUCTION+66, // (default reduction)
  }
,
{ // state 115
MIN_REDUCTION+9, // (default reduction)
  }
,
{ // state 116
46,405, // "p"
47,405, // "v"
48,405, // {"A".."Z" "a" "d" "f".."h" "j".."k" "m".."n" "q".."s" "w" "y".."z"}
49,405, // "b"
50,405, // "e"
51,405, // "t"
52,405, // "c"
53,405, // "i"
54,405, // "l"
55,405, // "o"
56,405, // "u"
57,405, // "x"
60,263, // {193..198 225..230}
62,405, // {"1".."9"}
63,405, // "0"
65,263, // {176..185}
86,510, // $$2
91,80, // hexDigit
92,62, // hexDigit128
  }
,
{ // state 117
46,405, // "p"
47,405, // "v"
48,405, // {"A".."Z" "a" "d" "f".."h" "j".."k" "m".."n" "q".."s" "w" "y".."z"}
49,405, // "b"
50,405, // "e"
51,405, // "t"
52,405, // "c"
53,405, // "i"
54,405, // "l"
55,405, // "o"
56,405, // "u"
57,405, // "x"
60,259, // {193..198 225..230}
62,405, // {"1".."9"}
63,405, // "0"
65,259, // {176..185}
86,512, // $$2
91,80, // hexDigit
92,53, // hexDigit128
  }
,
{ // state 118
MIN_REDUCTION+45, // (default reduction)
  }
,
{ // state 119
0x80000000|1, // match move
0x80000000|575, // no-match move
0x80000000|47, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 120
66,180, // ws
67,316, // " "
68,352, // {10}
MIN_REDUCTION+74, // (default reduction)
  }
,
{ // state 121
0x80000000|1, // match move
0x80000000|576, // no-match move
0x80000000|47, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 122
2,285, // ws*
23,MIN_REDUCTION+81, // `[
66,471, // ws
67,155, // " "
68,176, // {10}
78,MIN_REDUCTION+81, // "["
MIN_REDUCTION+81, // (default reduction)
  }
,
{ // state 123
2,138, // ws*
66,380, // ws
67,498, // " "
68,448, // {10}
MIN_REDUCTION+113, // (default reduction)
  }
,
{ // state 124
0x80000000|240, // match move
0x80000000|505, // no-match move
0x80000000|47, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 125
MIN_REDUCTION+111, // (default reduction)
  }
,
{ // state 126
2,282, // ws*
23,MIN_REDUCTION+81, // `[
66,474, // ws
67,157, // " "
68,170, // {10}
78,MIN_REDUCTION+81, // "["
MIN_REDUCTION+81, // (default reduction)
  }
,
{ // state 127
0x80000000|1, // match move
0x80000000|69, // no-match move
0x80000000|47, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 128
52,423, // "c"
  }
,
{ // state 129
MIN_REDUCTION+110, // (default reduction)
  }
,
{ // state 130
45,649, // letter
46,76, // "p"
47,76, // "v"
48,76, // {"A".."Z" "a" "d" "f".."h" "j".."k" "m".."n" "q".."s" "w" "y".."z"}
49,76, // "b"
50,76, // "e"
51,76, // "t"
52,76, // "c"
53,76, // "i"
54,76, // "l"
55,76, // "o"
56,76, // "u"
57,76, // "x"
58,529, // letter128
59,29, // {199..218 231..250}
60,29, // {193..198 225..230}
61,294, // digit
62,255, // {"1".."9"}
63,255, // "0"
64,90, // digit128
65,614, // {176..185}
82,96, // $$0
87,589, // idChar
88,560, // "_"
89,153, // idChar128
90,253, // {223}
  }
,
{ // state 131
23,MIN_REDUCTION+112, // `[
66,56, // ws
67,175, // " "
68,20, // {10}
78,MIN_REDUCTION+112, // "["
MIN_REDUCTION+112, // (default reduction)
  }
,
{ // state 132
23,MIN_REDUCTION+83, // `[
78,MIN_REDUCTION+83, // "["
MIN_REDUCTION+83, // (default reduction)
  }
,
{ // state 133
23,390, // `[
78,376, // "["
MIN_REDUCTION+36, // (default reduction)
  }
,
{ // state 134
7,228, // ID
16,506, // `(
40,73, // <cast exp>
42,389, // <exp1>
44,458, // INTLIT
45,295, // letter
46,109, // "p"
47,109, // "v"
48,109, // {"A".."Z" "a" "d" "f".."h" "j".."k" "m".."n" "q".."s" "w" "y".."z"}
49,109, // "b"
50,109, // "e"
51,109, // "t"
52,109, // "c"
53,109, // "i"
54,109, // "l"
55,109, // "o"
56,109, // "u"
57,109, // "x"
58,561, // letter128
59,46, // {199..218 231..250}
60,46, // {193..198 225..230}
62,271, // {"1".."9"}
63,418, // "0"
64,566, // digit128
65,596, // {176..185}
71,274, // "("
  }
,
{ // state 135
MIN_REDUCTION+44, // (default reduction)
  }
,
{ // state 136
10,451, // `}
12,367, // <decl in class>
13,223, // <method decl>
14,324, // `public
69,577, // "#"
74,14, // "}"
  }
,
{ // state 137
45,649, // letter
46,76, // "p"
47,76, // "v"
48,76, // {"A".."Z" "a" "d" "f".."h" "j".."k" "m".."n" "q".."s" "w" "y".."z"}
49,76, // "b"
50,76, // "e"
51,76, // "t"
52,76, // "c"
53,76, // "i"
54,76, // "l"
55,76, // "o"
56,76, // "u"
57,76, // "x"
58,251, // letter128
59,633, // {199..218 231..250}
60,633, // {193..198 225..230}
61,294, // digit
62,255, // {"1".."9"}
63,255, // "0"
64,425, // digit128
65,613, // {176..185}
81,617, // idChar*
82,110, // $$0
87,519, // idChar
88,560, // "_"
89,123, // idChar128
90,22, // {223}
  }
,
{ // state 138
66,211, // ws
67,498, // " "
68,448, // {10}
MIN_REDUCTION+112, // (default reduction)
  }
,
{ // state 139
MIN_REDUCTION+12, // (default reduction)
  }
,
{ // state 140
MIN_REDUCTION+104, // (default reduction)
  }
,
{ // state 141
MIN_REDUCTION+111, // (default reduction)
  }
,
{ // state 142
-1, // $$start
-1, // <start>
-1, // ws*
-1, // <program>
-1, // <class decl>+
-1, // <class decl>
-1, // `class
265, // ID
28, // `{
-1, // <decl in class>*
623, // `}
-1, // `extends
-1, // <decl in class>
-1, // <method decl>
-1, // `public
-1, // `void
506, // `(
-1, // `)
551, // <stmt>*
220, // <type>
235, // `int
239, // `boolean
-1, // <empty bracket pair>
-1, // `[
-1, // `]
604, // <stmt>
269, // <assign>
-1, // `;
404, // <local var decl>
567, // <exp>
-1, // `=
487, // <exp8>
337, // <exp7>
13, // <exp6>
18, // <exp5>
112, // <exp4>
-1, // `+
469, // <exp3>
-1, // `*
85, // <exp2>
260, // <cast exp>
477, // <unary exp>
97, // <exp1>
149, // `-
458, // INTLIT
572, // letter
109, // "p"
109, // "v"
109, // {"A".."Z" "a" "d" "f".."h" "j".."k" "m".."n" "q".."s" "w" "y".."z"}
109, // "b"
109, // "e"
109, // "t"
109, // "c"
109, // "i"
109, // "l"
109, // "o"
109, // "u"
109, // "x"
381, // letter128
203, // {199..218 231..250}
203, // {193..198 225..230}
-1, // digit
271, // {"1".."9"}
418, // "0"
566, // digit128
596, // {176..185}
-1, // ws
-1, // " "
-1, // {10}
91, // "#"
-1, // "*"
274, // "("
-1, // ")"
190, // "{"
187, // "}"
611, // "-"
-1, // "+"
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
{ // state 143
7,226, // ID
41,635, // <unary exp>
42,127, // <exp1>
43,143, // `-
44,461, // INTLIT
45,289, // letter
46,109, // "p"
47,109, // "v"
48,109, // {"A".."Z" "a" "d" "f".."h" "j".."k" "m".."n" "q".."s" "w" "y".."z"}
49,109, // "b"
50,109, // "e"
51,109, // "t"
52,109, // "c"
53,109, // "i"
54,109, // "l"
55,109, // "o"
56,109, // "u"
57,109, // "x"
58,562, // letter128
59,44, // {199..218 231..250}
60,44, // {193..198 225..230}
62,272, // {"1".."9"}
63,417, // "0"
64,568, // digit128
65,597, // {176..185}
75,611, // "-"
  }
,
{ // state 144
38,433, // `*
70,479, // "*"
MIN_REDUCTION+27, // (default reduction)
  }
,
{ // state 145
2,343, // ws*
66,141, // ws
67,50, // " "
68,580, // {10}
MIN_REDUCTION+77, // (default reduction)
  }
,
{ // state 146
38,439, // `*
70,479, // "*"
MIN_REDUCTION+27, // (default reduction)
  }
,
{ // state 147
MIN_REDUCTION+83, // (default reduction)
  }
,
{ // state 148
0x80000000|1, // match move
0x80000000|133, // no-match move
0x80000000|47, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 149
7,228, // ID
41,629, // <unary exp>
42,97, // <exp1>
43,149, // `-
44,458, // INTLIT
45,295, // letter
46,109, // "p"
47,109, // "v"
48,109, // {"A".."Z" "a" "d" "f".."h" "j".."k" "m".."n" "q".."s" "w" "y".."z"}
49,109, // "b"
50,109, // "e"
51,109, // "t"
52,109, // "c"
53,109, // "i"
54,109, // "l"
55,109, // "o"
56,109, // "u"
57,109, // "x"
58,561, // letter128
59,46, // {199..218 231..250}
60,46, // {193..198 225..230}
62,271, // {"1".."9"}
63,418, // "0"
64,566, // digit128
65,596, // {176..185}
75,611, // "-"
  }
,
{ // state 150
57,302, // "x"
  }
,
{ // state 151
2,409, // ws*
66,250, // ws
67,518, // " "
68,118, // {10}
MIN_REDUCTION+81, // (default reduction)
  }
,
{ // state 152
0x80000000|1, // match move
0x80000000|131, // no-match move
0x80000000|47, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 153
0x80000000|402, // match move
0x80000000|530, // no-match move
0x80000000|47, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 154
36,504, // `+
76,586, // "+"
MIN_REDUCTION+26, // (default reduction)
  }
,
{ // state 155
0x80000000|1, // match move
0x80000000|300, // no-match move
0x80000000|47, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 156
45,649, // letter
46,76, // "p"
47,76, // "v"
48,76, // {"A".."Z" "a" "d" "f".."h" "j".."k" "m".."n" "q".."s" "w" "y".."z"}
49,76, // "b"
50,76, // "e"
51,76, // "t"
52,76, // "c"
53,76, // "i"
54,76, // "l"
55,76, // "o"
56,76, // "u"
57,76, // "x"
58,378, // letter128
59,46, // {199..218 231..250}
60,46, // {193..198 225..230}
61,294, // digit
62,255, // {"1".."9"}
63,255, // "0"
64,107, // digit128
65,596, // {176..185}
82,121, // $$0
87,589, // idChar
88,560, // "_"
89,16, // idChar128
90,106, // {223}
  }
,
{ // state 157
0x80000000|1, // match move
0x80000000|297, // no-match move
0x80000000|47, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 158
45,649, // letter
46,76, // "p"
47,76, // "v"
48,76, // {"A".."Z" "a" "d" "f".."h" "j".."k" "m".."n" "q".."s" "w" "y".."z"}
49,76, // "b"
50,76, // "e"
51,76, // "t"
52,76, // "c"
53,76, // "i"
54,76, // "l"
55,76, // "o"
56,76, // "u"
57,76, // "x"
58,383, // letter128
59,44, // {199..218 231..250}
60,44, // {193..198 225..230}
61,294, // digit
62,255, // {"1".."9"}
63,255, // "0"
64,104, // digit128
65,597, // {176..185}
82,119, // $$0
87,589, // idChar
88,560, // "_"
89,11, // idChar128
90,103, // {223}
  }
,
{ // state 159
2,450, // ws*
66,24, // ws
67,436, // " "
68,195, // {10}
MIN_REDUCTION+113, // (default reduction)
  }
,
{ // state 160
23,MIN_REDUCTION+111, // `[
78,MIN_REDUCTION+111, // "["
MIN_REDUCTION+111, // (default reduction)
  }
,
{ // state 161
23,MIN_REDUCTION+41, // `[
78,MIN_REDUCTION+41, // "["
MIN_REDUCTION+41, // (default reduction)
  }
,
{ // state 162
MIN_REDUCTION+44, // (default reduction)
  }
,
{ // state 163
2,618, // ws*
MIN_REDUCTION+81, // (default reduction)
  }
,
{ // state 164
MIN_REDUCTION+93, // (default reduction)
  }
,
{ // state 165
MIN_REDUCTION+111, // (default reduction)
  }
,
{ // state 166
MIN_REDUCTION+97, // (default reduction)
  }
,
{ // state 167
66,68, // ws
67,583, // " "
68,12, // {10}
MIN_REDUCTION+50, // (default reduction)
  }
,
{ // state 168
7,238, // ID
41,650, // <unary exp>
42,148, // <exp1>
43,168, // `-
44,441, // INTLIT
45,78, // letter
46,109, // "p"
47,109, // "v"
48,109, // {"A".."Z" "a" "d" "f".."h" "j".."k" "m".."n" "q".."s" "w" "y".."z"}
49,109, // "b"
50,109, // "e"
51,109, // "t"
52,109, // "c"
53,109, // "i"
54,109, // "l"
55,109, // "o"
56,109, // "u"
57,109, // "x"
58,536, // letter128
59,29, // {199..218 231..250}
60,29, // {193..198 225..230}
62,230, // {"1".."9"}
63,368, // "0"
64,542, // digit128
65,614, // {176..185}
75,611, // "-"
  }
,
{ // state 169
MIN_REDUCTION+45, // (default reduction)
  }
,
{ // state 170
0x80000000|1, // match move
0x80000000|201, // no-match move
0x80000000|47, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 171
0x80000000|460, // match move
0x80000000|609, // no-match move
0x80000000|47, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 172
17,311, // `)
72,578, // ")"
  }
,
{ // state 173
MIN_REDUCTION+110, // (default reduction)
  }
,
{ // state 174
0x80000000|462, // match move
0x80000000|87, // no-match move
0x80000000|47, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 175
0x80000000|1, // match move
0x80000000|270, // no-match move
0x80000000|47, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 176
0x80000000|1, // match move
0x80000000|196, // no-match move
0x80000000|47, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 177
23,MIN_REDUCTION+111, // `[
78,MIN_REDUCTION+111, // "["
MIN_REDUCTION+111, // (default reduction)
  }
,
{ // state 178
MIN_REDUCTION+95, // (default reduction)
  }
,
{ // state 179
23,MIN_REDUCTION+111, // `[
78,MIN_REDUCTION+111, // "["
MIN_REDUCTION+111, // (default reduction)
  }
,
{ // state 180
MIN_REDUCTION+110, // (default reduction)
  }
,
{ // state 181
7,238, // ID
16,379, // `(
40,2, // <cast exp>
42,428, // <exp1>
44,441, // INTLIT
45,78, // letter
46,109, // "p"
47,109, // "v"
48,109, // {"A".."Z" "a" "d" "f".."h" "j".."k" "m".."n" "q".."s" "w" "y".."z"}
49,109, // "b"
50,109, // "e"
51,109, // "t"
52,109, // "c"
53,109, // "i"
54,109, // "l"
55,109, // "o"
56,109, // "u"
57,109, // "x"
58,536, // letter128
59,29, // {199..218 231..250}
60,29, // {193..198 225..230}
62,230, // {"1".."9"}
63,368, // "0"
64,542, // digit128
65,614, // {176..185}
71,274, // "("
  }
,
{ // state 182
51,84, // "t"
  }
,
{ // state 183
MIN_REDUCTION+44, // (default reduction)
  }
,
{ // state 184
23,MIN_REDUCTION+41, // `[
78,MIN_REDUCTION+41, // "["
MIN_REDUCTION+41, // (default reduction)
  }
,
{ // state 185
-1, // $$start
-1, // <start>
-1, // ws*
-1, // <program>
-1, // <class decl>+
-1, // <class decl>
-1, // `class
265, // ID
28, // `{
-1, // <decl in class>*
94, // `}
-1, // `extends
-1, // <decl in class>
-1, // <method decl>
-1, // `public
-1, // `void
506, // `(
-1, // `)
-1, // <stmt>*
220, // <type>
235, // `int
239, // `boolean
-1, // <empty bracket pair>
-1, // `[
-1, // `]
140, // <stmt>
269, // <assign>
-1, // `;
404, // <local var decl>
567, // <exp>
-1, // `=
487, // <exp8>
337, // <exp7>
13, // <exp6>
18, // <exp5>
112, // <exp4>
-1, // `+
469, // <exp3>
-1, // `*
85, // <exp2>
260, // <cast exp>
477, // <unary exp>
97, // <exp1>
149, // `-
458, // INTLIT
572, // letter
109, // "p"
109, // "v"
109, // {"A".."Z" "a" "d" "f".."h" "j".."k" "m".."n" "q".."s" "w" "y".."z"}
109, // "b"
109, // "e"
109, // "t"
109, // "c"
109, // "i"
109, // "l"
109, // "o"
109, // "u"
109, // "x"
381, // letter128
203, // {199..218 231..250}
203, // {193..198 225..230}
-1, // digit
271, // {"1".."9"}
418, // "0"
566, // digit128
596, // {176..185}
-1, // ws
-1, // " "
-1, // {10}
91, // "#"
-1, // "*"
274, // "("
-1, // ")"
190, // "{"
573, // "}"
611, // "-"
-1, // "+"
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
{ // state 186
0x80000000|523, // match move
0x80000000|243, // no-match move
0x80000000|47, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 187
2,114, // ws*
66,165, // ws
67,574, // " "
68,101, // {10}
MIN_REDUCTION+67, // (default reduction)
  }
,
{ // state 188
MIN_REDUCTION+2, // (default reduction)
  }
,
{ // state 189
2,377, // ws*
23,MIN_REDUCTION+115, // `[
66,456, // ws
67,175, // " "
68,20, // {10}
78,MIN_REDUCTION+115, // "["
MIN_REDUCTION+115, // (default reduction)
  }
,
{ // state 190
2,545, // ws*
66,299, // ws
67,35, // " "
68,643, // {10}
MIN_REDUCTION+65, // (default reduction)
  }
,
{ // state 191
0x80000000|527, // match move
0x80000000|245, // no-match move
0x80000000|47, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 192
38,375, // `*
70,479, // "*"
MIN_REDUCTION+27, // (default reduction)
  }
,
{ // state 193
2,434, // ws*
MIN_REDUCTION+113, // (default reduction)
  }
,
{ // state 194
MIN_REDUCTION+45, // (default reduction)
  }
,
{ // state 195
MIN_REDUCTION+45, // (default reduction)
  }
,
{ // state 196
23,MIN_REDUCTION+45, // `[
78,MIN_REDUCTION+45, // "["
MIN_REDUCTION+45, // (default reduction)
  }
,
{ // state 197
0x80000000|1, // match move
0x80000000|472, // no-match move
0x80000000|47, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 198
0x80000000|1, // match move
0x80000000|651, // no-match move
0x80000000|47, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 199
2,303, // ws*
66,25, // ws
67,406, // " "
68,247, // {10}
MIN_REDUCTION+75, // (default reduction)
  }
,
{ // state 200
2,284, // ws*
  }
,
{ // state 201
23,MIN_REDUCTION+45, // `[
78,MIN_REDUCTION+45, // "["
MIN_REDUCTION+45, // (default reduction)
  }
,
{ // state 202
0x80000000|1, // match move
0x80000000|475, // no-match move
0x80000000|47, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 203
0x80000000|371, // match move
0x80000000|308, // no-match move
0x80000000|47, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 204
MIN_REDUCTION+45, // (default reduction)
  }
,
{ // state 205
0x80000000|1, // match move
0x80000000|652, // no-match move
0x80000000|47, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 206
MIN_REDUCTION+83, // (default reduction)
  }
,
{ // state 207
3,632, // <program>
4,278, // <class decl>+
5,426, // <class decl>
6,600, // `class
66,293, // ws
67,135, // " "
68,194, // {10}
69,128, // "#"
  }
,
{ // state 208
MIN_REDUCTION+5, // (default reduction)
  }
,
{ // state 209
45,649, // letter
46,76, // "p"
47,76, // "v"
48,76, // {"A".."Z" "a" "d" "f".."h" "j".."k" "m".."n" "q".."s" "w" "y".."z"}
49,76, // "b"
50,76, // "e"
51,76, // "t"
52,76, // "c"
53,76, // "i"
54,76, // "l"
55,76, // "o"
56,76, // "u"
57,76, // "x"
58,407, // letter128
59,350, // {199..218 231..250}
60,350, // {193..198 225..230}
61,294, // digit
62,255, // {"1".."9"}
63,255, // "0"
64,555, // digit128
65,267, // {176..185}
81,256, // idChar*
82,213, // $$0
87,519, // idChar
88,560, // "_"
89,374, // idChar128
90,178, // {223}
  }
,
{ // state 210
MIN_REDUCTION+18, // (default reduction)
  }
,
{ // state 211
MIN_REDUCTION+110, // (default reduction)
  }
,
{ // state 212
66,569, // ws
67,436, // " "
68,195, // {10}
MIN_REDUCTION+62, // (default reduction)
  }
,
{ // state 213
MIN_REDUCTION+83, // (default reduction)
  }
,
{ // state 214
23,MIN_REDUCTION+85, // `[
78,MIN_REDUCTION+85, // "["
MIN_REDUCTION+85, // (default reduction)
  }
,
{ // state 215
23,MIN_REDUCTION+85, // `[
78,MIN_REDUCTION+85, // "["
MIN_REDUCTION+85, // (default reduction)
  }
,
{ // state 216
2,65, // ws*
66,431, // ws
67,340, // " "
68,315, // {10}
MIN_REDUCTION+79, // (default reduction)
  }
,
{ // state 217
23,MIN_REDUCTION+80, // `[
66,174, // ws
67,10, // " "
68,113, // {10}
78,MIN_REDUCTION+80, // "["
MIN_REDUCTION+80, // (default reduction)
  }
,
{ // state 218
0x80000000|1, // match move
0x80000000|500, // no-match move
0x80000000|47, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 219
MIN_REDUCTION+45, // (default reduction)
  }
,
{ // state 220
7,535, // ID
22,283, // <empty bracket pair>
23,57, // `[
45,619, // letter
46,109, // "p"
47,109, // "v"
48,109, // {"A".."Z" "a" "d" "f".."h" "j".."k" "m".."n" "q".."s" "w" "y".."z"}
49,109, // "b"
50,109, // "e"
51,109, // "t"
52,109, // "c"
53,109, // "i"
54,109, // "l"
55,109, // "o"
56,109, // "u"
57,109, // "x"
58,432, // letter128
59,385, // {199..218 231..250}
60,385, // {193..198 225..230}
78,199, // "["
  }
,
{ // state 221
2,497, // ws*
23,MIN_REDUCTION+115, // `[
66,474, // ws
67,157, // " "
68,170, // {10}
78,MIN_REDUCTION+115, // "["
MIN_REDUCTION+115, // (default reduction)
  }
,
{ // state 222
23,MIN_REDUCTION+112, // `[
66,174, // ws
67,10, // " "
68,113, // {10}
78,MIN_REDUCTION+112, // "["
MIN_REDUCTION+112, // (default reduction)
  }
,
{ // state 223
MIN_REDUCTION+8, // (default reduction)
  }
,
{ // state 224
0x80000000|200, // match move
0x80000000|298, // no-match move
0x80000000|47, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 225
2,503, // ws*
23,MIN_REDUCTION+115, // `[
66,471, // ws
67,155, // " "
68,176, // {10}
78,MIN_REDUCTION+115, // "["
MIN_REDUCTION+115, // (default reduction)
  }
,
{ // state 226
0x80000000|1, // match move
0x80000000|641, // no-match move
0x80000000|47, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 227
MIN_REDUCTION+110, // (default reduction)
  }
,
{ // state 228
0x80000000|1, // match move
0x80000000|646, // no-match move
0x80000000|47, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 229
MIN_REDUCTION+109, // (default reduction)
  }
,
{ // state 230
61,591, // digit
62,430, // {"1".."9"}
63,430, // "0"
64,627, // digit128
65,614, // {176..185}
83,539, // digit*
84,467, // $$1
  }
,
{ // state 231
MIN_REDUCTION+45, // (default reduction)
  }
,
{ // state 232
66,100, // ws
67,40, // " "
68,242, // {10}
MIN_REDUCTION+62, // (default reduction)
  }
,
{ // state 233
66,346, // ws
67,488, // " "
68,169, // {10}
MIN_REDUCTION+60, // (default reduction)
  }
,
{ // state 234
2,329, // ws*
66,380, // ws
67,498, // " "
68,448, // {10}
MIN_REDUCTION+81, // (default reduction)
  }
,
{ // state 235
MIN_REDUCTION+11, // (default reduction)
  }
,
{ // state 236
MIN_REDUCTION+19, // (default reduction)
  }
,
{ // state 237
MIN_REDUCTION+16, // (default reduction)
  }
,
{ // state 238
0x80000000|1, // match move
0x80000000|626, // no-match move
0x80000000|47, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 239
MIN_REDUCTION+12, // (default reduction)
  }
,
{ // state 240
MIN_REDUCTION+111, // (default reduction)
  }
,
{ // state 241
2,330, // ws*
23,MIN_REDUCTION+81, // `[
66,456, // ws
67,175, // " "
68,20, // {10}
78,MIN_REDUCTION+81, // "["
MIN_REDUCTION+81, // (default reduction)
  }
,
{ // state 242
MIN_REDUCTION+45, // (default reduction)
  }
,
{ // state 243
2,63, // ws*
23,MIN_REDUCTION+77, // `[
66,471, // ws
67,155, // " "
68,176, // {10}
78,MIN_REDUCTION+77, // "["
MIN_REDUCTION+77, // (default reduction)
  }
,
{ // state 244
66,373, // ws
67,518, // " "
68,118, // {10}
MIN_REDUCTION+112, // (default reduction)
  }
,
{ // state 245
2,61, // ws*
23,MIN_REDUCTION+77, // `[
66,474, // ws
67,157, // " "
68,170, // {10}
78,MIN_REDUCTION+77, // "["
MIN_REDUCTION+77, // (default reduction)
  }
,
{ // state 246
66,373, // ws
67,518, // " "
68,118, // {10}
MIN_REDUCTION+54, // (default reduction)
  }
,
{ // state 247
MIN_REDUCTION+45, // (default reduction)
  }
,
{ // state 248
23,MIN_REDUCTION+112, // `[
66,36, // ws
67,157, // " "
68,170, // {10}
78,MIN_REDUCTION+112, // "["
MIN_REDUCTION+112, // (default reduction)
  }
,
{ // state 249
23,MIN_REDUCTION+45, // `[
78,MIN_REDUCTION+45, // "["
MIN_REDUCTION+45, // (default reduction)
  }
,
{ // state 250
MIN_REDUCTION+111, // (default reduction)
  }
,
{ // state 251
MIN_REDUCTION+93, // (default reduction)
  }
,
{ // state 252
23,MIN_REDUCTION+112, // `[
66,33, // ws
67,155, // " "
68,176, // {10}
78,MIN_REDUCTION+112, // "["
MIN_REDUCTION+112, // (default reduction)
  }
,
{ // state 253
0x80000000|351, // match move
0x80000000|305, // no-match move
0x80000000|47, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 254
66,571, // ws
67,384, // " "
68,231, // {10}
MIN_REDUCTION+80, // (default reduction)
  }
,
{ // state 255
MIN_REDUCTION+42, // (default reduction)
  }
,
{ // state 256
45,649, // letter
46,76, // "p"
47,76, // "v"
48,76, // {"A".."Z" "a" "d" "f".."h" "j".."k" "m".."n" "q".."s" "w" "y".."z"}
49,76, // "b"
50,76, // "e"
51,76, // "t"
52,76, // "c"
53,76, // "i"
54,76, // "l"
55,76, // "o"
56,76, // "u"
57,76, // "x"
58,407, // letter128
59,350, // {199..218 231..250}
60,350, // {193..198 225..230}
61,294, // digit
62,255, // {"1".."9"}
63,255, // "0"
64,555, // digit128
65,267, // {176..185}
82,622, // $$0
87,589, // idChar
88,560, // "_"
89,374, // idChar128
90,178, // {223}
  }
,
{ // state 257
MIN_REDUCTION+21, // (default reduction)
  }
,
{ // state 258
MIN_REDUCTION+31, // (default reduction)
  }
,
{ // state 259
0x80000000|166, // match move
0x80000000|414, // no-match move
0x80000000|47, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 260
MIN_REDUCTION+31, // (default reduction)
  }
,
{ // state 261
MIN_REDUCTION+82, // (default reduction)
  }
,
{ // state 262
23,MIN_REDUCTION+45, // `[
78,MIN_REDUCTION+45, // "["
MIN_REDUCTION+45, // (default reduction)
  }
,
{ // state 263
0x80000000|166, // match move
0x80000000|410, // no-match move
0x80000000|47, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 264
MIN_REDUCTION+94, // (default reduction)
  }
,
{ // state 265
0x80000000|464, // match move
0x80000000|412, // no-match move
0x80000000|47, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 266
66,537, // ws
67,360, // " "
68,287, // {10}
MIN_REDUCTION+80, // (default reduction)
  }
,
{ // state 267
MIN_REDUCTION+43, // (default reduction)
  }
,
{ // state 268
MIN_REDUCTION+82, // (default reduction)
  }
,
{ // state 269
27,237, // `;
80,216, // ";"
  }
,
{ // state 270
23,MIN_REDUCTION+44, // `[
78,MIN_REDUCTION+44, // "["
MIN_REDUCTION+44, // (default reduction)
  }
,
{ // state 271
61,591, // digit
62,430, // {"1".."9"}
63,430, // "0"
64,593, // digit128
65,596, // {176..185}
83,645, // digit*
84,492, // $$1
  }
,
{ // state 272
61,591, // digit
62,430, // {"1".."9"}
63,430, // "0"
64,598, // digit128
65,597, // {176..185}
83,640, // digit*
84,489, // $$1
  }
,
{ // state 273
23,MIN_REDUCTION+95, // `[
78,MIN_REDUCTION+95, // "["
MIN_REDUCTION+95, // (default reduction)
  }
,
{ // state 274
2,233, // ws*
66,125, // ws
67,488, // " "
68,169, // {10}
MIN_REDUCTION+61, // (default reduction)
  }
,
{ // state 275
66,281, // ws
67,183, // " "
68,204, // {10}
MIN_REDUCTION+58, // (default reduction)
  }
,
{ // state 276
23,MIN_REDUCTION+95, // `[
78,MIN_REDUCTION+95, // "["
MIN_REDUCTION+95, // (default reduction)
  }
,
{ // state 277
MIN_REDUCTION+44, // (default reduction)
  }
,
{ // state 278
5,229, // <class decl>
6,600, // `class
69,128, // "#"
MIN_REDUCTION+3, // (default reduction)
  }
,
{ // state 279
51,494, // "t"
  }
,
{ // state 280
23,MIN_REDUCTION+82, // `[
78,MIN_REDUCTION+82, // "["
MIN_REDUCTION+82, // (default reduction)
  }
,
{ // state 281
MIN_REDUCTION+110, // (default reduction)
  }
,
{ // state 282
0x80000000|1, // match move
0x80000000|312, // no-match move
0x80000000|47, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 283
MIN_REDUCTION+14, // (default reduction)
  }
,
{ // state 284
0x80000000|1, // match move
0x80000000|27, // no-match move
0x80000000|47, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 285
0x80000000|1, // match move
0x80000000|288, // no-match move
0x80000000|47, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 286
MIN_REDUCTION+45, // (default reduction)
  }
,
{ // state 287
MIN_REDUCTION+45, // (default reduction)
  }
,
{ // state 288
23,MIN_REDUCTION+80, // `[
66,33, // ws
67,155, // " "
68,176, // {10}
78,MIN_REDUCTION+80, // "["
MIN_REDUCTION+80, // (default reduction)
  }
,
{ // state 289
45,649, // letter
46,76, // "p"
47,76, // "v"
48,76, // {"A".."Z" "a" "d" "f".."h" "j".."k" "m".."n" "q".."s" "w" "y".."z"}
49,76, // "b"
50,76, // "e"
51,76, // "t"
52,76, // "c"
53,76, // "i"
54,76, // "l"
55,76, // "o"
56,76, // "u"
57,76, // "x"
58,383, // letter128
59,44, // {199..218 231..250}
60,44, // {193..198 225..230}
61,294, // digit
62,255, // {"1".."9"}
63,255, // "0"
64,104, // digit128
65,597, // {176..185}
81,158, // idChar*
82,318, // $$0
87,519, // idChar
88,560, // "_"
89,11, // idChar128
90,103, // {223}
  }
,
{ // state 290
MIN_REDUCTION+43, // (default reduction)
  }
,
{ // state 291
94,MIN_REDUCTION+111, // $NT
MIN_REDUCTION+111, // (default reduction)
  }
,
{ // state 292
MIN_REDUCTION+31, // (default reduction)
  }
,
{ // state 293
MIN_REDUCTION+110, // (default reduction)
  }
,
{ // state 294
MIN_REDUCTION+91, // (default reduction)
  }
,
{ // state 295
45,649, // letter
46,76, // "p"
47,76, // "v"
48,76, // {"A".."Z" "a" "d" "f".."h" "j".."k" "m".."n" "q".."s" "w" "y".."z"}
49,76, // "b"
50,76, // "e"
51,76, // "t"
52,76, // "c"
53,76, // "i"
54,76, // "l"
55,76, // "o"
56,76, // "u"
57,76, // "x"
58,378, // letter128
59,46, // {199..218 231..250}
60,46, // {193..198 225..230}
61,294, // digit
62,255, // {"1".."9"}
63,255, // "0"
64,107, // digit128
65,596, // {176..185}
81,156, // idChar*
82,314, // $$0
87,519, // idChar
88,560, // "_"
89,16, // idChar128
90,106, // {223}
  }
,
{ // state 296
47,642, // "v"
  }
,
{ // state 297
23,MIN_REDUCTION+44, // `[
78,MIN_REDUCTION+44, // "["
MIN_REDUCTION+44, // (default reduction)
  }
,
{ // state 298
2,284, // ws*
23,MIN_REDUCTION+77, // `[
66,456, // ws
67,175, // " "
68,20, // {10}
78,MIN_REDUCTION+77, // "["
MIN_REDUCTION+77, // (default reduction)
  }
,
{ // state 299
MIN_REDUCTION+111, // (default reduction)
  }
,
{ // state 300
23,MIN_REDUCTION+44, // `[
78,MIN_REDUCTION+44, // "["
MIN_REDUCTION+44, // (default reduction)
  }
,
{ // state 301
23,MIN_REDUCTION+110, // `[
78,MIN_REDUCTION+110, // "["
MIN_REDUCTION+110, // (default reduction)
  }
,
{ // state 302
2,167, // ws*
66,547, // ws
67,583, // " "
68,12, // {10}
MIN_REDUCTION+51, // (default reduction)
  }
,
{ // state 303
66,558, // ws
67,406, // " "
68,247, // {10}
MIN_REDUCTION+74, // (default reduction)
  }
,
{ // state 304
MIN_REDUCTION+45, // (default reduction)
  }
,
{ // state 305
23,MIN_REDUCTION+95, // `[
78,MIN_REDUCTION+95, // "["
MIN_REDUCTION+95, // (default reduction)
  }
,
{ // state 306
MIN_REDUCTION+45, // (default reduction)
  }
,
{ // state 307
MIN_REDUCTION+111, // (default reduction)
  }
,
{ // state 308
23,MIN_REDUCTION+41, // `[
78,MIN_REDUCTION+41, // "["
MIN_REDUCTION+41, // (default reduction)
  }
,
{ // state 309
MIN_REDUCTION+110, // (default reduction)
  }
,
{ // state 310
MIN_REDUCTION+111, // (default reduction)
  }
,
{ // state 311
8,142, // `{
73,190, // "{"
  }
,
{ // state 312
23,MIN_REDUCTION+80, // `[
66,36, // ws
67,157, // " "
68,170, // {10}
78,MIN_REDUCTION+80, // "["
MIN_REDUCTION+80, // (default reduction)
  }
,
{ // state 313
94,MIN_REDUCTION+44, // $NT
MIN_REDUCTION+44, // (default reduction)
  }
,
{ // state 314
0x80000000|1, // match move
0x80000000|102, // no-match move
0x80000000|47, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 315
MIN_REDUCTION+45, // (default reduction)
  }
,
{ // state 316
MIN_REDUCTION+44, // (default reduction)
  }
,
{ // state 317
23,MIN_REDUCTION+114, // `[
66,33, // ws
67,155, // " "
68,176, // {10}
78,MIN_REDUCTION+114, // "["
MIN_REDUCTION+114, // (default reduction)
  }
,
{ // state 318
0x80000000|1, // match move
0x80000000|105, // no-match move
0x80000000|47, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 319
8,453, // `{
11,553, // `extends
69,445, // "#"
73,394, // "{"
  }
,
{ // state 320
49,37, // "b"
53,279, // "i"
  }
,
{ // state 321
23,MIN_REDUCTION+114, // `[
66,36, // ws
67,157, // " "
68,170, // {10}
78,MIN_REDUCTION+114, // "["
MIN_REDUCTION+114, // (default reduction)
  }
,
{ // state 322
23,MIN_REDUCTION+110, // `[
78,MIN_REDUCTION+110, // "["
MIN_REDUCTION+110, // (default reduction)
  }
,
{ // state 323
66,227, // ws
67,415, // " "
68,413, // {10}
MIN_REDUCTION+68, // (default reduction)
  }
,
{ // state 324
15,592, // `void
69,296, // "#"
  }
,
{ // state 325
23,MIN_REDUCTION+95, // `[
78,MIN_REDUCTION+95, // "["
MIN_REDUCTION+95, // (default reduction)
  }
,
{ // state 326
MIN_REDUCTION+110, // (default reduction)
  }
,
{ // state 327
23,MIN_REDUCTION+110, // `[
78,MIN_REDUCTION+110, // "["
MIN_REDUCTION+110, // (default reduction)
  }
,
{ // state 328
MIN_REDUCTION+44, // (default reduction)
  }
,
{ // state 329
66,211, // ws
67,498, // " "
68,448, // {10}
MIN_REDUCTION+80, // (default reduction)
  }
,
{ // state 330
0x80000000|1, // match move
0x80000000|335, // no-match move
0x80000000|47, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 331
0x80000000|532, // match move
0x80000000|411, // no-match move
0x80000000|47, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 332
MIN_REDUCTION+23, // (default reduction)
  }
,
{ // state 333
0x80000000|1, // match move
0x80000000|132, // no-match move
0x80000000|47, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 334
2,434, // ws*
23,MIN_REDUCTION+113, // `[
66,124, // ws
67,10, // " "
68,113, // {10}
78,MIN_REDUCTION+113, // "["
MIN_REDUCTION+113, // (default reduction)
  }
,
{ // state 335
23,MIN_REDUCTION+80, // `[
66,56, // ws
67,175, // " "
68,20, // {10}
78,MIN_REDUCTION+80, // "["
MIN_REDUCTION+80, // (default reduction)
  }
,
{ // state 336
MIN_REDUCTION+43, // (default reduction)
  }
,
{ // state 337
MIN_REDUCTION+23, // (default reduction)
  }
,
{ // state 338
94,MIN_REDUCTION+45, // $NT
MIN_REDUCTION+45, // (default reduction)
  }
,
{ // state 339
23,MIN_REDUCTION+43, // `[
78,MIN_REDUCTION+43, // "["
MIN_REDUCTION+43, // (default reduction)
  }
,
{ // state 340
MIN_REDUCTION+44, // (default reduction)
  }
,
{ // state 341
MIN_REDUCTION+111, // (default reduction)
  }
,
{ // state 342
23,MIN_REDUCTION+43, // `[
78,MIN_REDUCTION+43, // "["
MIN_REDUCTION+43, // (default reduction)
  }
,
{ // state 343
66,348, // ws
67,50, // " "
68,580, // {10}
MIN_REDUCTION+76, // (default reduction)
  }
,
{ // state 344
MIN_REDUCTION+93, // (default reduction)
  }
,
{ // state 345
23,MIN_REDUCTION+93, // `[
78,MIN_REDUCTION+93, // "["
MIN_REDUCTION+93, // (default reduction)
  }
,
{ // state 346
MIN_REDUCTION+110, // (default reduction)
  }
,
{ // state 347
MIN_REDUCTION+24, // (default reduction)
  }
,
{ // state 348
MIN_REDUCTION+110, // (default reduction)
  }
,
{ // state 349
MIN_REDUCTION+25, // (default reduction)
  }
,
{ // state 350
MIN_REDUCTION+41, // (default reduction)
  }
,
{ // state 351
MIN_REDUCTION+95, // (default reduction)
  }
,
{ // state 352
MIN_REDUCTION+45, // (default reduction)
  }
,
{ // state 353
MIN_REDUCTION+45, // (default reduction)
  }
,
{ // state 354
MIN_REDUCTION+111, // (default reduction)
  }
,
{ // state 355
66,571, // ws
67,384, // " "
68,231, // {10}
MIN_REDUCTION+112, // (default reduction)
  }
,
{ // state 356
MIN_REDUCTION+41, // (default reduction)
  }
,
{ // state 357
MIN_REDUCTION+111, // (default reduction)
  }
,
{ // state 358
MIN_REDUCTION+44, // (default reduction)
  }
,
{ // state 359
MIN_REDUCTION+45, // (default reduction)
  }
,
{ // state 360
MIN_REDUCTION+44, // (default reduction)
  }
,
{ // state 361
MIN_REDUCTION+41, // (default reduction)
  }
,
{ // state 362
MIN_REDUCTION+95, // (default reduction)
  }
,
{ // state 363
23,MIN_REDUCTION+43, // `[
78,MIN_REDUCTION+43, // "["
MIN_REDUCTION+43, // (default reduction)
  }
,
{ // state 364
66,570, // ws
67,340, // " "
68,315, // {10}
MIN_REDUCTION+66, // (default reduction)
  }
,
{ // state 365
66,180, // ws
67,316, // " "
68,352, // {10}
MIN_REDUCTION+72, // (default reduction)
  }
,
{ // state 366
MIN_REDUCTION+95, // (default reduction)
  }
,
{ // state 367
MIN_REDUCTION+100, // (default reduction)
  }
,
{ // state 368
46,405, // "p"
47,405, // "v"
48,405, // {"A".."Z" "a" "d" "f".."h" "j".."k" "m".."n" "q".."s" "w" "y".."z"}
49,405, // "b"
50,405, // "e"
51,405, // "t"
52,405, // "c"
53,405, // "i"
54,405, // "l"
55,405, // "o"
56,405, // "u"
57,405, // "x"
60,75, // {193..198 225..230}
62,405, // {"1".."9"}
63,405, // "0"
65,75, // {176..185}
85,48, // hexDigit*
86,369, // $$2
91,556, // hexDigit
92,594, // hexDigit128
  }
,
{ // state 369
0x80000000|1, // match move
0x80000000|655, // no-match move
0x80000000|47, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 370
MIN_REDUCTION+43, // (default reduction)
  }
,
{ // state 371
MIN_REDUCTION+41, // (default reduction)
  }
,
{ // state 372
45,649, // letter
46,76, // "p"
47,76, // "v"
48,76, // {"A".."Z" "a" "d" "f".."h" "j".."k" "m".."n" "q".."s" "w" "y".."z"}
49,76, // "b"
50,76, // "e"
51,76, // "t"
52,76, // "c"
53,76, // "i"
54,76, // "l"
55,76, // "o"
56,76, // "u"
57,76, // "x"
58,60, // letter128
59,440, // {199..218 231..250}
60,440, // {193..198 225..230}
61,294, // digit
62,255, // {"1".."9"}
63,255, // "0"
64,653, // digit128
65,290, // {176..185}
82,261, // $$0
87,589, // idChar
88,560, // "_"
89,159, // idChar128
90,362, // {223}
  }
,
{ // state 373
MIN_REDUCTION+110, // (default reduction)
  }
,
{ // state 374
2,244, // ws*
66,250, // ws
67,518, // " "
68,118, // {10}
MIN_REDUCTION+113, // (default reduction)
  }
,
{ // state 375
7,238, // ID
16,379, // `(
39,579, // <exp2>
40,292, // <cast exp>
41,508, // <unary exp>
42,148, // <exp1>
43,168, // `-
44,441, // INTLIT
45,78, // letter
46,109, // "p"
47,109, // "v"
48,109, // {"A".."Z" "a" "d" "f".."h" "j".."k" "m".."n" "q".."s" "w" "y".."z"}
49,109, // "b"
50,109, // "e"
51,109, // "t"
52,109, // "c"
53,109, // "i"
54,109, // "l"
55,109, // "o"
56,109, // "u"
57,109, // "x"
58,536, // letter128
59,29, // {199..218 231..250}
60,29, // {193..198 225..230}
62,230, // {"1".."9"}
63,368, // "0"
64,542, // digit128
65,614, // {176..185}
71,274, // "("
75,611, // "-"
  }
,
{ // state 376
2,120, // ws*
66,310, // ws
67,316, // " "
68,352, // {10}
MIN_REDUCTION+75, // (default reduction)
  }
,
{ // state 377
0x80000000|1, // match move
0x80000000|6, // no-match move
0x80000000|47, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 378
0x80000000|344, // match move
0x80000000|31, // no-match move
0x80000000|47, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 379
7,446, // ID
19,509, // <type>
20,395, // `int
21,139, // `boolean
45,209, // letter
46,109, // "p"
47,109, // "v"
48,109, // {"A".."Z" "a" "d" "f".."h" "j".."k" "m".."n" "q".."s" "w" "y".."z"}
49,109, // "b"
50,109, // "e"
51,109, // "t"
52,109, // "c"
53,109, // "i"
54,109, // "l"
55,109, // "o"
56,109, // "u"
57,109, // "x"
58,151, // letter128
59,350, // {199..218 231..250}
60,350, // {193..198 225..230}
69,320, // "#"
  }
,
{ // state 380
MIN_REDUCTION+111, // (default reduction)
  }
,
{ // state 381
0x80000000|163, // match move
0x80000000|19, // no-match move
0x80000000|47, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 382
17,134, // `)
22,393, // <empty bracket pair>
23,654, // `[
72,455, // ")"
78,199, // "["
  }
,
{ // state 383
0x80000000|344, // match move
0x80000000|34, // no-match move
0x80000000|47, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 384
MIN_REDUCTION+44, // (default reduction)
  }
,
{ // state 385
MIN_REDUCTION+41, // (default reduction)
  }
,
{ // state 386
17,92, // `)
22,393, // <empty bracket pair>
23,654, // `[
72,455, // ")"
78,199, // "["
  }
,
{ // state 387
MIN_REDUCTION+98, // (default reduction)
  }
,
{ // state 388
0x80000000|1, // match move
0x80000000|442, // no-match move
0x80000000|47, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 389
0x80000000|1, // match move
0x80000000|438, // no-match move
0x80000000|47, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 390
7,238, // ID
16,379, // `(
29,648, // <exp>
31,515, // <exp8>
32,3, // <exp7>
33,347, // <exp6>
34,349, // <exp5>
35,74, // <exp4>
37,522, // <exp3>
39,58, // <exp2>
40,292, // <cast exp>
41,508, // <unary exp>
42,148, // <exp1>
43,168, // `-
44,441, // INTLIT
45,78, // letter
46,109, // "p"
47,109, // "v"
48,109, // {"A".."Z" "a" "d" "f".."h" "j".."k" "m".."n" "q".."s" "w" "y".."z"}
49,109, // "b"
50,109, // "e"
51,109, // "t"
52,109, // "c"
53,109, // "i"
54,109, // "l"
55,109, // "o"
56,109, // "u"
57,109, // "x"
58,536, // letter128
59,29, // {199..218 231..250}
60,29, // {193..198 225..230}
62,230, // {"1".."9"}
63,368, // "0"
64,542, // digit128
65,614, // {176..185}
71,274, // "("
75,611, // "-"
  }
,
{ // state 391
0x80000000|1, // match move
0x80000000|23, // no-match move
0x80000000|47, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 392
7,226, // ID
16,511, // `(
29,26, // <exp>
31,493, // <exp8>
32,332, // <exp7>
33,17, // <exp6>
34,15, // <exp5>
35,154, // <exp4>
37,468, // <exp3>
39,88, // <exp2>
40,258, // <cast exp>
41,480, // <unary exp>
42,127, // <exp1>
43,143, // `-
44,461, // INTLIT
45,289, // letter
46,109, // "p"
47,109, // "v"
48,109, // {"A".."Z" "a" "d" "f".."h" "j".."k" "m".."n" "q".."s" "w" "y".."z"}
49,109, // "b"
50,109, // "e"
51,109, // "t"
52,109, // "c"
53,109, // "i"
54,109, // "l"
55,109, // "o"
56,109, // "u"
57,109, // "x"
58,562, // letter128
59,44, // {199..218 231..250}
60,44, // {193..198 225..230}
62,272, // {"1".."9"}
63,417, // "0"
64,568, // digit128
65,597, // {176..185}
71,274, // "("
75,611, // "-"
  }
,
{ // state 393
MIN_REDUCTION+14, // (default reduction)
  }
,
{ // state 394
2,39, // ws*
66,354, // ws
67,277, // " "
68,306, // {10}
MIN_REDUCTION+65, // (default reduction)
  }
,
{ // state 395
MIN_REDUCTION+11, // (default reduction)
  }
,
{ // state 396
0x80000000|1, // match move
0x80000000|21, // no-match move
0x80000000|47, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 397
66,537, // ws
67,360, // " "
68,287, // {10}
MIN_REDUCTION+112, // (default reduction)
  }
,
{ // state 398
2,541, // ws*
23,MIN_REDUCTION+113, // `[
66,471, // ws
67,155, // " "
68,176, // {10}
78,MIN_REDUCTION+113, // "["
MIN_REDUCTION+113, // (default reduction)
  }
,
{ // state 399
45,649, // letter
46,76, // "p"
47,76, // "v"
48,76, // {"A".."Z" "a" "d" "f".."h" "j".."k" "m".."n" "q".."s" "w" "y".."z"}
49,76, // "b"
50,76, // "e"
51,76, // "t"
52,76, // "c"
53,76, // "i"
54,76, // "l"
55,76, // "o"
56,76, // "u"
57,76, // "x"
58,60, // letter128
59,440, // {199..218 231..250}
60,440, // {193..198 225..230}
61,294, // digit
62,255, // {"1".."9"}
63,255, // "0"
64,653, // digit128
65,290, // {176..185}
81,372, // idChar*
82,99, // $$0
87,519, // idChar
88,560, // "_"
89,159, // idChar128
90,362, // {223}
  }
,
{ // state 400
2,636, // ws*
66,547, // ws
67,583, // " "
68,12, // {10}
MIN_REDUCTION+49, // (default reduction)
  }
,
{ // state 401
23,MIN_REDUCTION+86, // `[
66,56, // ws
67,175, // " "
68,20, // {10}
78,MIN_REDUCTION+86, // "["
MIN_REDUCTION+86, // (default reduction)
  }
,
{ // state 402
2,152, // ws*
  }
,
{ // state 403
2,540, // ws*
23,MIN_REDUCTION+113, // `[
66,474, // ws
67,157, // " "
68,170, // {10}
78,MIN_REDUCTION+113, // "["
MIN_REDUCTION+113, // (default reduction)
  }
,
{ // state 404
27,236, // `;
80,216, // ";"
  }
,
{ // state 405
MIN_REDUCTION+96, // (default reduction)
  }
,
{ // state 406
MIN_REDUCTION+44, // (default reduction)
  }
,
{ // state 407
MIN_REDUCTION+93, // (default reduction)
  }
,
{ // state 408
MIN_REDUCTION+95, // (default reduction)
  }
,
{ // state 409
66,373, // ws
67,518, // " "
68,118, // {10}
MIN_REDUCTION+80, // (default reduction)
  }
,
{ // state 410
23,MIN_REDUCTION+97, // `[
78,MIN_REDUCTION+97, // "["
MIN_REDUCTION+97, // (default reduction)
  }
,
{ // state 411
23,MIN_REDUCTION+83, // `[
78,MIN_REDUCTION+83, // "["
MIN_REDUCTION+83, // (default reduction)
  }
,
{ // state 412
23,MIN_REDUCTION+37, // `[
30,MIN_REDUCTION+37, // `=
36,MIN_REDUCTION+37, // `+
38,MIN_REDUCTION+37, // `*
70,MIN_REDUCTION+37, // "*"
76,MIN_REDUCTION+37, // "+"
77,MIN_REDUCTION+37, // "="
78,MIN_REDUCTION+37, // "["
MIN_REDUCTION+13, // (default reduction)
  }
,
{ // state 413
MIN_REDUCTION+45, // (default reduction)
  }
,
{ // state 414
23,MIN_REDUCTION+97, // `[
78,MIN_REDUCTION+97, // "["
MIN_REDUCTION+97, // (default reduction)
  }
,
{ // state 415
MIN_REDUCTION+44, // (default reduction)
  }
,
{ // state 416
7,238, // ID
16,379, // `(
29,595, // <exp>
31,515, // <exp8>
32,3, // <exp7>
33,347, // <exp6>
34,349, // <exp5>
35,74, // <exp4>
37,522, // <exp3>
39,58, // <exp2>
40,292, // <cast exp>
41,508, // <unary exp>
42,148, // <exp1>
43,168, // `-
44,441, // INTLIT
45,78, // letter
46,109, // "p"
47,109, // "v"
48,109, // {"A".."Z" "a" "d" "f".."h" "j".."k" "m".."n" "q".."s" "w" "y".."z"}
49,109, // "b"
50,109, // "e"
51,109, // "t"
52,109, // "c"
53,109, // "i"
54,109, // "l"
55,109, // "o"
56,109, // "u"
57,109, // "x"
58,536, // letter128
59,29, // {199..218 231..250}
60,29, // {193..198 225..230}
62,230, // {"1".."9"}
63,368, // "0"
64,542, // digit128
65,614, // {176..185}
71,274, // "("
75,611, // "-"
  }
,
{ // state 417
46,405, // "p"
47,405, // "v"
48,405, // {"A".."Z" "a" "d" "f".."h" "j".."k" "m".."n" "q".."s" "w" "y".."z"}
49,405, // "b"
50,405, // "e"
51,405, // "t"
52,405, // "c"
53,405, // "i"
54,405, // "l"
55,405, // "o"
56,405, // "u"
57,405, // "x"
60,263, // {193..198 225..230}
62,405, // {"1".."9"}
63,405, // "0"
65,263, // {176..185}
85,116, // hexDigit*
86,391, // $$2
91,556, // hexDigit
92,62, // hexDigit128
  }
,
{ // state 418
46,405, // "p"
47,405, // "v"
48,405, // {"A".."Z" "a" "d" "f".."h" "j".."k" "m".."n" "q".."s" "w" "y".."z"}
49,405, // "b"
50,405, // "e"
51,405, // "t"
52,405, // "c"
53,405, // "i"
54,405, // "l"
55,405, // "o"
56,405, // "u"
57,405, // "x"
60,259, // {193..198 225..230}
62,405, // {"1".."9"}
63,405, // "0"
65,259, // {176..185}
85,117, // hexDigit*
86,396, // $$2
91,556, // hexDigit
92,53, // hexDigit128
  }
,
{ // state 419
7,238, // ID
16,379, // `(
29,603, // <exp>
31,515, // <exp8>
32,3, // <exp7>
33,347, // <exp6>
34,349, // <exp5>
35,74, // <exp4>
37,522, // <exp3>
39,58, // <exp2>
40,292, // <cast exp>
41,508, // <unary exp>
42,148, // <exp1>
43,168, // `-
44,441, // INTLIT
45,78, // letter
46,109, // "p"
47,109, // "v"
48,109, // {"A".."Z" "a" "d" "f".."h" "j".."k" "m".."n" "q".."s" "w" "y".."z"}
49,109, // "b"
50,109, // "e"
51,109, // "t"
52,109, // "c"
53,109, // "i"
54,109, // "l"
55,109, // "o"
56,109, // "u"
57,109, // "x"
58,536, // letter128
59,29, // {199..218 231..250}
60,29, // {193..198 225..230}
62,230, // {"1".."9"}
63,368, // "0"
64,542, // digit128
65,614, // {176..185}
71,274, // "("
75,611, // "-"
  }
,
{ // state 420
66,481, // ws
67,313, // " "
68,338, // {10}
94,MIN_REDUCTION+76, // $NT
  }
,
{ // state 421
MIN_REDUCTION+111, // (default reduction)
  }
,
{ // state 422
2,541, // ws*
  }
,
{ // state 423
54,400, // "l"
  }
,
{ // state 424
2,540, // ws*
  }
,
{ // state 425
MIN_REDUCTION+94, // (default reduction)
  }
,
{ // state 426
MIN_REDUCTION+108, // (default reduction)
  }
,
{ // state 427
2,466, // ws*
66,250, // ws
67,518, // " "
68,118, // {10}
MIN_REDUCTION+77, // (default reduction)
  }
,
{ // state 428
0x80000000|1, // match move
0x80000000|470, // no-match move
0x80000000|47, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 429
23,MIN_REDUCTION+97, // `[
78,MIN_REDUCTION+97, // "["
MIN_REDUCTION+97, // (default reduction)
  }
,
{ // state 430
MIN_REDUCTION+42, // (default reduction)
  }
,
{ // state 431
MIN_REDUCTION+111, // (default reduction)
  }
,
{ // state 432
2,254, // ws*
66,42, // ws
67,384, // " "
68,231, // {10}
MIN_REDUCTION+81, // (default reduction)
  }
,
{ // state 433
7,226, // ID
16,511, // `(
39,544, // <exp2>
40,258, // <cast exp>
41,480, // <unary exp>
42,127, // <exp1>
43,143, // `-
44,461, // INTLIT
45,289, // letter
46,109, // "p"
47,109, // "v"
48,109, // {"A".."Z" "a" "d" "f".."h" "j".."k" "m".."n" "q".."s" "w" "y".."z"}
49,109, // "b"
50,109, // "e"
51,109, // "t"
52,109, // "c"
53,109, // "i"
54,109, // "l"
55,109, // "o"
56,109, // "u"
57,109, // "x"
58,562, // letter128
59,44, // {199..218 231..250}
60,44, // {193..198 225..230}
62,272, // {"1".."9"}
63,417, // "0"
64,568, // digit128
65,597, // {176..185}
71,274, // "("
75,611, // "-"
  }
,
{ // state 434
0x80000000|644, // match move
0x80000000|222, // no-match move
0x80000000|47, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 435
MIN_REDUCTION+95, // (default reduction)
  }
,
{ // state 436
MIN_REDUCTION+44, // (default reduction)
  }
,
{ // state 437
MIN_REDUCTION+111, // (default reduction)
  }
,
{ // state 438
23,416, // `[
78,376, // "["
MIN_REDUCTION+34, // (default reduction)
  }
,
{ // state 439
7,228, // ID
16,506, // `(
39,543, // <exp2>
40,260, // <cast exp>
41,477, // <unary exp>
42,97, // <exp1>
43,149, // `-
44,458, // INTLIT
45,295, // letter
46,109, // "p"
47,109, // "v"
48,109, // {"A".."Z" "a" "d" "f".."h" "j".."k" "m".."n" "q".."s" "w" "y".."z"}
49,109, // "b"
50,109, // "e"
51,109, // "t"
52,109, // "c"
53,109, // "i"
54,109, // "l"
55,109, // "o"
56,109, // "u"
57,109, // "x"
58,561, // letter128
59,46, // {199..218 231..250}
60,46, // {193..198 225..230}
62,271, // {"1".."9"}
63,418, // "0"
64,566, // digit128
65,596, // {176..185}
71,274, // "("
75,611, // "-"
  }
,
{ // state 440
MIN_REDUCTION+41, // (default reduction)
  }
,
{ // state 441
0x80000000|1, // match move
0x80000000|526, // no-match move
0x80000000|47, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 442
23,419, // `[
78,376, // "["
MIN_REDUCTION+34, // (default reduction)
  }
,
{ // state 443
9,136, // <decl in class>*
10,71, // `}
12,621, // <decl in class>
13,223, // <method decl>
14,324, // `public
69,577, // "#"
74,14, // "}"
  }
,
{ // state 444
23,MIN_REDUCTION+86, // `[
66,33, // ws
67,155, // " "
68,176, // {10}
78,MIN_REDUCTION+86, // "["
MIN_REDUCTION+86, // (default reduction)
  }
,
{ // state 445
50,150, // "e"
  }
,
{ // state 446
MIN_REDUCTION+13, // (default reduction)
  }
,
{ // state 447
0x80000000|1, // match move
0x80000000|585, // no-match move
0x80000000|47, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 448
MIN_REDUCTION+45, // (default reduction)
  }
,
{ // state 449
0x80000000|1, // match move
0x80000000|582, // no-match move
0x80000000|47, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 450
66,569, // ws
67,436, // " "
68,195, // {10}
MIN_REDUCTION+112, // (default reduction)
  }
,
{ // state 451
MIN_REDUCTION+6, // (default reduction)
  }
,
{ // state 452
24,41, // `]
79,581, // "]"
  }
,
{ // state 453
9,483, // <decl in class>*
10,208, // `}
12,621, // <decl in class>
13,223, // <method decl>
14,324, // `public
69,577, // "#"
74,14, // "}"
  }
,
{ // state 454
2,285, // ws*
  }
,
{ // state 455
2,232, // ws*
66,587, // ws
67,40, // " "
68,242, // {10}
MIN_REDUCTION+63, // (default reduction)
  }
,
{ // state 456
0x80000000|1, // match move
0x80000000|160, // no-match move
0x80000000|47, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 457
2,282, // ws*
  }
,
{ // state 458
0x80000000|1, // match move
0x80000000|499, // no-match move
0x80000000|47, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 459
23,MIN_REDUCTION+86, // `[
66,36, // ws
67,157, // " "
68,170, // {10}
78,MIN_REDUCTION+86, // "["
MIN_REDUCTION+86, // (default reduction)
  }
,
{ // state 460
MIN_REDUCTION+43, // (default reduction)
  }
,
{ // state 461
0x80000000|1, // match move
0x80000000|496, // no-match move
0x80000000|47, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 462
MIN_REDUCTION+110, // (default reduction)
  }
,
{ // state 463
2,95, // ws*
66,250, // ws
67,518, // " "
68,118, // {10}
MIN_REDUCTION+47, // (default reduction)
  }
,
{ // state 464
MIN_REDUCTION+13, // (default reduction)
  }
,
{ // state 465
2,266, // ws*
66,81, // ws
67,360, // " "
68,287, // {10}
MIN_REDUCTION+81, // (default reduction)
  }
,
{ // state 466
66,373, // ws
67,518, // " "
68,118, // {10}
MIN_REDUCTION+76, // (default reduction)
  }
,
{ // state 467
0x80000000|1, // match move
0x80000000|495, // no-match move
0x80000000|47, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 468
38,433, // `*
70,479, // "*"
MIN_REDUCTION+28, // (default reduction)
  }
,
{ // state 469
38,439, // `*
70,479, // "*"
MIN_REDUCTION+28, // (default reduction)
  }
,
{ // state 470
23,390, // `[
78,376, // "["
MIN_REDUCTION+34, // (default reduction)
  }
,
{ // state 471
0x80000000|1, // match move
0x80000000|179, // no-match move
0x80000000|47, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 472
23,MIN_REDUCTION+84, // `[
78,MIN_REDUCTION+84, // "["
MIN_REDUCTION+84, // (default reduction)
  }
,
{ // state 473
2,602, // ws*
66,547, // ws
67,583, // " "
68,12, // {10}
MIN_REDUCTION+53, // (default reduction)
  }
,
{ // state 474
0x80000000|1, // match move
0x80000000|177, // no-match move
0x80000000|47, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 475
23,MIN_REDUCTION+84, // `[
78,MIN_REDUCTION+84, // "["
MIN_REDUCTION+84, // (default reduction)
  }
,
{ // state 476
2,377, // ws*
  }
,
{ // state 477
MIN_REDUCTION+32, // (default reduction)
  }
,
{ // state 478
56,601, // "u"
  }
,
{ // state 479
2,275, // ws*
66,421, // ws
67,183, // " "
68,204, // {10}
MIN_REDUCTION+59, // (default reduction)
  }
,
{ // state 480
MIN_REDUCTION+32, // (default reduction)
  }
,
{ // state 481
94,MIN_REDUCTION+110, // $NT
MIN_REDUCTION+110, // (default reduction)
  }
,
{ // state 482
0x80000000|1, // match move
0x80000000|628, // no-match move
0x80000000|47, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 483
10,524, // `}
12,367, // <decl in class>
13,223, // <method decl>
14,324, // `public
69,577, // "#"
74,14, // "}"
  }
,
{ // state 484
0x80000000|1, // match move
0x80000000|554, // no-match move
0x80000000|47, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 485
MIN_REDUCTION+94, // (default reduction)
  }
,
{ // state 486
55,7, // "o"
  }
,
{ // state 487
MIN_REDUCTION+22, // (default reduction)
  }
,
{ // state 488
MIN_REDUCTION+44, // (default reduction)
  }
,
{ // state 489
0x80000000|1, // match move
0x80000000|214, // no-match move
0x80000000|47, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 490
7,228, // ID
16,506, // `(
37,146, // <exp3>
39,85, // <exp2>
40,260, // <cast exp>
41,477, // <unary exp>
42,97, // <exp1>
43,149, // `-
44,458, // INTLIT
45,295, // letter
46,109, // "p"
47,109, // "v"
48,109, // {"A".."Z" "a" "d" "f".."h" "j".."k" "m".."n" "q".."s" "w" "y".."z"}
49,109, // "b"
50,109, // "e"
51,109, // "t"
52,109, // "c"
53,109, // "i"
54,109, // "l"
55,109, // "o"
56,109, // "u"
57,109, // "x"
58,561, // letter128
59,46, // {199..218 231..250}
60,46, // {193..198 225..230}
62,271, // {"1".."9"}
63,418, // "0"
64,566, // digit128
65,596, // {176..185}
71,274, // "("
75,611, // "-"
  }
,
{ // state 491
45,649, // letter
46,76, // "p"
47,76, // "v"
48,76, // {"A".."Z" "a" "d" "f".."h" "j".."k" "m".."n" "q".."s" "w" "y".."z"}
49,76, // "b"
50,76, // "e"
51,76, // "t"
52,76, // "c"
53,76, // "i"
54,76, // "l"
55,76, // "o"
56,76, // "u"
57,76, // "x"
58,8, // letter128
59,385, // {199..218 231..250}
60,385, // {193..198 225..230}
61,294, // digit
62,255, // {"1".."9"}
63,255, // "0"
64,620, // digit128
65,336, // {176..185}
82,43, // $$0
87,589, // idChar
88,560, // "_"
89,66, // idChar128
90,408, // {223}
  }
,
{ // state 492
0x80000000|1, // match move
0x80000000|215, // no-match move
0x80000000|47, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 493
MIN_REDUCTION+22, // (default reduction)
  }
,
{ // state 494
2,246, // ws*
66,250, // ws
67,518, // " "
68,118, // {10}
MIN_REDUCTION+55, // (default reduction)
  }
,
{ // state 495
23,MIN_REDUCTION+85, // `[
78,MIN_REDUCTION+85, // "["
MIN_REDUCTION+85, // (default reduction)
  }
,
{ // state 496
23,MIN_REDUCTION+39, // `[
78,MIN_REDUCTION+39, // "["
MIN_REDUCTION+39, // (default reduction)
  }
,
{ // state 497
0x80000000|1, // match move
0x80000000|321, // no-match move
0x80000000|47, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 498
MIN_REDUCTION+44, // (default reduction)
  }
,
{ // state 499
23,MIN_REDUCTION+39, // `[
78,MIN_REDUCTION+39, // "["
MIN_REDUCTION+39, // (default reduction)
  }
,
{ // state 500
23,MIN_REDUCTION+84, // `[
78,MIN_REDUCTION+84, // "["
MIN_REDUCTION+84, // (default reduction)
  }
,
{ // state 501
66,538, // ws
67,358, // " "
68,286, // {10}
MIN_REDUCTION+60, // (default reduction)
  }
,
{ // state 502
MIN_REDUCTION+44, // (default reduction)
  }
,
{ // state 503
0x80000000|1, // match move
0x80000000|317, // no-match move
0x80000000|47, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 504
7,226, // ID
16,511, // `(
37,144, // <exp3>
39,88, // <exp2>
40,258, // <cast exp>
41,480, // <unary exp>
42,127, // <exp1>
43,143, // `-
44,461, // INTLIT
45,289, // letter
46,109, // "p"
47,109, // "v"
48,109, // {"A".."Z" "a" "d" "f".."h" "j".."k" "m".."n" "q".."s" "w" "y".."z"}
49,109, // "b"
50,109, // "e"
51,109, // "t"
52,109, // "c"
53,109, // "i"
54,109, // "l"
55,109, // "o"
56,109, // "u"
57,109, // "x"
58,562, // letter128
59,44, // {199..218 231..250}
60,44, // {193..198 225..230}
62,272, // {"1".."9"}
63,417, // "0"
64,568, // digit128
65,597, // {176..185}
71,274, // "("
75,611, // "-"
  }
,
{ // state 505
23,MIN_REDUCTION+111, // `[
78,MIN_REDUCTION+111, // "["
MIN_REDUCTION+111, // (default reduction)
  }
,
{ // state 506
7,446, // ID
19,382, // <type>
20,395, // `int
21,139, // `boolean
45,209, // letter
46,109, // "p"
47,109, // "v"
48,109, // {"A".."Z" "a" "d" "f".."h" "j".."k" "m".."n" "q".."s" "w" "y".."z"}
49,109, // "b"
50,109, // "e"
51,109, // "t"
52,109, // "c"
53,109, // "i"
54,109, // "l"
55,109, // "o"
56,109, // "u"
57,109, // "x"
58,151, // letter128
59,350, // {199..218 231..250}
60,350, // {193..198 225..230}
69,320, // "#"
  }
,
{ // state 507
2,503, // ws*
  }
,
{ // state 508
MIN_REDUCTION+32, // (default reduction)
  }
,
{ // state 509
17,181, // `)
22,393, // <empty bracket pair>
23,654, // `[
72,455, // ")"
78,199, // "["
  }
,
{ // state 510
0x80000000|1, // match move
0x80000000|615, // no-match move
0x80000000|47, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 511
7,446, // ID
19,386, // <type>
20,395, // `int
21,139, // `boolean
45,209, // letter
46,109, // "p"
47,109, // "v"
48,109, // {"A".."Z" "a" "d" "f".."h" "j".."k" "m".."n" "q".."s" "w" "y".."z"}
49,109, // "b"
50,109, // "e"
51,109, // "t"
52,109, // "c"
53,109, // "i"
54,109, // "l"
55,109, // "o"
56,109, // "u"
57,109, // "x"
58,151, // letter128
59,350, // {199..218 231..250}
60,350, // {193..198 225..230}
69,320, // "#"
  }
,
{ // state 512
0x80000000|1, // match move
0x80000000|616, // no-match move
0x80000000|47, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 513
2,484, // ws*
23,MIN_REDUCTION+117, // `[
66,456, // ws
67,175, // " "
68,20, // {10}
78,MIN_REDUCTION+117, // "["
MIN_REDUCTION+117, // (default reduction)
  }
,
{ // state 514
2,497, // ws*
  }
,
{ // state 515
MIN_REDUCTION+22, // (default reduction)
  }
,
{ // state 516
7,238, // ID
16,379, // `(
37,192, // <exp3>
39,58, // <exp2>
40,292, // <cast exp>
41,508, // <unary exp>
42,148, // <exp1>
43,168, // `-
44,441, // INTLIT
45,78, // letter
46,109, // "p"
47,109, // "v"
48,109, // {"A".."Z" "a" "d" "f".."h" "j".."k" "m".."n" "q".."s" "w" "y".."z"}
49,109, // "b"
50,109, // "e"
51,109, // "t"
52,109, // "c"
53,109, // "i"
54,109, // "l"
55,109, // "o"
56,109, // "u"
57,109, // "x"
58,536, // letter128
59,29, // {199..218 231..250}
60,29, // {193..198 225..230}
62,230, // {"1".."9"}
63,368, // "0"
64,542, // digit128
65,614, // {176..185}
71,274, // "("
75,611, // "-"
  }
,
{ // state 517
66,569, // ws
67,436, // " "
68,195, // {10}
MIN_REDUCTION+80, // (default reduction)
  }
,
{ // state 518
MIN_REDUCTION+44, // (default reduction)
  }
,
{ // state 519
MIN_REDUCTION+107, // (default reduction)
  }
,
{ // state 520
0x80000000|1, // match move
0x80000000|634, // no-match move
0x80000000|47, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 521
2,330, // ws*
  }
,
{ // state 522
38,375, // `*
70,479, // "*"
MIN_REDUCTION+28, // (default reduction)
  }
,
{ // state 523
2,63, // ws*
  }
,
{ // state 524
MIN_REDUCTION+4, // (default reduction)
  }
,
{ // state 525
45,649, // letter
46,76, // "p"
47,76, // "v"
48,76, // {"A".."Z" "a" "d" "f".."h" "j".."k" "m".."n" "q".."s" "w" "y".."z"}
49,76, // "b"
50,76, // "e"
51,76, // "t"
52,76, // "c"
53,76, // "i"
54,76, // "l"
55,76, // "o"
56,76, // "u"
57,76, // "x"
58,164, // letter128
59,361, // {199..218 231..250}
60,361, // {193..198 225..230}
61,294, // digit
62,255, // {"1".."9"}
63,255, // "0"
64,610, // digit128
65,370, // {176..185}
82,79, // $$0
87,589, // idChar
88,560, // "_"
89,5, // idChar128
90,435, // {223}
  }
,
{ // state 526
23,MIN_REDUCTION+39, // `[
78,MIN_REDUCTION+39, // "["
MIN_REDUCTION+39, // (default reduction)
  }
,
{ // state 527
2,61, // ws*
  }
,
{ // state 528
MIN_REDUCTION+80, // (default reduction)
  }
,
{ // state 529
0x80000000|344, // match move
0x80000000|52, // no-match move
0x80000000|47, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 530
2,152, // ws*
23,MIN_REDUCTION+113, // `[
66,456, // ws
67,175, // " "
68,20, // {10}
78,MIN_REDUCTION+113, // "["
MIN_REDUCTION+113, // (default reduction)
  }
,
{ // state 531
23,MIN_REDUCTION+41, // `[
78,MIN_REDUCTION+41, // "["
MIN_REDUCTION+41, // (default reduction)
  }
,
{ // state 532
MIN_REDUCTION+83, // (default reduction)
  }
,
{ // state 533
0x80000000|624, // match move
0x80000000|345, // no-match move
0x80000000|47, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 534
MIN_REDUCTION+15, // (default reduction)
  }
,
{ // state 535
30,64, // `=
77,546, // "="
  }
,
{ // state 536
0x80000000|521, // match move
0x80000000|241, // no-match move
0x80000000|47, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 537
MIN_REDUCTION+110, // (default reduction)
  }
,
{ // state 538
MIN_REDUCTION+110, // (default reduction)
  }
,
{ // state 539
61,387, // digit
62,430, // {"1".."9"}
63,430, // "0"
64,627, // digit128
65,614, // {176..185}
84,218, // $$1
  }
,
{ // state 540
0x80000000|1, // match move
0x80000000|248, // no-match move
0x80000000|47, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 541
0x80000000|1, // match move
0x80000000|252, // no-match move
0x80000000|47, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 542
0x80000000|590, // match move
0x80000000|599, // no-match move
0x80000000|47, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 543
MIN_REDUCTION+29, // (default reduction)
  }
,
{ // state 544
MIN_REDUCTION+29, // (default reduction)
  }
,
{ // state 545
66,98, // ws
67,35, // " "
68,643, // {10}
MIN_REDUCTION+64, // (default reduction)
  }
,
{ // state 546
2,365, // ws*
66,310, // ws
67,316, // " "
68,352, // {10}
MIN_REDUCTION+73, // (default reduction)
  }
,
{ // state 547
MIN_REDUCTION+111, // (default reduction)
  }
,
{ // state 548
2,449, // ws*
23,MIN_REDUCTION+117, // `[
66,474, // ws
67,157, // " "
68,170, // {10}
78,MIN_REDUCTION+117, // "["
MIN_REDUCTION+117, // (default reduction)
  }
,
{ // state 549
2,447, // ws*
23,MIN_REDUCTION+117, // `[
66,471, // ws
67,155, // " "
68,176, // {10}
78,MIN_REDUCTION+117, // "["
MIN_REDUCTION+117, // (default reduction)
  }
,
{ // state 550
MIN_REDUCTION+82, // (default reduction)
  }
,
{ // state 551
-1, // $$start
-1, // <start>
-1, // ws*
-1, // <program>
-1, // <class decl>+
-1, // <class decl>
-1, // `class
265, // ID
28, // `{
-1, // <decl in class>*
115, // `}
-1, // `extends
-1, // <decl in class>
-1, // <method decl>
-1, // `public
-1, // `void
506, // `(
-1, // `)
-1, // <stmt>*
220, // <type>
235, // `int
239, // `boolean
-1, // <empty bracket pair>
-1, // `[
-1, // `]
140, // <stmt>
269, // <assign>
-1, // `;
404, // <local var decl>
567, // <exp>
-1, // `=
487, // <exp8>
337, // <exp7>
13, // <exp6>
18, // <exp5>
112, // <exp4>
-1, // `+
469, // <exp3>
-1, // `*
85, // <exp2>
260, // <cast exp>
477, // <unary exp>
97, // <exp1>
149, // `-
458, // INTLIT
572, // letter
109, // "p"
109, // "v"
109, // {"A".."Z" "a" "d" "f".."h" "j".."k" "m".."n" "q".."s" "w" "y".."z"}
109, // "b"
109, // "e"
109, // "t"
109, // "c"
109, // "i"
109, // "l"
109, // "o"
109, // "u"
109, // "x"
381, // letter128
203, // {199..218 231..250}
203, // {193..198 225..230}
-1, // digit
271, // {"1".."9"}
418, // "0"
566, // digit128
596, // {176..185}
-1, // ws
-1, // " "
-1, // {10}
91, // "#"
-1, // "*"
274, // "("
-1, // ")"
190, // "{"
187, // "}"
611, // "-"
-1, // "+"
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
{ // state 552
MIN_REDUCTION+110, // (default reduction)
  }
,
{ // state 553
7,83, // ID
45,399, // letter
46,109, // "p"
47,109, // "v"
48,109, // {"A".."Z" "a" "d" "f".."h" "j".."k" "m".."n" "q".."s" "w" "y".."z"}
49,109, // "b"
50,109, // "e"
51,109, // "t"
52,109, // "c"
53,109, // "i"
54,109, // "l"
55,109, // "o"
56,109, // "u"
57,109, // "x"
58,647, // letter128
59,440, // {199..218 231..250}
60,440, // {193..198 225..230}
  }
,
{ // state 554
23,MIN_REDUCTION+116, // `[
66,56, // ws
67,175, // " "
68,20, // {10}
78,MIN_REDUCTION+116, // "["
MIN_REDUCTION+116, // (default reduction)
  }
,
{ // state 555
MIN_REDUCTION+94, // (default reduction)
  }
,
{ // state 556
MIN_REDUCTION+103, // (default reduction)
  }
,
{ // state 557
23,MIN_REDUCTION+94, // `[
78,MIN_REDUCTION+94, // "["
MIN_REDUCTION+94, // (default reduction)
  }
,
{ // state 558
MIN_REDUCTION+110, // (default reduction)
  }
,
{ // state 559
23,MIN_REDUCTION+94, // `[
78,MIN_REDUCTION+94, // "["
MIN_REDUCTION+94, // (default reduction)
  }
,
{ // state 560
MIN_REDUCTION+92, // (default reduction)
  }
,
{ // state 561
0x80000000|454, // match move
0x80000000|122, // no-match move
0x80000000|47, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 562
0x80000000|457, // match move
0x80000000|126, // no-match move
0x80000000|47, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 563
0x80000000|366, // match move
0x80000000|325, // no-match move
0x80000000|47, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 564
0x80000000|264, // match move
0x80000000|51, // no-match move
0x80000000|47, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 565
23,MIN_REDUCTION+82, // `[
78,MIN_REDUCTION+82, // "["
MIN_REDUCTION+82, // (default reduction)
  }
,
{ // state 566
0x80000000|607, // match move
0x80000000|630, // no-match move
0x80000000|47, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 567
30,392, // `=
77,546, // "="
  }
,
{ // state 568
0x80000000|605, // match move
0x80000000|625, // no-match move
0x80000000|47, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 569
MIN_REDUCTION+110, // (default reduction)
  }
,
{ // state 570
MIN_REDUCTION+110, // (default reduction)
  }
,
{ // state 571
MIN_REDUCTION+110, // (default reduction)
  }
,
{ // state 572
45,649, // letter
46,76, // "p"
47,76, // "v"
48,76, // {"A".."Z" "a" "d" "f".."h" "j".."k" "m".."n" "q".."s" "w" "y".."z"}
49,76, // "b"
50,76, // "e"
51,76, // "t"
52,76, // "c"
53,76, // "i"
54,76, // "l"
55,76, // "o"
56,76, // "u"
57,76, // "x"
58,533, // letter128
59,203, // {199..218 231..250}
60,203, // {193..198 225..230}
61,294, // digit
62,255, // {"1".."9"}
63,255, // "0"
64,564, // digit128
65,171, // {176..185}
81,45, // idChar*
82,331, // $$0
87,519, // idChar
88,560, // "_"
89,612, // idChar128
90,563, // {223}
  }
,
{ // state 573
2,364, // ws*
66,431, // ws
67,340, // " "
68,315, // {10}
MIN_REDUCTION+67, // (default reduction)
  }
,
{ // state 574
MIN_REDUCTION+44, // (default reduction)
  }
,
{ // state 575
23,MIN_REDUCTION+82, // `[
78,MIN_REDUCTION+82, // "["
MIN_REDUCTION+82, // (default reduction)
  }
,
{ // state 576
23,MIN_REDUCTION+82, // `[
78,MIN_REDUCTION+82, // "["
MIN_REDUCTION+82, // (default reduction)
  }
,
{ // state 577
46,478, // "p"
  }
,
{ // state 578
2,212, // ws*
66,24, // ws
67,436, // " "
68,195, // {10}
MIN_REDUCTION+63, // (default reduction)
  }
,
{ // state 579
MIN_REDUCTION+29, // (default reduction)
  }
,
{ // state 580
MIN_REDUCTION+45, // (default reduction)
  }
,
{ // state 581
2,420, // ws*
66,291, // ws
67,313, // " "
68,338, // {10}
94,MIN_REDUCTION+77, // $NT
  }
,
{ // state 582
23,MIN_REDUCTION+116, // `[
66,36, // ws
67,157, // " "
68,170, // {10}
78,MIN_REDUCTION+116, // "["
MIN_REDUCTION+116, // (default reduction)
  }
,
{ // state 583
MIN_REDUCTION+44, // (default reduction)
  }
,
{ // state 584
93,MIN_REDUCTION+0, // $
  }
,
{ // state 585
23,MIN_REDUCTION+116, // `[
66,33, // ws
67,155, // " "
68,176, // {10}
78,MIN_REDUCTION+116, // "["
MIN_REDUCTION+116, // (default reduction)
  }
,
{ // state 586
2,4, // ws*
66,437, // ws
67,162, // " "
68,219, // {10}
MIN_REDUCTION+71, // (default reduction)
  }
,
{ // state 587
MIN_REDUCTION+111, // (default reduction)
  }
,
{ // state 588
45,649, // letter
46,76, // "p"
47,76, // "v"
48,76, // {"A".."Z" "a" "d" "f".."h" "j".."k" "m".."n" "q".."s" "w" "y".."z"}
49,76, // "b"
50,76, // "e"
51,76, // "t"
52,76, // "c"
53,76, // "i"
54,76, // "l"
55,76, // "o"
56,76, // "u"
57,76, // "x"
58,164, // letter128
59,361, // {199..218 231..250}
60,361, // {193..198 225..230}
61,294, // digit
62,255, // {"1".."9"}
63,255, // "0"
64,610, // digit128
65,370, // {176..185}
81,525, // idChar*
82,206, // $$0
87,519, // idChar
88,560, // "_"
89,5, // idChar128
90,435, // {223}
  }
,
{ // state 589
MIN_REDUCTION+106, // (default reduction)
  }
,
{ // state 590
2,111, // ws*
  }
,
{ // state 591
MIN_REDUCTION+99, // (default reduction)
  }
,
{ // state 592
7,30, // ID
45,588, // letter
46,109, // "p"
47,109, // "v"
48,109, // {"A".."Z" "a" "d" "f".."h" "j".."k" "m".."n" "q".."s" "w" "y".."z"}
49,109, // "b"
50,109, // "e"
51,109, // "t"
52,109, // "c"
53,109, // "i"
54,109, // "l"
55,109, // "o"
56,109, // "u"
57,109, // "x"
58,465, // letter128
59,361, // {199..218 231..250}
60,361, // {193..198 225..230}
  }
,
{ // state 593
0x80000000|507, // match move
0x80000000|225, // no-match move
0x80000000|47, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 594
0x80000000|32, // match move
0x80000000|513, // no-match move
0x80000000|47, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 595
24,198, // `]
79,186, // "]"
  }
,
{ // state 596
0x80000000|59, // match move
0x80000000|342, // no-match move
0x80000000|47, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 597
0x80000000|59, // match move
0x80000000|339, // no-match move
0x80000000|47, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 598
0x80000000|514, // match move
0x80000000|221, // no-match move
0x80000000|47, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 599
2,111, // ws*
23,MIN_REDUCTION+87, // `[
66,456, // ws
67,175, // " "
68,20, // {10}
78,MIN_REDUCTION+87, // "["
MIN_REDUCTION+87, // (default reduction)
  }
,
{ // state 600
7,319, // ID
45,137, // letter
46,109, // "p"
47,109, // "v"
48,109, // {"A".."Z" "a" "d" "f".."h" "j".."k" "m".."n" "q".."s" "w" "y".."z"}
49,109, // "b"
50,109, // "e"
51,109, // "t"
52,109, // "c"
53,109, // "i"
54,109, // "l"
55,109, // "o"
56,109, // "u"
57,109, // "x"
58,234, // letter128
59,633, // {199..218 231..250}
60,633, // {193..198 225..230}
  }
,
{ // state 601
2,86, // ws*
66,307, // ws
67,328, // " "
68,353, // {10}
MIN_REDUCTION+57, // (default reduction)
  }
,
{ // state 602
66,68, // ws
67,583, // " "
68,12, // {10}
MIN_REDUCTION+52, // (default reduction)
  }
,
{ // state 603
24,205, // `]
79,191, // "]"
  }
,
{ // state 604
MIN_REDUCTION+105, // (default reduction)
  }
,
{ // state 605
2,77, // ws*
  }
,
{ // state 606
23,MIN_REDUCTION+94, // `[
78,MIN_REDUCTION+94, // "["
MIN_REDUCTION+94, // (default reduction)
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
{ // state 607
2,72, // ws*
  }
,
{ // state 608
MIN_REDUCTION+111, // (default reduction)
  }
,
{ // state 609
23,MIN_REDUCTION+43, // `[
78,MIN_REDUCTION+43, // "["
MIN_REDUCTION+43, // (default reduction)
  }
,
{ // state 610
MIN_REDUCTION+94, // (default reduction)
  }
,
{ // state 611
2,323, // ws*
66,341, // ws
67,415, // " "
68,413, // {10}
MIN_REDUCTION+69, // (default reduction)
  }
,
{ // state 612
0x80000000|193, // match move
0x80000000|334, // no-match move
0x80000000|47, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 613
MIN_REDUCTION+43, // (default reduction)
  }
,
{ // state 614
0x80000000|59, // match move
0x80000000|363, // no-match move
0x80000000|47, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 615
23,MIN_REDUCTION+88, // `[
78,MIN_REDUCTION+88, // "["
MIN_REDUCTION+88, // (default reduction)
  }
,
{ // state 616
23,MIN_REDUCTION+88, // `[
78,MIN_REDUCTION+88, // "["
MIN_REDUCTION+88, // (default reduction)
  }
,
{ // state 617
45,649, // letter
46,76, // "p"
47,76, // "v"
48,76, // {"A".."Z" "a" "d" "f".."h" "j".."k" "m".."n" "q".."s" "w" "y".."z"}
49,76, // "b"
50,76, // "e"
51,76, // "t"
52,76, // "c"
53,76, // "i"
54,76, // "l"
55,76, // "o"
56,76, // "u"
57,76, // "x"
58,251, // letter128
59,633, // {199..218 231..250}
60,633, // {193..198 225..230}
61,294, // digit
62,255, // {"1".."9"}
63,255, // "0"
64,425, // digit128
65,613, // {176..185}
82,268, // $$0
87,589, // idChar
88,560, // "_"
89,123, // idChar128
90,22, // {223}
  }
,
{ // state 618
0x80000000|528, // match move
0x80000000|217, // no-match move
0x80000000|47, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 619
45,649, // letter
46,76, // "p"
47,76, // "v"
48,76, // {"A".."Z" "a" "d" "f".."h" "j".."k" "m".."n" "q".."s" "w" "y".."z"}
49,76, // "b"
50,76, // "e"
51,76, // "t"
52,76, // "c"
53,76, // "i"
54,76, // "l"
55,76, // "o"
56,76, // "u"
57,76, // "x"
58,8, // letter128
59,385, // {199..218 231..250}
60,385, // {193..198 225..230}
61,294, // digit
62,255, // {"1".."9"}
63,255, // "0"
64,620, // digit128
65,336, // {176..185}
81,491, // idChar*
82,147, // $$0
87,519, // idChar
88,560, // "_"
89,66, // idChar128
90,408, // {223}
  }
,
{ // state 620
MIN_REDUCTION+94, // (default reduction)
  }
,
{ // state 621
MIN_REDUCTION+101, // (default reduction)
  }
,
{ // state 622
MIN_REDUCTION+82, // (default reduction)
  }
,
{ // state 623
MIN_REDUCTION+10, // (default reduction)
  }
,
{ // state 624
MIN_REDUCTION+93, // (default reduction)
  }
,
{ // state 625
2,77, // ws*
23,MIN_REDUCTION+87, // `[
66,474, // ws
67,157, // " "
68,170, // {10}
78,MIN_REDUCTION+87, // "["
MIN_REDUCTION+87, // (default reduction)
  }
,
{ // state 626
23,MIN_REDUCTION+37, // `[
78,MIN_REDUCTION+37, // "["
MIN_REDUCTION+37, // (default reduction)
  }
,
{ // state 627
0x80000000|476, // match move
0x80000000|189, // no-match move
0x80000000|47, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 628
23,MIN_REDUCTION+88, // `[
78,MIN_REDUCTION+88, // "["
MIN_REDUCTION+88, // (default reduction)
  }
,
{ // state 629
MIN_REDUCTION+35, // (default reduction)
  }
,
{ // state 630
2,72, // ws*
23,MIN_REDUCTION+87, // `[
66,471, // ws
67,155, // " "
68,176, // {10}
78,MIN_REDUCTION+87, // "["
MIN_REDUCTION+87, // (default reduction)
  }
,
{ // state 631
66,348, // ws
67,50, // " "
68,580, // {10}
MIN_REDUCTION+46, // (default reduction)
  }
,
{ // state 632
MIN_REDUCTION+1, // (default reduction)
  }
,
{ // state 633
MIN_REDUCTION+41, // (default reduction)
  }
,
{ // state 634
23,MIN_REDUCTION+38, // `[
78,MIN_REDUCTION+38, // "["
MIN_REDUCTION+38, // (default reduction)
  }
,
{ // state 635
MIN_REDUCTION+35, // (default reduction)
  }
,
{ // state 636
66,68, // ws
67,583, // " "
68,12, // {10}
MIN_REDUCTION+48, // (default reduction)
  }
,
{ // state 637
23,MIN_REDUCTION+76, // `[
66,36, // ws
67,157, // " "
68,170, // {10}
78,MIN_REDUCTION+76, // "["
MIN_REDUCTION+76, // (default reduction)
  }
,
{ // state 638
66,348, // ws
67,50, // " "
68,580, // {10}
MIN_REDUCTION+54, // (default reduction)
  }
,
{ // state 639
23,MIN_REDUCTION+76, // `[
66,33, // ws
67,155, // " "
68,176, // {10}
78,MIN_REDUCTION+76, // "["
MIN_REDUCTION+76, // (default reduction)
  }
,
{ // state 640
61,387, // digit
62,430, // {"1".."9"}
63,430, // "0"
64,598, // digit128
65,597, // {176..185}
84,202, // $$1
  }
,
{ // state 641
23,MIN_REDUCTION+37, // `[
78,MIN_REDUCTION+37, // "["
MIN_REDUCTION+37, // (default reduction)
  }
,
{ // state 642
55,473, // "o"
  }
,
{ // state 643
MIN_REDUCTION+45, // (default reduction)
  }
,
{ // state 644
MIN_REDUCTION+112, // (default reduction)
  }
,
{ // state 645
61,387, // digit
62,430, // {"1".."9"}
63,430, // "0"
64,593, // digit128
65,596, // {176..185}
84,197, // $$1
  }
,
{ // state 646
23,MIN_REDUCTION+37, // `[
78,MIN_REDUCTION+37, // "["
MIN_REDUCTION+37, // (default reduction)
  }
,
{ // state 647
2,517, // ws*
66,24, // ws
67,436, // " "
68,195, // {10}
MIN_REDUCTION+81, // (default reduction)
  }
,
{ // state 648
24,520, // `]
79,224, // "]"
  }
,
{ // state 649
MIN_REDUCTION+90, // (default reduction)
  }
,
{ // state 650
MIN_REDUCTION+35, // (default reduction)
  }
,
{ // state 651
23,MIN_REDUCTION+38, // `[
78,MIN_REDUCTION+38, // "["
MIN_REDUCTION+38, // (default reduction)
  }
,
{ // state 652
23,MIN_REDUCTION+38, // `[
78,MIN_REDUCTION+38, // "["
MIN_REDUCTION+38, // (default reduction)
  }
,
{ // state 653
MIN_REDUCTION+94, // (default reduction)
  }
,
{ // state 654
24,534, // `]
79,427, // "]"
  }
,
{ // state 655
23,MIN_REDUCTION+89, // `[
78,MIN_REDUCTION+89, // "["
MIN_REDUCTION+89, // (default reduction)
  }
,
};
}
public MJGrammarParseTable(MJGrammar actionObj) {
  actionObject = actionObj;
  parseTable = new int[656][];
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
// <assign> ::= <exp> `= <exp>
(26<<16)+3,
// <local var decl> ::= <type> ID `= <exp>
(28<<16)+4,
// <exp> ::= <exp8>
(29<<16)+1,
// <exp8> ::= <exp7>
(31<<16)+1,
// <exp7> ::= <exp6>
(32<<16)+1,
// <exp6> ::= <exp5>
(33<<16)+1,
// <exp5> ::= <exp4>
(34<<16)+1,
// <exp4> ::= <exp4> `+ <exp3>
(35<<16)+3,
// <exp4> ::= <exp3>
(35<<16)+1,
// <exp3> ::= <exp3> `* <exp2>
(37<<16)+3,
// <exp3> ::= <exp2>
(37<<16)+1,
// <exp2> ::= <cast exp>
(39<<16)+1,
// <exp2> ::= <unary exp>
(39<<16)+1,
// <cast exp> ::= `( <type> `) <cast exp>
(40<<16)+4,
// <cast exp> ::= `( <type> `) <exp1>
(40<<16)+4,
// <unary exp> ::= `- <unary exp>
(41<<16)+2,
// <unary exp> ::= <exp1>
(41<<16)+1,
// <exp1> ::= ID
(42<<16)+1,
// <exp1> ::= <exp1> !<empty bracket pair> `[ <exp> `]
(42<<16)+4,
// <exp1> ::= INTLIT
(42<<16)+1,
// letter ::= {"A".."Z" "a".."z"}
(45<<16)+1,
// letter128 ::= {193..218 225..250}
(58<<16)+1,
// digit ::= {"0".."9"}
(61<<16)+1,
// digit128 ::= {176..185}
(64<<16)+1,
// ws ::= " "
(66<<16)+1,
// ws ::= {10}
(66<<16)+1,
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
// `public ::= "#" "p" "u" ws*
(14<<16)+4,
// `public ::= "#" "p" "u"
(14<<16)+3,
// `* ::= "*" ws*
(38<<16)+2,
// `* ::= "*"
(38<<16)+1,
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
(43<<16)+2,
// `- ::= "-"
(43<<16)+1,
// `+ ::= "+" ws*
(36<<16)+2,
// `+ ::= "+"
(36<<16)+1,
// `= ::= "=" ws*
(30<<16)+2,
// `= ::= "="
(30<<16)+1,
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
(44<<16)+3,
// INTLIT ::= {"1".."9"} $$1
(44<<16)+2,
// INTLIT ::= digit128 ws*
(44<<16)+2,
// INTLIT ::= digit128
(44<<16)+1,
// INTLIT ::= "0" hexDigit* $$2
(44<<16)+3,
// INTLIT ::= "0" $$2
(44<<16)+2,
// idChar ::= letter
(87<<16)+1,
// idChar ::= digit
(87<<16)+1,
// idChar ::= "_"
(87<<16)+1,
// idChar128 ::= letter128
(89<<16)+1,
// idChar128 ::= digit128
(89<<16)+1,
// idChar128 ::= {223}
(89<<16)+1,
// hexDigit ::= {"0".."9" "A".."Z" "a".."z"}
(91<<16)+1,
// hexDigit128 ::= {176..185 193..198 225..230}
(92<<16)+1,
// digit* ::= digit* digit
(83<<16)+2,
// digit* ::= digit
(83<<16)+1,
// <decl in class>* ::= <decl in class>* <decl in class>
(9<<16)+2,
// <decl in class>* ::= <decl in class>
(9<<16)+1,
// hexDigit* ::= hexDigit* hexDigit
(85<<16)+2,
// hexDigit* ::= hexDigit
(85<<16)+1,
// <stmt>* ::= <stmt>* <stmt>
(18<<16)+2,
// <stmt>* ::= <stmt>
(18<<16)+1,
// idChar* ::= idChar* idChar
(81<<16)+2,
// idChar* ::= idChar
(81<<16)+1,
// <class decl>+ ::= <class decl>
(4<<16)+1,
// <class decl>+ ::= <class decl>+ <class decl>
(4<<16)+2,
// ws* ::= ws* ws
(2<<16)+2,
// ws* ::= ws
(2<<16)+1,
// $$0 ::= idChar128 ws*
(82<<16)+2,
// $$0 ::= idChar128
(82<<16)+1,
// $$1 ::= digit128 ws*
(84<<16)+2,
// $$1 ::= digit128
(84<<16)+1,
// $$2 ::= hexDigit128 ws*
(86<<16)+2,
// $$2 ::= hexDigit128
(86<<16)+1,
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
68, // 10
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
67, // " "
-1, // "!"
-1, // '"'
69, // "#"
-1, // "$"
-1, // "%"
-1, // "&"
-1, // "'"
71, // "("
72, // ")"
70, // "*"
76, // "+"
-1, // ","
75, // "-"
-1, // "."
-1, // "/"
63, // "0"
62, // "1"
62, // "2"
62, // "3"
62, // "4"
62, // "5"
62, // "6"
62, // "7"
62, // "8"
62, // "9"
-1, // ":"
80, // ";"
-1, // "<"
77, // "="
-1, // ">"
-1, // "?"
-1, // "@"
48, // "A"
48, // "B"
48, // "C"
48, // "D"
48, // "E"
48, // "F"
48, // "G"
48, // "H"
48, // "I"
48, // "J"
48, // "K"
48, // "L"
48, // "M"
48, // "N"
48, // "O"
48, // "P"
48, // "Q"
48, // "R"
48, // "S"
48, // "T"
48, // "U"
48, // "V"
48, // "W"
48, // "X"
48, // "Y"
48, // "Z"
78, // "["
-1, // "\"
79, // "]"
-1, // "^"
88, // "_"
-1, // "`"
48, // "a"
49, // "b"
52, // "c"
48, // "d"
50, // "e"
48, // "f"
48, // "g"
48, // "h"
53, // "i"
48, // "j"
48, // "k"
54, // "l"
48, // "m"
48, // "n"
55, // "o"
46, // "p"
48, // "q"
48, // "r"
48, // "s"
51, // "t"
56, // "u"
47, // "v"
48, // "w"
57, // "x"
48, // "y"
48, // "z"
73, // "{"
-1, // "|"
74, // "}"
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
65, // 176
65, // 177
65, // 178
65, // 179
65, // 180
65, // 181
65, // 182
65, // 183
65, // 184
65, // 185
-1, // 186
-1, // 187
-1, // 188
-1, // 189
-1, // 190
-1, // 191
-1, // 192
60, // 193
60, // 194
60, // 195
60, // 196
60, // 197
60, // 198
59, // 199
59, // 200
59, // 201
59, // 202
59, // 203
59, // 204
59, // 205
59, // 206
59, // 207
59, // 208
59, // 209
59, // 210
59, // 211
59, // 212
59, // 213
59, // 214
59, // 215
59, // 216
59, // 217
59, // 218
-1, // 219
-1, // 220
-1, // 221
-1, // 222
90, // 223
-1, // 224
60, // 225
60, // 226
60, // 227
60, // 228
60, // 229
60, // 230
59, // 231
59, // 232
59, // 233
59, // 234
59, // 235
59, // 236
59, // 237
59, // 238
59, // 239
59, // 240
59, // 241
59, // 242
59, // 243
59, // 244
59, // 245
59, // 246
59, // 247
59, // 248
59, // 249
59, // 250
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
"digit* ::= digit* digit", // 98
"digit* ::= digit* digit", // 99
"<decl in class>* ::= <decl in class>* <decl in class>", // 100
"<decl in class>* ::= <decl in class>* <decl in class>", // 101
"hexDigit* ::= hexDigit* hexDigit", // 102
"hexDigit* ::= hexDigit* hexDigit", // 103
"<stmt>* ::= <stmt>* <stmt>", // 104
"<stmt>* ::= <stmt>* <stmt>", // 105
"idChar* ::= idChar* idChar", // 106
"idChar* ::= idChar* idChar", // 107
"<class decl>+ ::= <class decl>", // 108
"<class decl>+ ::= <class decl>+ <class decl>", // 109
"ws* ::= ws* ws", // 110
"ws* ::= ws* ws", // 111
"", // 112
"", // 113
"", // 114
"", // 115
"", // 116
"", // 117
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
    { // 20: <assign> ::= <exp> [#] `= <exp> @assign(Exp,int,Exp)=>Statement
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((6<<5)|0x6)/*nullProductionAction:6*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((10<<5)|0x5)/*methodCall:10*/,
    },
    { // 21: <local var decl> ::= <type> [#] ID `= <exp> @localVarDecl(Type,int,String,Exp)=>Statement
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((6<<5)|0x6)/*nullProductionAction:6*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((11<<5)|0x5)/*methodCall:11*/,
    },
    { // 22: <exp> ::= <exp8> @pass
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
    },
    { // 23: <exp8> ::= <exp7> @pass
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
    },
    { // 24: <exp7> ::= <exp6> @pass
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
    },
    { // 25: <exp6> ::= <exp5> @pass
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
    },
    { // 26: <exp5> ::= <exp4> @pass
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
    },
    { // 27: <exp4> ::= <exp4> [#] `+ <exp3> @newPlus(Exp,int,Exp)=>Exp
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((6<<5)|0x6)/*nullProductionAction:6*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((12<<5)|0x5)/*methodCall:12*/,
    },
    { // 28: <exp4> ::= <exp3> @pass
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
    },
    { // 29: <exp3> ::= <exp3> [#] `* <exp2> @newTimes(Exp,int,Exp)=>Exp
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((6<<5)|0x6)/*nullProductionAction:6*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((13<<5)|0x5)/*methodCall:13*/,
    },
    { // 30: <exp3> ::= <exp2> @pass
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
    },
    { // 31: <exp2> ::= <cast exp> @pass
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
    },
    { // 32: <exp2> ::= <unary exp> @pass
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
    },
    { // 33: <cast exp> ::= [#] `( <type> `) <cast exp> @newCast(int,Type,Exp)=>Exp
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((6<<5)|0x6)/*nullProductionAction:6*/,
      ((14<<5)|0x5)/*methodCall:14*/,
    },
    { // 34: <cast exp> ::= [#] `( <type> `) <exp1> @newCast(int,Type,Exp)=>Exp
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((6<<5)|0x6)/*nullProductionAction:6*/,
      ((14<<5)|0x5)/*methodCall:14*/,
    },
    { // 35: <unary exp> ::= [#] `- <unary exp> @newUnaryMinus(int,Exp)=>Exp
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((6<<5)|0x6)/*nullProductionAction:6*/,
      ((15<<5)|0x5)/*methodCall:15*/,
    },
    { // 36: <unary exp> ::= <exp1> @pass
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
    },
    { // 37: <exp1> ::= [#] ID @newIdentfierExp(int,String)=>Exp
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((6<<5)|0x6)/*nullProductionAction:6*/,
      ((16<<5)|0x5)/*methodCall:16*/,
    },
    { // 38: <exp1> ::= <exp1> !<empty bracket pair> [#] `[ <exp> `] @newArrayLookup(Exp,int,Exp)=>Exp
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((6<<5)|0x6)/*nullProductionAction:6*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((17<<5)|0x5)/*methodCall:17*/,
    },
    { // 39: <exp1> ::= [#] INTLIT @newIntegerLiteral(int,int)=>Exp
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((6<<5)|0x6)/*nullProductionAction:6*/,
      ((18<<5)|0x5)/*methodCall:18*/,
    },
    { // 40: letter ::= {"A".."Z" "a".."z"} @pass
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
    },
    { // 41: letter128 ::= {193..218 225..250} @sub128(char)=>char
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((19<<5)|0x5)/*methodCall:19*/,
    },
    { // 42: digit ::= {"0".."9"} @pass
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
    },
    { // 43: digit128 ::= {176..185} @sub128(char)=>char
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((19<<5)|0x5)/*methodCall:19*/,
    },
    { // 44: ws ::= " " @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 45: ws ::= {10} [registerNewline] @void
      ((7<<5)|0x6)/*nullProductionAction:7*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 46: `boolean ::= "#" "b" "o" ws* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((3<<5)|0x3)/*popOffPushBack:3*/,
    },
    { // 47: `boolean ::= "#" "b" "o" [ws*] @void
      ((3<<5)|0x6)/*nullProductionAction:3*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((3<<5)|0x3)/*popOffPushBack:3*/,
    },
    { // 48: `class ::= "#" "c" "l" ws* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((3<<5)|0x3)/*popOffPushBack:3*/,
    },
    { // 49: `class ::= "#" "c" "l" [ws*] @void
      ((3<<5)|0x6)/*nullProductionAction:3*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((3<<5)|0x3)/*popOffPushBack:3*/,
    },
    { // 50: `extends ::= "#" "e" "x" ws* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((3<<5)|0x3)/*popOffPushBack:3*/,
    },
    { // 51: `extends ::= "#" "e" "x" [ws*] @void
      ((3<<5)|0x6)/*nullProductionAction:3*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((3<<5)|0x3)/*popOffPushBack:3*/,
    },
    { // 52: `void ::= "#" "v" "o" ws* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((3<<5)|0x3)/*popOffPushBack:3*/,
    },
    { // 53: `void ::= "#" "v" "o" [ws*] @void
      ((3<<5)|0x6)/*nullProductionAction:3*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((3<<5)|0x3)/*popOffPushBack:3*/,
    },
    { // 54: `int ::= "#" "i" "t" ws* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((3<<5)|0x3)/*popOffPushBack:3*/,
    },
    { // 55: `int ::= "#" "i" "t" [ws*] @void
      ((3<<5)|0x6)/*nullProductionAction:3*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((3<<5)|0x3)/*popOffPushBack:3*/,
    },
    { // 56: `public ::= "#" "p" "u" ws* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((3<<5)|0x3)/*popOffPushBack:3*/,
    },
    { // 57: `public ::= "#" "p" "u" [ws*] @void
      ((3<<5)|0x6)/*nullProductionAction:3*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((3<<5)|0x3)/*popOffPushBack:3*/,
    },
    { // 58: `* ::= "*" ws* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 59: `* ::= "*" [ws*] @void
      ((3<<5)|0x6)/*nullProductionAction:3*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 60: `( ::= "(" ws* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 61: `( ::= "(" [ws*] @void
      ((3<<5)|0x6)/*nullProductionAction:3*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 62: `) ::= ")" ws* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 63: `) ::= ")" [ws*] @void
      ((3<<5)|0x6)/*nullProductionAction:3*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 64: `{ ::= "{" ws* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 65: `{ ::= "{" [ws*] @void
      ((3<<5)|0x6)/*nullProductionAction:3*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 66: `} ::= "}" ws* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 67: `} ::= "}" [ws*] @void
      ((3<<5)|0x6)/*nullProductionAction:3*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 68: `- ::= "-" ws* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 69: `- ::= "-" [ws*] @void
      ((3<<5)|0x6)/*nullProductionAction:3*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 70: `+ ::= "+" ws* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 71: `+ ::= "+" [ws*] @void
      ((3<<5)|0x6)/*nullProductionAction:3*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 72: `= ::= "=" ws* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 73: `= ::= "=" [ws*] @void
      ((3<<5)|0x6)/*nullProductionAction:3*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 74: `[ ::= "[" ws* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 75: `[ ::= "[" [ws*] @void
      ((3<<5)|0x6)/*nullProductionAction:3*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 76: `] ::= "]" ws* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 77: `] ::= "]" [ws*] @void
      ((3<<5)|0x6)/*nullProductionAction:3*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 78: `; ::= ";" ws* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 79: `; ::= ";" [ws*] @void
      ((3<<5)|0x6)/*nullProductionAction:3*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 80: ID ::= letter128 ws* @text
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x4)/*stringConcat:1*/,
    },
    { // 81: ID ::= letter128 [ws*] @text
      ((3<<5)|0x6)/*nullProductionAction:3*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x4)/*stringConcat:1*/,
    },
    { // 82: ID ::= letter idChar* $$0 @text
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((3<<5)|0x4)/*stringConcat:3*/,
    },
    { // 83: ID ::= letter [idChar*] $$0 @text
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((4<<5)|0x6)/*nullProductionAction:4*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((3<<5)|0x4)/*stringConcat:3*/,
    },
    { // 84: INTLIT ::= {"1".."9"} digit* $$1 @convertToInt(char,List<Character>,char)=>int
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((20<<5)|0x5)/*methodCall:20*/,
    },
    { // 85: INTLIT ::= {"1".."9"} [digit*] $$1 @convertToInt(char,List<Character>,char)=>int
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((5<<5)|0x6)/*nullProductionAction:5*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((20<<5)|0x5)/*methodCall:20*/,
    },
    { // 86: INTLIT ::= digit128 ws* @convertToInt(char)=>int
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((21<<5)|0x5)/*methodCall:21*/,
    },
    { // 87: INTLIT ::= digit128 [ws*] @convertToInt(char)=>int
      ((3<<5)|0x6)/*nullProductionAction:3*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((21<<5)|0x5)/*methodCall:21*/,
    },
    { // 88: INTLIT ::= "0" hexDigit* $$2 @convert16ToInt(char,List<Character>,char)=>int
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((22<<5)|0x5)/*methodCall:22*/,
    },
    { // 89: INTLIT ::= "0" [hexDigit*] $$2 @convert16ToInt(char,List<Character>,char)=>int
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((0<<5)|0x6)/*nullProductionAction:0*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((22<<5)|0x5)/*methodCall:22*/,
    },
    { // 90: idChar ::= letter @pass
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
    },
    { // 91: idChar ::= digit @pass
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
    },
    { // 92: idChar ::= "_" @pass
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
    },
    { // 93: idChar128 ::= letter128 @pass
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
    },
    { // 94: idChar128 ::= digit128 @pass
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
    },
    { // 95: idChar128 ::= {223} @underscore(char)=>char
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((23<<5)|0x5)/*methodCall:23*/,
    },
    { // 96: hexDigit ::= {"0".."9" "A".."Z" "a".."z"} @pass
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
    },
    { // 97: hexDigit128 ::= {176..185 193..198 225..230} @sub128(char)=>char
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((19<<5)|0x5)/*methodCall:19*/,
    },
    { // 98: digit* ::= digit* digit @append
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xb)/*append:1*/,
    },
    { // 99: digit* ::= [digit*] digit @append
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((5<<5)|0x6)/*nullProductionAction:5*/,
      ((1<<5)|0xb)/*append:1*/,
    },
    { // 100: <decl in class>* ::= <decl in class>* <decl in class> @append
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xb)/*append:1*/,
    },
    { // 101: <decl in class>* ::= [<decl in class>*] <decl in class> @append
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((2<<5)|0x6)/*nullProductionAction:2*/,
      ((1<<5)|0xb)/*append:1*/,
    },
    { // 102: hexDigit* ::= hexDigit* hexDigit @append
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xb)/*append:1*/,
    },
    { // 103: hexDigit* ::= [hexDigit*] hexDigit @append
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((0<<5)|0x6)/*nullProductionAction:0*/,
      ((1<<5)|0xb)/*append:1*/,
    },
    { // 104: <stmt>* ::= <stmt>* <stmt> @append
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xb)/*append:1*/,
    },
    { // 105: <stmt>* ::= [<stmt>*] <stmt> @append
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x6)/*nullProductionAction:1*/,
      ((1<<5)|0xb)/*append:1*/,
    },
    { // 106: idChar* ::= idChar* idChar @append
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xb)/*append:1*/,
    },
    { // 107: idChar* ::= [idChar*] idChar @append
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((4<<5)|0x6)/*nullProductionAction:4*/,
      ((1<<5)|0xb)/*append:1*/,
    },
    { // 108: <class decl>+ ::= <class decl> @singleList
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xa)/*singleList:1*/,
    },
    { // 109: <class decl>+ ::= <class decl>+ <class decl> @append
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xb)/*append:1*/,
    },
    { // 110: ws* ::= ws* ws @append
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
    },
    { // 111: ws* ::= [ws*] ws @append
      ((1<<5)|0xe)/*popPos:1*/,
      ((3<<5)|0x6)/*nullProductionAction:3*/,
    },
    { // 112: $$0 ::= idChar128 ws* @pass
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
    },
    { // 113: $$0 ::= idChar128 [ws*] @pass
      ((3<<5)|0x6)/*nullProductionAction:3*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
    },
    { // 114: $$1 ::= digit128 ws* @pass
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
    },
    { // 115: $$1 ::= digit128 [ws*] @pass
      ((3<<5)|0x6)/*nullProductionAction:3*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
    },
    { // 116: $$2 ::= hexDigit128 ws* @pass
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
    },
    { // 117: $$2 ::= hexDigit128 [ws*] @pass
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
      ((24<<5)|0x5)/*methodCall:24*/,
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
      Exp parm0 = (Exp)si.popPb();
      int parm1 = (Integer)si.popPb();
      Exp parm2 = (Exp)si.popPb();
      Statement result = actionObject.assign(parm0,parm1,parm2);
      si.pushPb(result);
    }
    break;
    case 11: {
      Type parm0 = (Type)si.popPb();
      int parm1 = (Integer)si.popPb();
      String parm2 = (String)si.popPb();
      Exp parm3 = (Exp)si.popPb();
      Statement result = actionObject.localVarDecl(parm0,parm1,parm2,parm3);
      si.pushPb(result);
    }
    break;
    case 12: {
      Exp parm0 = (Exp)si.popPb();
      int parm1 = (Integer)si.popPb();
      Exp parm2 = (Exp)si.popPb();
      Exp result = actionObject.newPlus(parm0,parm1,parm2);
      si.pushPb(result);
    }
    break;
    case 13: {
      Exp parm0 = (Exp)si.popPb();
      int parm1 = (Integer)si.popPb();
      Exp parm2 = (Exp)si.popPb();
      Exp result = actionObject.newTimes(parm0,parm1,parm2);
      si.pushPb(result);
    }
    break;
    case 14: {
      int parm0 = (Integer)si.popPb();
      Type parm1 = (Type)si.popPb();
      Exp parm2 = (Exp)si.popPb();
      Exp result = actionObject.newCast(parm0,parm1,parm2);
      si.pushPb(result);
    }
    break;
    case 15: {
      int parm0 = (Integer)si.popPb();
      Exp parm1 = (Exp)si.popPb();
      Exp result = actionObject.newUnaryMinus(parm0,parm1);
      si.pushPb(result);
    }
    break;
    case 16: {
      int parm0 = (Integer)si.popPb();
      String parm1 = (String)si.popPb();
      Exp result = actionObject.newIdentfierExp(parm0,parm1);
      si.pushPb(result);
    }
    break;
    case 17: {
      Exp parm0 = (Exp)si.popPb();
      int parm1 = (Integer)si.popPb();
      Exp parm2 = (Exp)si.popPb();
      Exp result = actionObject.newArrayLookup(parm0,parm1,parm2);
      si.pushPb(result);
    }
    break;
    case 18: {
      int parm0 = (Integer)si.popPb();
      int parm1 = (Integer)si.popPb();
      Exp result = actionObject.newIntegerLiteral(parm0,parm1);
      si.pushPb(result);
    }
    break;
    case 19: {
      char parm0 = (Character)si.popPb();
      char result = actionObject.sub128(parm0);
      si.pushPb(result);
    }
    break;
    case 20: {
      char parm0 = (Character)si.popPb();
      List<Character> parm1 = (List<Character>)si.popPb();
      char parm2 = (Character)si.popPb();
      int result = actionObject.convertToInt(parm0,parm1,parm2);
      si.pushPb(result);
    }
    break;
    case 21: {
      char parm0 = (Character)si.popPb();
      int result = actionObject.convertToInt(parm0);
      si.pushPb(result);
    }
    break;
    case 22: {
      char parm0 = (Character)si.popPb();
      List<Character> parm1 = (List<Character>)si.popPb();
      char parm2 = (Character)si.popPb();
      int result = actionObject.convert16ToInt(parm0,parm1,parm2);
      si.pushPb(result);
    }
    break;
    case 23: {
      char parm0 = (Character)si.popPb();
      char result = actionObject.underscore(parm0);
      si.pushPb(result);
    }
    break;
    case 24: {
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
    1,
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
