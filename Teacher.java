

public class Teacher {// super class
    String collegeName = "RERF";
    String designation = "HOD";
    void work(){
        System.out.println("details");
    }
}
class IITteacher extends Teacher{//sub class
    public static void main (String args[]){
         IITteacher obj = new IITteacher();
         System.out.println("name of college : "+obj.collegeName);
         System.out.println("designation : "+obj.designation);
    }
}
