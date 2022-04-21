package com.mycompany.dvdstore.repository;

import com.mycompany.dvdstore.entity.Movie;

import java.io.FileWriter;
import java.io.IOException;


public class GoLiveMovieRepository {
   // public static List<Movie> movies =new ArrayList<>();
    public void add (Movie movie){
        FileWriter writer;
        try{
            writer=new FileWriter("/Users/alpacino/Desktop/WORK-SRC/CoreExoOne/src/main/java/com/mycompany/dvdstore/files/movies.txt",true);
            writer.write(movie.getTitle()+";"+ movie.getGenre()+ "\n");
            writer.close();
        }
        catch (IOException e){
            e.printStackTrace();
        }
    }
}
