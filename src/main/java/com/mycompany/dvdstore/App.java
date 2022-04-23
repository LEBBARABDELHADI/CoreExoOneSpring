package com.mycompany.dvdstore;

import com.mycompany.dvdstore.Service.DefaultMovieService;
import com.mycompany.dvdstore.controller.MovieController;
import com.mycompany.dvdstore.repository.FileMovieRepository;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        FileMovieRepository goLiveMovieRepository =new FileMovieRepository();
        DefaultMovieService movieService =new DefaultMovieService();
        // we inject the class GoLiveMovieRepository instead of the interface in setMovieRepositoryInterface
        movieService.setMovieRepositoryInterface(goLiveMovieRepository);
        MovieController movieController =new MovieController();
        // we inject the class MovieService instead of the interface MovieServiceInterface
        movieController.setMovieServiceInterface(movieService);
        movieController.addUsingConsole();


    }
}
