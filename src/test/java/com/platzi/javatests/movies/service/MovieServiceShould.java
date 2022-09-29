package com.platzi.javatests.movies.service;

import com.platzi.javatests.movies.data.MovieRepository;
import com.platzi.javatests.movies.model.Genre;
import org.junit.Test;
import org.mockito.Mockito;

import static org.junit.Assert.*;

public class MovieServiceShould {


    @Test
    public void return_movie_by_genre() {
        MovieRepository movieRepository = Mockito.mock(MovieRepository.class);
        MovieService movieService  = new MovieService(movieRepository);
        movieService.findMoviesByGenre(Genre.COMEDY);
    }
}