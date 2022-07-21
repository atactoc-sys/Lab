

public class ValueArrayUpdated {
    public static void main(String args[]){
        int [] arr = {2011,2012,2013,2014,2015,2016,2017,2018,2019,2022};// array initialization & declaration
        int search = 2018;
        for (int i=0;i<arr.length;i++){//for each loop
            if (arr[i] == search){//logic part
                System.out.println("number found at index  =  "+i);
            }
            
        }

    }
}

