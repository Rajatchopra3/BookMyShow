package bookmyshow.moviesearchservice.model;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


import java.time.LocalDate;


@NoArgsConstructor
@Getter
@Setter
public class Movie {

    private long id;
    private String name;
    private String genre;
    private String language;
    private LocalDate releaseDate;
    private int duration;
    private double rating;



}
