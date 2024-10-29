package app.service;

import app.Entitys.Movie;
import app.dto.MovieDTO;

public class MovieService {
    private final MovieDAO movieDAO;

    public MovieService(MovieDAO movieDAO) {
        this.movieDAO = movieDAO;
    }

    public void addMovie(MovieDTO movieDTO) {
        Movie movie = convertToEntity(movieDTO);
        movieDAO.save(movie);
    }

    private Movie convertToEntity(MovieDTO movieDTO) {
        // Conversion logic
        return new Movie();
    }
}
