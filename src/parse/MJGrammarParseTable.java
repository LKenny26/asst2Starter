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
private static final int MIN_REDUCTION = 855;
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
1,401, // <start>
2,583, // ws*
3,572, // <program>
4,615, // <class decl>+
5,703, // <class decl>
6,410, // `class
68,238, // ws
69,546, // " "
70,575, // {10}
71,540, // "#"
  }
,
{ // state 1
  }
,
{ // state 2
MIN_REDUCTION+25, // (default reduction)
  }
,
{ // state 3
68,637, // ws
69,98, // " "
70,138, // {10}
MIN_REDUCTION+76, // (default reduction)
  }
,
{ // state 4
7,174, // ID
8,463, // `{
16,348, // `(
19,139, // <type>
20,593, // `int
21,595, // `boolean
25,559, // <stmt>
26,612, // <assign>
28,273, // <local var decl>
29,836, // `if
30,387, // <exp>
33,741, // <exp8>
34,221, // <exp7>
35,14, // <exp6>
36,19, // <exp5>
37,68, // <exp4>
39,322, // <exp3>
41,56, // <exp2>
42,169, // <cast exp>
43,327, // <unary exp>
44,64, // <exp1>
45,555, // `-
46,311, // INTLIT
47,794, // letter
48,526, // "p"
49,526, // "v"
50,526, // {"A".."Z" "a" "d" "f".."h" "j".."k" "m".."n" "q".."s" "w" "y".."z"}
51,526, // "b"
52,526, // "e"
53,526, // "t"
54,526, // "c"
55,526, // "i"
56,526, // "l"
57,526, // "o"
58,526, // "u"
59,526, // "x"
60,258, // letter128
61,129, // {199..218 231..250}
62,129, // {193..198 225..230}
64,178, // {"1".."9"}
65,699, // "0"
66,386, // digit128
67,816, // {176..185}
71,284, // "#"
74,613, // "("
76,573, // "{"
78,827, // "-"
  }
,
{ // state 5
0x80000000|1, // match move
0x80000000|421, // no-match move
0x80000000|35, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 6
0x80000000|1, // match move
0x80000000|653, // no-match move
0x80000000|35, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 7
2,432, // ws*
68,550, // ws
69,483, // " "
70,802, // {10}
MIN_REDUCTION+49, // (default reduction)
  }
,
{ // state 8
MIN_REDUCTION+20, // (default reduction)
  }
,
{ // state 9
MIN_REDUCTION+32, // (default reduction)
  }
,
{ // state 10
MIN_REDUCTION+99, // (default reduction)
  }
,
{ // state 11
0x80000000|60, // match move
0x80000000|482, // no-match move
0x80000000|35, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 12
0x80000000|288, // match move
0x80000000|272, // no-match move
0x80000000|35, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 13
MIN_REDUCTION+17, // (default reduction)
  }
,
{ // state 14
MIN_REDUCTION+26, // (default reduction)
  }
,
{ // state 15
2,67, // ws*
68,415, // ws
69,750, // " "
70,240, // {10}
MIN_REDUCTION+73, // (default reduction)
  }
,
{ // state 16
MIN_REDUCTION+27, // (default reduction)
  }
,
{ // state 17
0x80000000|286, // match move
0x80000000|268, // no-match move
0x80000000|35, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 18
MIN_REDUCTION+26, // (default reduction)
  }
,
{ // state 19
MIN_REDUCTION+27, // (default reduction)
  }
,
{ // state 20
2,833, // ws*
23,MIN_REDUCTION+87, // `[
68,73, // ws
69,11, // " "
70,69, // {10}
80,MIN_REDUCTION+87, // "["
MIN_REDUCTION+87, // (default reduction)
  }
,
{ // state 21
0x80000000|1, // match move
0x80000000|603, // no-match move
0x80000000|35, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 22
23,MIN_REDUCTION+95, // `[
80,MIN_REDUCTION+95, // "["
MIN_REDUCTION+95, // (default reduction)
  }
,
{ // state 23
27,262, // `;
82,492, // ";"
  }
,
{ // state 24
23,MIN_REDUCTION+95, // `[
80,MIN_REDUCTION+95, // "["
MIN_REDUCTION+95, // (default reduction)
  }
,
{ // state 25
MIN_REDUCTION+22, // (default reduction)
  }
,
{ // state 26
MIN_REDUCTION+27, // (default reduction)
  }
,
{ // state 27
23,MIN_REDUCTION+95, // `[
80,MIN_REDUCTION+95, // "["
MIN_REDUCTION+95, // (default reduction)
  }
,
{ // state 28
MIN_REDUCTION+26, // (default reduction)
  }
,
{ // state 29
0x80000000|1, // match move
0x80000000|647, // no-match move
0x80000000|35, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 30
0x80000000|1, // match move
0x80000000|649, // no-match move
0x80000000|35, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 31
68,380, // ws
69,614, // " "
70,634, // {10}
MIN_REDUCTION+70, // (default reduction)
  }
,
{ // state 32
MIN_REDUCTION+46, // (default reduction)
  }
,
{ // state 33
MIN_REDUCTION+88, // (default reduction)
  }
,
{ // state 34
47,445, // letter
48,50, // "p"
49,50, // "v"
50,50, // {"A".."Z" "a" "d" "f".."h" "j".."k" "m".."n" "q".."s" "w" "y".."z"}
51,50, // "b"
52,50, // "e"
53,50, // "t"
54,50, // "c"
55,50, // "i"
56,50, // "l"
57,50, // "o"
58,50, // "u"
59,50, // "x"
60,368, // letter128
61,129, // {199..218 231..250}
62,129, // {193..198 225..230}
63,194, // digit
64,165, // {"1".."9"}
65,165, // "0"
66,788, // digit128
67,106, // {176..185}
84,474, // $$0
89,810, // idChar
90,785, // "_"
91,417, // idChar128
92,385, // {223}
  }
,
{ // state 35
23,720, // `[
80,579, // "["
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
174, // ID
463, // `{
-1, // <decl in class>*
285, // `}
-1, // `extends
-1, // <decl in class>
-1, // <method decl>
-1, // `public
-1, // `void
348, // `(
-1, // `)
551, // <stmt>*
139, // <type>
593, // `int
595, // `boolean
-1, // <empty bracket pair>
-1, // `[
-1, // `]
821, // <stmt>
612, // <assign>
-1, // `;
273, // <local var decl>
836, // `if
387, // <exp>
-1, // `else
-1, // `=
741, // <exp8>
221, // <exp7>
14, // <exp6>
19, // <exp5>
68, // <exp4>
-1, // `+
322, // <exp3>
-1, // `*
56, // <exp2>
169, // <cast exp>
327, // <unary exp>
64, // <exp1>
555, // `-
311, // INTLIT
794, // letter
526, // "p"
526, // "v"
526, // {"A".."Z" "a" "d" "f".."h" "j".."k" "m".."n" "q".."s" "w" "y".."z"}
526, // "b"
526, // "e"
526, // "t"
526, // "c"
526, // "i"
526, // "l"
526, // "o"
526, // "u"
526, // "x"
258, // letter128
129, // {199..218 231..250}
129, // {193..198 225..230}
-1, // digit
178, // {"1".."9"}
699, // "0"
386, // digit128
816, // {176..185}
-1, // ws
-1, // " "
-1, // {10}
284, // "#"
-1, // "+"
-1, // "*"
613, // "("
-1, // ")"
573, // "{"
344, // "}"
827, // "-"
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
174, // ID
463, // `{
-1, // <decl in class>*
285, // `}
-1, // `extends
-1, // <decl in class>
-1, // <method decl>
-1, // `public
-1, // `void
348, // `(
-1, // `)
847, // <stmt>*
139, // <type>
593, // `int
595, // `boolean
-1, // <empty bracket pair>
-1, // `[
-1, // `]
821, // <stmt>
612, // <assign>
-1, // `;
273, // <local var decl>
836, // `if
387, // <exp>
-1, // `else
-1, // `=
741, // <exp8>
221, // <exp7>
14, // <exp6>
19, // <exp5>
68, // <exp4>
-1, // `+
322, // <exp3>
-1, // `*
56, // <exp2>
169, // <cast exp>
327, // <unary exp>
64, // <exp1>
555, // `-
311, // INTLIT
794, // letter
526, // "p"
526, // "v"
526, // {"A".."Z" "a" "d" "f".."h" "j".."k" "m".."n" "q".."s" "w" "y".."z"}
526, // "b"
526, // "e"
526, // "t"
526, // "c"
526, // "i"
526, // "l"
526, // "o"
526, // "u"
526, // "x"
258, // letter128
129, // {199..218 231..250}
129, // {193..198 225..230}
-1, // digit
178, // {"1".."9"}
699, // "0"
386, // digit128
816, // {176..185}
-1, // ws
-1, // " "
-1, // {10}
284, // "#"
-1, // "+"
-1, // "*"
613, // "("
-1, // ")"
573, // "{"
693, // "}"
827, // "-"
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
0x80000000|629, // no-match move
0x80000000|35, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 39
24,488, // `]
81,554, // "]"
  }
,
{ // state 40
MIN_REDUCTION+32, // (default reduction)
  }
,
{ // state 41
MIN_REDUCTION+99, // (default reduction)
  }
,
{ // state 42
0x80000000|1, // match move
0x80000000|435, // no-match move
0x80000000|35, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 43
0x80000000|1, // match move
0x80000000|437, // no-match move
0x80000000|35, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 44
7,144, // ID
16,352, // `(
30,608, // <exp>
33,743, // <exp8>
34,217, // <exp7>
35,18, // <exp6>
36,16, // <exp5>
37,92, // <exp4>
39,320, // <exp3>
41,58, // <exp2>
42,167, // <cast exp>
43,328, // <unary exp>
44,75, // <exp1>
45,553, // `-
46,314, // INTLIT
47,623, // letter
48,526, // "p"
49,526, // "v"
50,526, // {"A".."Z" "a" "d" "f".."h" "j".."k" "m".."n" "q".."s" "w" "y".."z"}
51,526, // "b"
52,526, // "e"
53,526, // "t"
54,526, // "c"
55,526, // "i"
56,526, // "l"
57,526, // "o"
58,526, // "u"
59,526, // "x"
60,787, // letter128
61,478, // {199..218 231..250}
62,478, // {193..198 225..230}
64,180, // {"1".."9"}
65,697, // "0"
66,388, // digit128
67,818, // {176..185}
74,613, // "("
78,827, // "-"
  }
,
{ // state 45
68,791, // ws
69,654, // " "
70,642, // {10}
MIN_REDUCTION+84, // (default reduction)
  }
,
{ // state 46
MIN_REDUCTION+16, // (default reduction)
  }
,
{ // state 47
MIN_REDUCTION+116, // (default reduction)
  }
,
{ // state 48
38,356, // `+
72,806, // "+"
MIN_REDUCTION+28, // (default reduction)
  }
,
{ // state 49
0x80000000|560, // match move
0x80000000|294, // no-match move
0x80000000|35, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 50
MIN_REDUCTION+42, // (default reduction)
  }
,
{ // state 51
MIN_REDUCTION+88, // (default reduction)
  }
,
{ // state 52
0x80000000|325, // match move
0x80000000|491, // no-match move
0x80000000|734, // NT-test-match state for `else
  }
,
{ // state 53
7,152, // ID
16,321, // `(
30,783, // <exp>
33,675, // <exp8>
34,212, // <exp7>
35,28, // <exp6>
36,26, // <exp5>
37,111, // <exp4>
39,281, // <exp3>
41,9, // <exp2>
42,229, // <cast exp>
43,340, // <unary exp>
44,150, // <exp1>
45,556, // `-
46,318, // INTLIT
47,662, // letter
48,526, // "p"
49,526, // "v"
50,526, // {"A".."Z" "a" "d" "f".."h" "j".."k" "m".."n" "q".."s" "w" "y".."z"}
51,526, // "b"
52,526, // "e"
53,526, // "t"
54,526, // "c"
55,526, // "i"
56,526, // "l"
57,526, // "o"
58,526, // "u"
59,526, // "x"
60,822, // letter128
61,489, // {199..218 231..250}
62,489, // {193..198 225..230}
64,201, // {"1".."9"}
65,717, // "0"
66,392, // digit128
67,811, // {176..185}
74,613, // "("
78,827, // "-"
  }
,
{ // state 54
8,712, // `{
76,682, // "{"
  }
,
{ // state 55
2,436, // ws*
68,550, // ws
69,483, // " "
70,802, // {10}
MIN_REDUCTION+57, // (default reduction)
  }
,
{ // state 56
MIN_REDUCTION+32, // (default reduction)
  }
,
{ // state 57
68,564, // ws
69,214, // " "
70,233, // {10}
MIN_REDUCTION+62, // (default reduction)
  }
,
{ // state 58
MIN_REDUCTION+32, // (default reduction)
  }
,
{ // state 59
0x80000000|296, // match move
0x80000000|291, // no-match move
0x80000000|35, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 60
MIN_REDUCTION+46, // (default reduction)
  }
,
{ // state 61
0x80000000|515, // match move
0x80000000|391, // no-match move
0x80000000|734, // NT-test-match state for `else
  }
,
{ // state 62
68,668, // ws
69,759, // " "
70,535, // {10}
MIN_REDUCTION+48, // (default reduction)
  }
,
{ // state 63
0x80000000|1, // match move
0x80000000|789, // no-match move
0x80000000|35, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 64
0x80000000|1, // match move
0x80000000|510, // no-match move
0x80000000|35, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 65
MIN_REDUCTION+89, // (default reduction)
  }
,
{ // state 66
MIN_REDUCTION+116, // (default reduction)
  }
,
{ // state 67
68,76, // ws
69,750, // " "
70,240, // {10}
MIN_REDUCTION+72, // (default reduction)
  }
,
{ // state 68
38,337, // `+
72,806, // "+"
MIN_REDUCTION+28, // (default reduction)
  }
,
{ // state 69
0x80000000|633, // match move
0x80000000|171, // no-match move
0x80000000|35, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 70
23,MIN_REDUCTION+122, // `[
68,6, // ws
69,83, // " "
70,81, // {10}
80,MIN_REDUCTION+122, // "["
MIN_REDUCTION+122, // (default reduction)
  }
,
{ // state 71
0x80000000|1, // match move
0x80000000|798, // no-match move
0x80000000|35, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 72
0x80000000|1, // match move
0x80000000|799, // no-match move
0x80000000|35, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 73
0x80000000|596, // match move
0x80000000|347, // no-match move
0x80000000|35, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 74
MIN_REDUCTION+117, // (default reduction)
  }
,
{ // state 75
0x80000000|1, // match move
0x80000000|497, // no-match move
0x80000000|35, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 76
MIN_REDUCTION+116, // (default reduction)
  }
,
{ // state 77
47,445, // letter
48,50, // "p"
49,50, // "v"
50,50, // {"A".."Z" "a" "d" "f".."h" "j".."k" "m".."n" "q".."s" "w" "y".."z"}
51,50, // "b"
52,50, // "e"
53,50, // "t"
54,50, // "c"
55,50, // "i"
56,50, // "l"
57,50, // "o"
58,50, // "u"
59,50, // "x"
60,764, // letter128
61,464, // {199..218 231..250}
62,464, // {193..198 225..230}
63,194, // digit
64,165, // {"1".."9"}
65,165, // "0"
66,511, // digit128
67,829, // {176..185}
84,63, // $$0
89,810, // idChar
90,785, // "_"
91,91, // idChar128
92,606, // {223}
  }
,
{ // state 78
0x80000000|1, // match move
0x80000000|793, // no-match move
0x80000000|35, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 79
47,445, // letter
48,50, // "p"
49,50, // "v"
50,50, // {"A".."Z" "a" "d" "f".."h" "j".."k" "m".."n" "q".."s" "w" "y".."z"}
51,50, // "b"
52,50, // "e"
53,50, // "t"
54,50, // "c"
55,50, // "i"
56,50, // "l"
57,50, // "o"
58,50, // "u"
59,50, // "x"
60,604, // letter128
61,433, // {199..218 231..250}
62,433, // {193..198 225..230}
63,194, // digit
64,165, // {"1".."9"}
65,165, // "0"
66,290, // digit128
67,418, // {176..185}
83,832, // idChar*
84,527, // $$0
89,357, // idChar
90,785, // "_"
91,538, // idChar128
92,459, // {223}
  }
,
{ // state 80
MIN_REDUCTION+12, // (default reduction)
  }
,
{ // state 81
0x80000000|1, // match move
0x80000000|574, // no-match move
0x80000000|35, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 82
40,295, // `*
73,738, // "*"
MIN_REDUCTION+29, // (default reduction)
  }
,
{ // state 83
0x80000000|1, // match move
0x80000000|202, // no-match move
0x80000000|35, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 84
47,445, // letter
48,50, // "p"
49,50, // "v"
50,50, // {"A".."Z" "a" "d" "f".."h" "j".."k" "m".."n" "q".."s" "w" "y".."z"}
51,50, // "b"
52,50, // "e"
53,50, // "t"
54,50, // "c"
55,50, // "i"
56,50, // "l"
57,50, // "o"
58,50, // "u"
59,50, // "x"
60,680, // letter128
61,489, // {199..218 231..250}
62,489, // {193..198 225..230}
63,194, // digit
64,165, // {"1".."9"}
65,165, // "0"
66,516, // digit128
67,811, // {176..185}
84,78, // $$0
89,810, // idChar
90,785, // "_"
91,59, // idChar128
92,533, // {223}
  }
,
{ // state 85
40,301, // `*
73,738, // "*"
MIN_REDUCTION+29, // (default reduction)
  }
,
{ // state 86
MIN_REDUCTION+89, // (default reduction)
  }
,
{ // state 87
0x80000000|1, // match move
0x80000000|544, // no-match move
0x80000000|35, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 88
59,630, // "x"
  }
,
{ // state 89
2,689, // ws*
68,164, // ws
69,759, // " "
70,535, // {10}
MIN_REDUCTION+87, // (default reduction)
  }
,
{ // state 90
0x80000000|1, // match move
0x80000000|542, // no-match move
0x80000000|35, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 91
0x80000000|271, // match move
0x80000000|365, // no-match move
0x80000000|35, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 92
38,346, // `+
72,806, // "+"
MIN_REDUCTION+28, // (default reduction)
  }
,
{ // state 93
0x80000000|1, // match move
0x80000000|198, // no-match move
0x80000000|35, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 94
47,445, // letter
48,50, // "p"
49,50, // "v"
50,50, // {"A".."Z" "a" "d" "f".."h" "j".."k" "m".."n" "q".."s" "w" "y".."z"}
51,50, // "b"
52,50, // "e"
53,50, // "t"
54,50, // "c"
55,50, // "i"
56,50, // "l"
57,50, // "o"
58,50, // "u"
59,50, // "x"
60,670, // letter128
61,479, // {199..218 231..250}
62,479, // {193..198 225..230}
63,194, // digit
64,165, // {"1".."9"}
65,165, // "0"
66,525, // digit128
67,816, // {176..185}
84,72, // $$0
89,810, // idChar
90,785, // "_"
91,17, // idChar128
92,524, // {223}
  }
,
{ // state 95
0x80000000|1, // match move
0x80000000|196, // no-match move
0x80000000|35, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 96
47,445, // letter
48,50, // "p"
49,50, // "v"
50,50, // {"A".."Z" "a" "d" "f".."h" "j".."k" "m".."n" "q".."s" "w" "y".."z"}
51,50, // "b"
52,50, // "e"
53,50, // "t"
54,50, // "c"
55,50, // "i"
56,50, // "l"
57,50, // "o"
58,50, // "u"
59,50, // "x"
60,672, // letter128
61,478, // {199..218 231..250}
62,478, // {193..198 225..230}
63,194, // digit
64,165, // {"1".."9"}
65,165, // "0"
66,522, // digit128
67,818, // {176..185}
84,71, // $$0
89,810, // idChar
90,785, // "_"
91,12, // idChar128
92,521, // {223}
  }
,
{ // state 97
23,MIN_REDUCTION+43, // `[
80,MIN_REDUCTION+43, // "["
MIN_REDUCTION+43, // (default reduction)
  }
,
{ // state 98
MIN_REDUCTION+46, // (default reduction)
  }
,
{ // state 99
2,833, // ws*
MIN_REDUCTION+87, // (default reduction)
  }
,
{ // state 100
MIN_REDUCTION+99, // (default reduction)
  }
,
{ // state 101
MIN_REDUCTION+117, // (default reduction)
  }
,
{ // state 102
40,292, // `*
73,738, // "*"
MIN_REDUCTION+29, // (default reduction)
  }
,
{ // state 103
68,52, // ws
69,61, // " "
70,753, // {10}
MIN_REDUCTION+72, // (default reduction)
  }
,
{ // state 104
68,47, // ws
69,804, // " "
70,458, // {10}
MIN_REDUCTION+52, // (default reduction)
  }
,
{ // state 105
0x80000000|1, // match move
0x80000000|580, // no-match move
0x80000000|35, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 106
0x80000000|725, // match move
0x80000000|825, // no-match move
0x80000000|35, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 107
17,639, // `)
75,399, // ")"
  }
,
{ // state 108
0x80000000|1, // match move
0x80000000|177, // no-match move
0x80000000|35, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 109
0x80000000|1, // match move
0x80000000|577, // no-match move
0x80000000|35, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 110
MIN_REDUCTION+116, // (default reduction)
  }
,
{ // state 111
38,317, // `+
72,806, // "+"
MIN_REDUCTION+28, // (default reduction)
  }
,
{ // state 112
53,55, // "t"
  }
,
{ // state 113
MIN_REDUCTION+46, // (default reduction)
  }
,
{ // state 114
23,MIN_REDUCTION+43, // `[
80,MIN_REDUCTION+43, // "["
MIN_REDUCTION+43, // (default reduction)
  }
,
{ // state 115
-1, // $$start
-1, // <start>
-1, // ws*
-1, // <program>
-1, // <class decl>+
-1, // <class decl>
-1, // `class
174, // ID
463, // `{
-1, // <decl in class>*
514, // `}
-1, // `extends
-1, // <decl in class>
-1, // <method decl>
-1, // `public
-1, // `void
348, // `(
-1, // `)
-1, // <stmt>*
139, // <type>
593, // `int
595, // `boolean
-1, // <empty bracket pair>
-1, // `[
-1, // `]
549, // <stmt>
612, // <assign>
-1, // `;
273, // <local var decl>
836, // `if
387, // <exp>
-1, // `else
-1, // `=
741, // <exp8>
221, // <exp7>
14, // <exp6>
19, // <exp5>
68, // <exp4>
-1, // `+
322, // <exp3>
-1, // `*
56, // <exp2>
169, // <cast exp>
327, // <unary exp>
64, // <exp1>
555, // `-
311, // INTLIT
794, // letter
526, // "p"
526, // "v"
526, // {"A".."Z" "a" "d" "f".."h" "j".."k" "m".."n" "q".."s" "w" "y".."z"}
526, // "b"
526, // "e"
526, // "t"
526, // "c"
526, // "i"
526, // "l"
526, // "o"
526, // "u"
526, // "x"
258, // letter128
129, // {199..218 231..250}
129, // {193..198 225..230}
-1, // digit
178, // {"1".."9"}
699, // "0"
386, // digit128
816, // {176..185}
-1, // ws
-1, // " "
-1, // {10}
284, // "#"
-1, // "+"
-1, // "*"
613, // "("
-1, // ")"
573, // "{"
395, // "}"
827, // "-"
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
{ // state 116
23,MIN_REDUCTION+91, // `[
80,MIN_REDUCTION+91, // "["
MIN_REDUCTION+91, // (default reduction)
  }
,
{ // state 117
17,663, // `)
75,384, // ")"
  }
,
{ // state 118
0x80000000|360, // match move
0x80000000|159, // no-match move
0x80000000|35, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 119
2,669, // ws*
23,MIN_REDUCTION+121, // `[
68,723, // ws
69,108, // " "
70,21, // {10}
80,MIN_REDUCTION+121, // "["
MIN_REDUCTION+121, // (default reduction)
  }
,
{ // state 120
0x80000000|363, // match move
0x80000000|160, // no-match move
0x80000000|35, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 121
40,253, // `*
73,738, // "*"
MIN_REDUCTION+29, // (default reduction)
  }
,
{ // state 122
0x80000000|283, // match move
0x80000000|622, // no-match move
0x80000000|734, // NT-test-match state for `else
  }
,
{ // state 123
2,297, // ws*
MIN_REDUCTION+119, // (default reduction)
  }
,
{ // state 124
MIN_REDUCTION+47, // (default reduction)
  }
,
{ // state 125
2,5, // ws*
23,MIN_REDUCTION+83, // `[
68,730, // ws
69,83, // " "
70,81, // {10}
80,MIN_REDUCTION+83, // "["
MIN_REDUCTION+83, // (default reduction)
  }
,
{ // state 126
0x80000000|1, // match move
0x80000000|324, // no-match move
0x80000000|35, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 127
2,187, // ws*
  }
,
{ // state 128
0x80000000|1, // match move
0x80000000|326, // no-match move
0x80000000|35, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 129
0x80000000|667, // match move
0x80000000|636, // no-match move
0x80000000|35, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 130
MIN_REDUCTION+47, // (default reduction)
  }
,
{ // state 131
MIN_REDUCTION+89, // (default reduction)
  }
,
{ // state 132
MIN_REDUCTION+5, // (default reduction)
  }
,
{ // state 133
47,445, // letter
48,50, // "p"
49,50, // "v"
50,50, // {"A".."Z" "a" "d" "f".."h" "j".."k" "m".."n" "q".."s" "w" "y".."z"}
51,50, // "b"
52,50, // "e"
53,50, // "t"
54,50, // "c"
55,50, // "i"
56,50, // "l"
57,50, // "o"
58,50, // "u"
59,50, // "x"
60,688, // letter128
61,659, // {199..218 231..250}
62,659, // {193..198 225..230}
63,194, // digit
64,165, // {"1".."9"}
65,165, // "0"
66,780, // digit128
67,611, // {176..185}
83,166, // idChar*
84,588, // $$0
89,357, // idChar
90,785, // "_"
91,252, // idChar128
92,567, // {223}
  }
,
{ // state 134
MIN_REDUCTION+117, // (default reduction)
  }
,
{ // state 135
23,MIN_REDUCTION+91, // `[
80,MIN_REDUCTION+91, // "["
MIN_REDUCTION+91, // (default reduction)
  }
,
{ // state 136
23,MIN_REDUCTION+91, // `[
80,MIN_REDUCTION+91, // "["
MIN_REDUCTION+91, // (default reduction)
  }
,
{ // state 137
0x80000000|1, // match move
0x80000000|343, // no-match move
0x80000000|35, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 138
MIN_REDUCTION+47, // (default reduction)
  }
,
{ // state 139
7,766, // ID
22,186, // <empty bracket pair>
23,39, // `[
47,423, // letter
48,526, // "p"
49,526, // "v"
50,526, // {"A".."Z" "a" "d" "f".."h" "j".."k" "m".."n" "q".."s" "w" "y".."z"}
51,526, // "b"
52,526, // "e"
53,526, // "t"
54,526, // "c"
55,526, // "i"
56,526, // "l"
57,526, // "o"
58,526, // "u"
59,526, // "x"
60,709, // letter128
61,674, // {199..218 231..250}
62,674, // {193..198 225..230}
80,579, // "["
  }
,
{ // state 140
2,747, // ws*
23,MIN_REDUCTION+121, // `[
68,735, // ws
69,95, // " "
70,105, // {10}
80,MIN_REDUCTION+121, // "["
MIN_REDUCTION+121, // (default reduction)
  }
,
{ // state 141
MIN_REDUCTION+8, // (default reduction)
  }
,
{ // state 142
0x80000000|127, // match move
0x80000000|197, // no-match move
0x80000000|35, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 143
2,751, // ws*
23,MIN_REDUCTION+121, // `[
68,732, // ws
69,93, // " "
70,109, // {10}
80,MIN_REDUCTION+121, // "["
MIN_REDUCTION+121, // (default reduction)
  }
,
{ // state 144
0x80000000|1, // match move
0x80000000|439, // no-match move
0x80000000|35, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 145
MIN_REDUCTION+116, // (default reduction)
  }
,
{ // state 146
0x80000000|1, // match move
0x80000000|443, // no-match move
0x80000000|35, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 147
MIN_REDUCTION+115, // (default reduction)
  }
,
{ // state 148
63,813, // digit
64,707, // {"1".."9"}
65,707, // "0"
66,837, // digit128
67,829, // {176..185}
85,372, // digit*
86,319, // $$1
  }
,
{ // state 149
MIN_REDUCTION+47, // (default reduction)
  }
,
{ // state 150
0x80000000|1, // match move
0x80000000|450, // no-match move
0x80000000|35, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 151
68,66, // ws
69,32, // " "
70,598, // {10}
MIN_REDUCTION+68, // (default reduction)
  }
,
{ // state 152
0x80000000|1, // match move
0x80000000|447, // no-match move
0x80000000|35, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 153
2,215, // ws*
68,257, // ws
69,748, // " "
70,306, // {10}
MIN_REDUCTION+87, // (default reduction)
  }
,
{ // state 154
16,53, // `(
74,405, // "("
  }
,
{ // state 155
MIN_REDUCTION+19, // (default reduction)
  }
,
{ // state 156
MIN_REDUCTION+16, // (default reduction)
  }
,
{ // state 157
0x80000000|1, // match move
0x80000000|430, // no-match move
0x80000000|35, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 158
2,754, // ws*
23,MIN_REDUCTION+121, // `[
68,730, // ws
69,83, // " "
70,81, // {10}
80,MIN_REDUCTION+121, // "["
MIN_REDUCTION+121, // (default reduction)
  }
,
{ // state 159
2,43, // ws*
23,MIN_REDUCTION+83, // `[
68,732, // ws
69,93, // " "
70,109, // {10}
80,MIN_REDUCTION+83, // "["
MIN_REDUCTION+83, // (default reduction)
  }
,
{ // state 160
2,42, // ws*
23,MIN_REDUCTION+83, // `[
68,735, // ws
69,95, // " "
70,105, // {10}
80,MIN_REDUCTION+83, // "["
MIN_REDUCTION+83, // (default reduction)
  }
,
{ // state 161
68,668, // ws
69,759, // " "
70,535, // {10}
MIN_REDUCTION+56, // (default reduction)
  }
,
{ // state 162
MIN_REDUCTION+47, // (default reduction)
  }
,
{ // state 163
0x80000000|1, // match move
0x80000000|308, // no-match move
0x80000000|35, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 164
MIN_REDUCTION+117, // (default reduction)
  }
,
{ // state 165
MIN_REDUCTION+44, // (default reduction)
  }
,
{ // state 166
47,445, // letter
48,50, // "p"
49,50, // "v"
50,50, // {"A".."Z" "a" "d" "f".."h" "j".."k" "m".."n" "q".."s" "w" "y".."z"}
51,50, // "b"
52,50, // "e"
53,50, // "t"
54,50, // "c"
55,50, // "i"
56,50, // "l"
57,50, // "o"
58,50, // "u"
59,50, // "x"
60,688, // letter128
61,659, // {199..218 231..250}
62,659, // {193..198 225..230}
63,194, // digit
64,165, // {"1".."9"}
65,165, // "0"
66,780, // digit128
67,611, // {176..185}
84,426, // $$0
89,810, // idChar
90,785, // "_"
91,252, // idChar128
92,567, // {223}
  }
,
{ // state 167
MIN_REDUCTION+33, // (default reduction)
  }
,
{ // state 168
0x80000000|560, // match move
0x80000000|278, // no-match move
0x80000000|35, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 169
MIN_REDUCTION+33, // (default reduction)
  }
,
{ // state 170
MIN_REDUCTION+88, // (default reduction)
  }
,
{ // state 171
23,MIN_REDUCTION+47, // `[
80,MIN_REDUCTION+47, // "["
MIN_REDUCTION+47, // (default reduction)
  }
,
{ // state 172
0x80000000|560, // match move
0x80000000|276, // no-match move
0x80000000|35, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 173
MIN_REDUCTION+100, // (default reduction)
  }
,
{ // state 174
0x80000000|728, // match move
0x80000000|692, // no-match move
0x80000000|35, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 175
68,329, // ws
69,641, // " "
70,223, // {10}
96,MIN_REDUCTION+60, // $NT
  }
,
{ // state 176
MIN_REDUCTION+88, // (default reduction)
  }
,
{ // state 177
23,MIN_REDUCTION+46, // `[
80,MIN_REDUCTION+46, // "["
MIN_REDUCTION+46, // (default reduction)
  }
,
{ // state 178
63,813, // digit
64,707, // {"1".."9"}
65,707, // "0"
66,815, // digit128
67,816, // {176..185}
85,442, // digit*
86,339, // $$1
  }
,
{ // state 179
0x80000000|560, // match move
0x80000000|422, // no-match move
0x80000000|35, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 180
63,813, // digit
64,707, // {"1".."9"}
65,707, // "0"
66,819, // digit128
67,818, // {176..185}
85,438, // digit*
86,336, // $$1
  }
,
{ // state 181
23,MIN_REDUCTION+101, // `[
80,MIN_REDUCTION+101, // "["
MIN_REDUCTION+101, // (default reduction)
  }
,
{ // state 182
68,618, // ws
69,113, // " "
70,130, // {10}
MIN_REDUCTION+64, // (default reduction)
  }
,
{ // state 183
23,MIN_REDUCTION+101, // `[
80,MIN_REDUCTION+101, // "["
MIN_REDUCTION+101, // (default reduction)
  }
,
{ // state 184
0x80000000|424, // match move
0x80000000|8, // no-match move
0x80000000|734, // NT-test-match state for `else
  }
,
{ // state 185
23,MIN_REDUCTION+86, // `[
68,6, // ws
69,83, // " "
70,81, // {10}
80,MIN_REDUCTION+86, // "["
MIN_REDUCTION+86, // (default reduction)
  }
,
{ // state 186
MIN_REDUCTION+14, // (default reduction)
  }
,
{ // state 187
0x80000000|1, // match move
0x80000000|462, // no-match move
0x80000000|35, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 188
MIN_REDUCTION+47, // (default reduction)
  }
,
{ // state 189
MIN_REDUCTION+47, // (default reduction)
  }
,
{ // state 190
23,MIN_REDUCTION+86, // `[
68,29, // ws
69,93, // " "
70,109, // {10}
80,MIN_REDUCTION+86, // "["
MIN_REDUCTION+86, // (default reduction)
  }
,
{ // state 191
MIN_REDUCTION+45, // (default reduction)
  }
,
{ // state 192
MIN_REDUCTION+33, // (default reduction)
  }
,
{ // state 193
MIN_REDUCTION+116, // (default reduction)
  }
,
{ // state 194
MIN_REDUCTION+97, // (default reduction)
  }
,
{ // state 195
49,440, // "v"
  }
,
{ // state 196
23,MIN_REDUCTION+46, // `[
80,MIN_REDUCTION+46, // "["
MIN_REDUCTION+46, // (default reduction)
  }
,
{ // state 197
2,187, // ws*
23,MIN_REDUCTION+83, // `[
68,723, // ws
69,108, // " "
70,21, // {10}
80,MIN_REDUCTION+83, // "["
MIN_REDUCTION+83, // (default reduction)
  }
,
{ // state 198
23,MIN_REDUCTION+46, // `[
80,MIN_REDUCTION+46, // "["
MIN_REDUCTION+46, // (default reduction)
  }
,
{ // state 199
0x80000000|1, // match move
0x80000000|599, // no-match move
0x80000000|35, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 200
23,MIN_REDUCTION+101, // `[
80,MIN_REDUCTION+101, // "["
MIN_REDUCTION+101, // (default reduction)
  }
,
{ // state 201
63,813, // digit
64,707, // {"1".."9"}
65,707, // "0"
66,824, // digit128
67,811, // {176..185}
85,446, // digit*
86,355, // $$1
  }
,
{ // state 202
23,MIN_REDUCTION+46, // `[
80,MIN_REDUCTION+46, // "["
MIN_REDUCTION+46, // (default reduction)
  }
,
{ // state 203
MIN_REDUCTION+117, // (default reduction)
  }
,
{ // state 204
23,MIN_REDUCTION+86, // `[
68,30, // ws
69,95, // " "
70,105, // {10}
80,MIN_REDUCTION+86, // "["
MIN_REDUCTION+86, // (default reduction)
  }
,
{ // state 205
0x80000000|1, // match move
0x80000000|520, // no-match move
0x80000000|35, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 206
0x80000000|1, // match move
0x80000000|523, // no-match move
0x80000000|35, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 207
51,473, // "b"
55,616, // "i"
  }
,
{ // state 208
2,419, // ws*
68,345, // ws
69,61, // " "
70,753, // {10}
MIN_REDUCTION+73, // (default reduction)
  }
,
{ // state 209
15,814, // `void
71,195, // "#"
  }
,
{ // state 210
23,MIN_REDUCTION+101, // `[
80,MIN_REDUCTION+101, // "["
MIN_REDUCTION+101, // (default reduction)
  }
,
{ // state 211
MIN_REDUCTION+116, // (default reduction)
  }
,
{ // state 212
MIN_REDUCTION+25, // (default reduction)
  }
,
{ // state 213
MIN_REDUCTION+47, // (default reduction)
  }
,
{ // state 214
MIN_REDUCTION+46, // (default reduction)
  }
,
{ // state 215
68,586, // ws
69,748, // " "
70,306, // {10}
MIN_REDUCTION+86, // (default reduction)
  }
,
{ // state 216
23,MIN_REDUCTION+45, // `[
80,MIN_REDUCTION+45, // "["
MIN_REDUCTION+45, // (default reduction)
  }
,
{ // state 217
MIN_REDUCTION+25, // (default reduction)
  }
,
{ // state 218
0x80000000|1, // match move
0x80000000|543, // no-match move
0x80000000|35, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 219
23,MIN_REDUCTION+86, // `[
68,38, // ws
69,108, // " "
70,21, // {10}
80,MIN_REDUCTION+86, // "["
MIN_REDUCTION+86, // (default reduction)
  }
,
{ // state 220
23,MIN_REDUCTION+101, // `[
80,MIN_REDUCTION+101, // "["
MIN_REDUCTION+101, // (default reduction)
  }
,
{ // state 221
MIN_REDUCTION+25, // (default reduction)
  }
,
{ // state 222
MIN_REDUCTION+45, // (default reduction)
  }
,
{ // state 223
96,MIN_REDUCTION+47, // $NT
MIN_REDUCTION+47, // (default reduction)
  }
,
{ // state 224
23,MIN_REDUCTION+45, // `[
80,MIN_REDUCTION+45, // "["
MIN_REDUCTION+45, // (default reduction)
  }
,
{ // state 225
MIN_REDUCTION+117, // (default reduction)
  }
,
{ // state 226
23,MIN_REDUCTION+45, // `[
80,MIN_REDUCTION+45, // "["
MIN_REDUCTION+45, // (default reduction)
  }
,
{ // state 227
0x80000000|335, // match move
0x80000000|125, // no-match move
0x80000000|35, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 228
68,658, // ws
69,483, // " "
70,802, // {10}
MIN_REDUCTION+82, // (default reduction)
  }
,
{ // state 229
MIN_REDUCTION+33, // (default reduction)
  }
,
{ // state 230
MIN_REDUCTION+116, // (default reduction)
  }
,
{ // state 231
MIN_REDUCTION+26, // (default reduction)
  }
,
{ // state 232
MIN_REDUCTION+27, // (default reduction)
  }
,
{ // state 233
MIN_REDUCTION+47, // (default reduction)
  }
,
{ // state 234
2,419, // ws*
MIN_REDUCTION+73, // (default reduction)
  }
,
{ // state 235
MIN_REDUCTION+117, // (default reduction)
  }
,
{ // state 236
68,393, // ws
69,260, // " "
70,149, // {10}
MIN_REDUCTION+118, // (default reduction)
  }
,
{ // state 237
MIN_REDUCTION+43, // (default reduction)
  }
,
{ // state 238
MIN_REDUCTION+117, // (default reduction)
  }
,
{ // state 239
MIN_REDUCTION+46, // (default reduction)
  }
,
{ // state 240
MIN_REDUCTION+47, // (default reduction)
  }
,
{ // state 241
MIN_REDUCTION+46, // (default reduction)
  }
,
{ // state 242
MIN_REDUCTION+101, // (default reduction)
  }
,
{ // state 243
17,394, // `)
22,681, // <empty bracket pair>
23,853, // `[
75,721, // ")"
80,579, // "["
  }
,
{ // state 244
68,791, // ws
69,654, // " "
70,642, // {10}
MIN_REDUCTION+72, // (default reduction)
  }
,
{ // state 245
68,110, // ws
69,643, // " "
70,661, // {10}
MIN_REDUCTION+78, // (default reduction)
  }
,
{ // state 246
MIN_REDUCTION+101, // (default reduction)
  }
,
{ // state 247
MIN_REDUCTION+106, // (default reduction)
  }
,
{ // state 248
0x80000000|1, // match move
0x80000000|448, // no-match move
0x80000000|35, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 249
2,397, // ws*
68,505, // ws
69,241, // " "
70,189, // {10}
MIN_REDUCTION+59, // (default reduction)
  }
,
{ // state 250
MIN_REDUCTION+45, // (default reduction)
  }
,
{ // state 251
47,445, // letter
48,50, // "p"
49,50, // "v"
50,50, // {"A".."Z" "a" "d" "f".."h" "j".."k" "m".."n" "q".."s" "w" "y".."z"}
51,50, // "b"
52,50, // "e"
53,50, // "t"
54,50, // "c"
55,50, // "i"
56,50, // "l"
57,50, // "o"
58,50, // "u"
59,50, // "x"
60,41, // letter128
61,711, // {199..218 231..250}
62,711, // {193..198 225..230}
63,194, // digit
64,165, // {"1".."9"}
65,165, // "0"
66,851, // digit128
67,191, // {176..185}
84,170, // $$0
89,810, // idChar
90,785, // "_"
91,557, // idChar128
92,242, // {223}
  }
,
{ // state 252
2,600, // ws*
68,164, // ws
69,759, // " "
70,535, // {10}
MIN_REDUCTION+119, // (default reduction)
  }
,
{ // state 253
7,157, // ID
16,255, // `(
41,801, // <exp2>
42,192, // <cast exp>
43,349, // <unary exp>
44,87, // <exp1>
45,562, // `-
46,302, // INTLIT
47,503, // letter
48,526, // "p"
49,526, // "v"
50,526, // {"A".."Z" "a" "d" "f".."h" "j".."k" "m".."n" "q".."s" "w" "y".."z"}
51,526, // "b"
52,526, // "e"
53,526, // "t"
54,526, // "c"
55,526, // "i"
56,526, // "l"
57,526, // "o"
58,526, // "u"
59,526, // "x"
60,767, // letter128
61,464, // {199..218 231..250}
62,464, // {193..198 225..230}
64,148, // {"1".."9"}
65,666, // "0"
66,374, // digit128
67,829, // {176..185}
74,613, // "("
78,827, // "-"
  }
,
{ // state 254
2,536, // ws*
68,203, // ws
69,643, // " "
70,661, // {10}
MIN_REDUCTION+81, // (default reduction)
  }
,
{ // state 255
7,305, // ID
19,350, // <type>
20,683, // `int
21,80, // `boolean
47,133, // letter
48,526, // "p"
49,526, // "v"
50,526, // {"A".."Z" "a" "d" "f".."h" "j".."k" "m".."n" "q".."s" "w" "y".."z"}
51,526, // "b"
52,526, // "e"
53,526, // "t"
54,526, // "c"
55,526, // "i"
56,526, // "l"
57,526, // "o"
58,526, // "u"
59,526, // "x"
60,89, // letter128
61,659, // {199..218 231..250}
62,659, // {193..198 225..230}
71,207, // "#"
  }
,
{ // state 256
0x80000000|1, // match move
0x80000000|27, // no-match move
0x80000000|35, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 257
MIN_REDUCTION+117, // (default reduction)
  }
,
{ // state 258
0x80000000|99, // match move
0x80000000|20, // no-match move
0x80000000|35, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 259
17,545, // `)
22,681, // <empty bracket pair>
23,853, // `[
75,721, // ")"
80,579, // "["
  }
,
{ // state 260
MIN_REDUCTION+46, // (default reduction)
  }
,
{ // state 261
17,513, // `)
22,681, // <empty bracket pair>
23,853, // `[
75,721, // ")"
80,579, // "["
  }
,
{ // state 262
0x80000000|845, // match move
0x80000000|638, // no-match move
0x80000000|734, // NT-test-match state for `else
  }
,
{ // state 263
0x80000000|1, // match move
0x80000000|24, // no-match move
0x80000000|35, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 264
7,144, // ID
16,352, // `(
30,25, // <exp>
33,743, // <exp8>
34,217, // <exp7>
35,18, // <exp6>
36,16, // <exp5>
37,92, // <exp4>
39,320, // <exp3>
41,58, // <exp2>
42,167, // <cast exp>
43,328, // <unary exp>
44,75, // <exp1>
45,553, // `-
46,314, // INTLIT
47,623, // letter
48,526, // "p"
49,526, // "v"
50,526, // {"A".."Z" "a" "d" "f".."h" "j".."k" "m".."n" "q".."s" "w" "y".."z"}
51,526, // "b"
52,526, // "e"
53,526, // "t"
54,526, // "c"
55,526, // "i"
56,526, // "l"
57,526, // "o"
58,526, // "u"
59,526, // "x"
60,787, // letter128
61,478, // {199..218 231..250}
62,478, // {193..198 225..230}
64,180, // {"1".."9"}
65,697, // "0"
66,388, // digit128
67,818, // {176..185}
74,613, // "("
78,827, // "-"
  }
,
{ // state 265
68,52, // ws
69,61, // " "
70,753, // {10}
MIN_REDUCTION+72, // (default reduction)
  }
,
{ // state 266
0x80000000|1, // match move
0x80000000|22, // no-match move
0x80000000|35, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 267
68,370, // ws
69,241, // " "
70,189, // {10}
MIN_REDUCTION+118, // (default reduction)
  }
,
{ // state 268
2,770, // ws*
23,MIN_REDUCTION+119, // `[
68,732, // ws
69,93, // " "
70,109, // {10}
80,MIN_REDUCTION+119, // "["
MIN_REDUCTION+119, // (default reduction)
  }
,
{ // state 269
47,445, // letter
48,50, // "p"
49,50, // "v"
50,50, // {"A".."Z" "a" "d" "f".."h" "j".."k" "m".."n" "q".."s" "w" "y".."z"}
51,50, // "b"
52,50, // "e"
53,50, // "t"
54,50, // "c"
55,50, // "i"
56,50, // "l"
57,50, // "o"
58,50, // "u"
59,50, // "x"
60,41, // letter128
61,711, // {199..218 231..250}
62,711, // {193..198 225..230}
63,194, // digit
64,165, // {"1".."9"}
65,165, // "0"
66,851, // digit128
67,191, // {176..185}
83,251, // idChar*
84,65, // $$0
89,357, // idChar
90,785, // "_"
91,557, // idChar128
92,242, // {223}
  }
,
{ // state 270
23,MIN_REDUCTION+92, // `[
68,38, // ws
69,108, // " "
70,21, // {10}
80,MIN_REDUCTION+92, // "["
MIN_REDUCTION+92, // (default reduction)
  }
,
{ // state 271
2,90, // ws*
  }
,
{ // state 272
2,768, // ws*
23,MIN_REDUCTION+119, // `[
68,735, // ws
69,95, // " "
70,105, // {10}
80,MIN_REDUCTION+119, // "["
MIN_REDUCTION+119, // (default reduction)
  }
,
{ // state 273
27,155, // `;
82,589, // ";"
  }
,
{ // state 274
MIN_REDUCTION+46, // (default reduction)
  }
,
{ // state 275
MIN_REDUCTION+101, // (default reduction)
  }
,
{ // state 276
23,MIN_REDUCTION+103, // `[
80,MIN_REDUCTION+103, // "["
MIN_REDUCTION+103, // (default reduction)
  }
,
{ // state 277
MIN_REDUCTION+47, // (default reduction)
  }
,
{ // state 278
23,MIN_REDUCTION+103, // `[
80,MIN_REDUCTION+103, // "["
MIN_REDUCTION+103, // (default reduction)
  }
,
{ // state 279
7,174, // ID
8,37, // `{
16,348, // `(
19,139, // <type>
20,593, // `int
21,595, // `boolean
25,690, // <stmt>
26,594, // <assign>
28,493, // <local var decl>
29,852, // `if
30,387, // <exp>
33,741, // <exp8>
34,221, // <exp7>
35,14, // <exp6>
36,19, // <exp5>
37,68, // <exp4>
39,322, // <exp3>
41,56, // <exp2>
42,169, // <cast exp>
43,327, // <unary exp>
44,64, // <exp1>
45,555, // `-
46,311, // INTLIT
47,794, // letter
48,526, // "p"
49,526, // "v"
50,526, // {"A".."Z" "a" "d" "f".."h" "j".."k" "m".."n" "q".."s" "w" "y".."z"}
51,526, // "b"
52,526, // "e"
53,526, // "t"
54,526, // "c"
55,526, // "i"
56,526, // "l"
57,526, // "o"
58,526, // "u"
59,526, // "x"
60,258, // letter128
61,129, // {199..218 231..250}
62,129, // {193..198 225..230}
64,178, // {"1".."9"}
65,699, // "0"
66,386, // digit128
67,816, // {176..185}
71,284, // "#"
74,613, // "("
76,573, // "{"
78,827, // "-"
  }
,
{ // state 280
MIN_REDUCTION+46, // (default reduction)
  }
,
{ // state 281
40,292, // `*
73,738, // "*"
MIN_REDUCTION+30, // (default reduction)
  }
,
{ // state 282
23,687, // `[
80,254, // "["
MIN_REDUCTION+36, // (default reduction)
  }
,
{ // state 283
2,481, // ws*
MIN_REDUCTION+85, // (default reduction)
  }
,
{ // state 284
51,333, // "b"
55,112, // "i"
72,249, // "+"
  }
,
{ // state 285
0x80000000|375, // match move
0x80000000|828, // no-match move
0x80000000|734, // NT-test-match state for `else
  }
,
{ // state 286
2,770, // ws*
  }
,
{ // state 287
56,685, // "l"
  }
,
{ // state 288
2,768, // ws*
  }
,
{ // state 289
68,373, // ws
69,457, // " "
70,626, // {10}
MIN_REDUCTION+60, // (default reduction)
  }
,
{ // state 290
MIN_REDUCTION+100, // (default reduction)
  }
,
{ // state 291
2,778, // ws*
23,MIN_REDUCTION+119, // `[
68,730, // ws
69,83, // " "
70,81, // {10}
80,MIN_REDUCTION+119, // "["
MIN_REDUCTION+119, // (default reduction)
  }
,
{ // state 292
7,152, // ID
16,321, // `(
41,776, // <exp2>
42,229, // <cast exp>
43,340, // <unary exp>
44,150, // <exp1>
45,556, // `-
46,318, // INTLIT
47,662, // letter
48,526, // "p"
49,526, // "v"
50,526, // {"A".."Z" "a" "d" "f".."h" "j".."k" "m".."n" "q".."s" "w" "y".."z"}
51,526, // "b"
52,526, // "e"
53,526, // "t"
54,526, // "c"
55,526, // "i"
56,526, // "l"
57,526, // "o"
58,526, // "u"
59,526, // "x"
60,822, // letter128
61,489, // {199..218 231..250}
62,489, // {193..198 225..230}
64,201, // {"1".."9"}
65,717, // "0"
66,392, // digit128
67,811, // {176..185}
74,613, // "("
78,827, // "-"
  }
,
{ // state 293
2,731, // ws*
68,164, // ws
69,759, // " "
70,535, // {10}
MIN_REDUCTION+83, // (default reduction)
  }
,
{ // state 294
23,MIN_REDUCTION+103, // `[
80,MIN_REDUCTION+103, // "["
MIN_REDUCTION+103, // (default reduction)
  }
,
{ // state 295
7,144, // ID
16,352, // `(
41,772, // <exp2>
42,167, // <cast exp>
43,328, // <unary exp>
44,75, // <exp1>
45,553, // `-
46,314, // INTLIT
47,623, // letter
48,526, // "p"
49,526, // "v"
50,526, // {"A".."Z" "a" "d" "f".."h" "j".."k" "m".."n" "q".."s" "w" "y".."z"}
51,526, // "b"
52,526, // "e"
53,526, // "t"
54,526, // "c"
55,526, // "i"
56,526, // "l"
57,526, // "o"
58,526, // "u"
59,526, // "x"
60,787, // letter128
61,478, // {199..218 231..250}
62,478, // {193..198 225..230}
64,180, // {"1".."9"}
65,697, // "0"
66,388, // digit128
67,818, // {176..185}
74,613, // "("
78,827, // "-"
  }
,
{ // state 296
2,778, // ws*
  }
,
{ // state 297
0x80000000|844, // match move
0x80000000|591, // no-match move
0x80000000|35, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 298
MIN_REDUCTION+101, // (default reduction)
  }
,
{ // state 299
MIN_REDUCTION+46, // (default reduction)
  }
,
{ // state 300
23,695, // `[
80,254, // "["
MIN_REDUCTION+36, // (default reduction)
  }
,
{ // state 301
7,146, // ID
16,348, // `(
41,771, // <exp2>
42,169, // <cast exp>
43,327, // <unary exp>
44,64, // <exp1>
45,555, // `-
46,311, // INTLIT
47,625, // letter
48,526, // "p"
49,526, // "v"
50,526, // {"A".."Z" "a" "d" "f".."h" "j".."k" "m".."n" "q".."s" "w" "y".."z"}
51,526, // "b"
52,526, // "e"
53,526, // "t"
54,526, // "c"
55,526, // "i"
56,526, // "l"
57,526, // "o"
58,526, // "u"
59,526, // "x"
60,786, // letter128
61,479, // {199..218 231..250}
62,479, // {193..198 225..230}
64,178, // {"1".."9"}
65,699, // "0"
66,386, // digit128
67,816, // {176..185}
74,613, // "("
78,827, // "-"
  }
,
{ // state 302
0x80000000|1, // match move
0x80000000|362, // no-match move
0x80000000|35, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 303
23,700, // `[
80,254, // "["
MIN_REDUCTION+36, // (default reduction)
  }
,
{ // state 304
23,MIN_REDUCTION+92, // `[
68,29, // ws
69,93, // " "
70,109, // {10}
80,MIN_REDUCTION+92, // "["
MIN_REDUCTION+92, // (default reduction)
  }
,
{ // state 305
MIN_REDUCTION+13, // (default reduction)
  }
,
{ // state 306
MIN_REDUCTION+47, // (default reduction)
  }
,
{ // state 307
68,389, // ws
69,299, // " "
70,124, // {10}
MIN_REDUCTION+118, // (default reduction)
  }
,
{ // state 308
23,MIN_REDUCTION+90, // `[
80,MIN_REDUCTION+90, // "["
MIN_REDUCTION+90, // (default reduction)
  }
,
{ // state 309
0x80000000|1, // match move
0x80000000|808, // no-match move
0x80000000|35, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 310
9,331, // <decl in class>*
10,132, // `}
12,425, // <decl in class>
13,141, // <method decl>
14,209, // `public
71,800, // "#"
77,15, // "}"
  }
,
{ // state 311
0x80000000|1, // match move
0x80000000|342, // no-match move
0x80000000|35, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 312
68,52, // ws
69,61, // " "
70,753, // {10}
MIN_REDUCTION+84, // (default reduction)
  }
,
{ // state 313
23,MIN_REDUCTION+92, // `[
68,30, // ws
69,95, // " "
70,105, // {10}
80,MIN_REDUCTION+92, // "["
MIN_REDUCTION+92, // (default reduction)
  }
,
{ // state 314
0x80000000|1, // match move
0x80000000|341, // no-match move
0x80000000|35, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 315
MIN_REDUCTION+116, // (default reduction)
  }
,
{ // state 316
52,465, // "e"
  }
,
{ // state 317
7,152, // ID
16,321, // `(
39,102, // <exp3>
41,9, // <exp2>
42,229, // <cast exp>
43,340, // <unary exp>
44,150, // <exp1>
45,556, // `-
46,318, // INTLIT
47,662, // letter
48,526, // "p"
49,526, // "v"
50,526, // {"A".."Z" "a" "d" "f".."h" "j".."k" "m".."n" "q".."s" "w" "y".."z"}
51,526, // "b"
52,526, // "e"
53,526, // "t"
54,526, // "c"
55,526, // "i"
56,526, // "l"
57,526, // "o"
58,526, // "u"
59,526, // "x"
60,822, // letter128
61,489, // {199..218 231..250}
62,489, // {193..198 225..230}
64,201, // {"1".."9"}
65,717, // "0"
66,392, // digit128
67,811, // {176..185}
74,613, // "("
78,827, // "-"
  }
,
{ // state 318
0x80000000|1, // match move
0x80000000|381, // no-match move
0x80000000|35, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 319
0x80000000|1, // match move
0x80000000|746, // no-match move
0x80000000|35, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 320
40,295, // `*
73,738, // "*"
MIN_REDUCTION+30, // (default reduction)
  }
,
{ // state 321
7,305, // ID
19,243, // <type>
20,683, // `int
21,80, // `boolean
47,133, // letter
48,526, // "p"
49,526, // "v"
50,526, // {"A".."Z" "a" "d" "f".."h" "j".."k" "m".."n" "q".."s" "w" "y".."z"}
51,526, // "b"
52,526, // "e"
53,526, // "t"
54,526, // "c"
55,526, // "i"
56,526, // "l"
57,526, // "o"
58,526, // "u"
59,526, // "x"
60,89, // letter128
61,659, // {199..218 231..250}
62,659, // {193..198 225..230}
71,207, // "#"
  }
,
{ // state 322
40,301, // `*
73,738, // "*"
MIN_REDUCTION+30, // (default reduction)
  }
,
{ // state 323
23,679, // `[
80,254, // "["
MIN_REDUCTION+36, // (default reduction)
  }
,
{ // state 324
23,MIN_REDUCTION+90, // `[
80,MIN_REDUCTION+90, // "["
MIN_REDUCTION+90, // (default reduction)
  }
,
{ // state 325
MIN_REDUCTION+116, // (default reduction)
  }
,
{ // state 326
23,MIN_REDUCTION+90, // `[
80,MIN_REDUCTION+90, // "["
MIN_REDUCTION+90, // (default reduction)
  }
,
{ // state 327
MIN_REDUCTION+34, // (default reduction)
  }
,
{ // state 328
MIN_REDUCTION+34, // (default reduction)
  }
,
{ // state 329
96,MIN_REDUCTION+116, // $NT
MIN_REDUCTION+116, // (default reduction)
  }
,
{ // state 330
0x80000000|1, // match move
0x80000000|838, // no-match move
0x80000000|35, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 331
10,763, // `}
12,247, // <decl in class>
13,141, // <method decl>
14,209, // `public
71,800, // "#"
77,15, // "}"
  }
,
{ // state 332
MIN_REDUCTION+100, // (default reduction)
  }
,
{ // state 333
57,7, // "o"
  }
,
{ // state 334
MIN_REDUCTION+17, // (default reduction)
  }
,
{ // state 335
2,5, // ws*
  }
,
{ // state 336
0x80000000|1, // match move
0x80000000|135, // no-match move
0x80000000|35, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 337
7,146, // ID
16,348, // `(
39,85, // <exp3>
41,56, // <exp2>
42,169, // <cast exp>
43,327, // <unary exp>
44,64, // <exp1>
45,555, // `-
46,311, // INTLIT
47,625, // letter
48,526, // "p"
49,526, // "v"
50,526, // {"A".."Z" "a" "d" "f".."h" "j".."k" "m".."n" "q".."s" "w" "y".."z"}
51,526, // "b"
52,526, // "e"
53,526, // "t"
54,526, // "c"
55,526, // "i"
56,526, // "l"
57,526, // "o"
58,526, // "u"
59,526, // "x"
60,786, // letter128
61,479, // {199..218 231..250}
62,479, // {193..198 225..230}
64,178, // {"1".."9"}
65,699, // "0"
66,386, // digit128
67,816, // {176..185}
74,613, // "("
78,827, // "-"
  }
,
{ // state 338
47,445, // letter
48,50, // "p"
49,50, // "v"
50,50, // {"A".."Z" "a" "d" "f".."h" "j".."k" "m".."n" "q".."s" "w" "y".."z"}
51,50, // "b"
52,50, // "e"
53,50, // "t"
54,50, // "c"
55,50, // "i"
56,50, // "l"
57,50, // "o"
58,50, // "u"
59,50, // "x"
60,10, // letter128
61,674, // {199..218 231..250}
62,674, // {193..198 225..230}
63,194, // digit
64,165, // {"1".."9"}
65,165, // "0"
66,835, // digit128
67,222, // {176..185}
84,33, // $$0
89,810, // idChar
90,785, // "_"
91,496, // idChar128
92,275, // {223}
  }
,
{ // state 339
0x80000000|1, // match move
0x80000000|136, // no-match move
0x80000000|35, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 340
MIN_REDUCTION+34, // (default reduction)
  }
,
{ // state 341
23,MIN_REDUCTION+41, // `[
80,MIN_REDUCTION+41, // "["
MIN_REDUCTION+41, // (default reduction)
  }
,
{ // state 342
23,MIN_REDUCTION+41, // `[
80,MIN_REDUCTION+41, // "["
MIN_REDUCTION+41, // (default reduction)
  }
,
{ // state 343
23,MIN_REDUCTION+90, // `[
80,MIN_REDUCTION+90, // "["
MIN_REDUCTION+90, // (default reduction)
  }
,
{ // state 344
0x80000000|529, // match move
0x80000000|726, // no-match move
0x80000000|734, // NT-test-match state for `else
  }
,
{ // state 345
0x80000000|134, // match move
0x80000000|718, // no-match move
0x80000000|734, // NT-test-match state for `else
  }
,
{ // state 346
7,144, // ID
16,352, // `(
39,82, // <exp3>
41,58, // <exp2>
42,167, // <cast exp>
43,328, // <unary exp>
44,75, // <exp1>
45,553, // `-
46,314, // INTLIT
47,623, // letter
48,526, // "p"
49,526, // "v"
50,526, // {"A".."Z" "a" "d" "f".."h" "j".."k" "m".."n" "q".."s" "w" "y".."z"}
51,526, // "b"
52,526, // "e"
53,526, // "t"
54,526, // "c"
55,526, // "i"
56,526, // "l"
57,526, // "o"
58,526, // "u"
59,526, // "x"
60,787, // letter128
61,478, // {199..218 231..250}
62,478, // {193..198 225..230}
64,180, // {"1".."9"}
65,697, // "0"
66,388, // digit128
67,818, // {176..185}
74,613, // "("
78,827, // "-"
  }
,
{ // state 347
23,MIN_REDUCTION+117, // `[
80,MIN_REDUCTION+117, // "["
MIN_REDUCTION+117, // (default reduction)
  }
,
{ // state 348
7,305, // ID
19,259, // <type>
20,683, // `int
21,80, // `boolean
47,133, // letter
48,526, // "p"
49,526, // "v"
50,526, // {"A".."Z" "a" "d" "f".."h" "j".."k" "m".."n" "q".."s" "w" "y".."z"}
51,526, // "b"
52,526, // "e"
53,526, // "t"
54,526, // "c"
55,526, // "i"
56,526, // "l"
57,526, // "o"
58,526, // "u"
59,526, // "x"
60,89, // letter128
61,659, // {199..218 231..250}
62,659, // {193..198 225..230}
71,207, // "#"
  }
,
{ // state 349
MIN_REDUCTION+34, // (default reduction)
  }
,
{ // state 350
17,569, // `)
22,681, // <empty bracket pair>
23,853, // `[
75,721, // ")"
80,579, // "["
  }
,
{ // state 351
0x80000000|1, // match move
0x80000000|830, // no-match move
0x80000000|35, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 352
7,305, // ID
19,261, // <type>
20,683, // `int
21,80, // `boolean
47,133, // letter
48,526, // "p"
49,526, // "v"
50,526, // {"A".."Z" "a" "d" "f".."h" "j".."k" "m".."n" "q".."s" "w" "y".."z"}
51,526, // "b"
52,526, // "e"
53,526, // "t"
54,526, // "c"
55,526, // "i"
56,526, // "l"
57,526, // "o"
58,526, // "u"
59,526, // "x"
60,89, // letter128
61,659, // {199..218 231..250}
62,659, // {193..198 225..230}
71,207, // "#"
  }
,
{ // state 353
0x80000000|1, // match move
0x80000000|831, // no-match move
0x80000000|35, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 354
2,740, // ws*
23,MIN_REDUCTION+123, // `[
68,723, // ws
69,108, // " "
70,21, // {10}
80,MIN_REDUCTION+123, // "["
MIN_REDUCTION+123, // (default reduction)
  }
,
{ // state 355
0x80000000|1, // match move
0x80000000|116, // no-match move
0x80000000|35, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 356
7,157, // ID
16,255, // `(
39,121, // <exp3>
41,40, // <exp2>
42,192, // <cast exp>
43,349, // <unary exp>
44,87, // <exp1>
45,562, // `-
46,302, // INTLIT
47,503, // letter
48,526, // "p"
49,526, // "v"
50,526, // {"A".."Z" "a" "d" "f".."h" "j".."k" "m".."n" "q".."s" "w" "y".."z"}
51,526, // "b"
52,526, // "e"
53,526, // "t"
54,526, // "c"
55,526, // "i"
56,526, // "l"
57,526, // "o"
58,526, // "u"
59,526, // "x"
60,767, // letter128
61,464, // {199..218 231..250}
62,464, // {193..198 225..230}
64,148, // {"1".."9"}
65,666, // "0"
66,374, // digit128
67,829, // {176..185}
74,613, // "("
78,827, // "-"
  }
,
{ // state 357
MIN_REDUCTION+113, // (default reduction)
  }
,
{ // state 358
40,253, // `*
73,738, // "*"
MIN_REDUCTION+30, // (default reduction)
  }
,
{ // state 359
23,MIN_REDUCTION+92, // `[
68,6, // ws
69,83, // " "
70,81, // {10}
80,MIN_REDUCTION+92, // "["
MIN_REDUCTION+92, // (default reduction)
  }
,
{ // state 360
2,43, // ws*
  }
,
{ // state 361
47,445, // letter
48,50, // "p"
49,50, // "v"
50,50, // {"A".."Z" "a" "d" "f".."h" "j".."k" "m".."n" "q".."s" "w" "y".."z"}
51,50, // "b"
52,50, // "e"
53,50, // "t"
54,50, // "c"
55,50, // "i"
56,50, // "l"
57,50, // "o"
58,50, // "u"
59,50, // "x"
60,100, // letter128
61,664, // {199..218 231..250}
62,664, // {193..198 225..230}
63,194, // digit
64,165, // {"1".."9"}
65,165, // "0"
66,826, // digit128
67,250, // {176..185}
84,51, // $$0
89,810, // idChar
90,785, // "_"
91,452, // idChar128
92,298, // {223}
  }
,
{ // state 362
23,MIN_REDUCTION+41, // `[
80,MIN_REDUCTION+41, // "["
MIN_REDUCTION+41, // (default reduction)
  }
,
{ // state 363
2,42, // ws*
  }
,
{ // state 364
MIN_REDUCTION+86, // (default reduction)
  }
,
{ // state 365
2,90, // ws*
23,MIN_REDUCTION+119, // `[
68,723, // ws
69,108, // " "
70,21, // {10}
80,MIN_REDUCTION+119, // "["
MIN_REDUCTION+119, // (default reduction)
  }
,
{ // state 366
0x80000000|13, // match move
0x80000000|334, // no-match move
0x80000000|734, // NT-test-match state for `else
  }
,
{ // state 367
MIN_REDUCTION+89, // (default reduction)
  }
,
{ // state 368
0x80000000|428, // match move
0x80000000|657, // no-match move
0x80000000|35, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 369
MIN_REDUCTION+15, // (default reduction)
  }
,
{ // state 370
MIN_REDUCTION+116, // (default reduction)
  }
,
{ // state 371
MIN_REDUCTION+116, // (default reduction)
  }
,
{ // state 372
63,676, // digit
64,707, // {"1".."9"}
65,707, // "0"
66,837, // digit128
67,829, // {176..185}
86,137, // $$1
  }
,
{ // state 373
MIN_REDUCTION+116, // (default reduction)
  }
,
{ // state 374
0x80000000|404, // match move
0x80000000|409, // no-match move
0x80000000|35, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 375
MIN_REDUCTION+18, // (default reduction)
  }
,
{ // state 376
MIN_REDUCTION+117, // (default reduction)
  }
,
{ // state 377
2,716, // ws*
23,MIN_REDUCTION+123, // `[
68,735, // ws
69,95, // " "
70,105, // {10}
80,MIN_REDUCTION+123, // "["
MIN_REDUCTION+123, // (default reduction)
  }
,
{ // state 378
2,714, // ws*
23,MIN_REDUCTION+123, // `[
68,732, // ws
69,93, // " "
70,109, // {10}
80,MIN_REDUCTION+123, // "["
MIN_REDUCTION+123, // (default reduction)
  }
,
{ // state 379
-1, // $$start
-1, // <start>
-1, // ws*
-1, // <program>
-1, // <class decl>+
-1, // <class decl>
-1, // `class
174, // ID
463, // `{
-1, // <decl in class>*
531, // `}
-1, // `extends
-1, // <decl in class>
-1, // <method decl>
-1, // `public
-1, // `void
348, // `(
-1, // `)
-1, // <stmt>*
139, // <type>
593, // `int
595, // `boolean
-1, // <empty bracket pair>
-1, // `[
-1, // `]
549, // <stmt>
612, // <assign>
-1, // `;
273, // <local var decl>
836, // `if
387, // <exp>
-1, // `else
-1, // `=
741, // <exp8>
221, // <exp7>
14, // <exp6>
19, // <exp5>
68, // <exp4>
-1, // `+
322, // <exp3>
-1, // `*
56, // <exp2>
169, // <cast exp>
327, // <unary exp>
64, // <exp1>
555, // `-
311, // INTLIT
794, // letter
526, // "p"
526, // "v"
526, // {"A".."Z" "a" "d" "f".."h" "j".."k" "m".."n" "q".."s" "w" "y".."z"}
526, // "b"
526, // "e"
526, // "t"
526, // "c"
526, // "i"
526, // "l"
526, // "o"
526, // "u"
526, // "x"
258, // letter128
129, // {199..218 231..250}
129, // {193..198 225..230}
-1, // digit
178, // {"1".."9"}
699, // "0"
386, // digit128
816, // {176..185}
-1, // ws
-1, // " "
-1, // {10}
284, // "#"
-1, // "+"
-1, // "*"
613, // "("
-1, // ")"
573, // "{"
571, // "}"
827, // "-"
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
{ // state 380
MIN_REDUCTION+116, // (default reduction)
  }
,
{ // state 381
23,MIN_REDUCTION+41, // `[
80,MIN_REDUCTION+41, // "["
MIN_REDUCTION+41, // (default reduction)
  }
,
{ // state 382
31,4, // `else
71,316, // "#"
  }
,
{ // state 383
MIN_REDUCTION+116, // (default reduction)
  }
,
{ // state 384
2,698, // ws*
68,694, // ws
69,457, // " "
70,626, // {10}
MIN_REDUCTION+69, // (default reduction)
  }
,
{ // state 385
0x80000000|246, // match move
0x80000000|210, // no-match move
0x80000000|35, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 386
0x80000000|414, // match move
0x80000000|431, // no-match move
0x80000000|35, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 387
32,264, // `=
79,774, // "="
  }
,
{ // state 388
0x80000000|413, // match move
0x80000000|429, // no-match move
0x80000000|35, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 389
MIN_REDUCTION+116, // (default reduction)
  }
,
{ // state 390
2,696, // ws*
23,MIN_REDUCTION+123, // `[
68,730, // ws
69,83, // " "
70,81, // {10}
80,MIN_REDUCTION+123, // "["
MIN_REDUCTION+123, // (default reduction)
  }
,
{ // state 391
68,MIN_REDUCTION+46, // ws
69,MIN_REDUCTION+46, // " "
70,MIN_REDUCTION+46, // {10}
MIN_REDUCTION+46, // (default reduction)
  }
,
{ // state 392
0x80000000|420, // match move
0x80000000|441, // no-match move
0x80000000|35, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 393
MIN_REDUCTION+116, // (default reduction)
  }
,
{ // state 394
7,152, // ID
16,321, // `(
42,512, // <cast exp>
44,744, // <exp1>
46,318, // INTLIT
47,662, // letter
48,526, // "p"
49,526, // "v"
50,526, // {"A".."Z" "a" "d" "f".."h" "j".."k" "m".."n" "q".."s" "w" "y".."z"}
51,526, // "b"
52,526, // "e"
53,526, // "t"
54,526, // "c"
55,526, // "i"
56,526, // "l"
57,526, // "o"
58,526, // "u"
59,526, // "x"
60,822, // letter128
61,489, // {199..218 231..250}
62,489, // {193..198 225..230}
64,201, // {"1".."9"}
65,717, // "0"
66,392, // digit128
67,811, // {176..185}
74,613, // "("
  }
,
{ // state 395
2,244, // ws*
68,708, // ws
69,654, // " "
70,642, // {10}
MIN_REDUCTION+73, // (default reduction)
  }
,
{ // state 396
56,469, // "l"
  }
,
{ // state 397
68,370, // ws
69,241, // " "
70,189, // {10}
MIN_REDUCTION+58, // (default reduction)
  }
,
{ // state 398
31,408, // `else
71,316, // "#"
  }
,
{ // state 399
2,587, // ws*
68,460, // ws
69,299, // " "
70,124, // {10}
MIN_REDUCTION+69, // (default reduction)
  }
,
{ // state 400
2,701, // ws*
68,624, // ws
69,641, // " "
70,223, // {10}
96,MIN_REDUCTION+83, // $NT
  }
,
{ // state 401
95,MIN_REDUCTION+0, // $
  }
,
{ // state 402
17,739, // `)
75,384, // ")"
  }
,
{ // state 403
47,445, // letter
48,50, // "p"
49,50, // "v"
50,50, // {"A".."Z" "a" "d" "f".."h" "j".."k" "m".."n" "q".."s" "w" "y".."z"}
51,50, // "b"
52,50, // "e"
53,50, // "t"
54,50, // "c"
55,50, // "i"
56,50, // "l"
57,50, // "o"
58,50, // "u"
59,50, // "x"
60,100, // letter128
61,664, // {199..218 231..250}
62,664, // {193..198 225..230}
63,194, // digit
64,165, // {"1".."9"}
65,165, // "0"
66,826, // digit128
67,250, // {176..185}
83,361, // idChar*
84,131, // $$0
89,357, // idChar
90,785, // "_"
91,452, // idChar128
92,298, // {223}
  }
,
{ // state 404
2,528, // ws*
  }
,
{ // state 405
2,834, // ws*
68,203, // ws
69,643, // " "
70,661, // {10}
MIN_REDUCTION+67, // (default reduction)
  }
,
{ // state 406
0x80000000|468, // match move
0x80000000|354, // no-match move
0x80000000|35, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 407
24,578, // `]
81,118, // "]"
  }
,
{ // state 408
7,174, // ID
8,36, // `{
16,348, // `(
19,139, // <type>
20,593, // `int
21,595, // `boolean
25,792, // <stmt>
26,671, // <assign>
28,23, // <local var decl>
29,154, // `if
30,387, // <exp>
33,741, // <exp8>
34,221, // <exp7>
35,14, // <exp6>
36,19, // <exp5>
37,68, // <exp4>
39,322, // <exp3>
41,56, // <exp2>
42,169, // <cast exp>
43,327, // <unary exp>
44,64, // <exp1>
45,555, // `-
46,311, // INTLIT
47,794, // letter
48,526, // "p"
49,526, // "v"
50,526, // {"A".."Z" "a" "d" "f".."h" "j".."k" "m".."n" "q".."s" "w" "y".."z"}
51,526, // "b"
52,526, // "e"
53,526, // "t"
54,526, // "c"
55,526, // "i"
56,526, // "l"
57,526, // "o"
58,526, // "u"
59,526, // "x"
60,258, // letter128
61,129, // {199..218 231..250}
62,129, // {193..198 225..230}
64,178, // {"1".."9"}
65,699, // "0"
66,386, // digit128
67,816, // {176..185}
71,284, // "#"
74,613, // "("
76,573, // "{"
78,827, // "-"
  }
,
{ // state 409
2,528, // ws*
23,MIN_REDUCTION+93, // `[
68,723, // ws
69,108, // " "
70,21, // {10}
80,MIN_REDUCTION+93, // "["
MIN_REDUCTION+93, // (default reduction)
  }
,
{ // state 410
7,645, // ID
47,79, // letter
48,526, // "p"
49,526, // "v"
50,526, // {"A".."Z" "a" "d" "f".."h" "j".."k" "m".."n" "q".."s" "w" "y".."z"}
51,526, // "b"
52,526, // "e"
53,526, // "t"
54,526, // "c"
55,526, // "i"
56,526, // "l"
57,526, // "o"
58,526, // "u"
59,526, // "x"
60,153, // letter128
61,433, // {199..218 231..250}
62,433, // {193..198 225..230}
  }
,
{ // state 411
2,57, // ws*
68,635, // ws
69,214, // " "
70,233, // {10}
MIN_REDUCTION+63, // (default reduction)
  }
,
{ // state 412
24,582, // `]
81,120, // "]"
  }
,
{ // state 413
2,502, // ws*
  }
,
{ // state 414
2,500, // ws*
  }
,
{ // state 415
MIN_REDUCTION+117, // (default reduction)
  }
,
{ // state 416
24,584, // `]
81,227, // "]"
  }
,
{ // state 417
0x80000000|123, // match move
0x80000000|652, // no-match move
0x80000000|35, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 418
MIN_REDUCTION+45, // (default reduction)
  }
,
{ // state 419
0x80000000|790, // match move
0x80000000|103, // no-match move
0x80000000|734, // NT-test-match state for `else
  }
,
{ // state 420
2,454, // ws*
  }
,
{ // state 421
23,MIN_REDUCTION+82, // `[
68,6, // ws
69,83, // " "
70,81, // {10}
80,MIN_REDUCTION+82, // "["
MIN_REDUCTION+82, // (default reduction)
  }
,
{ // state 422
23,MIN_REDUCTION+103, // `[
80,MIN_REDUCTION+103, // "["
MIN_REDUCTION+103, // (default reduction)
  }
,
{ // state 423
47,445, // letter
48,50, // "p"
49,50, // "v"
50,50, // {"A".."Z" "a" "d" "f".."h" "j".."k" "m".."n" "q".."s" "w" "y".."z"}
51,50, // "b"
52,50, // "e"
53,50, // "t"
54,50, // "c"
55,50, // "i"
56,50, // "l"
57,50, // "o"
58,50, // "u"
59,50, // "x"
60,10, // letter128
61,674, // {199..218 231..250}
62,674, // {193..198 225..230}
63,194, // digit
64,165, // {"1".."9"}
65,165, // "0"
66,835, // digit128
67,222, // {176..185}
83,338, // idChar*
84,86, // $$0
89,357, // idChar
90,785, // "_"
91,496, // idChar128
92,275, // {223}
  }
,
{ // state 424
31,620, // `else
71,316, // "#"
  }
,
{ // state 425
MIN_REDUCTION+107, // (default reduction)
  }
,
{ // state 426
MIN_REDUCTION+88, // (default reduction)
  }
,
{ // state 427
MIN_REDUCTION+10, // (default reduction)
  }
,
{ // state 428
MIN_REDUCTION+99, // (default reduction)
  }
,
{ // state 429
2,502, // ws*
23,MIN_REDUCTION+93, // `[
68,735, // ws
69,95, // " "
70,105, // {10}
80,MIN_REDUCTION+93, // "["
MIN_REDUCTION+93, // (default reduction)
  }
,
{ // state 430
23,MIN_REDUCTION+39, // `[
80,MIN_REDUCTION+39, // "["
MIN_REDUCTION+39, // (default reduction)
  }
,
{ // state 431
2,500, // ws*
23,MIN_REDUCTION+93, // `[
68,732, // ws
69,93, // " "
70,109, // {10}
80,MIN_REDUCTION+93, // "["
MIN_REDUCTION+93, // (default reduction)
  }
,
{ // state 432
68,658, // ws
69,483, // " "
70,802, // {10}
MIN_REDUCTION+48, // (default reduction)
  }
,
{ // state 433
MIN_REDUCTION+43, // (default reduction)
  }
,
{ // state 434
68,47, // ws
69,804, // " "
70,458, // {10}
MIN_REDUCTION+50, // (default reduction)
  }
,
{ // state 435
23,MIN_REDUCTION+82, // `[
68,30, // ws
69,95, // " "
70,105, // {10}
80,MIN_REDUCTION+82, // "["
MIN_REDUCTION+82, // (default reduction)
  }
,
{ // state 436
68,658, // ws
69,483, // " "
70,802, // {10}
MIN_REDUCTION+56, // (default reduction)
  }
,
{ // state 437
23,MIN_REDUCTION+82, // `[
68,29, // ws
69,93, // " "
70,109, // {10}
80,MIN_REDUCTION+82, // "["
MIN_REDUCTION+82, // (default reduction)
  }
,
{ // state 438
63,676, // digit
64,707, // {"1".."9"}
65,707, // "0"
66,819, // digit128
67,818, // {176..185}
86,128, // $$1
  }
,
{ // state 439
23,MIN_REDUCTION+39, // `[
80,MIN_REDUCTION+39, // "["
MIN_REDUCTION+39, // (default reduction)
  }
,
{ // state 440
57,733, // "o"
  }
,
{ // state 441
2,454, // ws*
23,MIN_REDUCTION+93, // `[
68,730, // ws
69,83, // " "
70,81, // {10}
80,MIN_REDUCTION+93, // "["
MIN_REDUCTION+93, // (default reduction)
  }
,
{ // state 442
63,676, // digit
64,707, // {"1".."9"}
65,707, // "0"
66,815, // digit128
67,816, // {176..185}
86,126, // $$1
  }
,
{ // state 443
23,MIN_REDUCTION+39, // `[
80,MIN_REDUCTION+39, // "["
MIN_REDUCTION+39, // (default reduction)
  }
,
{ // state 444
24,761, // `]
81,142, // "]"
  }
,
{ // state 445
MIN_REDUCTION+96, // (default reduction)
  }
,
{ // state 446
63,676, // digit
64,707, // {"1".."9"}
65,707, // "0"
66,824, // digit128
67,811, // {176..185}
86,163, // $$1
  }
,
{ // state 447
23,MIN_REDUCTION+39, // `[
80,MIN_REDUCTION+39, // "["
MIN_REDUCTION+39, // (default reduction)
  }
,
{ // state 448
23,MIN_REDUCTION+95, // `[
80,MIN_REDUCTION+95, // "["
MIN_REDUCTION+95, // (default reduction)
  }
,
{ // state 449
MIN_REDUCTION+35, // (default reduction)
  }
,
{ // state 450
23,687, // `[
80,254, // "["
MIN_REDUCTION+38, // (default reduction)
  }
,
{ // state 451
2,601, // ws*
68,345, // ws
69,61, // " "
70,753, // {10}
MIN_REDUCTION+85, // (default reduction)
  }
,
{ // state 452
2,267, // ws*
68,505, // ws
69,241, // " "
70,189, // {10}
MIN_REDUCTION+119, // (default reduction)
  }
,
{ // state 453
23,MIN_REDUCTION+120, // `[
68,38, // ws
69,108, // " "
70,21, // {10}
80,MIN_REDUCTION+120, // "["
MIN_REDUCTION+120, // (default reduction)
  }
,
{ // state 454
0x80000000|1, // match move
0x80000000|359, // no-match move
0x80000000|35, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 455
2,749, // ws*
68,508, // ws
69,239, // " "
70,188, // {10}
MIN_REDUCTION+67, // (default reduction)
  }
,
{ // state 456
23,MIN_REDUCTION+99, // `[
80,MIN_REDUCTION+99, // "["
MIN_REDUCTION+99, // (default reduction)
  }
,
{ // state 457
MIN_REDUCTION+46, // (default reduction)
  }
,
{ // state 458
MIN_REDUCTION+47, // (default reduction)
  }
,
{ // state 459
MIN_REDUCTION+101, // (default reduction)
  }
,
{ // state 460
MIN_REDUCTION+117, // (default reduction)
  }
,
{ // state 461
MIN_REDUCTION+117, // (default reduction)
  }
,
{ // state 462
23,MIN_REDUCTION+82, // `[
68,38, // ws
69,108, // " "
70,21, // {10}
80,MIN_REDUCTION+82, // "["
MIN_REDUCTION+82, // (default reduction)
  }
,
{ // state 463
-1, // $$start
-1, // <start>
-1, // ws*
-1, // <program>
-1, // <class decl>+
-1, // <class decl>
-1, // `class
174, // ID
463, // `{
-1, // <decl in class>*
585, // `}
-1, // `extends
-1, // <decl in class>
-1, // <method decl>
-1, // `public
-1, // `void
348, // `(
-1, // `)
115, // <stmt>*
139, // <type>
593, // `int
595, // `boolean
-1, // <empty bracket pair>
-1, // `[
-1, // `]
821, // <stmt>
612, // <assign>
-1, // `;
273, // <local var decl>
836, // `if
387, // <exp>
-1, // `else
-1, // `=
741, // <exp8>
221, // <exp7>
14, // <exp6>
19, // <exp5>
68, // <exp4>
-1, // `+
322, // <exp3>
-1, // `*
56, // <exp2>
169, // <cast exp>
327, // <unary exp>
64, // <exp1>
555, // `-
311, // INTLIT
794, // letter
526, // "p"
526, // "v"
526, // {"A".."Z" "a" "d" "f".."h" "j".."k" "m".."n" "q".."s" "w" "y".."z"}
526, // "b"
526, // "e"
526, // "t"
526, // "c"
526, // "i"
526, // "l"
526, // "o"
526, // "u"
526, // "x"
258, // letter128
129, // {199..218 231..250}
129, // {193..198 225..230}
-1, // digit
178, // {"1".."9"}
699, // "0"
386, // digit128
816, // {176..185}
-1, // ws
-1, // " "
-1, // {10}
284, // "#"
-1, // "+"
-1, // "*"
613, // "("
-1, // ")"
573, // "{"
395, // "}"
827, // "-"
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
{ // state 464
0x80000000|237, // match move
0x80000000|97, // no-match move
0x80000000|35, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 465
56,809, // "l"
  }
,
{ // state 466
16,107, // `(
74,455, // "("
  }
,
{ // state 467
23,MIN_REDUCTION+99, // `[
80,MIN_REDUCTION+99, // "["
MIN_REDUCTION+99, // (default reduction)
  }
,
{ // state 468
2,740, // ws*
  }
,
{ // state 469
2,175, // ws*
68,624, // ws
69,641, // " "
70,223, // {10}
96,MIN_REDUCTION+61, // $NT
  }
,
{ // state 470
68,MIN_REDUCTION+47, // ws
69,MIN_REDUCTION+47, // " "
70,MIN_REDUCTION+47, // {10}
MIN_REDUCTION+47, // (default reduction)
  }
,
{ // state 471
23,MIN_REDUCTION+99, // `[
80,MIN_REDUCTION+99, // "["
MIN_REDUCTION+99, // (default reduction)
  }
,
{ // state 472
MIN_REDUCTION+46, // (default reduction)
  }
,
{ // state 473
57,727, // "o"
  }
,
{ // state 474
0x80000000|775, // match move
0x80000000|617, // no-match move
0x80000000|35, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 475
0x80000000|507, // match move
0x80000000|390, // no-match move
0x80000000|35, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 476
96,MIN_REDUCTION+15, // $NT
  }
,
{ // state 477
MIN_REDUCTION+117, // (default reduction)
  }
,
{ // state 478
0x80000000|237, // match move
0x80000000|765, // no-match move
0x80000000|35, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 479
0x80000000|237, // match move
0x80000000|114, // no-match move
0x80000000|35, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 480
48,686, // "p"
49,686, // "v"
50,686, // {"A".."Z" "a" "d" "f".."h" "j".."k" "m".."n" "q".."s" "w" "y".."z"}
51,686, // "b"
52,686, // "e"
53,686, // "t"
54,686, // "c"
55,686, // "i"
56,686, // "l"
57,686, // "o"
58,686, // "u"
59,686, // "x"
62,49, // {193..198 225..230}
64,686, // {"1".."9"}
65,686, // "0"
67,49, // {176..185}
88,330, // $$2
93,504, // hexDigit
94,406, // hexDigit128
  }
,
{ // state 481
0x80000000|570, // match move
0x80000000|312, // no-match move
0x80000000|734, // NT-test-match state for `else
  }
,
{ // state 482
23,MIN_REDUCTION+46, // `[
80,MIN_REDUCTION+46, // "["
MIN_REDUCTION+46, // (default reduction)
  }
,
{ // state 483
MIN_REDUCTION+46, // (default reduction)
  }
,
{ // state 484
23,MIN_REDUCTION+100, // `[
80,MIN_REDUCTION+100, // "["
MIN_REDUCTION+100, // (default reduction)
  }
,
{ // state 485
23,MIN_REDUCTION+99, // `[
80,MIN_REDUCTION+99, // "["
MIN_REDUCTION+99, // (default reduction)
  }
,
{ // state 486
0x80000000|487, // match move
0x80000000|378, // no-match move
0x80000000|35, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 487
2,714, // ws*
  }
,
{ // state 488
MIN_REDUCTION+15, // (default reduction)
  }
,
{ // state 489
0x80000000|237, // match move
0x80000000|769, // no-match move
0x80000000|35, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 490
MIN_REDUCTION+45, // (default reduction)
  }
,
{ // state 491
68,MIN_REDUCTION+116, // ws
69,MIN_REDUCTION+116, // " "
70,MIN_REDUCTION+116, // {10}
MIN_REDUCTION+116, // (default reduction)
  }
,
{ // state 492
0x80000000|817, // match move
0x80000000|451, // no-match move
0x80000000|734, // NT-test-match state for `else
  }
,
{ // state 493
27,262, // `;
82,122, // ";"
  }
,
{ // state 494
0x80000000|495, // match move
0x80000000|377, // no-match move
0x80000000|35, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 495
2,716, // ws*
  }
,
{ // state 496
2,236, // ws*
68,477, // ws
69,260, // " "
70,149, // {10}
MIN_REDUCTION+119, // (default reduction)
  }
,
{ // state 497
23,700, // `[
80,254, // "["
MIN_REDUCTION+38, // (default reduction)
  }
,
{ // state 498
MIN_REDUCTION+35, // (default reduction)
  }
,
{ // state 499
MIN_REDUCTION+7, // (default reduction)
  }
,
{ // state 500
0x80000000|1, // match move
0x80000000|304, // no-match move
0x80000000|35, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 501
MIN_REDUCTION+35, // (default reduction)
  }
,
{ // state 502
0x80000000|1, // match move
0x80000000|313, // no-match move
0x80000000|35, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 503
47,445, // letter
48,50, // "p"
49,50, // "v"
50,50, // {"A".."Z" "a" "d" "f".."h" "j".."k" "m".."n" "q".."s" "w" "y".."z"}
51,50, // "b"
52,50, // "e"
53,50, // "t"
54,50, // "c"
55,50, // "i"
56,50, // "l"
57,50, // "o"
58,50, // "u"
59,50, // "x"
60,764, // letter128
61,464, // {199..218 231..250}
62,464, // {193..198 225..230}
63,194, // digit
64,165, // {"1".."9"}
65,165, // "0"
66,511, // digit128
67,829, // {176..185}
83,77, // idChar*
84,218, // $$0
89,357, // idChar
90,785, // "_"
91,91, // idChar128
92,606, // {223}
  }
,
{ // state 504
MIN_REDUCTION+108, // (default reduction)
  }
,
{ // state 505
MIN_REDUCTION+117, // (default reduction)
  }
,
{ // state 506
7,152, // ID
16,321, // `(
30,117, // <exp>
33,675, // <exp8>
34,212, // <exp7>
35,28, // <exp6>
36,26, // <exp5>
37,111, // <exp4>
39,281, // <exp3>
41,9, // <exp2>
42,229, // <cast exp>
43,340, // <unary exp>
44,150, // <exp1>
45,556, // `-
46,318, // INTLIT
47,662, // letter
48,526, // "p"
49,526, // "v"
50,526, // {"A".."Z" "a" "d" "f".."h" "j".."k" "m".."n" "q".."s" "w" "y".."z"}
51,526, // "b"
52,526, // "e"
53,526, // "t"
54,526, // "c"
55,526, // "i"
56,526, // "l"
57,526, // "o"
58,526, // "u"
59,526, // "x"
60,822, // letter128
61,489, // {199..218 231..250}
62,489, // {193..198 225..230}
64,201, // {"1".."9"}
65,717, // "0"
66,392, // digit128
67,811, // {176..185}
74,613, // "("
78,827, // "-"
  }
,
{ // state 507
2,696, // ws*
  }
,
{ // state 508
MIN_REDUCTION+117, // (default reduction)
  }
,
{ // state 509
23,MIN_REDUCTION+116, // `[
80,MIN_REDUCTION+116, // "["
MIN_REDUCTION+116, // (default reduction)
  }
,
{ // state 510
23,695, // `[
80,254, // "["
MIN_REDUCTION+38, // (default reduction)
  }
,
{ // state 511
0x80000000|332, // match move
0x80000000|823, // no-match move
0x80000000|35, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 512
MIN_REDUCTION+35, // (default reduction)
  }
,
{ // state 513
7,144, // ID
16,352, // `(
42,498, // <cast exp>
44,677, // <exp1>
46,314, // INTLIT
47,623, // letter
48,526, // "p"
49,526, // "v"
50,526, // {"A".."Z" "a" "d" "f".."h" "j".."k" "m".."n" "q".."s" "w" "y".."z"}
51,526, // "b"
52,526, // "e"
53,526, // "t"
54,526, // "c"
55,526, // "i"
56,526, // "l"
57,526, // "o"
58,526, // "u"
59,526, // "x"
60,787, // letter128
61,478, // {199..218 231..250}
62,478, // {193..198 225..230}
64,180, // {"1".."9"}
65,697, // "0"
66,388, // digit128
67,818, // {176..185}
74,613, // "("
  }
,
{ // state 514
MIN_REDUCTION+17, // (default reduction)
  }
,
{ // state 515
MIN_REDUCTION+46, // (default reduction)
  }
,
{ // state 516
0x80000000|332, // match move
0x80000000|796, // no-match move
0x80000000|35, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 517
MIN_REDUCTION+116, // (default reduction)
  }
,
{ // state 518
MIN_REDUCTION+47, // (default reduction)
  }
,
{ // state 519
2,704, // ws*
23,MIN_REDUCTION+87, // `[
68,730, // ws
69,83, // " "
70,81, // {10}
80,MIN_REDUCTION+87, // "["
MIN_REDUCTION+87, // (default reduction)
  }
,
{ // state 520
23,MIN_REDUCTION+89, // `[
80,MIN_REDUCTION+89, // "["
MIN_REDUCTION+89, // (default reduction)
  }
,
{ // state 521
0x80000000|660, // match move
0x80000000|181, // no-match move
0x80000000|35, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 522
0x80000000|332, // match move
0x80000000|782, // no-match move
0x80000000|35, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 523
23,MIN_REDUCTION+89, // `[
80,MIN_REDUCTION+89, // "["
MIN_REDUCTION+89, // (default reduction)
  }
,
{ // state 524
0x80000000|660, // match move
0x80000000|183, // no-match move
0x80000000|35, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 525
0x80000000|332, // match move
0x80000000|784, // no-match move
0x80000000|35, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 526
MIN_REDUCTION+42, // (default reduction)
  }
,
{ // state 527
MIN_REDUCTION+89, // (default reduction)
  }
,
{ // state 528
0x80000000|1, // match move
0x80000000|270, // no-match move
0x80000000|35, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 529
2,655, // ws*
MIN_REDUCTION+73, // (default reduction)
  }
,
{ // state 530
68,211, // ws
69,797, // " "
70,518, // {10}
MIN_REDUCTION+72, // (default reduction)
  }
,
{ // state 531
MIN_REDUCTION+9, // (default reduction)
  }
,
{ // state 532
48,686, // "p"
49,686, // "v"
50,686, // {"A".."Z" "a" "d" "f".."h" "j".."k" "m".."n" "q".."s" "w" "y".."z"}
51,686, // "b"
52,686, // "e"
53,686, // "t"
54,686, // "c"
55,686, // "i"
56,686, // "l"
57,686, // "o"
58,686, // "u"
59,686, // "x"
62,172, // {193..198 225..230}
64,686, // {"1".."9"}
65,686, // "0"
67,172, // {176..185}
88,351, // $$2
93,504, // hexDigit
94,494, // hexDigit128
  }
,
{ // state 533
0x80000000|660, // match move
0x80000000|220, // no-match move
0x80000000|35, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 534
48,686, // "p"
49,686, // "v"
50,686, // {"A".."Z" "a" "d" "f".."h" "j".."k" "m".."n" "q".."s" "w" "y".."z"}
51,686, // "b"
52,686, // "e"
53,686, // "t"
54,686, // "c"
55,686, // "i"
56,686, // "l"
57,686, // "o"
58,686, // "u"
59,686, // "x"
62,168, // {193..198 225..230}
64,686, // {"1".."9"}
65,686, // "0"
67,168, // {176..185}
88,353, // $$2
93,504, // hexDigit
94,486, // hexDigit128
  }
,
{ // state 535
MIN_REDUCTION+47, // (default reduction)
  }
,
{ // state 536
68,110, // ws
69,643, // " "
70,661, // {10}
MIN_REDUCTION+80, // (default reduction)
  }
,
{ // state 537
2,621, // ws*
23,MIN_REDUCTION+87, // `[
68,732, // ws
69,93, // " "
70,109, // {10}
80,MIN_REDUCTION+87, // "["
MIN_REDUCTION+87, // (default reduction)
  }
,
{ // state 538
2,548, // ws*
68,257, // ws
69,748, // " "
70,306, // {10}
MIN_REDUCTION+119, // (default reduction)
  }
,
{ // state 539
2,619, // ws*
23,MIN_REDUCTION+87, // `[
68,735, // ws
69,95, // " "
70,105, // {10}
80,MIN_REDUCTION+87, // "["
MIN_REDUCTION+87, // (default reduction)
  }
,
{ // state 540
54,287, // "c"
  }
,
{ // state 541
48,686, // "p"
49,686, // "v"
50,686, // {"A".."Z" "a" "d" "f".."h" "j".."k" "m".."n" "q".."s" "w" "y".."z"}
51,686, // "b"
52,686, // "e"
53,686, // "t"
54,686, // "c"
55,686, // "i"
56,686, // "l"
57,686, // "o"
58,686, // "u"
59,686, // "x"
62,179, // {193..198 225..230}
64,686, // {"1".."9"}
65,686, // "0"
67,179, // {176..185}
88,309, // $$2
93,504, // hexDigit
94,475, // hexDigit128
  }
,
{ // state 542
23,MIN_REDUCTION+118, // `[
68,38, // ws
69,108, // " "
70,21, // {10}
80,MIN_REDUCTION+118, // "["
MIN_REDUCTION+118, // (default reduction)
  }
,
{ // state 543
23,MIN_REDUCTION+89, // `[
80,MIN_REDUCTION+89, // "["
MIN_REDUCTION+89, // (default reduction)
  }
,
{ // state 544
23,679, // `[
80,254, // "["
MIN_REDUCTION+38, // (default reduction)
  }
,
{ // state 545
7,146, // ID
16,348, // `(
42,501, // <cast exp>
44,678, // <exp1>
46,311, // INTLIT
47,625, // letter
48,526, // "p"
49,526, // "v"
50,526, // {"A".."Z" "a" "d" "f".."h" "j".."k" "m".."n" "q".."s" "w" "y".."z"}
51,526, // "b"
52,526, // "e"
53,526, // "t"
54,526, // "c"
55,526, // "i"
56,526, // "l"
57,526, // "o"
58,526, // "u"
59,526, // "x"
60,786, // letter128
61,479, // {199..218 231..250}
62,479, // {193..198 225..230}
64,178, // {"1".."9"}
65,699, // "0"
66,386, // digit128
67,816, // {176..185}
74,613, // "("
  }
,
{ // state 546
MIN_REDUCTION+46, // (default reduction)
  }
,
{ // state 547
10,719, // `}
12,247, // <decl in class>
13,141, // <method decl>
14,209, // `public
71,800, // "#"
77,15, // "}"
  }
,
{ // state 548
68,586, // ws
69,748, // " "
70,306, // {10}
MIN_REDUCTION+118, // (default reduction)
  }
,
{ // state 549
MIN_REDUCTION+110, // (default reduction)
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
{ // state 550
MIN_REDUCTION+117, // (default reduction)
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
174, // ID
463, // `{
-1, // <decl in class>*
366, // `}
-1, // `extends
-1, // <decl in class>
-1, // <method decl>
-1, // `public
-1, // `void
348, // `(
-1, // `)
-1, // <stmt>*
139, // <type>
593, // `int
595, // `boolean
-1, // <empty bracket pair>
-1, // `[
-1, // `]
549, // <stmt>
612, // <assign>
-1, // `;
273, // <local var decl>
836, // `if
387, // <exp>
-1, // `else
-1, // `=
741, // <exp8>
221, // <exp7>
14, // <exp6>
19, // <exp5>
68, // <exp4>
-1, // `+
322, // <exp3>
-1, // `*
56, // <exp2>
169, // <cast exp>
327, // <unary exp>
64, // <exp1>
555, // `-
311, // INTLIT
794, // letter
526, // "p"
526, // "v"
526, // {"A".."Z" "a" "d" "f".."h" "j".."k" "m".."n" "q".."s" "w" "y".."z"}
526, // "b"
526, // "e"
526, // "t"
526, // "c"
526, // "i"
526, // "l"
526, // "o"
526, // "u"
526, // "x"
258, // letter128
129, // {199..218 231..250}
129, // {193..198 225..230}
-1, // digit
178, // {"1".."9"}
699, // "0"
386, // digit128
816, // {176..185}
-1, // ws
-1, // " "
-1, // {10}
284, // "#"
-1, // "+"
-1, // "*"
613, // "("
-1, // ")"
573, // "{"
344, // "}"
827, // "-"
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
-1, // $$start
-1, // <start>
-1, // ws*
-1, // <program>
-1, // <class decl>+
-1, // <class decl>
-1, // `class
174, // ID
463, // `{
-1, // <decl in class>*
427, // `}
-1, // `extends
-1, // <decl in class>
-1, // <method decl>
-1, // `public
-1, // `void
348, // `(
-1, // `)
379, // <stmt>*
139, // <type>
593, // `int
595, // `boolean
-1, // <empty bracket pair>
-1, // `[
-1, // `]
821, // <stmt>
612, // <assign>
-1, // `;
273, // <local var decl>
836, // `if
387, // <exp>
-1, // `else
-1, // `=
741, // <exp8>
221, // <exp7>
14, // <exp6>
19, // <exp5>
68, // <exp4>
-1, // `+
322, // <exp3>
-1, // `*
56, // <exp2>
169, // <cast exp>
327, // <unary exp>
64, // <exp1>
555, // `-
311, // INTLIT
794, // letter
526, // "p"
526, // "v"
526, // {"A".."Z" "a" "d" "f".."h" "j".."k" "m".."n" "q".."s" "w" "y".."z"}
526, // "b"
526, // "e"
526, // "t"
526, // "c"
526, // "i"
526, // "l"
526, // "o"
526, // "u"
526, // "x"
258, // letter128
129, // {199..218 231..250}
129, // {193..198 225..230}
-1, // digit
178, // {"1".."9"}
699, // "0"
386, // digit128
816, // {176..185}
-1, // ws
-1, // " "
-1, // {10}
284, // "#"
-1, // "+"
-1, // "*"
613, // "("
-1, // ")"
573, // "{"
571, // "}"
827, // "-"
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
{ // state 553
7,144, // ID
43,842, // <unary exp>
44,75, // <exp1>
45,553, // `-
46,314, // INTLIT
47,623, // letter
48,526, // "p"
49,526, // "v"
50,526, // {"A".."Z" "a" "d" "f".."h" "j".."k" "m".."n" "q".."s" "w" "y".."z"}
51,526, // "b"
52,526, // "e"
53,526, // "t"
54,526, // "c"
55,526, // "i"
56,526, // "l"
57,526, // "o"
58,526, // "u"
59,526, // "x"
60,787, // letter128
61,478, // {199..218 231..250}
62,478, // {193..198 225..230}
64,180, // {"1".."9"}
65,697, // "0"
66,388, // digit128
67,818, // {176..185}
78,827, // "-"
  }
,
{ // state 554
2,228, // ws*
68,550, // ws
69,483, // " "
70,802, // {10}
MIN_REDUCTION+83, // (default reduction)
  }
,
{ // state 555
7,146, // ID
43,839, // <unary exp>
44,64, // <exp1>
45,555, // `-
46,311, // INTLIT
47,625, // letter
48,526, // "p"
49,526, // "v"
50,526, // {"A".."Z" "a" "d" "f".."h" "j".."k" "m".."n" "q".."s" "w" "y".."z"}
51,526, // "b"
52,526, // "e"
53,526, // "t"
54,526, // "c"
55,526, // "i"
56,526, // "l"
57,526, // "o"
58,526, // "u"
59,526, // "x"
60,786, // letter128
61,479, // {199..218 231..250}
62,479, // {193..198 225..230}
64,178, // {"1".."9"}
65,699, // "0"
66,386, // digit128
67,816, // {176..185}
78,827, // "-"
  }
,
{ // state 556
7,152, // ID
43,684, // <unary exp>
44,150, // <exp1>
45,556, // `-
46,318, // INTLIT
47,662, // letter
48,526, // "p"
49,526, // "v"
50,526, // {"A".."Z" "a" "d" "f".."h" "j".."k" "m".."n" "q".."s" "w" "y".."z"}
51,526, // "b"
52,526, // "e"
53,526, // "t"
54,526, // "c"
55,526, // "i"
56,526, // "l"
57,526, // "o"
58,526, // "u"
59,526, // "x"
60,822, // letter128
61,489, // {199..218 231..250}
62,489, // {193..198 225..230}
64,201, // {"1".."9"}
65,717, // "0"
66,392, // digit128
67,811, // {176..185}
78,827, // "-"
  }
,
{ // state 557
2,307, // ws*
68,460, // ws
69,299, // " "
70,124, // {10}
MIN_REDUCTION+119, // (default reduction)
  }
,
{ // state 558
23,MIN_REDUCTION+117, // `[
80,MIN_REDUCTION+117, // "["
MIN_REDUCTION+117, // (default reduction)
  }
,
{ // state 559
MIN_REDUCTION+21, // (default reduction)
  }
,
{ // state 560
MIN_REDUCTION+103, // (default reduction)
  }
,
{ // state 561
23,MIN_REDUCTION+117, // `[
80,MIN_REDUCTION+117, // "["
MIN_REDUCTION+117, // (default reduction)
  }
,
{ // state 562
7,157, // ID
43,848, // <unary exp>
44,87, // <exp1>
45,562, // `-
46,302, // INTLIT
47,503, // letter
48,526, // "p"
49,526, // "v"
50,526, // {"A".."Z" "a" "d" "f".."h" "j".."k" "m".."n" "q".."s" "w" "y".."z"}
51,526, // "b"
52,526, // "e"
53,526, // "t"
54,526, // "c"
55,526, // "i"
56,526, // "l"
57,526, // "o"
58,526, // "u"
59,526, // "x"
60,767, // letter128
61,464, // {199..218 231..250}
62,464, // {193..198 225..230}
64,148, // {"1".."9"}
65,666, // "0"
66,374, // digit128
67,829, // {176..185}
78,827, // "-"
  }
,
{ // state 563
MIN_REDUCTION+47, // (default reduction)
  }
,
{ // state 564
MIN_REDUCTION+116, // (default reduction)
  }
,
{ // state 565
0x80000000|315, // match move
0x80000000|509, // no-match move
0x80000000|35, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 566
23,MIN_REDUCTION+117, // `[
80,MIN_REDUCTION+117, // "["
MIN_REDUCTION+117, // (default reduction)
  }
,
{ // state 567
MIN_REDUCTION+101, // (default reduction)
  }
,
{ // state 568
23,MIN_REDUCTION+117, // `[
80,MIN_REDUCTION+117, // "["
MIN_REDUCTION+117, // (default reduction)
  }
,
{ // state 569
7,157, // ID
16,255, // `(
42,449, // <cast exp>
44,705, // <exp1>
46,302, // INTLIT
47,503, // letter
48,526, // "p"
49,526, // "v"
50,526, // {"A".."Z" "a" "d" "f".."h" "j".."k" "m".."n" "q".."s" "w" "y".."z"}
51,526, // "b"
52,526, // "e"
53,526, // "t"
54,526, // "c"
55,526, // "i"
56,526, // "l"
57,526, // "o"
58,526, // "u"
59,526, // "x"
60,767, // letter128
61,464, // {199..218 231..250}
62,464, // {193..198 225..230}
64,148, // {"1".."9"}
65,666, // "0"
66,374, // digit128
67,829, // {176..185}
74,613, // "("
  }
,
{ // state 570
MIN_REDUCTION+84, // (default reduction)
  }
,
{ // state 571
2,530, // ws*
68,101, // ws
69,797, // " "
70,518, // {10}
MIN_REDUCTION+73, // (default reduction)
  }
,
{ // state 572
MIN_REDUCTION+2, // (default reduction)
  }
,
{ // state 573
2,773, // ws*
68,628, // ws
69,472, // " "
70,843, // {10}
MIN_REDUCTION+71, // (default reduction)
  }
,
{ // state 574
23,MIN_REDUCTION+47, // `[
80,MIN_REDUCTION+47, // "["
MIN_REDUCTION+47, // (default reduction)
  }
,
{ // state 575
MIN_REDUCTION+47, // (default reduction)
  }
,
{ // state 576
23,MIN_REDUCTION+118, // `[
68,6, // ws
69,83, // " "
70,81, // {10}
80,MIN_REDUCTION+118, // "["
MIN_REDUCTION+118, // (default reduction)
  }
,
{ // state 577
23,MIN_REDUCTION+47, // `[
80,MIN_REDUCTION+47, // "["
MIN_REDUCTION+47, // (default reduction)
  }
,
{ // state 578
0x80000000|1, // match move
0x80000000|849, // no-match move
0x80000000|35, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 579
2,632, // ws*
68,461, // ws
69,274, // " "
70,162, // {10}
MIN_REDUCTION+81, // (default reduction)
  }
,
{ // state 580
23,MIN_REDUCTION+47, // `[
80,MIN_REDUCTION+47, // "["
MIN_REDUCTION+47, // (default reduction)
  }
,
{ // state 581
52,396, // "e"
  }
,
{ // state 582
0x80000000|1, // match move
0x80000000|850, // no-match move
0x80000000|35, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 583
3,840, // <program>
4,615, // <class decl>+
5,703, // <class decl>
6,410, // `class
68,193, // ws
69,546, // " "
70,575, // {10}
71,540, // "#"
  }
,
{ // state 584
0x80000000|1, // match move
0x80000000|812, // no-match move
0x80000000|35, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 585
MIN_REDUCTION+18, // (default reduction)
  }
,
{ // state 586
MIN_REDUCTION+116, // (default reduction)
  }
,
{ // state 587
68,389, // ws
69,299, // " "
70,124, // {10}
MIN_REDUCTION+68, // (default reduction)
  }
,
{ // state 588
MIN_REDUCTION+89, // (default reduction)
  }
,
{ // state 589
2,45, // ws*
68,708, // ws
69,654, // " "
70,642, // {10}
MIN_REDUCTION+85, // (default reduction)
  }
,
{ // state 590
23,MIN_REDUCTION+86, // `[
68,565, // ws
69,11, // " "
70,69, // {10}
80,MIN_REDUCTION+86, // "["
MIN_REDUCTION+86, // (default reduction)
  }
,
{ // state 591
23,MIN_REDUCTION+118, // `[
68,565, // ws
69,11, // " "
70,69, // {10}
80,MIN_REDUCTION+118, // "["
MIN_REDUCTION+118, // (default reduction)
  }
,
{ // state 592
68,230, // ws
69,742, // " "
70,563, // {10}
MIN_REDUCTION+66, // (default reduction)
  }
,
{ // state 593
MIN_REDUCTION+11, // (default reduction)
  }
,
{ // state 594
27,795, // `;
82,122, // ";"
  }
,
{ // state 595
MIN_REDUCTION+12, // (default reduction)
  }
,
{ // state 596
MIN_REDUCTION+117, // (default reduction)
  }
,
{ // state 597
2,650, // ws*
23,MIN_REDUCTION+87, // `[
68,723, // ws
69,108, // " "
70,21, // {10}
80,MIN_REDUCTION+87, // "["
MIN_REDUCTION+87, // (default reduction)
  }
,
{ // state 598
MIN_REDUCTION+47, // (default reduction)
  }
,
{ // state 599
23,MIN_REDUCTION+89, // `[
80,MIN_REDUCTION+89, // "["
MIN_REDUCTION+89, // (default reduction)
  }
,
{ // state 600
68,668, // ws
69,759, // " "
70,535, // {10}
MIN_REDUCTION+118, // (default reduction)
  }
,
{ // state 601
0x80000000|570, // match move
0x80000000|640, // no-match move
0x80000000|734, // NT-test-match state for `else
  }
,
{ // state 602
23,MIN_REDUCTION+118, // `[
68,30, // ws
69,95, // " "
70,105, // {10}
80,MIN_REDUCTION+118, // "["
MIN_REDUCTION+118, // (default reduction)
  }
,
{ // state 603
23,MIN_REDUCTION+47, // `[
80,MIN_REDUCTION+47, // "["
MIN_REDUCTION+47, // (default reduction)
  }
,
{ // state 604
MIN_REDUCTION+99, // (default reduction)
  }
,
{ // state 605
23,MIN_REDUCTION+118, // `[
68,29, // ws
69,93, // " "
70,109, // {10}
80,MIN_REDUCTION+118, // "["
MIN_REDUCTION+118, // (default reduction)
  }
,
{ // state 606
0x80000000|660, // match move
0x80000000|200, // no-match move
0x80000000|35, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 607
68,393, // ws
69,260, // " "
70,149, // {10}
MIN_REDUCTION+86, // (default reduction)
  }
,
{ // state 608
MIN_REDUCTION+23, // (default reduction)
  }
,
{ // state 609
MIN_REDUCTION+21, // (default reduction)
  }
,
{ // state 610
68,370, // ws
69,241, // " "
70,189, // {10}
MIN_REDUCTION+86, // (default reduction)
  }
,
{ // state 611
MIN_REDUCTION+45, // (default reduction)
  }
,
{ // state 612
27,156, // `;
82,589, // ";"
  }
,
{ // state 613
2,592, // ws*
68,74, // ws
69,742, // " "
70,563, // {10}
MIN_REDUCTION+67, // (default reduction)
  }
,
{ // state 614
MIN_REDUCTION+46, // (default reduction)
  }
,
{ // state 615
5,147, // <class decl>
6,410, // `class
71,540, // "#"
MIN_REDUCTION+3, // (default reduction)
  }
,
{ // state 616
53,745, // "t"
  }
,
{ // state 617
23,MIN_REDUCTION+88, // `[
80,MIN_REDUCTION+88, // "["
MIN_REDUCTION+88, // (default reduction)
  }
,
{ // state 618
MIN_REDUCTION+116, // (default reduction)
  }
,
{ // state 619
0x80000000|1, // match move
0x80000000|204, // no-match move
0x80000000|35, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 620
7,174, // ID
8,37, // `{
16,348, // `(
19,139, // <type>
20,593, // `int
21,595, // `boolean
25,792, // <stmt>
26,594, // <assign>
28,493, // <local var decl>
29,852, // `if
30,387, // <exp>
33,741, // <exp8>
34,221, // <exp7>
35,14, // <exp6>
36,19, // <exp5>
37,68, // <exp4>
39,322, // <exp3>
41,56, // <exp2>
42,169, // <cast exp>
43,327, // <unary exp>
44,64, // <exp1>
45,555, // `-
46,311, // INTLIT
47,794, // letter
48,526, // "p"
49,526, // "v"
50,526, // {"A".."Z" "a" "d" "f".."h" "j".."k" "m".."n" "q".."s" "w" "y".."z"}
51,526, // "b"
52,526, // "e"
53,526, // "t"
54,526, // "c"
55,526, // "i"
56,526, // "l"
57,526, // "o"
58,526, // "u"
59,526, // "x"
60,258, // letter128
61,129, // {199..218 231..250}
62,129, // {193..198 225..230}
64,178, // {"1".."9"}
65,699, // "0"
66,386, // digit128
67,816, // {176..185}
71,284, // "#"
74,613, // "("
76,573, // "{"
78,827, // "-"
  }
,
{ // state 621
0x80000000|1, // match move
0x80000000|190, // no-match move
0x80000000|35, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 622
2,481, // ws*
68,345, // ws
69,61, // " "
70,753, // {10}
MIN_REDUCTION+85, // (default reduction)
  }
,
{ // state 623
47,445, // letter
48,50, // "p"
49,50, // "v"
50,50, // {"A".."Z" "a" "d" "f".."h" "j".."k" "m".."n" "q".."s" "w" "y".."z"}
51,50, // "b"
52,50, // "e"
53,50, // "t"
54,50, // "c"
55,50, // "i"
56,50, // "l"
57,50, // "o"
58,50, // "u"
59,50, // "x"
60,672, // letter128
61,478, // {199..218 231..250}
62,478, // {193..198 225..230}
63,194, // digit
64,165, // {"1".."9"}
65,165, // "0"
66,522, // digit128
67,818, // {176..185}
83,96, // idChar*
84,206, // $$0
89,357, // idChar
90,785, // "_"
91,12, // idChar128
92,521, // {223}
  }
,
{ // state 624
96,MIN_REDUCTION+117, // $NT
MIN_REDUCTION+117, // (default reduction)
  }
,
{ // state 625
47,445, // letter
48,50, // "p"
49,50, // "v"
50,50, // {"A".."Z" "a" "d" "f".."h" "j".."k" "m".."n" "q".."s" "w" "y".."z"}
51,50, // "b"
52,50, // "e"
53,50, // "t"
54,50, // "c"
55,50, // "i"
56,50, // "l"
57,50, // "o"
58,50, // "u"
59,50, // "x"
60,670, // letter128
61,479, // {199..218 231..250}
62,479, // {193..198 225..230}
63,194, // digit
64,165, // {"1".."9"}
65,165, // "0"
66,525, // digit128
67,816, // {176..185}
83,94, // idChar*
84,205, // $$0
89,357, // idChar
90,785, // "_"
91,17, // idChar128
92,524, // {223}
  }
,
{ // state 626
MIN_REDUCTION+47, // (default reduction)
  }
,
{ // state 627
23,MIN_REDUCTION+120, // `[
68,6, // ws
69,83, // " "
70,81, // {10}
80,MIN_REDUCTION+120, // "["
MIN_REDUCTION+120, // (default reduction)
  }
,
{ // state 628
MIN_REDUCTION+117, // (default reduction)
  }
,
{ // state 629
23,MIN_REDUCTION+116, // `[
80,MIN_REDUCTION+116, // "["
MIN_REDUCTION+116, // (default reduction)
  }
,
{ // state 630
2,104, // ws*
68,376, // ws
69,804, // " "
70,458, // {10}
MIN_REDUCTION+53, // (default reduction)
  }
,
{ // state 631
7,152, // ID
16,321, // `(
30,402, // <exp>
33,675, // <exp8>
34,212, // <exp7>
35,28, // <exp6>
36,26, // <exp5>
37,111, // <exp4>
39,281, // <exp3>
41,9, // <exp2>
42,229, // <cast exp>
43,340, // <unary exp>
44,150, // <exp1>
45,556, // `-
46,318, // INTLIT
47,662, // letter
48,526, // "p"
49,526, // "v"
50,526, // {"A".."Z" "a" "d" "f".."h" "j".."k" "m".."n" "q".."s" "w" "y".."z"}
51,526, // "b"
52,526, // "e"
53,526, // "t"
54,526, // "c"
55,526, // "i"
56,526, // "l"
57,526, // "o"
58,526, // "u"
59,526, // "x"
60,822, // letter128
61,489, // {199..218 231..250}
62,489, // {193..198 225..230}
64,201, // {"1".."9"}
65,717, // "0"
66,392, // digit128
67,811, // {176..185}
74,613, // "("
78,827, // "-"
  }
,
{ // state 632
68,383, // ws
69,274, // " "
70,162, // {10}
MIN_REDUCTION+80, // (default reduction)
  }
,
{ // state 633
MIN_REDUCTION+47, // (default reduction)
  }
,
{ // state 634
MIN_REDUCTION+47, // (default reduction)
  }
,
{ // state 635
MIN_REDUCTION+117, // (default reduction)
  }
,
{ // state 636
23,MIN_REDUCTION+43, // `[
80,MIN_REDUCTION+43, // "["
MIN_REDUCTION+43, // (default reduction)
  }
,
{ // state 637
MIN_REDUCTION+116, // (default reduction)
  }
,
{ // state 638
MIN_REDUCTION+19, // (default reduction)
  }
,
{ // state 639
8,552, // `{
76,573, // "{"
  }
,
{ // state 640
68,52, // ws
69,61, // " "
70,753, // {10}
MIN_REDUCTION+84, // (default reduction)
  }
,
{ // state 641
96,MIN_REDUCTION+46, // $NT
MIN_REDUCTION+46, // (default reduction)
  }
,
{ // state 642
MIN_REDUCTION+47, // (default reduction)
  }
,
{ // state 643
MIN_REDUCTION+46, // (default reduction)
  }
,
{ // state 644
23,MIN_REDUCTION+120, // `[
68,29, // ws
69,93, // " "
70,109, // {10}
80,MIN_REDUCTION+120, // "["
MIN_REDUCTION+120, // (default reduction)
  }
,
{ // state 645
8,310, // `{
11,777, // `extends
71,713, // "#"
76,682, // "{"
  }
,
{ // state 646
23,MIN_REDUCTION+120, // `[
68,30, // ws
69,95, // " "
70,105, // {10}
80,MIN_REDUCTION+120, // "["
MIN_REDUCTION+120, // (default reduction)
  }
,
{ // state 647
23,MIN_REDUCTION+116, // `[
80,MIN_REDUCTION+116, // "["
MIN_REDUCTION+116, // (default reduction)
  }
,
{ // state 648
68,145, // ws
69,280, // " "
70,277, // {10}
MIN_REDUCTION+74, // (default reduction)
  }
,
{ // state 649
23,MIN_REDUCTION+116, // `[
80,MIN_REDUCTION+116, // "["
MIN_REDUCTION+116, // (default reduction)
  }
,
{ // state 650
0x80000000|1, // match move
0x80000000|219, // no-match move
0x80000000|35, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 651
0x80000000|367, // match move
0x80000000|691, // no-match move
0x80000000|35, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 652
2,297, // ws*
23,MIN_REDUCTION+119, // `[
68,73, // ws
69,11, // " "
70,69, // {10}
80,MIN_REDUCTION+119, // "["
MIN_REDUCTION+119, // (default reduction)
  }
,
{ // state 653
23,MIN_REDUCTION+116, // `[
80,MIN_REDUCTION+116, // "["
MIN_REDUCTION+116, // (default reduction)
  }
,
{ // state 654
MIN_REDUCTION+46, // (default reduction)
  }
,
{ // state 655
0x80000000|790, // match move
0x80000000|265, // no-match move
0x80000000|734, // NT-test-match state for `else
  }
,
{ // state 656
MIN_REDUCTION+99, // (default reduction)
  }
,
{ // state 657
23,MIN_REDUCTION+99, // `[
80,MIN_REDUCTION+99, // "["
MIN_REDUCTION+99, // (default reduction)
  }
,
{ // state 658
MIN_REDUCTION+116, // (default reduction)
  }
,
{ // state 659
MIN_REDUCTION+43, // (default reduction)
  }
,
{ // state 660
MIN_REDUCTION+101, // (default reduction)
  }
,
{ // state 661
MIN_REDUCTION+47, // (default reduction)
  }
,
{ // state 662
47,445, // letter
48,50, // "p"
49,50, // "v"
50,50, // {"A".."Z" "a" "d" "f".."h" "j".."k" "m".."n" "q".."s" "w" "y".."z"}
51,50, // "b"
52,50, // "e"
53,50, // "t"
54,50, // "c"
55,50, // "i"
56,50, // "l"
57,50, // "o"
58,50, // "u"
59,50, // "x"
60,680, // letter128
61,489, // {199..218 231..250}
62,489, // {193..198 225..230}
63,194, // digit
64,165, // {"1".."9"}
65,165, // "0"
66,516, // digit128
67,811, // {176..185}
83,84, // idChar*
84,199, // $$0
89,357, // idChar
90,785, // "_"
91,59, // idChar128
92,533, // {223}
  }
,
{ // state 663
7,174, // ID
8,36, // `{
16,348, // `(
19,139, // <type>
20,593, // `int
21,595, // `boolean
25,706, // <stmt>
26,671, // <assign>
28,23, // <local var decl>
29,154, // `if
30,387, // <exp>
33,741, // <exp8>
34,221, // <exp7>
35,14, // <exp6>
36,19, // <exp5>
37,68, // <exp4>
39,322, // <exp3>
41,56, // <exp2>
42,169, // <cast exp>
43,327, // <unary exp>
44,64, // <exp1>
45,555, // `-
46,311, // INTLIT
47,794, // letter
48,526, // "p"
49,526, // "v"
50,526, // {"A".."Z" "a" "d" "f".."h" "j".."k" "m".."n" "q".."s" "w" "y".."z"}
51,526, // "b"
52,526, // "e"
53,526, // "t"
54,526, // "c"
55,526, // "i"
56,526, // "l"
57,526, // "o"
58,526, // "u"
59,526, // "x"
60,258, // letter128
61,129, // {199..218 231..250}
62,129, // {193..198 225..230}
64,178, // {"1".."9"}
65,699, // "0"
66,386, // digit128
67,816, // {176..185}
71,284, // "#"
74,613, // "("
76,573, // "{"
78,827, // "-"
  }
,
{ // state 664
MIN_REDUCTION+43, // (default reduction)
  }
,
{ // state 665
23,MIN_REDUCTION+45, // `[
80,MIN_REDUCTION+45, // "["
MIN_REDUCTION+45, // (default reduction)
  }
,
{ // state 666
48,686, // "p"
49,686, // "v"
50,686, // {"A".."Z" "a" "d" "f".."h" "j".."k" "m".."n" "q".."s" "w" "y".."z"}
51,686, // "b"
52,686, // "e"
53,686, // "t"
54,686, // "c"
55,686, // "i"
56,686, // "l"
57,686, // "o"
58,686, // "u"
59,686, // "x"
62,49, // {193..198 225..230}
64,686, // {"1".."9"}
65,686, // "0"
67,49, // {176..185}
87,480, // hexDigit*
88,248, // $$2
93,781, // hexDigit
94,406, // hexDigit128
  }
,
{ // state 667
MIN_REDUCTION+43, // (default reduction)
  }
,
{ // state 668
MIN_REDUCTION+116, // (default reduction)
  }
,
{ // state 669
0x80000000|1, // match move
0x80000000|453, // no-match move
0x80000000|35, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 670
0x80000000|656, // match move
0x80000000|467, // no-match move
0x80000000|35, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 671
27,795, // `;
82,492, // ";"
  }
,
{ // state 672
0x80000000|656, // match move
0x80000000|471, // no-match move
0x80000000|35, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 673
MIN_REDUCTION+16, // (default reduction)
  }
,
{ // state 674
MIN_REDUCTION+43, // (default reduction)
  }
,
{ // state 675
MIN_REDUCTION+24, // (default reduction)
  }
,
{ // state 676
MIN_REDUCTION+104, // (default reduction)
  }
,
{ // state 677
0x80000000|1, // match move
0x80000000|303, // no-match move
0x80000000|35, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 678
0x80000000|1, // match move
0x80000000|300, // no-match move
0x80000000|35, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 679
7,157, // ID
16,255, // `(
30,444, // <exp>
33,757, // <exp8>
34,2, // <exp7>
35,231, // <exp6>
36,232, // <exp5>
37,48, // <exp4>
39,358, // <exp3>
41,40, // <exp2>
42,192, // <cast exp>
43,349, // <unary exp>
44,87, // <exp1>
45,562, // `-
46,302, // INTLIT
47,503, // letter
48,526, // "p"
49,526, // "v"
50,526, // {"A".."Z" "a" "d" "f".."h" "j".."k" "m".."n" "q".."s" "w" "y".."z"}
51,526, // "b"
52,526, // "e"
53,526, // "t"
54,526, // "c"
55,526, // "i"
56,526, // "l"
57,526, // "o"
58,526, // "u"
59,526, // "x"
60,767, // letter128
61,464, // {199..218 231..250}
62,464, // {193..198 225..230}
64,148, // {"1".."9"}
65,666, // "0"
66,374, // digit128
67,829, // {176..185}
74,613, // "("
78,827, // "-"
  }
,
{ // state 680
0x80000000|656, // match move
0x80000000|456, // no-match move
0x80000000|35, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 681
MIN_REDUCTION+14, // (default reduction)
  }
,
{ // state 682
2,31, // ws*
68,235, // ws
69,614, // " "
70,634, // {10}
MIN_REDUCTION+71, // (default reduction)
  }
,
{ // state 683
MIN_REDUCTION+11, // (default reduction)
  }
,
{ // state 684
MIN_REDUCTION+37, // (default reduction)
  }
,
{ // state 685
2,434, // ws*
68,376, // ws
69,804, // " "
70,458, // {10}
MIN_REDUCTION+51, // (default reduction)
  }
,
{ // state 686
MIN_REDUCTION+102, // (default reduction)
  }
,
{ // state 687
7,157, // ID
16,255, // `(
30,416, // <exp>
33,757, // <exp8>
34,2, // <exp7>
35,231, // <exp6>
36,232, // <exp5>
37,48, // <exp4>
39,358, // <exp3>
41,40, // <exp2>
42,192, // <cast exp>
43,349, // <unary exp>
44,87, // <exp1>
45,562, // `-
46,302, // INTLIT
47,503, // letter
48,526, // "p"
49,526, // "v"
50,526, // {"A".."Z" "a" "d" "f".."h" "j".."k" "m".."n" "q".."s" "w" "y".."z"}
51,526, // "b"
52,526, // "e"
53,526, // "t"
54,526, // "c"
55,526, // "i"
56,526, // "l"
57,526, // "o"
58,526, // "u"
59,526, // "x"
60,767, // letter128
61,464, // {199..218 231..250}
62,464, // {193..198 225..230}
64,148, // {"1".."9"}
65,666, // "0"
66,374, // digit128
67,829, // {176..185}
74,613, // "("
78,827, // "-"
  }
,
{ // state 688
MIN_REDUCTION+99, // (default reduction)
  }
,
{ // state 689
68,668, // ws
69,759, // " "
70,535, // {10}
MIN_REDUCTION+86, // (default reduction)
  }
,
{ // state 690
0x80000000|398, // match move
0x80000000|8, // no-match move
0x80000000|734, // NT-test-match state for `else
  }
,
{ // state 691
23,MIN_REDUCTION+89, // `[
80,MIN_REDUCTION+89, // "["
MIN_REDUCTION+89, // (default reduction)
  }
,
{ // state 692
23,MIN_REDUCTION+39, // `[
32,MIN_REDUCTION+39, // `=
38,MIN_REDUCTION+39, // `+
40,MIN_REDUCTION+39, // `*
72,MIN_REDUCTION+39, // "+"
73,MIN_REDUCTION+39, // "*"
79,MIN_REDUCTION+39, // "="
80,MIN_REDUCTION+39, // "["
MIN_REDUCTION+13, // (default reduction)
  }
,
{ // state 693
0x80000000|234, // match move
0x80000000|208, // no-match move
0x80000000|734, // NT-test-match state for `else
  }
,
{ // state 694
MIN_REDUCTION+117, // (default reduction)
  }
,
{ // state 695
7,157, // ID
16,255, // `(
30,407, // <exp>
33,757, // <exp8>
34,2, // <exp7>
35,231, // <exp6>
36,232, // <exp5>
37,48, // <exp4>
39,358, // <exp3>
41,40, // <exp2>
42,192, // <cast exp>
43,349, // <unary exp>
44,87, // <exp1>
45,562, // `-
46,302, // INTLIT
47,503, // letter
48,526, // "p"
49,526, // "v"
50,526, // {"A".."Z" "a" "d" "f".."h" "j".."k" "m".."n" "q".."s" "w" "y".."z"}
51,526, // "b"
52,526, // "e"
53,526, // "t"
54,526, // "c"
55,526, // "i"
56,526, // "l"
57,526, // "o"
58,526, // "u"
59,526, // "x"
60,767, // letter128
61,464, // {199..218 231..250}
62,464, // {193..198 225..230}
64,148, // {"1".."9"}
65,666, // "0"
66,374, // digit128
67,829, // {176..185}
74,613, // "("
78,827, // "-"
  }
,
{ // state 696
0x80000000|1, // match move
0x80000000|70, // no-match move
0x80000000|35, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 697
48,686, // "p"
49,686, // "v"
50,686, // {"A".."Z" "a" "d" "f".."h" "j".."k" "m".."n" "q".."s" "w" "y".."z"}
51,686, // "b"
52,686, // "e"
53,686, // "t"
54,686, // "c"
55,686, // "i"
56,686, // "l"
57,686, // "o"
58,686, // "u"
59,686, // "x"
62,172, // {193..198 225..230}
64,686, // {"1".."9"}
65,686, // "0"
67,172, // {176..185}
87,532, // hexDigit*
88,263, // $$2
93,781, // hexDigit
94,494, // hexDigit128
  }
,
{ // state 698
68,373, // ws
69,457, // " "
70,626, // {10}
MIN_REDUCTION+68, // (default reduction)
  }
,
{ // state 699
48,686, // "p"
49,686, // "v"
50,686, // {"A".."Z" "a" "d" "f".."h" "j".."k" "m".."n" "q".."s" "w" "y".."z"}
51,686, // "b"
52,686, // "e"
53,686, // "t"
54,686, // "c"
55,686, // "i"
56,686, // "l"
57,686, // "o"
58,686, // "u"
59,686, // "x"
62,168, // {193..198 225..230}
64,686, // {"1".."9"}
65,686, // "0"
67,168, // {176..185}
87,534, // hexDigit*
88,266, // $$2
93,781, // hexDigit
94,486, // hexDigit128
  }
,
{ // state 700
7,157, // ID
16,255, // `(
30,412, // <exp>
33,757, // <exp8>
34,2, // <exp7>
35,231, // <exp6>
36,232, // <exp5>
37,48, // <exp4>
39,358, // <exp3>
41,40, // <exp2>
42,192, // <cast exp>
43,349, // <unary exp>
44,87, // <exp1>
45,562, // `-
46,302, // INTLIT
47,503, // letter
48,526, // "p"
49,526, // "v"
50,526, // {"A".."Z" "a" "d" "f".."h" "j".."k" "m".."n" "q".."s" "w" "y".."z"}
51,526, // "b"
52,526, // "e"
53,526, // "t"
54,526, // "c"
55,526, // "i"
56,526, // "l"
57,526, // "o"
58,526, // "u"
59,526, // "x"
60,767, // letter128
61,464, // {199..218 231..250}
62,464, // {193..198 225..230}
64,148, // {"1".."9"}
65,666, // "0"
66,374, // digit128
67,829, // {176..185}
74,613, // "("
78,827, // "-"
  }
,
{ // state 701
68,329, // ws
69,641, // " "
70,223, // {10}
96,MIN_REDUCTION+82, // $NT
  }
,
{ // state 702
MIN_REDUCTION+117, // (default reduction)
  }
,
{ // state 703
MIN_REDUCTION+114, // (default reduction)
  }
,
{ // state 704
0x80000000|1, // match move
0x80000000|185, // no-match move
0x80000000|35, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 705
0x80000000|1, // match move
0x80000000|323, // no-match move
0x80000000|35, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 706
0x80000000|382, // match move
0x80000000|8, // no-match move
0x80000000|734, // NT-test-match state for `else
  }
,
{ // state 707
MIN_REDUCTION+44, // (default reduction)
  }
,
{ // state 708
MIN_REDUCTION+117, // (default reduction)
  }
,
{ // state 709
2,607, // ws*
68,477, // ws
69,260, // " "
70,149, // {10}
MIN_REDUCTION+87, // (default reduction)
  }
,
{ // state 710
MIN_REDUCTION+117, // (default reduction)
  }
,
{ // state 711
MIN_REDUCTION+43, // (default reduction)
  }
,
{ // state 712
9,547, // <decl in class>*
10,499, // `}
12,425, // <decl in class>
13,141, // <method decl>
14,209, // `public
71,800, // "#"
77,15, // "}"
  }
,
{ // state 713
52,88, // "e"
  }
,
{ // state 714
0x80000000|1, // match move
0x80000000|805, // no-match move
0x80000000|35, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 715
2,704, // ws*
  }
,
{ // state 716
0x80000000|1, // match move
0x80000000|803, // no-match move
0x80000000|35, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 717
48,686, // "p"
49,686, // "v"
50,686, // {"A".."Z" "a" "d" "f".."h" "j".."k" "m".."n" "q".."s" "w" "y".."z"}
51,686, // "b"
52,686, // "e"
53,686, // "t"
54,686, // "c"
55,686, // "i"
56,686, // "l"
57,686, // "o"
58,686, // "u"
59,686, // "x"
62,179, // {193..198 225..230}
64,686, // {"1".."9"}
65,686, // "0"
67,179, // {176..185}
87,541, // hexDigit*
88,256, // $$2
93,781, // hexDigit
94,475, // hexDigit128
  }
,
{ // state 718
68,MIN_REDUCTION+117, // ws
69,MIN_REDUCTION+117, // " "
70,MIN_REDUCTION+117, // {10}
MIN_REDUCTION+117, // (default reduction)
  }
,
{ // state 719
MIN_REDUCTION+6, // (default reduction)
  }
,
{ // state 720
24,476, // `]
81,400, // "]"
  }
,
{ // state 721
2,151, // ws*
68,807, // ws
69,32, // " "
70,598, // {10}
MIN_REDUCTION+69, // (default reduction)
  }
,
{ // state 722
2,621, // ws*
  }
,
{ // state 723
0x80000000|1, // match move
0x80000000|558, // no-match move
0x80000000|35, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 724
2,619, // ws*
  }
,
{ // state 725
MIN_REDUCTION+45, // (default reduction)
  }
,
{ // state 726
2,655, // ws*
68,345, // ws
69,61, // " "
70,753, // {10}
MIN_REDUCTION+73, // (default reduction)
  }
,
{ // state 727
2,62, // ws*
68,164, // ws
69,759, // " "
70,535, // {10}
MIN_REDUCTION+49, // (default reduction)
  }
,
{ // state 728
MIN_REDUCTION+13, // (default reduction)
  }
,
{ // state 729
2,610, // ws*
68,505, // ws
69,241, // " "
70,189, // {10}
MIN_REDUCTION+87, // (default reduction)
  }
,
{ // state 730
0x80000000|1, // match move
0x80000000|561, // no-match move
0x80000000|35, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 731
68,668, // ws
69,759, // " "
70,535, // {10}
MIN_REDUCTION+82, // (default reduction)
  }
,
{ // state 732
0x80000000|1, // match move
0x80000000|568, // no-match move
0x80000000|35, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 733
2,820, // ws*
68,376, // ws
69,804, // " "
70,458, // {10}
MIN_REDUCTION+55, // (default reduction)
  }
,
{ // state 734
71,581, // "#"
  }
,
{ // state 735
0x80000000|1, // match move
0x80000000|566, // no-match move
0x80000000|35, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 736
2,669, // ws*
  }
,
{ // state 737
58,411, // "u"
  }
,
{ // state 738
2,182, // ws*
68,702, // ws
69,113, // " "
70,130, // {10}
MIN_REDUCTION+65, // (default reduction)
  }
,
{ // state 739
7,174, // ID
8,37, // `{
16,348, // `(
19,139, // <type>
20,593, // `int
21,595, // `boolean
25,184, // <stmt>
26,594, // <assign>
28,493, // <local var decl>
29,852, // `if
30,387, // <exp>
33,741, // <exp8>
34,221, // <exp7>
35,14, // <exp6>
36,19, // <exp5>
37,68, // <exp4>
39,322, // <exp3>
41,56, // <exp2>
42,169, // <cast exp>
43,327, // <unary exp>
44,64, // <exp1>
45,555, // `-
46,311, // INTLIT
47,794, // letter
48,526, // "p"
49,526, // "v"
50,526, // {"A".."Z" "a" "d" "f".."h" "j".."k" "m".."n" "q".."s" "w" "y".."z"}
51,526, // "b"
52,526, // "e"
53,526, // "t"
54,526, // "c"
55,526, // "i"
56,526, // "l"
57,526, // "o"
58,526, // "u"
59,526, // "x"
60,258, // letter128
61,129, // {199..218 231..250}
62,129, // {193..198 225..230}
64,178, // {"1".."9"}
65,699, // "0"
66,386, // digit128
67,816, // {176..185}
71,284, // "#"
74,613, // "("
76,573, // "{"
78,827, // "-"
  }
,
{ // state 740
0x80000000|1, // match move
0x80000000|779, // no-match move
0x80000000|35, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 741
MIN_REDUCTION+24, // (default reduction)
  }
,
{ // state 742
MIN_REDUCTION+46, // (default reduction)
  }
,
{ // state 743
MIN_REDUCTION+24, // (default reduction)
  }
,
{ // state 744
0x80000000|1, // match move
0x80000000|282, // no-match move
0x80000000|35, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 745
2,161, // ws*
68,164, // ws
69,759, // " "
70,535, // {10}
MIN_REDUCTION+57, // (default reduction)
  }
,
{ // state 746
23,MIN_REDUCTION+91, // `[
80,MIN_REDUCTION+91, // "["
MIN_REDUCTION+91, // (default reduction)
  }
,
{ // state 747
0x80000000|1, // match move
0x80000000|646, // no-match move
0x80000000|35, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 748
MIN_REDUCTION+46, // (default reduction)
  }
,
{ // state 749
68,371, // ws
69,239, // " "
70,188, // {10}
MIN_REDUCTION+66, // (default reduction)
  }
,
{ // state 750
MIN_REDUCTION+46, // (default reduction)
  }
,
{ // state 751
0x80000000|1, // match move
0x80000000|644, // no-match move
0x80000000|35, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 752
2,751, // ws*
  }
,
{ // state 753
0x80000000|213, // match move
0x80000000|470, // no-match move
0x80000000|734, // NT-test-match state for `else
  }
,
{ // state 754
0x80000000|1, // match move
0x80000000|627, // no-match move
0x80000000|35, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 755
MIN_REDUCTION+21, // (default reduction)
  }
,
{ // state 756
2,747, // ws*
  }
,
{ // state 757
MIN_REDUCTION+24, // (default reduction)
  }
,
{ // state 758
68,389, // ws
69,299, // " "
70,124, // {10}
MIN_REDUCTION+86, // (default reduction)
  }
,
{ // state 759
MIN_REDUCTION+46, // (default reduction)
  }
,
{ // state 760
2,754, // ws*
  }
,
{ // state 761
0x80000000|1, // match move
0x80000000|841, // no-match move
0x80000000|35, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 762
2,650, // ws*
  }
,
{ // state 763
MIN_REDUCTION+4, // (default reduction)
  }
,
{ // state 764
0x80000000|656, // match move
0x80000000|485, // no-match move
0x80000000|35, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 765
23,MIN_REDUCTION+43, // `[
80,MIN_REDUCTION+43, // "["
MIN_REDUCTION+43, // (default reduction)
  }
,
{ // state 766
32,44, // `=
79,774, // "="
  }
,
{ // state 767
0x80000000|762, // match move
0x80000000|597, // no-match move
0x80000000|35, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 768
0x80000000|1, // match move
0x80000000|602, // no-match move
0x80000000|35, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 769
23,MIN_REDUCTION+43, // `[
80,MIN_REDUCTION+43, // "["
MIN_REDUCTION+43, // (default reduction)
  }
,
{ // state 770
0x80000000|1, // match move
0x80000000|605, // no-match move
0x80000000|35, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 771
MIN_REDUCTION+31, // (default reduction)
  }
,
{ // state 772
MIN_REDUCTION+31, // (default reduction)
  }
,
{ // state 773
68,517, // ws
69,472, // " "
70,843, // {10}
MIN_REDUCTION+70, // (default reduction)
  }
,
{ // state 774
2,245, // ws*
68,203, // ws
69,643, // " "
70,661, // {10}
MIN_REDUCTION+79, // (default reduction)
  }
,
{ // state 775
MIN_REDUCTION+88, // (default reduction)
  }
,
{ // state 776
MIN_REDUCTION+31, // (default reduction)
  }
,
{ // state 777
7,54, // ID
47,269, // letter
48,526, // "p"
49,526, // "v"
50,526, // {"A".."Z" "a" "d" "f".."h" "j".."k" "m".."n" "q".."s" "w" "y".."z"}
51,526, // "b"
52,526, // "e"
53,526, // "t"
54,526, // "c"
55,526, // "i"
56,526, // "l"
57,526, // "o"
58,526, // "u"
59,526, // "x"
60,846, // letter128
61,711, // {199..218 231..250}
62,711, // {193..198 225..230}
  }
,
{ // state 778
0x80000000|1, // match move
0x80000000|576, // no-match move
0x80000000|35, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 779
23,MIN_REDUCTION+122, // `[
68,38, // ws
69,108, // " "
70,21, // {10}
80,MIN_REDUCTION+122, // "["
MIN_REDUCTION+122, // (default reduction)
  }
,
{ // state 780
MIN_REDUCTION+100, // (default reduction)
  }
,
{ // state 781
MIN_REDUCTION+109, // (default reduction)
  }
,
{ // state 782
23,MIN_REDUCTION+100, // `[
80,MIN_REDUCTION+100, // "["
MIN_REDUCTION+100, // (default reduction)
  }
,
{ // state 783
17,279, // `)
75,384, // ")"
  }
,
{ // state 784
23,MIN_REDUCTION+100, // `[
80,MIN_REDUCTION+100, // "["
MIN_REDUCTION+100, // (default reduction)
  }
,
{ // state 785
MIN_REDUCTION+98, // (default reduction)
  }
,
{ // state 786
0x80000000|722, // match move
0x80000000|537, // no-match move
0x80000000|35, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 787
0x80000000|724, // match move
0x80000000|539, // no-match move
0x80000000|35, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 788
0x80000000|173, // match move
0x80000000|484, // no-match move
0x80000000|35, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 789
23,MIN_REDUCTION+88, // `[
80,MIN_REDUCTION+88, // "["
MIN_REDUCTION+88, // (default reduction)
  }
,
{ // state 790
MIN_REDUCTION+72, // (default reduction)
  }
,
{ // state 791
MIN_REDUCTION+116, // (default reduction)
  }
,
{ // state 792
0x80000000|755, // match move
0x80000000|609, // no-match move
0x80000000|734, // NT-test-match state for `else
  }
,
{ // state 793
23,MIN_REDUCTION+88, // `[
80,MIN_REDUCTION+88, // "["
MIN_REDUCTION+88, // (default reduction)
  }
,
{ // state 794
47,445, // letter
48,50, // "p"
49,50, // "v"
50,50, // {"A".."Z" "a" "d" "f".."h" "j".."k" "m".."n" "q".."s" "w" "y".."z"}
51,50, // "b"
52,50, // "e"
53,50, // "t"
54,50, // "c"
55,50, // "i"
56,50, // "l"
57,50, // "o"
58,50, // "u"
59,50, // "x"
60,368, // letter128
61,129, // {199..218 231..250}
62,129, // {193..198 225..230}
63,194, // digit
64,165, // {"1".."9"}
65,165, // "0"
66,788, // digit128
67,106, // {176..185}
83,34, // idChar*
84,651, // $$0
89,357, // idChar
90,785, // "_"
91,417, // idChar128
92,385, // {223}
  }
,
{ // state 795
0x80000000|673, // match move
0x80000000|46, // no-match move
0x80000000|734, // NT-test-match state for `else
  }
,
{ // state 796
23,MIN_REDUCTION+100, // `[
80,MIN_REDUCTION+100, // "["
MIN_REDUCTION+100, // (default reduction)
  }
,
{ // state 797
MIN_REDUCTION+46, // (default reduction)
  }
,
{ // state 798
23,MIN_REDUCTION+88, // `[
80,MIN_REDUCTION+88, // "["
MIN_REDUCTION+88, // (default reduction)
  }
,
{ // state 799
23,MIN_REDUCTION+88, // `[
80,MIN_REDUCTION+88, // "["
MIN_REDUCTION+88, // (default reduction)
  }
,
{ // state 800
48,737, // "p"
  }
,
{ // state 801
MIN_REDUCTION+31, // (default reduction)
  }
,
{ // state 802
MIN_REDUCTION+47, // (default reduction)
  }
,
{ // state 803
23,MIN_REDUCTION+122, // `[
68,30, // ws
69,95, // " "
70,105, // {10}
80,MIN_REDUCTION+122, // "["
MIN_REDUCTION+122, // (default reduction)
  }
,
{ // state 804
MIN_REDUCTION+46, // (default reduction)
  }
,
{ // state 805
23,MIN_REDUCTION+122, // `[
68,29, // ws
69,93, // " "
70,109, // {10}
80,MIN_REDUCTION+122, // "["
MIN_REDUCTION+122, // (default reduction)
  }
,
{ // state 806
2,3, // ws*
68,710, // ws
69,98, // " "
70,138, // {10}
MIN_REDUCTION+77, // (default reduction)
  }
,
{ // state 807
MIN_REDUCTION+117, // (default reduction)
  }
,
{ // state 808
23,MIN_REDUCTION+94, // `[
80,MIN_REDUCTION+94, // "["
MIN_REDUCTION+94, // (default reduction)
  }
,
{ // state 809
2,289, // ws*
68,694, // ws
69,457, // " "
70,626, // {10}
MIN_REDUCTION+61, // (default reduction)
  }
,
{ // state 810
MIN_REDUCTION+112, // (default reduction)
  }
,
{ // state 811
0x80000000|490, // match move
0x80000000|216, // no-match move
0x80000000|35, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 812
23,MIN_REDUCTION+40, // `[
80,MIN_REDUCTION+40, // "["
MIN_REDUCTION+40, // (default reduction)
  }
,
{ // state 813
MIN_REDUCTION+105, // (default reduction)
  }
,
{ // state 814
7,466, // ID
47,403, // letter
48,526, // "p"
49,526, // "v"
50,526, // {"A".."Z" "a" "d" "f".."h" "j".."k" "m".."n" "q".."s" "w" "y".."z"}
51,526, // "b"
52,526, // "e"
53,526, // "t"
54,526, // "c"
55,526, // "i"
56,526, // "l"
57,526, // "o"
58,526, // "u"
59,526, // "x"
60,729, // letter128
61,664, // {199..218 231..250}
62,664, // {193..198 225..230}
  }
,
{ // state 815
0x80000000|752, // match move
0x80000000|143, // no-match move
0x80000000|35, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 816
0x80000000|490, // match move
0x80000000|226, // no-match move
0x80000000|35, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 817
2,601, // ws*
MIN_REDUCTION+85, // (default reduction)
  }
,
{ // state 818
0x80000000|490, // match move
0x80000000|224, // no-match move
0x80000000|35, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 819
0x80000000|756, // match move
0x80000000|140, // no-match move
0x80000000|35, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 820
68,47, // ws
69,804, // " "
70,458, // {10}
MIN_REDUCTION+54, // (default reduction)
  }
,
{ // state 821
MIN_REDUCTION+111, // (default reduction)
  }
,
{ // state 822
0x80000000|715, // match move
0x80000000|519, // no-match move
0x80000000|35, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 823
23,MIN_REDUCTION+100, // `[
80,MIN_REDUCTION+100, // "["
MIN_REDUCTION+100, // (default reduction)
  }
,
{ // state 824
0x80000000|760, // match move
0x80000000|158, // no-match move
0x80000000|35, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 825
23,MIN_REDUCTION+45, // `[
80,MIN_REDUCTION+45, // "["
MIN_REDUCTION+45, // (default reduction)
  }
,
{ // state 826
MIN_REDUCTION+100, // (default reduction)
  }
,
{ // state 827
2,648, // ws*
68,225, // ws
69,280, // " "
70,277, // {10}
MIN_REDUCTION+75, // (default reduction)
  }
,
{ // state 828
MIN_REDUCTION+18, // (default reduction)
  }
,
{ // state 829
0x80000000|490, // match move
0x80000000|665, // no-match move
0x80000000|35, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 830
23,MIN_REDUCTION+94, // `[
80,MIN_REDUCTION+94, // "["
MIN_REDUCTION+94, // (default reduction)
  }
,
{ // state 831
23,MIN_REDUCTION+94, // `[
80,MIN_REDUCTION+94, // "["
MIN_REDUCTION+94, // (default reduction)
  }
,
{ // state 832
47,445, // letter
48,50, // "p"
49,50, // "v"
50,50, // {"A".."Z" "a" "d" "f".."h" "j".."k" "m".."n" "q".."s" "w" "y".."z"}
51,50, // "b"
52,50, // "e"
53,50, // "t"
54,50, // "c"
55,50, // "i"
56,50, // "l"
57,50, // "o"
58,50, // "u"
59,50, // "x"
60,604, // letter128
61,433, // {199..218 231..250}
62,433, // {193..198 225..230}
63,194, // digit
64,165, // {"1".."9"}
65,165, // "0"
66,290, // digit128
67,418, // {176..185}
84,176, // $$0
89,810, // idChar
90,785, // "_"
91,538, // idChar128
92,459, // {223}
  }
,
{ // state 833
0x80000000|364, // match move
0x80000000|590, // no-match move
0x80000000|35, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 834
68,110, // ws
69,643, // " "
70,661, // {10}
MIN_REDUCTION+66, // (default reduction)
  }
,
{ // state 835
MIN_REDUCTION+100, // (default reduction)
  }
,
{ // state 836
16,506, // `(
74,405, // "("
  }
,
{ // state 837
0x80000000|736, // match move
0x80000000|119, // no-match move
0x80000000|35, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 838
23,MIN_REDUCTION+94, // `[
80,MIN_REDUCTION+94, // "["
MIN_REDUCTION+94, // (default reduction)
  }
,
{ // state 839
MIN_REDUCTION+37, // (default reduction)
  }
,
{ // state 840
MIN_REDUCTION+1, // (default reduction)
  }
,
{ // state 841
23,MIN_REDUCTION+40, // `[
80,MIN_REDUCTION+40, // "["
MIN_REDUCTION+40, // (default reduction)
  }
,
{ // state 842
MIN_REDUCTION+37, // (default reduction)
  }
,
{ // state 843
MIN_REDUCTION+47, // (default reduction)
  }
,
{ // state 844
MIN_REDUCTION+118, // (default reduction)
  }
,
{ // state 845
MIN_REDUCTION+19, // (default reduction)
  }
,
{ // state 846
2,758, // ws*
68,460, // ws
69,299, // " "
70,124, // {10}
MIN_REDUCTION+87, // (default reduction)
  }
,
{ // state 847
-1, // $$start
-1, // <start>
-1, // ws*
-1, // <program>
-1, // <class decl>+
-1, // <class decl>
-1, // `class
174, // ID
463, // `{
-1, // <decl in class>*
366, // `}
-1, // `extends
-1, // <decl in class>
-1, // <method decl>
-1, // `public
-1, // `void
348, // `(
-1, // `)
-1, // <stmt>*
139, // <type>
593, // `int
595, // `boolean
-1, // <empty bracket pair>
-1, // `[
-1, // `]
549, // <stmt>
612, // <assign>
-1, // `;
273, // <local var decl>
836, // `if
387, // <exp>
-1, // `else
-1, // `=
741, // <exp8>
221, // <exp7>
14, // <exp6>
19, // <exp5>
68, // <exp4>
-1, // `+
322, // <exp3>
-1, // `*
56, // <exp2>
169, // <cast exp>
327, // <unary exp>
64, // <exp1>
555, // `-
311, // INTLIT
794, // letter
526, // "p"
526, // "v"
526, // {"A".."Z" "a" "d" "f".."h" "j".."k" "m".."n" "q".."s" "w" "y".."z"}
526, // "b"
526, // "e"
526, // "t"
526, // "c"
526, // "i"
526, // "l"
526, // "o"
526, // "u"
526, // "x"
258, // letter128
129, // {199..218 231..250}
129, // {193..198 225..230}
-1, // digit
178, // {"1".."9"}
699, // "0"
386, // digit128
816, // {176..185}
-1, // ws
-1, // " "
-1, // {10}
284, // "#"
-1, // "+"
-1, // "*"
613, // "("
-1, // ")"
573, // "{"
693, // "}"
827, // "-"
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
{ // state 848
MIN_REDUCTION+37, // (default reduction)
  }
,
{ // state 849
23,MIN_REDUCTION+40, // `[
80,MIN_REDUCTION+40, // "["
MIN_REDUCTION+40, // (default reduction)
  }
,
{ // state 850
23,MIN_REDUCTION+40, // `[
80,MIN_REDUCTION+40, // "["
MIN_REDUCTION+40, // (default reduction)
  }
,
{ // state 851
MIN_REDUCTION+100, // (default reduction)
  }
,
{ // state 852
16,631, // `(
74,405, // "("
  }
,
{ // state 853
24,369, // `]
81,293, // "]"
  }
,
};
}
public MJGrammarParseTable(MJGrammar actionObj) {
  actionObject = actionObj;
  parseTable = new int[854][];
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
"", // 103
"digit* ::= digit* digit", // 104
"digit* ::= digit* digit", // 105
"<decl in class>* ::= <decl in class>* <decl in class>", // 106
"<decl in class>* ::= <decl in class>* <decl in class>", // 107
"hexDigit* ::= hexDigit* hexDigit", // 108
"hexDigit* ::= hexDigit* hexDigit", // 109
"<stmt>* ::= <stmt>* <stmt>", // 110
"<stmt>* ::= <stmt>* <stmt>", // 111
"idChar* ::= idChar* idChar", // 112
"idChar* ::= idChar* idChar", // 113
"<class decl>+ ::= <class decl>", // 114
"<class decl>+ ::= <class decl>+ <class decl>", // 115
"ws* ::= ws* ws", // 116
"ws* ::= ws* ws", // 117
"", // 118
"", // 119
"", // 120
"", // 121
"", // 122
"", // 123
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
    { // 22: <assign> ::= <exp> [#] `= <exp> @assign(Exp,int,Exp)=>Statement
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((6<<5)|0x6)/*nullProductionAction:6*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((12<<5)|0x5)/*methodCall:12*/,
    },
    { // 23: <local var decl> ::= <type> [#] ID `= <exp> @localVarDecl(Type,int,String,Exp)=>Statement
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((6<<5)|0x6)/*nullProductionAction:6*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((13<<5)|0x5)/*methodCall:13*/,
    },
    { // 24: <exp> ::= <exp8> @pass
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
    },
    { // 25: <exp8> ::= <exp7> @pass
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
    },
    { // 26: <exp7> ::= <exp6> @pass
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
    },
    { // 27: <exp6> ::= <exp5> @pass
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
    },
    { // 28: <exp5> ::= <exp4> @pass
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
    },
    { // 29: <exp4> ::= <exp4> [#] `+ <exp3> @newPlus(Exp,int,Exp)=>Exp
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((6<<5)|0x6)/*nullProductionAction:6*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((14<<5)|0x5)/*methodCall:14*/,
    },
    { // 30: <exp4> ::= <exp3> @pass
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
    },
    { // 31: <exp3> ::= <exp3> [#] `* <exp2> @newTimes(Exp,int,Exp)=>Exp
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((6<<5)|0x6)/*nullProductionAction:6*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((15<<5)|0x5)/*methodCall:15*/,
    },
    { // 32: <exp3> ::= <exp2> @pass
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
    },
    { // 33: <exp2> ::= <cast exp> @pass
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
    },
    { // 34: <exp2> ::= <unary exp> @pass
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
    },
    { // 35: <cast exp> ::= [#] `( <type> `) <cast exp> @newCast(int,Type,Exp)=>Exp
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((6<<5)|0x6)/*nullProductionAction:6*/,
      ((16<<5)|0x5)/*methodCall:16*/,
    },
    { // 36: <cast exp> ::= [#] `( <type> `) <exp1> @newCast(int,Type,Exp)=>Exp
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((6<<5)|0x6)/*nullProductionAction:6*/,
      ((16<<5)|0x5)/*methodCall:16*/,
    },
    { // 37: <unary exp> ::= [#] `- <unary exp> @newUnaryMinus(int,Exp)=>Exp
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((6<<5)|0x6)/*nullProductionAction:6*/,
      ((17<<5)|0x5)/*methodCall:17*/,
    },
    { // 38: <unary exp> ::= <exp1> @pass
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
    },
    { // 39: <exp1> ::= [#] ID @newIdentfierExp(int,String)=>Exp
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((6<<5)|0x6)/*nullProductionAction:6*/,
      ((18<<5)|0x5)/*methodCall:18*/,
    },
    { // 40: <exp1> ::= <exp1> !<empty bracket pair> [#] `[ <exp> `] @newArrayLookup(Exp,int,Exp)=>Exp
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((6<<5)|0x6)/*nullProductionAction:6*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((19<<5)|0x5)/*methodCall:19*/,
    },
    { // 41: <exp1> ::= [#] INTLIT @newIntegerLiteral(int,int)=>Exp
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((6<<5)|0x6)/*nullProductionAction:6*/,
      ((20<<5)|0x5)/*methodCall:20*/,
    },
    { // 42: letter ::= {"A".."Z" "a".."z"} @pass
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
    },
    { // 43: letter128 ::= {193..218 225..250} @sub128(char)=>char
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((21<<5)|0x5)/*methodCall:21*/,
    },
    { // 44: digit ::= {"0".."9"} @pass
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
    },
    { // 45: digit128 ::= {176..185} @sub128(char)=>char
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((21<<5)|0x5)/*methodCall:21*/,
    },
    { // 46: ws ::= " " @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 47: ws ::= {10} [registerNewline] @void
      ((7<<5)|0x6)/*nullProductionAction:7*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 48: `boolean ::= "#" "b" "o" ws* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((3<<5)|0x3)/*popOffPushBack:3*/,
    },
    { // 49: `boolean ::= "#" "b" "o" [ws*] @void
      ((3<<5)|0x6)/*nullProductionAction:3*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((3<<5)|0x3)/*popOffPushBack:3*/,
    },
    { // 50: `class ::= "#" "c" "l" ws* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((3<<5)|0x3)/*popOffPushBack:3*/,
    },
    { // 51: `class ::= "#" "c" "l" [ws*] @void
      ((3<<5)|0x6)/*nullProductionAction:3*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((3<<5)|0x3)/*popOffPushBack:3*/,
    },
    { // 52: `extends ::= "#" "e" "x" ws* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((3<<5)|0x3)/*popOffPushBack:3*/,
    },
    { // 53: `extends ::= "#" "e" "x" [ws*] @void
      ((3<<5)|0x6)/*nullProductionAction:3*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((3<<5)|0x3)/*popOffPushBack:3*/,
    },
    { // 54: `void ::= "#" "v" "o" ws* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((3<<5)|0x3)/*popOffPushBack:3*/,
    },
    { // 55: `void ::= "#" "v" "o" [ws*] @void
      ((3<<5)|0x6)/*nullProductionAction:3*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((3<<5)|0x3)/*popOffPushBack:3*/,
    },
    { // 56: `int ::= "#" "i" "t" ws* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((3<<5)|0x3)/*popOffPushBack:3*/,
    },
    { // 57: `int ::= "#" "i" "t" [ws*] @void
      ((3<<5)|0x6)/*nullProductionAction:3*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((3<<5)|0x3)/*popOffPushBack:3*/,
    },
    { // 58: `if ::= "#" "+" ws* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((2<<5)|0x3)/*popOffPushBack:2*/,
    },
    { // 59: `if ::= "#" "+" [ws*] @void
      ((3<<5)|0x6)/*nullProductionAction:3*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((2<<5)|0x3)/*popOffPushBack:2*/,
    },
    { // 60: `else ::= "#" "e" "l" ws* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((3<<5)|0x3)/*popOffPushBack:3*/,
    },
    { // 61: `else ::= "#" "e" "l" [ws*] @void
      ((3<<5)|0x6)/*nullProductionAction:3*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((3<<5)|0x3)/*popOffPushBack:3*/,
    },
    { // 62: `public ::= "#" "p" "u" ws* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((3<<5)|0x3)/*popOffPushBack:3*/,
    },
    { // 63: `public ::= "#" "p" "u" [ws*] @void
      ((3<<5)|0x6)/*nullProductionAction:3*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((3<<5)|0x3)/*popOffPushBack:3*/,
    },
    { // 64: `* ::= "*" ws* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 65: `* ::= "*" [ws*] @void
      ((3<<5)|0x6)/*nullProductionAction:3*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 66: `( ::= "(" ws* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 67: `( ::= "(" [ws*] @void
      ((3<<5)|0x6)/*nullProductionAction:3*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 68: `) ::= ")" ws* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 69: `) ::= ")" [ws*] @void
      ((3<<5)|0x6)/*nullProductionAction:3*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 70: `{ ::= "{" ws* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 71: `{ ::= "{" [ws*] @void
      ((3<<5)|0x6)/*nullProductionAction:3*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 72: `} ::= "}" ws* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 73: `} ::= "}" [ws*] @void
      ((3<<5)|0x6)/*nullProductionAction:3*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 74: `- ::= "-" ws* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 75: `- ::= "-" [ws*] @void
      ((3<<5)|0x6)/*nullProductionAction:3*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 76: `+ ::= "+" ws* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 77: `+ ::= "+" [ws*] @void
      ((3<<5)|0x6)/*nullProductionAction:3*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 78: `= ::= "=" ws* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 79: `= ::= "=" [ws*] @void
      ((3<<5)|0x6)/*nullProductionAction:3*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 80: `[ ::= "[" ws* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 81: `[ ::= "[" [ws*] @void
      ((3<<5)|0x6)/*nullProductionAction:3*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 82: `] ::= "]" ws* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 83: `] ::= "]" [ws*] @void
      ((3<<5)|0x6)/*nullProductionAction:3*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 84: `; ::= ";" ws* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 85: `; ::= ";" [ws*] @void
      ((3<<5)|0x6)/*nullProductionAction:3*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 86: ID ::= letter128 ws* @text
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x4)/*stringConcat:1*/,
    },
    { // 87: ID ::= letter128 [ws*] @text
      ((3<<5)|0x6)/*nullProductionAction:3*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x4)/*stringConcat:1*/,
    },
    { // 88: ID ::= letter idChar* $$0 @text
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((3<<5)|0x4)/*stringConcat:3*/,
    },
    { // 89: ID ::= letter [idChar*] $$0 @text
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((4<<5)|0x6)/*nullProductionAction:4*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((3<<5)|0x4)/*stringConcat:3*/,
    },
    { // 90: INTLIT ::= {"1".."9"} digit* $$1 @convertToInt(char,List<Character>,char)=>int
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((22<<5)|0x5)/*methodCall:22*/,
    },
    { // 91: INTLIT ::= {"1".."9"} [digit*] $$1 @convertToInt(char,List<Character>,char)=>int
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((5<<5)|0x6)/*nullProductionAction:5*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((22<<5)|0x5)/*methodCall:22*/,
    },
    { // 92: INTLIT ::= digit128 ws* @convertToInt(char)=>int
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((23<<5)|0x5)/*methodCall:23*/,
    },
    { // 93: INTLIT ::= digit128 [ws*] @convertToInt(char)=>int
      ((3<<5)|0x6)/*nullProductionAction:3*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((23<<5)|0x5)/*methodCall:23*/,
    },
    { // 94: INTLIT ::= "0" hexDigit* $$2 @convert16ToInt(char,List<Character>,char)=>int
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((24<<5)|0x5)/*methodCall:24*/,
    },
    { // 95: INTLIT ::= "0" [hexDigit*] $$2 @convert16ToInt(char,List<Character>,char)=>int
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((0<<5)|0x6)/*nullProductionAction:0*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((24<<5)|0x5)/*methodCall:24*/,
    },
    { // 96: idChar ::= letter @pass
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
    },
    { // 97: idChar ::= digit @pass
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
    },
    { // 98: idChar ::= "_" @pass
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
    },
    { // 99: idChar128 ::= letter128 @pass
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
    },
    { // 100: idChar128 ::= digit128 @pass
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
    },
    { // 101: idChar128 ::= {223} @underscore(char)=>char
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((25<<5)|0x5)/*methodCall:25*/,
    },
    { // 102: hexDigit ::= {"0".."9" "A".."Z" "a".."z"} @pass
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
    },
    { // 103: hexDigit128 ::= {176..185 193..198 225..230} @sub128(char)=>char
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((21<<5)|0x5)/*methodCall:21*/,
    },
    { // 104: digit* ::= digit* digit @append
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xb)/*append:1*/,
    },
    { // 105: digit* ::= [digit*] digit @append
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((5<<5)|0x6)/*nullProductionAction:5*/,
      ((1<<5)|0xb)/*append:1*/,
    },
    { // 106: <decl in class>* ::= <decl in class>* <decl in class> @append
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xb)/*append:1*/,
    },
    { // 107: <decl in class>* ::= [<decl in class>*] <decl in class> @append
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((2<<5)|0x6)/*nullProductionAction:2*/,
      ((1<<5)|0xb)/*append:1*/,
    },
    { // 108: hexDigit* ::= hexDigit* hexDigit @append
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xb)/*append:1*/,
    },
    { // 109: hexDigit* ::= [hexDigit*] hexDigit @append
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((0<<5)|0x6)/*nullProductionAction:0*/,
      ((1<<5)|0xb)/*append:1*/,
    },
    { // 110: <stmt>* ::= <stmt>* <stmt> @append
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xb)/*append:1*/,
    },
    { // 111: <stmt>* ::= [<stmt>*] <stmt> @append
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x6)/*nullProductionAction:1*/,
      ((1<<5)|0xb)/*append:1*/,
    },
    { // 112: idChar* ::= idChar* idChar @append
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xb)/*append:1*/,
    },
    { // 113: idChar* ::= [idChar*] idChar @append
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((4<<5)|0x6)/*nullProductionAction:4*/,
      ((1<<5)|0xb)/*append:1*/,
    },
    { // 114: <class decl>+ ::= <class decl> @singleList
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xa)/*singleList:1*/,
    },
    { // 115: <class decl>+ ::= <class decl>+ <class decl> @append
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xb)/*append:1*/,
    },
    { // 116: ws* ::= ws* ws @append
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
    },
    { // 117: ws* ::= [ws*] ws @append
      ((1<<5)|0xe)/*popPos:1*/,
      ((3<<5)|0x6)/*nullProductionAction:3*/,
    },
    { // 118: $$0 ::= idChar128 ws* @pass
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
    },
    { // 119: $$0 ::= idChar128 [ws*] @pass
      ((3<<5)|0x6)/*nullProductionAction:3*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
    },
    { // 120: $$1 ::= digit128 ws* @pass
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
    },
    { // 121: $$1 ::= digit128 [ws*] @pass
      ((3<<5)|0x6)/*nullProductionAction:3*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
    },
    { // 122: $$2 ::= hexDigit128 ws* @pass
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
    },
    { // 123: $$2 ::= hexDigit128 [ws*] @pass
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
      ((26<<5)|0x5)/*methodCall:26*/,
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
      Exp parm0 = (Exp)si.popPb();
      int parm1 = (Integer)si.popPb();
      Exp parm2 = (Exp)si.popPb();
      Statement result = actionObject.assign(parm0,parm1,parm2);
      si.pushPb(result);
    }
    break;
    case 13: {
      Type parm0 = (Type)si.popPb();
      int parm1 = (Integer)si.popPb();
      String parm2 = (String)si.popPb();
      Exp parm3 = (Exp)si.popPb();
      Statement result = actionObject.localVarDecl(parm0,parm1,parm2,parm3);
      si.pushPb(result);
    }
    break;
    case 14: {
      Exp parm0 = (Exp)si.popPb();
      int parm1 = (Integer)si.popPb();
      Exp parm2 = (Exp)si.popPb();
      Exp result = actionObject.newPlus(parm0,parm1,parm2);
      si.pushPb(result);
    }
    break;
    case 15: {
      Exp parm0 = (Exp)si.popPb();
      int parm1 = (Integer)si.popPb();
      Exp parm2 = (Exp)si.popPb();
      Exp result = actionObject.newTimes(parm0,parm1,parm2);
      si.pushPb(result);
    }
    break;
    case 16: {
      int parm0 = (Integer)si.popPb();
      Type parm1 = (Type)si.popPb();
      Exp parm2 = (Exp)si.popPb();
      Exp result = actionObject.newCast(parm0,parm1,parm2);
      si.pushPb(result);
    }
    break;
    case 17: {
      int parm0 = (Integer)si.popPb();
      Exp parm1 = (Exp)si.popPb();
      Exp result = actionObject.newUnaryMinus(parm0,parm1);
      si.pushPb(result);
    }
    break;
    case 18: {
      int parm0 = (Integer)si.popPb();
      String parm1 = (String)si.popPb();
      Exp result = actionObject.newIdentfierExp(parm0,parm1);
      si.pushPb(result);
    }
    break;
    case 19: {
      Exp parm0 = (Exp)si.popPb();
      int parm1 = (Integer)si.popPb();
      Exp parm2 = (Exp)si.popPb();
      Exp result = actionObject.newArrayLookup(parm0,parm1,parm2);
      si.pushPb(result);
    }
    break;
    case 20: {
      int parm0 = (Integer)si.popPb();
      int parm1 = (Integer)si.popPb();
      Exp result = actionObject.newIntegerLiteral(parm0,parm1);
      si.pushPb(result);
    }
    break;
    case 21: {
      char parm0 = (Character)si.popPb();
      char result = actionObject.sub128(parm0);
      si.pushPb(result);
    }
    break;
    case 22: {
      char parm0 = (Character)si.popPb();
      List<Character> parm1 = (List<Character>)si.popPb();
      char parm2 = (Character)si.popPb();
      int result = actionObject.convertToInt(parm0,parm1,parm2);
      si.pushPb(result);
    }
    break;
    case 23: {
      char parm0 = (Character)si.popPb();
      int result = actionObject.convertToInt(parm0);
      si.pushPb(result);
    }
    break;
    case 24: {
      char parm0 = (Character)si.popPb();
      List<Character> parm1 = (List<Character>)si.popPb();
      char parm2 = (Character)si.popPb();
      int result = actionObject.convert16ToInt(parm0,parm1,parm2);
      si.pushPb(result);
    }
    break;
    case 25: {
      char parm0 = (Character)si.popPb();
      char result = actionObject.underscore(parm0);
      si.pushPb(result);
    }
    break;
    case 26: {
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
