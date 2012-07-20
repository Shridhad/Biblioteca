import java.util.Arrays;

/**
 * Created by IntelliJ IDEA.
 * User: Shridhar Deshmukh
 * Date: 7/17/12
 * Time: 8:57 AM
 * To change this template use File | Settings | File Templates.
 */

/* Responsibility : Create and display menu */
public class Menu {

    private MenuItem []menuItems;

    private Menu(MenuItem[] menuItems){
        this.menuItems = menuItems;
    }

    public enum MenuItem{
        ViewAllBooks("View All Books"),
        ReserveBook("Reserve Book"),
        ReturnBook("Return Book"),
        ShowLibraryNumber("Show Library Number"),
        Exit("Exit"),
        ShowAllMovies("Show All Movies"),
        Login("Login"),
        Logout("Logout");

        private String menuItemName;

        private MenuItem(String menuItemName){
            this.menuItemName = menuItemName;
        }
        @Override
        public String toString(){
            return menuItemName;
        }
    }

    public static Menu createLoggedInMenu() {
        MenuItem []menuItems = {MenuItem.Logout,
                MenuItem.ViewAllBooks,
                MenuItem.ShowAllMovies,
                MenuItem.ShowLibraryNumber,
                MenuItem.ReserveBook,
                MenuItem.ReturnBook,
                MenuItem.Exit};

        return new Menu(menuItems);
    }

    public static Menu createMenu() {
        MenuItem []menuItems = {MenuItem.Login,
                                MenuItem.ViewAllBooks,
                                MenuItem.ShowAllMovies,
                                MenuItem.ShowLibraryNumber,
                                MenuItem.Exit};
                     
        return new Menu(menuItems);
    }

    @Override
    public String toString(){
        String menuString = new String("\nMenu: ");
        for (int i = 0; i < menuItems.length; i++) {
            menuString = menuString + "\n" + (i+1) + ". " + menuItems[i];
        }
        return menuString;
    }
}
