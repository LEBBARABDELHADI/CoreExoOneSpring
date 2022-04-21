package com.mycompany.dvdstore.Service;

import com.mycompany.dvdstore.entity.Movie;
import com.mycompany.dvdstore.repository.GoLiveMovieRepository;
import com.mycompany.dvdstore.repository.MovieRepository;
import com.mycompany.dvdstore.repository.MovieRepositoryInterface;

public class MovieService {

    MovieRepositoryInterface movieRepositoryInterface;
    public void registerMovie(Movie movie){
        movieRepositoryInterface.add(movie);
    }

}
