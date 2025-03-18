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
public int getEofSym() { return 95; }
public int getNttSym() { return 96; }
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
public int numSymbols() { return 97;}
private static final int MIN_REDUCTION = 800;
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
1,378, // <start>
2,548, // ws*
3,537, // <program>
4,578, // <class decl>+
5,660, // <class decl>
6,386, // `class
68,226, // ws
69,512, // " "
70,540, // {10}
71,506, // "#"
  }
,
{ // state 1
  }
,
{ // state 2
MIN_REDUCTION+24, // (default reduction)
  }
,
{ // state 3
68,598, // ws
69,91, // " "
70,128, // {10}
MIN_REDUCTION+75, // (default reduction)
  }
,
{ // state 4
7,164, // ID
8,437, // `{
16,330, // `(
19,129, // <type>
20,558, // `int
21,559, // `boolean
25,524, // <stmt>
26,575, // <assign>
28,259, // <local var decl>
29,384, // `if
30,366, // <exp>
33,693, // <exp8>
34,210, // <exp7>
35,13, // <exp6>
36,18, // <exp5>
37,61, // <exp4>
39,306, // <exp3>
41,50, // <exp2>
42,159, // <cast exp>
43,311, // <unary exp>
44,57, // <exp1>
45,520, // `-
46,296, // INTLIT
47,744, // letter
48,493, // "p"
49,493, // "v"
50,493, // {"A".."Z" "a" "d" "f".."h" "j".."k" "m".."n" "q".."s" "w" "y".."z"}
51,493, // "b"
52,493, // "e"
53,493, // "t"
54,493, // "c"
55,493, // "i"
56,493, // "l"
57,493, // "o"
58,493, // "u"
59,493, // "x"
60,246, // letter128
61,120, // {199..218 231..250}
62,120, // {193..198 225..230}
64,167, // {"1".."9"}
65,655, // "0"
66,365, // digit128
67,765, // {176..185}
71,269, // "#"
74,576, // "("
76,538, // "{"
78,775, // "-"
  }
,
{ // state 5
MIN_REDUCTION+116, // (default reduction)
  }
,
{ // state 6
0x80000000|1, // match move
0x80000000|396, // no-match move
0x80000000|34, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 7
0x80000000|1, // match move
0x80000000|615, // no-match move
0x80000000|34, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 8
2,406, // ws*
68,516, // ws
69,454, // " "
70,751, // {10}
MIN_REDUCTION+48, // (default reduction)
  }
,
{ // state 9
MIN_REDUCTION+31, // (default reduction)
  }
,
{ // state 10
MIN_REDUCTION+98, // (default reduction)
  }
,
{ // state 11
0x80000000|54, // match move
0x80000000|453, // no-match move
0x80000000|34, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 12
0x80000000|273, // match move
0x80000000|258, // no-match move
0x80000000|34, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 13
MIN_REDUCTION+25, // (default reduction)
  }
,
{ // state 14
2,60, // ws*
68,391, // ws
69,702, // " "
70,228, // {10}
MIN_REDUCTION+72, // (default reduction)
  }
,
{ // state 15
MIN_REDUCTION+26, // (default reduction)
  }
,
{ // state 16
0x80000000|271, // match move
0x80000000|254, // no-match move
0x80000000|34, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 17
MIN_REDUCTION+25, // (default reduction)
  }
,
{ // state 18
MIN_REDUCTION+26, // (default reduction)
  }
,
{ // state 19
2,780, // ws*
23,MIN_REDUCTION+86, // `[
68,66, // ws
69,11, // " "
70,62, // {10}
80,MIN_REDUCTION+86, // "["
MIN_REDUCTION+86, // (default reduction)
  }
,
{ // state 20
0x80000000|1, // match move
0x80000000|566, // no-match move
0x80000000|34, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 21
23,MIN_REDUCTION+94, // `[
80,MIN_REDUCTION+94, // "["
MIN_REDUCTION+94, // (default reduction)
  }
,
{ // state 22
23,MIN_REDUCTION+94, // `[
80,MIN_REDUCTION+94, // "["
MIN_REDUCTION+94, // (default reduction)
  }
,
{ // state 23
MIN_REDUCTION+21, // (default reduction)
  }
,
{ // state 24
MIN_REDUCTION+26, // (default reduction)
  }
,
{ // state 25
23,MIN_REDUCTION+94, // `[
80,MIN_REDUCTION+94, // "["
MIN_REDUCTION+94, // (default reduction)
  }
,
{ // state 26
MIN_REDUCTION+25, // (default reduction)
  }
,
{ // state 27
0x80000000|1, // match move
0x80000000|607, // no-match move
0x80000000|34, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 28
0x80000000|1, // match move
0x80000000|610, // no-match move
0x80000000|34, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 29
31,323, // `else
71,300, // "#"
  }
,
{ // state 30
68,360, // ws
69,577, // " "
70,595, // {10}
MIN_REDUCTION+69, // (default reduction)
  }
,
{ // state 31
MIN_REDUCTION+45, // (default reduction)
  }
,
{ // state 32
MIN_REDUCTION+87, // (default reduction)
  }
,
{ // state 33
47,420, // letter
48,46, // "p"
49,46, // "v"
50,46, // {"A".."Z" "a" "d" "f".."h" "j".."k" "m".."n" "q".."s" "w" "y".."z"}
51,46, // "b"
52,46, // "e"
53,46, // "t"
54,46, // "c"
55,46, // "i"
56,46, // "l"
57,46, // "o"
58,46, // "u"
59,46, // "x"
60,349, // letter128
61,120, // {199..218 231..250}
62,120, // {193..198 225..230}
63,184, // digit
64,155, // {"1".."9"}
65,155, // "0"
66,739, // digit128
67,98, // {176..185}
84,446, // $$0
89,759, // idChar
90,736, // "_"
91,393, // idChar128
92,364, // {223}
  }
,
{ // state 34
23,675, // `[
80,545, // "["
  }
,
{ // state 35
0x80000000|1, // match move
0x80000000|590, // no-match move
0x80000000|34, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 36
24,459, // `]
81,519, // "]"
  }
,
{ // state 37
MIN_REDUCTION+31, // (default reduction)
  }
,
{ // state 38
MIN_REDUCTION+98, // (default reduction)
  }
,
{ // state 39
0x80000000|1, // match move
0x80000000|410, // no-match move
0x80000000|34, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 40
0x80000000|1, // match move
0x80000000|412, // no-match move
0x80000000|34, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 41
7,134, // ID
16,334, // `(
30,571, // <exp>
33,695, // <exp8>
34,206, // <exp7>
35,17, // <exp6>
36,15, // <exp5>
37,85, // <exp4>
39,304, // <exp3>
41,52, // <exp2>
42,157, // <cast exp>
43,312, // <unary exp>
44,68, // <exp1>
45,518, // `-
46,298, // INTLIT
47,584, // letter
48,493, // "p"
49,493, // "v"
50,493, // {"A".."Z" "a" "d" "f".."h" "j".."k" "m".."n" "q".."s" "w" "y".."z"}
51,493, // "b"
52,493, // "e"
53,493, // "t"
54,493, // "c"
55,493, // "i"
56,493, // "l"
57,493, // "o"
58,493, // "u"
59,493, // "x"
60,738, // letter128
61,450, // {199..218 231..250}
62,450, // {193..198 225..230}
64,169, // {"1".."9"}
65,653, // "0"
66,367, // digit128
67,766, // {176..185}
74,576, // "("
78,775, // "-"
  }
,
{ // state 42
68,742, // ws
69,616, // " "
70,601, // {10}
MIN_REDUCTION+83, // (default reduction)
  }
,
{ // state 43
MIN_REDUCTION+115, // (default reduction)
  }
,
{ // state 44
38,338, // `+
72,755, // "+"
MIN_REDUCTION+27, // (default reduction)
  }
,
{ // state 45
0x80000000|525, // match move
0x80000000|279, // no-match move
0x80000000|34, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 46
MIN_REDUCTION+41, // (default reduction)
  }
,
{ // state 47
MIN_REDUCTION+87, // (default reduction)
  }
,
{ // state 48
8,668, // `{
76,640, // "{"
  }
,
{ // state 49
2,411, // ws*
68,516, // ws
69,454, // " "
70,751, // {10}
MIN_REDUCTION+56, // (default reduction)
  }
,
{ // state 50
MIN_REDUCTION+31, // (default reduction)
  }
,
{ // state 51
68,529, // ws
69,203, // " "
70,222, // {10}
MIN_REDUCTION+61, // (default reduction)
  }
,
{ // state 52
MIN_REDUCTION+31, // (default reduction)
  }
,
{ // state 53
0x80000000|281, // match move
0x80000000|276, // no-match move
0x80000000|34, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 54
MIN_REDUCTION+45, // (default reduction)
  }
,
{ // state 55
68,628, // ws
69,709, // " "
70,501, // {10}
MIN_REDUCTION+47, // (default reduction)
  }
,
{ // state 56
0x80000000|1, // match move
0x80000000|740, // no-match move
0x80000000|34, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 57
0x80000000|1, // match move
0x80000000|477, // no-match move
0x80000000|34, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 58
MIN_REDUCTION+88, // (default reduction)
  }
,
{ // state 59
MIN_REDUCTION+115, // (default reduction)
  }
,
{ // state 60
68,69, // ws
69,702, // " "
70,228, // {10}
MIN_REDUCTION+71, // (default reduction)
  }
,
{ // state 61
38,320, // `+
72,755, // "+"
MIN_REDUCTION+27, // (default reduction)
  }
,
{ // state 62
0x80000000|593, // match move
0x80000000|161, // no-match move
0x80000000|34, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 63
23,MIN_REDUCTION+121, // `[
68,7, // ws
69,76, // " "
70,74, // {10}
80,MIN_REDUCTION+121, // "["
MIN_REDUCTION+121, // (default reduction)
  }
,
{ // state 64
0x80000000|1, // match move
0x80000000|747, // no-match move
0x80000000|34, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 65
0x80000000|1, // match move
0x80000000|748, // no-match move
0x80000000|34, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 66
0x80000000|560, // match move
0x80000000|329, // no-match move
0x80000000|34, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 67
MIN_REDUCTION+116, // (default reduction)
  }
,
{ // state 68
0x80000000|1, // match move
0x80000000|465, // no-match move
0x80000000|34, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 69
MIN_REDUCTION+115, // (default reduction)
  }
,
{ // state 70
47,420, // letter
48,46, // "p"
49,46, // "v"
50,46, // {"A".."Z" "a" "d" "f".."h" "j".."k" "m".."n" "q".."s" "w" "y".."z"}
51,46, // "b"
52,46, // "e"
53,46, // "t"
54,46, // "c"
55,46, // "i"
56,46, // "l"
57,46, // "o"
58,46, // "u"
59,46, // "x"
60,714, // letter128
61,438, // {199..218 231..250}
62,438, // {193..198 225..230}
63,184, // digit
64,155, // {"1".."9"}
65,155, // "0"
66,478, // digit128
67,776, // {176..185}
84,56, // $$0
89,759, // idChar
90,736, // "_"
91,84, // idChar128
92,569, // {223}
  }
,
{ // state 71
0x80000000|1, // match move
0x80000000|743, // no-match move
0x80000000|34, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 72
47,420, // letter
48,46, // "p"
49,46, // "v"
50,46, // {"A".."Z" "a" "d" "f".."h" "j".."k" "m".."n" "q".."s" "w" "y".."z"}
51,46, // "b"
52,46, // "e"
53,46, // "t"
54,46, // "c"
55,46, // "i"
56,46, // "l"
57,46, // "o"
58,46, // "u"
59,46, // "x"
60,567, // letter128
61,407, // {199..218 231..250}
62,407, // {193..198 225..230}
63,184, // digit
64,155, // {"1".."9"}
65,155, // "0"
66,275, // digit128
67,394, // {176..185}
83,779, // idChar*
84,494, // $$0
89,339, // idChar
90,736, // "_"
91,504, // idChar128
92,433, // {223}
  }
,
{ // state 73
MIN_REDUCTION+12, // (default reduction)
  }
,
{ // state 74
0x80000000|1, // match move
0x80000000|539, // no-match move
0x80000000|34, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 75
40,280, // `*
73,691, // "*"
MIN_REDUCTION+28, // (default reduction)
  }
,
{ // state 76
0x80000000|1, // match move
0x80000000|193, // no-match move
0x80000000|34, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 77
47,420, // letter
48,46, // "p"
49,46, // "v"
50,46, // {"A".."Z" "a" "d" "f".."h" "j".."k" "m".."n" "q".."s" "w" "y".."z"}
51,46, // "b"
52,46, // "e"
53,46, // "t"
54,46, // "c"
55,46, // "i"
56,46, // "l"
57,46, // "o"
58,46, // "u"
59,46, // "x"
60,638, // letter128
61,460, // {199..218 231..250}
62,460, // {193..198 225..230}
63,184, // digit
64,155, // {"1".."9"}
65,155, // "0"
66,483, // digit128
67,760, // {176..185}
84,71, // $$0
89,759, // idChar
90,736, // "_"
91,53, // idChar128
92,499, // {223}
  }
,
{ // state 78
40,286, // `*
73,691, // "*"
MIN_REDUCTION+28, // (default reduction)
  }
,
{ // state 79
MIN_REDUCTION+88, // (default reduction)
  }
,
{ // state 80
0x80000000|1, // match move
0x80000000|510, // no-match move
0x80000000|34, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 81
59,591, // "x"
  }
,
{ // state 82
2,647, // ws*
68,154, // ws
69,709, // " "
70,501, // {10}
MIN_REDUCTION+86, // (default reduction)
  }
,
{ // state 83
0x80000000|1, // match move
0x80000000|508, // no-match move
0x80000000|34, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 84
0x80000000|257, // match move
0x80000000|347, // no-match move
0x80000000|34, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 85
38,328, // `+
72,755, // "+"
MIN_REDUCTION+27, // (default reduction)
  }
,
{ // state 86
0x80000000|1, // match move
0x80000000|188, // no-match move
0x80000000|34, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 87
47,420, // letter
48,46, // "p"
49,46, // "v"
50,46, // {"A".."Z" "a" "d" "f".."h" "j".."k" "m".."n" "q".."s" "w" "y".."z"}
51,46, // "b"
52,46, // "e"
53,46, // "t"
54,46, // "c"
55,46, // "i"
56,46, // "l"
57,46, // "o"
58,46, // "u"
59,46, // "x"
60,630, // letter128
61,451, // {199..218 231..250}
62,451, // {193..198 225..230}
63,184, // digit
64,155, // {"1".."9"}
65,155, // "0"
66,492, // digit128
67,765, // {176..185}
84,65, // $$0
89,759, // idChar
90,736, // "_"
91,16, // idChar128
92,491, // {223}
  }
,
{ // state 88
0x80000000|1, // match move
0x80000000|186, // no-match move
0x80000000|34, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 89
47,420, // letter
48,46, // "p"
49,46, // "v"
50,46, // {"A".."Z" "a" "d" "f".."h" "j".."k" "m".."n" "q".."s" "w" "y".."z"}
51,46, // "b"
52,46, // "e"
53,46, // "t"
54,46, // "c"
55,46, // "i"
56,46, // "l"
57,46, // "o"
58,46, // "u"
59,46, // "x"
60,631, // letter128
61,450, // {199..218 231..250}
62,450, // {193..198 225..230}
63,184, // digit
64,155, // {"1".."9"}
65,155, // "0"
66,489, // digit128
67,766, // {176..185}
84,64, // $$0
89,759, // idChar
90,736, // "_"
91,12, // idChar128
92,488, // {223}
  }
,
{ // state 90
23,MIN_REDUCTION+42, // `[
80,MIN_REDUCTION+42, // "["
MIN_REDUCTION+42, // (default reduction)
  }
,
{ // state 91
MIN_REDUCTION+45, // (default reduction)
  }
,
{ // state 92
2,780, // ws*
MIN_REDUCTION+86, // (default reduction)
  }
,
{ // state 93
MIN_REDUCTION+98, // (default reduction)
  }
,
{ // state 94
MIN_REDUCTION+116, // (default reduction)
  }
,
{ // state 95
40,277, // `*
73,691, // "*"
MIN_REDUCTION+28, // (default reduction)
  }
,
{ // state 96
68,43, // ws
69,753, // " "
70,432, // {10}
MIN_REDUCTION+51, // (default reduction)
  }
,
{ // state 97
0x80000000|1, // match move
0x80000000|546, // no-match move
0x80000000|34, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 98
0x80000000|680, // match move
0x80000000|773, // no-match move
0x80000000|34, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 99
17,599, // `)
75,376, // ")"
  }
,
{ // state 100
0x80000000|1, // match move
0x80000000|166, // no-match move
0x80000000|34, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 101
0x80000000|1, // match move
0x80000000|542, // no-match move
0x80000000|34, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 102
MIN_REDUCTION+115, // (default reduction)
  }
,
{ // state 103
38,301, // `+
72,755, // "+"
MIN_REDUCTION+27, // (default reduction)
  }
,
{ // state 104
53,49, // "t"
  }
,
{ // state 105
MIN_REDUCTION+45, // (default reduction)
  }
,
{ // state 106
23,MIN_REDUCTION+42, // `[
80,MIN_REDUCTION+42, // "["
MIN_REDUCTION+42, // (default reduction)
  }
,
{ // state 107
-1, // $$start
-1, // <start>
-1, // ws*
-1, // <program>
-1, // <class decl>+
-1, // <class decl>
-1, // `class
164, // ID
437, // `{
-1, // <decl in class>*
481, // `}
-1, // `extends
-1, // <decl in class>
-1, // <method decl>
-1, // `public
-1, // `void
330, // `(
-1, // `)
-1, // <stmt>*
129, // <type>
558, // `int
559, // `boolean
-1, // <empty bracket pair>
-1, // `[
-1, // `]
515, // <stmt>
575, // <assign>
-1, // `;
259, // <local var decl>
384, // `if
366, // <exp>
-1, // `else
-1, // `=
693, // <exp8>
210, // <exp7>
13, // <exp6>
18, // <exp5>
61, // <exp4>
-1, // `+
306, // <exp3>
-1, // `*
50, // <exp2>
159, // <cast exp>
311, // <unary exp>
57, // <exp1>
520, // `-
296, // INTLIT
744, // letter
493, // "p"
493, // "v"
493, // {"A".."Z" "a" "d" "f".."h" "j".."k" "m".."n" "q".."s" "w" "y".."z"}
493, // "b"
493, // "e"
493, // "t"
493, // "c"
493, // "i"
493, // "l"
493, // "o"
493, // "u"
493, // "x"
246, // letter128
120, // {199..218 231..250}
120, // {193..198 225..230}
-1, // digit
167, // {"1".."9"}
655, // "0"
365, // digit128
765, // {176..185}
-1, // ws
-1, // " "
-1, // {10}
269, // "#"
-1, // "+"
-1, // "*"
576, // "("
-1, // ")"
538, // "{"
373, // "}"
775, // "-"
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
{ // state 108
23,MIN_REDUCTION+90, // `[
80,MIN_REDUCTION+90, // "["
MIN_REDUCTION+90, // (default reduction)
  }
,
{ // state 109
0x80000000|342, // match move
0x80000000|149, // no-match move
0x80000000|34, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 110
2,629, // ws*
23,MIN_REDUCTION+120, // `[
68,678, // ws
69,100, // " "
70,20, // {10}
80,MIN_REDUCTION+120, // "["
MIN_REDUCTION+120, // (default reduction)
  }
,
{ // state 111
0x80000000|345, // match move
0x80000000|150, // no-match move
0x80000000|34, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 112
40,241, // `*
73,691, // "*"
MIN_REDUCTION+28, // (default reduction)
  }
,
{ // state 113
17,741, // `)
75,363, // ")"
  }
,
{ // state 114
2,282, // ws*
MIN_REDUCTION+118, // (default reduction)
  }
,
{ // state 115
MIN_REDUCTION+46, // (default reduction)
  }
,
{ // state 116
2,6, // ws*
23,MIN_REDUCTION+82, // `[
68,684, // ws
69,76, // " "
70,74, // {10}
80,MIN_REDUCTION+82, // "["
MIN_REDUCTION+82, // (default reduction)
  }
,
{ // state 117
0x80000000|1, // match move
0x80000000|308, // no-match move
0x80000000|34, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 118
2,176, // ws*
  }
,
{ // state 119
0x80000000|1, // match move
0x80000000|309, // no-match move
0x80000000|34, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 120
0x80000000|627, // match move
0x80000000|597, // no-match move
0x80000000|34, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 121
MIN_REDUCTION+46, // (default reduction)
  }
,
{ // state 122
MIN_REDUCTION+88, // (default reduction)
  }
,
{ // state 123
MIN_REDUCTION+5, // (default reduction)
  }
,
{ // state 124
47,420, // letter
48,46, // "p"
49,46, // "v"
50,46, // {"A".."Z" "a" "d" "f".."h" "j".."k" "m".."n" "q".."s" "w" "y".."z"}
51,46, // "b"
52,46, // "e"
53,46, // "t"
54,46, // "c"
55,46, // "i"
56,46, // "l"
57,46, // "o"
58,46, // "u"
59,46, // "x"
60,646, // letter128
61,620, // {199..218 231..250}
62,620, // {193..198 225..230}
63,184, // digit
64,155, // {"1".."9"}
65,155, // "0"
66,732, // digit128
67,573, // {176..185}
83,156, // idChar*
84,553, // $$0
89,339, // idChar
90,736, // "_"
91,240, // idChar128
92,532, // {223}
  }
,
{ // state 125
23,MIN_REDUCTION+90, // `[
80,MIN_REDUCTION+90, // "["
MIN_REDUCTION+90, // (default reduction)
  }
,
{ // state 126
23,MIN_REDUCTION+90, // `[
80,MIN_REDUCTION+90, // "["
MIN_REDUCTION+90, // (default reduction)
  }
,
{ // state 127
0x80000000|1, // match move
0x80000000|327, // no-match move
0x80000000|34, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 128
MIN_REDUCTION+46, // (default reduction)
  }
,
{ // state 129
7,717, // ID
22,175, // <empty bracket pair>
23,36, // `[
47,398, // letter
48,493, // "p"
49,493, // "v"
50,493, // {"A".."Z" "a" "d" "f".."h" "j".."k" "m".."n" "q".."s" "w" "y".."z"}
51,493, // "b"
52,493, // "e"
53,493, // "t"
54,493, // "c"
55,493, // "i"
56,493, // "l"
57,493, // "o"
58,493, // "u"
59,493, // "x"
60,665, // letter128
61,632, // {199..218 231..250}
62,632, // {193..198 225..230}
80,545, // "["
  }
,
{ // state 130
2,699, // ws*
23,MIN_REDUCTION+120, // `[
68,688, // ws
69,88, // " "
70,97, // {10}
80,MIN_REDUCTION+120, // "["
MIN_REDUCTION+120, // (default reduction)
  }
,
{ // state 131
MIN_REDUCTION+8, // (default reduction)
  }
,
{ // state 132
0x80000000|118, // match move
0x80000000|187, // no-match move
0x80000000|34, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 133
2,703, // ws*
23,MIN_REDUCTION+120, // `[
68,686, // ws
69,86, // " "
70,101, // {10}
80,MIN_REDUCTION+120, // "["
MIN_REDUCTION+120, // (default reduction)
  }
,
{ // state 134
0x80000000|1, // match move
0x80000000|414, // no-match move
0x80000000|34, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 135
MIN_REDUCTION+115, // (default reduction)
  }
,
{ // state 136
0x80000000|1, // match move
0x80000000|418, // no-match move
0x80000000|34, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 137
MIN_REDUCTION+114, // (default reduction)
  }
,
{ // state 138
63,762, // digit
64,663, // {"1".."9"}
65,663, // "0"
66,784, // digit128
67,776, // {176..185}
85,353, // digit*
86,303, // $$1
  }
,
{ // state 139
MIN_REDUCTION+46, // (default reduction)
  }
,
{ // state 140
0x80000000|1, // match move
0x80000000|425, // no-match move
0x80000000|34, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 141
68,59, // ws
69,31, // " "
70,562, // {10}
MIN_REDUCTION+67, // (default reduction)
  }
,
{ // state 142
0x80000000|1, // match move
0x80000000|422, // no-match move
0x80000000|34, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 143
2,204, // ws*
68,245, // ws
69,700, // " "
70,291, // {10}
MIN_REDUCTION+86, // (default reduction)
  }
,
{ // state 144
MIN_REDUCTION+19, // (default reduction)
  }
,
{ // state 145
MIN_REDUCTION+115, // (default reduction)
  }
,
{ // state 146
MIN_REDUCTION+16, // (default reduction)
  }
,
{ // state 147
0x80000000|1, // match move
0x80000000|404, // no-match move
0x80000000|34, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 148
2,705, // ws*
23,MIN_REDUCTION+120, // `[
68,684, // ws
69,76, // " "
70,74, // {10}
80,MIN_REDUCTION+120, // "["
MIN_REDUCTION+120, // (default reduction)
  }
,
{ // state 149
2,40, // ws*
23,MIN_REDUCTION+82, // `[
68,686, // ws
69,86, // " "
70,101, // {10}
80,MIN_REDUCTION+82, // "["
MIN_REDUCTION+82, // (default reduction)
  }
,
{ // state 150
2,39, // ws*
23,MIN_REDUCTION+82, // `[
68,688, // ws
69,88, // " "
70,97, // {10}
80,MIN_REDUCTION+82, // "["
MIN_REDUCTION+82, // (default reduction)
  }
,
{ // state 151
68,628, // ws
69,709, // " "
70,501, // {10}
MIN_REDUCTION+55, // (default reduction)
  }
,
{ // state 152
MIN_REDUCTION+46, // (default reduction)
  }
,
{ // state 153
0x80000000|1, // match move
0x80000000|293, // no-match move
0x80000000|34, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 154
MIN_REDUCTION+116, // (default reduction)
  }
,
{ // state 155
MIN_REDUCTION+43, // (default reduction)
  }
,
{ // state 156
47,420, // letter
48,46, // "p"
49,46, // "v"
50,46, // {"A".."Z" "a" "d" "f".."h" "j".."k" "m".."n" "q".."s" "w" "y".."z"}
51,46, // "b"
52,46, // "e"
53,46, // "t"
54,46, // "c"
55,46, // "i"
56,46, // "l"
57,46, // "o"
58,46, // "u"
59,46, // "x"
60,646, // letter128
61,620, // {199..218 231..250}
62,620, // {193..198 225..230}
63,184, // digit
64,155, // {"1".."9"}
65,155, // "0"
66,732, // digit128
67,573, // {176..185}
84,400, // $$0
89,759, // idChar
90,736, // "_"
91,240, // idChar128
92,532, // {223}
  }
,
{ // state 157
MIN_REDUCTION+32, // (default reduction)
  }
,
{ // state 158
0x80000000|525, // match move
0x80000000|264, // no-match move
0x80000000|34, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 159
MIN_REDUCTION+32, // (default reduction)
  }
,
{ // state 160
MIN_REDUCTION+87, // (default reduction)
  }
,
{ // state 161
23,MIN_REDUCTION+46, // `[
80,MIN_REDUCTION+46, // "["
MIN_REDUCTION+46, // (default reduction)
  }
,
{ // state 162
0x80000000|525, // match move
0x80000000|262, // no-match move
0x80000000|34, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 163
MIN_REDUCTION+99, // (default reduction)
  }
,
{ // state 164
0x80000000|682, // match move
0x80000000|649, // no-match move
0x80000000|34, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 165
MIN_REDUCTION+87, // (default reduction)
  }
,
{ // state 166
23,MIN_REDUCTION+45, // `[
80,MIN_REDUCTION+45, // "["
MIN_REDUCTION+45, // (default reduction)
  }
,
{ // state 167
63,762, // digit
64,663, // {"1".."9"}
65,663, // "0"
66,764, // digit128
67,765, // {176..185}
85,417, // digit*
86,322, // $$1
  }
,
{ // state 168
0x80000000|525, // match move
0x80000000|397, // no-match move
0x80000000|34, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 169
63,762, // digit
64,663, // {"1".."9"}
65,663, // "0"
66,767, // digit128
67,766, // {176..185}
85,413, // digit*
86,319, // $$1
  }
,
{ // state 170
23,MIN_REDUCTION+100, // `[
80,MIN_REDUCTION+100, // "["
MIN_REDUCTION+100, // (default reduction)
  }
,
{ // state 171
68,581, // ws
69,105, // " "
70,121, // {10}
MIN_REDUCTION+63, // (default reduction)
  }
,
{ // state 172
23,MIN_REDUCTION+100, // `[
80,MIN_REDUCTION+100, // "["
MIN_REDUCTION+100, // (default reduction)
  }
,
{ // state 173
27,797, // `;
82,729, // ";"
  }
,
{ // state 174
23,MIN_REDUCTION+85, // `[
68,7, // ws
69,76, // " "
70,74, // {10}
80,MIN_REDUCTION+85, // "["
MIN_REDUCTION+85, // (default reduction)
  }
,
{ // state 175
MIN_REDUCTION+14, // (default reduction)
  }
,
{ // state 176
0x80000000|1, // match move
0x80000000|436, // no-match move
0x80000000|34, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 177
MIN_REDUCTION+46, // (default reduction)
  }
,
{ // state 178
MIN_REDUCTION+46, // (default reduction)
  }
,
{ // state 179
23,MIN_REDUCTION+85, // `[
68,27, // ws
69,86, // " "
70,101, // {10}
80,MIN_REDUCTION+85, // "["
MIN_REDUCTION+85, // (default reduction)
  }
,
{ // state 180
68,145, // ws
69,659, // " "
70,544, // {10}
MIN_REDUCTION+83, // (default reduction)
  }
,
{ // state 181
MIN_REDUCTION+44, // (default reduction)
  }
,
{ // state 182
MIN_REDUCTION+32, // (default reduction)
  }
,
{ // state 183
MIN_REDUCTION+115, // (default reduction)
  }
,
{ // state 184
MIN_REDUCTION+96, // (default reduction)
  }
,
{ // state 185
49,415, // "v"
  }
,
{ // state 186
23,MIN_REDUCTION+45, // `[
80,MIN_REDUCTION+45, // "["
MIN_REDUCTION+45, // (default reduction)
  }
,
{ // state 187
2,176, // ws*
23,MIN_REDUCTION+82, // `[
68,678, // ws
69,100, // " "
70,20, // {10}
80,MIN_REDUCTION+82, // "["
MIN_REDUCTION+82, // (default reduction)
  }
,
{ // state 188
23,MIN_REDUCTION+45, // `[
80,MIN_REDUCTION+45, // "["
MIN_REDUCTION+45, // (default reduction)
  }
,
{ // state 189
MIN_REDUCTION+17, // (default reduction)
  }
,
{ // state 190
0x80000000|1, // match move
0x80000000|563, // no-match move
0x80000000|34, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 191
23,MIN_REDUCTION+100, // `[
80,MIN_REDUCTION+100, // "["
MIN_REDUCTION+100, // (default reduction)
  }
,
{ // state 192
63,762, // digit
64,663, // {"1".."9"}
65,663, // "0"
66,772, // digit128
67,760, // {176..185}
85,421, // digit*
86,337, // $$1
  }
,
{ // state 193
23,MIN_REDUCTION+45, // `[
80,MIN_REDUCTION+45, // "["
MIN_REDUCTION+45, // (default reduction)
  }
,
{ // state 194
MIN_REDUCTION+116, // (default reduction)
  }
,
{ // state 195
23,MIN_REDUCTION+85, // `[
68,28, // ws
69,88, // " "
70,97, // {10}
80,MIN_REDUCTION+85, // "["
MIN_REDUCTION+85, // (default reduction)
  }
,
{ // state 196
0x80000000|1, // match move
0x80000000|487, // no-match move
0x80000000|34, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 197
0x80000000|1, // match move
0x80000000|490, // no-match move
0x80000000|34, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 198
51,445, // "b"
55,579, // "i"
  }
,
{ // state 199
15,763, // `void
71,185, // "#"
  }
,
{ // state 200
23,MIN_REDUCTION+100, // `[
80,MIN_REDUCTION+100, // "["
MIN_REDUCTION+100, // (default reduction)
  }
,
{ // state 201
MIN_REDUCTION+115, // (default reduction)
  }
,
{ // state 202
MIN_REDUCTION+24, // (default reduction)
  }
,
{ // state 203
MIN_REDUCTION+45, // (default reduction)
  }
,
{ // state 204
68,551, // ws
69,700, // " "
70,291, // {10}
MIN_REDUCTION+85, // (default reduction)
  }
,
{ // state 205
23,MIN_REDUCTION+44, // `[
80,MIN_REDUCTION+44, // "["
MIN_REDUCTION+44, // (default reduction)
  }
,
{ // state 206
MIN_REDUCTION+24, // (default reduction)
  }
,
{ // state 207
0x80000000|1, // match move
0x80000000|509, // no-match move
0x80000000|34, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 208
23,MIN_REDUCTION+85, // `[
68,35, // ws
69,100, // " "
70,20, // {10}
80,MIN_REDUCTION+85, // "["
MIN_REDUCTION+85, // (default reduction)
  }
,
{ // state 209
23,MIN_REDUCTION+100, // `[
80,MIN_REDUCTION+100, // "["
MIN_REDUCTION+100, // (default reduction)
  }
,
{ // state 210
MIN_REDUCTION+24, // (default reduction)
  }
,
{ // state 211
MIN_REDUCTION+44, // (default reduction)
  }
,
{ // state 212
96,MIN_REDUCTION+46, // $NT
MIN_REDUCTION+46, // (default reduction)
  }
,
{ // state 213
23,MIN_REDUCTION+44, // `[
80,MIN_REDUCTION+44, // "["
MIN_REDUCTION+44, // (default reduction)
  }
,
{ // state 214
MIN_REDUCTION+116, // (default reduction)
  }
,
{ // state 215
23,MIN_REDUCTION+44, // `[
80,MIN_REDUCTION+44, // "["
MIN_REDUCTION+44, // (default reduction)
  }
,
{ // state 216
0x80000000|318, // match move
0x80000000|116, // no-match move
0x80000000|34, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 217
68,619, // ws
69,454, // " "
70,751, // {10}
MIN_REDUCTION+81, // (default reduction)
  }
,
{ // state 218
MIN_REDUCTION+32, // (default reduction)
  }
,
{ // state 219
MIN_REDUCTION+115, // (default reduction)
  }
,
{ // state 220
MIN_REDUCTION+25, // (default reduction)
  }
,
{ // state 221
MIN_REDUCTION+26, // (default reduction)
  }
,
{ // state 222
MIN_REDUCTION+46, // (default reduction)
  }
,
{ // state 223
MIN_REDUCTION+116, // (default reduction)
  }
,
{ // state 224
68,371, // ws
69,248, // " "
70,139, // {10}
MIN_REDUCTION+117, // (default reduction)
  }
,
{ // state 225
MIN_REDUCTION+42, // (default reduction)
  }
,
{ // state 226
MIN_REDUCTION+116, // (default reduction)
  }
,
{ // state 227
MIN_REDUCTION+45, // (default reduction)
  }
,
{ // state 228
MIN_REDUCTION+46, // (default reduction)
  }
,
{ // state 229
MIN_REDUCTION+45, // (default reduction)
  }
,
{ // state 230
MIN_REDUCTION+100, // (default reduction)
  }
,
{ // state 231
17,372, // `)
22,639, // <empty bracket pair>
23,798, // `[
75,676, // ")"
80,545, // "["
  }
,
{ // state 232
68,742, // ws
69,616, // " "
70,601, // {10}
MIN_REDUCTION+71, // (default reduction)
  }
,
{ // state 233
68,102, // ws
69,602, // " "
70,622, // {10}
MIN_REDUCTION+77, // (default reduction)
  }
,
{ // state 234
MIN_REDUCTION+100, // (default reduction)
  }
,
{ // state 235
MIN_REDUCTION+105, // (default reduction)
  }
,
{ // state 236
0x80000000|1, // match move
0x80000000|423, // no-match move
0x80000000|34, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 237
2,375, // ws*
68,473, // ws
69,229, // " "
70,178, // {10}
MIN_REDUCTION+58, // (default reduction)
  }
,
{ // state 238
MIN_REDUCTION+44, // (default reduction)
  }
,
{ // state 239
47,420, // letter
48,46, // "p"
49,46, // "v"
50,46, // {"A".."Z" "a" "d" "f".."h" "j".."k" "m".."n" "q".."s" "w" "y".."z"}
51,46, // "b"
52,46, // "e"
53,46, // "t"
54,46, // "c"
55,46, // "i"
56,46, // "l"
57,46, // "o"
58,46, // "u"
59,46, // "x"
60,38, // letter128
61,667, // {199..218 231..250}
62,667, // {193..198 225..230}
63,184, // digit
64,155, // {"1".."9"}
65,155, // "0"
66,796, // digit128
67,181, // {176..185}
84,160, // $$0
89,759, // idChar
90,736, // "_"
91,522, // idChar128
92,230, // {223}
  }
,
{ // state 240
2,564, // ws*
68,154, // ws
69,709, // " "
70,501, // {10}
MIN_REDUCTION+118, // (default reduction)
  }
,
{ // state 241
7,147, // ID
16,243, // `(
41,750, // <exp2>
42,182, // <cast exp>
43,331, // <unary exp>
44,80, // <exp1>
45,527, // `-
46,287, // INTLIT
47,471, // letter
48,493, // "p"
49,493, // "v"
50,493, // {"A".."Z" "a" "d" "f".."h" "j".."k" "m".."n" "q".."s" "w" "y".."z"}
51,493, // "b"
52,493, // "e"
53,493, // "t"
54,493, // "c"
55,493, // "i"
56,493, // "l"
57,493, // "o"
58,493, // "u"
59,493, // "x"
60,718, // letter128
61,438, // {199..218 231..250}
62,438, // {193..198 225..230}
64,138, // {"1".."9"}
65,626, // "0"
66,355, // digit128
67,776, // {176..185}
74,576, // "("
78,775, // "-"
  }
,
{ // state 242
2,502, // ws*
68,194, // ws
69,602, // " "
70,622, // {10}
MIN_REDUCTION+80, // (default reduction)
  }
,
{ // state 243
7,290, // ID
19,332, // <type>
20,641, // `int
21,73, // `boolean
47,124, // letter
48,493, // "p"
49,493, // "v"
50,493, // {"A".."Z" "a" "d" "f".."h" "j".."k" "m".."n" "q".."s" "w" "y".."z"}
51,493, // "b"
52,493, // "e"
53,493, // "t"
54,493, // "c"
55,493, // "i"
56,493, // "l"
57,493, // "o"
58,493, // "u"
59,493, // "x"
60,82, // letter128
61,620, // {199..218 231..250}
62,620, // {193..198 225..230}
71,198, // "#"
  }
,
{ // state 244
0x80000000|1, // match move
0x80000000|25, // no-match move
0x80000000|34, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 245
MIN_REDUCTION+116, // (default reduction)
  }
,
{ // state 246
0x80000000|92, // match move
0x80000000|19, // no-match move
0x80000000|34, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 247
17,511, // `)
22,639, // <empty bracket pair>
23,798, // `[
75,676, // ")"
80,545, // "["
  }
,
{ // state 248
MIN_REDUCTION+45, // (default reduction)
  }
,
{ // state 249
17,480, // `)
22,639, // <empty bracket pair>
23,798, // `[
75,676, // ")"
80,545, // "["
  }
,
{ // state 250
0x80000000|1, // match move
0x80000000|22, // no-match move
0x80000000|34, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 251
7,134, // ID
16,334, // `(
30,23, // <exp>
33,695, // <exp8>
34,206, // <exp7>
35,17, // <exp6>
36,15, // <exp5>
37,85, // <exp4>
39,304, // <exp3>
41,52, // <exp2>
42,157, // <cast exp>
43,312, // <unary exp>
44,68, // <exp1>
45,518, // `-
46,298, // INTLIT
47,584, // letter
48,493, // "p"
49,493, // "v"
50,493, // {"A".."Z" "a" "d" "f".."h" "j".."k" "m".."n" "q".."s" "w" "y".."z"}
51,493, // "b"
52,493, // "e"
53,493, // "t"
54,493, // "c"
55,493, // "i"
56,493, // "l"
57,493, // "o"
58,493, // "u"
59,493, // "x"
60,738, // letter128
61,450, // {199..218 231..250}
62,450, // {193..198 225..230}
64,169, // {"1".."9"}
65,653, // "0"
66,367, // digit128
67,766, // {176..185}
74,576, // "("
78,775, // "-"
  }
,
{ // state 252
0x80000000|1, // match move
0x80000000|21, // no-match move
0x80000000|34, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 253
68,351, // ws
69,229, // " "
70,178, // {10}
MIN_REDUCTION+117, // (default reduction)
  }
,
{ // state 254
2,721, // ws*
23,MIN_REDUCTION+118, // `[
68,686, // ws
69,86, // " "
70,101, // {10}
80,MIN_REDUCTION+118, // "["
MIN_REDUCTION+118, // (default reduction)
  }
,
{ // state 255
47,420, // letter
48,46, // "p"
49,46, // "v"
50,46, // {"A".."Z" "a" "d" "f".."h" "j".."k" "m".."n" "q".."s" "w" "y".."z"}
51,46, // "b"
52,46, // "e"
53,46, // "t"
54,46, // "c"
55,46, // "i"
56,46, // "l"
57,46, // "o"
58,46, // "u"
59,46, // "x"
60,38, // letter128
61,667, // {199..218 231..250}
62,667, // {193..198 225..230}
63,184, // digit
64,155, // {"1".."9"}
65,155, // "0"
66,796, // digit128
67,181, // {176..185}
83,239, // idChar*
84,58, // $$0
89,339, // idChar
90,736, // "_"
91,522, // idChar128
92,230, // {223}
  }
,
{ // state 256
23,MIN_REDUCTION+91, // `[
68,35, // ws
69,100, // " "
70,20, // {10}
80,MIN_REDUCTION+91, // "["
MIN_REDUCTION+91, // (default reduction)
  }
,
{ // state 257
2,83, // ws*
  }
,
{ // state 258
2,719, // ws*
23,MIN_REDUCTION+118, // `[
68,688, // ws
69,88, // " "
70,97, // {10}
80,MIN_REDUCTION+118, // "["
MIN_REDUCTION+118, // (default reduction)
  }
,
{ // state 259
27,144, // `;
82,554, // ";"
  }
,
{ // state 260
MIN_REDUCTION+45, // (default reduction)
  }
,
{ // state 261
MIN_REDUCTION+100, // (default reduction)
  }
,
{ // state 262
23,MIN_REDUCTION+102, // `[
80,MIN_REDUCTION+102, // "["
MIN_REDUCTION+102, // (default reduction)
  }
,
{ // state 263
MIN_REDUCTION+46, // (default reduction)
  }
,
{ // state 264
23,MIN_REDUCTION+102, // `[
80,MIN_REDUCTION+102, // "["
MIN_REDUCTION+102, // (default reduction)
  }
,
{ // state 265
27,614, // `;
82,729, // ";"
  }
,
{ // state 266
MIN_REDUCTION+45, // (default reduction)
  }
,
{ // state 267
40,277, // `*
73,691, // "*"
MIN_REDUCTION+29, // (default reduction)
  }
,
{ // state 268
23,645, // `[
80,242, // "["
MIN_REDUCTION+35, // (default reduction)
  }
,
{ // state 269
51,317, // "b"
55,104, // "i"
72,237, // "+"
  }
,
{ // state 270
17,374, // `)
75,363, // ")"
  }
,
{ // state 271
2,721, // ws*
  }
,
{ // state 272
56,643, // "l"
  }
,
{ // state 273
2,719, // ws*
  }
,
{ // state 274
68,354, // ws
69,431, // " "
70,587, // {10}
MIN_REDUCTION+59, // (default reduction)
  }
,
{ // state 275
MIN_REDUCTION+99, // (default reduction)
  }
,
{ // state 276
2,730, // ws*
23,MIN_REDUCTION+118, // `[
68,684, // ws
69,76, // " "
70,74, // {10}
80,MIN_REDUCTION+118, // "["
MIN_REDUCTION+118, // (default reduction)
  }
,
{ // state 277
7,142, // ID
16,305, // `(
41,727, // <exp2>
42,218, // <cast exp>
43,324, // <unary exp>
44,140, // <exp1>
45,521, // `-
46,302, // INTLIT
47,623, // letter
48,493, // "p"
49,493, // "v"
50,493, // {"A".."Z" "a" "d" "f".."h" "j".."k" "m".."n" "q".."s" "w" "y".."z"}
51,493, // "b"
52,493, // "e"
53,493, // "t"
54,493, // "c"
55,493, // "i"
56,493, // "l"
57,493, // "o"
58,493, // "u"
59,493, // "x"
60,770, // letter128
61,460, // {199..218 231..250}
62,460, // {193..198 225..230}
64,192, // {"1".."9"}
65,673, // "0"
66,370, // digit128
67,760, // {176..185}
74,576, // "("
78,775, // "-"
  }
,
{ // state 278
2,685, // ws*
68,154, // ws
69,709, // " "
70,501, // {10}
MIN_REDUCTION+82, // (default reduction)
  }
,
{ // state 279
23,MIN_REDUCTION+102, // `[
80,MIN_REDUCTION+102, // "["
MIN_REDUCTION+102, // (default reduction)
  }
,
{ // state 280
7,134, // ID
16,334, // `(
41,723, // <exp2>
42,157, // <cast exp>
43,312, // <unary exp>
44,68, // <exp1>
45,518, // `-
46,298, // INTLIT
47,584, // letter
48,493, // "p"
49,493, // "v"
50,493, // {"A".."Z" "a" "d" "f".."h" "j".."k" "m".."n" "q".."s" "w" "y".."z"}
51,493, // "b"
52,493, // "e"
53,493, // "t"
54,493, // "c"
55,493, // "i"
56,493, // "l"
57,493, // "o"
58,493, // "u"
59,493, // "x"
60,738, // letter128
61,450, // {199..218 231..250}
62,450, // {193..198 225..230}
64,169, // {"1".."9"}
65,653, // "0"
66,367, // digit128
67,766, // {176..185}
74,576, // "("
78,775, // "-"
  }
,
{ // state 281
2,730, // ws*
  }
,
{ // state 282
0x80000000|791, // match move
0x80000000|556, // no-match move
0x80000000|34, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 283
MIN_REDUCTION+100, // (default reduction)
  }
,
{ // state 284
MIN_REDUCTION+45, // (default reduction)
  }
,
{ // state 285
23,651, // `[
80,242, // "["
MIN_REDUCTION+35, // (default reduction)
  }
,
{ // state 286
7,136, // ID
16,330, // `(
41,722, // <exp2>
42,159, // <cast exp>
43,311, // <unary exp>
44,57, // <exp1>
45,520, // `-
46,296, // INTLIT
47,586, // letter
48,493, // "p"
49,493, // "v"
50,493, // {"A".."Z" "a" "d" "f".."h" "j".."k" "m".."n" "q".."s" "w" "y".."z"}
51,493, // "b"
52,493, // "e"
53,493, // "t"
54,493, // "c"
55,493, // "i"
56,493, // "l"
57,493, // "o"
58,493, // "u"
59,493, // "x"
60,737, // letter128
61,451, // {199..218 231..250}
62,451, // {193..198 225..230}
64,167, // {"1".."9"}
65,655, // "0"
66,365, // digit128
67,765, // {176..185}
74,576, // "("
78,775, // "-"
  }
,
{ // state 287
0x80000000|1, // match move
0x80000000|344, // no-match move
0x80000000|34, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 288
23,656, // `[
80,242, // "["
MIN_REDUCTION+35, // (default reduction)
  }
,
{ // state 289
23,MIN_REDUCTION+91, // `[
68,27, // ws
69,86, // " "
70,101, // {10}
80,MIN_REDUCTION+91, // "["
MIN_REDUCTION+91, // (default reduction)
  }
,
{ // state 290
MIN_REDUCTION+13, // (default reduction)
  }
,
{ // state 291
MIN_REDUCTION+46, // (default reduction)
  }
,
{ // state 292
68,368, // ws
69,284, // " "
70,115, // {10}
MIN_REDUCTION+117, // (default reduction)
  }
,
{ // state 293
23,MIN_REDUCTION+89, // `[
80,MIN_REDUCTION+89, // "["
MIN_REDUCTION+89, // (default reduction)
  }
,
{ // state 294
0x80000000|1, // match move
0x80000000|757, // no-match move
0x80000000|34, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 295
9,315, // <decl in class>*
10,123, // `}
12,399, // <decl in class>
13,131, // <method decl>
14,199, // `public
71,749, // "#"
77,14, // "}"
  }
,
{ // state 296
0x80000000|1, // match move
0x80000000|326, // no-match move
0x80000000|34, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 297
23,MIN_REDUCTION+91, // `[
68,28, // ws
69,88, // " "
70,97, // {10}
80,MIN_REDUCTION+91, // "["
MIN_REDUCTION+91, // (default reduction)
  }
,
{ // state 298
0x80000000|1, // match move
0x80000000|325, // no-match move
0x80000000|34, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 299
MIN_REDUCTION+115, // (default reduction)
  }
,
{ // state 300
52,439, // "e"
  }
,
{ // state 301
7,142, // ID
16,305, // `(
39,95, // <exp3>
41,9, // <exp2>
42,218, // <cast exp>
43,324, // <unary exp>
44,140, // <exp1>
45,521, // `-
46,302, // INTLIT
47,623, // letter
48,493, // "p"
49,493, // "v"
50,493, // {"A".."Z" "a" "d" "f".."h" "j".."k" "m".."n" "q".."s" "w" "y".."z"}
51,493, // "b"
52,493, // "e"
53,493, // "t"
54,493, // "c"
55,493, // "i"
56,493, // "l"
57,493, // "o"
58,493, // "u"
59,493, // "x"
60,770, // letter128
61,460, // {199..218 231..250}
62,460, // {193..198 225..230}
64,192, // {"1".."9"}
65,673, // "0"
66,370, // digit128
67,760, // {176..185}
74,576, // "("
78,775, // "-"
  }
,
{ // state 302
0x80000000|1, // match move
0x80000000|361, // no-match move
0x80000000|34, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 303
0x80000000|1, // match move
0x80000000|698, // no-match move
0x80000000|34, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 304
40,280, // `*
73,691, // "*"
MIN_REDUCTION+29, // (default reduction)
  }
,
{ // state 305
7,290, // ID
19,231, // <type>
20,641, // `int
21,73, // `boolean
47,124, // letter
48,493, // "p"
49,493, // "v"
50,493, // {"A".."Z" "a" "d" "f".."h" "j".."k" "m".."n" "q".."s" "w" "y".."z"}
51,493, // "b"
52,493, // "e"
53,493, // "t"
54,493, // "c"
55,493, // "i"
56,493, // "l"
57,493, // "o"
58,493, // "u"
59,493, // "x"
60,82, // letter128
61,620, // {199..218 231..250}
62,620, // {193..198 225..230}
71,198, // "#"
  }
,
{ // state 306
40,286, // `*
73,691, // "*"
MIN_REDUCTION+29, // (default reduction)
  }
,
{ // state 307
23,637, // `[
80,242, // "["
MIN_REDUCTION+35, // (default reduction)
  }
,
{ // state 308
23,MIN_REDUCTION+89, // `[
80,MIN_REDUCTION+89, // "["
MIN_REDUCTION+89, // (default reduction)
  }
,
{ // state 309
23,MIN_REDUCTION+89, // `[
80,MIN_REDUCTION+89, // "["
MIN_REDUCTION+89, // (default reduction)
  }
,
{ // state 310
7,142, // ID
16,305, // `(
30,113, // <exp>
33,633, // <exp8>
34,202, // <exp7>
35,26, // <exp6>
36,24, // <exp5>
37,103, // <exp4>
39,267, // <exp3>
41,9, // <exp2>
42,218, // <cast exp>
43,324, // <unary exp>
44,140, // <exp1>
45,521, // `-
46,302, // INTLIT
47,623, // letter
48,493, // "p"
49,493, // "v"
50,493, // {"A".."Z" "a" "d" "f".."h" "j".."k" "m".."n" "q".."s" "w" "y".."z"}
51,493, // "b"
52,493, // "e"
53,493, // "t"
54,493, // "c"
55,493, // "i"
56,493, // "l"
57,493, // "o"
58,493, // "u"
59,493, // "x"
60,770, // letter128
61,460, // {199..218 231..250}
62,460, // {193..198 225..230}
64,192, // {"1".."9"}
65,673, // "0"
66,370, // digit128
67,760, // {176..185}
74,576, // "("
78,775, // "-"
  }
,
{ // state 311
MIN_REDUCTION+33, // (default reduction)
  }
,
{ // state 312
MIN_REDUCTION+33, // (default reduction)
  }
,
{ // state 313
96,MIN_REDUCTION+115, // $NT
MIN_REDUCTION+115, // (default reduction)
  }
,
{ // state 314
0x80000000|1, // match move
0x80000000|785, // no-match move
0x80000000|34, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 315
10,713, // `}
12,235, // <decl in class>
13,131, // <method decl>
14,199, // `public
71,749, // "#"
77,14, // "}"
  }
,
{ // state 316
MIN_REDUCTION+99, // (default reduction)
  }
,
{ // state 317
57,8, // "o"
  }
,
{ // state 318
2,6, // ws*
  }
,
{ // state 319
0x80000000|1, // match move
0x80000000|125, // no-match move
0x80000000|34, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 320
7,136, // ID
16,330, // `(
39,78, // <exp3>
41,50, // <exp2>
42,159, // <cast exp>
43,311, // <unary exp>
44,57, // <exp1>
45,520, // `-
46,296, // INTLIT
47,586, // letter
48,493, // "p"
49,493, // "v"
50,493, // {"A".."Z" "a" "d" "f".."h" "j".."k" "m".."n" "q".."s" "w" "y".."z"}
51,493, // "b"
52,493, // "e"
53,493, // "t"
54,493, // "c"
55,493, // "i"
56,493, // "l"
57,493, // "o"
58,493, // "u"
59,493, // "x"
60,737, // letter128
61,451, // {199..218 231..250}
62,451, // {193..198 225..230}
64,167, // {"1".."9"}
65,655, // "0"
66,365, // digit128
67,765, // {176..185}
74,576, // "("
78,775, // "-"
  }
,
{ // state 321
47,420, // letter
48,46, // "p"
49,46, // "v"
50,46, // {"A".."Z" "a" "d" "f".."h" "j".."k" "m".."n" "q".."s" "w" "y".."z"}
51,46, // "b"
52,46, // "e"
53,46, // "t"
54,46, // "c"
55,46, // "i"
56,46, // "l"
57,46, // "o"
58,46, // "u"
59,46, // "x"
60,10, // letter128
61,632, // {199..218 231..250}
62,632, // {193..198 225..230}
63,184, // digit
64,155, // {"1".."9"}
65,155, // "0"
66,782, // digit128
67,211, // {176..185}
84,32, // $$0
89,759, // idChar
90,736, // "_"
91,464, // idChar128
92,261, // {223}
  }
,
{ // state 322
0x80000000|1, // match move
0x80000000|126, // no-match move
0x80000000|34, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 323
7,164, // ID
8,783, // `{
16,330, // `(
19,129, // <type>
20,558, // `int
21,559, // `boolean
25,482, // <stmt>
26,173, // <assign>
28,265, // <local var decl>
29,534, // `if
30,366, // <exp>
33,693, // <exp8>
34,210, // <exp7>
35,13, // <exp6>
36,18, // <exp5>
37,61, // <exp4>
39,306, // <exp3>
41,50, // <exp2>
42,159, // <cast exp>
43,311, // <unary exp>
44,57, // <exp1>
45,520, // `-
46,296, // INTLIT
47,744, // letter
48,493, // "p"
49,493, // "v"
50,493, // {"A".."Z" "a" "d" "f".."h" "j".."k" "m".."n" "q".."s" "w" "y".."z"}
51,493, // "b"
52,493, // "e"
53,493, // "t"
54,493, // "c"
55,493, // "i"
56,493, // "l"
57,493, // "o"
58,493, // "u"
59,493, // "x"
60,246, // letter128
61,120, // {199..218 231..250}
62,120, // {193..198 225..230}
64,167, // {"1".."9"}
65,655, // "0"
66,365, // digit128
67,765, // {176..185}
71,269, // "#"
74,576, // "("
76,538, // "{"
78,775, // "-"
  }
,
{ // state 324
MIN_REDUCTION+33, // (default reduction)
  }
,
{ // state 325
23,MIN_REDUCTION+40, // `[
80,MIN_REDUCTION+40, // "["
MIN_REDUCTION+40, // (default reduction)
  }
,
{ // state 326
23,MIN_REDUCTION+40, // `[
80,MIN_REDUCTION+40, // "["
MIN_REDUCTION+40, // (default reduction)
  }
,
{ // state 327
23,MIN_REDUCTION+89, // `[
80,MIN_REDUCTION+89, // "["
MIN_REDUCTION+89, // (default reduction)
  }
,
{ // state 328
7,134, // ID
16,334, // `(
39,75, // <exp3>
41,52, // <exp2>
42,157, // <cast exp>
43,312, // <unary exp>
44,68, // <exp1>
45,518, // `-
46,298, // INTLIT
47,584, // letter
48,493, // "p"
49,493, // "v"
50,493, // {"A".."Z" "a" "d" "f".."h" "j".."k" "m".."n" "q".."s" "w" "y".."z"}
51,493, // "b"
52,493, // "e"
53,493, // "t"
54,493, // "c"
55,493, // "i"
56,493, // "l"
57,493, // "o"
58,493, // "u"
59,493, // "x"
60,738, // letter128
61,450, // {199..218 231..250}
62,450, // {193..198 225..230}
64,169, // {"1".."9"}
65,653, // "0"
66,367, // digit128
67,766, // {176..185}
74,576, // "("
78,775, // "-"
  }
,
{ // state 329
23,MIN_REDUCTION+116, // `[
80,MIN_REDUCTION+116, // "["
MIN_REDUCTION+116, // (default reduction)
  }
,
{ // state 330
7,290, // ID
19,247, // <type>
20,641, // `int
21,73, // `boolean
47,124, // letter
48,493, // "p"
49,493, // "v"
50,493, // {"A".."Z" "a" "d" "f".."h" "j".."k" "m".."n" "q".."s" "w" "y".."z"}
51,493, // "b"
52,493, // "e"
53,493, // "t"
54,493, // "c"
55,493, // "i"
56,493, // "l"
57,493, // "o"
58,493, // "u"
59,493, // "x"
60,82, // letter128
61,620, // {199..218 231..250}
62,620, // {193..198 225..230}
71,198, // "#"
  }
,
{ // state 331
MIN_REDUCTION+33, // (default reduction)
  }
,
{ // state 332
17,535, // `)
22,639, // <empty bracket pair>
23,798, // `[
75,676, // ")"
80,545, // "["
  }
,
{ // state 333
0x80000000|1, // match move
0x80000000|777, // no-match move
0x80000000|34, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 334
7,290, // ID
19,249, // <type>
20,641, // `int
21,73, // `boolean
47,124, // letter
48,493, // "p"
49,493, // "v"
50,493, // {"A".."Z" "a" "d" "f".."h" "j".."k" "m".."n" "q".."s" "w" "y".."z"}
51,493, // "b"
52,493, // "e"
53,493, // "t"
54,493, // "c"
55,493, // "i"
56,493, // "l"
57,493, // "o"
58,493, // "u"
59,493, // "x"
60,82, // letter128
61,620, // {199..218 231..250}
62,620, // {193..198 225..230}
71,198, // "#"
  }
,
{ // state 335
0x80000000|1, // match move
0x80000000|778, // no-match move
0x80000000|34, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 336
2,692, // ws*
23,MIN_REDUCTION+122, // `[
68,678, // ws
69,100, // " "
70,20, // {10}
80,MIN_REDUCTION+122, // "["
MIN_REDUCTION+122, // (default reduction)
  }
,
{ // state 337
0x80000000|1, // match move
0x80000000|108, // no-match move
0x80000000|34, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 338
7,147, // ID
16,243, // `(
39,112, // <exp3>
41,37, // <exp2>
42,182, // <cast exp>
43,331, // <unary exp>
44,80, // <exp1>
45,527, // `-
46,287, // INTLIT
47,471, // letter
48,493, // "p"
49,493, // "v"
50,493, // {"A".."Z" "a" "d" "f".."h" "j".."k" "m".."n" "q".."s" "w" "y".."z"}
51,493, // "b"
52,493, // "e"
53,493, // "t"
54,493, // "c"
55,493, // "i"
56,493, // "l"
57,493, // "o"
58,493, // "u"
59,493, // "x"
60,718, // letter128
61,438, // {199..218 231..250}
62,438, // {193..198 225..230}
64,138, // {"1".."9"}
65,626, // "0"
66,355, // digit128
67,776, // {176..185}
74,576, // "("
78,775, // "-"
  }
,
{ // state 339
MIN_REDUCTION+112, // (default reduction)
  }
,
{ // state 340
40,241, // `*
73,691, // "*"
MIN_REDUCTION+29, // (default reduction)
  }
,
{ // state 341
23,MIN_REDUCTION+91, // `[
68,7, // ws
69,76, // " "
70,74, // {10}
80,MIN_REDUCTION+91, // "["
MIN_REDUCTION+91, // (default reduction)
  }
,
{ // state 342
2,40, // ws*
  }
,
{ // state 343
47,420, // letter
48,46, // "p"
49,46, // "v"
50,46, // {"A".."Z" "a" "d" "f".."h" "j".."k" "m".."n" "q".."s" "w" "y".."z"}
51,46, // "b"
52,46, // "e"
53,46, // "t"
54,46, // "c"
55,46, // "i"
56,46, // "l"
57,46, // "o"
58,46, // "u"
59,46, // "x"
60,93, // letter128
61,624, // {199..218 231..250}
62,624, // {193..198 225..230}
63,184, // digit
64,155, // {"1".."9"}
65,155, // "0"
66,774, // digit128
67,238, // {176..185}
84,47, // $$0
89,759, // idChar
90,736, // "_"
91,426, // idChar128
92,283, // {223}
  }
,
{ // state 344
23,MIN_REDUCTION+40, // `[
80,MIN_REDUCTION+40, // "["
MIN_REDUCTION+40, // (default reduction)
  }
,
{ // state 345
2,39, // ws*
  }
,
{ // state 346
MIN_REDUCTION+85, // (default reduction)
  }
,
{ // state 347
2,83, // ws*
23,MIN_REDUCTION+118, // `[
68,678, // ws
69,100, // " "
70,20, // {10}
80,MIN_REDUCTION+118, // "["
MIN_REDUCTION+118, // (default reduction)
  }
,
{ // state 348
MIN_REDUCTION+88, // (default reduction)
  }
,
{ // state 349
0x80000000|402, // match move
0x80000000|618, // no-match move
0x80000000|34, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 350
MIN_REDUCTION+15, // (default reduction)
  }
,
{ // state 351
MIN_REDUCTION+115, // (default reduction)
  }
,
{ // state 352
MIN_REDUCTION+115, // (default reduction)
  }
,
{ // state 353
63,634, // digit
64,663, // {"1".."9"}
65,663, // "0"
66,784, // digit128
67,776, // {176..185}
86,127, // $$1
  }
,
{ // state 354
MIN_REDUCTION+115, // (default reduction)
  }
,
{ // state 355
0x80000000|380, // match move
0x80000000|385, // no-match move
0x80000000|34, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 356
MIN_REDUCTION+116, // (default reduction)
  }
,
{ // state 357
2,672, // ws*
23,MIN_REDUCTION+122, // `[
68,688, // ws
69,88, // " "
70,97, // {10}
80,MIN_REDUCTION+122, // "["
MIN_REDUCTION+122, // (default reduction)
  }
,
{ // state 358
2,670, // ws*
23,MIN_REDUCTION+122, // `[
68,686, // ws
69,86, // " "
70,101, // {10}
80,MIN_REDUCTION+122, // "["
MIN_REDUCTION+122, // (default reduction)
  }
,
{ // state 359
-1, // $$start
-1, // <start>
-1, // ws*
-1, // <program>
-1, // <class decl>+
-1, // <class decl>
-1, // `class
164, // ID
437, // `{
-1, // <decl in class>*
497, // `}
-1, // `extends
-1, // <decl in class>
-1, // <method decl>
-1, // `public
-1, // `void
330, // `(
-1, // `)
-1, // <stmt>*
129, // <type>
558, // `int
559, // `boolean
-1, // <empty bracket pair>
-1, // `[
-1, // `]
515, // <stmt>
575, // <assign>
-1, // `;
259, // <local var decl>
384, // `if
366, // <exp>
-1, // `else
-1, // `=
693, // <exp8>
210, // <exp7>
13, // <exp6>
18, // <exp5>
61, // <exp4>
-1, // `+
306, // <exp3>
-1, // `*
50, // <exp2>
159, // <cast exp>
311, // <unary exp>
57, // <exp1>
520, // `-
296, // INTLIT
744, // letter
493, // "p"
493, // "v"
493, // {"A".."Z" "a" "d" "f".."h" "j".."k" "m".."n" "q".."s" "w" "y".."z"}
493, // "b"
493, // "e"
493, // "t"
493, // "c"
493, // "i"
493, // "l"
493, // "o"
493, // "u"
493, // "x"
246, // letter128
120, // {199..218 231..250}
120, // {193..198 225..230}
-1, // digit
167, // {"1".."9"}
655, // "0"
365, // digit128
765, // {176..185}
-1, // ws
-1, // " "
-1, // {10}
269, // "#"
-1, // "+"
-1, // "*"
576, // "("
-1, // ")"
538, // "{"
536, // "}"
775, // "-"
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
{ // state 360
MIN_REDUCTION+115, // (default reduction)
  }
,
{ // state 361
23,MIN_REDUCTION+40, // `[
80,MIN_REDUCTION+40, // "["
MIN_REDUCTION+40, // (default reduction)
  }
,
{ // state 362
MIN_REDUCTION+115, // (default reduction)
  }
,
{ // state 363
2,654, // ws*
68,650, // ws
69,431, // " "
70,587, // {10}
MIN_REDUCTION+68, // (default reduction)
  }
,
{ // state 364
0x80000000|234, // match move
0x80000000|200, // no-match move
0x80000000|34, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 365
0x80000000|390, // match move
0x80000000|405, // no-match move
0x80000000|34, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 366
32,251, // `=
79,725, // "="
  }
,
{ // state 367
0x80000000|389, // match move
0x80000000|403, // no-match move
0x80000000|34, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 368
MIN_REDUCTION+115, // (default reduction)
  }
,
{ // state 369
2,652, // ws*
23,MIN_REDUCTION+122, // `[
68,684, // ws
69,76, // " "
70,74, // {10}
80,MIN_REDUCTION+122, // "["
MIN_REDUCTION+122, // (default reduction)
  }
,
{ // state 370
0x80000000|395, // match move
0x80000000|416, // no-match move
0x80000000|34, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 371
MIN_REDUCTION+115, // (default reduction)
  }
,
{ // state 372
7,142, // ID
16,305, // `(
42,479, // <cast exp>
44,696, // <exp1>
46,302, // INTLIT
47,623, // letter
48,493, // "p"
49,493, // "v"
50,493, // {"A".."Z" "a" "d" "f".."h" "j".."k" "m".."n" "q".."s" "w" "y".."z"}
51,493, // "b"
52,493, // "e"
53,493, // "t"
54,493, // "c"
55,493, // "i"
56,493, // "l"
57,493, // "o"
58,493, // "u"
59,493, // "x"
60,770, // letter128
61,460, // {199..218 231..250}
62,460, // {193..198 225..230}
64,192, // {"1".."9"}
65,673, // "0"
66,370, // digit128
67,760, // {176..185}
74,576, // "("
  }
,
{ // state 373
2,232, // ws*
68,664, // ws
69,616, // " "
70,601, // {10}
MIN_REDUCTION+72, // (default reduction)
  }
,
{ // state 374
7,164, // ID
8,783, // `{
16,330, // `(
19,129, // <type>
20,558, // `int
21,559, // `boolean
25,29, // <stmt>
26,173, // <assign>
28,265, // <local var decl>
29,534, // `if
30,366, // <exp>
33,693, // <exp8>
34,210, // <exp7>
35,13, // <exp6>
36,18, // <exp5>
37,61, // <exp4>
39,306, // <exp3>
41,50, // <exp2>
42,159, // <cast exp>
43,311, // <unary exp>
44,57, // <exp1>
45,520, // `-
46,296, // INTLIT
47,744, // letter
48,493, // "p"
49,493, // "v"
50,493, // {"A".."Z" "a" "d" "f".."h" "j".."k" "m".."n" "q".."s" "w" "y".."z"}
51,493, // "b"
52,493, // "e"
53,493, // "t"
54,493, // "c"
55,493, // "i"
56,493, // "l"
57,493, // "o"
58,493, // "u"
59,493, // "x"
60,246, // letter128
61,120, // {199..218 231..250}
62,120, // {193..198 225..230}
64,167, // {"1".."9"}
65,655, // "0"
66,365, // digit128
67,765, // {176..185}
71,269, // "#"
74,576, // "("
76,538, // "{"
78,775, // "-"
  }
,
{ // state 375
68,351, // ws
69,229, // " "
70,178, // {10}
MIN_REDUCTION+57, // (default reduction)
  }
,
{ // state 376
2,552, // ws*
68,434, // ws
69,284, // " "
70,115, // {10}
MIN_REDUCTION+68, // (default reduction)
  }
,
{ // state 377
2,657, // ws*
68,585, // ws
69,600, // " "
70,212, // {10}
96,MIN_REDUCTION+82, // $NT
  }
,
{ // state 378
95,MIN_REDUCTION+0, // $
  }
,
{ // state 379
47,420, // letter
48,46, // "p"
49,46, // "v"
50,46, // {"A".."Z" "a" "d" "f".."h" "j".."k" "m".."n" "q".."s" "w" "y".."z"}
51,46, // "b"
52,46, // "e"
53,46, // "t"
54,46, // "c"
55,46, // "i"
56,46, // "l"
57,46, // "o"
58,46, // "u"
59,46, // "x"
60,93, // letter128
61,624, // {199..218 231..250}
62,624, // {193..198 225..230}
63,184, // digit
64,155, // {"1".."9"}
65,155, // "0"
66,774, // digit128
67,238, // {176..185}
83,343, // idChar*
84,122, // $$0
89,339, // idChar
90,736, // "_"
91,426, // idChar128
92,283, // {223}
  }
,
{ // state 380
2,495, // ws*
  }
,
{ // state 381
2,781, // ws*
68,194, // ws
69,602, // " "
70,622, // {10}
MIN_REDUCTION+66, // (default reduction)
  }
,
{ // state 382
0x80000000|442, // match move
0x80000000|336, // no-match move
0x80000000|34, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 383
24,543, // `]
81,109, // "]"
  }
,
{ // state 384
16,310, // `(
74,381, // "("
  }
,
{ // state 385
2,495, // ws*
23,MIN_REDUCTION+92, // `[
68,678, // ws
69,100, // " "
70,20, // {10}
80,MIN_REDUCTION+92, // "["
MIN_REDUCTION+92, // (default reduction)
  }
,
{ // state 386
7,605, // ID
47,72, // letter
48,493, // "p"
49,493, // "v"
50,493, // {"A".."Z" "a" "d" "f".."h" "j".."k" "m".."n" "q".."s" "w" "y".."z"}
51,493, // "b"
52,493, // "e"
53,493, // "t"
54,493, // "c"
55,493, // "i"
56,493, // "l"
57,493, // "o"
58,493, // "u"
59,493, // "x"
60,143, // letter128
61,407, // {199..218 231..250}
62,407, // {193..198 225..230}
  }
,
{ // state 387
2,51, // ws*
68,596, // ws
69,203, // " "
70,222, // {10}
MIN_REDUCTION+62, // (default reduction)
  }
,
{ // state 388
24,547, // `]
81,111, // "]"
  }
,
{ // state 389
2,470, // ws*
  }
,
{ // state 390
2,468, // ws*
  }
,
{ // state 391
MIN_REDUCTION+116, // (default reduction)
  }
,
{ // state 392
24,549, // `]
81,216, // "]"
  }
,
{ // state 393
0x80000000|114, // match move
0x80000000|613, // no-match move
0x80000000|34, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 394
MIN_REDUCTION+44, // (default reduction)
  }
,
{ // state 395
2,428, // ws*
  }
,
{ // state 396
23,MIN_REDUCTION+81, // `[
68,7, // ws
69,76, // " "
70,74, // {10}
80,MIN_REDUCTION+81, // "["
MIN_REDUCTION+81, // (default reduction)
  }
,
{ // state 397
23,MIN_REDUCTION+102, // `[
80,MIN_REDUCTION+102, // "["
MIN_REDUCTION+102, // (default reduction)
  }
,
{ // state 398
47,420, // letter
48,46, // "p"
49,46, // "v"
50,46, // {"A".."Z" "a" "d" "f".."h" "j".."k" "m".."n" "q".."s" "w" "y".."z"}
51,46, // "b"
52,46, // "e"
53,46, // "t"
54,46, // "c"
55,46, // "i"
56,46, // "l"
57,46, // "o"
58,46, // "u"
59,46, // "x"
60,10, // letter128
61,632, // {199..218 231..250}
62,632, // {193..198 225..230}
63,184, // digit
64,155, // {"1".."9"}
65,155, // "0"
66,782, // digit128
67,211, // {176..185}
83,321, // idChar*
84,79, // $$0
89,339, // idChar
90,736, // "_"
91,464, // idChar128
92,261, // {223}
  }
,
{ // state 399
MIN_REDUCTION+106, // (default reduction)
  }
,
{ // state 400
MIN_REDUCTION+87, // (default reduction)
  }
,
{ // state 401
MIN_REDUCTION+10, // (default reduction)
  }
,
{ // state 402
MIN_REDUCTION+98, // (default reduction)
  }
,
{ // state 403
2,470, // ws*
23,MIN_REDUCTION+92, // `[
68,688, // ws
69,88, // " "
70,97, // {10}
80,MIN_REDUCTION+92, // "["
MIN_REDUCTION+92, // (default reduction)
  }
,
{ // state 404
23,MIN_REDUCTION+38, // `[
80,MIN_REDUCTION+38, // "["
MIN_REDUCTION+38, // (default reduction)
  }
,
{ // state 405
2,468, // ws*
23,MIN_REDUCTION+92, // `[
68,686, // ws
69,86, // " "
70,101, // {10}
80,MIN_REDUCTION+92, // "["
MIN_REDUCTION+92, // (default reduction)
  }
,
{ // state 406
68,619, // ws
69,454, // " "
70,751, // {10}
MIN_REDUCTION+47, // (default reduction)
  }
,
{ // state 407
MIN_REDUCTION+42, // (default reduction)
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
164, // ID
437, // `{
-1, // <decl in class>*
189, // `}
-1, // `extends
-1, // <decl in class>
-1, // <method decl>
-1, // `public
-1, // `void
330, // `(
-1, // `)
-1, // <stmt>*
129, // <type>
558, // `int
559, // `boolean
-1, // <empty bracket pair>
-1, // `[
-1, // `]
515, // <stmt>
575, // <assign>
-1, // `;
259, // <local var decl>
384, // `if
366, // <exp>
-1, // `else
-1, // `=
693, // <exp8>
210, // <exp7>
13, // <exp6>
18, // <exp5>
61, // <exp4>
-1, // `+
306, // <exp3>
-1, // `*
50, // <exp2>
159, // <cast exp>
311, // <unary exp>
57, // <exp1>
520, // `-
296, // INTLIT
744, // letter
493, // "p"
493, // "v"
493, // {"A".."Z" "a" "d" "f".."h" "j".."k" "m".."n" "q".."s" "w" "y".."z"}
493, // "b"
493, // "e"
493, // "t"
493, // "c"
493, // "i"
493, // "l"
493, // "o"
493, // "u"
493, // "x"
246, // letter128
120, // {199..218 231..250}
120, // {193..198 225..230}
-1, // digit
167, // {"1".."9"}
655, // "0"
365, // digit128
765, // {176..185}
-1, // ws
-1, // " "
-1, // {10}
269, // "#"
-1, // "+"
-1, // "*"
576, // "("
-1, // ")"
538, // "{"
716, // "}"
775, // "-"
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
68,43, // ws
69,753, // " "
70,432, // {10}
MIN_REDUCTION+49, // (default reduction)
  }
,
{ // state 410
23,MIN_REDUCTION+81, // `[
68,28, // ws
69,88, // " "
70,97, // {10}
80,MIN_REDUCTION+81, // "["
MIN_REDUCTION+81, // (default reduction)
  }
,
{ // state 411
68,619, // ws
69,454, // " "
70,751, // {10}
MIN_REDUCTION+55, // (default reduction)
  }
,
{ // state 412
23,MIN_REDUCTION+81, // `[
68,27, // ws
69,86, // " "
70,101, // {10}
80,MIN_REDUCTION+81, // "["
MIN_REDUCTION+81, // (default reduction)
  }
,
{ // state 413
63,634, // digit
64,663, // {"1".."9"}
65,663, // "0"
66,767, // digit128
67,766, // {176..185}
86,119, // $$1
  }
,
{ // state 414
23,MIN_REDUCTION+38, // `[
80,MIN_REDUCTION+38, // "["
MIN_REDUCTION+38, // (default reduction)
  }
,
{ // state 415
57,687, // "o"
  }
,
{ // state 416
2,428, // ws*
23,MIN_REDUCTION+92, // `[
68,684, // ws
69,76, // " "
70,74, // {10}
80,MIN_REDUCTION+92, // "["
MIN_REDUCTION+92, // (default reduction)
  }
,
{ // state 417
63,634, // digit
64,663, // {"1".."9"}
65,663, // "0"
66,764, // digit128
67,765, // {176..185}
86,117, // $$1
  }
,
{ // state 418
23,MIN_REDUCTION+38, // `[
80,MIN_REDUCTION+38, // "["
MIN_REDUCTION+38, // (default reduction)
  }
,
{ // state 419
24,711, // `]
81,132, // "]"
  }
,
{ // state 420
MIN_REDUCTION+95, // (default reduction)
  }
,
{ // state 421
63,634, // digit
64,663, // {"1".."9"}
65,663, // "0"
66,772, // digit128
67,760, // {176..185}
86,153, // $$1
  }
,
{ // state 422
23,MIN_REDUCTION+38, // `[
80,MIN_REDUCTION+38, // "["
MIN_REDUCTION+38, // (default reduction)
  }
,
{ // state 423
23,MIN_REDUCTION+94, // `[
80,MIN_REDUCTION+94, // "["
MIN_REDUCTION+94, // (default reduction)
  }
,
{ // state 424
MIN_REDUCTION+34, // (default reduction)
  }
,
{ // state 425
23,645, // `[
80,242, // "["
MIN_REDUCTION+37, // (default reduction)
  }
,
{ // state 426
2,253, // ws*
68,473, // ws
69,229, // " "
70,178, // {10}
MIN_REDUCTION+118, // (default reduction)
  }
,
{ // state 427
23,MIN_REDUCTION+119, // `[
68,35, // ws
69,100, // " "
70,20, // {10}
80,MIN_REDUCTION+119, // "["
MIN_REDUCTION+119, // (default reduction)
  }
,
{ // state 428
0x80000000|1, // match move
0x80000000|341, // no-match move
0x80000000|34, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 429
2,701, // ws*
68,475, // ws
69,227, // " "
70,177, // {10}
MIN_REDUCTION+66, // (default reduction)
  }
,
{ // state 430
23,MIN_REDUCTION+98, // `[
80,MIN_REDUCTION+98, // "["
MIN_REDUCTION+98, // (default reduction)
  }
,
{ // state 431
MIN_REDUCTION+45, // (default reduction)
  }
,
{ // state 432
MIN_REDUCTION+46, // (default reduction)
  }
,
{ // state 433
MIN_REDUCTION+100, // (default reduction)
  }
,
{ // state 434
MIN_REDUCTION+116, // (default reduction)
  }
,
{ // state 435
MIN_REDUCTION+116, // (default reduction)
  }
,
{ // state 436
23,MIN_REDUCTION+81, // `[
68,35, // ws
69,100, // " "
70,20, // {10}
80,MIN_REDUCTION+81, // "["
MIN_REDUCTION+81, // (default reduction)
  }
,
{ // state 437
-1, // $$start
-1, // <start>
-1, // ws*
-1, // <program>
-1, // <class decl>+
-1, // <class decl>
-1, // `class
164, // ID
437, // `{
-1, // <decl in class>*
550, // `}
-1, // `extends
-1, // <decl in class>
-1, // <method decl>
-1, // `public
-1, // `void
330, // `(
-1, // `)
107, // <stmt>*
129, // <type>
558, // `int
559, // `boolean
-1, // <empty bracket pair>
-1, // `[
-1, // `]
769, // <stmt>
575, // <assign>
-1, // `;
259, // <local var decl>
384, // `if
366, // <exp>
-1, // `else
-1, // `=
693, // <exp8>
210, // <exp7>
13, // <exp6>
18, // <exp5>
61, // <exp4>
-1, // `+
306, // <exp3>
-1, // `*
50, // <exp2>
159, // <cast exp>
311, // <unary exp>
57, // <exp1>
520, // `-
296, // INTLIT
744, // letter
493, // "p"
493, // "v"
493, // {"A".."Z" "a" "d" "f".."h" "j".."k" "m".."n" "q".."s" "w" "y".."z"}
493, // "b"
493, // "e"
493, // "t"
493, // "c"
493, // "i"
493, // "l"
493, // "o"
493, // "u"
493, // "x"
246, // letter128
120, // {199..218 231..250}
120, // {193..198 225..230}
-1, // digit
167, // {"1".."9"}
655, // "0"
365, // digit128
765, // {176..185}
-1, // ws
-1, // " "
-1, // {10}
269, // "#"
-1, // "+"
-1, // "*"
576, // "("
-1, // ")"
538, // "{"
373, // "}"
775, // "-"
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
{ // state 438
0x80000000|225, // match move
0x80000000|90, // no-match move
0x80000000|34, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 439
56,758, // "l"
  }
,
{ // state 440
16,99, // `(
74,429, // "("
  }
,
{ // state 441
23,MIN_REDUCTION+98, // `[
80,MIN_REDUCTION+98, // "["
MIN_REDUCTION+98, // (default reduction)
  }
,
{ // state 442
2,692, // ws*
  }
,
{ // state 443
23,MIN_REDUCTION+98, // `[
80,MIN_REDUCTION+98, // "["
MIN_REDUCTION+98, // (default reduction)
  }
,
{ // state 444
MIN_REDUCTION+45, // (default reduction)
  }
,
{ // state 445
57,681, // "o"
  }
,
{ // state 446
0x80000000|726, // match move
0x80000000|580, // no-match move
0x80000000|34, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 447
0x80000000|474, // match move
0x80000000|369, // no-match move
0x80000000|34, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 448
96,MIN_REDUCTION+15, // $NT
  }
,
{ // state 449
MIN_REDUCTION+116, // (default reduction)
  }
,
{ // state 450
0x80000000|225, // match move
0x80000000|715, // no-match move
0x80000000|34, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 451
0x80000000|225, // match move
0x80000000|106, // no-match move
0x80000000|34, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 452
48,644, // "p"
49,644, // "v"
50,644, // {"A".."Z" "a" "d" "f".."h" "j".."k" "m".."n" "q".."s" "w" "y".."z"}
51,644, // "b"
52,644, // "e"
53,644, // "t"
54,644, // "c"
55,644, // "i"
56,644, // "l"
57,644, // "o"
58,644, // "u"
59,644, // "x"
62,45, // {193..198 225..230}
64,644, // {"1".."9"}
65,644, // "0"
67,45, // {176..185}
88,314, // $$2
93,472, // hexDigit
94,382, // hexDigit128
  }
,
{ // state 453
23,MIN_REDUCTION+45, // `[
80,MIN_REDUCTION+45, // "["
MIN_REDUCTION+45, // (default reduction)
  }
,
{ // state 454
MIN_REDUCTION+45, // (default reduction)
  }
,
{ // state 455
23,MIN_REDUCTION+99, // `[
80,MIN_REDUCTION+99, // "["
MIN_REDUCTION+99, // (default reduction)
  }
,
{ // state 456
23,MIN_REDUCTION+98, // `[
80,MIN_REDUCTION+98, // "["
MIN_REDUCTION+98, // (default reduction)
  }
,
{ // state 457
0x80000000|458, // match move
0x80000000|358, // no-match move
0x80000000|34, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 458
2,670, // ws*
  }
,
{ // state 459
MIN_REDUCTION+15, // (default reduction)
  }
,
{ // state 460
0x80000000|225, // match move
0x80000000|720, // no-match move
0x80000000|34, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 461
MIN_REDUCTION+44, // (default reduction)
  }
,
{ // state 462
0x80000000|463, // match move
0x80000000|357, // no-match move
0x80000000|34, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 463
2,672, // ws*
  }
,
{ // state 464
2,224, // ws*
68,449, // ws
69,248, // " "
70,139, // {10}
MIN_REDUCTION+118, // (default reduction)
  }
,
{ // state 465
23,656, // `[
80,242, // "["
MIN_REDUCTION+37, // (default reduction)
  }
,
{ // state 466
MIN_REDUCTION+34, // (default reduction)
  }
,
{ // state 467
MIN_REDUCTION+7, // (default reduction)
  }
,
{ // state 468
0x80000000|1, // match move
0x80000000|289, // no-match move
0x80000000|34, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 469
MIN_REDUCTION+34, // (default reduction)
  }
,
{ // state 470
0x80000000|1, // match move
0x80000000|297, // no-match move
0x80000000|34, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 471
47,420, // letter
48,46, // "p"
49,46, // "v"
50,46, // {"A".."Z" "a" "d" "f".."h" "j".."k" "m".."n" "q".."s" "w" "y".."z"}
51,46, // "b"
52,46, // "e"
53,46, // "t"
54,46, // "c"
55,46, // "i"
56,46, // "l"
57,46, // "o"
58,46, // "u"
59,46, // "x"
60,714, // letter128
61,438, // {199..218 231..250}
62,438, // {193..198 225..230}
63,184, // digit
64,155, // {"1".."9"}
65,155, // "0"
66,478, // digit128
67,776, // {176..185}
83,70, // idChar*
84,207, // $$0
89,339, // idChar
90,736, // "_"
91,84, // idChar128
92,569, // {223}
  }
,
{ // state 472
MIN_REDUCTION+107, // (default reduction)
  }
,
{ // state 473
MIN_REDUCTION+116, // (default reduction)
  }
,
{ // state 474
2,652, // ws*
  }
,
{ // state 475
MIN_REDUCTION+116, // (default reduction)
  }
,
{ // state 476
23,MIN_REDUCTION+115, // `[
80,MIN_REDUCTION+115, // "["
MIN_REDUCTION+115, // (default reduction)
  }
,
{ // state 477
23,651, // `[
80,242, // "["
MIN_REDUCTION+37, // (default reduction)
  }
,
{ // state 478
0x80000000|316, // match move
0x80000000|771, // no-match move
0x80000000|34, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 479
MIN_REDUCTION+34, // (default reduction)
  }
,
{ // state 480
7,134, // ID
16,334, // `(
42,466, // <cast exp>
44,635, // <exp1>
46,298, // INTLIT
47,584, // letter
48,493, // "p"
49,493, // "v"
50,493, // {"A".."Z" "a" "d" "f".."h" "j".."k" "m".."n" "q".."s" "w" "y".."z"}
51,493, // "b"
52,493, // "e"
53,493, // "t"
54,493, // "c"
55,493, // "i"
56,493, // "l"
57,493, // "o"
58,493, // "u"
59,493, // "x"
60,738, // letter128
61,450, // {199..218 231..250}
62,450, // {193..198 225..230}
64,169, // {"1".."9"}
65,653, // "0"
66,367, // digit128
67,766, // {176..185}
74,576, // "("
  }
,
{ // state 481
MIN_REDUCTION+17, // (default reduction)
  }
,
{ // state 482
MIN_REDUCTION+20, // (default reduction)
  }
,
{ // state 483
0x80000000|316, // match move
0x80000000|745, // no-match move
0x80000000|34, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 484
MIN_REDUCTION+115, // (default reduction)
  }
,
{ // state 485
MIN_REDUCTION+46, // (default reduction)
  }
,
{ // state 486
2,661, // ws*
23,MIN_REDUCTION+86, // `[
68,684, // ws
69,76, // " "
70,74, // {10}
80,MIN_REDUCTION+86, // "["
MIN_REDUCTION+86, // (default reduction)
  }
,
{ // state 487
23,MIN_REDUCTION+88, // `[
80,MIN_REDUCTION+88, // "["
MIN_REDUCTION+88, // (default reduction)
  }
,
{ // state 488
0x80000000|621, // match move
0x80000000|170, // no-match move
0x80000000|34, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 489
0x80000000|316, // match move
0x80000000|734, // no-match move
0x80000000|34, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 490
23,MIN_REDUCTION+88, // `[
80,MIN_REDUCTION+88, // "["
MIN_REDUCTION+88, // (default reduction)
  }
,
{ // state 491
0x80000000|621, // match move
0x80000000|172, // no-match move
0x80000000|34, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 492
0x80000000|316, // match move
0x80000000|735, // no-match move
0x80000000|34, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 493
MIN_REDUCTION+41, // (default reduction)
  }
,
{ // state 494
MIN_REDUCTION+88, // (default reduction)
  }
,
{ // state 495
0x80000000|1, // match move
0x80000000|256, // no-match move
0x80000000|34, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 496
68,201, // ws
69,746, // " "
70,485, // {10}
MIN_REDUCTION+71, // (default reduction)
  }
,
{ // state 497
MIN_REDUCTION+9, // (default reduction)
  }
,
{ // state 498
48,644, // "p"
49,644, // "v"
50,644, // {"A".."Z" "a" "d" "f".."h" "j".."k" "m".."n" "q".."s" "w" "y".."z"}
51,644, // "b"
52,644, // "e"
53,644, // "t"
54,644, // "c"
55,644, // "i"
56,644, // "l"
57,644, // "o"
58,644, // "u"
59,644, // "x"
62,162, // {193..198 225..230}
64,644, // {"1".."9"}
65,644, // "0"
67,162, // {176..185}
88,333, // $$2
93,472, // hexDigit
94,462, // hexDigit128
  }
,
{ // state 499
0x80000000|621, // match move
0x80000000|209, // no-match move
0x80000000|34, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 500
48,644, // "p"
49,644, // "v"
50,644, // {"A".."Z" "a" "d" "f".."h" "j".."k" "m".."n" "q".."s" "w" "y".."z"}
51,644, // "b"
52,644, // "e"
53,644, // "t"
54,644, // "c"
55,644, // "i"
56,644, // "l"
57,644, // "o"
58,644, // "u"
59,644, // "x"
62,158, // {193..198 225..230}
64,644, // {"1".."9"}
65,644, // "0"
67,158, // {176..185}
88,335, // $$2
93,472, // hexDigit
94,457, // hexDigit128
  }
,
{ // state 501
MIN_REDUCTION+46, // (default reduction)
  }
,
{ // state 502
68,102, // ws
69,602, // " "
70,622, // {10}
MIN_REDUCTION+79, // (default reduction)
  }
,
{ // state 503
2,583, // ws*
23,MIN_REDUCTION+86, // `[
68,686, // ws
69,86, // " "
70,101, // {10}
80,MIN_REDUCTION+86, // "["
MIN_REDUCTION+86, // (default reduction)
  }
,
{ // state 504
2,514, // ws*
68,245, // ws
69,700, // " "
70,291, // {10}
MIN_REDUCTION+118, // (default reduction)
  }
,
{ // state 505
2,582, // ws*
23,MIN_REDUCTION+86, // `[
68,688, // ws
69,88, // " "
70,97, // {10}
80,MIN_REDUCTION+86, // "["
MIN_REDUCTION+86, // (default reduction)
  }
,
{ // state 506
54,272, // "c"
  }
,
{ // state 507
48,644, // "p"
49,644, // "v"
50,644, // {"A".."Z" "a" "d" "f".."h" "j".."k" "m".."n" "q".."s" "w" "y".."z"}
51,644, // "b"
52,644, // "e"
53,644, // "t"
54,644, // "c"
55,644, // "i"
56,644, // "l"
57,644, // "o"
58,644, // "u"
59,644, // "x"
62,168, // {193..198 225..230}
64,644, // {"1".."9"}
65,644, // "0"
67,168, // {176..185}
88,294, // $$2
93,472, // hexDigit
94,447, // hexDigit128
  }
,
{ // state 508
23,MIN_REDUCTION+117, // `[
68,35, // ws
69,100, // " "
70,20, // {10}
80,MIN_REDUCTION+117, // "["
MIN_REDUCTION+117, // (default reduction)
  }
,
{ // state 509
23,MIN_REDUCTION+88, // `[
80,MIN_REDUCTION+88, // "["
MIN_REDUCTION+88, // (default reduction)
  }
,
{ // state 510
23,637, // `[
80,242, // "["
MIN_REDUCTION+37, // (default reduction)
  }
,
{ // state 511
7,136, // ID
16,330, // `(
42,469, // <cast exp>
44,636, // <exp1>
46,296, // INTLIT
47,586, // letter
48,493, // "p"
49,493, // "v"
50,493, // {"A".."Z" "a" "d" "f".."h" "j".."k" "m".."n" "q".."s" "w" "y".."z"}
51,493, // "b"
52,493, // "e"
53,493, // "t"
54,493, // "c"
55,493, // "i"
56,493, // "l"
57,493, // "o"
58,493, // "u"
59,493, // "x"
60,737, // letter128
61,451, // {199..218 231..250}
62,451, // {193..198 225..230}
64,167, // {"1".."9"}
65,655, // "0"
66,365, // digit128
67,765, // {176..185}
74,576, // "("
  }
,
{ // state 512
MIN_REDUCTION+45, // (default reduction)
  }
,
{ // state 513
10,674, // `}
12,235, // <decl in class>
13,131, // <method decl>
14,199, // `public
71,749, // "#"
77,14, // "}"
  }
,
{ // state 514
68,551, // ws
69,700, // " "
70,291, // {10}
MIN_REDUCTION+117, // (default reduction)
  }
,
{ // state 515
MIN_REDUCTION+109, // (default reduction)
  }
,
{ // state 516
MIN_REDUCTION+116, // (default reduction)
  }
,
{ // state 517
-1, // $$start
-1, // <start>
-1, // ws*
-1, // <program>
-1, // <class decl>+
-1, // <class decl>
-1, // `class
164, // ID
437, // `{
-1, // <decl in class>*
401, // `}
-1, // `extends
-1, // <decl in class>
-1, // <method decl>
-1, // `public
-1, // `void
330, // `(
-1, // `)
359, // <stmt>*
129, // <type>
558, // `int
559, // `boolean
-1, // <empty bracket pair>
-1, // `[
-1, // `]
769, // <stmt>
575, // <assign>
-1, // `;
259, // <local var decl>
384, // `if
366, // <exp>
-1, // `else
-1, // `=
693, // <exp8>
210, // <exp7>
13, // <exp6>
18, // <exp5>
61, // <exp4>
-1, // `+
306, // <exp3>
-1, // `*
50, // <exp2>
159, // <cast exp>
311, // <unary exp>
57, // <exp1>
520, // `-
296, // INTLIT
744, // letter
493, // "p"
493, // "v"
493, // {"A".."Z" "a" "d" "f".."h" "j".."k" "m".."n" "q".."s" "w" "y".."z"}
493, // "b"
493, // "e"
493, // "t"
493, // "c"
493, // "i"
493, // "l"
493, // "o"
493, // "u"
493, // "x"
246, // letter128
120, // {199..218 231..250}
120, // {193..198 225..230}
-1, // digit
167, // {"1".."9"}
655, // "0"
365, // digit128
765, // {176..185}
-1, // ws
-1, // " "
-1, // {10}
269, // "#"
-1, // "+"
-1, // "*"
576, // "("
-1, // ")"
538, // "{"
536, // "}"
775, // "-"
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
{ // state 518
7,134, // ID
43,789, // <unary exp>
44,68, // <exp1>
45,518, // `-
46,298, // INTLIT
47,584, // letter
48,493, // "p"
49,493, // "v"
50,493, // {"A".."Z" "a" "d" "f".."h" "j".."k" "m".."n" "q".."s" "w" "y".."z"}
51,493, // "b"
52,493, // "e"
53,493, // "t"
54,493, // "c"
55,493, // "i"
56,493, // "l"
57,493, // "o"
58,493, // "u"
59,493, // "x"
60,738, // letter128
61,450, // {199..218 231..250}
62,450, // {193..198 225..230}
64,169, // {"1".."9"}
65,653, // "0"
66,367, // digit128
67,766, // {176..185}
78,775, // "-"
  }
,
{ // state 519
2,217, // ws*
68,516, // ws
69,454, // " "
70,751, // {10}
MIN_REDUCTION+82, // (default reduction)
  }
,
{ // state 520
7,136, // ID
43,786, // <unary exp>
44,57, // <exp1>
45,520, // `-
46,296, // INTLIT
47,586, // letter
48,493, // "p"
49,493, // "v"
50,493, // {"A".."Z" "a" "d" "f".."h" "j".."k" "m".."n" "q".."s" "w" "y".."z"}
51,493, // "b"
52,493, // "e"
53,493, // "t"
54,493, // "c"
55,493, // "i"
56,493, // "l"
57,493, // "o"
58,493, // "u"
59,493, // "x"
60,737, // letter128
61,451, // {199..218 231..250}
62,451, // {193..198 225..230}
64,167, // {"1".."9"}
65,655, // "0"
66,365, // digit128
67,765, // {176..185}
78,775, // "-"
  }
,
{ // state 521
7,142, // ID
43,642, // <unary exp>
44,140, // <exp1>
45,521, // `-
46,302, // INTLIT
47,623, // letter
48,493, // "p"
49,493, // "v"
50,493, // {"A".."Z" "a" "d" "f".."h" "j".."k" "m".."n" "q".."s" "w" "y".."z"}
51,493, // "b"
52,493, // "e"
53,493, // "t"
54,493, // "c"
55,493, // "i"
56,493, // "l"
57,493, // "o"
58,493, // "u"
59,493, // "x"
60,770, // letter128
61,460, // {199..218 231..250}
62,460, // {193..198 225..230}
64,192, // {"1".."9"}
65,673, // "0"
66,370, // digit128
67,760, // {176..185}
78,775, // "-"
  }
,
{ // state 522
2,292, // ws*
68,434, // ws
69,284, // " "
70,115, // {10}
MIN_REDUCTION+118, // (default reduction)
  }
,
{ // state 523
23,MIN_REDUCTION+116, // `[
80,MIN_REDUCTION+116, // "["
MIN_REDUCTION+116, // (default reduction)
  }
,
{ // state 524
MIN_REDUCTION+20, // (default reduction)
  }
,
{ // state 525
MIN_REDUCTION+102, // (default reduction)
  }
,
{ // state 526
23,MIN_REDUCTION+116, // `[
80,MIN_REDUCTION+116, // "["
MIN_REDUCTION+116, // (default reduction)
  }
,
{ // state 527
7,147, // ID
43,793, // <unary exp>
44,80, // <exp1>
45,527, // `-
46,287, // INTLIT
47,471, // letter
48,493, // "p"
49,493, // "v"
50,493, // {"A".."Z" "a" "d" "f".."h" "j".."k" "m".."n" "q".."s" "w" "y".."z"}
51,493, // "b"
52,493, // "e"
53,493, // "t"
54,493, // "c"
55,493, // "i"
56,493, // "l"
57,493, // "o"
58,493, // "u"
59,493, // "x"
60,718, // letter128
61,438, // {199..218 231..250}
62,438, // {193..198 225..230}
64,138, // {"1".."9"}
65,626, // "0"
66,355, // digit128
67,776, // {176..185}
78,775, // "-"
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
{ // state 528
MIN_REDUCTION+46, // (default reduction)
  }
,
{ // state 529
MIN_REDUCTION+115, // (default reduction)
  }
,
{ // state 530
0x80000000|299, // match move
0x80000000|476, // no-match move
0x80000000|34, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 531
23,MIN_REDUCTION+116, // `[
80,MIN_REDUCTION+116, // "["
MIN_REDUCTION+116, // (default reduction)
  }
,
{ // state 532
MIN_REDUCTION+100, // (default reduction)
  }
,
{ // state 533
23,MIN_REDUCTION+116, // `[
80,MIN_REDUCTION+116, // "["
MIN_REDUCTION+116, // (default reduction)
  }
,
{ // state 534
16,574, // `(
74,381, // "("
  }
,
{ // state 535
7,147, // ID
16,243, // `(
42,424, // <cast exp>
44,662, // <exp1>
46,287, // INTLIT
47,471, // letter
48,493, // "p"
49,493, // "v"
50,493, // {"A".."Z" "a" "d" "f".."h" "j".."k" "m".."n" "q".."s" "w" "y".."z"}
51,493, // "b"
52,493, // "e"
53,493, // "t"
54,493, // "c"
55,493, // "i"
56,493, // "l"
57,493, // "o"
58,493, // "u"
59,493, // "x"
60,718, // letter128
61,438, // {199..218 231..250}
62,438, // {193..198 225..230}
64,138, // {"1".."9"}
65,626, // "0"
66,355, // digit128
67,776, // {176..185}
74,576, // "("
  }
,
{ // state 536
2,496, // ws*
68,94, // ws
69,746, // " "
70,485, // {10}
MIN_REDUCTION+72, // (default reduction)
  }
,
{ // state 537
MIN_REDUCTION+2, // (default reduction)
  }
,
{ // state 538
2,724, // ws*
68,589, // ws
69,444, // " "
70,790, // {10}
MIN_REDUCTION+70, // (default reduction)
  }
,
{ // state 539
23,MIN_REDUCTION+46, // `[
80,MIN_REDUCTION+46, // "["
MIN_REDUCTION+46, // (default reduction)
  }
,
{ // state 540
MIN_REDUCTION+46, // (default reduction)
  }
,
{ // state 541
23,MIN_REDUCTION+117, // `[
68,7, // ws
69,76, // " "
70,74, // {10}
80,MIN_REDUCTION+117, // "["
MIN_REDUCTION+117, // (default reduction)
  }
,
{ // state 542
23,MIN_REDUCTION+46, // `[
80,MIN_REDUCTION+46, // "["
MIN_REDUCTION+46, // (default reduction)
  }
,
{ // state 543
0x80000000|1, // match move
0x80000000|794, // no-match move
0x80000000|34, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 544
MIN_REDUCTION+46, // (default reduction)
  }
,
{ // state 545
2,592, // ws*
68,435, // ws
69,260, // " "
70,152, // {10}
MIN_REDUCTION+80, // (default reduction)
  }
,
{ // state 546
23,MIN_REDUCTION+46, // `[
80,MIN_REDUCTION+46, // "["
MIN_REDUCTION+46, // (default reduction)
  }
,
{ // state 547
0x80000000|1, // match move
0x80000000|795, // no-match move
0x80000000|34, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 548
3,787, // <program>
4,578, // <class decl>+
5,660, // <class decl>
6,386, // `class
68,183, // ws
69,512, // " "
70,540, // {10}
71,506, // "#"
  }
,
{ // state 549
0x80000000|1, // match move
0x80000000|761, // no-match move
0x80000000|34, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 550
MIN_REDUCTION+18, // (default reduction)
  }
,
{ // state 551
MIN_REDUCTION+115, // (default reduction)
  }
,
{ // state 552
68,368, // ws
69,284, // " "
70,115, // {10}
MIN_REDUCTION+67, // (default reduction)
  }
,
{ // state 553
MIN_REDUCTION+88, // (default reduction)
  }
,
{ // state 554
2,42, // ws*
68,664, // ws
69,616, // " "
70,601, // {10}
MIN_REDUCTION+84, // (default reduction)
  }
,
{ // state 555
23,MIN_REDUCTION+85, // `[
68,530, // ws
69,11, // " "
70,62, // {10}
80,MIN_REDUCTION+85, // "["
MIN_REDUCTION+85, // (default reduction)
  }
,
{ // state 556
23,MIN_REDUCTION+117, // `[
68,530, // ws
69,11, // " "
70,62, // {10}
80,MIN_REDUCTION+117, // "["
MIN_REDUCTION+117, // (default reduction)
  }
,
{ // state 557
68,219, // ws
69,694, // " "
70,528, // {10}
MIN_REDUCTION+65, // (default reduction)
  }
,
{ // state 558
MIN_REDUCTION+11, // (default reduction)
  }
,
{ // state 559
MIN_REDUCTION+12, // (default reduction)
  }
,
{ // state 560
MIN_REDUCTION+116, // (default reduction)
  }
,
{ // state 561
2,611, // ws*
23,MIN_REDUCTION+86, // `[
68,678, // ws
69,100, // " "
70,20, // {10}
80,MIN_REDUCTION+86, // "["
MIN_REDUCTION+86, // (default reduction)
  }
,
{ // state 562
MIN_REDUCTION+46, // (default reduction)
  }
,
{ // state 563
23,MIN_REDUCTION+88, // `[
80,MIN_REDUCTION+88, // "["
MIN_REDUCTION+88, // (default reduction)
  }
,
{ // state 564
68,628, // ws
69,709, // " "
70,501, // {10}
MIN_REDUCTION+117, // (default reduction)
  }
,
{ // state 565
23,MIN_REDUCTION+117, // `[
68,28, // ws
69,88, // " "
70,97, // {10}
80,MIN_REDUCTION+117, // "["
MIN_REDUCTION+117, // (default reduction)
  }
,
{ // state 566
23,MIN_REDUCTION+46, // `[
80,MIN_REDUCTION+46, // "["
MIN_REDUCTION+46, // (default reduction)
  }
,
{ // state 567
MIN_REDUCTION+98, // (default reduction)
  }
,
{ // state 568
23,MIN_REDUCTION+117, // `[
68,27, // ws
69,86, // " "
70,101, // {10}
80,MIN_REDUCTION+117, // "["
MIN_REDUCTION+117, // (default reduction)
  }
,
{ // state 569
0x80000000|621, // match move
0x80000000|191, // no-match move
0x80000000|34, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 570
68,371, // ws
69,248, // " "
70,139, // {10}
MIN_REDUCTION+85, // (default reduction)
  }
,
{ // state 571
MIN_REDUCTION+22, // (default reduction)
  }
,
{ // state 572
68,351, // ws
69,229, // " "
70,178, // {10}
MIN_REDUCTION+85, // (default reduction)
  }
,
{ // state 573
MIN_REDUCTION+44, // (default reduction)
  }
,
{ // state 574
7,142, // ID
16,305, // `(
30,270, // <exp>
33,633, // <exp8>
34,202, // <exp7>
35,26, // <exp6>
36,24, // <exp5>
37,103, // <exp4>
39,267, // <exp3>
41,9, // <exp2>
42,218, // <cast exp>
43,324, // <unary exp>
44,140, // <exp1>
45,521, // `-
46,302, // INTLIT
47,623, // letter
48,493, // "p"
49,493, // "v"
50,493, // {"A".."Z" "a" "d" "f".."h" "j".."k" "m".."n" "q".."s" "w" "y".."z"}
51,493, // "b"
52,493, // "e"
53,493, // "t"
54,493, // "c"
55,493, // "i"
56,493, // "l"
57,493, // "o"
58,493, // "u"
59,493, // "x"
60,770, // letter128
61,460, // {199..218 231..250}
62,460, // {193..198 225..230}
64,192, // {"1".."9"}
65,673, // "0"
66,370, // digit128
67,760, // {176..185}
74,576, // "("
78,775, // "-"
  }
,
{ // state 575
27,146, // `;
82,554, // ";"
  }
,
{ // state 576
2,557, // ws*
68,67, // ws
69,694, // " "
70,528, // {10}
MIN_REDUCTION+66, // (default reduction)
  }
,
{ // state 577
MIN_REDUCTION+45, // (default reduction)
  }
,
{ // state 578
5,137, // <class decl>
6,386, // `class
71,506, // "#"
MIN_REDUCTION+3, // (default reduction)
  }
,
{ // state 579
53,697, // "t"
  }
,
{ // state 580
23,MIN_REDUCTION+87, // `[
80,MIN_REDUCTION+87, // "["
MIN_REDUCTION+87, // (default reduction)
  }
,
{ // state 581
MIN_REDUCTION+115, // (default reduction)
  }
,
{ // state 582
0x80000000|1, // match move
0x80000000|195, // no-match move
0x80000000|34, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 583
0x80000000|1, // match move
0x80000000|179, // no-match move
0x80000000|34, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 584
47,420, // letter
48,46, // "p"
49,46, // "v"
50,46, // {"A".."Z" "a" "d" "f".."h" "j".."k" "m".."n" "q".."s" "w" "y".."z"}
51,46, // "b"
52,46, // "e"
53,46, // "t"
54,46, // "c"
55,46, // "i"
56,46, // "l"
57,46, // "o"
58,46, // "u"
59,46, // "x"
60,631, // letter128
61,450, // {199..218 231..250}
62,450, // {193..198 225..230}
63,184, // digit
64,155, // {"1".."9"}
65,155, // "0"
66,489, // digit128
67,766, // {176..185}
83,89, // idChar*
84,197, // $$0
89,339, // idChar
90,736, // "_"
91,12, // idChar128
92,488, // {223}
  }
,
{ // state 585
96,MIN_REDUCTION+116, // $NT
MIN_REDUCTION+116, // (default reduction)
  }
,
{ // state 586
47,420, // letter
48,46, // "p"
49,46, // "v"
50,46, // {"A".."Z" "a" "d" "f".."h" "j".."k" "m".."n" "q".."s" "w" "y".."z"}
51,46, // "b"
52,46, // "e"
53,46, // "t"
54,46, // "c"
55,46, // "i"
56,46, // "l"
57,46, // "o"
58,46, // "u"
59,46, // "x"
60,630, // letter128
61,451, // {199..218 231..250}
62,451, // {193..198 225..230}
63,184, // digit
64,155, // {"1".."9"}
65,155, // "0"
66,492, // digit128
67,765, // {176..185}
83,87, // idChar*
84,196, // $$0
89,339, // idChar
90,736, // "_"
91,16, // idChar128
92,491, // {223}
  }
,
{ // state 587
MIN_REDUCTION+46, // (default reduction)
  }
,
{ // state 588
23,MIN_REDUCTION+119, // `[
68,7, // ws
69,76, // " "
70,74, // {10}
80,MIN_REDUCTION+119, // "["
MIN_REDUCTION+119, // (default reduction)
  }
,
{ // state 589
MIN_REDUCTION+116, // (default reduction)
  }
,
{ // state 590
23,MIN_REDUCTION+115, // `[
80,MIN_REDUCTION+115, // "["
MIN_REDUCTION+115, // (default reduction)
  }
,
{ // state 591
2,96, // ws*
68,356, // ws
69,753, // " "
70,432, // {10}
MIN_REDUCTION+52, // (default reduction)
  }
,
{ // state 592
68,362, // ws
69,260, // " "
70,152, // {10}
MIN_REDUCTION+79, // (default reduction)
  }
,
{ // state 593
MIN_REDUCTION+46, // (default reduction)
  }
,
{ // state 594
68,145, // ws
69,659, // " "
70,544, // {10}
MIN_REDUCTION+71, // (default reduction)
  }
,
{ // state 595
MIN_REDUCTION+46, // (default reduction)
  }
,
{ // state 596
MIN_REDUCTION+116, // (default reduction)
  }
,
{ // state 597
23,MIN_REDUCTION+42, // `[
80,MIN_REDUCTION+42, // "["
MIN_REDUCTION+42, // (default reduction)
  }
,
{ // state 598
MIN_REDUCTION+115, // (default reduction)
  }
,
{ // state 599
8,517, // `{
76,538, // "{"
  }
,
{ // state 600
96,MIN_REDUCTION+45, // $NT
MIN_REDUCTION+45, // (default reduction)
  }
,
{ // state 601
MIN_REDUCTION+46, // (default reduction)
  }
,
{ // state 602
MIN_REDUCTION+45, // (default reduction)
  }
,
{ // state 603
23,MIN_REDUCTION+119, // `[
68,27, // ws
69,86, // " "
70,101, // {10}
80,MIN_REDUCTION+119, // "["
MIN_REDUCTION+119, // (default reduction)
  }
,
{ // state 604
MIN_REDUCTION+18, // (default reduction)
  }
,
{ // state 605
8,295, // `{
11,728, // `extends
71,669, // "#"
76,640, // "{"
  }
,
{ // state 606
23,MIN_REDUCTION+119, // `[
68,28, // ws
69,88, // " "
70,97, // {10}
80,MIN_REDUCTION+119, // "["
MIN_REDUCTION+119, // (default reduction)
  }
,
{ // state 607
23,MIN_REDUCTION+115, // `[
80,MIN_REDUCTION+115, // "["
MIN_REDUCTION+115, // (default reduction)
  }
,
{ // state 608
68,135, // ws
69,266, // " "
70,263, // {10}
MIN_REDUCTION+73, // (default reduction)
  }
,
{ // state 609
31,4, // `else
71,300, // "#"
  }
,
{ // state 610
23,MIN_REDUCTION+115, // `[
80,MIN_REDUCTION+115, // "["
MIN_REDUCTION+115, // (default reduction)
  }
,
{ // state 611
0x80000000|1, // match move
0x80000000|208, // no-match move
0x80000000|34, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 612
0x80000000|348, // match move
0x80000000|648, // no-match move
0x80000000|34, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 613
2,282, // ws*
23,MIN_REDUCTION+118, // `[
68,66, // ws
69,11, // " "
70,62, // {10}
80,MIN_REDUCTION+118, // "["
MIN_REDUCTION+118, // (default reduction)
  }
,
{ // state 614
MIN_REDUCTION+19, // (default reduction)
  }
,
{ // state 615
23,MIN_REDUCTION+115, // `[
80,MIN_REDUCTION+115, // "["
MIN_REDUCTION+115, // (default reduction)
  }
,
{ // state 616
MIN_REDUCTION+45, // (default reduction)
  }
,
{ // state 617
MIN_REDUCTION+98, // (default reduction)
  }
,
{ // state 618
23,MIN_REDUCTION+98, // `[
80,MIN_REDUCTION+98, // "["
MIN_REDUCTION+98, // (default reduction)
  }
,
{ // state 619
MIN_REDUCTION+115, // (default reduction)
  }
,
{ // state 620
MIN_REDUCTION+42, // (default reduction)
  }
,
{ // state 621
MIN_REDUCTION+100, // (default reduction)
  }
,
{ // state 622
MIN_REDUCTION+46, // (default reduction)
  }
,
{ // state 623
47,420, // letter
48,46, // "p"
49,46, // "v"
50,46, // {"A".."Z" "a" "d" "f".."h" "j".."k" "m".."n" "q".."s" "w" "y".."z"}
51,46, // "b"
52,46, // "e"
53,46, // "t"
54,46, // "c"
55,46, // "i"
56,46, // "l"
57,46, // "o"
58,46, // "u"
59,46, // "x"
60,638, // letter128
61,460, // {199..218 231..250}
62,460, // {193..198 225..230}
63,184, // digit
64,155, // {"1".."9"}
65,155, // "0"
66,483, // digit128
67,760, // {176..185}
83,77, // idChar*
84,190, // $$0
89,339, // idChar
90,736, // "_"
91,53, // idChar128
92,499, // {223}
  }
,
{ // state 624
MIN_REDUCTION+42, // (default reduction)
  }
,
{ // state 625
23,MIN_REDUCTION+44, // `[
80,MIN_REDUCTION+44, // "["
MIN_REDUCTION+44, // (default reduction)
  }
,
{ // state 626
48,644, // "p"
49,644, // "v"
50,644, // {"A".."Z" "a" "d" "f".."h" "j".."k" "m".."n" "q".."s" "w" "y".."z"}
51,644, // "b"
52,644, // "e"
53,644, // "t"
54,644, // "c"
55,644, // "i"
56,644, // "l"
57,644, // "o"
58,644, // "u"
59,644, // "x"
62,45, // {193..198 225..230}
64,644, // {"1".."9"}
65,644, // "0"
67,45, // {176..185}
87,452, // hexDigit*
88,236, // $$2
93,733, // hexDigit
94,382, // hexDigit128
  }
,
{ // state 627
MIN_REDUCTION+42, // (default reduction)
  }
,
{ // state 628
MIN_REDUCTION+115, // (default reduction)
  }
,
{ // state 629
0x80000000|1, // match move
0x80000000|427, // no-match move
0x80000000|34, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 630
0x80000000|617, // match move
0x80000000|441, // no-match move
0x80000000|34, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 631
0x80000000|617, // match move
0x80000000|443, // no-match move
0x80000000|34, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 632
MIN_REDUCTION+42, // (default reduction)
  }
,
{ // state 633
MIN_REDUCTION+23, // (default reduction)
  }
,
{ // state 634
MIN_REDUCTION+103, // (default reduction)
  }
,
{ // state 635
0x80000000|1, // match move
0x80000000|288, // no-match move
0x80000000|34, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 636
0x80000000|1, // match move
0x80000000|285, // no-match move
0x80000000|34, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 637
7,147, // ID
16,243, // `(
30,419, // <exp>
33,707, // <exp8>
34,2, // <exp7>
35,220, // <exp6>
36,221, // <exp5>
37,44, // <exp4>
39,340, // <exp3>
41,37, // <exp2>
42,182, // <cast exp>
43,331, // <unary exp>
44,80, // <exp1>
45,527, // `-
46,287, // INTLIT
47,471, // letter
48,493, // "p"
49,493, // "v"
50,493, // {"A".."Z" "a" "d" "f".."h" "j".."k" "m".."n" "q".."s" "w" "y".."z"}
51,493, // "b"
52,493, // "e"
53,493, // "t"
54,493, // "c"
55,493, // "i"
56,493, // "l"
57,493, // "o"
58,493, // "u"
59,493, // "x"
60,718, // letter128
61,438, // {199..218 231..250}
62,438, // {193..198 225..230}
64,138, // {"1".."9"}
65,626, // "0"
66,355, // digit128
67,776, // {176..185}
74,576, // "("
78,775, // "-"
  }
,
{ // state 638
0x80000000|617, // match move
0x80000000|430, // no-match move
0x80000000|34, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 639
MIN_REDUCTION+14, // (default reduction)
  }
,
{ // state 640
2,30, // ws*
68,223, // ws
69,577, // " "
70,595, // {10}
MIN_REDUCTION+70, // (default reduction)
  }
,
{ // state 641
MIN_REDUCTION+11, // (default reduction)
  }
,
{ // state 642
MIN_REDUCTION+36, // (default reduction)
  }
,
{ // state 643
2,409, // ws*
68,356, // ws
69,753, // " "
70,432, // {10}
MIN_REDUCTION+50, // (default reduction)
  }
,
{ // state 644
MIN_REDUCTION+101, // (default reduction)
  }
,
{ // state 645
7,147, // ID
16,243, // `(
30,392, // <exp>
33,707, // <exp8>
34,2, // <exp7>
35,220, // <exp6>
36,221, // <exp5>
37,44, // <exp4>
39,340, // <exp3>
41,37, // <exp2>
42,182, // <cast exp>
43,331, // <unary exp>
44,80, // <exp1>
45,527, // `-
46,287, // INTLIT
47,471, // letter
48,493, // "p"
49,493, // "v"
50,493, // {"A".."Z" "a" "d" "f".."h" "j".."k" "m".."n" "q".."s" "w" "y".."z"}
51,493, // "b"
52,493, // "e"
53,493, // "t"
54,493, // "c"
55,493, // "i"
56,493, // "l"
57,493, // "o"
58,493, // "u"
59,493, // "x"
60,718, // letter128
61,438, // {199..218 231..250}
62,438, // {193..198 225..230}
64,138, // {"1".."9"}
65,626, // "0"
66,355, // digit128
67,776, // {176..185}
74,576, // "("
78,775, // "-"
  }
,
{ // state 646
MIN_REDUCTION+98, // (default reduction)
  }
,
{ // state 647
68,628, // ws
69,709, // " "
70,501, // {10}
MIN_REDUCTION+85, // (default reduction)
  }
,
{ // state 648
23,MIN_REDUCTION+88, // `[
80,MIN_REDUCTION+88, // "["
MIN_REDUCTION+88, // (default reduction)
  }
,
{ // state 649
23,MIN_REDUCTION+38, // `[
32,MIN_REDUCTION+38, // `=
38,MIN_REDUCTION+38, // `+
40,MIN_REDUCTION+38, // `*
72,MIN_REDUCTION+38, // "+"
73,MIN_REDUCTION+38, // "*"
79,MIN_REDUCTION+38, // "="
80,MIN_REDUCTION+38, // "["
MIN_REDUCTION+13, // (default reduction)
  }
,
{ // state 650
MIN_REDUCTION+116, // (default reduction)
  }
,
{ // state 651
7,147, // ID
16,243, // `(
30,383, // <exp>
33,707, // <exp8>
34,2, // <exp7>
35,220, // <exp6>
36,221, // <exp5>
37,44, // <exp4>
39,340, // <exp3>
41,37, // <exp2>
42,182, // <cast exp>
43,331, // <unary exp>
44,80, // <exp1>
45,527, // `-
46,287, // INTLIT
47,471, // letter
48,493, // "p"
49,493, // "v"
50,493, // {"A".."Z" "a" "d" "f".."h" "j".."k" "m".."n" "q".."s" "w" "y".."z"}
51,493, // "b"
52,493, // "e"
53,493, // "t"
54,493, // "c"
55,493, // "i"
56,493, // "l"
57,493, // "o"
58,493, // "u"
59,493, // "x"
60,718, // letter128
61,438, // {199..218 231..250}
62,438, // {193..198 225..230}
64,138, // {"1".."9"}
65,626, // "0"
66,355, // digit128
67,776, // {176..185}
74,576, // "("
78,775, // "-"
  }
,
{ // state 652
0x80000000|1, // match move
0x80000000|63, // no-match move
0x80000000|34, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 653
48,644, // "p"
49,644, // "v"
50,644, // {"A".."Z" "a" "d" "f".."h" "j".."k" "m".."n" "q".."s" "w" "y".."z"}
51,644, // "b"
52,644, // "e"
53,644, // "t"
54,644, // "c"
55,644, // "i"
56,644, // "l"
57,644, // "o"
58,644, // "u"
59,644, // "x"
62,162, // {193..198 225..230}
64,644, // {"1".."9"}
65,644, // "0"
67,162, // {176..185}
87,498, // hexDigit*
88,250, // $$2
93,733, // hexDigit
94,462, // hexDigit128
  }
,
{ // state 654
68,354, // ws
69,431, // " "
70,587, // {10}
MIN_REDUCTION+67, // (default reduction)
  }
,
{ // state 655
48,644, // "p"
49,644, // "v"
50,644, // {"A".."Z" "a" "d" "f".."h" "j".."k" "m".."n" "q".."s" "w" "y".."z"}
51,644, // "b"
52,644, // "e"
53,644, // "t"
54,644, // "c"
55,644, // "i"
56,644, // "l"
57,644, // "o"
58,644, // "u"
59,644, // "x"
62,158, // {193..198 225..230}
64,644, // {"1".."9"}
65,644, // "0"
67,158, // {176..185}
87,500, // hexDigit*
88,252, // $$2
93,733, // hexDigit
94,457, // hexDigit128
  }
,
{ // state 656
7,147, // ID
16,243, // `(
30,388, // <exp>
33,707, // <exp8>
34,2, // <exp7>
35,220, // <exp6>
36,221, // <exp5>
37,44, // <exp4>
39,340, // <exp3>
41,37, // <exp2>
42,182, // <cast exp>
43,331, // <unary exp>
44,80, // <exp1>
45,527, // `-
46,287, // INTLIT
47,471, // letter
48,493, // "p"
49,493, // "v"
50,493, // {"A".."Z" "a" "d" "f".."h" "j".."k" "m".."n" "q".."s" "w" "y".."z"}
51,493, // "b"
52,493, // "e"
53,493, // "t"
54,493, // "c"
55,493, // "i"
56,493, // "l"
57,493, // "o"
58,493, // "u"
59,493, // "x"
60,718, // letter128
61,438, // {199..218 231..250}
62,438, // {193..198 225..230}
64,138, // {"1".."9"}
65,626, // "0"
66,355, // digit128
67,776, // {176..185}
74,576, // "("
78,775, // "-"
  }
,
{ // state 657
68,313, // ws
69,600, // " "
70,212, // {10}
96,MIN_REDUCTION+81, // $NT
  }
,
{ // state 658
MIN_REDUCTION+116, // (default reduction)
  }
,
{ // state 659
MIN_REDUCTION+45, // (default reduction)
  }
,
{ // state 660
MIN_REDUCTION+113, // (default reduction)
  }
,
{ // state 661
0x80000000|1, // match move
0x80000000|174, // no-match move
0x80000000|34, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 662
0x80000000|1, // match move
0x80000000|307, // no-match move
0x80000000|34, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 663
MIN_REDUCTION+43, // (default reduction)
  }
,
{ // state 664
MIN_REDUCTION+116, // (default reduction)
  }
,
{ // state 665
2,570, // ws*
68,449, // ws
69,248, // " "
70,139, // {10}
MIN_REDUCTION+86, // (default reduction)
  }
,
{ // state 666
MIN_REDUCTION+116, // (default reduction)
  }
,
{ // state 667
MIN_REDUCTION+42, // (default reduction)
  }
,
{ // state 668
9,513, // <decl in class>*
10,467, // `}
12,399, // <decl in class>
13,131, // <method decl>
14,199, // `public
71,749, // "#"
77,14, // "}"
  }
,
{ // state 669
52,81, // "e"
  }
,
{ // state 670
0x80000000|1, // match move
0x80000000|754, // no-match move
0x80000000|34, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 671
2,661, // ws*
  }
,
{ // state 672
0x80000000|1, // match move
0x80000000|752, // no-match move
0x80000000|34, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 673
48,644, // "p"
49,644, // "v"
50,644, // {"A".."Z" "a" "d" "f".."h" "j".."k" "m".."n" "q".."s" "w" "y".."z"}
51,644, // "b"
52,644, // "e"
53,644, // "t"
54,644, // "c"
55,644, // "i"
56,644, // "l"
57,644, // "o"
58,644, // "u"
59,644, // "x"
62,168, // {193..198 225..230}
64,644, // {"1".."9"}
65,644, // "0"
67,168, // {176..185}
87,507, // hexDigit*
88,244, // $$2
93,733, // hexDigit
94,447, // hexDigit128
  }
,
{ // state 674
MIN_REDUCTION+6, // (default reduction)
  }
,
{ // state 675
24,448, // `]
81,377, // "]"
  }
,
{ // state 676
2,141, // ws*
68,756, // ws
69,31, // " "
70,562, // {10}
MIN_REDUCTION+68, // (default reduction)
  }
,
{ // state 677
2,583, // ws*
  }
,
{ // state 678
0x80000000|1, // match move
0x80000000|523, // no-match move
0x80000000|34, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 679
2,582, // ws*
  }
,
{ // state 680
MIN_REDUCTION+44, // (default reduction)
  }
,
{ // state 681
2,55, // ws*
68,154, // ws
69,709, // " "
70,501, // {10}
MIN_REDUCTION+48, // (default reduction)
  }
,
{ // state 682
MIN_REDUCTION+13, // (default reduction)
  }
,
{ // state 683
2,572, // ws*
68,473, // ws
69,229, // " "
70,178, // {10}
MIN_REDUCTION+86, // (default reduction)
  }
,
{ // state 684
0x80000000|1, // match move
0x80000000|526, // no-match move
0x80000000|34, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 685
68,628, // ws
69,709, // " "
70,501, // {10}
MIN_REDUCTION+81, // (default reduction)
  }
,
{ // state 686
0x80000000|1, // match move
0x80000000|533, // no-match move
0x80000000|34, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 687
2,768, // ws*
68,356, // ws
69,753, // " "
70,432, // {10}
MIN_REDUCTION+54, // (default reduction)
  }
,
{ // state 688
0x80000000|1, // match move
0x80000000|531, // no-match move
0x80000000|34, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 689
2,629, // ws*
  }
,
{ // state 690
58,387, // "u"
  }
,
{ // state 691
2,171, // ws*
68,658, // ws
69,105, // " "
70,121, // {10}
MIN_REDUCTION+64, // (default reduction)
  }
,
{ // state 692
0x80000000|1, // match move
0x80000000|731, // no-match move
0x80000000|34, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 693
MIN_REDUCTION+23, // (default reduction)
  }
,
{ // state 694
MIN_REDUCTION+45, // (default reduction)
  }
,
{ // state 695
MIN_REDUCTION+23, // (default reduction)
  }
,
{ // state 696
0x80000000|1, // match move
0x80000000|268, // no-match move
0x80000000|34, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 697
2,151, // ws*
68,154, // ws
69,709, // " "
70,501, // {10}
MIN_REDUCTION+56, // (default reduction)
  }
,
{ // state 698
23,MIN_REDUCTION+90, // `[
80,MIN_REDUCTION+90, // "["
MIN_REDUCTION+90, // (default reduction)
  }
,
{ // state 699
0x80000000|1, // match move
0x80000000|606, // no-match move
0x80000000|34, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 700
MIN_REDUCTION+45, // (default reduction)
  }
,
{ // state 701
68,352, // ws
69,227, // " "
70,177, // {10}
MIN_REDUCTION+65, // (default reduction)
  }
,
{ // state 702
MIN_REDUCTION+45, // (default reduction)
  }
,
{ // state 703
0x80000000|1, // match move
0x80000000|603, // no-match move
0x80000000|34, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 704
2,703, // ws*
  }
,
{ // state 705
0x80000000|1, // match move
0x80000000|588, // no-match move
0x80000000|34, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 706
2,699, // ws*
  }
,
{ // state 707
MIN_REDUCTION+23, // (default reduction)
  }
,
{ // state 708
68,368, // ws
69,284, // " "
70,115, // {10}
MIN_REDUCTION+85, // (default reduction)
  }
,
{ // state 709
MIN_REDUCTION+45, // (default reduction)
  }
,
{ // state 710
2,705, // ws*
  }
,
{ // state 711
0x80000000|1, // match move
0x80000000|788, // no-match move
0x80000000|34, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 712
2,611, // ws*
  }
,
{ // state 713
MIN_REDUCTION+4, // (default reduction)
  }
,
{ // state 714
0x80000000|617, // match move
0x80000000|456, // no-match move
0x80000000|34, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 715
23,MIN_REDUCTION+42, // `[
80,MIN_REDUCTION+42, // "["
MIN_REDUCTION+42, // (default reduction)
  }
,
{ // state 716
2,594, // ws*
68,5, // ws
69,659, // " "
70,544, // {10}
MIN_REDUCTION+72, // (default reduction)
  }
,
{ // state 717
32,41, // `=
79,725, // "="
  }
,
{ // state 718
0x80000000|712, // match move
0x80000000|561, // no-match move
0x80000000|34, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 719
0x80000000|1, // match move
0x80000000|565, // no-match move
0x80000000|34, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 720
23,MIN_REDUCTION+42, // `[
80,MIN_REDUCTION+42, // "["
MIN_REDUCTION+42, // (default reduction)
  }
,
{ // state 721
0x80000000|1, // match move
0x80000000|568, // no-match move
0x80000000|34, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 722
MIN_REDUCTION+30, // (default reduction)
  }
,
{ // state 723
MIN_REDUCTION+30, // (default reduction)
  }
,
{ // state 724
68,484, // ws
69,444, // " "
70,790, // {10}
MIN_REDUCTION+69, // (default reduction)
  }
,
{ // state 725
2,233, // ws*
68,194, // ws
69,602, // " "
70,622, // {10}
MIN_REDUCTION+78, // (default reduction)
  }
,
{ // state 726
MIN_REDUCTION+87, // (default reduction)
  }
,
{ // state 727
MIN_REDUCTION+30, // (default reduction)
  }
,
{ // state 728
7,48, // ID
47,255, // letter
48,493, // "p"
49,493, // "v"
50,493, // {"A".."Z" "a" "d" "f".."h" "j".."k" "m".."n" "q".."s" "w" "y".."z"}
51,493, // "b"
52,493, // "e"
53,493, // "t"
54,493, // "c"
55,493, // "i"
56,493, // "l"
57,493, // "o"
58,493, // "u"
59,493, // "x"
60,792, // letter128
61,667, // {199..218 231..250}
62,667, // {193..198 225..230}
  }
,
{ // state 729
2,180, // ws*
68,5, // ws
69,659, // " "
70,544, // {10}
MIN_REDUCTION+84, // (default reduction)
  }
,
{ // state 730
0x80000000|1, // match move
0x80000000|541, // no-match move
0x80000000|34, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 731
23,MIN_REDUCTION+121, // `[
68,35, // ws
69,100, // " "
70,20, // {10}
80,MIN_REDUCTION+121, // "["
MIN_REDUCTION+121, // (default reduction)
  }
,
{ // state 732
MIN_REDUCTION+99, // (default reduction)
  }
,
{ // state 733
MIN_REDUCTION+108, // (default reduction)
  }
,
{ // state 734
23,MIN_REDUCTION+99, // `[
80,MIN_REDUCTION+99, // "["
MIN_REDUCTION+99, // (default reduction)
  }
,
{ // state 735
23,MIN_REDUCTION+99, // `[
80,MIN_REDUCTION+99, // "["
MIN_REDUCTION+99, // (default reduction)
  }
,
{ // state 736
MIN_REDUCTION+97, // (default reduction)
  }
,
{ // state 737
0x80000000|677, // match move
0x80000000|503, // no-match move
0x80000000|34, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 738
0x80000000|679, // match move
0x80000000|505, // no-match move
0x80000000|34, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 739
0x80000000|163, // match move
0x80000000|455, // no-match move
0x80000000|34, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 740
23,MIN_REDUCTION+87, // `[
80,MIN_REDUCTION+87, // "["
MIN_REDUCTION+87, // (default reduction)
  }
,
{ // state 741
7,164, // ID
8,783, // `{
16,330, // `(
19,129, // <type>
20,558, // `int
21,559, // `boolean
25,609, // <stmt>
26,173, // <assign>
28,265, // <local var decl>
29,534, // `if
30,366, // <exp>
33,693, // <exp8>
34,210, // <exp7>
35,13, // <exp6>
36,18, // <exp5>
37,61, // <exp4>
39,306, // <exp3>
41,50, // <exp2>
42,159, // <cast exp>
43,311, // <unary exp>
44,57, // <exp1>
45,520, // `-
46,296, // INTLIT
47,744, // letter
48,493, // "p"
49,493, // "v"
50,493, // {"A".."Z" "a" "d" "f".."h" "j".."k" "m".."n" "q".."s" "w" "y".."z"}
51,493, // "b"
52,493, // "e"
53,493, // "t"
54,493, // "c"
55,493, // "i"
56,493, // "l"
57,493, // "o"
58,493, // "u"
59,493, // "x"
60,246, // letter128
61,120, // {199..218 231..250}
62,120, // {193..198 225..230}
64,167, // {"1".."9"}
65,655, // "0"
66,365, // digit128
67,765, // {176..185}
71,269, // "#"
74,576, // "("
76,538, // "{"
78,775, // "-"
  }
,
{ // state 742
MIN_REDUCTION+115, // (default reduction)
  }
,
{ // state 743
23,MIN_REDUCTION+87, // `[
80,MIN_REDUCTION+87, // "["
MIN_REDUCTION+87, // (default reduction)
  }
,
{ // state 744
47,420, // letter
48,46, // "p"
49,46, // "v"
50,46, // {"A".."Z" "a" "d" "f".."h" "j".."k" "m".."n" "q".."s" "w" "y".."z"}
51,46, // "b"
52,46, // "e"
53,46, // "t"
54,46, // "c"
55,46, // "i"
56,46, // "l"
57,46, // "o"
58,46, // "u"
59,46, // "x"
60,349, // letter128
61,120, // {199..218 231..250}
62,120, // {193..198 225..230}
63,184, // digit
64,155, // {"1".."9"}
65,155, // "0"
66,739, // digit128
67,98, // {176..185}
83,33, // idChar*
84,612, // $$0
89,339, // idChar
90,736, // "_"
91,393, // idChar128
92,364, // {223}
  }
,
{ // state 745
23,MIN_REDUCTION+99, // `[
80,MIN_REDUCTION+99, // "["
MIN_REDUCTION+99, // (default reduction)
  }
,
{ // state 746
MIN_REDUCTION+45, // (default reduction)
  }
,
{ // state 747
23,MIN_REDUCTION+87, // `[
80,MIN_REDUCTION+87, // "["
MIN_REDUCTION+87, // (default reduction)
  }
,
{ // state 748
23,MIN_REDUCTION+87, // `[
80,MIN_REDUCTION+87, // "["
MIN_REDUCTION+87, // (default reduction)
  }
,
{ // state 749
48,690, // "p"
  }
,
{ // state 750
MIN_REDUCTION+30, // (default reduction)
  }
,
{ // state 751
MIN_REDUCTION+46, // (default reduction)
  }
,
{ // state 752
23,MIN_REDUCTION+121, // `[
68,28, // ws
69,88, // " "
70,97, // {10}
80,MIN_REDUCTION+121, // "["
MIN_REDUCTION+121, // (default reduction)
  }
,
{ // state 753
MIN_REDUCTION+45, // (default reduction)
  }
,
{ // state 754
23,MIN_REDUCTION+121, // `[
68,27, // ws
69,86, // " "
70,101, // {10}
80,MIN_REDUCTION+121, // "["
MIN_REDUCTION+121, // (default reduction)
  }
,
{ // state 755
2,3, // ws*
68,666, // ws
69,91, // " "
70,128, // {10}
MIN_REDUCTION+76, // (default reduction)
  }
,
{ // state 756
MIN_REDUCTION+116, // (default reduction)
  }
,
{ // state 757
23,MIN_REDUCTION+93, // `[
80,MIN_REDUCTION+93, // "["
MIN_REDUCTION+93, // (default reduction)
  }
,
{ // state 758
2,274, // ws*
68,650, // ws
69,431, // " "
70,587, // {10}
MIN_REDUCTION+60, // (default reduction)
  }
,
{ // state 759
MIN_REDUCTION+111, // (default reduction)
  }
,
{ // state 760
0x80000000|461, // match move
0x80000000|205, // no-match move
0x80000000|34, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 761
23,MIN_REDUCTION+39, // `[
80,MIN_REDUCTION+39, // "["
MIN_REDUCTION+39, // (default reduction)
  }
,
{ // state 762
MIN_REDUCTION+104, // (default reduction)
  }
,
{ // state 763
7,440, // ID
47,379, // letter
48,493, // "p"
49,493, // "v"
50,493, // {"A".."Z" "a" "d" "f".."h" "j".."k" "m".."n" "q".."s" "w" "y".."z"}
51,493, // "b"
52,493, // "e"
53,493, // "t"
54,493, // "c"
55,493, // "i"
56,493, // "l"
57,493, // "o"
58,493, // "u"
59,493, // "x"
60,683, // letter128
61,624, // {199..218 231..250}
62,624, // {193..198 225..230}
  }
,
{ // state 764
0x80000000|704, // match move
0x80000000|133, // no-match move
0x80000000|34, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 765
0x80000000|461, // match move
0x80000000|215, // no-match move
0x80000000|34, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 766
0x80000000|461, // match move
0x80000000|213, // no-match move
0x80000000|34, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 767
0x80000000|706, // match move
0x80000000|130, // no-match move
0x80000000|34, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 768
68,43, // ws
69,753, // " "
70,432, // {10}
MIN_REDUCTION+53, // (default reduction)
  }
,
{ // state 769
MIN_REDUCTION+110, // (default reduction)
  }
,
{ // state 770
0x80000000|671, // match move
0x80000000|486, // no-match move
0x80000000|34, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 771
23,MIN_REDUCTION+99, // `[
80,MIN_REDUCTION+99, // "["
MIN_REDUCTION+99, // (default reduction)
  }
,
{ // state 772
0x80000000|710, // match move
0x80000000|148, // no-match move
0x80000000|34, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 773
23,MIN_REDUCTION+44, // `[
80,MIN_REDUCTION+44, // "["
MIN_REDUCTION+44, // (default reduction)
  }
,
{ // state 774
MIN_REDUCTION+99, // (default reduction)
  }
,
{ // state 775
2,608, // ws*
68,214, // ws
69,266, // " "
70,263, // {10}
MIN_REDUCTION+74, // (default reduction)
  }
,
{ // state 776
0x80000000|461, // match move
0x80000000|625, // no-match move
0x80000000|34, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 777
23,MIN_REDUCTION+93, // `[
80,MIN_REDUCTION+93, // "["
MIN_REDUCTION+93, // (default reduction)
  }
,
{ // state 778
23,MIN_REDUCTION+93, // `[
80,MIN_REDUCTION+93, // "["
MIN_REDUCTION+93, // (default reduction)
  }
,
{ // state 779
47,420, // letter
48,46, // "p"
49,46, // "v"
50,46, // {"A".."Z" "a" "d" "f".."h" "j".."k" "m".."n" "q".."s" "w" "y".."z"}
51,46, // "b"
52,46, // "e"
53,46, // "t"
54,46, // "c"
55,46, // "i"
56,46, // "l"
57,46, // "o"
58,46, // "u"
59,46, // "x"
60,567, // letter128
61,407, // {199..218 231..250}
62,407, // {193..198 225..230}
63,184, // digit
64,155, // {"1".."9"}
65,155, // "0"
66,275, // digit128
67,394, // {176..185}
84,165, // $$0
89,759, // idChar
90,736, // "_"
91,504, // idChar128
92,433, // {223}
  }
,
{ // state 780
0x80000000|346, // match move
0x80000000|555, // no-match move
0x80000000|34, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 781
68,102, // ws
69,602, // " "
70,622, // {10}
MIN_REDUCTION+65, // (default reduction)
  }
,
{ // state 782
MIN_REDUCTION+99, // (default reduction)
  }
,
{ // state 783
-1, // $$start
-1, // <start>
-1, // ws*
-1, // <program>
-1, // <class decl>+
-1, // <class decl>
-1, // `class
164, // ID
437, // `{
-1, // <decl in class>*
604, // `}
-1, // `extends
-1, // <decl in class>
-1, // <method decl>
-1, // `public
-1, // `void
330, // `(
-1, // `)
408, // <stmt>*
129, // <type>
558, // `int
559, // `boolean
-1, // <empty bracket pair>
-1, // `[
-1, // `]
769, // <stmt>
575, // <assign>
-1, // `;
259, // <local var decl>
384, // `if
366, // <exp>
-1, // `else
-1, // `=
693, // <exp8>
210, // <exp7>
13, // <exp6>
18, // <exp5>
61, // <exp4>
-1, // `+
306, // <exp3>
-1, // `*
50, // <exp2>
159, // <cast exp>
311, // <unary exp>
57, // <exp1>
520, // `-
296, // INTLIT
744, // letter
493, // "p"
493, // "v"
493, // {"A".."Z" "a" "d" "f".."h" "j".."k" "m".."n" "q".."s" "w" "y".."z"}
493, // "b"
493, // "e"
493, // "t"
493, // "c"
493, // "i"
493, // "l"
493, // "o"
493, // "u"
493, // "x"
246, // letter128
120, // {199..218 231..250}
120, // {193..198 225..230}
-1, // digit
167, // {"1".."9"}
655, // "0"
365, // digit128
765, // {176..185}
-1, // ws
-1, // " "
-1, // {10}
269, // "#"
-1, // "+"
-1, // "*"
576, // "("
-1, // ")"
538, // "{"
716, // "}"
775, // "-"
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
{ // state 784
0x80000000|689, // match move
0x80000000|110, // no-match move
0x80000000|34, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 785
23,MIN_REDUCTION+93, // `[
80,MIN_REDUCTION+93, // "["
MIN_REDUCTION+93, // (default reduction)
  }
,
{ // state 786
MIN_REDUCTION+36, // (default reduction)
  }
,
{ // state 787
MIN_REDUCTION+1, // (default reduction)
  }
,
{ // state 788
23,MIN_REDUCTION+39, // `[
80,MIN_REDUCTION+39, // "["
MIN_REDUCTION+39, // (default reduction)
  }
,
{ // state 789
MIN_REDUCTION+36, // (default reduction)
  }
,
{ // state 790
MIN_REDUCTION+46, // (default reduction)
  }
,
{ // state 791
MIN_REDUCTION+117, // (default reduction)
  }
,
{ // state 792
2,708, // ws*
68,434, // ws
69,284, // " "
70,115, // {10}
MIN_REDUCTION+86, // (default reduction)
  }
,
{ // state 793
MIN_REDUCTION+36, // (default reduction)
  }
,
{ // state 794
23,MIN_REDUCTION+39, // `[
80,MIN_REDUCTION+39, // "["
MIN_REDUCTION+39, // (default reduction)
  }
,
{ // state 795
23,MIN_REDUCTION+39, // `[
80,MIN_REDUCTION+39, // "["
MIN_REDUCTION+39, // (default reduction)
  }
,
{ // state 796
MIN_REDUCTION+99, // (default reduction)
  }
,
{ // state 797
MIN_REDUCTION+16, // (default reduction)
  }
,
{ // state 798
24,350, // `]
81,278, // "]"
  }
,
};
}
public MJGrammarParseTable(MJGrammar actionObj) {
  actionObject = actionObj;
  parseTable = new int[799][];
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
// <stmt> ::= `if `( <exp> `) <stmt> `else <stmt>
(25<<16)+7,
// <assign> ::= <exp> `= <exp>
(26<<16)+3,
// <local var decl> ::= <type> ID `= <exp>
(28<<16)+4,
// <exp> ::= <exp8>
(30<<16)+1,
// <exp8> ::= <exp7>
(33<<16)+1,
// <exp7> ::= <exp6>
(34<<16)+1,
// <exp6> ::= <exp5>
(35<<16)+1,
// <exp5> ::= <exp4>
(36<<16)+1,
// <exp4> ::= <exp4> `+ <exp3>
(37<<16)+3,
// <exp4> ::= <exp3>
(37<<16)+1,
// <exp3> ::= <exp3> `* <exp2>
(39<<16)+3,
// <exp3> ::= <exp2>
(39<<16)+1,
// <exp2> ::= <cast exp>
(41<<16)+1,
// <exp2> ::= <unary exp>
(41<<16)+1,
// <cast exp> ::= `( <type> `) <cast exp>
(42<<16)+4,
// <cast exp> ::= `( <type> `) <exp1>
(42<<16)+4,
// <unary exp> ::= `- <unary exp>
(43<<16)+2,
// <unary exp> ::= <exp1>
(43<<16)+1,
// <exp1> ::= ID
(44<<16)+1,
// <exp1> ::= <exp1> !<empty bracket pair> `[ <exp> `]
(44<<16)+4,
// <exp1> ::= INTLIT
(44<<16)+1,
// letter ::= {"A".."Z" "a".."z"}
(47<<16)+1,
// letter128 ::= {193..218 225..250}
(60<<16)+1,
// digit ::= {"0".."9"}
(63<<16)+1,
// digit128 ::= {176..185}
(66<<16)+1,
// ws ::= " "
(68<<16)+1,
// ws ::= {10}
(68<<16)+1,
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
(40<<16)+2,
// `* ::= "*"
(40<<16)+1,
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
(45<<16)+2,
// `- ::= "-"
(45<<16)+1,
// `+ ::= "+" ws*
(38<<16)+2,
// `+ ::= "+"
(38<<16)+1,
// `= ::= "=" ws*
(32<<16)+2,
// `= ::= "="
(32<<16)+1,
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
(46<<16)+3,
// INTLIT ::= {"1".."9"} $$1
(46<<16)+2,
// INTLIT ::= digit128 ws*
(46<<16)+2,
// INTLIT ::= digit128
(46<<16)+1,
// INTLIT ::= "0" hexDigit* $$2
(46<<16)+3,
// INTLIT ::= "0" $$2
(46<<16)+2,
// idChar ::= letter
(89<<16)+1,
// idChar ::= digit
(89<<16)+1,
// idChar ::= "_"
(89<<16)+1,
// idChar128 ::= letter128
(91<<16)+1,
// idChar128 ::= digit128
(91<<16)+1,
// idChar128 ::= {223}
(91<<16)+1,
// hexDigit ::= {"0".."9" "A".."Z" "a".."z"}
(93<<16)+1,
// hexDigit128 ::= {176..185 193..198 225..230}
(94<<16)+1,
// digit* ::= digit* digit
(85<<16)+2,
// digit* ::= digit
(85<<16)+1,
// <decl in class>* ::= <decl in class>* <decl in class>
(9<<16)+2,
// <decl in class>* ::= <decl in class>
(9<<16)+1,
// hexDigit* ::= hexDigit* hexDigit
(87<<16)+2,
// hexDigit* ::= hexDigit
(87<<16)+1,
// <stmt>* ::= <stmt>* <stmt>
(18<<16)+2,
// <stmt>* ::= <stmt>
(18<<16)+1,
// idChar* ::= idChar* idChar
(83<<16)+2,
// idChar* ::= idChar
(83<<16)+1,
// <class decl>+ ::= <class decl>
(4<<16)+1,
// <class decl>+ ::= <class decl>+ <class decl>
(4<<16)+2,
// ws* ::= ws* ws
(2<<16)+2,
// ws* ::= ws
(2<<16)+1,
// $$0 ::= idChar128 ws*
(84<<16)+2,
// $$0 ::= idChar128
(84<<16)+1,
// $$1 ::= digit128 ws*
(86<<16)+2,
// $$1 ::= digit128
(86<<16)+1,
// $$2 ::= hexDigit128 ws*
(88<<16)+2,
// $$2 ::= hexDigit128
(88<<16)+1,
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
70, // 10
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
69, // " "
-1, // "!"
-1, // '"'
71, // "#"
-1, // "$"
-1, // "%"
-1, // "&"
-1, // "'"
74, // "("
75, // ")"
73, // "*"
72, // "+"
-1, // ","
78, // "-"
-1, // "."
-1, // "/"
65, // "0"
64, // "1"
64, // "2"
64, // "3"
64, // "4"
64, // "5"
64, // "6"
64, // "7"
64, // "8"
64, // "9"
-1, // ":"
82, // ";"
-1, // "<"
79, // "="
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
80, // "["
-1, // "\"
81, // "]"
-1, // "^"
90, // "_"
-1, // "`"
50, // "a"
51, // "b"
54, // "c"
50, // "d"
52, // "e"
50, // "f"
50, // "g"
50, // "h"
55, // "i"
50, // "j"
50, // "k"
56, // "l"
50, // "m"
50, // "n"
57, // "o"
48, // "p"
50, // "q"
50, // "r"
50, // "s"
53, // "t"
58, // "u"
49, // "v"
50, // "w"
59, // "x"
50, // "y"
50, // "z"
76, // "{"
-1, // "|"
77, // "}"
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
67, // 176
67, // 177
67, // 178
67, // 179
67, // 180
67, // 181
67, // 182
67, // 183
67, // 184
67, // 185
-1, // 186
-1, // 187
-1, // 188
-1, // 189
-1, // 190
-1, // 191
-1, // 192
62, // 193
62, // 194
62, // 195
62, // 196
62, // 197
62, // 198
61, // 199
61, // 200
61, // 201
61, // 202
61, // 203
61, // 204
61, // 205
61, // 206
61, // 207
61, // 208
61, // 209
61, // 210
61, // 211
61, // 212
61, // 213
61, // 214
61, // 215
61, // 216
61, // 217
61, // 218
-1, // 219
-1, // 220
-1, // 221
-1, // 222
92, // 223
-1, // 224
62, // 225
62, // 226
62, // 227
62, // 228
62, // 229
62, // 230
61, // 231
61, // 232
61, // 233
61, // 234
61, // 235
61, // 236
61, // 237
61, // 238
61, // 239
61, // 240
61, // 241
61, // 242
61, // 243
61, // 244
61, // 245
61, // 246
61, // 247
61, // 248
61, // 249
61, // 250
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
"digit* ::= digit* digit", // 103
"digit* ::= digit* digit", // 104
"<decl in class>* ::= <decl in class>* <decl in class>", // 105
"<decl in class>* ::= <decl in class>* <decl in class>", // 106
"hexDigit* ::= hexDigit* hexDigit", // 107
"hexDigit* ::= hexDigit* hexDigit", // 108
"<stmt>* ::= <stmt>* <stmt>", // 109
"<stmt>* ::= <stmt>* <stmt>", // 110
"idChar* ::= idChar* idChar", // 111
"idChar* ::= idChar* idChar", // 112
"<class decl>+ ::= <class decl>", // 113
"<class decl>+ ::= <class decl>+ <class decl>", // 114
"ws* ::= ws* ws", // 115
"ws* ::= ws* ws", // 116
"", // 117
"", // 118
"", // 119
"", // 120
"", // 121
"", // 122
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
    { // 20: <stmt> ::= `if [#] `( <exp> `) <stmt> `else <stmt> @if_maker(int,Exp,Statement,Statement)=>Statement
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
      ((10<<5)|0x5)/*methodCall:10*/,
    },
    { // 21: <assign> ::= <exp> [#] `= <exp> @assign(Exp,int,Exp)=>Statement
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((6<<5)|0x6)/*nullProductionAction:6*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((11<<5)|0x5)/*methodCall:11*/,
    },
    { // 22: <local var decl> ::= <type> [#] ID `= <exp> @localVarDecl(Type,int,String,Exp)=>Statement
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((6<<5)|0x6)/*nullProductionAction:6*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((12<<5)|0x5)/*methodCall:12*/,
    },
    { // 23: <exp> ::= <exp8> @pass
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
    },
    { // 24: <exp8> ::= <exp7> @pass
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
    },
    { // 25: <exp7> ::= <exp6> @pass
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
    },
    { // 26: <exp6> ::= <exp5> @pass
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
    },
    { // 27: <exp5> ::= <exp4> @pass
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
    },
    { // 28: <exp4> ::= <exp4> [#] `+ <exp3> @newPlus(Exp,int,Exp)=>Exp
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((6<<5)|0x6)/*nullProductionAction:6*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((13<<5)|0x5)/*methodCall:13*/,
    },
    { // 29: <exp4> ::= <exp3> @pass
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
    },
    { // 30: <exp3> ::= <exp3> [#] `* <exp2> @newTimes(Exp,int,Exp)=>Exp
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((6<<5)|0x6)/*nullProductionAction:6*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((14<<5)|0x5)/*methodCall:14*/,
    },
    { // 31: <exp3> ::= <exp2> @pass
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
    },
    { // 32: <exp2> ::= <cast exp> @pass
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
    },
    { // 33: <exp2> ::= <unary exp> @pass
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
    },
    { // 34: <cast exp> ::= [#] `( <type> `) <cast exp> @newCast(int,Type,Exp)=>Exp
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((6<<5)|0x6)/*nullProductionAction:6*/,
      ((15<<5)|0x5)/*methodCall:15*/,
    },
    { // 35: <cast exp> ::= [#] `( <type> `) <exp1> @newCast(int,Type,Exp)=>Exp
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((6<<5)|0x6)/*nullProductionAction:6*/,
      ((15<<5)|0x5)/*methodCall:15*/,
    },
    { // 36: <unary exp> ::= [#] `- <unary exp> @newUnaryMinus(int,Exp)=>Exp
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((6<<5)|0x6)/*nullProductionAction:6*/,
      ((16<<5)|0x5)/*methodCall:16*/,
    },
    { // 37: <unary exp> ::= <exp1> @pass
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
    },
    { // 38: <exp1> ::= [#] ID @newIdentfierExp(int,String)=>Exp
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((6<<5)|0x6)/*nullProductionAction:6*/,
      ((17<<5)|0x5)/*methodCall:17*/,
    },
    { // 39: <exp1> ::= <exp1> !<empty bracket pair> [#] `[ <exp> `] @newArrayLookup(Exp,int,Exp)=>Exp
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((6<<5)|0x6)/*nullProductionAction:6*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((18<<5)|0x5)/*methodCall:18*/,
    },
    { // 40: <exp1> ::= [#] INTLIT @newIntegerLiteral(int,int)=>Exp
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((6<<5)|0x6)/*nullProductionAction:6*/,
      ((19<<5)|0x5)/*methodCall:19*/,
    },
    { // 41: letter ::= {"A".."Z" "a".."z"} @pass
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
    },
    { // 42: letter128 ::= {193..218 225..250} @sub128(char)=>char
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((20<<5)|0x5)/*methodCall:20*/,
    },
    { // 43: digit ::= {"0".."9"} @pass
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
    },
    { // 44: digit128 ::= {176..185} @sub128(char)=>char
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((20<<5)|0x5)/*methodCall:20*/,
    },
    { // 45: ws ::= " " @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 46: ws ::= {10} [registerNewline] @void
      ((7<<5)|0x6)/*nullProductionAction:7*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 47: `boolean ::= "#" "b" "o" ws* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((3<<5)|0x3)/*popOffPushBack:3*/,
    },
    { // 48: `boolean ::= "#" "b" "o" [ws*] @void
      ((3<<5)|0x6)/*nullProductionAction:3*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((3<<5)|0x3)/*popOffPushBack:3*/,
    },
    { // 49: `class ::= "#" "c" "l" ws* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((3<<5)|0x3)/*popOffPushBack:3*/,
    },
    { // 50: `class ::= "#" "c" "l" [ws*] @void
      ((3<<5)|0x6)/*nullProductionAction:3*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((3<<5)|0x3)/*popOffPushBack:3*/,
    },
    { // 51: `extends ::= "#" "e" "x" ws* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((3<<5)|0x3)/*popOffPushBack:3*/,
    },
    { // 52: `extends ::= "#" "e" "x" [ws*] @void
      ((3<<5)|0x6)/*nullProductionAction:3*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((3<<5)|0x3)/*popOffPushBack:3*/,
    },
    { // 53: `void ::= "#" "v" "o" ws* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((3<<5)|0x3)/*popOffPushBack:3*/,
    },
    { // 54: `void ::= "#" "v" "o" [ws*] @void
      ((3<<5)|0x6)/*nullProductionAction:3*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((3<<5)|0x3)/*popOffPushBack:3*/,
    },
    { // 55: `int ::= "#" "i" "t" ws* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((3<<5)|0x3)/*popOffPushBack:3*/,
    },
    { // 56: `int ::= "#" "i" "t" [ws*] @void
      ((3<<5)|0x6)/*nullProductionAction:3*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((3<<5)|0x3)/*popOffPushBack:3*/,
    },
    { // 57: `if ::= "#" "+" ws* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((2<<5)|0x3)/*popOffPushBack:2*/,
    },
    { // 58: `if ::= "#" "+" [ws*] @void
      ((3<<5)|0x6)/*nullProductionAction:3*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((2<<5)|0x3)/*popOffPushBack:2*/,
    },
    { // 59: `else ::= "#" "e" "l" ws* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((3<<5)|0x3)/*popOffPushBack:3*/,
    },
    { // 60: `else ::= "#" "e" "l" [ws*] @void
      ((3<<5)|0x6)/*nullProductionAction:3*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((3<<5)|0x3)/*popOffPushBack:3*/,
    },
    { // 61: `public ::= "#" "p" "u" ws* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((3<<5)|0x3)/*popOffPushBack:3*/,
    },
    { // 62: `public ::= "#" "p" "u" [ws*] @void
      ((3<<5)|0x6)/*nullProductionAction:3*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((3<<5)|0x3)/*popOffPushBack:3*/,
    },
    { // 63: `* ::= "*" ws* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 64: `* ::= "*" [ws*] @void
      ((3<<5)|0x6)/*nullProductionAction:3*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 65: `( ::= "(" ws* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 66: `( ::= "(" [ws*] @void
      ((3<<5)|0x6)/*nullProductionAction:3*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 67: `) ::= ")" ws* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 68: `) ::= ")" [ws*] @void
      ((3<<5)|0x6)/*nullProductionAction:3*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 69: `{ ::= "{" ws* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 70: `{ ::= "{" [ws*] @void
      ((3<<5)|0x6)/*nullProductionAction:3*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 71: `} ::= "}" ws* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 72: `} ::= "}" [ws*] @void
      ((3<<5)|0x6)/*nullProductionAction:3*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 73: `- ::= "-" ws* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 74: `- ::= "-" [ws*] @void
      ((3<<5)|0x6)/*nullProductionAction:3*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 75: `+ ::= "+" ws* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 76: `+ ::= "+" [ws*] @void
      ((3<<5)|0x6)/*nullProductionAction:3*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 77: `= ::= "=" ws* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 78: `= ::= "=" [ws*] @void
      ((3<<5)|0x6)/*nullProductionAction:3*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 79: `[ ::= "[" ws* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 80: `[ ::= "[" [ws*] @void
      ((3<<5)|0x6)/*nullProductionAction:3*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 81: `] ::= "]" ws* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 82: `] ::= "]" [ws*] @void
      ((3<<5)|0x6)/*nullProductionAction:3*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 83: `; ::= ";" ws* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 84: `; ::= ";" [ws*] @void
      ((3<<5)|0x6)/*nullProductionAction:3*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 85: ID ::= letter128 ws* @text
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x4)/*stringConcat:1*/,
    },
    { // 86: ID ::= letter128 [ws*] @text
      ((3<<5)|0x6)/*nullProductionAction:3*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x4)/*stringConcat:1*/,
    },
    { // 87: ID ::= letter idChar* $$0 @text
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((3<<5)|0x4)/*stringConcat:3*/,
    },
    { // 88: ID ::= letter [idChar*] $$0 @text
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((4<<5)|0x6)/*nullProductionAction:4*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((3<<5)|0x4)/*stringConcat:3*/,
    },
    { // 89: INTLIT ::= {"1".."9"} digit* $$1 @convertToInt(char,List<Character>,char)=>int
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((21<<5)|0x5)/*methodCall:21*/,
    },
    { // 90: INTLIT ::= {"1".."9"} [digit*] $$1 @convertToInt(char,List<Character>,char)=>int
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((5<<5)|0x6)/*nullProductionAction:5*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((21<<5)|0x5)/*methodCall:21*/,
    },
    { // 91: INTLIT ::= digit128 ws* @convertToInt(char)=>int
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((22<<5)|0x5)/*methodCall:22*/,
    },
    { // 92: INTLIT ::= digit128 [ws*] @convertToInt(char)=>int
      ((3<<5)|0x6)/*nullProductionAction:3*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((22<<5)|0x5)/*methodCall:22*/,
    },
    { // 93: INTLIT ::= "0" hexDigit* $$2 @convert16ToInt(char,List<Character>,char)=>int
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((23<<5)|0x5)/*methodCall:23*/,
    },
    { // 94: INTLIT ::= "0" [hexDigit*] $$2 @convert16ToInt(char,List<Character>,char)=>int
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((0<<5)|0x6)/*nullProductionAction:0*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((23<<5)|0x5)/*methodCall:23*/,
    },
    { // 95: idChar ::= letter @pass
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
    },
    { // 96: idChar ::= digit @pass
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
    },
    { // 97: idChar ::= "_" @pass
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
    },
    { // 98: idChar128 ::= letter128 @pass
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
    },
    { // 99: idChar128 ::= digit128 @pass
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
    },
    { // 100: idChar128 ::= {223} @underscore(char)=>char
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((24<<5)|0x5)/*methodCall:24*/,
    },
    { // 101: hexDigit ::= {"0".."9" "A".."Z" "a".."z"} @pass
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
    },
    { // 102: hexDigit128 ::= {176..185 193..198 225..230} @sub128(char)=>char
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((20<<5)|0x5)/*methodCall:20*/,
    },
    { // 103: digit* ::= digit* digit @append
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xb)/*append:1*/,
    },
    { // 104: digit* ::= [digit*] digit @append
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((5<<5)|0x6)/*nullProductionAction:5*/,
      ((1<<5)|0xb)/*append:1*/,
    },
    { // 105: <decl in class>* ::= <decl in class>* <decl in class> @append
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xb)/*append:1*/,
    },
    { // 106: <decl in class>* ::= [<decl in class>*] <decl in class> @append
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((2<<5)|0x6)/*nullProductionAction:2*/,
      ((1<<5)|0xb)/*append:1*/,
    },
    { // 107: hexDigit* ::= hexDigit* hexDigit @append
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xb)/*append:1*/,
    },
    { // 108: hexDigit* ::= [hexDigit*] hexDigit @append
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((0<<5)|0x6)/*nullProductionAction:0*/,
      ((1<<5)|0xb)/*append:1*/,
    },
    { // 109: <stmt>* ::= <stmt>* <stmt> @append
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xb)/*append:1*/,
    },
    { // 110: <stmt>* ::= [<stmt>*] <stmt> @append
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x6)/*nullProductionAction:1*/,
      ((1<<5)|0xb)/*append:1*/,
    },
    { // 111: idChar* ::= idChar* idChar @append
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xb)/*append:1*/,
    },
    { // 112: idChar* ::= [idChar*] idChar @append
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((4<<5)|0x6)/*nullProductionAction:4*/,
      ((1<<5)|0xb)/*append:1*/,
    },
    { // 113: <class decl>+ ::= <class decl> @singleList
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xa)/*singleList:1*/,
    },
    { // 114: <class decl>+ ::= <class decl>+ <class decl> @append
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xb)/*append:1*/,
    },
    { // 115: ws* ::= ws* ws @append
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
    },
    { // 116: ws* ::= [ws*] ws @append
      ((1<<5)|0xe)/*popPos:1*/,
      ((3<<5)|0x6)/*nullProductionAction:3*/,
    },
    { // 117: $$0 ::= idChar128 ws* @pass
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
    },
    { // 118: $$0 ::= idChar128 [ws*] @pass
      ((3<<5)|0x6)/*nullProductionAction:3*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
    },
    { // 119: $$1 ::= digit128 ws* @pass
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
    },
    { // 120: $$1 ::= digit128 [ws*] @pass
      ((3<<5)|0x6)/*nullProductionAction:3*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
    },
    { // 121: $$2 ::= hexDigit128 ws* @pass
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
    },
    { // 122: $$2 ::= hexDigit128 [ws*] @pass
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
      ((25<<5)|0x5)/*methodCall:25*/,
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
      Statement parm3 = (Statement)si.popPb();
      Statement result = actionObject.if_maker(parm0,parm1,parm2,parm3);
      si.pushPb(result);
    }
    break;
    case 11: {
      Exp parm0 = (Exp)si.popPb();
      int parm1 = (Integer)si.popPb();
      Exp parm2 = (Exp)si.popPb();
      Statement result = actionObject.assign(parm0,parm1,parm2);
      si.pushPb(result);
    }
    break;
    case 12: {
      Type parm0 = (Type)si.popPb();
      int parm1 = (Integer)si.popPb();
      String parm2 = (String)si.popPb();
      Exp parm3 = (Exp)si.popPb();
      Statement result = actionObject.localVarDecl(parm0,parm1,parm2,parm3);
      si.pushPb(result);
    }
    break;
    case 13: {
      Exp parm0 = (Exp)si.popPb();
      int parm1 = (Integer)si.popPb();
      Exp parm2 = (Exp)si.popPb();
      Exp result = actionObject.newPlus(parm0,parm1,parm2);
      si.pushPb(result);
    }
    break;
    case 14: {
      Exp parm0 = (Exp)si.popPb();
      int parm1 = (Integer)si.popPb();
      Exp parm2 = (Exp)si.popPb();
      Exp result = actionObject.newTimes(parm0,parm1,parm2);
      si.pushPb(result);
    }
    break;
    case 15: {
      int parm0 = (Integer)si.popPb();
      Type parm1 = (Type)si.popPb();
      Exp parm2 = (Exp)si.popPb();
      Exp result = actionObject.newCast(parm0,parm1,parm2);
      si.pushPb(result);
    }
    break;
    case 16: {
      int parm0 = (Integer)si.popPb();
      Exp parm1 = (Exp)si.popPb();
      Exp result = actionObject.newUnaryMinus(parm0,parm1);
      si.pushPb(result);
    }
    break;
    case 17: {
      int parm0 = (Integer)si.popPb();
      String parm1 = (String)si.popPb();
      Exp result = actionObject.newIdentfierExp(parm0,parm1);
      si.pushPb(result);
    }
    break;
    case 18: {
      Exp parm0 = (Exp)si.popPb();
      int parm1 = (Integer)si.popPb();
      Exp parm2 = (Exp)si.popPb();
      Exp result = actionObject.newArrayLookup(parm0,parm1,parm2);
      si.pushPb(result);
    }
    break;
    case 19: {
      int parm0 = (Integer)si.popPb();
      int parm1 = (Integer)si.popPb();
      Exp result = actionObject.newIntegerLiteral(parm0,parm1);
      si.pushPb(result);
    }
    break;
    case 20: {
      char parm0 = (Character)si.popPb();
      char result = actionObject.sub128(parm0);
      si.pushPb(result);
    }
    break;
    case 21: {
      char parm0 = (Character)si.popPb();
      List<Character> parm1 = (List<Character>)si.popPb();
      char parm2 = (Character)si.popPb();
      int result = actionObject.convertToInt(parm0,parm1,parm2);
      si.pushPb(result);
    }
    break;
    case 22: {
      char parm0 = (Character)si.popPb();
      int result = actionObject.convertToInt(parm0);
      si.pushPb(result);
    }
    break;
    case 23: {
      char parm0 = (Character)si.popPb();
      List<Character> parm1 = (List<Character>)si.popPb();
      char parm2 = (Character)si.popPb();
      int result = actionObject.convert16ToInt(parm0,parm1,parm2);
      si.pushPb(result);
    }
    break;
    case 24: {
      char parm0 = (Character)si.popPb();
      char result = actionObject.underscore(parm0);
      si.pushPb(result);
    }
    break;
    case 25: {
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
"Statement if_maker(int,Exp,Statement,Statement)",
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
4,1,
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
