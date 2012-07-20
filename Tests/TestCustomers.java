import junit.framework.Assert;
import org.junit.Test;

/**
 * Created by IntelliJ IDEA.
 * User: Shridhar Deshmukh
 * Date: 7/17/12
 * Time: 9:46 AM
 * To change this template use File | Settings | File Templates.
 */
public class TestCustomers {

    Customers customers = new Customers();

    @Test
    public void shouldReturnCorrectLibraryNumber() {
        String customerName = new String("ABC");

        Assert.assertEquals("Library Number: 111-1111", customers.getLibraryNumber(customerName));
    }

    @Test
    public void testLoginWithCorrectUserNameAndPassword() {
        String username = "111-1111";
        String password = "abc";

        Assert.assertTrue(customers.login(username,password));
    }

    @Test
    public void testLoginWithIncorrectUsernameAndPassword() {
        String username = "112-1111";
        String password = "def";

        Assert.assertFalse(customers.login(username,password));
    }

    @Test
    public void shouldNotifyIfCustomerExists() {
        String customerName = new String("EFC");

        Assert.assertEquals("Sorry! No such customer exist.",customers.getLibraryNumber(customerName));
    }

}
