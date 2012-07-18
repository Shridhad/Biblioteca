import java.util.ArrayList;
import java.util.List;

/**
 * Created by IntelliJ IDEA.
 * User: Shridhar Deshmukh
 * Date: 7/18/12
 * Time: 10:26 AM
 * To change this template use File | Settings | File Templates.
 */

/* Responsibility: Store all movies in list */
public class MovieStore {

    private static List<Movie> movies;

    public MovieStore(){
        movies = new ArrayList<Movie>(15);
        addMovies();
    }

    private void addMovies() {
        movies.add(new Movie("Harry Potter", "Mike Newell", 9));
        movies.add(new Movie("Tangled","Byron Howard", 8));
        movies.add(new Movie("Rio","Carlos Saldanha", 8));
        movies.add(new Movie("MegaMind","Tom McGrath",8));
        movies.add(new Movie("Dark Knight Rises","Christopher Nolan",0));
    }

    public String showAllMovies() {
        String output = "Movie Director Rating";
        for (Movie movie : movies) {
            output = output + "\n" + movie;
        }
        return output;
    }
}
