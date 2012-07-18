/**
 * Created by IntelliJ IDEA.
 * User: Shridhar Deshmukh
 * Date: 7/18/12
 * Time: 1:58 PM
 * To change this template use File | Settings | File Templates.
 */

/* Responsibility : Store the details of movie and returns it when asked */
public class Movie {

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
    
    @Override
    public boolean equals(Object other){
        if(other == null || other.getClass() != getClass())
            return false;
        if(other == this)
            return true;
        Movie otherMovie = (Movie)other;
        if(name.equals(otherMovie.name) && director.equals(otherMovie.director) && rating == otherMovie.rating)
            return true;

        return false;
    }
}
