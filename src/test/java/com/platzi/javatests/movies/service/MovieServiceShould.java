package com.platzi.javatests.movies.service;

import com.platzi.javatests.movies.data.MovieRepository;
import com.platzi.javatests.movies.model.Genre;
import com.platzi.javatests.movies.model.Movie;
import org.hamcrest.CoreMatchers;
import org.junit.Test;
import org.mockito.Mockito;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;

import static org.junit.Assert.*;

public class MovieServiceShould {


    @Test
    public void return_movie_by_genre() {
        //se hace un mockito de movie repository por el momento no es necesario crearla
        //como apenas estoy creando el repository no es necesario generar su conexcion a DB
        MovieRepository movieRepository = Mockito.mock(MovieRepository.class);

        Mockito.when(movieRepository.findAll()).thenReturn(
                Arrays.asList(
                        new Movie(1,"Dark Knight",152, Genre.ACTION),
                        new Movie(2,"Memento",113, Genre.THRILLER),
                        new Movie(3,"There's something about mary",119, Genre.COMEDY),
                        new Movie(4,"Super 8",112, Genre.THRILLER),
                        new Movie(5,"Screen",111, Genre.HORROR),
                        new Movie(6,"Home alone",103, Genre.COMEDY),
                        new Movie(7,"Matrix",136, Genre.ACTION)
                )
        );
        MovieService movieService  = new MovieService(movieRepository);
        Collection<Movie> movies = movieService.findMoviesByGenre(Genre.COMEDY);

        List<Integer> moviesId = movies.stream().map(movie -> movie.getId()).collect(Collectors.toList());

        assertThat(moviesId, CoreMatchers.is(Arrays.asList(3,6)));

    }
}