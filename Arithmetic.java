public class Arithmetic {// super class
    int num1;
    int num2;
    void insert(int a, int b){
        num1=a;
        num2=b;
    }
    void add(){
        System.out.println(num1+num2);
    }
}

  class Adder extends Arithmetic{//sub class
    public static void main(String args[]){
    Adder obj = new Adder();
    obj.insert(66,44);
    obj.add();
}
}
