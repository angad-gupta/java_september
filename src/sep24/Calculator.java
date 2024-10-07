package sep24;

import java.util.Scanner;

public class Calculator {
        public static void main(String[] args){

            char choice = 'Y';
            do{
                System.out.println("******************************************");
                System.out.println("Welcome to my Calculator");
                System.out.println("******************************************");

                System.out.println("1. Addition");
                System.out.println("2. Multiplication");
                System.out.println("3. Subtraction");
                System.out.println("4. Division");
                System.out.println("5. Modulus");

                Scanner scanner = new Scanner(System.in);

                System.out.println("Enter the number you want to perform");
                int number = scanner.nextInt();
                System.out.println("Enter the first number");
                int number1 = scanner.nextInt();
                System.out.println("Enter the second number");
                int number2 =  scanner.nextInt();

                switch (number){
                    case 1:
                        int sum = number1 + number2;
                        System.out.println("The addition is : " + sum);
                        break;

                    case 2:
                        int mul = number1 * number2;
                        System.out.println("The multiplication is : " + mul);
                        break;

                    case 3:
                        int sub = number1 - number2;
                        System.out.println("The subtraction is : " + sub);
                        break;

                    case 4:
                        int div = number1 / number2;
                        System.out.println("The addition is : " + div);
                        break;

                    case 5:
                        int mod = number1 % number2;
                        System.out.println("The Modulus is : " + mod);
                        break;

                    default:
                        System.out.println("Invalid Input");
                }
                System.out.println("Do you want to continue Y for yes N for no");
                choice = scanner.next().charAt(0);
                System.out.println(choice);


            }while(choice == 'N');




        }

}
