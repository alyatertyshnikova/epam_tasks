package main.java;

import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;

public class MovieCollection implements Serializable {
    private Map<String, Movie> movies;

    public MovieCollection() {
        movies = new HashMap<>();
    }

    public void showInformation() {
        movies.forEach((name, movie) -> {
            System.out.println(movie.getMovieName() + " - " + movie.getMyRate());
            movie.showRoles();
            System.out.println();
        });
    }

    public boolean addMovie(String movieName, Movie movie) {
        if (movieName == null || movie == null) {
            return false;
        }
        if (movies.containsKey(movieName)) {
            return false;
        }
        movies.put(movieName, movie);
        return true;
    }

    public boolean deleteMovie(String movieName) {
        if (movieName == null) {
            return false;
        }
        if (movies.remove(movieName) == null) {
            return false;
        }
        return true;
    }

    public Movie getMovie(String movieName) {
        if (movieName == null) {
            return null;
        }
        return movies.get(movieName);
    }

    public boolean defaultCollection() {
        Movie smith = new Movie("Mr&Mrs Smith", 5);
        Actor actorSmith = new Actor("Angelina", "Joly");
        Actor actorSmith1 = new Actor("Brad", "Pitt");
        Movie fifthel = new Movie("Fifth Element", 5);
        Actor actorFifthel = new Actor("Bruce", "Willis");
        Actor actorFifthel1 = new Actor("Mila", "Iovovich");
        Movie la3nd = new Movie("La la land", 1000);
        Actor actorLand = new Actor("Rayan", "Gosling");
        Actor actorLand1 = new Actor("Emma", "Stone");
        smith.addRole("Mr Smith", actorSmith);
        smith.addRole("Mrs Smith", actorSmith1);
        fifthel.addRole("Good Man", actorFifthel);
        fifthel.addRole("Girl from Space", actorFifthel1);
        la3nd.addRole("Sebastyan", actorLand);
        la3nd.addRole("Mia", actorLand1);
        if (!movies.containsKey("Mr&Mrs Smith") && !movies.containsKey("Fifth Element") &&
                !movies.containsKey("La la land")) {
            addMovie("Mr&Mrs Smith", smith);
            addMovie("Fifth Element", fifthel);
            addMovie("La la land", la3nd);
            return true;
        }
        return false;
    }

    @Override
    public boolean equals(Object otherObj) {
        if (this == otherObj) {
            return true;
        }
        if (otherObj == null) {
            return false;
        }
        if (!(otherObj instanceof MovieCollection)) {
            return false;
        }
        MovieCollection otherMovieCollection = (MovieCollection) otherObj;
        if (!movies.equals(otherMovieCollection.movies)) {
            return false;
        }
        return true;
    }

    @Override
    public int hashCode() {
        return (movies.hashCode());
    }
}
