package sep29;

import java.util.Scanner;

public class DoWhileLoop {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
//        System.out.println("Enter value of n for sum of natural number ");
//
//        int number = scanner.nextInt();
//        int sum = 0;
//        int x = 1;
//        do{
//            sum = sum + x;
//            x++;
//        }while(x <= number);
//
//        System.out.println("The sum of natural number is:" + sum);
//
//        System.out.println("Enter number to get product table");
//        int productNumber = scanner.nextInt();
//        int productMultiplier = 1;
//        do{
//            System.out.println(productNumber + "*" + productMultiplier + "=" + productNumber*productMultiplier );
//            productMultiplier++;
//        }while(productMultiplier <= 10);

        System.out.println("Enter to get factorial number :");
        int number = scanner.nextInt();
        int i = 1;
        int factorial =1;

        do{
           factorial = factorial * i;
           i++;
        }while(i <= number);

        System.out.println("factorial is " + factorial);

    }
}
