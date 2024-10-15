package Assignment_oct14;

import java.util.Scanner;

public class EcommerceSalesAnalysis {
    static String[] products = new String[7];
    static int[] sales = new int[7];

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String search;


        for(int i=0 ; i<7 ; i++){
            System.out.println("Enter a product "+ (i+1) + " : ");
            products[i] = scanner.nextLine();
            System.out.println("Enter number of " + products[i] +" sales : ");
            sales[i] = scanner.nextInt();
            scanner.nextLine();
        }

        System.out.println("Enter a product to be searched : ");
        search = scanner.nextLine();
        searchProduct(search);
    }

    public static void searchProduct(String search){
        boolean found = false;
        for(int i=0 ; i<products.length; i++){
            if(search.equals(products[i])){
                System.out.println("Product : " + products[i] + " sale is " + sales[i]);
                found = true;
                break;

            }

        }
        if(!found) {
            System.out.println("Product not found");
        }
    }
}
