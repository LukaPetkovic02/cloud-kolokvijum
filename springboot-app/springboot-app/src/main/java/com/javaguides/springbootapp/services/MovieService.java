package com.javaguides.springbootapp.services;

import com.javaguides.springbootapp.IMovieRepository;
import com.javaguides.springbootapp.model.Movie;
import com.javaguides.springbootapp.model.MoviePostDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.concurrent.atomic.AtomicLong;

@Service
public class MovieService implements IMovieService{
    @Autowired
    public IMovieRepository movieRepository;
    private static AtomicLong counter=new AtomicLong();
    @Override
    public List<Movie> findAll() {
        return movieRepository.findAll();
    }

    @Override
    public Optional<Movie> create(MoviePostDTO newMovie) throws Exception {
        Long newId = (Long) counter.incrementAndGet();
        Movie createdMovie = new Movie(newId, newMovie.Title, newMovie.Genre, newMovie.Year);
        return Optional.of(movieRepository.save(createdMovie));
    }
}
