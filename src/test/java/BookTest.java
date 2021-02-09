import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BookTest {

    private Book book1;
    private Book book2;
    private Book book3;
    
    @Before
    public void before(){
        book1 = new Book("The Davinci Code", "Dan Brown", "Thriller");
    }
    
    @Test
    public void hasTitle(){
        assertEquals("The Davinci Code", book1.getTitle());
    }
}
