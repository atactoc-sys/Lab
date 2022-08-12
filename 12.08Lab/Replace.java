package Collection.Linklist;

import java.util.LinkedList;

public class Replace
{
    public static void main(String[] args)
    {// CREATING LIST
        LinkedList<String> l1 = new LinkedList<String>();
        l1.add(" RED");
        l1.add("GREEN");
        l1.add("ORANGE");
        l1.add("WHITE");
        l1.add("BLACK");
        System.out.println("first  :  "+l1);
        // REPLACE METHOD
        l1.set(2,"QWERT");
        System.out.println(l1);
    }
}
