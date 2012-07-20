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
    public void testShowAllBooks(){
        String expectedOutput = "\nBookName BookAuthor Status\n"
                                 + "Testing Kent Available\n"
                                 + "Java Herbert Available\n"
                                 + "Harry Potter Rowling Available\n";

        Assert.assertEquals(expectedOutput, bookRepository.showAllBooks());
    }

    @Test
    public void testNotifyIfBookReserved(){
        String bookName = "Testing";

        Assert.assertEquals("Thank You! Enjoy the book.", bookRepository.reserveBook(bookName));
    }

    @Test
    public void testNotifyIfBookNotAvailable(){
        String  bookName = "Object Oriented";

        Assert.assertEquals("Sorry we don't have that book yet.", bookRepository.reserveBook(bookName));
    }

    @Test
    public void testNotifyIfBookReturned(){
        String bookName = "Testing";
        bookRepository.reserveBook(bookName);
        Assert.assertEquals("Thank you! Hope you enjoyed the book.", bookRepository.returnBook(bookName));
    }

    @Test
    public void testNotifyIfWrongBookIsReturning() {
        String bookName = "Testing";

        Assert.assertEquals("No Such Book was issued to you.", bookRepository.returnBook(bookName));
    }

}
