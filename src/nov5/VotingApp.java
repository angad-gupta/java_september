package nov5;

import java.util.Scanner;

public class VotingApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your age :");
        int age = scanner.nextInt();

        if(age < 18){
            throw new InvalidAgeException("Age less than 18 cannot vote");
        }else {
            System.out.println("you can vote");
        }
    }
}
