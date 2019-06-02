package com.trimindtech.training.homework04;

import java.util.Scanner;

public class DVDMovies  {
    public String movietitle;
    public double lengthOfMovie;
    public static String status;


    public String getMovietitle() {
        return movietitle;
    }

    public DVDMovies(String movietitle, double lengthOfMovie) {
        this.movietitle = movietitle;
        this.lengthOfMovie = lengthOfMovie;
    }

    public void setMovietitle(String movietitle) {
        this.movietitle = movietitle;
    }

    public double getLengthOfMovie() {
        return lengthOfMovie;
    }

    public void setLengthOfMovie(double lengthOfMovie) {
        this.lengthOfMovie = lengthOfMovie;
    }

   /* public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }*/

    @Override
    public String toString() {
        return
                "movietitle = " + movietitle +
                        " lengthOfMovie = " + lengthOfMovie;


    }

    @Override
    public boolean equals(Object obj) {
        DVDMovies d = (DVDMovies) obj;
        if (this.getMovietitle().equals(d.getMovietitle()) && this.lengthOfMovie == d.getLengthOfMovie()) {
               status="IN";
           // System.out.println(this.status);
         return true;
        }else {
            status = "OUT";
           // System.out.println(this.status);
        }

        return false;

    }
    static{
        System.out.println("a.renting DVD.\nb.returning DVD.\nc.movies details.\nd.exit program.\n");
    }




}




