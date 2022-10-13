package LabWork;

import java.util.Scanner;

public class NumberChecker
{
    //  method
    public static void checkNumber()
    {
        int n;
        Scanner sc = new Scanner(System.in);  //   created scanner class object to get input from user
        n = sc.nextInt();
        //  for loop to get all numbers
        for (int i =0; i <= n; i++)
        {
            if (((i % 3) == 0) && ((i % 5) == 0))  // condition 1
            {
                System.out.println("Good Morning");
            } else if ((i % 3) == 0)  // condition 2
            {
                System.out.println("Good");
            } else if ((i % 5) == 0)  // condition 3
            {
                System.out.println("Morning");
            } else
            {
                System.out.println(i);  // default
            }
        }
    }

    public static void main(String[] args)
    {
        //  called method in main
        checkNumber();
    }
}