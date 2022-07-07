// it is " is a " relationship, multilevel inheritence

public class A {//super class
    void one(){
        System.out.println("I");
    }
}
class B extends A{//sub class 
    void two(){
        System.out.println("am");
    }
}
class C extends B{//sub class
    void three(){
        System.out.println("Daku");
    }
    class Test{
        public static void main(String args[]){
            C obj = new C();
            obj.one();
            obj.two();
            obj.three();
        }
    }
}
