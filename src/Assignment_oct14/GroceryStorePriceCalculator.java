package Assignment_oct14;

import java.util.Scanner;

public class GroceryStorePriceCalculator {
    public static void main(String[] args) {
        String[] fruits = {"Apple", "Banana", "Cherry", "Orange", "Grapes"};
        double[] prices = {3.0, 1.5, 3.5, 4.5,2.5};

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter Fruit name : ");
        String fruitName = scanner.nextLine();

        System.out.println("Enter Kg : ");
        double fruitKilo = scanner.nextDouble();

        calculatePrice(fruitName,fruitKilo, fruits, prices);

    }

    public static void calculatePrice(String fruitName, double fruitKilo, String[] fruits, double[] prices){
        boolean found = false;
        for(int i=0; i<fruits.length; i++){
            if(fruitName.equalsIgnoreCase(fruits[i])){
                System.out.println("Total price for " + fruitKilo + " KG " + fruits[i] + " is $" + fruitKilo * prices[i] );
                found = true;
                break;
            }
        }

        if(!found){
            System.out.println("Sorry, Fruit not found");
        }

    }
}
