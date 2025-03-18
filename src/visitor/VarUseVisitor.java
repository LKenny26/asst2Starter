
package visitor;

import syntaxtree.*;
import java.util.*;

public class VarUseVisitor extends Visitor
{
    public HashMap<String, Integer> uses;

    public VarUseVisitor()
    {
        uses = new HashMap<String,Integer>();
    }

    public Object visit(IdentifierExp e)
    {
        if(uses.containsKey(e.name))
        {
            uses.put(e.name, uses.get(e.name)+1);
        }
        else
        {
            uses.put(e.name, 1);
        }
        return null;
    }

    public Object visit(InstVarAccess e)
    {
        if(uses.containsKey(e.varName))
        {
            uses.put(e.varName, uses.get(e.varName)+1);
        }
        else
        {
            uses.put(e.varName, 1);
        }
        return null;
    }

}
