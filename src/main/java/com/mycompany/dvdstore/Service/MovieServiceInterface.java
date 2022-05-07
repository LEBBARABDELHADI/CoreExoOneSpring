package com.mycompany.dvdstore.Service;

import com.mycompany.dvdstore.entity.Movie;

import java.util.List;

public interface MovieServiceInterface {

    Movie registerMovie(Movie movie);
    List<Movie> listMovies();
    Movie getMovieById(long id);
}
