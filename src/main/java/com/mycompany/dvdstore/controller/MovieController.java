package com.mycompany.dvdstore.controller;

import com.mycompany.dvdstore.Service.MovieServiceInterface;
import com.mycompany.dvdstore.entity.Movie;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.Scanner;

public class MovieController {
    @Autowired
    MovieServiceInterface movieServiceInterface ;

    public MovieServiceInterface getMovieServiceInterface() {
        return movieServiceInterface;
    }

    public void setMovieServiceInterface(MovieServiceInterface movieServiceInterface) {
        this.movieServiceInterface = movieServiceInterface;
    }

    public void addUsingConsole(){
        Movie movie =new Movie();
        System.out.println("Veillez saisir le titre du film");
        Scanner sc = new Scanner(System.in);
        String title= sc.nextLine();
        movie.setTitle(title);
        System.out.println("Veillez saisir le genre du film");
        String genre= sc.nextLine();
        movie.setGenre(genre);
        movieServiceInterface.registerMovie(movie);

        System.out.println( "movie's name :"+movie.getTitle()+" has one category : "+movie.getGenre());
    }
}
