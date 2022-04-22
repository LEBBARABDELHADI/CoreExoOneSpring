package com.mycompany.dvdstore.Service;

import com.mycompany.dvdstore.entity.Movie;
import com.mycompany.dvdstore.repository.GoLiveMovieRepository;
import com.mycompany.dvdstore.repository.MovieRepository;
import com.mycompany.dvdstore.repository.MovieRepositoryInterface;

public class MovieService implements MovieServiceInterface{

    MovieRepositoryInterface movieRepositoryInterface;

    public MovieRepositoryInterface getMovieRepositoryInterface() {
        return movieRepositoryInterface;
    }

    public void setMovieRepositoryInterface(MovieRepositoryInterface movieRepositoryInterface) {
        this.movieRepositoryInterface = movieRepositoryInterface;
    }

    public void registerMovie(Movie movie){
        movieRepositoryInterface.add(movie);
    }

}
