import java.util.ArrayList;

public class Library {
    private ArrayList<Book> collectionOfBooks;

    public Library(){
        this.collectionOfBooks = new ArrayList<Book>();
    }

    public int getNumOfBooksInCollection() {
        return this.collectionOfBooks.size();
    }
}