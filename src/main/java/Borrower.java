import java.util.ArrayList;

public class Borrower {

    private String name;
    private ArrayList<Book> collection;

    public Borrower(String name){
        this.name = name;
        this.collection = new ArrayList<Book>();
    }


    public String getName() {
        return this.name;
    }

    public int getCollectionSize(){
        return this.collection.size();
    }

    public void checkOutBook(Library library, Book book) {
        library.releaseBook(book);
        this.collection.add(book);
    }
}
