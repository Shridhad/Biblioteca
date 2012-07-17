import junit.framework.Assert;
import org.junit.Test;

import java.awt.*;

/**
 * Created by IntelliJ IDEA.
 * User: shridhad
 * Date: 7/12/12
 * Time: 1:17 PM
 * To change this template use File | Settings | File Templates.
 */
public class BangloreLibraryTest {

    BangloreLibrary bangloreLibrary = new BangloreLibrary();

    @Test
    public void testShowsWelcomeMessage(){

        Assert.assertEquals("Welcome", bangloreLibrary.welcomeUser());
    }

    @Test
    public void testAsksUserForChoice(){
        String expectedOutput = "\nEnter your choice:";
        Assert.assertEquals(expectedOutput,bangloreLibrary.askUserChoice());
    }

    @Test
    public void testValidSelectedMenuOption(){

        Assert.assertTrue(bangloreLibrary.checkValidMenu(2));
    }

    @Test
    public void testAddsNewBookToLibrary(){
        String bookName = "Testing";
        String bookAuthor = "Kent";

        Assert.assertEquals("\nBook Added Successfully",bangloreLibrary.addNewBook(bookName, bookAuthor));
    }

    @Test
    public void testShowAllBooks(){
        String bookName = "Testing";
        String bookAuthor = "Kent";
        bangloreLibrary.addNewBook(bookName, bookAuthor);

        String expectedOutput = "\nBookName BookAuthor Status\n";
        expectedOutput = expectedOutput + "Testing Kent Available\n";

        Assert.assertEquals(expectedOutput,bangloreLibrary.showAllBooks());
    }
    
    @Test
    public void testNotifyIfBookReserved(){
        String bookName = "Testing";
        String bookAuthor = "Kent";
        bangloreLibrary.addNewBook(bookName, bookAuthor);

        Assert.assertEquals("Thank You! Enjoy the book.",bangloreLibrary.reserveBook(bookName));
    }

    @Test
    public void testNotifyIfBookNotAvailable(){
        String  bookName = "Java";

        Assert.assertEquals("Sorry we don't have that book yet.",bangloreLibrary.reserveBook(bookName));
    }

    @Test
    public void testNotifyIfBookReturned(){
        String bookName = "Testing";
        String bookAuthor = "Kent";
        bangloreLibrary.addNewBook(bookName,bookAuthor);
        bangloreLibrary.reserveBook(bookName);
        Assert.assertEquals("Thank you! Hope you enjoyed the book.",bangloreLibrary.returnBook(bookName));
    }

    @Test
    public void shouldAddNewCustomer(){
        String customerName = "XYZ";
        int customerNumber = 1001;

        Assert.assertEquals("\nCustomers Added Successfully", bangloreLibrary.addNewCustomer(customerName, customerNumber));
    }

    @Test
    public void shouldShowCustomerDetails(){
        String customerName = "XYZ";
        int customerNumber = 1001;
        bangloreLibrary.addNewCustomer(customerName,customerNumber);

        Assert.assertEquals(1001, bangloreLibrary.getLibraryNumber(customerName));
    }
}
