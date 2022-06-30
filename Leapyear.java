import java.util.*;
class Leapyear{
    public static void main (String args[]){
        Scanner sc = new Scanner(System.in);//object created
        int a = sc.nextInt();//taking userinput
        
        if (a % 4 == 0){  // conditional part
            System.out.println("LEAP YEAR");
        }
        else{
            System.out.println("NOT LEAP YEAR");
        }
    }
}

