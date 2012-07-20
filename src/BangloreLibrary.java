/**
 * Created by IntelliJ IDEA.
 * User: shridhad
 * Date: 7/12/12
 * Time: 1:51 PM
 * To change this template use File | Settings | File Templates.
 */
/* Responsibility : Provide user with different operation of library */
public class BangloreLibrary {

    private static Menu menu;
    private static BookRepository bookRepository;
    private static Customers customers;
    private static UserInput userInput;
    private static MovieStore movieStore;
    private boolean isLoggedIn;

    public BangloreLibrary(){
        bookRepository = new BookRepository();
        menu = Menu.createMenu();
        customers = new Customers();
        userInput = new UserInput();
        movieStore = new MovieStore();
    }

    private void processAfterLogin(int choice){
        switch (choice){
            case 1:     logout();
                break;
            case 2:     bookRepository.showAllBooks();
                break;
            case 3:     movieStore.showAllMovies();
                break;
            case 4:     getLibraryNumber();
                break;
            case 5:     bookRepository.reserveBook(userInput.askBookName());
                break;
            case 6:     bookRepository.returnBook(userInput.askBookName());
                break;
            case 7:     System.exit(0);
        }
    }

    private void getLibraryNumber() {
        if(!isLoggedIn){
            System.out.print("Please talk to Librarian. Thank you.");
            return;
        }
        String customerName = userInput.askCustomerName();
        System.out.print(customers.getLibraryNumber(customerName));
    }

    private void processBeforeLoggedIn(int choice){
        switch (choice){
            case 1:     login();
                break;
            case 2:     bookRepository.showAllBooks();
                break;
            case 3:     movieStore.showAllMovies();
                break;
            case 4:     getLibraryNumber();
                break;
            case 5:     System.exit(0);
        }
    }

    private void logout() {
        isLoggedIn = false;
        menu = Menu.createMenu();
    }

    private void login() {
        String customerName = userInput.askUserName();
        String password = userInput.askPassword();
        isLoggedIn = customers.login(customerName,password);
        if(isLoggedIn) {
            System.out.print("Logged in successfully..!!");
            menu = Menu.createLoggedInMenu();
            return;
        }
        System.out.print("Login failed.!! Try again.");
    }

    public int askUserChoice(){
        return userInput.askChoice();
    }

    public boolean checkValidMenu(int menuIndex) {
        if(isLoggedIn)
            if(menuIndex > 0 && menuIndex <= 7)
                return true;

        if(menuIndex > 0 && menuIndex <= 5)
           return true;
        return false;
    }

    public void displayMenu() {
        System.out.print(menu);
    }

    public void processUserInput(int choice){
        if(isLoggedIn) {
            processAfterLogin(choice);
            return;
        }

        processBeforeLoggedIn(choice);
    }

    public String welcomeUser() {
        String outputString = new String("Welcome");
        System.out.print(outputString);
        return outputString;
    }


    public static void main(String []args)throws Exception{
        BangloreLibrary bangloreLibrary = new BangloreLibrary();
        bangloreLibrary.welcomeUser();

        while(true){
            bangloreLibrary.displayMenu();

            int menuChoice = bangloreLibrary.askUserChoice();
            if(!bangloreLibrary.checkValidMenu(menuChoice))
                System.out.print("\nEnter Correct choice.");
            bangloreLibrary.processUserInput(menuChoice);
        }
    }

}
