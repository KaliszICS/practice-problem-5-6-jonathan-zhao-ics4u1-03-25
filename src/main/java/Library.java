import java.util.ArrayList;

public class Library { 
    
    //composition
    ArrayList<Book> books = new ArrayList<>();
    

    public void addBook(Book book) {
        books.add(book);
    }

    public void removeBook(String isbn) {
        for(Book book : books) {
            if(book.getISBN().equals(isbn)) {
                books.remove(book);
                
            }
        }
    }

    public Book[] searchBook(String title) {
        ArrayList<Book> matches = new ArrayList<>();
        for(Book book : books) {
            if(book.getTitle().contains(title)) {
                matches.add(book);
            }
        }
        return matches.toArray(new Book[0]); // Turns matches into an a new array of books with size 0
    }

    public Book[] displayBooks() {
        return books.toArray(new Book[0]);
    }


}
