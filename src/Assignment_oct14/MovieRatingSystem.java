package Assignment_oct14;

import java.util.Scanner;

public class MovieRatingSystem {
    static String[] movies = new String[5];
    static double[] ratings = new double[5];

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < 5; i++) {
            System.out.print("Enter the name of movie " + (i + 1) + ": ");
            movies[i] = scanner.nextLine();
            System.out.print("Enter the rating for " + movies[i] + " (out of 5): ");
            ratings[i] = scanner.nextDouble();
            scanner.nextLine();  // Consume the newline character
        }

        findHigestRatedMovies();
    }

    public static void findHigestRatedMovies(){
        double higestRating = ratings[0];
        int higestMovieIndex = 0;
        for(int i=0; i<ratings.length ; i++){
            if(ratings[i] > higestRating){
                higestRating = ratings[i];
                higestMovieIndex = i;
            }
        }

        System.out.println("Higest Rating is " + higestRating + " of movie " + movies[higestMovieIndex]);
    }
}
