import main.java.Actor;
import main.java.Movie;
import main.java.MovieCollection;
import main.java.MoviesSerializer;

public class Main {

    public static void main(String[] args) {
        String fileName = "/Users/macintosh/IdeaProjects/Task4.4/src/main/java/Films.txt";
        MovieCollection movies = MoviesSerializer.toDeserialize(fileName);
        movies.showInformation();
        Movie neededMovie = movies.getMovie("La la land");
        if (neededMovie == null) {
            return;
        }
        neededMovie.setMyRate(5);
        Movie fightClub = new Movie("Fight Club", 5);
        Actor actor = new Actor("Brad", "Pitt");
        fightClub.addRole("Tyler", actor);
        movies.addMovie("Fight Club", fightClub);
        MoviesSerializer.toSerialize(movies, fileName);
        MovieCollection changedMovies = MoviesSerializer.toDeserialize(fileName);
        System.out.println("Changed:");
        changedMovies.showInformation();
    }
}
