import java.util.Scanner;

/**
 * Created by IntelliJ IDEA.
 * User: shridhad
 * Date: 7/13/12
 * Time: 11:05 AM
 * To change this template use File | Settings | File Templates.
 */
public class User {

    public static void main(String []args)throws Exception{
        BangloreLibrary bangloreLibrary = new BangloreLibrary();
        bangloreLibrary.welcomeUser();
        bangloreLibrary.displayMenu();
        bangloreLibrary.askUserChoice();

        Scanner scanner = new Scanner(System.in);
        int menuChoice = Integer.parseInt(scanner.nextLine());
        bangloreLibrary.checkValidMenu(menuChoice);
        String bookName = "Testing";
        String bookAuthor = "Kent";
        bangloreLibrary.addNewBook(bookName, bookAuthor);
        bangloreLibrary.addNewBook("Java", "Herbert");
        bangloreLibrary.addNewBook("OOD", "Booch");

        bangloreLibrary.showAllBooks();
        System.out.print("Enter Book Name To Reserve:");
        bookName = scanner.nextLine();
        bangloreLibrary.reserveBook(bookName);

        System.out.print("\nEnter Book name To Return:");
        bookName = scanner.nextLine();
        bangloreLibrary.returnBook(bookName);
    }
}
