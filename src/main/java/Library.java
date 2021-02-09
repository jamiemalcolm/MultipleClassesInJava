import java.util.ArrayList;

public class Library {
    private ArrayList<Book> collectionOfBooks;
    private int capacity;

    public Library(){
        this.collectionOfBooks = new ArrayList<Book>();
        this.capacity = 2;
    }

    public int getNumOfBooksInCollection() {
        return this.collectionOfBooks.size();
    }

    public void addBook(Book book) {
        if(this.getNumOfBooksInCollection() < this.capacity){
            this.collectionOfBooks.add(book);
        }
    }

    public void releaseBook(Book book) {
        int bookIndex = this.collectionOfBooks.indexOf(book);
        this.collectionOfBooks.remove(bookIndex);
    }
}
