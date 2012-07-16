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
    public void shouldEquateSameLibraries() {
        BangloreLibrary bangloreLibrary1 = new BangloreLibrary();
        BangloreLibrary bangloreLibrary2 = new BangloreLibrary();

        Assert.assertEquals(bangloreLibrary1, bangloreLibrary2);
    }

    @Test
    public void shouldNotEquateNullObject(){

        Assert.assertFalse(bangloreLibrary.equals(null));
    }

    @Test
    public void testShowsWelcomeMessage(){

        Assert.assertEquals("Welcome", bangloreLibrary.welcomeUser());
    }

    @Test
    public void testShowsMenuOptions(){

        String menuString = new String("\nMenu: \n1. View All Books\n2. Reserve Book\n3. Return Book\n4. Show Library Number");

        Assert.assertEquals(menuString, bangloreLibrary.menuOptions());
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

        String expectedOutput = "\nBookName\t\tBookAuthor\t\tStatus\n";
        expectedOutput = expectedOutput + "Testing\t\tKent\t\tAvailable\n";

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

    

}
