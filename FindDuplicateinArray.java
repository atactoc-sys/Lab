package Array;

public class FindDuplicateinArray {
    public static void main (String args[]){
        int[] arr = {22,11,22,66,55,44,55,99,66,};// array declaration & initialization
        int length = arr.length;
        for (int i = 0; i < arr.length -1; i++){//to select an element
            for (int j = i + 1; j < arr.length; j++){// to compare the element
                if ((arr[i] == arr[j]) && (i != j)){//logic to find duplicate
                    System.out.println("duplicate  =  "+arr[j]);
                }
            }
        }
    }
}
