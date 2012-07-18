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

        String bookName = "Testing";
        String bookAuthor = "Kent";
        bangloreLibrary.addNewBook(bookName, bookAuthor);
        bangloreLibrary.addNewBook("Java", "Herbert");
        bangloreLibrary.addNewBook("OOD", "Booch");

        bangloreLibrary.addNewCustomer("ABC", 1001);
        bangloreLibrary.addNewCustomer("XYZ", 1002);

        while(true){
            bangloreLibrary.displayMenu();

            int menuChoice = bangloreLibrary.askUserChoice();
            if(!bangloreLibrary.checkValidMenu(menuChoice))
                break;
            bangloreLibrary.processUserInput(menuChoice);
        }
    }
}
