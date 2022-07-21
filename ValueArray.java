package Array;

public class ValueArray {
    public static void main(String args[]){
        int [] arr = {2011,2012,2013,2014,2015,2016,2017,2018,2019,2022};// array initialization & declaration
        int search = 2018;
        for (int n : arr){//for each loop
            if (n == search){//logic part
                System.out.println("number found");
            }
            
        }

    }
}
