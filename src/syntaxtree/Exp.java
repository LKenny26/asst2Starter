package syntaxtree;

import visitor.Visitor;

/**
 * an expression (abstract)
 */
public abstract class Exp extends AstNode
{

    // instance variables filled in by constructor
    public Type type; // the expression's type

    /**
     * constructor
     * @param pos file position
     */
    public Exp(int pos)
    {
        super(pos);
        type=null;
    }

    /*** remaining methods are visitor- and display-related ***/

    public Object accept(Visitor v)
    {
        return v.visit(this);
    }
}
