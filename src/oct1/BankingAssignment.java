package oct1;

import java.util.Scanner;

public class BankingAssignment {

    public static void main(String[] args) {

        char choice = 'Y';
        int balance = 0;
        int pinCode = 1234;
        int attempt = 3;

        System.out.println("--------WELCOME TO BANKING SYSTEM--------");
        while (attempt != 0) {
            System.out.println("Enter Pincode : ");
            Scanner scanner = new Scanner(System.in);
            int userPinCode = scanner.nextInt();
            if (userPinCode == pinCode) {
                do {
                    System.out.println("1. Check Balance");
                    System.out.println("2. Deposit Money");
                    System.out.println("3. Withdraw Money");
                    System.out.println("4. Exit");


                    int input = scanner.nextInt();

                    if (input == 1) {
                        // Option 1: Check balance (no PIN verification required)
                        System.out.println("Your current balance is: $" + balance);
                    } else if (input >= 2 && input <= 3) {
                        // Verify PIN before proceeding with deposit, withdraw, or exit
                        boolean pinVerified = false;
                        while (!pinVerified) {
                            System.out.print("Enter your PIN to proceed: ");
                            int enteredPIN = scanner.nextInt();

                            if (enteredPIN == userPinCode) {
                                pinVerified = true;
                            } else {
                                System.out.println("Incorrect PIN. Please try again.");
                            }
                        }
                    }

                    switch (input) {
                        case 1:
                            System.out.println("You Current Balance is " + balance);
                            break;
                        case 2:
                            System.out.println("Deposit Amount :");
                            int depositAmount = scanner.nextInt();
                            balance = depositAmount + balance;
                            System.out.println("Current Balance is: " + balance);
                            break;
                        case 3:
                            System.out.println("Enter amount to withdraw: ");
                            int withdrawAmount = scanner.nextInt();
                            if (balance - withdrawAmount < 0) {
                                System.out.println("Insufficient Balance");
                            } else {
                                balance = balance - withdrawAmount;
                                System.out.println("Remaining Balance is:" + balance);
                            }
                            break;
                        case 4:
                            System.out.println("Exiting.....");
                            System.exit(0);
                        default:
                            System.out.println("Invalid Input");
                    }

                    System.out.println("Do you want to continue (Y/N");
                    choice = scanner.next().charAt(0);
                    System.out.println(choice);
                } while (choice != 'N');
            } else {
                System.out.println("Incorrect Code");
                attempt--;
                if (attempt == 0) {
                    System.out.println("Account Locked - Contact Support");
                    System.exit(0);

                } else {
                    System.out.println("Remaining Attempt is " + attempt);
                }
            }

        }
    }
}
