package sep24;

import java.util.Scanner;

public class CustomerCare {
    public static void main(String[] args) {


        System.out.println("******************************************");
        System.out.println("Welcome to Customer Care");
        System.out.println("******************************************");

        System.out.println("1. Internet");
        System.out.println("2. Mobile");

        System.out.println("Enter your choice");
        Scanner scanner = new Scanner(System.in);

        int first_level = scanner.nextInt();

        switch(first_level){
            case 1:
                System.out.println("1. Billing");
                System.out.println("2. Account Info");
                System.out.println("3. Payment Arrangement");
                System.out.println("4. Technical Support");
                System.out.println("5. Go to menu");
                System.out.println("Enter your choice");

                Scanner scannerSecond = new Scanner(System.in);
                int second_level = scannerSecond.nextInt();

                switch (second_level){
                    case 4:
                        System.out.println("1. For Agent");
                        System.out.println("2. For AI");
                        Scanner scannerThird = new Scanner(System.in);
                        int third_level = scannerThird.nextInt();

                        if(third_level == 1){
                            System.out.println("Your wait time is 20 mins");
                        }else{
                            System.out.println("Inavlid Choice!");
                        }

                        break;
                    default:
                        System.out.println("Processing your request.");
                        break;
                }

            case 2 :

                System.out.println("Processing your request on Mobile option.");
                break;

            default:
                System.out.println("Invalid Choice!");
                break;
        }

    }
}
