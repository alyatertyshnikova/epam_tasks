package main.java;

import java.io.Serializable;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

public class MovieCollection implements Serializable {
    private Set<Movie> movies;

    public MovieCollection() {
        movies = new LinkedHashSet<>();
    }

    public Set<Movie> getMovies() {
        return movies;
    }

    public void showInformation() {
        for (Movie movie : movies) {
            System.out.println(movie.getMovieName() + " - " + movie.getMyRate());
            movie.getRoles().forEach((actor, role) -> System.out.println(actor.toString() + " - " + role));
            System.out.println();
        }
    }

    public Movie getMovie(String movieName) {
        if(movieName==null){
            return null;
        }
        Movie collectionMovie;
        Iterator<Movie> iterator = movies.iterator();
        do {
            collectionMovie = iterator.next();
            if (movieName.equals(collectionMovie.getMovieName())) {
                return collectionMovie;
            }
        } while (iterator.hasNext());
        return null;
    }

    public void defaultCollection() {
        Movie smith = new Movie("Mr&Mrs Smith", 5);
        Actor actorSmith = new Actor("Angelina", "Joly");
        Actor actorSmith1 = new Actor("Brad", "Pitt");
        Movie fifthel = new Movie("Fifth Element", 5);
        Actor actorFifthel = new Actor("Bruce", "Willis");
        Actor actorFifthel1 = new Actor("Mila", "Iovovich");
        Movie la3nd = new Movie("La la land", 1000);
        Actor actorLand = new Actor("Rayan", "Gosling");
        Actor actorLand1 = new Actor("Emma", "Stone");
        smith.getRoles().put("Mr Smith", actorSmith);
        smith.getRoles().put("Mrs Smith", actorSmith1);
        fifthel.getRoles().put("Good Man", actorFifthel);
        fifthel.getRoles().put("Girl from Space", actorFifthel1);
        la3nd.getRoles().put("Sebastyan", actorLand);
        la3nd.getRoles().put("Mia", actorLand1);
        movies.add(smith);
        movies.add(fifthel);
        movies.add(la3nd);
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
        if (!movies.equals(otherMovieCollection.getMovies())) {
            return false;
        }
        return true;
    }

    @Override
    public int hashCode() {
            return (movies.hashCode());
    }
}
