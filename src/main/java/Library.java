import java.util.ArrayList;
import java.util.HashMap;

public class Library {
    private ArrayList<Book> collectionOfBooks;
    private int capacity;
    private HashMap<String, Integer> booksByGenre;

    public Library(){
        this.collectionOfBooks = new ArrayList<Book>();
        this.capacity = 2;
        this.booksByGenre = new HashMap<String, Integer>();
    }

    public int getNumOfBooksInCollection() {
        return this.collectionOfBooks.size();
    }

    public void addBook(Book book) {
        if(this.getNumOfBooksInCollection() < this.capacity){
            this.collectionOfBooks.add(book);
            // possible solution for advanced Extension
//            this.booksByGenre.put(book.getGenre(), this.booksByGenre.get(book.getGenre()) + 1);
        }
    }

    public void releaseBook(Book book) {
        int bookIndex = this.collectionOfBooks.indexOf(book);
        this.collectionOfBooks.remove(bookIndex);
    }
}
