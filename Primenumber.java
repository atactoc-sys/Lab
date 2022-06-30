
public class Primenumber {
    public static void main(String aString[]){
        int n = 89;
        boolean flag = false;
        for(int i=2;i<=n;i++){
            if(n%i==0){
                flag=true;
                break;
            }
        }
        if(!flag)
        System.out.println("prime");
        else
        System.out.println("not prime");
    }
}
