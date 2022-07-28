package String;

public class SequenceLab {
    public static String find(String s){//METHOD
        if (s.matches("[a-z]+_+[a-z]+$")){// LOGIC
            return "Found a Match";
        }
        else {
            return "Not Matched";
        }
    }
    public static void main(String[] args) {
        System.out.println(find("java_exercises"));
        System.out.println(find("Java_Exercises"));

    }
}
