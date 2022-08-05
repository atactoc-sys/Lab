package Exceotion;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionLab2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            try {
                int a = new Integer(sc.nextInt());
                int b = new Integer(sc.nextInt());
                System.out.println(a/b);
            }catch (InputMismatchException e){
                System.out.println("java.util.InputMismatchException");
            }
        }catch (Exception e){
            System.out.println(e);
        }
    }
}
