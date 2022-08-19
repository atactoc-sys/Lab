package Lab1808;

import java.util.HashSet;
import java.util.Iterator;

public class LabActivity2
{
    //  HASHSET
    HashSet<String> H1 = new HashSet<String>();

    //  METHOD TO ADD PASSED COUNRTY
    HashSet<String> storeCountryNames(String CountryName)
    {
        H1.add(CountryName);
        System.out.println("ADDED ELEMENTS");
        System.out.println(H1);
        return H1;
    }

    //  METHOD TO ITERATE THROUGH THE HASHSET
    HashSet<String> receiveCountry(String CountryNam)
    {
        //  ITERATION
        Iterator<String> itr = H1.iterator();
        while (itr.hasNext())
        {
            //  INNER LOOP
            if (itr.next().equals(CountryNam))
            {
                System.out.println(CountryNam+"    COUNTRY EXIST IN THE HASSET");
            }
        }
        return null;
    }

    //  MAIN METHOD
    public static void main(String[] args)
    {
        //  CREATING OBJECT
        LabActivity2 obj = new LabActivity2();

        //  CALLING toreCountryNames() METHOD AND INSERTING COUNTRY NAMES
        obj.storeCountryNames("India");
        obj.storeCountryNames("Japan");
        obj.storeCountryNames("Nepal");
        obj.storeCountryNames("Usa");

        //  CALLING receiveCountry() TO CHECK HASHSET
        obj.receiveCountry("India");
        obj.receiveCountry("Japan");

    }

}
