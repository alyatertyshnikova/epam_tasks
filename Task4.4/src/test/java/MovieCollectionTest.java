package test.java;

import main.java.Actor;
import main.java.Movie;
import main.java.MovieCollection;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class MovieCollectionTest {
    private MovieCollection collection;
    private Movie la3nd;

    @Before
    public void setUp() {
        collection = new MovieCollection();
        collection.defaultCollection();
        la3nd = new Movie("La la land", 1000);
    }

    @Test
    public void getMovieShouldReturnNullForNullArgument() {
        assertNull(collection.getMovie(null));
    }

    @Test
    public void getMovieShouldReturnNullIfMovieDoesntExist() {
        assertNull(collection.getMovie("a"));
    }

    @Test
    public void getMovieShouldReturnMovie() {
        Actor actorLand = new Actor("Rayan", "Gosling");
        Actor actorLand1 = new Actor("Emma", "Stone");
        la3nd.addRole("Sebastyan", actorLand);
        la3nd.addRole("Mia", actorLand1);
        assertEquals(la3nd, collection.getMovie("La la land"));
    }

    @Test
    public void addMovieShouldReturnFalseForNullArgument() {
        assertFalse(collection.addMovie(null, la3nd));
        assertFalse(collection.addMovie("movie", null));
        assertFalse(collection.addMovie(null, null));
    }

    @Test
    public void addMovieShouldReturnFalseIfMovieAlreadyExist() {
        assertFalse(collection.addMovie(la3nd.getMovieName(), la3nd));
    }

    @Test
    public void addMovieShouldReturnTrueAndAddMovie() {
        Movie movie = new Movie("New", 1);
        assertTrue(collection.addMovie("New", movie));
    }

    @Test
    public void deleteMovieShouldReturnFalseForNullArgument() {
        assertFalse(collection.deleteMovie(null));
    }

    @Test
    public void deleteMovieShouldReturnFalseIfMovieDoesntExist() {
        assertFalse(collection.deleteMovie("New"));
    }

    @Test
    public void deleteMovieShouldReturnTrueAndDeleteMovie() {
        assertTrue(collection.deleteMovie("La la land"));
    }

    @Test
    public void defaultCollectionShouldAddSomeMoviesToListAndReturnTrue() {
        MovieCollection newCollection = new MovieCollection();
        assertTrue(newCollection.defaultCollection());
    }

    @Test
    public void defaultCollectionShouldReturnFalseIfOneOfCollectionMoviesAlreadyExist() {
        MovieCollection newCollection = new MovieCollection();
        newCollection.addMovie("La la land", la3nd);
        assertFalse(collection.defaultCollection());
        assertFalse(newCollection.defaultCollection());
    }
}