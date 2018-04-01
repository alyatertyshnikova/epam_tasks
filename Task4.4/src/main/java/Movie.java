package main.java;

import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;

public class Movie implements Serializable {
    private String movieName;
    private Map<String, Actor> roles;
    private int myRate;

    public Movie(String movieName, int myRate) {
        this.movieName = movieName;
        roles = new HashMap<>();
        this.myRate = myRate;
    }

    public String getMovieName() {
        return movieName;
    }

    public int getMyRate() {
        return myRate;
    }

    public void setMyRate(int myRate) {
        this.myRate = myRate;
    }

    public Map<String, Actor> getRoles() {
        return roles;
    }

    @Override
    public boolean equals(Object otherObj) {
        if (this == otherObj) {
            return true;
        }
        if (otherObj == null) {
            return false;
        }
        if (!(otherObj instanceof Movie)) {
            return false;
        }

        Movie otherMovie = (Movie) otherObj;
        if (movieName == null || otherMovie.movieName == null) {
            return false;
        }

        if (!movieName.equals(otherMovie.getMovieName()) || myRate != otherMovie.myRate) {
            return false;
        }

        if (!roles.equals(otherMovie.getRoles())) {
            return false;
        }
        return true;
    }

    @Override
    public int hashCode() {
        if (movieName != null) {
            return (myRate + movieName.hashCode() + roles.hashCode());
        }
        return -1;
    }
}
