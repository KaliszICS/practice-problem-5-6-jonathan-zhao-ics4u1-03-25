public class Book {
    private String author;
    private String title;
    private String ISBN;

    public Book(String author, String title, String ISBN) {
        this.author = author;
        this.title = title;
        this.ISBN = ISBN;
    }

    public String getAuthor(){
        return this.author;
    }

    public String getTitle() {
        return this.title;
    }

    public String getISBN(){
        return this.ISBN;
    }

}

