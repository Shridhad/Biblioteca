import junit.framework.Assert;
import org.junit.Test;

/**
 * Created by IntelliJ IDEA.
 * User: Shridhar Deshmukh
 * Date: 7/18/12
 * Time: 10:23 AM
 * To change this template use File | Settings | File Templates.
 */
public class MovieStoreTest {
    
    MovieStore movieStore = new MovieStore();
    
    @Test
    public void shouldShowAllMovies(){
        String expectedString = "Movie Director Rating" +
                "\nHarry Potter Mike Newell 9" +
                "\nTangled Byron Howard 8" +
                "\nRio Carlos Saldanha 8" +
                "\nMegaMind Tom McGrath 8" +
                "\nDark Knight Rises Christopher Nolan NA";
        Assert.assertEquals(expectedString, movieStore.showAllMovies());
    }
}
