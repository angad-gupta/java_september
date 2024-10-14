package oct12;

import java.util.Arrays;

public class Array {

    public static void main(String[] args) {

        int[] arr = {10,20,30,40,50};
        int[] revArr={};

        int start = 0;
        int end = arr.length -1;

        while(start < end){
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;

        }

        System.out.println("Rev Array" + Arrays.toString(arr));


    }
}
