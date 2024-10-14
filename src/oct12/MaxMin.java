package oct12;

import java.util.Arrays;

public class MaxMin {
    public static void main(String[] args) {
        int[] arr = {10,20,30,40,50};
        int max = findMax(arr);
        int min = findMin(arr);


       System.out.println("Max Number is" + max);
       System.out.println("Min Number is" + min);

    }

    public static int findMax(int[] arr){
        int max = arr[0];
        for(int i=0; i<arr.length; i++){
            if(arr[i] > max){
                max = arr[i];
            }
        }
        return max;

    }

    public static int findMin(int[] arr){
        int min = arr[0];
        for(int i=0; i<arr.length; i++){
            if(arr[i] < min){
                min = arr[i];
            }
        }
        return min;
    }
}
