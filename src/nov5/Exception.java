package nov5;

public class Exception {
    public static void main(String[] args) {

        try {
            int[] arr = new int[5];
            arr[0] = 1;
            arr[1] = 1;
            arr[2] = 1;
            arr[3] = 1;
            arr[4] = 1;
            arr[5] = 1;

        } catch (java.lang.Exception e){
            e.printStackTrace();

        }

        System.out.println("Printing this line");



    }




}
