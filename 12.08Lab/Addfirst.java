package Collection.Linklist;

import java.util.LinkedList;

public class Addfirst
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
        //ADD FIRST METHOD
        l1.addFirst("Skill");
        System.out.println("now  :   "+l1);
    }
}
