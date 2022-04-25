package com.mycompany.dvdstore;

import com.mycompany.dvdstore.controller.MovieController;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.support.ClassPathXmlApplicationContext;


/**
 * Hello world!
 *
 */
@Configuration
@ComponentScan(basePackages = {"com.mycompany.dvdstore.controller","com.mycompany.dvdstore.Service","com.mycompany.dvdstore.repository.file"})
@PropertySource("classpath:application.properties")
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
        ApplicationContext context = new AnnotationConfigApplicationContext(App.class);
        MovieController movieController = context.getBean(MovieController.class);

        movieController.addUsingConsole();


    }
}
