package bookmyshow.moviesearchservice.controller;

import bookmyshow.moviesearchservice.Services.MovieSearchService;
import bookmyshow.moviesearchservice.model.Movie;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDate;
import java.util.List;

@RestController
@RequestMapping("/movies")
public class SearchController {


    @Autowired
    private MovieSearchService movieSearchService;

    @GetMapping("/search")
    public List<Movie> searchMovies(@RequestParam(required = false) String name,
                                    @RequestParam(required = false) String genre,
                                    @RequestParam(required = false) String language,
                                    @RequestParam(required = false) LocalDate releaseDate) {
        return movieSearchService.searchMovieByCriteria(name, genre, language, releaseDate);
    }
}
