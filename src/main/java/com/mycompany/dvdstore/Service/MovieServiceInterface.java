package com.mycompany.dvdstore.Service;

import com.mycompany.dvdstore.entity.Movie;

import java.util.List;

public interface MovieServiceInterface {

    void registerMovie(Movie movie);
    List<Movie> listMovies();
}
