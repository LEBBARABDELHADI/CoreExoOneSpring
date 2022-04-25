package com.mycompany.dvdstore;

import com.mycompany.dvdstore.controller.MovieController;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
      /*  FileMovieRepository goLiveMovieRepository =new FileMovieRepository();
        DefaultMovieService movieService =new DefaultMovieService();
        // we inject the class GoLiveMovieRepository instead of the interface in setMovieRepositoryInterface
        movieService.setMovieRepositoryInterface(goLiveMovieRepository);
        MovieController movieController =new MovieController();
        // we inject the class MovieService instead of the interface MovieServiceInterface
        movieController.setMovieServiceInterface(movieService);*/

        //ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
        MovieController movieController = context.getBean(MovieController.class);

        movieController.addUsingConsole();


    }
}
