package Collection.Linklist;

import java.util.ArrayList;
import java.util.List;

public class CompareList
{
    public static void main(String[] args)
    {// CREATING LIST1
        List<String> al1 = new ArrayList<String>();
        // CREATING LIST2
        List<String> al2 = new ArrayList<String>();

        //LIST1 MEMBERS
        al1.add(" RED");
        al1.add("GREEN");
        al1.add("ORANGE");
        al1.add("WHITE");
        al1.add("BLACK");
        System.out.println(al1);

        //LIST 2 MEMBERS
        al2.add(" RED");
        al2.add("GREEN");
        al2.add("ORANGE");
        al2.add("BLACK");
        System.out.println(al2);

        //COMPARING
        boolean b = al1.equals(al2);
        System.out.println(b);
    }
}
