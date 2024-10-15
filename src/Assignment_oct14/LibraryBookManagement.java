package Assignment_oct14;

import java.util.Scanner;

public class LibraryBookManagement {
    public static void main(String[] args) {
        String[] books = {"1984", "Sapiens", "Beloved", "Dune", "Inferno", "Atomic"};

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the books you want to search or replace (s / r): ");
        char choice = scanner.nextLine().charAt(0);
        if(choice == 's'){
            System.out.println("Enter the books you want to search: ");
            String userSearchBook = scanner.nextLine();
            searchBook(userSearchBook, books);
        }else if(choice == 'r'){
            System.out.println("Enter the books you want to update: ");
            String oldBook = scanner.nextLine();
            searchBook(oldBook, books);
            System.out.println("Enter the books name you want to replace: ");
            String newBook = scanner.nextLine();
            updateBook(oldBook, newBook, books);
        }


    }

    public static void updateBook(String oldBook, String newBook, String[] books){
        boolean found = false;
        for(int i=0; i<books.length; i++){
            if(oldBook.equalsIgnoreCase(books[i])){
               books[i] = newBook;
                System.out.println("Book name " + oldBook + " replace with name : " + newBook);
               found = true;

               break;
            }

        }

        displayBooks(books);
        if(!found){
            System.out.println("Book not found!");
        }
    }

    public static void displayBooks(String[] books){
        System.out.println("Updated Books:");
        for(int i=0; i<books.length; i++){
            System.out.println(books[i]);
        }

    }

    public static void searchBook(String userSearchBook, String[] books){
        boolean found = false;
        for(int i=0; i<books.length; i++){
            if(userSearchBook.equalsIgnoreCase(books[i])){
                System.out.println("Book : " + books[i] + " is available in Library");
                found = true;
                break;
            }

        }
        if(!found){
            System.out.println("Book not found!");
            System.exit(0);
        }

    }

}
