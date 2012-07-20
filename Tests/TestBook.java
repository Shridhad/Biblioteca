import junit.framework.Assert;
import org.junit.Test;

/**
 * Created by IntelliJ IDEA.
 * User: Shridhar Deshmukh
 * Date: 7/16/12
 * Time: 11:48 PM
 * To change this template use File | Settings | File Templates.
 */
public class TestBook {
    
    @Test
    public void shouldEquateTwoSameBooks(){
        Book book1 = new Book("Testing","Kent");
        Book book2 = new Book("Testing", "Kent");

        Assert.assertTrue(book1.equals(book2));
    }

    @Test
    public void shouldNotEquateTwoDifferentBooks(){
        Book book1 = new Book("Testing","Kent");
        Book book2 = new Book("Java", "Herbert");

        Assert.assertFalse(book1.equals(book2));
    }

    @Test
    public void shouldReturnAvailabilityOfBook(){
        Book book = new Book("Testing","Kent");

        Assert.assertTrue(book.isAvailable());
    }
    
    @Test
    public void shouldReturnCorrectDetailsOfAvailableBook(){
        Book book = new Book("Testing","Kent");
        
        String expectedDetails = new String("Testing Kent Available");

        Assert.assertEquals(expectedDetails, book.getBookDetails());
    }

    @Test
    public void shouldReturnCorrectBookName(){
        Book book = new Book("Testing","Kent");

        String expectedDetails = new String("Testing");

        Assert.assertEquals(expectedDetails, book.getBookName());
    }

    @Test
    public void shouldReturnCorrectDetailsOfIssuedBook() {
        Book book = new Book("Testing","Kent");
        book.reserve();

        String expectedDetails = new String("Testing Kent Issued");

        Assert.assertEquals(expectedDetails, book.getBookDetails());
    }
    
    @Test
    public void shouldEquateWithNull() {
        Book book = new Book("Testing","Kent");

        Assert.assertFalse(book.equals(null));
    }

    @Test
    public void shouldEquateBookWithItself() {
        Book book = new Book("Testing","Kent");

        Assert.assertTrue(book.equals(book));
    }
}
