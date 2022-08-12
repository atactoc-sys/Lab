package Collection;

import java.util.ArrayList;
import java.util.List;

public class ExtractPosition
{
    public static void main(String[] args)
    {// CREATING LIST
        List<String> d = new ArrayList<String>();
        d.add(" RED");
        d.add("GREEN");
        d.add("ORANGE");
        d.add("WHITE");
        d.add("BLACK");
        System.out.println(d);
        // EXTRACTING
        List<String> d1 = d.subList(0,3);
        // NEW LIST
        System.out.println(d1);
    }
}
