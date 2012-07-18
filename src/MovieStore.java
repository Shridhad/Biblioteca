import java.util.ArrayList;
import java.util.List;

/**
 * Created by IntelliJ IDEA.
 * User: Shridhar Deshmukh
 * Date: 7/18/12
 * Time: 10:26 AM
 * To change this template use File | Settings | File Templates.
 */
public class MovieStore {

    private static List<Movie> movies;

    private class Movie{
        private String name;
        private String director;
        private int rating;
        
        public Movie(String name, String director, int rating){
            this.name = name;
            this.director = director;
            this.rating = rating;
        }
        @Override
        public String toString(){
            String output = name + " " + director;
            if(rating > 0 && rating < 10){
                output = output + " " + rating;
                return output;
            }
            output += " " + "NA";
            return output;
        }
    }
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
