package parse;
import java.beans.Expression;
import java.util.List;
import errorMsg.*;
import syntaxtree.*;
import wrangLR.runtime.MessageObject;
import wrangLR.runtime.FilePosObject;

public class MJGrammar implements MessageObject, FilePosObject
{

    // constructor
    // @param em error-message object
    public MJGrammar(ErrorMsg em)
    {
        errorMsg = em;
        topObject = null;
    }

    // error message object
    private ErrorMsg errorMsg;

    // object to be returned by the parser
    private Program topObject;

    // These 2 methods are needed by WrangLR
    // DO NOT USE THEM! They will not pass tests
    // We don't need any errors or warnings in this assignment.
    public void warning(int pos, String msg)
    {
        errorMsg.info(pos, msg);
    }

    public void error(int pos, String msg)
    {
        errorMsg.error(pos, msg);
    }

    // method for converting file position to line/char position
    // @param pos the file position
    // @return the string that denotes the file position
    public String filePosString(int pos)
    {
        return errorMsg.lineAndChar(pos);
    }

    // method that registers a newline
    // @param pos the file position of the newline character
    public void registerNewline(int pos)
    {
        errorMsg.newline(pos-1);
    }

    // returns the object produced by the parse
    // @return the top-level object produced by the parser
    public Program parseResult()
    {
        return topObject;
    }

    //===============================================================
    // start symbol
    //===============================================================

    //: <start> ::= ws* <program> =>
    public void topLevel(Program obj)
    {
        topObject = obj;
    }

    //================================================================
    // top-level constructs
    //================================================================

    //: <program> ::= # <class decl>+ =>
    public Program createProgram(int pos, List<ClassDecl> vec)
    {
        return new Program(pos, new ClassDeclList(vec));
    }

    // This is one where it doesnt extend so it should just be object and 
    // was prewritten
    //: <class decl> ::= `class # ID `{ <decl in class>* `} =>
    public ClassDecl createClassDecl(int pos, String name, List<Decl> vec)
    {
        return new ClassDecl(pos, name, "Object", new DeclList(vec));
    }

     // what to do when it does actually extend
    //: <class decl> ::= `class # ID `extends ID `{ <decl in class>* `} =>
    public ClassDecl creatClassDecl(int pos, String name, String extension, List<Decl> vec) {
        return new ClassDecl(pos, name, extension, new DeclList(vec));
    }

    //: <decl in class> ::= <method decl> => pass

    //: <method decl> ::= `public `void # ID `( `) `{ <stmt>* `} =>
    public Decl createMethodDeclVoid(int pos, String name, List<Statement> stmts)
    {
        return new MethodDeclVoid(pos, name, new VarDeclList(new VarDeclList()),
                                  new StatementList(stmts));
    }

    //: <type> ::= # `int =>
    public Type intType(int pos)
    {
        return new IntegerType(pos);
    }
    //: <type> ::= # `boolean =>
    public Type booleanType(int pos)
    {
        return new BooleanType(pos);
    }
    //: <type> ::= # ID =>
    public Type identifierType(int pos, String name)
    {
        return new IdentifierType(pos, name);
    }
    //: <type> ::= # <type> <empty bracket pair> =>
    public Type newArrayType(int pos, Type t, Object dummy)
    {
        return new ArrayType(pos, t);
    }

    //: <empty bracket pair> ::= `[ `] => null

    //================================================================
    // statement-level constructs
    //================================================================

    //: <stmt> ::= <assign> `; => pass

    //: <stmt> ::= # `{ <stmt>* `} =>
    public Statement newBlock(int pos, List<Statement> sl)
    {
        return new Block(pos, new StatementList(sl));
    }
    //: <stmt> ::= <local var decl> `; => pass

    //What to do if there is no else in the if statement
    //: <stmt> ::= `if # `( <exp> `) <stmt> !`else =>
    public Statement if_no_else_maker(int pos, Exp if_exp, Statement true_st) {
        Statement false_st = new Block(pos, new StatementList());
        return new If(pos, if_exp, true_st, false_st);
    }

    // What to do if there is an else statement
    //: <stmt> ::= `if # `( <exp> `) <stmt> `else <stmt> =>
    public Statement if_maker(int pos, Exp if_exp, Statement true_st, Statement false_st){
        return new If(pos,if_exp,true_st,false_st);
    }

    //make a loop with no expression
    //: <stmt> ::= `while # `( !<exp> `) <stmt> =>
    public Statement while_no_exp(int pos, Statement while_to_do){
        Exp true_exp = new True(pos);
        return new While(pos, true_exp, while_to_do);
    }

    //make a while loop 
    //: <stmt> ::= `while # `( <exp> `) <stmt> =>
    public Statement while_maker(int pos, Exp while_exp, Statement while_to_do) {
        return new While(pos, while_exp, while_to_do);
    }

    //make a for loop a while loop
    //: <stmt> ::= `for # `( <stmt> `; <exp> `; <stmt> `) <stmt> =>
    public Statement for_to_while(int pos, Statement c1, Exp c2, Statement c3, Statement for_body) {
        //while body is the for body plus clause 3
        StatementList while_body = new StatementList();
        while_body.add(for_body);
        while_body.add(c3);
        Statement while_body_block = new Block(pos, while_body);
        While while_loop =  new While(pos, c2, while_body_block);

        StatementList for_block = new StatementList();
        for_block.add(c1);
        for_block.add(while_loop);
         return new Block(pos, for_block);
    }

    


    //: <assign> ::= <exp> # `= <exp> =>
    public Statement assign(Exp lhs, int pos, Exp rhs)
    {
        return new Assign(pos, lhs, rhs);
    }

    //: <assign> ::= <exp> # `++ =>
    public Statement increment(Exp incrementee, int pos){
        Exp one = new IntegerLiteral(pos, 1);
        Exp incremented = new Plus(pos, incrementee, one);
        return new Assign(pos, incrementee, incremented);
    }

    //: <local var decl> ::= <type> # ID `= <exp> =>
    public Statement localVarDecl(Type t, int pos, String name, Exp init)
    {
        return new LocalDeclStatement(pos, new LocalVarDecl(pos, t, name, init));
    }

    //================================================================
    // expressions
    //================================================================

    //: <exp> ::= <exp8> => pass

    // these precedence levels have not been filled in at all, so there
    // are only pass-through productions
    //: <exp8> ::= <exp7> => pass
    //: <exp7> ::= <exp6> => pass
    //: <exp6> ::= <exp5> => pass
    //: <exp5> ::= <exp4> => pass

    // these remaining precedence levels have been filled in to some extent,
    // but most or all of them have need to be expanded

    //: <exp4> ::= <exp4> # `+ <exp3> =>
    public Exp newPlus(Exp e1, int pos, Exp e2)
    {
        return new Plus(pos, e1, e2);
    }
    //: <exp4> ::= <exp3> => pass

    //: <exp3> ::= <exp3> # `* <exp2> =>
    public Exp newTimes(Exp e1, int pos, Exp e2)
    {
        return new Times(pos, e1, e2);
    }
    //: <exp3> ::= <exp2> => pass

    //: <exp2> ::= <cast exp> => pass
    //: <exp2> ::= <unary exp> => pass

    //: <cast exp> ::= # `( <type> `) <cast exp> =>
    public Exp newCast(int pos, Type t, Exp e)
    {
        return new Cast(pos, t, e);
    }
    //: <cast exp> ::= # `( <type> `) <exp1> => Exp newCast(int, Type, Exp)

    //: <unary exp> ::= # `- <unary exp> =>
    public Exp newUnaryMinus(int pos, Exp e)
    {
        return new Minus(pos, new IntegerLiteral(pos, 0), e);
    }
    //: <unary exp> ::= <exp1> => pass

    //: <exp1> ::= # ID  =>
    public Exp newIdentfierExp(int pos, String name)
    {
        return new IdentifierExp(pos, name);
    }
    //: <exp1> ::= <exp1> !<empty bracket pair> # `[ <exp> `] =>
    public Exp newArrayLookup(Exp e1, int pos, Exp e2)
    {
        return new ArrayLookup(pos, e1, e2);
    }
    //: <exp1> ::= # INTLIT =>
    public Exp newIntegerLiteral(int pos, int n)
    {
        return new IntegerLiteral(pos, n);
    }

    //================================================================
    // Lexical grammar for filtered language begins here: DO NOT
    // MODIFY ANYTHING BELOW THIS, UNLESS YOU REPLACE IT WITH YOUR
    // ENTIRE LEXICAL GRAMMAR, and set the constant FILTER_GRAMMAR
    // (defined near the top of this file) to false.
    //================================================================

    //: letter ::= {"a".."z" "A".."Z"} => pass
    //: letter128 ::= {225..250 193..218} =>
    public char sub128(char orig)
    {
        return (char)(orig-128);
    }
    //: digit ::= {"0".."9"} => pass
    //: digit128 ::= {176..185} => char sub128(char)
    //: any ::= {0..127} => pass
    //: any128 ::= {128..255} => char sub128(char)
    //: ws ::= " "
    //: ws ::= {10} registerNewline
    //: registerNewline ::= # => void registerNewline(int)
    //: `boolean ::= "#bo" ws*
    //: `class ::= "#cl" ws*
    //: `extends ::= "#ex" ws*
    //: `void ::= "#vo" ws*
    //: `int ::= "#it" ws*
    //: `while ::= "#wh" ws*
    //: `if ::= '#+' ws*
    //: `else ::= "#el" ws*
    //: `for ::= "#fo" ws*
    //: `break ::= "#br" ws*
    //: `this ::= "#th" ws*
    //: `false ::= '#fa' ws*
    //: `true ::= "#tr" ws*
    //: `super ::= "#su" ws*
    //: `null ::= "#nu" ws*
    //: `return ::= "#re" ws*
    //: `instanceof ::= "#in" ws*
    //: `new ::= "#ne" ws*
    //: `case ::= "#ce" ws*
    //: `default ::= "#de" ws*
    //: `do ::= "#-" ws*
    //: `public ::= "#pu" ws*
    //: `switch ::= "#sw" ws*

    //: `! ::=  "!" ws* => void
    //: `!= ::=  "@!" ws* => void
    //: `% ::= "%" ws* => void
    //: `&& ::= "@&" ws* => void
    //: `* ::= "*" ws* => void
    //: `( ::= "(" ws* => void
    //: `) ::= ")" ws* => void
    //: `{ ::= "{" ws* => void
    //: `} ::= "}" ws* => void
    //: `- ::= "-" ws* => void
    //: `+ ::= "+" ws* => void
    //: `= ::= "=" ws* => void
    //: `== ::= "@=" ws* => void
    //: `[ ::= "[" ws* => void
    //: `] ::= "]" ws* => void
    //: `|| ::= "@|" ws* => void
    //: `< ::= "<" ws* => void
    //: `<= ::= "@<" ws* => void
    //: `, ::= "," ws* => void
    //: `> ::= ">"  !'=' ws* => void
    //: `>= ::= "@>" ws* => void
    //: `: ::= ":" ws* => void
    //: `. ::= "." ws* => void
    //: `; ::= ";" ws* => void
    //: `++ ::= "@+" ws* => void
    //: `-- ::= "@-" ws* => void
    //: `/ ::= "/" ws* => void


    //: ID ::= letter128 ws* => text
    //: ID ::= letter idChar* idChar128 ws* => text

    //: INTLIT ::= {"1".."9"} digit* digit128 ws* =>
    public int convertToInt(char c, List<Character> mid, char last)
    {
        return Integer.parseInt(""+c+mid+last);
    }
    //: INTLIT ::= digit128 ws* =>
    public int convertToInt(char c)
    {
        return Integer.parseInt(""+c);
    }
    //: INTLIT ::= "0" hexDigit* hexDigit128 ws* =>
    public int convert16ToInt(char c, List<Character> mid, char last)
    {
        return Integer.parseInt(""+c+mid+last, 16);
    }
    //: STRINGLIT ::= '@"' ws* =>
    public String emptyString(char x, char xx)
    {
        return "";
    }
    //: STRINGLIT ::= '"' any* any128 ws* =>
    public String string(char x, List<Character> mid, char last)
    {
        return ""+mid+last;
    }
    //: CHARLIT ::= "'" any ws* =>
    public int charVal(char x, char val)
    {
        return val;
    }

    //: idChar ::= letter => pass
    //: idChar ::= digit => pass
    //: idChar ::= "_" => pass
    //: idChar128 ::= letter128 => pass
    //: idChar128 ::= digit128 => pass
    //: idChar128 ::= {223} =>
    public char underscore(char x)
    {
        return '_';
    }
    //: hexDigit ::= {"0".."9" "A".."Z" "a".."z"} => pass
    //: hexDigit128 ::= {176..185 225..230 193..198} => char sub128(char)

}
