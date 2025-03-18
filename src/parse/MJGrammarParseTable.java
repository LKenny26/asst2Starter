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
public int getEofSym() { return 90; }
public int getNttSym() { return 91; }
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
"\"b\"",
"{\"A\"..\"Z\" \"a\" \"d\"..\"h\" \"j\"..\"k\" \"m\"..\"n\" \"q\"..\"s\" \"w\"..\"z\"}",
"\"t\"",
"\"c\"",
"\"i\"",
"\"l\"",
"\"o\"",
"\"u\"",
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
public int numSymbols() { return 92;}
private static final int MIN_REDUCTION = 630;
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
1,561, // <start>
2,197, // ws*
3,178, // <program>
4,265, // <class decl>+
5,408, // <class decl>
6,489, // `class
63,341, // ws
64,130, // " "
65,184, // {10}
66,123, // "#"
  }
,
{ // state 1
  }
,
{ // state 2
MIN_REDUCTION+31, // (default reduction)
  }
,
{ // state 3
MIN_REDUCTION+21, // (default reduction)
  }
,
{ // state 4
63,295, // ws
64,153, // " "
65,208, // {10}
MIN_REDUCTION+66, // (default reduction)
  }
,
{ // state 5
2,380, // ws*
63,79, // ws
64,345, // " "
65,274, // {10}
MIN_REDUCTION+109, // (default reduction)
  }
,
{ // state 6
22,MIN_REDUCTION+110, // `[
63,55, // ws
64,164, // " "
65,19, // {10}
75,MIN_REDUCTION+110, // "["
MIN_REDUCTION+110, // (default reduction)
  }
,
{ // state 7
2,605, // ws*
63,133, // ws
64,49, // " "
65,557, // {10}
MIN_REDUCTION+45, // (default reduction)
  }
,
{ // state 8
MIN_REDUCTION+89, // (default reduction)
  }
,
{ // state 9
2,478, // ws*
63,80, // ws
64,342, // " "
65,273, // {10}
MIN_REDUCTION+57, // (default reduction)
  }
,
{ // state 10
0x80000000|90, // match move
0x80000000|48, // no-match move
0x80000000|46, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 11
0x80000000|407, // match move
0x80000000|386, // no-match move
0x80000000|46, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 12
MIN_REDUCTION+43, // (default reduction)
  }
,
{ // state 13
MIN_REDUCTION+22, // (default reduction)
  }
,
{ // state 14
2,105, // ws*
63,584, // ws
64,479, // " "
65,344, // {10}
MIN_REDUCTION+63, // (default reduction)
  }
,
{ // state 15
MIN_REDUCTION+23, // (default reduction)
  }
,
{ // state 16
0x80000000|405, // match move
0x80000000|382, // no-match move
0x80000000|46, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 17
MIN_REDUCTION+22, // (default reduction)
  }
,
{ // state 18
MIN_REDUCTION+23, // (default reduction)
  }
,
{ // state 19
0x80000000|1, // match move
0x80000000|237, // no-match move
0x80000000|46, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 20
2,592, // ws*
22,MIN_REDUCTION+77, // `[
63,120, // ws
64,10, // " "
65,109, // {10}
75,MIN_REDUCTION+77, // "["
MIN_REDUCTION+77, // (default reduction)
  }
,
{ // state 21
22,MIN_REDUCTION+85, // `[
75,MIN_REDUCTION+85, // "["
MIN_REDUCTION+85, // (default reduction)
  }
,
{ // state 22
22,MIN_REDUCTION+85, // `[
75,MIN_REDUCTION+85, // "["
MIN_REDUCTION+85, // (default reduction)
  }
,
{ // state 23
MIN_REDUCTION+107, // (default reduction)
  }
,
{ // state 24
MIN_REDUCTION+107, // (default reduction)
  }
,
{ // state 25
MIN_REDUCTION+18, // (default reduction)
  }
,
{ // state 26
22,MIN_REDUCTION+72, // `[
63,55, // ws
64,164, // " "
65,19, // {10}
75,MIN_REDUCTION+72, // "["
MIN_REDUCTION+72, // (default reduction)
  }
,
{ // state 27
-1, // $$start
-1, // <start>
-1, // ws*
-1, // <program>
-1, // <class decl>+
-1, // <class decl>
-1, // `class
253, // ID
27, // `{
-1, // <decl in class>*
200, // `}
-1, // <decl in class>
-1, // <method decl>
-1, // `public
-1, // `void
482, // `(
-1, // `)
175, // <stmt>*
209, // <type>
223, // `int
227, // `boolean
-1, // <empty bracket pair>
-1, // `[
-1, // `]
580, // <stmt>
256, // <assign>
-1, // `;
388, // <local var decl>
544, // <exp>
-1, // `=
465, // <exp8>
320, // <exp7>
13, // <exp6>
18, // <exp5>
108, // <exp4>
-1, // `+
447, // <exp3>
-1, // `*
82, // <exp2>
248, // <cast exp>
455, // <unary exp>
94, // <exp1>
141, // `-
436, // INTLIT
549, // letter
106, // "p"
106, // "v"
106, // "b"
106, // {"A".."Z" "a" "d".."h" "j".."k" "m".."n" "q".."s" "w".."z"}
106, // "t"
106, // "c"
106, // "i"
106, // "l"
106, // "o"
106, // "u"
365, // letter128
193, // {199..218 231..250}
193, // {193..198 225..230}
-1, // digit
258, // {"1".."9"}
401, // "0"
543, // digit128
573, // {176..185}
-1, // ws
-1, // " "
-1, // {10}
89, // "#"
-1, // "*"
261, // "("
-1, // ")"
180, // "{"
550, // "}"
587, // "-"
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
{ // state 28
0x80000000|340, // match move
0x80000000|152, // no-match move
0x80000000|46, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 29
15,162, // `(
68,9, // "("
  }
,
{ // state 30
22,MIN_REDUCTION+89, // `[
75,MIN_REDUCTION+89, // "["
MIN_REDUCTION+89, // (default reduction)
  }
,
{ // state 31
2,462, // ws*
  }
,
{ // state 32
0x80000000|1, // match move
0x80000000|307, // no-match move
0x80000000|46, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 33
22,MIN_REDUCTION+89, // `[
75,MIN_REDUCTION+89, // "["
MIN_REDUCTION+89, // (default reduction)
  }
,
{ // state 34
MIN_REDUCTION+42, // (default reduction)
  }
,
{ // state 35
0x80000000|1, // match move
0x80000000|312, // no-match move
0x80000000|46, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 36
53,441, // "o"
  }
,
{ // state 37
0x80000000|528, // match move
0x80000000|267, // no-match move
0x80000000|46, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 38
63,530, // ws
64,264, // " "
65,292, // {10}
MIN_REDUCTION+60, // (default reduction)
  }
,
{ // state 39
MIN_REDUCTION+42, // (default reduction)
  }
,
{ // state 40
91,MIN_REDUCTION+13, // $NT
  }
,
{ // state 41
MIN_REDUCTION+107, // (default reduction)
  }
,
{ // state 42
MIN_REDUCTION+78, // (default reduction)
  }
,
{ // state 43
0x80000000|340, // match move
0x80000000|509, // no-match move
0x80000000|46, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 44
44,622, // letter
45,74, // "p"
46,74, // "v"
47,74, // "b"
48,74, // {"A".."Z" "a" "d".."h" "j".."k" "m".."n" "q".."s" "w".."z"}
49,74, // "t"
50,74, // "c"
51,74, // "i"
52,74, // "l"
53,74, // "o"
54,74, // "u"
55,511, // letter128
56,193, // {199..218 231..250}
57,193, // {193..198 225..230}
58,281, // digit
59,242, // {"1".."9"}
60,242, // "0"
61,541, // digit128
62,161, // {176..185}
79,37, // $$0
84,566, // idChar
85,537, // "_"
86,588, // idChar128
87,540, // {223}
  }
,
{ // state 45
0x80000000|340, // match move
0x80000000|174, // no-match move
0x80000000|46, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 46
22,430, // `[
75,189, // "["
  }
,
{ // state 47
45,387, // "p"
46,387, // "v"
47,387, // "b"
48,387, // {"A".."Z" "a" "d".."h" "j".."k" "m".."n" "q".."s" "w".."z"}
49,387, // "t"
50,387, // "c"
51,387, // "i"
52,387, // "l"
53,387, // "o"
54,387, // "u"
57,73, // {193..198 225..230}
59,387, // {"1".."9"}
60,387, // "0"
62,73, // {176..185}
83,460, // $$2
88,78, // hexDigit
89,570, // hexDigit128
  }
,
{ // state 48
22,MIN_REDUCTION+42, // `[
75,MIN_REDUCTION+42, // "["
MIN_REDUCTION+42, // (default reduction)
  }
,
{ // state 49
MIN_REDUCTION+42, // (default reduction)
  }
,
{ // state 50
22,MIN_REDUCTION+90, // `[
75,MIN_REDUCTION+90, // "["
MIN_REDUCTION+90, // (default reduction)
  }
,
{ // state 51
22,MIN_REDUCTION+89, // `[
75,MIN_REDUCTION+89, // "["
MIN_REDUCTION+89, // (default reduction)
  }
,
{ // state 52
0x80000000|53, // match move
0x80000000|527, // no-match move
0x80000000|46, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 53
2,427, // ws*
  }
,
{ // state 54
MIN_REDUCTION+13, // (default reduction)
  }
,
{ // state 55
0x80000000|1, // match move
0x80000000|288, // no-match move
0x80000000|46, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 56
23,54, // `]
76,137, // "]"
  }
,
{ // state 57
MIN_REDUCTION+28, // (default reduction)
  }
,
{ // state 58
MIN_REDUCTION+41, // (default reduction)
  }
,
{ // state 59
MIN_REDUCTION+89, // (default reduction)
  }
,
{ // state 60
0x80000000|1, // match move
0x80000000|610, // no-match move
0x80000000|46, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 61
0x80000000|65, // match move
0x80000000|526, // no-match move
0x80000000|46, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 62
0x80000000|1, // match move
0x80000000|612, // no-match move
0x80000000|46, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 63
7,215, // ID
15,488, // `(
28,244, // <exp>
30,471, // <exp8>
31,316, // <exp7>
32,17, // <exp6>
33,15, // <exp5>
34,145, // <exp4>
36,446, // <exp3>
38,85, // <exp2>
39,246, // <cast exp>
40,458, // <unary exp>
41,122, // <exp1>
42,135, // `-
43,439, // INTLIT
44,276, // letter
45,106, // "p"
46,106, // "v"
47,106, // "b"
48,106, // {"A".."Z" "a" "d".."h" "j".."k" "m".."n" "q".."s" "w".."z"}
49,106, // "t"
50,106, // "c"
51,106, // "i"
52,106, // "l"
53,106, // "o"
54,106, // "u"
55,539, // letter128
56,43, // {199..218 231..250}
57,43, // {193..198 225..230}
59,259, // {"1".."9"}
60,400, // "0"
61,545, // digit128
62,574, // {176..185}
68,261, // "("
72,587, // "-"
  }
,
{ // state 64
63,547, // ws
64,325, // " "
65,301, // {10}
MIN_REDUCTION+74, // (default reduction)
  }
,
{ // state 65
2,429, // ws*
  }
,
{ // state 66
2,339, // ws*
63,41, // ws
64,367, // " "
65,220, // {10}
MIN_REDUCTION+109, // (default reduction)
  }
,
{ // state 67
MIN_REDUCTION+106, // (default reduction)
  }
,
{ // state 68
22,402, // `[
75,360, // "["
MIN_REDUCTION+34, // (default reduction)
  }
,
{ // state 69
MIN_REDUCTION+31, // (default reduction)
  }
,
{ // state 70
0x80000000|1, // match move
0x80000000|425, // no-match move
0x80000000|46, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 71
MIN_REDUCTION+31, // (default reduction)
  }
,
{ // state 72
35,495, // `+
73,563, // "+"
MIN_REDUCTION+24, // (default reduction)
  }
,
{ // state 73
0x80000000|157, // match move
0x80000000|411, // no-match move
0x80000000|46, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 74
MIN_REDUCTION+38, // (default reduction)
  }
,
{ // state 75
0x80000000|1, // match move
0x80000000|437, // no-match move
0x80000000|46, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 76
44,622, // letter
45,74, // "p"
46,74, // "v"
47,74, // "b"
48,74, // {"A".."Z" "a" "d".."h" "j".."k" "m".."n" "q".."s" "w".."z"}
49,74, // "t"
50,74, // "c"
51,74, // "i"
52,74, // "l"
53,74, // "o"
54,74, // "u"
55,507, // letter128
56,28, // {199..218 231..250}
57,28, // {193..198 225..230}
58,281, // digit
59,242, // {"1".."9"}
60,242, // "0"
61,87, // digit128
62,589, // {176..185}
78,125, // idChar*
79,317, // $$0
84,497, // idChar
85,537, // "_"
86,144, // idChar128
87,240, // {223}
  }
,
{ // state 77
MIN_REDUCTION+78, // (default reduction)
  }
,
{ // state 78
MIN_REDUCTION+98, // (default reduction)
  }
,
{ // state 79
MIN_REDUCTION+107, // (default reduction)
  }
,
{ // state 80
MIN_REDUCTION+107, // (default reduction)
  }
,
{ // state 81
2,611, // ws*
63,133, // ws
64,49, // " "
65,557, // {10}
MIN_REDUCTION+51, // (default reduction)
  }
,
{ // state 82
MIN_REDUCTION+28, // (default reduction)
  }
,
{ // state 83
63,163, // ws
64,313, // " "
65,337, // {10}
MIN_REDUCTION+52, // (default reduction)
  }
,
{ // state 84
22,MIN_REDUCTION+106, // `[
75,MIN_REDUCTION+106, // "["
MIN_REDUCTION+106, // (default reduction)
  }
,
{ // state 85
MIN_REDUCTION+28, // (default reduction)
  }
,
{ // state 86
22,399, // `[
75,360, // "["
MIN_REDUCTION+34, // (default reduction)
  }
,
{ // state 87
0x80000000|463, // match move
0x80000000|582, // no-match move
0x80000000|46, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 88
7,215, // ID
15,488, // `(
39,69, // <cast exp>
41,371, // <exp1>
43,439, // INTLIT
44,276, // letter
45,106, // "p"
46,106, // "v"
47,106, // "b"
48,106, // {"A".."Z" "a" "d".."h" "j".."k" "m".."n" "q".."s" "w".."z"}
49,106, // "t"
50,106, // "c"
51,106, // "i"
52,106, // "l"
53,106, // "o"
54,106, // "u"
55,539, // letter128
56,43, // {199..218 231..250}
57,43, // {193..198 225..230}
59,259, // {"1".."9"}
60,400, // "0"
61,545, // digit128
62,574, // {176..185}
68,261, // "("
  }
,
{ // state 89
47,464, // "b"
51,172, // "i"
  }
,
{ // state 90
MIN_REDUCTION+42, // (default reduction)
  }
,
{ // state 91
MIN_REDUCTION+15, // (default reduction)
  }
,
{ // state 92
63,357, // ws
64,496, // " "
65,114, // {10}
MIN_REDUCTION+44, // (default reduction)
  }
,
{ // state 93
0x80000000|1, // match move
0x80000000|542, // no-match move
0x80000000|46, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 94
0x80000000|1, // match move
0x80000000|86, // no-match move
0x80000000|46, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 95
MIN_REDUCTION+79, // (default reduction)
  }
,
{ // state 96
MIN_REDUCTION+106, // (default reduction)
  }
,
{ // state 97
MIN_REDUCTION+106, // (default reduction)
  }
,
{ // state 98
MIN_REDUCTION+43, // (default reduction)
  }
,
{ // state 99
22,MIN_REDUCTION+79, // `[
75,MIN_REDUCTION+79, // "["
MIN_REDUCTION+79, // (default reduction)
  }
,
{ // state 100
0x80000000|335, // match move
0x80000000|260, // no-match move
0x80000000|46, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 101
0x80000000|463, // match move
0x80000000|534, // no-match move
0x80000000|46, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 102
22,MIN_REDUCTION+79, // `[
75,MIN_REDUCTION+79, // "["
MIN_REDUCTION+79, // (default reduction)
  }
,
{ // state 103
0x80000000|335, // match move
0x80000000|263, // no-match move
0x80000000|46, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 104
0x80000000|463, // match move
0x80000000|536, // no-match move
0x80000000|46, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 105
63,124, // ws
64,479, // " "
65,344, // {10}
MIN_REDUCTION+62, // (default reduction)
  }
,
{ // state 106
MIN_REDUCTION+38, // (default reduction)
  }
,
{ // state 107
0x80000000|1, // match move
0x80000000|384, // no-match move
0x80000000|46, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 108
35,468, // `+
73,563, // "+"
MIN_REDUCTION+24, // (default reduction)
  }
,
{ // state 109
0x80000000|290, // match move
0x80000000|250, // no-match move
0x80000000|46, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 110
63,311, // ws
64,551, // " "
65,98, // {10}
MIN_REDUCTION+62, // (default reduction)
  }
,
{ // state 111
MIN_REDUCTION+7, // (default reduction)
  }
,
{ // state 112
45,387, // "p"
46,387, // "v"
47,387, // "b"
48,387, // {"A".."Z" "a" "d".."h" "j".."k" "m".."n" "q".."s" "w".."z"}
49,387, // "t"
50,387, // "c"
51,387, // "i"
52,387, // "l"
53,387, // "o"
54,387, // "u"
57,251, // {193..198 225..230}
59,387, // {"1".."9"}
60,387, // "0"
62,251, // {176..185}
83,487, // $$2
88,78, // hexDigit
89,61, // hexDigit128
  }
,
{ // state 113
45,387, // "p"
46,387, // "v"
47,387, // "b"
48,387, // {"A".."Z" "a" "d".."h" "j".."k" "m".."n" "q".."s" "w".."z"}
49,387, // "t"
50,387, // "c"
51,387, // "i"
52,387, // "l"
53,387, // "o"
54,387, // "u"
57,247, // {193..198 225..230}
59,387, // {"1".."9"}
60,387, // "0"
62,247, // {176..185}
83,490, // $$2
88,78, // hexDigit
89,52, // hexDigit128
  }
,
{ // state 114
MIN_REDUCTION+43, // (default reduction)
  }
,
{ // state 115
0x80000000|1, // match move
0x80000000|552, // no-match move
0x80000000|46, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 116
63,170, // ws
64,302, // " "
65,336, // {10}
MIN_REDUCTION+70, // (default reduction)
  }
,
{ // state 117
0x80000000|1, // match move
0x80000000|553, // no-match move
0x80000000|46, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 118
2,272, // ws*
22,MIN_REDUCTION+77, // `[
63,449, // ws
64,146, // " "
65,166, // {10}
75,MIN_REDUCTION+77, // "["
MIN_REDUCTION+77, // (default reduction)
  }
,
{ // state 119
MIN_REDUCTION+107, // (default reduction)
  }
,
{ // state 120
0x80000000|228, // match move
0x80000000|483, // no-match move
0x80000000|46, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 121
2,269, // ws*
22,MIN_REDUCTION+77, // `[
63,452, // ws
64,149, // " "
65,160, // {10}
75,MIN_REDUCTION+77, // "["
MIN_REDUCTION+77, // (default reduction)
  }
,
{ // state 122
0x80000000|1, // match move
0x80000000|68, // no-match move
0x80000000|46, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 123
50,406, // "c"
  }
,
{ // state 124
MIN_REDUCTION+106, // (default reduction)
  }
,
{ // state 125
44,622, // letter
45,74, // "p"
46,74, // "v"
47,74, // "b"
48,74, // {"A".."Z" "a" "d".."h" "j".."k" "m".."n" "q".."s" "w".."z"}
49,74, // "t"
50,74, // "c"
51,74, // "i"
52,74, // "l"
53,74, // "o"
54,74, // "u"
55,507, // letter128
56,28, // {199..218 231..250}
57,28, // {193..198 225..230}
58,281, // digit
59,242, // {"1".."9"}
60,242, // "0"
61,87, // digit128
62,589, // {176..185}
79,93, // $$0
84,566, // idChar
85,537, // "_"
86,144, // idChar128
87,240, // {223}
  }
,
{ // state 126
22,MIN_REDUCTION+108, // `[
63,55, // ws
64,164, // " "
65,19, // {10}
75,MIN_REDUCTION+108, // "["
MIN_REDUCTION+108, // (default reduction)
  }
,
{ // state 127
22,MIN_REDUCTION+79, // `[
75,MIN_REDUCTION+79, // "["
MIN_REDUCTION+79, // (default reduction)
  }
,
{ // state 128
22,373, // `[
75,360, // "["
MIN_REDUCTION+34, // (default reduction)
  }
,
{ // state 129
7,217, // ID
15,482, // `(
39,71, // <cast exp>
41,372, // <exp1>
43,436, // INTLIT
44,282, // letter
45,106, // "p"
46,106, // "v"
47,106, // "b"
48,106, // {"A".."Z" "a" "d".."h" "j".."k" "m".."n" "q".."s" "w".."z"}
49,106, // "t"
50,106, // "c"
51,106, // "i"
52,106, // "l"
53,106, // "o"
54,106, // "u"
55,538, // letter128
56,45, // {199..218 231..250}
57,45, // {193..198 225..230}
59,258, // {"1".."9"}
60,401, // "0"
61,543, // digit128
62,573, // {176..185}
68,261, // "("
  }
,
{ // state 130
MIN_REDUCTION+42, // (default reduction)
  }
,
{ // state 131
MIN_REDUCTION+10, // (default reduction)
  }
,
{ // state 132
MIN_REDUCTION+100, // (default reduction)
  }
,
{ // state 133
MIN_REDUCTION+107, // (default reduction)
  }
,
{ // state 134
-1, // $$start
-1, // <start>
-1, // ws*
-1, // <program>
-1, // <class decl>+
-1, // <class decl>
-1, // `class
253, // ID
27, // `{
-1, // <decl in class>*
597, // `}
-1, // <decl in class>
-1, // <method decl>
-1, // `public
-1, // `void
482, // `(
-1, // `)
529, // <stmt>*
209, // <type>
223, // `int
227, // `boolean
-1, // <empty bracket pair>
-1, // `[
-1, // `]
580, // <stmt>
256, // <assign>
-1, // `;
388, // <local var decl>
544, // <exp>
-1, // `=
465, // <exp8>
320, // <exp7>
13, // <exp6>
18, // <exp5>
108, // <exp4>
-1, // `+
447, // <exp3>
-1, // `*
82, // <exp2>
248, // <cast exp>
455, // <unary exp>
94, // <exp1>
141, // `-
436, // INTLIT
549, // letter
106, // "p"
106, // "v"
106, // "b"
106, // {"A".."Z" "a" "d".."h" "j".."k" "m".."n" "q".."s" "w".."z"}
106, // "t"
106, // "c"
106, // "i"
106, // "l"
106, // "o"
106, // "u"
365, // letter128
193, // {199..218 231..250}
193, // {193..198 225..230}
-1, // digit
258, // {"1".."9"}
401, // "0"
543, // digit128
573, // {176..185}
-1, // ws
-1, // " "
-1, // {10}
89, // "#"
-1, // "*"
261, // "("
-1, // ")"
180, // "{"
177, // "}"
587, // "-"
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
{ // state 135
7,215, // ID
40,608, // <unary exp>
41,122, // <exp1>
42,135, // `-
43,439, // INTLIT
44,276, // letter
45,106, // "p"
46,106, // "v"
47,106, // "b"
48,106, // {"A".."Z" "a" "d".."h" "j".."k" "m".."n" "q".."s" "w".."z"}
49,106, // "t"
50,106, // "c"
51,106, // "i"
52,106, // "l"
53,106, // "o"
54,106, // "u"
55,539, // letter128
56,43, // {199..218 231..250}
57,43, // {193..198 225..230}
59,259, // {"1".."9"}
60,400, // "0"
61,545, // digit128
62,574, // {176..185}
72,587, // "-"
  }
,
{ // state 136
37,414, // `*
67,457, // "*"
MIN_REDUCTION+25, // (default reduction)
  }
,
{ // state 137
2,327, // ws*
63,133, // ws
64,49, // " "
65,557, // {10}
MIN_REDUCTION+73, // (default reduction)
  }
,
{ // state 138
37,422, // `*
67,457, // "*"
MIN_REDUCTION+25, // (default reduction)
  }
,
{ // state 139
MIN_REDUCTION+79, // (default reduction)
  }
,
{ // state 140
0x80000000|1, // match move
0x80000000|128, // no-match move
0x80000000|46, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 141
7,217, // ID
40,603, // <unary exp>
41,94, // <exp1>
42,141, // `-
43,436, // INTLIT
44,282, // letter
45,106, // "p"
46,106, // "v"
47,106, // "b"
48,106, // {"A".."Z" "a" "d".."h" "j".."k" "m".."n" "q".."s" "w".."z"}
49,106, // "t"
50,106, // "c"
51,106, // "i"
52,106, // "l"
53,106, // "o"
54,106, // "u"
55,538, // letter128
56,45, // {199..218 231..250}
57,45, // {193..198 225..230}
59,258, // {"1".."9"}
60,401, // "0"
61,543, // digit128
62,573, // {176..185}
72,587, // "-"
  }
,
{ // state 142
2,392, // ws*
63,238, // ws
64,496, // " "
65,114, // {10}
MIN_REDUCTION+77, // (default reduction)
  }
,
{ // state 143
0x80000000|1, // match move
0x80000000|126, // no-match move
0x80000000|46, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 144
0x80000000|385, // match move
0x80000000|508, // no-match move
0x80000000|46, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 145
35,481, // `+
73,563, // "+"
MIN_REDUCTION+24, // (default reduction)
  }
,
{ // state 146
0x80000000|1, // match move
0x80000000|287, // no-match move
0x80000000|46, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 147
44,622, // letter
45,74, // "p"
46,74, // "v"
47,74, // "b"
48,74, // {"A".."Z" "a" "d".."h" "j".."k" "m".."n" "q".."s" "w".."z"}
49,74, // "t"
50,74, // "c"
51,74, // "i"
52,74, // "l"
53,74, // "o"
54,74, // "u"
55,362, // letter128
56,45, // {199..218 231..250}
57,45, // {193..198 225..230}
58,281, // digit
59,242, // {"1".."9"}
60,242, // "0"
61,104, // digit128
62,573, // {176..185}
79,117, // $$0
84,566, // idChar
85,537, // "_"
86,16, // idChar128
87,103, // {223}
  }
,
{ // state 148
2,428, // ws*
63,23, // ws
64,417, // " "
65,185, // {10}
MIN_REDUCTION+109, // (default reduction)
  }
,
{ // state 149
0x80000000|1, // match move
0x80000000|284, // no-match move
0x80000000|46, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 150
44,622, // letter
45,74, // "p"
46,74, // "v"
47,74, // "b"
48,74, // {"A".."Z" "a" "d".."h" "j".."k" "m".."n" "q".."s" "w".."z"}
49,74, // "t"
50,74, // "c"
51,74, // "i"
52,74, // "l"
53,74, // "o"
54,74, // "u"
55,366, // letter128
56,43, // {199..218 231..250}
57,43, // {193..198 225..230}
58,281, // digit
59,242, // {"1".."9"}
60,242, // "0"
61,101, // digit128
62,574, // {176..185}
79,115, // $$0
84,566, // idChar
85,537, // "_"
86,11, // idChar128
87,100, // {223}
  }
,
{ // state 151
22,MIN_REDUCTION+107, // `[
75,MIN_REDUCTION+107, // "["
MIN_REDUCTION+107, // (default reduction)
  }
,
{ // state 152
22,MIN_REDUCTION+39, // `[
75,MIN_REDUCTION+39, // "["
MIN_REDUCTION+39, // (default reduction)
  }
,
{ // state 153
MIN_REDUCTION+42, // (default reduction)
  }
,
{ // state 154
2,592, // ws*
MIN_REDUCTION+77, // (default reduction)
  }
,
{ // state 155
MIN_REDUCTION+89, // (default reduction)
  }
,
{ // state 156
MIN_REDUCTION+107, // (default reduction)
  }
,
{ // state 157
MIN_REDUCTION+93, // (default reduction)
  }
,
{ // state 158
7,226, // ID
40,623, // <unary exp>
41,140, // <exp1>
42,158, // `-
43,423, // INTLIT
44,76, // letter
45,106, // "p"
46,106, // "v"
47,106, // "b"
48,106, // {"A".."Z" "a" "d".."h" "j".."k" "m".."n" "q".."s" "w".."z"}
49,106, // "t"
50,106, // "c"
51,106, // "i"
52,106, // "l"
53,106, // "o"
54,106, // "u"
55,514, // letter128
56,28, // {199..218 231..250}
57,28, // {193..198 225..230}
59,219, // {"1".."9"}
60,352, // "0"
61,520, // digit128
62,589, // {176..185}
72,587, // "-"
  }
,
{ // state 159
MIN_REDUCTION+43, // (default reduction)
  }
,
{ // state 160
0x80000000|1, // match move
0x80000000|191, // no-match move
0x80000000|46, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 161
0x80000000|438, // match move
0x80000000|585, // no-match move
0x80000000|46, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 162
16,297, // `)
69,555, // ")"
  }
,
{ // state 163
MIN_REDUCTION+106, // (default reduction)
  }
,
{ // state 164
0x80000000|1, // match move
0x80000000|257, // no-match move
0x80000000|46, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 165
0x80000000|440, // match move
0x80000000|84, // no-match move
0x80000000|46, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 166
0x80000000|1, // match move
0x80000000|186, // no-match move
0x80000000|46, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 167
22,MIN_REDUCTION+107, // `[
75,MIN_REDUCTION+107, // "["
MIN_REDUCTION+107, // (default reduction)
  }
,
{ // state 168
MIN_REDUCTION+91, // (default reduction)
  }
,
{ // state 169
22,MIN_REDUCTION+107, // `[
75,MIN_REDUCTION+107, // "["
MIN_REDUCTION+107, // (default reduction)
  }
,
{ // state 170
MIN_REDUCTION+106, // (default reduction)
  }
,
{ // state 171
7,226, // ID
15,363, // `(
39,2, // <cast exp>
41,410, // <exp1>
43,423, // INTLIT
44,76, // letter
45,106, // "p"
46,106, // "v"
47,106, // "b"
48,106, // {"A".."Z" "a" "d".."h" "j".."k" "m".."n" "q".."s" "w".."z"}
49,106, // "t"
50,106, // "c"
51,106, // "i"
52,106, // "l"
53,106, // "o"
54,106, // "u"
55,514, // letter128
56,28, // {199..218 231..250}
57,28, // {193..198 225..230}
59,219, // {"1".."9"}
60,352, // "0"
61,520, // digit128
62,589, // {176..185}
68,261, // "("
  }
,
{ // state 172
49,81, // "t"
  }
,
{ // state 173
MIN_REDUCTION+42, // (default reduction)
  }
,
{ // state 174
22,MIN_REDUCTION+39, // `[
75,MIN_REDUCTION+39, // "["
MIN_REDUCTION+39, // (default reduction)
  }
,
{ // state 175
-1, // $$start
-1, // <start>
-1, // ws*
-1, // <program>
-1, // <class decl>+
-1, // <class decl>
-1, // `class
253, // ID
27, // `{
-1, // <decl in class>*
91, // `}
-1, // <decl in class>
-1, // <method decl>
-1, // `public
-1, // `void
482, // `(
-1, // `)
-1, // <stmt>*
209, // <type>
223, // `int
227, // `boolean
-1, // <empty bracket pair>
-1, // `[
-1, // `]
132, // <stmt>
256, // <assign>
-1, // `;
388, // <local var decl>
544, // <exp>
-1, // `=
465, // <exp8>
320, // <exp7>
13, // <exp6>
18, // <exp5>
108, // <exp4>
-1, // `+
447, // <exp3>
-1, // `*
82, // <exp2>
248, // <cast exp>
455, // <unary exp>
94, // <exp1>
141, // `-
436, // INTLIT
549, // letter
106, // "p"
106, // "v"
106, // "b"
106, // {"A".."Z" "a" "d".."h" "j".."k" "m".."n" "q".."s" "w".."z"}
106, // "t"
106, // "c"
106, // "i"
106, // "l"
106, // "o"
106, // "u"
365, // letter128
193, // {199..218 231..250}
193, // {193..198 225..230}
-1, // digit
258, // {"1".."9"}
401, // "0"
543, // digit128
573, // {176..185}
-1, // ws
-1, // " "
-1, // {10}
89, // "#"
-1, // "*"
261, // "("
-1, // ")"
180, // "{"
550, // "}"
587, // "-"
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
{ // state 176
0x80000000|501, // match move
0x80000000|231, // no-match move
0x80000000|46, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 177
2,110, // ws*
63,156, // ws
64,551, // " "
65,98, // {10}
MIN_REDUCTION+63, // (default reduction)
  }
,
{ // state 178
MIN_REDUCTION+2, // (default reduction)
  }
,
{ // state 179
2,361, // ws*
22,MIN_REDUCTION+111, // `[
63,434, // ws
64,164, // " "
65,19, // {10}
75,MIN_REDUCTION+111, // "["
MIN_REDUCTION+111, // (default reduction)
  }
,
{ // state 180
2,523, // ws*
63,286, // ws
64,34, // " "
65,616, // {10}
MIN_REDUCTION+61, // (default reduction)
  }
,
{ // state 181
0x80000000|505, // match move
0x80000000|233, // no-match move
0x80000000|46, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 182
37,359, // `*
67,457, // "*"
MIN_REDUCTION+25, // (default reduction)
  }
,
{ // state 183
2,416, // ws*
MIN_REDUCTION+109, // (default reduction)
  }
,
{ // state 184
MIN_REDUCTION+43, // (default reduction)
  }
,
{ // state 185
MIN_REDUCTION+43, // (default reduction)
  }
,
{ // state 186
22,MIN_REDUCTION+43, // `[
75,MIN_REDUCTION+43, // "["
MIN_REDUCTION+43, // (default reduction)
  }
,
{ // state 187
0x80000000|1, // match move
0x80000000|624, // no-match move
0x80000000|46, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 188
0x80000000|1, // match move
0x80000000|450, // no-match move
0x80000000|46, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 189
2,289, // ws*
63,24, // ws
64,389, // " "
65,235, // {10}
MIN_REDUCTION+71, // (default reduction)
  }
,
{ // state 190
2,271, // ws*
  }
,
{ // state 191
22,MIN_REDUCTION+43, // `[
75,MIN_REDUCTION+43, // "["
MIN_REDUCTION+43, // (default reduction)
  }
,
{ // state 192
0x80000000|1, // match move
0x80000000|453, // no-match move
0x80000000|46, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 193
0x80000000|356, // match move
0x80000000|294, // no-match move
0x80000000|46, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 194
MIN_REDUCTION+43, // (default reduction)
  }
,
{ // state 195
0x80000000|1, // match move
0x80000000|626, // no-match move
0x80000000|46, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 196
MIN_REDUCTION+79, // (default reduction)
  }
,
{ // state 197
3,606, // <program>
4,265, // <class decl>+
5,408, // <class decl>
6,489, // `class
63,280, // ws
64,130, // " "
65,184, // {10}
66,123, // "#"
  }
,
{ // state 198
MIN_REDUCTION+5, // (default reduction)
  }
,
{ // state 199
44,622, // letter
45,74, // "p"
46,74, // "v"
47,74, // "b"
48,74, // {"A".."Z" "a" "d".."h" "j".."k" "m".."n" "q".."s" "w".."z"}
49,74, // "t"
50,74, // "c"
51,74, // "i"
52,74, // "l"
53,74, // "o"
54,74, // "u"
55,390, // letter128
56,334, // {199..218 231..250}
57,334, // {193..198 225..230}
58,281, // digit
59,242, // {"1".."9"}
60,242, // "0"
61,532, // digit128
62,255, // {176..185}
78,243, // idChar*
79,202, // $$0
84,497, // idChar
85,537, // "_"
86,358, // idChar128
87,168, // {223}
  }
,
{ // state 200
MIN_REDUCTION+16, // (default reduction)
  }
,
{ // state 201
63,546, // ws
64,417, // " "
65,185, // {10}
MIN_REDUCTION+58, // (default reduction)
  }
,
{ // state 202
MIN_REDUCTION+79, // (default reduction)
  }
,
{ // state 203
22,MIN_REDUCTION+81, // `[
75,MIN_REDUCTION+81, // "["
MIN_REDUCTION+81, // (default reduction)
  }
,
{ // state 204
22,MIN_REDUCTION+81, // `[
75,MIN_REDUCTION+81, // "["
MIN_REDUCTION+81, // (default reduction)
  }
,
{ // state 205
0x80000000|1, // match move
0x80000000|477, // no-match move
0x80000000|46, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 206
2,64, // ws*
63,413, // ws
64,325, // " "
65,301, // {10}
MIN_REDUCTION+75, // (default reduction)
  }
,
{ // state 207
22,MIN_REDUCTION+76, // `[
63,165, // ws
64,10, // " "
65,109, // {10}
75,MIN_REDUCTION+76, // "["
MIN_REDUCTION+76, // (default reduction)
  }
,
{ // state 208
MIN_REDUCTION+43, // (default reduction)
  }
,
{ // state 209
7,513, // ID
21,270, // <empty bracket pair>
22,56, // `[
44,593, // letter
45,106, // "p"
46,106, // "v"
47,106, // "b"
48,106, // {"A".."Z" "a" "d".."h" "j".."k" "m".."n" "q".."s" "w".."z"}
49,106, // "t"
50,106, // "c"
51,106, // "i"
52,106, // "l"
53,106, // "o"
54,106, // "u"
55,415, // letter128
56,368, // {199..218 231..250}
57,368, // {193..198 225..230}
75,189, // "["
  }
,
{ // state 210
2,475, // ws*
22,MIN_REDUCTION+111, // `[
63,452, // ws
64,149, // " "
65,160, // {10}
75,MIN_REDUCTION+111, // "["
MIN_REDUCTION+111, // (default reduction)
  }
,
{ // state 211
22,MIN_REDUCTION+108, // `[
63,165, // ws
64,10, // " "
65,109, // {10}
75,MIN_REDUCTION+108, // "["
MIN_REDUCTION+108, // (default reduction)
  }
,
{ // state 212
MIN_REDUCTION+6, // (default reduction)
  }
,
{ // state 213
0x80000000|190, // match move
0x80000000|285, // no-match move
0x80000000|46, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 214
2,480, // ws*
22,MIN_REDUCTION+111, // `[
63,449, // ws
64,146, // " "
65,166, // {10}
75,MIN_REDUCTION+111, // "["
MIN_REDUCTION+111, // (default reduction)
  }
,
{ // state 215
0x80000000|1, // match move
0x80000000|614, // no-match move
0x80000000|46, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 216
MIN_REDUCTION+106, // (default reduction)
  }
,
{ // state 217
0x80000000|1, // match move
0x80000000|619, // no-match move
0x80000000|46, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 218
MIN_REDUCTION+105, // (default reduction)
  }
,
{ // state 219
58,568, // digit
59,412, // {"1".."9"}
60,412, // "0"
61,601, // digit128
62,589, // {176..185}
80,517, // digit*
81,445, // $$1
  }
,
{ // state 220
MIN_REDUCTION+43, // (default reduction)
  }
,
{ // state 221
63,97, // ws
64,39, // " "
65,230, // {10}
MIN_REDUCTION+58, // (default reduction)
  }
,
{ // state 222
63,330, // ws
64,466, // " "
65,159, // {10}
MIN_REDUCTION+56, // (default reduction)
  }
,
{ // state 223
MIN_REDUCTION+9, // (default reduction)
  }
,
{ // state 224
MIN_REDUCTION+14, // (default reduction)
  }
,
{ // state 225
MIN_REDUCTION+17, // (default reduction)
  }
,
{ // state 226
0x80000000|1, // match move
0x80000000|600, // no-match move
0x80000000|46, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 227
MIN_REDUCTION+10, // (default reduction)
  }
,
{ // state 228
MIN_REDUCTION+107, // (default reduction)
  }
,
{ // state 229
2,314, // ws*
22,MIN_REDUCTION+77, // `[
63,434, // ws
64,164, // " "
65,19, // {10}
75,MIN_REDUCTION+77, // "["
MIN_REDUCTION+77, // (default reduction)
  }
,
{ // state 230
MIN_REDUCTION+43, // (default reduction)
  }
,
{ // state 231
2,62, // ws*
22,MIN_REDUCTION+73, // `[
63,449, // ws
64,146, // " "
65,166, // {10}
75,MIN_REDUCTION+73, // "["
MIN_REDUCTION+73, // (default reduction)
  }
,
{ // state 232
63,357, // ws
64,496, // " "
65,114, // {10}
MIN_REDUCTION+108, // (default reduction)
  }
,
{ // state 233
2,60, // ws*
22,MIN_REDUCTION+73, // `[
63,452, // ws
64,149, // " "
65,160, // {10}
75,MIN_REDUCTION+73, // "["
MIN_REDUCTION+73, // (default reduction)
  }
,
{ // state 234
63,357, // ws
64,496, // " "
65,114, // {10}
MIN_REDUCTION+50, // (default reduction)
  }
,
{ // state 235
MIN_REDUCTION+43, // (default reduction)
  }
,
{ // state 236
22,MIN_REDUCTION+108, // `[
63,35, // ws
64,149, // " "
65,160, // {10}
75,MIN_REDUCTION+108, // "["
MIN_REDUCTION+108, // (default reduction)
  }
,
{ // state 237
22,MIN_REDUCTION+43, // `[
75,MIN_REDUCTION+43, // "["
MIN_REDUCTION+43, // (default reduction)
  }
,
{ // state 238
MIN_REDUCTION+107, // (default reduction)
  }
,
{ // state 239
22,MIN_REDUCTION+108, // `[
63,32, // ws
64,146, // " "
65,166, // {10}
75,MIN_REDUCTION+108, // "["
MIN_REDUCTION+108, // (default reduction)
  }
,
{ // state 240
0x80000000|335, // match move
0x80000000|291, // no-match move
0x80000000|46, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 241
63,548, // ws
64,367, // " "
65,220, // {10}
MIN_REDUCTION+76, // (default reduction)
  }
,
{ // state 242
MIN_REDUCTION+40, // (default reduction)
  }
,
{ // state 243
44,622, // letter
45,74, // "p"
46,74, // "v"
47,74, // "b"
48,74, // {"A".."Z" "a" "d".."h" "j".."k" "m".."n" "q".."s" "w".."z"}
49,74, // "t"
50,74, // "c"
51,74, // "i"
52,74, // "l"
53,74, // "o"
54,74, // "u"
55,390, // letter128
56,334, // {199..218 231..250}
57,334, // {193..198 225..230}
58,281, // digit
59,242, // {"1".."9"}
60,242, // "0"
61,532, // digit128
62,255, // {176..185}
79,596, // $$0
84,566, // idChar
85,537, // "_"
86,358, // idChar128
87,168, // {223}
  }
,
{ // state 244
MIN_REDUCTION+19, // (default reduction)
  }
,
{ // state 245
8,431, // `{
70,376, // "{"
  }
,
{ // state 246
MIN_REDUCTION+29, // (default reduction)
  }
,
{ // state 247
0x80000000|157, // match move
0x80000000|397, // no-match move
0x80000000|46, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 248
MIN_REDUCTION+29, // (default reduction)
  }
,
{ // state 249
MIN_REDUCTION+78, // (default reduction)
  }
,
{ // state 250
22,MIN_REDUCTION+43, // `[
75,MIN_REDUCTION+43, // "["
MIN_REDUCTION+43, // (default reduction)
  }
,
{ // state 251
0x80000000|157, // match move
0x80000000|393, // no-match move
0x80000000|46, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 252
MIN_REDUCTION+90, // (default reduction)
  }
,
{ // state 253
0x80000000|442, // match move
0x80000000|395, // no-match move
0x80000000|46, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 254
63,515, // ws
64,345, // " "
65,274, // {10}
MIN_REDUCTION+76, // (default reduction)
  }
,
{ // state 255
MIN_REDUCTION+41, // (default reduction)
  }
,
{ // state 256
26,224, // `;
77,206, // ";"
  }
,
{ // state 257
22,MIN_REDUCTION+42, // `[
75,MIN_REDUCTION+42, // "["
MIN_REDUCTION+42, // (default reduction)
  }
,
{ // state 258
58,568, // digit
59,412, // {"1".."9"}
60,412, // "0"
61,571, // digit128
62,573, // {176..185}
80,618, // digit*
81,470, // $$1
  }
,
{ // state 259
58,568, // digit
59,412, // {"1".."9"}
60,412, // "0"
61,575, // digit128
62,574, // {176..185}
80,613, // digit*
81,467, // $$1
  }
,
{ // state 260
22,MIN_REDUCTION+91, // `[
75,MIN_REDUCTION+91, // "["
MIN_REDUCTION+91, // (default reduction)
  }
,
{ // state 261
2,222, // ws*
63,119, // ws
64,466, // " "
65,159, // {10}
MIN_REDUCTION+57, // (default reduction)
  }
,
{ // state 262
63,268, // ws
64,173, // " "
65,194, // {10}
MIN_REDUCTION+54, // (default reduction)
  }
,
{ // state 263
22,MIN_REDUCTION+91, // `[
75,MIN_REDUCTION+91, // "["
MIN_REDUCTION+91, // (default reduction)
  }
,
{ // state 264
MIN_REDUCTION+42, // (default reduction)
  }
,
{ // state 265
5,218, // <class decl>
6,489, // `class
66,123, // "#"
MIN_REDUCTION+3, // (default reduction)
  }
,
{ // state 266
49,472, // "t"
  }
,
{ // state 267
22,MIN_REDUCTION+78, // `[
75,MIN_REDUCTION+78, // "["
MIN_REDUCTION+78, // (default reduction)
  }
,
{ // state 268
MIN_REDUCTION+106, // (default reduction)
  }
,
{ // state 269
0x80000000|1, // match move
0x80000000|298, // no-match move
0x80000000|46, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 270
MIN_REDUCTION+12, // (default reduction)
  }
,
{ // state 271
0x80000000|1, // match move
0x80000000|26, // no-match move
0x80000000|46, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 272
0x80000000|1, // match move
0x80000000|275, // no-match move
0x80000000|46, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 273
MIN_REDUCTION+43, // (default reduction)
  }
,
{ // state 274
MIN_REDUCTION+43, // (default reduction)
  }
,
{ // state 275
22,MIN_REDUCTION+76, // `[
63,32, // ws
64,146, // " "
65,166, // {10}
75,MIN_REDUCTION+76, // "["
MIN_REDUCTION+76, // (default reduction)
  }
,
{ // state 276
44,622, // letter
45,74, // "p"
46,74, // "v"
47,74, // "b"
48,74, // {"A".."Z" "a" "d".."h" "j".."k" "m".."n" "q".."s" "w".."z"}
49,74, // "t"
50,74, // "c"
51,74, // "i"
52,74, // "l"
53,74, // "o"
54,74, // "u"
55,366, // letter128
56,43, // {199..218 231..250}
57,43, // {193..198 225..230}
58,281, // digit
59,242, // {"1".."9"}
60,242, // "0"
61,101, // digit128
62,574, // {176..185}
78,150, // idChar*
79,304, // $$0
84,497, // idChar
85,537, // "_"
86,11, // idChar128
87,100, // {223}
  }
,
{ // state 277
MIN_REDUCTION+41, // (default reduction)
  }
,
{ // state 278
91,MIN_REDUCTION+107, // $NT
MIN_REDUCTION+107, // (default reduction)
  }
,
{ // state 279
MIN_REDUCTION+29, // (default reduction)
  }
,
{ // state 280
MIN_REDUCTION+106, // (default reduction)
  }
,
{ // state 281
MIN_REDUCTION+87, // (default reduction)
  }
,
{ // state 282
44,622, // letter
45,74, // "p"
46,74, // "v"
47,74, // "b"
48,74, // {"A".."Z" "a" "d".."h" "j".."k" "m".."n" "q".."s" "w".."z"}
49,74, // "t"
50,74, // "c"
51,74, // "i"
52,74, // "l"
53,74, // "o"
54,74, // "u"
55,362, // letter128
56,45, // {199..218 231..250}
57,45, // {193..198 225..230}
58,281, // digit
59,242, // {"1".."9"}
60,242, // "0"
61,104, // digit128
62,573, // {176..185}
78,147, // idChar*
79,300, // $$0
84,497, // idChar
85,537, // "_"
86,16, // idChar128
87,103, // {223}
  }
,
{ // state 283
46,615, // "v"
  }
,
{ // state 284
22,MIN_REDUCTION+42, // `[
75,MIN_REDUCTION+42, // "["
MIN_REDUCTION+42, // (default reduction)
  }
,
{ // state 285
2,271, // ws*
22,MIN_REDUCTION+73, // `[
63,434, // ws
64,164, // " "
65,19, // {10}
75,MIN_REDUCTION+73, // "["
MIN_REDUCTION+73, // (default reduction)
  }
,
{ // state 286
MIN_REDUCTION+107, // (default reduction)
  }
,
{ // state 287
22,MIN_REDUCTION+42, // `[
75,MIN_REDUCTION+42, // "["
MIN_REDUCTION+42, // (default reduction)
  }
,
{ // state 288
22,MIN_REDUCTION+106, // `[
75,MIN_REDUCTION+106, // "["
MIN_REDUCTION+106, // (default reduction)
  }
,
{ // state 289
63,535, // ws
64,389, // " "
65,235, // {10}
MIN_REDUCTION+70, // (default reduction)
  }
,
{ // state 290
MIN_REDUCTION+43, // (default reduction)
  }
,
{ // state 291
22,MIN_REDUCTION+91, // `[
75,MIN_REDUCTION+91, // "["
MIN_REDUCTION+91, // (default reduction)
  }
,
{ // state 292
MIN_REDUCTION+43, // (default reduction)
  }
,
{ // state 293
MIN_REDUCTION+107, // (default reduction)
  }
,
{ // state 294
22,MIN_REDUCTION+39, // `[
75,MIN_REDUCTION+39, // "["
MIN_REDUCTION+39, // (default reduction)
  }
,
{ // state 295
MIN_REDUCTION+106, // (default reduction)
  }
,
{ // state 296
MIN_REDUCTION+107, // (default reduction)
  }
,
{ // state 297
8,134, // `{
70,180, // "{"
  }
,
{ // state 298
22,MIN_REDUCTION+76, // `[
63,35, // ws
64,149, // " "
65,160, // {10}
75,MIN_REDUCTION+76, // "["
MIN_REDUCTION+76, // (default reduction)
  }
,
{ // state 299
91,MIN_REDUCTION+42, // $NT
MIN_REDUCTION+42, // (default reduction)
  }
,
{ // state 300
0x80000000|1, // match move
0x80000000|99, // no-match move
0x80000000|46, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 301
MIN_REDUCTION+43, // (default reduction)
  }
,
{ // state 302
MIN_REDUCTION+42, // (default reduction)
  }
,
{ // state 303
22,MIN_REDUCTION+110, // `[
63,32, // ws
64,146, // " "
65,166, // {10}
75,MIN_REDUCTION+110, // "["
MIN_REDUCTION+110, // (default reduction)
  }
,
{ // state 304
0x80000000|1, // match move
0x80000000|102, // no-match move
0x80000000|46, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 305
47,36, // "b"
51,266, // "i"
  }
,
{ // state 306
22,MIN_REDUCTION+110, // `[
63,35, // ws
64,149, // " "
65,160, // {10}
75,MIN_REDUCTION+110, // "["
MIN_REDUCTION+110, // (default reduction)
  }
,
{ // state 307
22,MIN_REDUCTION+106, // `[
75,MIN_REDUCTION+106, // "["
MIN_REDUCTION+106, // (default reduction)
  }
,
{ // state 308
63,216, // ws
64,398, // " "
65,396, // {10}
MIN_REDUCTION+64, // (default reduction)
  }
,
{ // state 309
14,569, // `void
66,283, // "#"
  }
,
{ // state 310
22,MIN_REDUCTION+91, // `[
75,MIN_REDUCTION+91, // "["
MIN_REDUCTION+91, // (default reduction)
  }
,
{ // state 311
MIN_REDUCTION+106, // (default reduction)
  }
,
{ // state 312
22,MIN_REDUCTION+106, // `[
75,MIN_REDUCTION+106, // "["
MIN_REDUCTION+106, // (default reduction)
  }
,
{ // state 313
MIN_REDUCTION+42, // (default reduction)
  }
,
{ // state 314
0x80000000|1, // match move
0x80000000|319, // no-match move
0x80000000|46, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 315
0x80000000|510, // match move
0x80000000|394, // no-match move
0x80000000|46, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 316
MIN_REDUCTION+21, // (default reduction)
  }
,
{ // state 317
0x80000000|1, // match move
0x80000000|127, // no-match move
0x80000000|46, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 318
2,416, // ws*
22,MIN_REDUCTION+109, // `[
63,120, // ws
64,10, // " "
65,109, // {10}
75,MIN_REDUCTION+109, // "["
MIN_REDUCTION+109, // (default reduction)
  }
,
{ // state 319
22,MIN_REDUCTION+76, // `[
63,55, // ws
64,164, // " "
65,19, // {10}
75,MIN_REDUCTION+76, // "["
MIN_REDUCTION+76, // (default reduction)
  }
,
{ // state 320
MIN_REDUCTION+21, // (default reduction)
  }
,
{ // state 321
MIN_REDUCTION+41, // (default reduction)
  }
,
{ // state 322
91,MIN_REDUCTION+43, // $NT
MIN_REDUCTION+43, // (default reduction)
  }
,
{ // state 323
22,MIN_REDUCTION+41, // `[
75,MIN_REDUCTION+41, // "["
MIN_REDUCTION+41, // (default reduction)
  }
,
{ // state 324
MIN_REDUCTION+107, // (default reduction)
  }
,
{ // state 325
MIN_REDUCTION+42, // (default reduction)
  }
,
{ // state 326
22,MIN_REDUCTION+41, // `[
75,MIN_REDUCTION+41, // "["
MIN_REDUCTION+41, // (default reduction)
  }
,
{ // state 327
63,332, // ws
64,49, // " "
65,557, // {10}
MIN_REDUCTION+72, // (default reduction)
  }
,
{ // state 328
MIN_REDUCTION+89, // (default reduction)
  }
,
{ // state 329
22,MIN_REDUCTION+89, // `[
75,MIN_REDUCTION+89, // "["
MIN_REDUCTION+89, // (default reduction)
  }
,
{ // state 330
MIN_REDUCTION+106, // (default reduction)
  }
,
{ // state 331
MIN_REDUCTION+22, // (default reduction)
  }
,
{ // state 332
MIN_REDUCTION+106, // (default reduction)
  }
,
{ // state 333
MIN_REDUCTION+23, // (default reduction)
  }
,
{ // state 334
MIN_REDUCTION+39, // (default reduction)
  }
,
{ // state 335
MIN_REDUCTION+91, // (default reduction)
  }
,
{ // state 336
MIN_REDUCTION+43, // (default reduction)
  }
,
{ // state 337
MIN_REDUCTION+43, // (default reduction)
  }
,
{ // state 338
MIN_REDUCTION+107, // (default reduction)
  }
,
{ // state 339
63,548, // ws
64,367, // " "
65,220, // {10}
MIN_REDUCTION+108, // (default reduction)
  }
,
{ // state 340
MIN_REDUCTION+39, // (default reduction)
  }
,
{ // state 341
MIN_REDUCTION+107, // (default reduction)
  }
,
{ // state 342
MIN_REDUCTION+42, // (default reduction)
  }
,
{ // state 343
MIN_REDUCTION+91, // (default reduction)
  }
,
{ // state 344
MIN_REDUCTION+43, // (default reduction)
  }
,
{ // state 345
MIN_REDUCTION+42, // (default reduction)
  }
,
{ // state 346
MIN_REDUCTION+39, // (default reduction)
  }
,
{ // state 347
22,MIN_REDUCTION+41, // `[
75,MIN_REDUCTION+41, // "["
MIN_REDUCTION+41, // (default reduction)
  }
,
{ // state 348
63,547, // ws
64,325, // " "
65,301, // {10}
MIN_REDUCTION+62, // (default reduction)
  }
,
{ // state 349
63,170, // ws
64,302, // " "
65,336, // {10}
MIN_REDUCTION+68, // (default reduction)
  }
,
{ // state 350
MIN_REDUCTION+91, // (default reduction)
  }
,
{ // state 351
MIN_REDUCTION+96, // (default reduction)
  }
,
{ // state 352
45,387, // "p"
46,387, // "v"
47,387, // "b"
48,387, // {"A".."Z" "a" "d".."h" "j".."k" "m".."n" "q".."s" "w".."z"}
49,387, // "t"
50,387, // "c"
51,387, // "i"
52,387, // "l"
53,387, // "o"
54,387, // "u"
57,73, // {193..198 225..230}
59,387, // {"1".."9"}
60,387, // "0"
62,73, // {176..185}
82,47, // hexDigit*
83,353, // $$2
88,533, // hexDigit
89,570, // hexDigit128
  }
,
{ // state 353
0x80000000|1, // match move
0x80000000|628, // no-match move
0x80000000|46, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 354
44,622, // letter
45,74, // "p"
46,74, // "v"
47,74, // "b"
48,74, // {"A".."Z" "a" "d".."h" "j".."k" "m".."n" "q".."s" "w".."z"}
49,74, // "t"
50,74, // "c"
51,74, // "i"
52,74, // "l"
53,74, // "o"
54,74, // "u"
55,59, // letter128
56,418, // {199..218 231..250}
57,418, // {193..198 225..230}
58,281, // digit
59,242, // {"1".."9"}
60,242, // "0"
61,625, // digit128
62,277, // {176..185}
79,249, // $$0
84,566, // idChar
85,537, // "_"
86,148, // idChar128
87,343, // {223}
  }
,
{ // state 355
MIN_REDUCTION+41, // (default reduction)
  }
,
{ // state 356
MIN_REDUCTION+39, // (default reduction)
  }
,
{ // state 357
MIN_REDUCTION+106, // (default reduction)
  }
,
{ // state 358
2,232, // ws*
63,238, // ws
64,496, // " "
65,114, // {10}
MIN_REDUCTION+109, // (default reduction)
  }
,
{ // state 359
7,226, // ID
15,363, // `(
38,556, // <exp2>
39,279, // <cast exp>
40,485, // <unary exp>
41,140, // <exp1>
42,158, // `-
43,423, // INTLIT
44,76, // letter
45,106, // "p"
46,106, // "v"
47,106, // "b"
48,106, // {"A".."Z" "a" "d".."h" "j".."k" "m".."n" "q".."s" "w".."z"}
49,106, // "t"
50,106, // "c"
51,106, // "i"
52,106, // "l"
53,106, // "o"
54,106, // "u"
55,514, // letter128
56,28, // {199..218 231..250}
57,28, // {193..198 225..230}
59,219, // {"1".."9"}
60,352, // "0"
61,520, // digit128
62,589, // {176..185}
68,261, // "("
72,587, // "-"
  }
,
{ // state 360
2,116, // ws*
63,296, // ws
64,302, // " "
65,336, // {10}
MIN_REDUCTION+71, // (default reduction)
  }
,
{ // state 361
0x80000000|1, // match move
0x80000000|6, // no-match move
0x80000000|46, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 362
0x80000000|328, // match move
0x80000000|30, // no-match move
0x80000000|46, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 363
7,426, // ID
18,486, // <type>
19,378, // `int
20,131, // `boolean
44,199, // letter
45,106, // "p"
46,106, // "v"
47,106, // "b"
48,106, // {"A".."Z" "a" "d".."h" "j".."k" "m".."n" "q".."s" "w".."z"}
49,106, // "t"
50,106, // "c"
51,106, // "i"
52,106, // "l"
53,106, // "o"
54,106, // "u"
55,142, // letter128
56,334, // {199..218 231..250}
57,334, // {193..198 225..230}
66,305, // "#"
  }
,
{ // state 364
16,129, // `)
21,377, // <empty bracket pair>
22,627, // `[
69,433, // ")"
75,189, // "["
  }
,
{ // state 365
0x80000000|154, // match move
0x80000000|20, // no-match move
0x80000000|46, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 366
0x80000000|328, // match move
0x80000000|33, // no-match move
0x80000000|46, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 367
MIN_REDUCTION+42, // (default reduction)
  }
,
{ // state 368
MIN_REDUCTION+39, // (default reduction)
  }
,
{ // state 369
16,88, // `)
21,377, // <empty bracket pair>
22,627, // `[
69,433, // ")"
75,189, // "["
  }
,
{ // state 370
MIN_REDUCTION+94, // (default reduction)
  }
,
{ // state 371
0x80000000|1, // match move
0x80000000|424, // no-match move
0x80000000|46, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 372
0x80000000|1, // match move
0x80000000|421, // no-match move
0x80000000|46, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 373
7,226, // ID
15,363, // `(
28,621, // <exp>
30,493, // <exp8>
31,3, // <exp7>
32,331, // <exp6>
33,333, // <exp5>
34,72, // <exp4>
36,500, // <exp3>
38,57, // <exp2>
39,279, // <cast exp>
40,485, // <unary exp>
41,140, // <exp1>
42,158, // `-
43,423, // INTLIT
44,76, // letter
45,106, // "p"
46,106, // "v"
47,106, // "b"
48,106, // {"A".."Z" "a" "d".."h" "j".."k" "m".."n" "q".."s" "w".."z"}
49,106, // "t"
50,106, // "c"
51,106, // "i"
52,106, // "l"
53,106, // "o"
54,106, // "u"
55,514, // letter128
56,28, // {199..218 231..250}
57,28, // {193..198 225..230}
59,219, // {"1".."9"}
60,352, // "0"
61,520, // digit128
62,589, // {176..185}
68,261, // "("
72,587, // "-"
  }
,
{ // state 374
0x80000000|1, // match move
0x80000000|22, // no-match move
0x80000000|46, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 375
7,215, // ID
15,488, // `(
28,25, // <exp>
30,471, // <exp8>
31,316, // <exp7>
32,17, // <exp6>
33,15, // <exp5>
34,145, // <exp4>
36,446, // <exp3>
38,85, // <exp2>
39,246, // <cast exp>
40,458, // <unary exp>
41,122, // <exp1>
42,135, // `-
43,439, // INTLIT
44,276, // letter
45,106, // "p"
46,106, // "v"
47,106, // "b"
48,106, // {"A".."Z" "a" "d".."h" "j".."k" "m".."n" "q".."s" "w".."z"}
49,106, // "t"
50,106, // "c"
51,106, // "i"
52,106, // "l"
53,106, // "o"
54,106, // "u"
55,539, // letter128
56,43, // {199..218 231..250}
57,43, // {193..198 225..230}
59,259, // {"1".."9"}
60,400, // "0"
61,545, // digit128
62,574, // {176..185}
68,261, // "("
72,587, // "-"
  }
,
{ // state 376
2,38, // ws*
63,338, // ws
64,264, // " "
65,292, // {10}
MIN_REDUCTION+61, // (default reduction)
  }
,
{ // state 377
MIN_REDUCTION+12, // (default reduction)
  }
,
{ // state 378
MIN_REDUCTION+9, // (default reduction)
  }
,
{ // state 379
0x80000000|1, // match move
0x80000000|21, // no-match move
0x80000000|46, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 380
63,515, // ws
64,345, // " "
65,274, // {10}
MIN_REDUCTION+108, // (default reduction)
  }
,
{ // state 381
44,622, // letter
45,74, // "p"
46,74, // "v"
47,74, // "b"
48,74, // {"A".."Z" "a" "d".."h" "j".."k" "m".."n" "q".."s" "w".."z"}
49,74, // "t"
50,74, // "c"
51,74, // "i"
52,74, // "l"
53,74, // "o"
54,74, // "u"
55,59, // letter128
56,418, // {199..218 231..250}
57,418, // {193..198 225..230}
58,281, // digit
59,242, // {"1".."9"}
60,242, // "0"
61,625, // digit128
62,277, // {176..185}
78,354, // idChar*
79,95, // $$0
84,497, // idChar
85,537, // "_"
86,148, // idChar128
87,343, // {223}
  }
,
{ // state 382
2,519, // ws*
22,MIN_REDUCTION+109, // `[
63,449, // ws
64,146, // " "
65,166, // {10}
75,MIN_REDUCTION+109, // "["
MIN_REDUCTION+109, // (default reduction)
  }
,
{ // state 383
2,609, // ws*
63,525, // ws
64,560, // " "
65,12, // {10}
MIN_REDUCTION+47, // (default reduction)
  }
,
{ // state 384
22,MIN_REDUCTION+82, // `[
63,55, // ws
64,164, // " "
65,19, // {10}
75,MIN_REDUCTION+82, // "["
MIN_REDUCTION+82, // (default reduction)
  }
,
{ // state 385
2,143, // ws*
  }
,
{ // state 386
2,518, // ws*
22,MIN_REDUCTION+109, // `[
63,452, // ws
64,149, // " "
65,160, // {10}
75,MIN_REDUCTION+109, // "["
MIN_REDUCTION+109, // (default reduction)
  }
,
{ // state 387
MIN_REDUCTION+92, // (default reduction)
  }
,
{ // state 388
26,225, // `;
77,206, // ";"
  }
,
{ // state 389
MIN_REDUCTION+42, // (default reduction)
  }
,
{ // state 390
MIN_REDUCTION+89, // (default reduction)
  }
,
{ // state 391
MIN_REDUCTION+91, // (default reduction)
  }
,
{ // state 392
63,357, // ws
64,496, // " "
65,114, // {10}
MIN_REDUCTION+76, // (default reduction)
  }
,
{ // state 393
22,MIN_REDUCTION+93, // `[
75,MIN_REDUCTION+93, // "["
MIN_REDUCTION+93, // (default reduction)
  }
,
{ // state 394
22,MIN_REDUCTION+79, // `[
75,MIN_REDUCTION+79, // "["
MIN_REDUCTION+79, // (default reduction)
  }
,
{ // state 395
22,MIN_REDUCTION+35, // `[
29,MIN_REDUCTION+35, // `=
35,MIN_REDUCTION+35, // `+
37,MIN_REDUCTION+35, // `*
67,MIN_REDUCTION+35, // "*"
73,MIN_REDUCTION+35, // "+"
74,MIN_REDUCTION+35, // "="
75,MIN_REDUCTION+35, // "["
MIN_REDUCTION+11, // (default reduction)
  }
,
{ // state 396
MIN_REDUCTION+43, // (default reduction)
  }
,
{ // state 397
22,MIN_REDUCTION+93, // `[
75,MIN_REDUCTION+93, // "["
MIN_REDUCTION+93, // (default reduction)
  }
,
{ // state 398
MIN_REDUCTION+42, // (default reduction)
  }
,
{ // state 399
7,226, // ID
15,363, // `(
28,572, // <exp>
30,493, // <exp8>
31,3, // <exp7>
32,331, // <exp6>
33,333, // <exp5>
34,72, // <exp4>
36,500, // <exp3>
38,57, // <exp2>
39,279, // <cast exp>
40,485, // <unary exp>
41,140, // <exp1>
42,158, // `-
43,423, // INTLIT
44,76, // letter
45,106, // "p"
46,106, // "v"
47,106, // "b"
48,106, // {"A".."Z" "a" "d".."h" "j".."k" "m".."n" "q".."s" "w".."z"}
49,106, // "t"
50,106, // "c"
51,106, // "i"
52,106, // "l"
53,106, // "o"
54,106, // "u"
55,514, // letter128
56,28, // {199..218 231..250}
57,28, // {193..198 225..230}
59,219, // {"1".."9"}
60,352, // "0"
61,520, // digit128
62,589, // {176..185}
68,261, // "("
72,587, // "-"
  }
,
{ // state 400
45,387, // "p"
46,387, // "v"
47,387, // "b"
48,387, // {"A".."Z" "a" "d".."h" "j".."k" "m".."n" "q".."s" "w".."z"}
49,387, // "t"
50,387, // "c"
51,387, // "i"
52,387, // "l"
53,387, // "o"
54,387, // "u"
57,251, // {193..198 225..230}
59,387, // {"1".."9"}
60,387, // "0"
62,251, // {176..185}
82,112, // hexDigit*
83,374, // $$2
88,533, // hexDigit
89,61, // hexDigit128
  }
,
{ // state 401
45,387, // "p"
46,387, // "v"
47,387, // "b"
48,387, // {"A".."Z" "a" "d".."h" "j".."k" "m".."n" "q".."s" "w".."z"}
49,387, // "t"
50,387, // "c"
51,387, // "i"
52,387, // "l"
53,387, // "o"
54,387, // "u"
57,247, // {193..198 225..230}
59,387, // {"1".."9"}
60,387, // "0"
62,247, // {176..185}
82,113, // hexDigit*
83,379, // $$2
88,533, // hexDigit
89,52, // hexDigit128
  }
,
{ // state 402
7,226, // ID
15,363, // `(
28,579, // <exp>
30,493, // <exp8>
31,3, // <exp7>
32,331, // <exp6>
33,333, // <exp5>
34,72, // <exp4>
36,500, // <exp3>
38,57, // <exp2>
39,279, // <cast exp>
40,485, // <unary exp>
41,140, // <exp1>
42,158, // `-
43,423, // INTLIT
44,76, // letter
45,106, // "p"
46,106, // "v"
47,106, // "b"
48,106, // {"A".."Z" "a" "d".."h" "j".."k" "m".."n" "q".."s" "w".."z"}
49,106, // "t"
50,106, // "c"
51,106, // "i"
52,106, // "l"
53,106, // "o"
54,106, // "u"
55,514, // letter128
56,28, // {199..218 231..250}
57,28, // {193..198 225..230}
59,219, // {"1".."9"}
60,352, // "0"
61,520, // digit128
62,589, // {176..185}
68,261, // "("
72,587, // "-"
  }
,
{ // state 403
63,459, // ws
64,299, // " "
65,322, // {10}
91,MIN_REDUCTION+72, // $NT
  }
,
{ // state 404
MIN_REDUCTION+107, // (default reduction)
  }
,
{ // state 405
2,519, // ws*
  }
,
{ // state 406
52,383, // "l"
  }
,
{ // state 407
2,518, // ws*
  }
,
{ // state 408
MIN_REDUCTION+104, // (default reduction)
  }
,
{ // state 409
2,444, // ws*
63,238, // ws
64,496, // " "
65,114, // {10}
MIN_REDUCTION+73, // (default reduction)
  }
,
{ // state 410
0x80000000|1, // match move
0x80000000|448, // no-match move
0x80000000|46, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 411
22,MIN_REDUCTION+93, // `[
75,MIN_REDUCTION+93, // "["
MIN_REDUCTION+93, // (default reduction)
  }
,
{ // state 412
MIN_REDUCTION+40, // (default reduction)
  }
,
{ // state 413
MIN_REDUCTION+107, // (default reduction)
  }
,
{ // state 414
7,215, // ID
15,488, // `(
38,522, // <exp2>
39,246, // <cast exp>
40,458, // <unary exp>
41,122, // <exp1>
42,135, // `-
43,439, // INTLIT
44,276, // letter
45,106, // "p"
46,106, // "v"
47,106, // "b"
48,106, // {"A".."Z" "a" "d".."h" "j".."k" "m".."n" "q".."s" "w".."z"}
49,106, // "t"
50,106, // "c"
51,106, // "i"
52,106, // "l"
53,106, // "o"
54,106, // "u"
55,539, // letter128
56,43, // {199..218 231..250}
57,43, // {193..198 225..230}
59,259, // {"1".."9"}
60,400, // "0"
61,545, // digit128
62,574, // {176..185}
68,261, // "("
72,587, // "-"
  }
,
{ // state 415
2,241, // ws*
63,41, // ws
64,367, // " "
65,220, // {10}
MIN_REDUCTION+77, // (default reduction)
  }
,
{ // state 416
0x80000000|617, // match move
0x80000000|211, // no-match move
0x80000000|46, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 417
MIN_REDUCTION+42, // (default reduction)
  }
,
{ // state 418
MIN_REDUCTION+39, // (default reduction)
  }
,
{ // state 419
MIN_REDUCTION+91, // (default reduction)
  }
,
{ // state 420
MIN_REDUCTION+107, // (default reduction)
  }
,
{ // state 421
22,399, // `[
75,360, // "["
MIN_REDUCTION+32, // (default reduction)
  }
,
{ // state 422
7,217, // ID
15,482, // `(
38,521, // <exp2>
39,248, // <cast exp>
40,455, // <unary exp>
41,94, // <exp1>
42,141, // `-
43,436, // INTLIT
44,282, // letter
45,106, // "p"
46,106, // "v"
47,106, // "b"
48,106, // {"A".."Z" "a" "d".."h" "j".."k" "m".."n" "q".."s" "w".."z"}
49,106, // "t"
50,106, // "c"
51,106, // "i"
52,106, // "l"
53,106, // "o"
54,106, // "u"
55,538, // letter128
56,45, // {199..218 231..250}
57,45, // {193..198 225..230}
59,258, // {"1".."9"}
60,401, // "0"
61,543, // digit128
62,573, // {176..185}
68,261, // "("
72,587, // "-"
  }
,
{ // state 423
0x80000000|1, // match move
0x80000000|504, // no-match move
0x80000000|46, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 424
22,402, // `[
75,360, // "["
MIN_REDUCTION+32, // (default reduction)
  }
,
{ // state 425
22,MIN_REDUCTION+82, // `[
63,32, // ws
64,146, // " "
65,166, // {10}
75,MIN_REDUCTION+82, // "["
MIN_REDUCTION+82, // (default reduction)
  }
,
{ // state 426
MIN_REDUCTION+11, // (default reduction)
  }
,
{ // state 427
0x80000000|1, // match move
0x80000000|562, // no-match move
0x80000000|46, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 428
63,546, // ws
64,417, // " "
65,185, // {10}
MIN_REDUCTION+108, // (default reduction)
  }
,
{ // state 429
0x80000000|1, // match move
0x80000000|559, // no-match move
0x80000000|46, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 430
23,40, // `]
76,558, // "]"
  }
,
{ // state 431
9,461, // <decl in class>*
10,198, // `}
11,595, // <decl in class>
12,212, // <method decl>
13,309, // `public
66,554, // "#"
71,14, // "}"
  }
,
{ // state 432
2,272, // ws*
  }
,
{ // state 433
2,221, // ws*
63,564, // ws
64,39, // " "
65,230, // {10}
MIN_REDUCTION+59, // (default reduction)
  }
,
{ // state 434
0x80000000|1, // match move
0x80000000|151, // no-match move
0x80000000|46, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 435
2,269, // ws*
  }
,
{ // state 436
0x80000000|1, // match move
0x80000000|476, // no-match move
0x80000000|46, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 437
22,MIN_REDUCTION+82, // `[
63,35, // ws
64,149, // " "
65,160, // {10}
75,MIN_REDUCTION+82, // "["
MIN_REDUCTION+82, // (default reduction)
  }
,
{ // state 438
MIN_REDUCTION+41, // (default reduction)
  }
,
{ // state 439
0x80000000|1, // match move
0x80000000|474, // no-match move
0x80000000|46, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 440
MIN_REDUCTION+106, // (default reduction)
  }
,
{ // state 441
2,92, // ws*
63,238, // ws
64,496, // " "
65,114, // {10}
MIN_REDUCTION+45, // (default reduction)
  }
,
{ // state 442
MIN_REDUCTION+11, // (default reduction)
  }
,
{ // state 443
2,254, // ws*
63,79, // ws
64,345, // " "
65,274, // {10}
MIN_REDUCTION+77, // (default reduction)
  }
,
{ // state 444
63,357, // ws
64,496, // " "
65,114, // {10}
MIN_REDUCTION+72, // (default reduction)
  }
,
{ // state 445
0x80000000|1, // match move
0x80000000|473, // no-match move
0x80000000|46, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 446
37,414, // `*
67,457, // "*"
MIN_REDUCTION+26, // (default reduction)
  }
,
{ // state 447
37,422, // `*
67,457, // "*"
MIN_REDUCTION+26, // (default reduction)
  }
,
{ // state 448
22,373, // `[
75,360, // "["
MIN_REDUCTION+32, // (default reduction)
  }
,
{ // state 449
0x80000000|1, // match move
0x80000000|169, // no-match move
0x80000000|46, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 450
22,MIN_REDUCTION+80, // `[
75,MIN_REDUCTION+80, // "["
MIN_REDUCTION+80, // (default reduction)
  }
,
{ // state 451
2,578, // ws*
63,525, // ws
64,560, // " "
65,12, // {10}
MIN_REDUCTION+49, // (default reduction)
  }
,
{ // state 452
0x80000000|1, // match move
0x80000000|167, // no-match move
0x80000000|46, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 453
22,MIN_REDUCTION+80, // `[
75,MIN_REDUCTION+80, // "["
MIN_REDUCTION+80, // (default reduction)
  }
,
{ // state 454
2,361, // ws*
  }
,
{ // state 455
MIN_REDUCTION+30, // (default reduction)
  }
,
{ // state 456
54,577, // "u"
  }
,
{ // state 457
2,262, // ws*
63,404, // ws
64,173, // " "
65,194, // {10}
MIN_REDUCTION+55, // (default reduction)
  }
,
{ // state 458
MIN_REDUCTION+30, // (default reduction)
  }
,
{ // state 459
91,MIN_REDUCTION+106, // $NT
MIN_REDUCTION+106, // (default reduction)
  }
,
{ // state 460
0x80000000|1, // match move
0x80000000|602, // no-match move
0x80000000|46, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 461
10,502, // `}
11,351, // <decl in class>
12,212, // <method decl>
13,309, // `public
66,554, // "#"
71,14, // "}"
  }
,
{ // state 462
0x80000000|1, // match move
0x80000000|531, // no-match move
0x80000000|46, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 463
MIN_REDUCTION+90, // (default reduction)
  }
,
{ // state 464
53,7, // "o"
  }
,
{ // state 465
MIN_REDUCTION+20, // (default reduction)
  }
,
{ // state 466
MIN_REDUCTION+42, // (default reduction)
  }
,
{ // state 467
0x80000000|1, // match move
0x80000000|203, // no-match move
0x80000000|46, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 468
7,217, // ID
15,482, // `(
36,138, // <exp3>
38,82, // <exp2>
39,248, // <cast exp>
40,455, // <unary exp>
41,94, // <exp1>
42,141, // `-
43,436, // INTLIT
44,282, // letter
45,106, // "p"
46,106, // "v"
47,106, // "b"
48,106, // {"A".."Z" "a" "d".."h" "j".."k" "m".."n" "q".."s" "w".."z"}
49,106, // "t"
50,106, // "c"
51,106, // "i"
52,106, // "l"
53,106, // "o"
54,106, // "u"
55,538, // letter128
56,45, // {199..218 231..250}
57,45, // {193..198 225..230}
59,258, // {"1".."9"}
60,401, // "0"
61,543, // digit128
62,573, // {176..185}
68,261, // "("
72,587, // "-"
  }
,
{ // state 469
44,622, // letter
45,74, // "p"
46,74, // "v"
47,74, // "b"
48,74, // {"A".."Z" "a" "d".."h" "j".."k" "m".."n" "q".."s" "w".."z"}
49,74, // "t"
50,74, // "c"
51,74, // "i"
52,74, // "l"
53,74, // "o"
54,74, // "u"
55,8, // letter128
56,368, // {199..218 231..250}
57,368, // {193..198 225..230}
58,281, // digit
59,242, // {"1".."9"}
60,242, // "0"
61,594, // digit128
62,321, // {176..185}
79,42, // $$0
84,566, // idChar
85,537, // "_"
86,66, // idChar128
87,391, // {223}
  }
,
{ // state 470
0x80000000|1, // match move
0x80000000|204, // no-match move
0x80000000|46, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 471
MIN_REDUCTION+20, // (default reduction)
  }
,
{ // state 472
2,234, // ws*
63,238, // ws
64,496, // " "
65,114, // {10}
MIN_REDUCTION+51, // (default reduction)
  }
,
{ // state 473
22,MIN_REDUCTION+81, // `[
75,MIN_REDUCTION+81, // "["
MIN_REDUCTION+81, // (default reduction)
  }
,
{ // state 474
22,MIN_REDUCTION+37, // `[
75,MIN_REDUCTION+37, // "["
MIN_REDUCTION+37, // (default reduction)
  }
,
{ // state 475
0x80000000|1, // match move
0x80000000|306, // no-match move
0x80000000|46, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 476
22,MIN_REDUCTION+37, // `[
75,MIN_REDUCTION+37, // "["
MIN_REDUCTION+37, // (default reduction)
  }
,
{ // state 477
22,MIN_REDUCTION+80, // `[
75,MIN_REDUCTION+80, // "["
MIN_REDUCTION+80, // (default reduction)
  }
,
{ // state 478
63,516, // ws
64,342, // " "
65,273, // {10}
MIN_REDUCTION+56, // (default reduction)
  }
,
{ // state 479
MIN_REDUCTION+42, // (default reduction)
  }
,
{ // state 480
0x80000000|1, // match move
0x80000000|303, // no-match move
0x80000000|46, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 481
7,215, // ID
15,488, // `(
36,136, // <exp3>
38,85, // <exp2>
39,246, // <cast exp>
40,458, // <unary exp>
41,122, // <exp1>
42,135, // `-
43,439, // INTLIT
44,276, // letter
45,106, // "p"
46,106, // "v"
47,106, // "b"
48,106, // {"A".."Z" "a" "d".."h" "j".."k" "m".."n" "q".."s" "w".."z"}
49,106, // "t"
50,106, // "c"
51,106, // "i"
52,106, // "l"
53,106, // "o"
54,106, // "u"
55,539, // letter128
56,43, // {199..218 231..250}
57,43, // {193..198 225..230}
59,259, // {"1".."9"}
60,400, // "0"
61,545, // digit128
62,574, // {176..185}
68,261, // "("
72,587, // "-"
  }
,
{ // state 482
7,426, // ID
18,364, // <type>
19,378, // `int
20,131, // `boolean
44,199, // letter
45,106, // "p"
46,106, // "v"
47,106, // "b"
48,106, // {"A".."Z" "a" "d".."h" "j".."k" "m".."n" "q".."s" "w".."z"}
49,106, // "t"
50,106, // "c"
51,106, // "i"
52,106, // "l"
53,106, // "o"
54,106, // "u"
55,142, // letter128
56,334, // {199..218 231..250}
57,334, // {193..198 225..230}
66,305, // "#"
  }
,
{ // state 483
22,MIN_REDUCTION+107, // `[
75,MIN_REDUCTION+107, // "["
MIN_REDUCTION+107, // (default reduction)
  }
,
{ // state 484
2,480, // ws*
  }
,
{ // state 485
MIN_REDUCTION+30, // (default reduction)
  }
,
{ // state 486
16,171, // `)
21,377, // <empty bracket pair>
22,627, // `[
69,433, // ")"
75,189, // "["
  }
,
{ // state 487
0x80000000|1, // match move
0x80000000|590, // no-match move
0x80000000|46, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 488
7,426, // ID
18,369, // <type>
19,378, // `int
20,131, // `boolean
44,199, // letter
45,106, // "p"
46,106, // "v"
47,106, // "b"
48,106, // {"A".."Z" "a" "d".."h" "j".."k" "m".."n" "q".."s" "w".."z"}
49,106, // "t"
50,106, // "c"
51,106, // "i"
52,106, // "l"
53,106, // "o"
54,106, // "u"
55,142, // letter128
56,334, // {199..218 231..250}
57,334, // {193..198 225..230}
66,305, // "#"
  }
,
{ // state 489
7,245, // ID
44,381, // letter
45,106, // "p"
46,106, // "v"
47,106, // "b"
48,106, // {"A".."Z" "a" "d".."h" "j".."k" "m".."n" "q".."s" "w".."z"}
49,106, // "t"
50,106, // "c"
51,106, // "i"
52,106, // "l"
53,106, // "o"
54,106, // "u"
55,620, // letter128
56,418, // {199..218 231..250}
57,418, // {193..198 225..230}
  }
,
{ // state 490
0x80000000|1, // match move
0x80000000|591, // no-match move
0x80000000|46, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 491
2,462, // ws*
22,MIN_REDUCTION+113, // `[
63,434, // ws
64,164, // " "
65,19, // {10}
75,MIN_REDUCTION+113, // "["
MIN_REDUCTION+113, // (default reduction)
  }
,
{ // state 492
2,475, // ws*
  }
,
{ // state 493
MIN_REDUCTION+20, // (default reduction)
  }
,
{ // state 494
63,546, // ws
64,417, // " "
65,185, // {10}
MIN_REDUCTION+76, // (default reduction)
  }
,
{ // state 495
7,226, // ID
15,363, // `(
36,182, // <exp3>
38,57, // <exp2>
39,279, // <cast exp>
40,485, // <unary exp>
41,140, // <exp1>
42,158, // `-
43,423, // INTLIT
44,76, // letter
45,106, // "p"
46,106, // "v"
47,106, // "b"
48,106, // {"A".."Z" "a" "d".."h" "j".."k" "m".."n" "q".."s" "w".."z"}
49,106, // "t"
50,106, // "c"
51,106, // "i"
52,106, // "l"
53,106, // "o"
54,106, // "u"
55,514, // letter128
56,28, // {199..218 231..250}
57,28, // {193..198 225..230}
59,219, // {"1".."9"}
60,352, // "0"
61,520, // digit128
62,589, // {176..185}
68,261, // "("
72,587, // "-"
  }
,
{ // state 496
MIN_REDUCTION+42, // (default reduction)
  }
,
{ // state 497
MIN_REDUCTION+103, // (default reduction)
  }
,
{ // state 498
0x80000000|1, // match move
0x80000000|607, // no-match move
0x80000000|46, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 499
2,314, // ws*
  }
,
{ // state 500
37,359, // `*
67,457, // "*"
MIN_REDUCTION+26, // (default reduction)
  }
,
{ // state 501
2,62, // ws*
  }
,
{ // state 502
MIN_REDUCTION+4, // (default reduction)
  }
,
{ // state 503
44,622, // letter
45,74, // "p"
46,74, // "v"
47,74, // "b"
48,74, // {"A".."Z" "a" "d".."h" "j".."k" "m".."n" "q".."s" "w".."z"}
49,74, // "t"
50,74, // "c"
51,74, // "i"
52,74, // "l"
53,74, // "o"
54,74, // "u"
55,155, // letter128
56,346, // {199..218 231..250}
57,346, // {193..198 225..230}
58,281, // digit
59,242, // {"1".."9"}
60,242, // "0"
61,586, // digit128
62,355, // {176..185}
79,77, // $$0
84,566, // idChar
85,537, // "_"
86,5, // idChar128
87,419, // {223}
  }
,
{ // state 504
22,MIN_REDUCTION+37, // `[
75,MIN_REDUCTION+37, // "["
MIN_REDUCTION+37, // (default reduction)
  }
,
{ // state 505
2,60, // ws*
  }
,
{ // state 506
MIN_REDUCTION+76, // (default reduction)
  }
,
{ // state 507
0x80000000|328, // match move
0x80000000|51, // no-match move
0x80000000|46, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 508
2,143, // ws*
22,MIN_REDUCTION+109, // `[
63,434, // ws
64,164, // " "
65,19, // {10}
75,MIN_REDUCTION+109, // "["
MIN_REDUCTION+109, // (default reduction)
  }
,
{ // state 509
22,MIN_REDUCTION+39, // `[
75,MIN_REDUCTION+39, // "["
MIN_REDUCTION+39, // (default reduction)
  }
,
{ // state 510
MIN_REDUCTION+79, // (default reduction)
  }
,
{ // state 511
0x80000000|598, // match move
0x80000000|329, // no-match move
0x80000000|46, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 512
MIN_REDUCTION+13, // (default reduction)
  }
,
{ // state 513
29,63, // `=
74,524, // "="
  }
,
{ // state 514
0x80000000|499, // match move
0x80000000|229, // no-match move
0x80000000|46, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 515
MIN_REDUCTION+106, // (default reduction)
  }
,
{ // state 516
MIN_REDUCTION+106, // (default reduction)
  }
,
{ // state 517
58,370, // digit
59,412, // {"1".."9"}
60,412, // "0"
61,601, // digit128
62,589, // {176..185}
81,205, // $$1
  }
,
{ // state 518
0x80000000|1, // match move
0x80000000|236, // no-match move
0x80000000|46, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 519
0x80000000|1, // match move
0x80000000|239, // no-match move
0x80000000|46, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 520
0x80000000|567, // match move
0x80000000|576, // no-match move
0x80000000|46, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 521
MIN_REDUCTION+27, // (default reduction)
  }
,
{ // state 522
MIN_REDUCTION+27, // (default reduction)
  }
,
{ // state 523
63,96, // ws
64,34, // " "
65,616, // {10}
MIN_REDUCTION+60, // (default reduction)
  }
,
{ // state 524
2,349, // ws*
63,296, // ws
64,302, // " "
65,336, // {10}
MIN_REDUCTION+69, // (default reduction)
  }
,
{ // state 525
MIN_REDUCTION+107, // (default reduction)
  }
,
{ // state 526
2,429, // ws*
22,MIN_REDUCTION+113, // `[
63,452, // ws
64,149, // " "
65,160, // {10}
75,MIN_REDUCTION+113, // "["
MIN_REDUCTION+113, // (default reduction)
  }
,
{ // state 527
2,427, // ws*
22,MIN_REDUCTION+113, // `[
63,449, // ws
64,146, // " "
65,166, // {10}
75,MIN_REDUCTION+113, // "["
MIN_REDUCTION+113, // (default reduction)
  }
,
{ // state 528
MIN_REDUCTION+78, // (default reduction)
  }
,
{ // state 529
-1, // $$start
-1, // <start>
-1, // ws*
-1, // <program>
-1, // <class decl>+
-1, // <class decl>
-1, // `class
253, // ID
27, // `{
-1, // <decl in class>*
111, // `}
-1, // <decl in class>
-1, // <method decl>
-1, // `public
-1, // `void
482, // `(
-1, // `)
-1, // <stmt>*
209, // <type>
223, // `int
227, // `boolean
-1, // <empty bracket pair>
-1, // `[
-1, // `]
132, // <stmt>
256, // <assign>
-1, // `;
388, // <local var decl>
544, // <exp>
-1, // `=
465, // <exp8>
320, // <exp7>
13, // <exp6>
18, // <exp5>
108, // <exp4>
-1, // `+
447, // <exp3>
-1, // `*
82, // <exp2>
248, // <cast exp>
455, // <unary exp>
94, // <exp1>
141, // `-
436, // INTLIT
549, // letter
106, // "p"
106, // "v"
106, // "b"
106, // {"A".."Z" "a" "d".."h" "j".."k" "m".."n" "q".."s" "w".."z"}
106, // "t"
106, // "c"
106, // "i"
106, // "l"
106, // "o"
106, // "u"
365, // letter128
193, // {199..218 231..250}
193, // {193..198 225..230}
-1, // digit
258, // {"1".."9"}
401, // "0"
543, // digit128
573, // {176..185}
-1, // ws
-1, // " "
-1, // {10}
89, // "#"
-1, // "*"
261, // "("
-1, // ")"
180, // "{"
177, // "}"
587, // "-"
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
{ // state 530
MIN_REDUCTION+106, // (default reduction)
  }
,
{ // state 531
22,MIN_REDUCTION+112, // `[
63,55, // ws
64,164, // " "
65,19, // {10}
75,MIN_REDUCTION+112, // "["
MIN_REDUCTION+112, // (default reduction)
  }
,
{ // state 532
MIN_REDUCTION+90, // (default reduction)
  }
,
{ // state 533
MIN_REDUCTION+99, // (default reduction)
  }
,
{ // state 534
22,MIN_REDUCTION+90, // `[
75,MIN_REDUCTION+90, // "["
MIN_REDUCTION+90, // (default reduction)
  }
,
{ // state 535
MIN_REDUCTION+106, // (default reduction)
  }
,
{ // state 536
22,MIN_REDUCTION+90, // `[
75,MIN_REDUCTION+90, // "["
MIN_REDUCTION+90, // (default reduction)
  }
,
{ // state 537
MIN_REDUCTION+88, // (default reduction)
  }
,
{ // state 538
0x80000000|432, // match move
0x80000000|118, // no-match move
0x80000000|46, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 539
0x80000000|435, // match move
0x80000000|121, // no-match move
0x80000000|46, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 540
0x80000000|350, // match move
0x80000000|310, // no-match move
0x80000000|46, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 541
0x80000000|252, // match move
0x80000000|50, // no-match move
0x80000000|46, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 542
22,MIN_REDUCTION+78, // `[
75,MIN_REDUCTION+78, // "["
MIN_REDUCTION+78, // (default reduction)
  }
,
{ // state 543
0x80000000|583, // match move
0x80000000|604, // no-match move
0x80000000|46, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 544
29,375, // `=
74,524, // "="
  }
,
{ // state 545
0x80000000|581, // match move
0x80000000|599, // no-match move
0x80000000|46, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 546
MIN_REDUCTION+106, // (default reduction)
  }
,
{ // state 547
MIN_REDUCTION+106, // (default reduction)
  }
,
{ // state 548
MIN_REDUCTION+106, // (default reduction)
  }
,
{ // state 549
44,622, // letter
45,74, // "p"
46,74, // "v"
47,74, // "b"
48,74, // {"A".."Z" "a" "d".."h" "j".."k" "m".."n" "q".."s" "w".."z"}
49,74, // "t"
50,74, // "c"
51,74, // "i"
52,74, // "l"
53,74, // "o"
54,74, // "u"
55,511, // letter128
56,193, // {199..218 231..250}
57,193, // {193..198 225..230}
58,281, // digit
59,242, // {"1".."9"}
60,242, // "0"
61,541, // digit128
62,161, // {176..185}
78,44, // idChar*
79,315, // $$0
84,497, // idChar
85,537, // "_"
86,588, // idChar128
87,540, // {223}
  }
,
{ // state 550
2,348, // ws*
63,413, // ws
64,325, // " "
65,301, // {10}
MIN_REDUCTION+63, // (default reduction)
  }
,
{ // state 551
MIN_REDUCTION+42, // (default reduction)
  }
,
{ // state 552
22,MIN_REDUCTION+78, // `[
75,MIN_REDUCTION+78, // "["
MIN_REDUCTION+78, // (default reduction)
  }
,
{ // state 553
22,MIN_REDUCTION+78, // `[
75,MIN_REDUCTION+78, // "["
MIN_REDUCTION+78, // (default reduction)
  }
,
{ // state 554
45,456, // "p"
  }
,
{ // state 555
2,201, // ws*
63,23, // ws
64,417, // " "
65,185, // {10}
MIN_REDUCTION+59, // (default reduction)
  }
,
{ // state 556
MIN_REDUCTION+27, // (default reduction)
  }
,
{ // state 557
MIN_REDUCTION+43, // (default reduction)
  }
,
{ // state 558
2,403, // ws*
63,278, // ws
64,299, // " "
65,322, // {10}
91,MIN_REDUCTION+73, // $NT
  }
,
{ // state 559
22,MIN_REDUCTION+112, // `[
63,35, // ws
64,149, // " "
65,160, // {10}
75,MIN_REDUCTION+112, // "["
MIN_REDUCTION+112, // (default reduction)
  }
,
{ // state 560
MIN_REDUCTION+42, // (default reduction)
  }
,
{ // state 561
90,MIN_REDUCTION+0, // $
  }
,
{ // state 562
22,MIN_REDUCTION+112, // `[
63,32, // ws
64,146, // " "
65,166, // {10}
75,MIN_REDUCTION+112, // "["
MIN_REDUCTION+112, // (default reduction)
  }
,
{ // state 563
2,4, // ws*
63,420, // ws
64,153, // " "
65,208, // {10}
MIN_REDUCTION+67, // (default reduction)
  }
,
{ // state 564
MIN_REDUCTION+107, // (default reduction)
  }
,
{ // state 565
44,622, // letter
45,74, // "p"
46,74, // "v"
47,74, // "b"
48,74, // {"A".."Z" "a" "d".."h" "j".."k" "m".."n" "q".."s" "w".."z"}
49,74, // "t"
50,74, // "c"
51,74, // "i"
52,74, // "l"
53,74, // "o"
54,74, // "u"
55,155, // letter128
56,346, // {199..218 231..250}
57,346, // {193..198 225..230}
58,281, // digit
59,242, // {"1".."9"}
60,242, // "0"
61,586, // digit128
62,355, // {176..185}
78,503, // idChar*
79,196, // $$0
84,497, // idChar
85,537, // "_"
86,5, // idChar128
87,419, // {223}
  }
,
{ // state 566
MIN_REDUCTION+102, // (default reduction)
  }
,
{ // state 567
2,107, // ws*
  }
,
{ // state 568
MIN_REDUCTION+95, // (default reduction)
  }
,
{ // state 569
7,29, // ID
44,565, // letter
45,106, // "p"
46,106, // "v"
47,106, // "b"
48,106, // {"A".."Z" "a" "d".."h" "j".."k" "m".."n" "q".."s" "w".."z"}
49,106, // "t"
50,106, // "c"
51,106, // "i"
52,106, // "l"
53,106, // "o"
54,106, // "u"
55,443, // letter128
56,346, // {199..218 231..250}
57,346, // {193..198 225..230}
  }
,
{ // state 570
0x80000000|31, // match move
0x80000000|491, // no-match move
0x80000000|46, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 571
0x80000000|484, // match move
0x80000000|214, // no-match move
0x80000000|46, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 572
23,187, // `]
76,176, // "]"
  }
,
{ // state 573
0x80000000|58, // match move
0x80000000|326, // no-match move
0x80000000|46, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 574
0x80000000|58, // match move
0x80000000|323, // no-match move
0x80000000|46, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 575
0x80000000|492, // match move
0x80000000|210, // no-match move
0x80000000|46, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 576
2,107, // ws*
22,MIN_REDUCTION+83, // `[
63,434, // ws
64,164, // " "
65,19, // {10}
75,MIN_REDUCTION+83, // "["
MIN_REDUCTION+83, // (default reduction)
  }
,
{ // state 577
2,83, // ws*
63,293, // ws
64,313, // " "
65,337, // {10}
MIN_REDUCTION+53, // (default reduction)
  }
,
{ // state 578
63,67, // ws
64,560, // " "
65,12, // {10}
MIN_REDUCTION+48, // (default reduction)
  }
,
{ // state 579
23,195, // `]
76,181, // "]"
  }
,
{ // state 580
MIN_REDUCTION+101, // (default reduction)
  }
,
{ // state 581
2,75, // ws*
  }
,
{ // state 582
22,MIN_REDUCTION+90, // `[
75,MIN_REDUCTION+90, // "["
MIN_REDUCTION+90, // (default reduction)
  }
,
{ // state 583
2,70, // ws*
  }
,
{ // state 584
MIN_REDUCTION+107, // (default reduction)
  }
,
{ // state 585
22,MIN_REDUCTION+41, // `[
75,MIN_REDUCTION+41, // "["
MIN_REDUCTION+41, // (default reduction)
  }
,
{ // state 586
MIN_REDUCTION+90, // (default reduction)
  }
,
{ // state 587
2,308, // ws*
63,324, // ws
64,398, // " "
65,396, // {10}
MIN_REDUCTION+65, // (default reduction)
  }
,
{ // state 588
0x80000000|183, // match move
0x80000000|318, // no-match move
0x80000000|46, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 589
0x80000000|58, // match move
0x80000000|347, // no-match move
0x80000000|46, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 590
22,MIN_REDUCTION+84, // `[
75,MIN_REDUCTION+84, // "["
MIN_REDUCTION+84, // (default reduction)
  }
,
{ // state 591
22,MIN_REDUCTION+84, // `[
75,MIN_REDUCTION+84, // "["
MIN_REDUCTION+84, // (default reduction)
  }
,
{ // state 592
0x80000000|506, // match move
0x80000000|207, // no-match move
0x80000000|46, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 593
44,622, // letter
45,74, // "p"
46,74, // "v"
47,74, // "b"
48,74, // {"A".."Z" "a" "d".."h" "j".."k" "m".."n" "q".."s" "w".."z"}
49,74, // "t"
50,74, // "c"
51,74, // "i"
52,74, // "l"
53,74, // "o"
54,74, // "u"
55,8, // letter128
56,368, // {199..218 231..250}
57,368, // {193..198 225..230}
58,281, // digit
59,242, // {"1".."9"}
60,242, // "0"
61,594, // digit128
62,321, // {176..185}
78,469, // idChar*
79,139, // $$0
84,497, // idChar
85,537, // "_"
86,66, // idChar128
87,391, // {223}
  }
,
{ // state 594
MIN_REDUCTION+90, // (default reduction)
  }
,
{ // state 595
MIN_REDUCTION+97, // (default reduction)
  }
,
{ // state 596
MIN_REDUCTION+78, // (default reduction)
  }
,
{ // state 597
MIN_REDUCTION+8, // (default reduction)
  }
,
{ // state 598
MIN_REDUCTION+89, // (default reduction)
  }
,
{ // state 599
2,75, // ws*
22,MIN_REDUCTION+83, // `[
63,452, // ws
64,149, // " "
65,160, // {10}
75,MIN_REDUCTION+83, // "["
MIN_REDUCTION+83, // (default reduction)
  }
,
{ // state 600
22,MIN_REDUCTION+35, // `[
75,MIN_REDUCTION+35, // "["
MIN_REDUCTION+35, // (default reduction)
  }
,
{ // state 601
0x80000000|454, // match move
0x80000000|179, // no-match move
0x80000000|46, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 602
22,MIN_REDUCTION+84, // `[
75,MIN_REDUCTION+84, // "["
MIN_REDUCTION+84, // (default reduction)
  }
,
{ // state 603
MIN_REDUCTION+33, // (default reduction)
  }
,
{ // state 604
2,70, // ws*
22,MIN_REDUCTION+83, // `[
63,449, // ws
64,146, // " "
65,166, // {10}
75,MIN_REDUCTION+83, // "["
MIN_REDUCTION+83, // (default reduction)
  }
,
{ // state 605
63,332, // ws
64,49, // " "
65,557, // {10}
MIN_REDUCTION+44, // (default reduction)
  }
,
{ // state 606
MIN_REDUCTION+1, // (default reduction)
  }
,
{ // state 607
22,MIN_REDUCTION+36, // `[
75,MIN_REDUCTION+36, // "["
MIN_REDUCTION+36, // (default reduction)
  }
,
{ // state 608
MIN_REDUCTION+33, // (default reduction)
  }
,
{ // state 609
63,67, // ws
64,560, // " "
65,12, // {10}
MIN_REDUCTION+46, // (default reduction)
  }
,
{ // state 610
22,MIN_REDUCTION+72, // `[
63,35, // ws
64,149, // " "
65,160, // {10}
75,MIN_REDUCTION+72, // "["
MIN_REDUCTION+72, // (default reduction)
  }
,
{ // state 611
63,332, // ws
64,49, // " "
65,557, // {10}
MIN_REDUCTION+50, // (default reduction)
  }
,
{ // state 612
22,MIN_REDUCTION+72, // `[
63,32, // ws
64,146, // " "
65,166, // {10}
75,MIN_REDUCTION+72, // "["
MIN_REDUCTION+72, // (default reduction)
  }
,
{ // state 613
58,370, // digit
59,412, // {"1".."9"}
60,412, // "0"
61,575, // digit128
62,574, // {176..185}
81,192, // $$1
  }
,
{ // state 614
22,MIN_REDUCTION+35, // `[
75,MIN_REDUCTION+35, // "["
MIN_REDUCTION+35, // (default reduction)
  }
,
{ // state 615
53,451, // "o"
  }
,
{ // state 616
MIN_REDUCTION+43, // (default reduction)
  }
,
{ // state 617
MIN_REDUCTION+108, // (default reduction)
  }
,
{ // state 618
58,370, // digit
59,412, // {"1".."9"}
60,412, // "0"
61,571, // digit128
62,573, // {176..185}
81,188, // $$1
  }
,
{ // state 619
22,MIN_REDUCTION+35, // `[
75,MIN_REDUCTION+35, // "["
MIN_REDUCTION+35, // (default reduction)
  }
,
{ // state 620
2,494, // ws*
63,23, // ws
64,417, // " "
65,185, // {10}
MIN_REDUCTION+77, // (default reduction)
  }
,
{ // state 621
23,498, // `]
76,213, // "]"
  }
,
{ // state 622
MIN_REDUCTION+86, // (default reduction)
  }
,
{ // state 623
MIN_REDUCTION+33, // (default reduction)
  }
,
{ // state 624
22,MIN_REDUCTION+36, // `[
75,MIN_REDUCTION+36, // "["
MIN_REDUCTION+36, // (default reduction)
  }
,
{ // state 625
MIN_REDUCTION+90, // (default reduction)
  }
,
{ // state 626
22,MIN_REDUCTION+36, // `[
75,MIN_REDUCTION+36, // "["
MIN_REDUCTION+36, // (default reduction)
  }
,
{ // state 627
23,512, // `]
76,409, // "]"
  }
,
{ // state 628
22,MIN_REDUCTION+85, // `[
75,MIN_REDUCTION+85, // "["
MIN_REDUCTION+85, // (default reduction)
  }
,
};
}
public MJGrammarParseTable(MJGrammar actionObj) {
  actionObject = actionObj;
  parseTable = new int[629][];
  int doneSoFar = 0;
  doneSoFar += new Initter1().doInit(doneSoFar);
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
// <decl in class> ::= <method decl>
(11<<16)+1,
// <method decl> ::= `public `void ID `( `) `{ <stmt>* `}
(12<<16)+8,
// <method decl> ::= `public `void ID `( `) `{ `}
(12<<16)+7,
// <type> ::= `int
(18<<16)+1,
// <type> ::= `boolean
(18<<16)+1,
// <type> ::= ID
(18<<16)+1,
// <type> ::= <type> <empty bracket pair>
(18<<16)+2,
// <empty bracket pair> ::= `[ `]
(21<<16)+2,
// <stmt> ::= <assign> `;
(24<<16)+2,
// <stmt> ::= `{ <stmt>* `}
(24<<16)+3,
// <stmt> ::= `{ `}
(24<<16)+2,
// <stmt> ::= <local var decl> `;
(24<<16)+2,
// <assign> ::= <exp> `= <exp>
(25<<16)+3,
// <local var decl> ::= <type> ID `= <exp>
(27<<16)+4,
// <exp> ::= <exp8>
(28<<16)+1,
// <exp8> ::= <exp7>
(30<<16)+1,
// <exp7> ::= <exp6>
(31<<16)+1,
// <exp6> ::= <exp5>
(32<<16)+1,
// <exp5> ::= <exp4>
(33<<16)+1,
// <exp4> ::= <exp4> `+ <exp3>
(34<<16)+3,
// <exp4> ::= <exp3>
(34<<16)+1,
// <exp3> ::= <exp3> `* <exp2>
(36<<16)+3,
// <exp3> ::= <exp2>
(36<<16)+1,
// <exp2> ::= <cast exp>
(38<<16)+1,
// <exp2> ::= <unary exp>
(38<<16)+1,
// <cast exp> ::= `( <type> `) <cast exp>
(39<<16)+4,
// <cast exp> ::= `( <type> `) <exp1>
(39<<16)+4,
// <unary exp> ::= `- <unary exp>
(40<<16)+2,
// <unary exp> ::= <exp1>
(40<<16)+1,
// <exp1> ::= ID
(41<<16)+1,
// <exp1> ::= <exp1> !<empty bracket pair> `[ <exp> `]
(41<<16)+4,
// <exp1> ::= INTLIT
(41<<16)+1,
// letter ::= {"A".."Z" "a".."z"}
(44<<16)+1,
// letter128 ::= {193..218 225..250}
(55<<16)+1,
// digit ::= {"0".."9"}
(58<<16)+1,
// digit128 ::= {176..185}
(61<<16)+1,
// ws ::= " "
(63<<16)+1,
// ws ::= {10}
(63<<16)+1,
// `boolean ::= "#" "b" "o" ws*
(20<<16)+4,
// `boolean ::= "#" "b" "o"
(20<<16)+3,
// `class ::= "#" "c" "l" ws*
(6<<16)+4,
// `class ::= "#" "c" "l"
(6<<16)+3,
// `void ::= "#" "v" "o" ws*
(14<<16)+4,
// `void ::= "#" "v" "o"
(14<<16)+3,
// `int ::= "#" "i" "t" ws*
(19<<16)+4,
// `int ::= "#" "i" "t"
(19<<16)+3,
// `public ::= "#" "p" "u" ws*
(13<<16)+4,
// `public ::= "#" "p" "u"
(13<<16)+3,
// `* ::= "*" ws*
(37<<16)+2,
// `* ::= "*"
(37<<16)+1,
// `( ::= "(" ws*
(15<<16)+2,
// `( ::= "("
(15<<16)+1,
// `) ::= ")" ws*
(16<<16)+2,
// `) ::= ")"
(16<<16)+1,
// `{ ::= "{" ws*
(8<<16)+2,
// `{ ::= "{"
(8<<16)+1,
// `} ::= "}" ws*
(10<<16)+2,
// `} ::= "}"
(10<<16)+1,
// `- ::= "-" ws*
(42<<16)+2,
// `- ::= "-"
(42<<16)+1,
// `+ ::= "+" ws*
(35<<16)+2,
// `+ ::= "+"
(35<<16)+1,
// `= ::= "=" ws*
(29<<16)+2,
// `= ::= "="
(29<<16)+1,
// `[ ::= "[" ws*
(22<<16)+2,
// `[ ::= "["
(22<<16)+1,
// `] ::= "]" ws*
(23<<16)+2,
// `] ::= "]"
(23<<16)+1,
// `; ::= ";" ws*
(26<<16)+2,
// `; ::= ";"
(26<<16)+1,
// ID ::= letter128 ws*
(7<<16)+2,
// ID ::= letter128
(7<<16)+1,
// ID ::= letter idChar* $$0
(7<<16)+3,
// ID ::= letter $$0
(7<<16)+2,
// INTLIT ::= {"1".."9"} digit* $$1
(43<<16)+3,
// INTLIT ::= {"1".."9"} $$1
(43<<16)+2,
// INTLIT ::= digit128 ws*
(43<<16)+2,
// INTLIT ::= digit128
(43<<16)+1,
// INTLIT ::= "0" hexDigit* $$2
(43<<16)+3,
// INTLIT ::= "0" $$2
(43<<16)+2,
// idChar ::= letter
(84<<16)+1,
// idChar ::= digit
(84<<16)+1,
// idChar ::= "_"
(84<<16)+1,
// idChar128 ::= letter128
(86<<16)+1,
// idChar128 ::= digit128
(86<<16)+1,
// idChar128 ::= {223}
(86<<16)+1,
// hexDigit ::= {"0".."9" "A".."Z" "a".."z"}
(88<<16)+1,
// hexDigit128 ::= {176..185 193..198 225..230}
(89<<16)+1,
// digit* ::= digit* digit
(80<<16)+2,
// digit* ::= digit
(80<<16)+1,
// <decl in class>* ::= <decl in class>* <decl in class>
(9<<16)+2,
// <decl in class>* ::= <decl in class>
(9<<16)+1,
// hexDigit* ::= hexDigit* hexDigit
(82<<16)+2,
// hexDigit* ::= hexDigit
(82<<16)+1,
// <stmt>* ::= <stmt>* <stmt>
(17<<16)+2,
// <stmt>* ::= <stmt>
(17<<16)+1,
// idChar* ::= idChar* idChar
(78<<16)+2,
// idChar* ::= idChar
(78<<16)+1,
// <class decl>+ ::= <class decl>
(4<<16)+1,
// <class decl>+ ::= <class decl>+ <class decl>
(4<<16)+2,
// ws* ::= ws* ws
(2<<16)+2,
// ws* ::= ws
(2<<16)+1,
// $$0 ::= idChar128 ws*
(79<<16)+2,
// $$0 ::= idChar128
(79<<16)+1,
// $$1 ::= digit128 ws*
(81<<16)+2,
// $$1 ::= digit128
(81<<16)+1,
// $$2 ::= hexDigit128 ws*
(83<<16)+2,
// $$2 ::= hexDigit128
(83<<16)+1,
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
65, // 10
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
64, // " "
-1, // "!"
-1, // '"'
66, // "#"
-1, // "$"
-1, // "%"
-1, // "&"
-1, // "'"
68, // "("
69, // ")"
67, // "*"
73, // "+"
-1, // ","
72, // "-"
-1, // "."
-1, // "/"
60, // "0"
59, // "1"
59, // "2"
59, // "3"
59, // "4"
59, // "5"
59, // "6"
59, // "7"
59, // "8"
59, // "9"
-1, // ":"
77, // ";"
-1, // "<"
74, // "="
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
75, // "["
-1, // "\"
76, // "]"
-1, // "^"
85, // "_"
-1, // "`"
48, // "a"
47, // "b"
50, // "c"
48, // "d"
48, // "e"
48, // "f"
48, // "g"
48, // "h"
51, // "i"
48, // "j"
48, // "k"
52, // "l"
48, // "m"
48, // "n"
53, // "o"
45, // "p"
48, // "q"
48, // "r"
48, // "s"
49, // "t"
54, // "u"
46, // "v"
48, // "w"
48, // "x"
48, // "y"
48, // "z"
70, // "{"
-1, // "|"
71, // "}"
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
62, // 176
62, // 177
62, // 178
62, // 179
62, // 180
62, // 181
62, // 182
62, // 183
62, // 184
62, // 185
-1, // 186
-1, // 187
-1, // 188
-1, // 189
-1, // 190
-1, // 191
-1, // 192
57, // 193
57, // 194
57, // 195
57, // 196
57, // 197
57, // 198
56, // 199
56, // 200
56, // 201
56, // 202
56, // 203
56, // 204
56, // 205
56, // 206
56, // 207
56, // 208
56, // 209
56, // 210
56, // 211
56, // 212
56, // 213
56, // 214
56, // 215
56, // 216
56, // 217
56, // 218
-1, // 219
-1, // 220
-1, // 221
-1, // 222
87, // 223
-1, // 224
57, // 225
57, // 226
57, // 227
57, // 228
57, // 229
57, // 230
56, // 231
56, // 232
56, // 233
56, // 234
56, // 235
56, // 236
56, // 237
56, // 238
56, // 239
56, // 240
56, // 241
56, // 242
56, // 243
56, // 244
56, // 245
56, // 246
56, // 247
56, // 248
56, // 249
56, // 250
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
"digit* ::= digit* digit", // 94
"digit* ::= digit* digit", // 95
"<decl in class>* ::= <decl in class>* <decl in class>", // 96
"<decl in class>* ::= <decl in class>* <decl in class>", // 97
"hexDigit* ::= hexDigit* hexDigit", // 98
"hexDigit* ::= hexDigit* hexDigit", // 99
"<stmt>* ::= <stmt>* <stmt>", // 100
"<stmt>* ::= <stmt>* <stmt>", // 101
"idChar* ::= idChar* idChar", // 102
"idChar* ::= idChar* idChar", // 103
"<class decl>+ ::= <class decl>", // 104
"<class decl>+ ::= <class decl>+ <class decl>", // 105
"ws* ::= ws* ws", // 106
"ws* ::= ws* ws", // 107
"", // 108
"", // 109
"", // 110
"", // 111
"", // 112
"", // 113
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
    { // 6: <decl in class> ::= <method decl> @pass
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
    },
    { // 7: <method decl> ::= `public `void [#] ID `( `) `{ <stmt>* `} @createMethodDeclVoid(int,String,List<Statement>)=>Decl
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
      ((3<<5)|0x5)/*methodCall:3*/,
    },
    { // 8: <method decl> ::= `public `void [#] ID `( `) `{ [<stmt>*] `} @createMethodDeclVoid(int,String,List<Statement>)=>Decl
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
      ((3<<5)|0x5)/*methodCall:3*/,
    },
    { // 9: <type> ::= [#] `int @intType(int)=>Type
      ((1<<5)|0xe)/*popPos:1*/,
      ((6<<5)|0x6)/*nullProductionAction:6*/,
      ((4<<5)|0x5)/*methodCall:4*/,
    },
    { // 10: <type> ::= [#] `boolean @booleanType(int)=>Type
      ((1<<5)|0xe)/*popPos:1*/,
      ((6<<5)|0x6)/*nullProductionAction:6*/,
      ((5<<5)|0x5)/*methodCall:5*/,
    },
    { // 11: <type> ::= [#] ID @identifierType(int,String)=>Type
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((6<<5)|0x6)/*nullProductionAction:6*/,
      ((6<<5)|0x5)/*methodCall:6*/,
    },
    { // 12: <type> ::= [#] <type> <empty bracket pair> @newArrayType(int,Type,Object)=>Type
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((6<<5)|0x6)/*nullProductionAction:6*/,
      ((7<<5)|0x5)/*methodCall:7*/,
    },
    { // 13: <empty bracket pair> ::= `[ `] @null
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x8)/*nullPointer:1*/,
    },
    { // 14: <stmt> ::= <assign> `; @pass
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
    },
    { // 15: <stmt> ::= [#] `{ <stmt>* `} @newBlock(int,List<Statement>)=>Statement
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((6<<5)|0x6)/*nullProductionAction:6*/,
      ((8<<5)|0x5)/*methodCall:8*/,
    },
    { // 16: <stmt> ::= [#] `{ [<stmt>*] `} @newBlock(int,List<Statement>)=>Statement
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x6)/*nullProductionAction:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((6<<5)|0x6)/*nullProductionAction:6*/,
      ((8<<5)|0x5)/*methodCall:8*/,
    },
    { // 17: <stmt> ::= <local var decl> `; @pass
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
    },
    { // 18: <assign> ::= <exp> [#] `= <exp> @assign(Exp,int,Exp)=>Statement
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((6<<5)|0x6)/*nullProductionAction:6*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((9<<5)|0x5)/*methodCall:9*/,
    },
    { // 19: <local var decl> ::= <type> [#] ID `= <exp> @localVarDecl(Type,int,String,Exp)=>Statement
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((6<<5)|0x6)/*nullProductionAction:6*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((10<<5)|0x5)/*methodCall:10*/,
    },
    { // 20: <exp> ::= <exp8> @pass
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
    },
    { // 21: <exp8> ::= <exp7> @pass
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
    },
    { // 22: <exp7> ::= <exp6> @pass
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
    },
    { // 23: <exp6> ::= <exp5> @pass
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
    },
    { // 24: <exp5> ::= <exp4> @pass
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
    },
    { // 25: <exp4> ::= <exp4> [#] `+ <exp3> @newPlus(Exp,int,Exp)=>Exp
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((6<<5)|0x6)/*nullProductionAction:6*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((11<<5)|0x5)/*methodCall:11*/,
    },
    { // 26: <exp4> ::= <exp3> @pass
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
    },
    { // 27: <exp3> ::= <exp3> [#] `* <exp2> @newTimes(Exp,int,Exp)=>Exp
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((6<<5)|0x6)/*nullProductionAction:6*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((12<<5)|0x5)/*methodCall:12*/,
    },
    { // 28: <exp3> ::= <exp2> @pass
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
    },
    { // 29: <exp2> ::= <cast exp> @pass
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
    },
    { // 30: <exp2> ::= <unary exp> @pass
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
    },
    { // 31: <cast exp> ::= [#] `( <type> `) <cast exp> @newCast(int,Type,Exp)=>Exp
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((6<<5)|0x6)/*nullProductionAction:6*/,
      ((13<<5)|0x5)/*methodCall:13*/,
    },
    { // 32: <cast exp> ::= [#] `( <type> `) <exp1> @newCast(int,Type,Exp)=>Exp
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((6<<5)|0x6)/*nullProductionAction:6*/,
      ((13<<5)|0x5)/*methodCall:13*/,
    },
    { // 33: <unary exp> ::= [#] `- <unary exp> @newUnaryMinus(int,Exp)=>Exp
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((6<<5)|0x6)/*nullProductionAction:6*/,
      ((14<<5)|0x5)/*methodCall:14*/,
    },
    { // 34: <unary exp> ::= <exp1> @pass
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
    },
    { // 35: <exp1> ::= [#] ID @newIdentfierExp(int,String)=>Exp
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((6<<5)|0x6)/*nullProductionAction:6*/,
      ((15<<5)|0x5)/*methodCall:15*/,
    },
    { // 36: <exp1> ::= <exp1> !<empty bracket pair> [#] `[ <exp> `] @newArrayLookup(Exp,int,Exp)=>Exp
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((6<<5)|0x6)/*nullProductionAction:6*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((16<<5)|0x5)/*methodCall:16*/,
    },
    { // 37: <exp1> ::= [#] INTLIT @newIntegerLiteral(int,int)=>Exp
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((6<<5)|0x6)/*nullProductionAction:6*/,
      ((17<<5)|0x5)/*methodCall:17*/,
    },
    { // 38: letter ::= {"A".."Z" "a".."z"} @pass
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
    },
    { // 39: letter128 ::= {193..218 225..250} @sub128(char)=>char
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((18<<5)|0x5)/*methodCall:18*/,
    },
    { // 40: digit ::= {"0".."9"} @pass
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
    },
    { // 41: digit128 ::= {176..185} @sub128(char)=>char
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((18<<5)|0x5)/*methodCall:18*/,
    },
    { // 42: ws ::= " " @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 43: ws ::= {10} [registerNewline] @void
      ((7<<5)|0x6)/*nullProductionAction:7*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 44: `boolean ::= "#" "b" "o" ws* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((3<<5)|0x3)/*popOffPushBack:3*/,
    },
    { // 45: `boolean ::= "#" "b" "o" [ws*] @void
      ((3<<5)|0x6)/*nullProductionAction:3*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((3<<5)|0x3)/*popOffPushBack:3*/,
    },
    { // 46: `class ::= "#" "c" "l" ws* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((3<<5)|0x3)/*popOffPushBack:3*/,
    },
    { // 47: `class ::= "#" "c" "l" [ws*] @void
      ((3<<5)|0x6)/*nullProductionAction:3*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((3<<5)|0x3)/*popOffPushBack:3*/,
    },
    { // 48: `void ::= "#" "v" "o" ws* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((3<<5)|0x3)/*popOffPushBack:3*/,
    },
    { // 49: `void ::= "#" "v" "o" [ws*] @void
      ((3<<5)|0x6)/*nullProductionAction:3*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((3<<5)|0x3)/*popOffPushBack:3*/,
    },
    { // 50: `int ::= "#" "i" "t" ws* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((3<<5)|0x3)/*popOffPushBack:3*/,
    },
    { // 51: `int ::= "#" "i" "t" [ws*] @void
      ((3<<5)|0x6)/*nullProductionAction:3*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((3<<5)|0x3)/*popOffPushBack:3*/,
    },
    { // 52: `public ::= "#" "p" "u" ws* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((3<<5)|0x3)/*popOffPushBack:3*/,
    },
    { // 53: `public ::= "#" "p" "u" [ws*] @void
      ((3<<5)|0x6)/*nullProductionAction:3*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((3<<5)|0x3)/*popOffPushBack:3*/,
    },
    { // 54: `* ::= "*" ws* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 55: `* ::= "*" [ws*] @void
      ((3<<5)|0x6)/*nullProductionAction:3*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 56: `( ::= "(" ws* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 57: `( ::= "(" [ws*] @void
      ((3<<5)|0x6)/*nullProductionAction:3*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 58: `) ::= ")" ws* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 59: `) ::= ")" [ws*] @void
      ((3<<5)|0x6)/*nullProductionAction:3*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 60: `{ ::= "{" ws* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 61: `{ ::= "{" [ws*] @void
      ((3<<5)|0x6)/*nullProductionAction:3*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 62: `} ::= "}" ws* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 63: `} ::= "}" [ws*] @void
      ((3<<5)|0x6)/*nullProductionAction:3*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 64: `- ::= "-" ws* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 65: `- ::= "-" [ws*] @void
      ((3<<5)|0x6)/*nullProductionAction:3*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 66: `+ ::= "+" ws* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 67: `+ ::= "+" [ws*] @void
      ((3<<5)|0x6)/*nullProductionAction:3*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 68: `= ::= "=" ws* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 69: `= ::= "=" [ws*] @void
      ((3<<5)|0x6)/*nullProductionAction:3*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 70: `[ ::= "[" ws* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 71: `[ ::= "[" [ws*] @void
      ((3<<5)|0x6)/*nullProductionAction:3*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 72: `] ::= "]" ws* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 73: `] ::= "]" [ws*] @void
      ((3<<5)|0x6)/*nullProductionAction:3*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 74: `; ::= ";" ws* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 75: `; ::= ";" [ws*] @void
      ((3<<5)|0x6)/*nullProductionAction:3*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 76: ID ::= letter128 ws* @text
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x4)/*stringConcat:1*/,
    },
    { // 77: ID ::= letter128 [ws*] @text
      ((3<<5)|0x6)/*nullProductionAction:3*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x4)/*stringConcat:1*/,
    },
    { // 78: ID ::= letter idChar* $$0 @text
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((3<<5)|0x4)/*stringConcat:3*/,
    },
    { // 79: ID ::= letter [idChar*] $$0 @text
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((4<<5)|0x6)/*nullProductionAction:4*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((3<<5)|0x4)/*stringConcat:3*/,
    },
    { // 80: INTLIT ::= {"1".."9"} digit* $$1 @convertToInt(char,List<Character>,char)=>int
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((19<<5)|0x5)/*methodCall:19*/,
    },
    { // 81: INTLIT ::= {"1".."9"} [digit*] $$1 @convertToInt(char,List<Character>,char)=>int
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((5<<5)|0x6)/*nullProductionAction:5*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((19<<5)|0x5)/*methodCall:19*/,
    },
    { // 82: INTLIT ::= digit128 ws* @convertToInt(char)=>int
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((20<<5)|0x5)/*methodCall:20*/,
    },
    { // 83: INTLIT ::= digit128 [ws*] @convertToInt(char)=>int
      ((3<<5)|0x6)/*nullProductionAction:3*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((20<<5)|0x5)/*methodCall:20*/,
    },
    { // 84: INTLIT ::= "0" hexDigit* $$2 @convert16ToInt(char,List<Character>,char)=>int
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((21<<5)|0x5)/*methodCall:21*/,
    },
    { // 85: INTLIT ::= "0" [hexDigit*] $$2 @convert16ToInt(char,List<Character>,char)=>int
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((0<<5)|0x6)/*nullProductionAction:0*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((21<<5)|0x5)/*methodCall:21*/,
    },
    { // 86: idChar ::= letter @pass
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
    },
    { // 87: idChar ::= digit @pass
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
    },
    { // 88: idChar ::= "_" @pass
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
    },
    { // 89: idChar128 ::= letter128 @pass
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
    },
    { // 90: idChar128 ::= digit128 @pass
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
    },
    { // 91: idChar128 ::= {223} @underscore(char)=>char
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((22<<5)|0x5)/*methodCall:22*/,
    },
    { // 92: hexDigit ::= {"0".."9" "A".."Z" "a".."z"} @pass
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
    },
    { // 93: hexDigit128 ::= {176..185 193..198 225..230} @sub128(char)=>char
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((18<<5)|0x5)/*methodCall:18*/,
    },
    { // 94: digit* ::= digit* digit @append
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xb)/*append:1*/,
    },
    { // 95: digit* ::= [digit*] digit @append
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((5<<5)|0x6)/*nullProductionAction:5*/,
      ((1<<5)|0xb)/*append:1*/,
    },
    { // 96: <decl in class>* ::= <decl in class>* <decl in class> @append
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xb)/*append:1*/,
    },
    { // 97: <decl in class>* ::= [<decl in class>*] <decl in class> @append
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((2<<5)|0x6)/*nullProductionAction:2*/,
      ((1<<5)|0xb)/*append:1*/,
    },
    { // 98: hexDigit* ::= hexDigit* hexDigit @append
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xb)/*append:1*/,
    },
    { // 99: hexDigit* ::= [hexDigit*] hexDigit @append
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((0<<5)|0x6)/*nullProductionAction:0*/,
      ((1<<5)|0xb)/*append:1*/,
    },
    { // 100: <stmt>* ::= <stmt>* <stmt> @append
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xb)/*append:1*/,
    },
    { // 101: <stmt>* ::= [<stmt>*] <stmt> @append
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x6)/*nullProductionAction:1*/,
      ((1<<5)|0xb)/*append:1*/,
    },
    { // 102: idChar* ::= idChar* idChar @append
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xb)/*append:1*/,
    },
    { // 103: idChar* ::= [idChar*] idChar @append
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((4<<5)|0x6)/*nullProductionAction:4*/,
      ((1<<5)|0xb)/*append:1*/,
    },
    { // 104: <class decl>+ ::= <class decl> @singleList
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xa)/*singleList:1*/,
    },
    { // 105: <class decl>+ ::= <class decl>+ <class decl> @append
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xb)/*append:1*/,
    },
    { // 106: ws* ::= ws* ws @append
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
    },
    { // 107: ws* ::= [ws*] ws @append
      ((1<<5)|0xe)/*popPos:1*/,
      ((3<<5)|0x6)/*nullProductionAction:3*/,
    },
    { // 108: $$0 ::= idChar128 ws* @pass
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
    },
    { // 109: $$0 ::= idChar128 [ws*] @pass
      ((3<<5)|0x6)/*nullProductionAction:3*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
    },
    { // 110: $$1 ::= digit128 ws* @pass
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
    },
    { // 111: $$1 ::= digit128 [ws*] @pass
      ((3<<5)|0x6)/*nullProductionAction:3*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
    },
    { // 112: $$2 ::= hexDigit128 ws* @pass
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
    },
    { // 113: $$2 ::= hexDigit128 [ws*] @pass
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
      ((23<<5)|0x5)/*methodCall:23*/,
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
      List<Statement> parm2 = (List<Statement>)si.popPb();
      Decl result = actionObject.createMethodDeclVoid(parm0,parm1,parm2);
      si.pushPb(result);
    }
    break;
    case 4: {
      int parm0 = (Integer)si.popPb();
      Type result = actionObject.intType(parm0);
      si.pushPb(result);
    }
    break;
    case 5: {
      int parm0 = (Integer)si.popPb();
      Type result = actionObject.booleanType(parm0);
      si.pushPb(result);
    }
    break;
    case 6: {
      int parm0 = (Integer)si.popPb();
      String parm1 = (String)si.popPb();
      Type result = actionObject.identifierType(parm0,parm1);
      si.pushPb(result);
    }
    break;
    case 7: {
      int parm0 = (Integer)si.popPb();
      Type parm1 = (Type)si.popPb();
      Object parm2 = (Object)si.popPb();
      Type result = actionObject.newArrayType(parm0,parm1,parm2);
      si.pushPb(result);
    }
    break;
    case 8: {
      int parm0 = (Integer)si.popPb();
      List<Statement> parm1 = (List<Statement>)si.popPb();
      Statement result = actionObject.newBlock(parm0,parm1);
      si.pushPb(result);
    }
    break;
    case 9: {
      Exp parm0 = (Exp)si.popPb();
      int parm1 = (Integer)si.popPb();
      Exp parm2 = (Exp)si.popPb();
      Statement result = actionObject.assign(parm0,parm1,parm2);
      si.pushPb(result);
    }
    break;
    case 10: {
      Type parm0 = (Type)si.popPb();
      int parm1 = (Integer)si.popPb();
      String parm2 = (String)si.popPb();
      Exp parm3 = (Exp)si.popPb();
      Statement result = actionObject.localVarDecl(parm0,parm1,parm2,parm3);
      si.pushPb(result);
    }
    break;
    case 11: {
      Exp parm0 = (Exp)si.popPb();
      int parm1 = (Integer)si.popPb();
      Exp parm2 = (Exp)si.popPb();
      Exp result = actionObject.newPlus(parm0,parm1,parm2);
      si.pushPb(result);
    }
    break;
    case 12: {
      Exp parm0 = (Exp)si.popPb();
      int parm1 = (Integer)si.popPb();
      Exp parm2 = (Exp)si.popPb();
      Exp result = actionObject.newTimes(parm0,parm1,parm2);
      si.pushPb(result);
    }
    break;
    case 13: {
      int parm0 = (Integer)si.popPb();
      Type parm1 = (Type)si.popPb();
      Exp parm2 = (Exp)si.popPb();
      Exp result = actionObject.newCast(parm0,parm1,parm2);
      si.pushPb(result);
    }
    break;
    case 14: {
      int parm0 = (Integer)si.popPb();
      Exp parm1 = (Exp)si.popPb();
      Exp result = actionObject.newUnaryMinus(parm0,parm1);
      si.pushPb(result);
    }
    break;
    case 15: {
      int parm0 = (Integer)si.popPb();
      String parm1 = (String)si.popPb();
      Exp result = actionObject.newIdentfierExp(parm0,parm1);
      si.pushPb(result);
    }
    break;
    case 16: {
      Exp parm0 = (Exp)si.popPb();
      int parm1 = (Integer)si.popPb();
      Exp parm2 = (Exp)si.popPb();
      Exp result = actionObject.newArrayLookup(parm0,parm1,parm2);
      si.pushPb(result);
    }
    break;
    case 17: {
      int parm0 = (Integer)si.popPb();
      int parm1 = (Integer)si.popPb();
      Exp result = actionObject.newIntegerLiteral(parm0,parm1);
      si.pushPb(result);
    }
    break;
    case 18: {
      char parm0 = (Character)si.popPb();
      char result = actionObject.sub128(parm0);
      si.pushPb(result);
    }
    break;
    case 19: {
      char parm0 = (Character)si.popPb();
      List<Character> parm1 = (List<Character>)si.popPb();
      char parm2 = (Character)si.popPb();
      int result = actionObject.convertToInt(parm0,parm1,parm2);
      si.pushPb(result);
    }
    break;
    case 20: {
      char parm0 = (Character)si.popPb();
      int result = actionObject.convertToInt(parm0);
      si.pushPb(result);
    }
    break;
    case 21: {
      char parm0 = (Character)si.popPb();
      List<Character> parm1 = (List<Character>)si.popPb();
      char parm2 = (Character)si.popPb();
      int result = actionObject.convert16ToInt(parm0,parm1,parm2);
      si.pushPb(result);
    }
    break;
    case 22: {
      char parm0 = (Character)si.popPb();
      char result = actionObject.underscore(parm0);
      si.pushPb(result);
    }
    break;
    case 23: {
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
