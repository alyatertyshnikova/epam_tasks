import main.java.Movie;
import main.java.MovieCollection;
import main.java.ToSerialize;

public class Main {

    public static void main(String[] args) {
        String fileName = "/Users/macintosh/IdeaProjects/Task4.4/src/main/java/Films.txt";
        MovieCollection movies = ToSerialize.toDeserialize(fileName);
        movies.showInformation();
        Movie neededMovie = movies.getMovie("La la land");
        if (neededMovie == null) {
            return;
        }
        neededMovie.setMyRate(5);
        ToSerialize.toSerialize(movies, fileName);
        MovieCollection changedMovies = ToSerialize.toDeserialize(fileName);
        System.out.println("Changed:");
        changedMovies.showInformation();
    }
}
