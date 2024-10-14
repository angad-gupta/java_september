package oct5;

public class Book {

    String title;
    String author;
    int yearPublished;
    float price;
    String genre;


    Book(String title){
        this.title = title;
    }

    Book(String title, String author){
        this.title = title;
        this.author = author;
    }

    Book(String title, String author, int yearPublished){
        this.title = title;
        this.author = author;
        this.yearPublished = yearPublished;
    }

    Book(String title, String author, int yearPublished, float price){
        this.title = title;
        this.author = author;
        this.yearPublished = yearPublished;
        this.price = price;
    }

    Book(String title, String author, int yearPublished, float price, String genre){
        this.title = title;
        this.author = author;
        this.yearPublished = yearPublished;
        this.price = price;
        this.genre = genre;
    }

    public void displayBook(){
        System.out.println("Detail of book is : ");
        System.out.println("title " + title);
        System.out.println("author " + author);
        System.out.println("yearPublished " + yearPublished);
        System.out.println("price " + price);
        System.out.println("genre " + genre);
    }

}
