import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class LibraryTest {
    private Library library;
    private Book book;

    @Before
    public void before(){
        library = new Library();

    }
    @Test
    public void hasCollectionOfBooks(){
        assertEquals(0, library.getNumOfBooksInCollection());
    }
}
