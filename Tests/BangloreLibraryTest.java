import junit.framework.Assert;
import org.junit.Test;

/**
 * Created by IntelliJ IDEA.
 * User: shridhad
 * Date: 7/12/12
 * Time: 1:17 PM
 * To change this template use File | Settings | File Templates.
 */
public class BangloreLibraryTest {

    BangloreLibrary bangloreLibrary = new BangloreLibrary();

    @Test
    public void shouldEquateSameLibraries() {
        BangloreLibrary bangloreLibrary1 = new BangloreLibrary();
        BangloreLibrary bangloreLibrary2 = new BangloreLibrary();

        Assert.assertEquals(bangloreLibrary1, bangloreLibrary2);
    }

    @Test
    public void shouldNotEquateNull(){

        Assert.assertFalse(bangloreLibrary.equals(null));
    }

    @Test
    public void testWelcomeUser(){

        Assert.assertEquals("Welcome", bangloreLibrary.welcomeUser());
    }

    @Test
    public void testMenuOptions(){

        String menuString = new String("Menu: \n1. View All Books\n2. Reserve Book\n3. Return Book\n4. Show Library Number\n Enter your choice:");

        Assert.assertEquals(menuString, bangloreLibrary.menuOptions());

    }

    @Test
    public void testValidSelectedMenuOption(){

        Assert.assertTrue(bangloreLibrary.checkValidMenu(2));
    }


}
