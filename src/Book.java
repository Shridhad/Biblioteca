/**
 * Created by IntelliJ IDEA.
 * User: Shridhar Deshmukh
 * Date: 7/16/12
 * Time: 11:49 PM
 * To change this template use File | Settings | File Templates.
*/
public class Book{
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
        String bookDetails = this.bookName + " " + this.bookAuthor + " ";
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
    
    @Override
    public boolean equals(Object other){
        if(other == null || other.getClass() != getClass())
            return false;
        if(this == other)
            return true;
        
        Book otherBook = (Book)other;
        if(bookName.equals(otherBook.bookName) && bookAuthor.equals(otherBook.bookAuthor))
            return true;

        return false;
    }
    
}