package bookmyshow.moviesearchservice.Services;

import bookmyshow.moviesearchservice.model.Movie;

import java.time.LocalDate;
import java.util.List;

public interface MovieSearchService {


    List<Movie> searchMoviesByName();
    List<Movie> searchMoviesByGenre();
    List<Movie> searchMoviesByLanguage();
    List<Movie> searchMoviesByReleaseDates();
    List<Movie> searchMovieByCriteria(String name, String lang, String genre, LocalDate releaseDate);

}
