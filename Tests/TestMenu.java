import junit.framework.Assert;
import org.junit.Test;

/**
 * Created by IntelliJ IDEA.
 * User: Shridhar Deshmukh
 * Date: 7/17/12
 * Time: 8:56 AM
 * To change this template use File | Settings | File Templates.
 */
public class TestMenu {
    
    @Test
    public void shouldCreateRightMenu(){
        Menu bookMenu = Menu.createMenu();
        String expectedBookMenu = "\nMenu: \n1. Login\n2. View All Books\n3. Show All Movies\n4. Show Library Number\n5. Exit";
        Assert.assertEquals(expectedBookMenu, bookMenu.toString());
    }

    @Test
    public void shouldCreateLoggedInMenu(){
        Menu bookMenu = Menu.createLoggedInMenu();
        String expectedBookMenu = "\nMenu: \n1. Logout\n2. View All Books\n3. Show All Movies\n4. Show Library Number\n5. Reserve Book\n6. Return Book\n7. Exit";
        Assert.assertEquals(expectedBookMenu, bookMenu.toString());
    }

}
