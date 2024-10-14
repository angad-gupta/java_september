package oct5;

public class BookMain {

    public static void main(String[] args) {
        Book book = new Book("Age of Empire");
        Book book1 = new Book("Age of Empire", "virubhai");

        book.displayBook();
        book1.displayBook();
    }
}
