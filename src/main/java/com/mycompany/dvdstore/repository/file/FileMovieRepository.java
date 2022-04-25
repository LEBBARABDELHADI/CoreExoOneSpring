package com.mycompany.dvdstore.repository.file;

import com.mycompany.dvdstore.entity.Movie;
import com.mycompany.dvdstore.repository.MovieRepositoryInterface;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Repository;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

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
