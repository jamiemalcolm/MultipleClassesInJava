import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;

public class LibraryTest {
    private Library library;
    private Book book1;

    @Before
    public void before(){
        library = new Library();
        book1 = new Book("The Davinci Code", "Dan Brown", "Thriller");

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
}
