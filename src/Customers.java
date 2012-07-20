import java.util.ArrayList;
import java.util.List;

/**
 * Created by IntelliJ IDEA.
 * User: Shridhar Deshmukh
 * Date: 7/17/12
 * Time: 9:46 AM
 * To change this template use File | Settings | File Templates.
 */


/* Responsibility : Maintain list of all customers and provide information if asked */
public class Customers {

    private List<Customer> customerList;

    private void addCustomers(){
        customerList.add(new Customer("ABC","111-1111","abc"));
        customerList.add(new Customer("XYZ","111-1112","xyz"));
        customerList.add(new Customer("PQR","111-1113","pqr"));
    }

    private Customer getCustomer(String customerName){
        for (Customer customer : customerList) {
            if(customer.getCustomerName().equals(customerName))
                return customer;
        }
        return null;
    }

    public Customers(){
        customerList = new ArrayList<Customer>();
        addCustomers();
    }

    private class Customer {
        private String customerName;
        private String libraryNumber;

        private String password;

        public Customer(String customerName, String libraryNumber, String password){
            this.customerName = customerName;
            this.libraryNumber = libraryNumber;
            this.password = password;
        }

        public String getLibraryNumber(){
            return libraryNumber;
        }
        public String getCustomerName(){
            return customerName;
        }

        public boolean checkLogin(String username, String password) {
            if(this.libraryNumber.equals(username) && this.password.equals(password))
                return true;
            return false;
        }
    }

    public boolean login(String username, String password) {
        for (Customer customer : customerList) {
            if(customer.checkLogin(username, password))
                return true;
        }
        return false;
    }

    public String getLibraryNumber(String customerName) {
        Customer customer = getCustomer(customerName);
        if(customer == null){
            return new String("Sorry! No such customer exist.");
        }
        return "Library Number: " + customer.getLibraryNumber();
    }
}
