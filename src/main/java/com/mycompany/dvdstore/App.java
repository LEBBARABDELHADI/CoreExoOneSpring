package com.mycompany.dvdstore;

import com.mycompany.dvdstore.Service.MovieService;
import com.mycompany.dvdstore.controller.MovieController;
import com.mycompany.dvdstore.entity.Movie;
import com.mycompany.dvdstore.repository.GoLiveMovieRepository;

import java.util.Scanner;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        GoLiveMovieRepository goLiveMovieRepository =new GoLiveMovieRepository();
        MovieService movieService =new MovieService();
        // we inject the class GoLiveMovieRepository instead of the interface in setMovieRepositoryInterface
        movieService.setMovieRepositoryInterface(goLiveMovieRepository);
        MovieController movieController =new MovieController();
        // we inject the class MovieService instead of the interface MovieServiceInterface
        movieController.setMovieServiceInterface(movieService);
        movieController.addUsingConsole();


    }
}
