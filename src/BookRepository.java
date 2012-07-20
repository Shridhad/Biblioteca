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
        addBooks();
    }

    private Book getBook(String bookName) {
        for(Book book:bookList ){
            if(book.getBookName().equals(bookName))
                return book;
        }
        return null;
    }

    private void addBooks(){
        bookList.add(new Book("Testing","Kent"));
        bookList.add(new Book("Java","Herbert"));
        bookList.add(new Book("Harry Potter","Rowling"));
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


    public String showAllBooks() {
        String output = "\nBookName BookAuthor Status\n";
        for(Book book: bookList){
            output = output + book.getBookDetails() + "\n";
        }
        System.out.print(output);

        return output;
    }
}
