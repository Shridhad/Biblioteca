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

    public enum MenuItem{
        ViewAllBooks("View All Books"),
        ReserveBook("Reserve Book"),
        ReturnBook("Return Book"),
        ShowLibraryNumber("Show Library Number"),
        Exit("Exit");

        private String menuItemName;

        private MenuItem(String menuItemName){
            this.menuItemName = menuItemName;
        }

        @Override
        public String toString(){
            return menuItemName;
        }
    }
    private MenuItem []menuItems;
    
    private Menu(MenuItem[] menuItems){
        this.menuItems = menuItems;
    }      
    
    public static Menu createBookMenu() {
        MenuItem []menuItems = {MenuItem.ViewAllBooks, MenuItem.ReserveBook, MenuItem.ReturnBook, MenuItem.ShowLibraryNumber, MenuItem.Exit};
                     
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
