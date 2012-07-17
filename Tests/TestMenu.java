import junit.framework.Assert;
import org.junit.Test;

import java.lang.reflect.Array;
import java.util.Arrays;

/**
 * Created by IntelliJ IDEA.
 * User: Shridhar Deshmukh
 * Date: 7/17/12
 * Time: 8:56 AM
 * To change this template use File | Settings | File Templates.
 */
public class TestMenu {
    
    @Test
    public void shouldCreateRightBookMenu(){
        Menu bookMenu = Menu.createBookMenu();
        String expectedBookMenu = "\nMenu: \n1. View All Books\n2. Reserve Book\n3. Return Book\n4. Show Library Number";
        Assert.assertEquals(expectedBookMenu, bookMenu.toString());
    }

}
