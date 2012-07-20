import junit.framework.Assert;
import org.junit.Test;

import java.awt.*;

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
    public void testShowsWelcomeMessage(){

        Assert.assertEquals("Welcome", bangloreLibrary.welcomeUser());
    }

    @Test
    public void testValidSelectedMenuOption(){

        Assert.assertTrue(bangloreLibrary.checkValidMenu(2));
    }

}
