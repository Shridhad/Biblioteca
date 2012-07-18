import java.util.*;

/**
 * Created by IntelliJ IDEA.
 * User: shridhad
 * Date: 7/12/12
 * Time: 1:51 PM
 * To change this template use File | Settings | File Templates.
 */
/* Responsibility : Provide user with different operation of library */
public class BangloreLibrary {

    private static Menu bookMenu;
    private static BookRepository bookRepository;    
    private static Customers customers;
    private static UserInput userInput;
    private static MovieStore movieStore;

    public BangloreLibrary(){
        bookRepository = new BookRepository();        
        bookMenu = Menu.createBookMenu();
        customers = new Customers();
        userInput = new UserInput();
        movieStore = new MovieStore();
    }

    public String welcomeUser() {
        String outputString = new String("Welcome");
        System.out.print(outputString);
        return outputString;
    }
    
    public int askUserChoice(){
        return userInput.askChoice();
    }

    public boolean checkValidMenu(int menuIndex) {
       if(menuIndex < 0 || menuIndex > 4)
           return  false;
        return true;
    }
    
    public String reserveBook(String bookName){
        return bookRepository.reserveBook(bookName);
    }
    
    public String returnBook(String bookName){
        return bookRepository.returnBook(bookName);
    }

    public String addNewBook(String bookName, String bookAuthor){
        return bookRepository.addNewBook(bookName,bookAuthor);
    }

    public String showAllBooks(){
        return bookRepository.showAllBooks();
    }

    public void displayMenu() {
        System.out.print(bookMenu);
    }

    public String addNewCustomer(String customerName, int customerNumber) {
        return customers.addNewCustomer(customerName,customerNumber);
    }
    
    public String showCustomerNumber(String customerName){
        String output =  "Customer Number: " + customers.getLibraryNumber(customerName);
        System.out.print(output);
        return output;
    }
    
    public void processUserInput(int choice){
        switch (choice){
            case 1:     showAllBooks();
                break;
            case 2:     reserveBook(userInput.askBookName());
                break;
            case 3:     returnBook(userInput.askBookName());
                break;
            case 4:     showCustomerNumber(userInput.askCustomerName());
                break;
        }
    }

    public String showAllMovies() {
        return movieStore.showAllMovies();
    }
}
