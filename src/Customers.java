import java.util.ArrayList;
import java.util.List;

/**
 * Created by IntelliJ IDEA.
 * User: Shridhar Deshmukh
 * Date: 7/17/12
 * Time: 9:46 AM
 * To change this template use File | Settings | File Templates.
 */
public class Customers {

    private List<Customer> customerList;

    private class Customer {
        private String customerName;
        private int customerNumber;

        public Customer(String customerName, int customerNumber){
            this.customerName = customerName;
            this.customerNumber = customerNumber;
        }

        public int getCustomerNumber(){
            return customerNumber;
        }

         public String getCustomerName(){
            return customerName;
        }
    }

    public Customers(){
        customerList = new ArrayList<Customer>();
    }

    public int getLibraryNumber(String customerName) {
        Customer customer = getCustomer(customerName);
        if(customer == null){
            return -1;
        }
        return customer.getCustomerNumber();
    }

    private Customer getCustomer(String customerName){
        for (Customer customer : customerList) {
            if(customer.getCustomerName().equals(customerName))
                return customer;
        }
        return null;
    }

    public String addNewCustomer(String customerName, int customerNumber){
        Customer customer = new Customer(customerName,customerNumber);
        customerList.add(customer);
        String outputString = "\nCustomers Added Successfully";
        System.out.print(outputString);

        return outputString;
    }
}
