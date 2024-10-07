package sep29;

import java.util.Scanner;

public class Casino {
    public static void main(String[] args) {
        int luckyNumber = 47;
        int attempt=3;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome to Niagara Casino");



        while(attempt != 0){
            System.out.println("Enter your Lucky Number " + 1);
            int userNumber = scanner.nextInt();
            if(userNumber == luckyNumber){
                System.out.println("You win the JACKPOT!");
                break;
            }else{
                attempt--;
                System.out.println("You Lost Try Agian! Attempt Left =" + attempt );

            }

        }


    }

}
