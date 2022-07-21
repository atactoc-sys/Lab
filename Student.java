package Array;

public class Student {
    int Student_No;
    String Name;
    String Address;
    String Email_Id;
    double Fees;
    double Increased_Fees;

    public Student(int Student_No, String Name, String Address, String Email_Id, double Fees){//constructer
        this.Student_No=Student_No;
        this.Name=Name;
        this.Address=Address;
        this.Email_Id=Email_Id;
        this.Fees=Fees;


    }
    void Increased_Fees() {//method
        if (Fees < 2000.00) {
            Increased_Fees=( Fees + (Fees/10));
            System.out.println(Increased_Fees);
        }
        else {
            System.out.println(Fees);
        }

    }
    void Display(){
        System.out.println(Student_No+"  "+Name+"  "+Address+"  "+Email_Id+"  "+Fees+"  "+Increased_Fees);
    }

}

class Student_Details{
    public static void main (String args[]){
        Student a [] = new Student[5];
        a[0] = new Student(1,"Munna","Arambagh,Hooghly,West Bengal","123@email",1500.00);
        a[1] = new Student(2,"Daku","Arambagh,Hooghly,West Bengal","6598@email",1600.00);
        a[2] = new Student(3,"Arin","Burdwan,West Bengal","7845@email",1700.00);
        a[3] = new Student(4,"Kartick","Burdwan,West Bengal","3698@email",1900.00);
        a[4] = new Student(5,"Joti","Arambagh,Hooghly,West Bengal","2147@email",2200.00);
        a[0].Increased_Fees();
        a[1].Increased_Fees();
        a[2].Increased_Fees();
        a[3].Increased_Fees();
        a[4].Increased_Fees();
        for (Student i:a){
            i.Display();
        }
    }
}