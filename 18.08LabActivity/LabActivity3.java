package Lab1808;

import java.util.*;

public class LabActivity3
{
    HashMap<String,String> M1 = new HashMap<String,String>();
    //  METHOD TO ADD ELEMENTS
    HashMap<String,String> saveCountryCapital(String CountryName,String Capital)
    {
        M1 = new HashMap<String,String>();
        M1.put(CountryName,Capital);
        System.out.println(M1);
        return M1;
    }

    //METHOD TO GET CAPITAL
    String receiveCapital(String CountryName)
    {
        System.out.println(M1.get(CountryName));
        return M1.get(CountryName);
    }

    //METHOD TO GET COUNTRY NAME
    String receiveCountry(String capitalname)
    {
        Set<Map.Entry<String,String>> set = M1.entrySet();
        Iterator<Map.Entry<String,String>> it = set.iterator();

        while (it.hasNext())
        {
            Map.Entry<String,String> mw = it.next();
            if (mw.getValue().equals(capitalname))
            {
                System.out.println(mw.getKey());
                return mw.getKey();
            }
        }
        return null;
    }

    //METHOD TO SWAP VALUES
    HashMap<String,String> exchangeValue()
    {
        HashMap<String,String> M2 = new HashMap<String,String>();
        Set<Map.Entry<String,String>> set = M1.entrySet();
        Iterator<Map.Entry<String,String>> it = set.iterator();

        while (it.hasNext())
        {
            Map.Entry<String,String> mw = it.next();
            M2.put(mw.getValue(),mw.getKey());

        }
        System.out.println(M2);
        return M2;
    }

    //  ARRAYlIST TO STORE
    ArrayList<String> toArrayList()
    {
        ArrayList<String> list = new ArrayList<>();
        Set<Map.Entry<String,String>> set = M1.entrySet();
        Iterator<Map.Entry<String,String>> it = set.iterator();

        while (it.hasNext())
        {
            Map.Entry<String,String> mw = it.next();
            list.add(mw.getValue());
        }
        return list;
    }

    //MAIN METHOD
    public static void main(String[] args)
    {
        LabActivity3 obj = new LabActivity3();
        obj.saveCountryCapital("INDIA","DELHI");
        obj.saveCountryCapital("JAPAN","TOKIO");
        obj.receiveCountry("DELHI");
        obj.receiveCapital("JAPAN");
        obj.exchangeValue();
        obj.toArrayList();


    }

}
