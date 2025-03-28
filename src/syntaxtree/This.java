package syntaxtree;

import visitor.Visitor;

/**
 * the expression, 'this'
 */
public class This extends Exp
{

    /**
     * constructor
     * @param pos file position
     */
    public This(int pos)
    {
        super(pos);
    }

    /*** remaining methods are visitor- and display-related ***/

    public Object accept(Visitor v)
    {
        return v.visit(this);
    }

}
