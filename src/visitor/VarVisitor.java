package visitor;

import syntaxtree.*;
import visitor.*;
import java.util.*;

public class VarVisitor extends Visitor
{

    public HashMap<String, Integer> uses;

    public VarVisitor()
    {
        uses = new HashMap<String, Integer>();
    }


    public Object visit(InstVarAccess e)
    {
        if(uses.containsKey(e.varName))
            uses.put(e.varName, uses.get(e.varName)+1);
        else
            uses.put(e.varName, 1);
        e.exp.accept(this);
        return null;
    }

    public Object visit(IdentifierExp e)
    {
        if(uses.containsKey(e.name))
            uses.put(e.name, uses.get(e.name)+1);
        else
            uses.put(e.name, 1);
        return null;
    }

}
