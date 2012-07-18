import java.util.ArrayList;
import java.util.List;

/**
 * Created by IntelliJ IDEA.
 * User: Shridhar Deshmukh
 * Date: 7/17/12
 * Time: 8:15 PM
 * To change this template use File | Settings | File Templates.
 */

/* Responsibility : Maintain repository of books and provide reserve and return functionality */
public class BookRepository {

    private static List<Book> bookList;

    public BookRepository(){
        bookList = new ArrayList<Book>();
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
}
