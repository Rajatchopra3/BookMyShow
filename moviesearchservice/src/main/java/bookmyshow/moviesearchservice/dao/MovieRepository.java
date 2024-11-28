package bookmyshow.moviesearchservice.dao;

import bookmyshow.moviesearchservice.model.Movie;
import org.springframework.data.jpa.repository.JpaRepository;

import java.time.LocalDate;
import java.util.List;

public interface MovieRepository extends JpaRepository<Movie,Long> {

    List<Movie> findByNameContainingIgnoreCase(String name);
    List<Movie> findByGenreIgnoreCase(String genre);
    List<Movie> findByLanguageIgnoreCase(String language);
    List<Movie> findByReleaseDateAfter(LocalDate releaseDate);
}
