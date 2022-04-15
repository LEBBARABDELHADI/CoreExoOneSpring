package com.mycompany.dvdstore.Service;

import com.mycompany.dvdstore.entity.Movie;
import com.mycompany.dvdstore.repository.MovieRepository;

public class MovieService {

    MovieRepository movieRepository =new MovieRepository();
    public void registerMovie(Movie movie){
        movieRepository.add(movie);
    }

}
