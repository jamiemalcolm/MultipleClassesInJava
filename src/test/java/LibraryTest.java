import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;

public class LibraryTest {
    private Library library;
    private Book book1;
    private Book book2;
    private Book book3;

    @Before
    public void before(){
        library = new Library();
        book1 = new Book("The Davinci Code", "Dan Brown", "Thriller");
        book2 = new Book("Harry Potter I", "JK Rowling", "Fantasy");
        book3 = new Book("Harry Potter II", "JK Rowling", "Fantasy");
    }
    @Test
    public void hasCollectionOfBooks(){
        assertEquals(0, library.getNumOfBooksInCollection());
    }
    @Test
    public void canAddBook(){
        library.addBook(book1);
        assertEquals(1, library.getNumOfBooksInCollection());
    }
    @Test
    public void canAddUptoCapacity(){
        library.addBook(book1);
        library.addBook(book2);
        assertEquals(2, library.getNumOfBooksInCollection());
    }
}
