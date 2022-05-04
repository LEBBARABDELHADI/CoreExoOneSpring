package com.mycompany.dvdstore.Service;

import com.mycompany.dvdstore.entity.Movie;
import com.mycompany.dvdstore.repository.MovieRepositoryInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DefaultMovieService implements MovieServiceInterface{


    @Autowired
    MovieRepositoryInterface movieRepositoryInterface;

    public MovieRepositoryInterface getMovieRepositoryInterface() {
        return movieRepositoryInterface;
    }

    public void setMovieRepositoryInterface(MovieRepositoryInterface movieRepositoryInterface) {
        this.movieRepositoryInterface = movieRepositoryInterface;
    }
    public List<Movie> listMovies(){
        return movieRepositoryInterface.list();
    }

    @Override
    public Movie getMovieById(long id) {
        return movieRepositoryInterface.getById(id);
    }

    ;

    public void registerMovie(Movie movie){


        movieRepositoryInterface.add(movie);
    }

}
