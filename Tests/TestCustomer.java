import junit.framework.Assert;
import org.junit.Test;

/**
 * Created by IntelliJ IDEA.
 * User: Shridhar Deshmukh
 * Date: 7/17/12
 * Time: 9:46 AM
 * To change this template use File | Settings | File Templates.
 */
public class TestCustomer {

    Customers customers = new Customers();

    @Test
    public void shouldAddNewCustomer(){
        String customerName = "XYZ";
        int customerNumber = 1001;

        Assert.assertEquals("\nCustomers Added Successfully", customers.addNewCustomer(customerName, customerNumber));
    }

    @Test
    public void shouldShowCustomerDetails(){
        String customerName = "XYZ";
        int customerNumber = 1001;
        customers.addNewCustomer(customerName,customerNumber);

        Assert.assertEquals(1001, customers.getLibraryNumber(customerName));
    }

}
