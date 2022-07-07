public class Bank {//suoer class
    float getRateOfInterest(){
        return 0;
        
    }
   
}
class Sbi extends Bank{//sub class
    float getRateOfInterest(){
        return 8;
    }
}
class Icici extends Bank{//sub class
    float getRateOfInterest(){
        return 7;
    }
}
class Axis extends Bank{//sub class
    float getRateOfInterest(){
        return 9;
    }
}
class Rate{
    public static void main (String args[]){
        Sbi obj = new Sbi();
        Icici obj2 = new Icici();
        Axis  obj3 = new Axis();
        System.out.println("Sbi :"+obj.getRateOfInterest());
        System.out.println("Icici :"+obj2.getRateOfInterest());
        System.out.println("Axis :"+obj3.getRateOfInterest());
    }
}
