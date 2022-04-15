package com.mycompany.dvdstore;

import com.mycompany.dvdstore.Service.MovieService;
import com.mycompany.dvdstore.entity.Movie;

import java.util.Scanner;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        MovieService movieService = new MovieService();
        Movie movie =new Movie();
        System.out.println("Veillez saisir le titre du film");
        Scanner sc = new Scanner(System.in);
        String title= sc.nextLine();
        movie.setTitle(title);
        System.out.println("Veillez saisir le genre du film");
        String genre= sc.nextLine();
        movie.setGenre(genre);
        movieService.registerMovie(movie);

        System.out.println( "movie's name :"+movie.getGenre() +" has one category : "+movie.getGenre());
    }
}
