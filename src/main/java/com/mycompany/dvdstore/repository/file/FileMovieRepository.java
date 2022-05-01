package com.mycompany.dvdstore.repository.file;

import com.mycompany.dvdstore.entity.Movie;
import com.mycompany.dvdstore.repository.MovieRepositoryInterface;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Repository;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

@Repository
public class FileMovieRepository implements MovieRepositoryInterface {
   // public static List<Movie> movies =new ArrayList<>();
    @Value("${movies.file.location}")
    File file;

    public File getFile() {
        return file;
    }

    public void setFile(File file) {
        this.file = file;
    }

    public List<Movie> list(){
        List<Movie> movies1=new ArrayList<>();

        try(BufferedReader br= new BufferedReader(new FileReader(file))) {
            for (String line;(line =br.readLine())!=null;
            ) {
                final  Movie movie = new Movie();
                final String[] titreEtGenrre = line.split(";");
                movie.setTitle(titreEtGenrre[0]);
                movie.setGenre(titreEtGenrre[1]);
                movies1.add(movie);

            }
        }catch(FileNotFoundException e){
            e.printStackTrace();
        }catch (IOException e){
            e.printStackTrace();
        }
        return movies1;
    }
    public void add (Movie movie){
        FileWriter writer;
        try{
            writer=new FileWriter(file,true);
            writer.write(movie.getTitle()+";"+ movie.getGenre()+ "\n");
            writer.close();
        }
        catch (IOException e){
            e.printStackTrace();
        }
    }
}
