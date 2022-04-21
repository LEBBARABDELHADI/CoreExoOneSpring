package com.mycompany.dvdstore.controller;

import com.mycompany.dvdstore.Service.MovieService;
import com.mycompany.dvdstore.entity.Movie;

import java.util.Scanner;

public class MovieController {
    MovieService movieService = new MovieService();
    public void addUsingConsole(){
        Movie movie =new Movie();
        System.out.println("Veillez saisir le titre du film");
        Scanner sc = new Scanner(System.in);
        String title= sc.nextLine();
        movie.setTitle(title);
        System.out.println("Veillez saisir le genre du film");
        String genre= sc.nextLine();
        movie.setGenre(genre);
        movieService.registerMovie(movie);

        System.out.println( "movie's name :"+movie.getTitle()+" has one category : "+movie.getGenre());
    }
}
