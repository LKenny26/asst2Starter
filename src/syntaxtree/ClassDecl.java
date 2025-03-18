package syntaxtree;

import java.util.HashMap;

import visitor.Visitor;

/**
 * a class declaration
 */
public class ClassDecl extends Decl
{
    // instance variables filled in by constructor
    public String superName; // superclass name
    public DeclList decls; // list of declarations

    // instance variables filled in during later phases
    public ClassDecl superLink; // link to superclass declaration
    public ClassDeclList subclasses; // list of subclasses
    public HashMap<String,InstVarDecl> instVarTable; // symbol table for instance variables
    public HashMap<String,MethodDecl> methodTable; // symbol table for methods
    public int numDataInstVars; // number of non-object instance variables
    public int numObjInstVars; // number of object instance variables

    /**
     * constructor
     * @param pos file position
     * @param aname the name being declared
     * @param asuperName the name of the superclass
     * @param aDeclList the list of declarations inside the class
     */
    public ClassDecl(int pos, String aname, String asuperName,
                     DeclList aDeclList)
    {
        super(pos, aname);
        superName=asuperName;
        decls = aDeclList;
        superLink = null;
        subclasses = new ClassDeclList();
        instVarTable = new HashMap<String,InstVarDecl>();
        methodTable = new HashMap<String,MethodDecl>();
    }

    /*** remaining methods are visitor- and display-related ***/

    public Object accept(Visitor v)
    {
        return v.visit(this);
    }
}
