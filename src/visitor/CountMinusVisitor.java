package visitor;

import java.io.PrintStream;
import syntaxtree.*;

public class CountMinusVisitor extends Visitor
{

    private int minus = 0;

    public CountMinusVisitor()
    {
        minus = 0;
    }

    @Override
    public Object visit(Minus n)
    {
        minus++;
        n.left.accept(this);
        n.right.accept(this);
        return null;
    }

    public int getMinus()
    {
        return minus;
    }
}
