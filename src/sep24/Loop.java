package sep24;

import java.util.Scanner;

public class Loop {
    public static void main(String[] args) {
        int x = 1;
        while(x <= 10) {
            System.out.println(x);
            x++;
        }


        int y = 1;
        System.out.println("Enter nth number");
        Scanner scanner = new Scanner(System.in);
        int final_number = scanner.nextInt();

        while(y <= final_number){
            System.out.println(y);
            y++;
        }

        int z = 1;
        System.out.println("Enter nth number");
        int sum_number = scanner.nextInt();
        int sum = 0;
        while(z <= sum_number){
            sum = sum + z;
            z++;
        }

        System.out.println("The Sum is " + sum);

    }

}
