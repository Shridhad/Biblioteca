import java.util.*;

/**
 * Created by IntelliJ IDEA.
 * User: shridhad
 * Date: 7/12/12
 * Time: 1:51 PM
 * To change this template use File | Settings | File Templates.
 */

public class BangloreLibrary {

    private static Menu bookMenu;
    private static List<Book> bookList;
    private static Customers customers;

    public BangloreLibrary(){
        bookList = new ArrayList<Book>();
        bookMenu = Menu.createBookMenu();
        customers = new Customers();
    }

    public String welcomeUser() {
        String outputString = new String("Welcome");
        System.out.print(outputString);
        return outputString;
    }

    public String askUserChoice() {
        String outputString = "\nEnter your choice:";
        System.out.print(outputString);
        return outputString;
    }

    public boolean checkValidMenu(int menuIndex) {
       if(menuIndex < 0 || menuIndex > 4)
           return  false;
        return true;
    }

    public String reserveBook(String bookName) {
        String reservedMessage = "Thank You! Enjoy the book.";
        String notAvailableMessage = "Sorry we don't have that book yet.";

        Book book = getBook(bookName);
        if(book != null && book.isAvailable()){
            book.reserve();
            System.out.print(reservedMessage);
            return reservedMessage;
        }
        System.out.print(notAvailableMessage);
        return notAvailableMessage;
    }

    private Book getBook(String bookName) {
        for(Book book:bookList ){
            if(book.getBookName().equals(bookName))
                return book;
        }
        return null;
    }


    public String returnBook(String bookName) {
        String outputMessage = "Thank you! Hope you enjoyed the book.";

        Book book = getBook(bookName);
        if(book != null && !book.isAvailable()){
            book.returnBook();
            System.out.print(outputMessage);
            return outputMessage;
        }
        outputMessage = "No Such Book was issued to you.";
        System.out.print(outputMessage);
        return outputMessage;
    }
    
    public String addNewBook(String bookName, String bookAuthor ) {
        Book newBook = new Book(bookName,bookAuthor);

        bookList.add(newBook);
        String message = "\nBook Added Successfully" ;
        System.out.print(message);
        return message;
    }

    public String showAllBooks() {
        String output = "\nBookName BookAuthor Status\n";
        for(Book book: bookList){
            output = output + book.getBookDetails() + "\n";
        }
        System.out.print(output);

        return output;
    }

    public void displayMenu() {
        System.out.print(bookMenu);
    }

    public String addNewCustomer(String customerName, int customerNumber) {
        return customers.addNewCustomer(customerName,customerNumber);
    }

    public int getLibraryNumber(String customerName) {
        return customers.getLibraryNumber(customerName);
    }
}
