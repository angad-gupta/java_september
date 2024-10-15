package Assignment_oct14;

import java.util.Scanner;

public class ProductInventoryManagement {
    public static void main(String[] args) {
        String[] products = {"Laptop", "Smartphone", "Headphone", "Tablet", "Smartwatch"};
        double[] prices = {1200.00, 800.00, 150.00, 400.00, 200.00};

        displayProducts(products, prices);

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter product name to search for price");
        String productName = scanner.nextLine();

        searchProduct(productName, products, prices);
    }

    public static void displayProducts(String[] products, double[] prices){
        System.out.println("Product Inventory:");
        for(int i=0; i<products.length; i++){
            System.out.println(products[i] + ": $" + prices[i]);
        }

    }

    public static void searchProduct(String productName, String[] products, double[] prices){
        boolean found = false;
        for(int i=0; i<products.length; i++){
            if(products[i].equalsIgnoreCase(productName)){
                System.out.println(productName + " costs $" + prices[i]);
                found = true;
                break;
            }
        }
        if(!found){
            System.out.println("Product Not Found");
        }
    }

}
