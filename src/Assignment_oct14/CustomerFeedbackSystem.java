package Assignment_oct14;

import javax.sound.midi.Soundbank;
import java.util.Scanner;

public class CustomerFeedbackSystem {

    static String[] reviews = new String[5];
    static int reviewCount = 0;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while(reviewCount < 5){
            System.out.println("Enter Customer Review ( or type 'done' to stop')");
            String input = scanner.nextLine();
            if(input.equalsIgnoreCase("done")){
                break;
            }
            reviews[reviewCount] = input;
            reviewCount++;
        }

        displayReviews();

        System.out.println("Enter a word to search review");
        String keyword = scanner.nextLine();
        searchReview(keyword);

    }

    public static void displayReviews(){
        if(reviewCount == 0){
            System.out.println("No review available");
        }else{
            System.out.println("Customer Review:");
            for(int i=0; i<reviews.length; i++){
                System.out.println(i+1 + reviews[i]);
            }
        }
    }

    public static void searchReview(String keyword){
        boolean found = false;
        System.out.println("Review Matching \"" + keyword + "\":");
        for(int i=0 ; i<reviewCount ; i++){
            if(reviews[i].toLowerCase().contains(keyword.toLowerCase())){
                System.out.println(i+1 + ". " +reviews[i]);
                found = true;
            }
        }
        if(!found){
            System.out.println("No review found!");
        }

    }


}
