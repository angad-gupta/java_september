package oct26;

public class Fiction extends Book{

    String author;

    public Fiction(String genre, String title, String author) {
        super(genre, title);
        this.author = author;
    }

    public void display(){
        System.out.println(genre + title + author);
    }
}
