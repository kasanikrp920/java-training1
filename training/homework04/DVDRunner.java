package com.trimindtech.training.homework04;

import java.util.ArrayList;
import java.util.Scanner;

import static java.lang.System.exit;

public class DVDRunner  {

    public static void main(String[] args) {
         DVDMovies d1=new DVDMovies("baahubali",2.30);
         DVDMovies d2=new DVDMovies("iron man",2);
         DVDMovies d3=new DVDMovies("dead pool",2.30);
         DVDMovies d4=new DVDMovies("captain america",3);
         DVDMovies d5=new DVDMovies("thor",2.30);
         //DVDMovies[]movies={d1,d2,d3,d4,d5};
        ArrayList<DVDMovies> movies=new ArrayList<>();
        movies.add(d1);
        movies.add(d2);
        movies.add(d3);
        movies.add(d4);
        movies.add(d5);

        //System.out.println(d1.toString());
        /*for(DVDMovies ms:movies){
            System.out.println(ms.toString());

        }*/
        DVDMovies d6=new DVDMovies("thor" ,2.30);

        System.out.println("enter the choice (a-d)");
            char ch = 0;
            Scanner sc = new Scanner(System.in);
            ch = sc.next().charAt(0);

                switch (ch) {
                    case 'a':
                        //System.out.println(movies.contains(d6));

                        boolean b = movies.contains(d6);
                        if (b == true) {
                            System.out.println(DVDMovies.status);
                            DVDMovies.status = "OUT";

                        } else {
                            System.out.println("the dvd for the movie is already rented out");
                            //DVDMovies.status = "OUT";
                            System.out.println(DVDMovies.status);

                        }
                        break;
                    case 'b':

                        break;
                    case 'c':
                        for (DVDMovies ms : movies) {
                            System.out.println(ms.toString());

                        }

                        break;
                    case 'd':
                        exit(0);

                        break;

                    default:
                        System.out.println("enter the valid choice");
                }
            }
    }
