package com.trimindtech.training.day6;

public class Dvd {
    private String movieName;
    private double lengthOfMovie;
    MoviesStatus moviesStatus;

    public Dvd(String movieName, double lengthOfMovie) {
        this.movieName = movieName;
        this.lengthOfMovie = lengthOfMovie;
        this.moviesStatus=MoviesStatus.IN;
    }

    public String getMovieName() {
        return movieName;
    }

    public void setMovieName(String movieName) {
        this.movieName = movieName;
    }

    public double getLengthOfMovie() {
        return lengthOfMovie;
    }

    public void setLengthOfMovie(double lengthOfMovie) {
        this.lengthOfMovie = lengthOfMovie;
    }

    public MoviesStatus getMoviesStatus() {
        return moviesStatus;
    }

    public void setMoviesStatus(MoviesStatus moviesStatus) {
        this.moviesStatus = moviesStatus;
    }

    @Override
    public String toString() {
        return "Dvd{" +
                "movieName='" + movieName + '\'' +
                ", lengthOfMovie=" + lengthOfMovie +
                ", moviesStatus=" + moviesStatus +
                '}';
    }
}
