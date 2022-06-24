import java.util.Scanner;

Help

class InputUser { public static void main(String[] args) {

Scanner input = new Scanner(System.in);

String name;

System.out.print("Enter Your name: "); name = input.nextLine();

System.out.println("My name is: " + name);

}
