package Com.MovieDatabase;
import java.io.Serializable;

import javax.persistence.Entity;
@Entity
public class Movie implements Serializable {
    private static final long serialVersionUID = 1L;

    private String title;
    private String director;
    private int year;
    private String genre;

    public Movie(String title, String director, int year, String genre) {
        this.title = title;
        this.director = director;
        this.year = year;
        this.genre = genre;
    }

    public String getTitle() {
        return title;
    }

    public String getDirector() {
        return director;
    }
    
    public int getYear() {
        return year;
    }

    public String getGenre() {
        return genre;
    }

    @Override
    public String toString() {
        return "Title: " + title +  ",  Director: " + director + ", Year: " + year + ", Genre: " + genre;
    }
}


