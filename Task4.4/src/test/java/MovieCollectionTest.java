package test.java;

import main.java.Actor;
import main.java.Movie;
import main.java.MovieCollection;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class MovieCollectionTest {
    private MovieCollection collection;

    @Before
    public void setUp(){
        collection=new MovieCollection();
        collection.defaultCollection();
    }

    @Test
    public void getMovieShouldReturnNullForNullArgument(){
        assertNull(collection.getMovie(null));
    }

    @Test
    public void getMovieShouldReturnNullIfMovieDoesntExist(){
        assertNull(collection.getMovie("a"));
    }

    @Test
    public void getMovieShouldReturnMovie(){
        Movie la3nd = new Movie("La la land", 1000);
        Actor actorLand = new Actor("Rayan", "Gosling");
        Actor actorLand1 = new Actor("Emma", "Stone");
        la3nd.getRoles().put("Sebastyan", actorLand);
        la3nd.getRoles().put("Mia", actorLand1);
        assertEquals(la3nd, collection.getMovie("La la land"));

    }
}