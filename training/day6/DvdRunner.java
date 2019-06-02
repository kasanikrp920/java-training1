package com.trimindtech.training.day6;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

import static java.lang.System.exit;

public class DvdRunner {
    public static void main(String[] args) {
        Dvd d1 = new Dvd("Iron man",2.5);
        Dvd d2 = new Dvd("Captain America",3);
        Dvd d3 = new Dvd("Transformers",2);
        Dvd d4 = new Dvd("Avengers",3.5);
        Dvd d5 = new Dvd("Fantastic 4",4);

        Map<String,Dvd>moviesMap=new HashMap<>();
        moviesMap.put("Iron Man",d1);
        moviesMap.put("Captain America",d2);
        moviesMap.put("Transformers",d3);
        moviesMap.put("Avengers",d4);
        moviesMap.put("Fantastic 4",d5);

        Scanner sc=new Scanner(System.in);
        System.out.println("enter the movie name");
        String movieName=sc.nextLine();

        if(!moviesMap.containsKey(movieName)){
            System.out.println("the movie dvd that ur requested  is   not in the store");
        }
        Dvd dvd=moviesMap.get(movieName);//to get each object in the map on the basis of key(movie name)


        System.out.println("a.renting DVD.\nb.returning DVD.\nc.movies details.\nd.exit program.\n");

        System.out.println("enter the choice");
        char ch=sc.next().charAt(0);

        switch(ch){
            case 'a':if(dvd.getMoviesStatus()==MoviesStatus.IN){
                System.out.println("yes,we have that dvd... "+dvd.toString());
                dvd.setMoviesStatus(MoviesStatus.OUT);
            }else {
                System.out.println("Sorry..the dvd is already rented out");
            }
                break;
            case 'b':dvd.setMoviesStatus(MoviesStatus.IN);
                break;
            case 'c':for(String d:moviesMap.keySet()){
                System.out.println(moviesMap.get(d).toString());
            }/*getting the keys from the map and storing them in array and then by using key,getting object by get(K) through that object getting all the values*/
                break;
            case 'd': exit(0);
                break;
            default:
                System.out.println("enter a valid choice");
        }

        System.out.println("thank u sir...visit again");


    }
}
