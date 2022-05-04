package com.mycompany.dvdstore.repository.memory;

import com.mycompany.dvdstore.entity.Movie;
import com.mycompany.dvdstore.repository.MovieRepositoryInterface;
import org.springframework.stereotype.Repository;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;
//@Repository
public class MemoryMovieRepository implements MovieRepositoryInterface {

    static long compteur=1L;
    public static List<Movie> movies =new ArrayList<>();
    public void add (Movie movie){
        movie.setId((compteur++));
        movies.add(movie);
        System.out.println("the movie "+movie.getTitle()+" has been added. ");
    }
    public List<Movie> list(){
        return movies;
    }

    public Movie getById(long id){
        return movies.stream().
                filter(m -> m.getId()==id).
                findFirst().get();
    }
}
