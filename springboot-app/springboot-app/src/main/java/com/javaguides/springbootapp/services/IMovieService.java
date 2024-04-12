package com.javaguides.springbootapp.services;

import com.javaguides.springbootapp.model.Movie;
import com.javaguides.springbootapp.model.MovieGetDTO;
import com.javaguides.springbootapp.model.MoviePostDTO;

import java.util.List;
import java.util.Optional;

public interface IMovieService {
    List<Movie> findAll();
    Optional<Movie> create(MoviePostDTO newMovie) throws Exception;
}
