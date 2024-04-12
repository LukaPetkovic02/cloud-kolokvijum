package com.javaguides.springbootapp.services;

import com.javaguides.springbootapp.IMovieRepository;
import com.javaguides.springbootapp.model.Movie;
import com.javaguides.springbootapp.model.MoviePostDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class MovieService implements IMovieService{
    @Autowired
    public IMovieRepository movieRepository;
    @Override
    public List<Movie> findAll() {
        return movieRepository.findAll();
    }

    @Override
    public Optional<Movie> create(MoviePostDTO newMovie) throws Exception {
        return Optional.empty();
    }
}
