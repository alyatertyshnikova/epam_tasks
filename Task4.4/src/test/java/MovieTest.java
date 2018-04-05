package test.java;

import main.java.Actor;
import main.java.Movie;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class MovieTest {
    private Movie movie;
    private Actor actor;

    @Before
    public void setUp() {
        movie = new Movie("Titanic", 5);
        actor = new Actor("Leonardo", "Dicaprio");
    }

    @Test
    public void addRoleShouldReturnFalseForNullArgument() {
        assertFalse(movie.addRole(null, actor));
        assertFalse(movie.addRole("Jack", null));
        assertFalse(movie.addRole(null, null));
    }

    @Test
    public void addRoleShouldReturnFalseIfRoleAlreadyExist() {
        movie.addRole("Jack", actor);
        assertFalse(movie.addRole("Jack", actor));
    }

    @Test
    public void addMovieShouldReturnTrueAndAddMovie() {
        assertTrue(movie.addRole("Jack", actor));
    }

    @Test
    public void deleteMovieShouldReturnFalseForNullArgument() {
        assertFalse(movie.deleteRole(null));
    }

    @Test
    public void deleteMovieShouldReturnFalseIfMovieDoesntExist() {
        assertFalse(movie.deleteRole("Jack"));
    }

    @Test
    public void deleteMovieShouldReturnTrueAndDeleteMovie() {
        movie.addRole("Jack", actor);
        assertTrue(movie.deleteRole("Jack"));
    }

}