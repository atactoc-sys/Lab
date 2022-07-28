package String;

import java.util.StringTokenizer;

public class StringLab {
    public static void show(){
        StringTokenizer kl = new StringTokenizer("C:\\IBM\\DB2\\PROGRAM\\DB2COPY1.EXE","\\");
        System.out.println("Drive  :  "+kl.nextToken());
        System.out.println("Folder  :  "+kl.nextToken()+"||"+kl.nextToken()+"||"+kl.nextToken());
        System.out.println("File  :  "+kl.nextToken());
    }
    public static void main(String[] args) {
        System.out.println("PROBLEM STATEMENTV 1------------------------------------------------------");

        String s = "Welcome to Java World";// STRING CREATED
        System.out.println(s);
        char s1 = s.charAt(5);
        System.out.println("5th character ts  :  "+s1);//5TH CHARACTER RETURN
        System.out.println("Compare  :  "+s.compareTo("Welcome"));//COMPARING
        String s2 = s.concat("-Let us learn");//CONCATENATE
        System.out.println("Concat  :  "+s2);
        System.out.println("1st a comes im position  :  "+s.indexOf('a'));//RETURN FIRST OCCURANCE OF "a" AND DISPLAY IT
        String s3 = s2.replace('a','e');//REPLACING A TO E
        System.out.println("Replace  :  "+s3);
        System.out.println("Returning string  :  "+s3.substring(4,10));//RETURN STRING BETWWEEN 4 TO M10
        System.out.println("Lowercase  :  "+s3.toLowerCase());//DISPLAY LOWER CASE OF THE  PRESENT STRING

        System.out.println("PROBLEM STATEMENT 2-----------------------------------------------------");

        StringBuffer gh = new StringBuffer("This is StringBuffer");
        gh.append("-This is sample program");//ADD STRING
        System.out.println(gh);
        gh.insert(21,"Object");//INSERT THE STRING "OBJECT"
        System.out.println(gh);
        gh.replace(14,20,"Builder");//REPLACE "BUFFER" WITH "BUILDER"
        System.out.println(gh);
        System.out.println("Reverse  :  "+gh.reverse());//REVERSE PRINT

        System.out.println("PROBLEM STATEMENT 3----------------------------------------------------");

        show();

    }

}
