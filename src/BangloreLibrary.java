import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by IntelliJ IDEA.
 * User: shridhad
 * Date: 7/12/12
 * Time: 1:51 PM
 * To change this template use File | Settings | File Templates.
 */
public class BangloreLibrary {

    private static List<MenuItem> menuItems;
    private static List<Book> bookList;

    private class Book{
        private String bookName;
        private String bookAuthor;
        private boolean available;


        public Book(String bookName, String bookAuthor){
            this.bookName = bookName;
            this.bookAuthor = bookAuthor;
            this.available = true;
        }

        public boolean isAvailable(){
            return available;
        }
        public String getBookName(){
            return bookName;
        }

        public String getBookDetails() {
            String bookDetails = this.bookName + "\t\t" + this.bookAuthor + "\t\t";
            if(isAvailable())
                return bookDetails + "Available";
            return bookDetails + "Issued";
        }

        public void reserve() {
            this.available = false;
        }

        public void returnBook(){
            this.available = true;
        }
    }

    private class MenuItem {
        private String menuItemName;
            
        public MenuItem(String menuItemName) {
            this.menuItemName = menuItemName;
        }

        @Override
        public String toString(){
            return menuItemName;
        }
    }

    public BangloreLibrary(){
        bookList = new ArrayList<Book>();
        menuItems = new ArrayList<MenuItem>();
    }
    
    @Override
    public boolean equals(Object other) {
        if(other == null)
            return false;
        if(other == this)
            return true;
        if(getClass() == ((BangloreLibrary)other).getClass()){
            return true;
        }
        return false;
    }

    public String welcomeUser() {
        String outputString = new String("Welcome");
        System.out.print(outputString);
        return outputString;
    }

    public String menuOptions() {
        menuItems.addAll(Arrays.asList(createMenu()));

        String outputString = new String("\nMenu: ");
        for(int i=0; i < menuItems.size(); i++){
            outputString = outputString + "\n" + (i+1) +". " + menuItems.get(i);
        }
        System.out.print(outputString);
        return outputString;
    }
    
    public MenuItem[] createMenu() {
        MenuItem []menuItems = {new MenuItem("View All Books"),
                                new MenuItem("Reserve Book"),
                                new MenuItem("Return Book"),
                                new MenuItem("Show Library Number")
                                };
        return menuItems;
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
        String output = "\nBookName\t\tBookAuthor\t\tStatus\n";
        for(Book book: bookList){
            output = output + book.getBookDetails() + "\n";
        }
        System.out.print(output);

        return output;
    }
}
