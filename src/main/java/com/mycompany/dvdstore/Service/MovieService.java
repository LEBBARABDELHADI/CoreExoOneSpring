package com.mycompany.dvdstore.Service;

import com.mycompany.dvdstore.entity.Movie;
import com.mycompany.dvdstore.repository.GoLiveMovieRepository;
import com.mycompany.dvdstore.repository.MovieRepository;

public class MovieService {

    GoLiveMovieRepository goLiveMovieRepository =new GoLiveMovieRepository();
    public void registerMovie(Movie movie){
        goLiveMovieRepository.add(movie);
    }

}
