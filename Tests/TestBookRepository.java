import junit.framework.Assert;
import org.junit.Test;

/**
 * Created by IntelliJ IDEA.
 * User: Shridhar Deshmukh
 * Date: 7/17/12
 * Time: 8:15 PM
 * To change this template use File | Settings | File Templates.
 */
public class TestBookRepository {
    BookRepository bookRepository = new BookRepository();

    @Test
    public void testAddsNewBookToLibrary(){
        String bookName = "Testing";
        String bookAuthor = "Kent";

        Assert.assertEquals("\nBook Added Successfully", bookRepository.addNewBook(bookName, bookAuthor));
    }

    @Test
    public void testShowAllBooks(){
        String bookName = "Testing";
        String bookAuthor = "Kent";
        bookRepository.addNewBook(bookName, bookAuthor);

        String expectedOutput = "\nBookName BookAuthor Status\n";
        expectedOutput = expectedOutput + "Testing Kent Available\n";

        Assert.assertEquals(expectedOutput, bookRepository.showAllBooks());
    }

    @Test
    public void testNotifyIfBookReserved(){
        String bookName = "Testing";
        String bookAuthor = "Kent";
        bookRepository.addNewBook(bookName, bookAuthor);

        Assert.assertEquals("Thank You! Enjoy the book.", bookRepository.reserveBook(bookName));
    }

    @Test
    public void testNotifyIfBookNotAvailable(){
        String  bookName = "Java";

        Assert.assertEquals("Sorry we don't have that book yet.", bookRepository.reserveBook(bookName));
    }

    @Test
    public void testNotifyIfBookReturned(){
        String bookName = "Testing";
        String bookAuthor = "Kent";
        bookRepository.addNewBook(bookName,bookAuthor);
        bookRepository.reserveBook(bookName);
        Assert.assertEquals("Thank you! Hope you enjoyed the book.", bookRepository.returnBook(bookName));
    }

}
