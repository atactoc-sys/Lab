// FACTORIAL OF n


import java.util.*;


public class Factorial {
    public static void main (String Args[]){
        Scanner sc = new Scanner (System.in);
        int n = sc.nextInt();
        int j = 1;
        // LOOP
        for(int i=n;i>=1;i--){//  LOGIC
            j = j*i;
        }
        System.out.println(j);


    }
}
