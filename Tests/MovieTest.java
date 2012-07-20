import junit.framework.Assert;
import junit.framework.TestCase;
import org.junit.Test;

/**
 * Created by IntelliJ IDEA.
 * User: Shridhar Deshmukh
 * Date: 7/18/12
 * Time: 2:02 PM
 * To change this template use File | Settings | File Templates.
 */
public class MovieTest {

    @Test
    public void testTwoMoviesAreSame(){
        Movie movie1 = new Movie("Harry Potter", "Mike Newell", 9);
        Movie movie2 = new Movie("Harry Potter", "Mike Newell", 9);

        Assert.assertTrue(movie1.equals(movie2));
    }
    
    @Test
    public void shouldReturnCorrectMovieDetails() {
        Movie movie = new Movie("Tangled", "Byron Howard", 9);
        String expectedOutput = "Tangled Byron Howard 9";

        Assert.assertTrue(expectedOutput.equals(movie.toString()));
    }

    @Test
    public void shouldNotEquateWithNull() {
        Movie movie = new Movie("Tangled","Byron Howard",9);

        Assert.assertFalse(movie.equals(null));
    }

    @Test
    public void shouldEquateWithItSelf() {
        Movie movie = new Movie("Tangled","Byron Howard",9);

        Assert.assertTrue(movie.equals(movie));
    }

    @Test
    public void shouldNotEquateTwoDifferentMovies() {
        Movie movie1 = new Movie("Tangled","Byron Howard",9);
        Movie movie2 = new Movie("Harry Potter","Rowling",8);

        Assert.assertFalse(movie1.equals(movie2));
    }

}
