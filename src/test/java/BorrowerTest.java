import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;

public class BorrowerTest {

    private Borrower borrower;

    @Before
    public void before(){
        borrower = new Borrower("Billy");
    }
    @Test
    public void hasName(){
        assertEquals("Billy", borrower.getName());
    }
    @Test
    public void hasCollection(){
        assertEquals(0, borrower.getCollectionsize());
    }
}
