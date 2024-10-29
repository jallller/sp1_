package app.dto;

import lombok.Data;

import java.util.List;

@Data
public class MovieDTO {
    private String title;
    private String releaseDate;
    private List<String> genres;
    private List<String> actors;
    private String director;
}
