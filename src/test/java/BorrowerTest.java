import org.junit.Before;
import org.junit.Test;


import static org.junit.Assert.assertEquals;

public class BorrowerTest {

    private Borrower borrower;
    private Library library;
    private Book book1;
    private Book book2;
    private Book book3;

    @Before
    public void before(){
        borrower = new Borrower("Billy");
        library = new Library();
        book1 = new Book("The Davinci Code", "Dan Brown", "Thriller");
        book2 = new Book("Harry Potter I", "JK Rowling", "Fantasy");
        book3 = new Book("Harry Potter II", "JK Rowling", "Fantasy");
        library.addBook(book1);
        library.addBook(book2);
    }
    @Test
    public void hasName(){
        assertEquals("Billy", borrower.getName());
    }
    @Test
    public void hasCollection(){
        assertEquals(0, borrower.getCollectionSize());
    }

}
