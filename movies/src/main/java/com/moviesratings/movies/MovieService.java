package com.moviesratings.movies;

import org.bson.types.ObjectId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class MovieService {
    @Autowired
    private MovieRespository movieRespository;
    public List<Movie> allMovies() {
        return movieRespository.findAll();
    }

    public Optional<Movie> singleMovie(String imdbId) {
        return movieRespository.findMovieByImdbId(imdbId);
    }
}
