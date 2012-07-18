import junit.framework.Assert;
import org.junit.Test;

/**
 * Created by IntelliJ IDEA.
 * User: Shridhar Deshmukh
 * Date: 7/17/12
 * Time: 8:35 PM
 * To change this template use File | Settings | File Templates.
 */
public class TestUserInput {

    @Test
    public void testAskBookName(){
        UserInput userInput = new UserInput();

        Assert.assertEquals("Testing", userInput.askBookName());
    }

    @Test
    public void testAskUserChoice(){
        UserInput userInput = new UserInput();

        Assert.assertEquals(1, userInput.askChoice());
    }

    @Test
    public void testAskCustomerName(){
        UserInput userInput = new UserInput();

        Assert.assertEquals("XYZ", userInput.askChoice());
    }
}
