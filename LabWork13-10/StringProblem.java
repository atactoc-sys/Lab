package LabWork;

import java.util.Scanner;

public class StringProblem
{
    public static void stringTasks()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter 1st string");
        String a = sc.next();
        System.out.println("enter 2nd string");
        String b = sc.next();

        System.out.println("String a =  "+a.toLowerCase());  //   to get lowercase text
        System.out.println("String b =  "+b.toLowerCase());  //   to get lowercase text


        System.out.println("-------------PROBLEM STATEMENT 1-------------");
        System.out.println("Sum of 2 String's character length  ");
        System.out.println(a.length()+b.length());  //   to get character length

        System.out.println("-------------PROBLEM STATEMENT 2-------------");
        int r = a.compareTo(b);   //   lexicographic checker
        if(r < 0)
        {
            System.out.println("Result = True");
        }
        else
        {
            System.out.println("Result = False");
        }

        System.out.println("-------------PROBLEM STATEMENT 3-------------");
        //   capitalizing first letter of both string and adding the strings together
        System.out.println(a.substring(0,1).toUpperCase()+a.substring(1).toLowerCase()+b.substring(0,1).toUpperCase()+b.substring(1).toLowerCase());

    }
    public static void main(String[] args)
    {
        stringTasks();
    }
}
