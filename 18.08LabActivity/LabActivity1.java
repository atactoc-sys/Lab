package Lab1808;

import java.util.ArrayList;

public class LabActivity1
{
    //  creating array list
    ArrayList<Integer> l = new ArrayList<Integer>();
    //  method to store 2 to N even number
    ArrayList<Integer> storeEvenNumbers (int N)
    {
        l = new ArrayList<Integer>();
        for (int i = 2; i<=N; i+=2)
        {
            l.add(i);
        }
        return l;
    }

    //  method to iterate through the arraylist and multiply each with 2
    ArrayList<Integer> printEvenNumbers()
    {
        ArrayList<Integer> A1 =new ArrayList<Integer>();
        for (int num : l)
        {
            A1.add(num * 2);
            System.out.println(num * 2);
        }
        return A1;
    }

    //  Main method
    public static void main(String[] args)
    {
        //CREATING OBJECT
        LabActivity1 obj = new LabActivity1();

        //CALLING storeEvenNumbers()
        obj.storeEvenNumbers(16);

        //  CALLING printEvenNumbers()
        obj.printEvenNumbers();
    }
}
