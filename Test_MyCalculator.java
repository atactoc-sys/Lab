package in.interf;

import java.util.Scanner;

public class Test_MyCalculator {
   public static void main(String args[]){
       MyCalculator obj = new MyCalculator();
       Scanner sc = new Scanner(System.in);
       int n = sc.nextInt();
       System.out.println(obj.divisor_sum(n));

   }
}
