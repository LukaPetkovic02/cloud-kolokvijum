package com.javaguides.springbootapp.controllers;

import com.javaguides.springbootapp.IMovieRepository;
import com.javaguides.springbootapp.model.Movie;
import com.javaguides.springbootapp.model.MoviePostDTO;
import com.javaguides.springbootapp.services.IMovieService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/movies")
public class MovieController {
    @Autowired
    private IMovieService movieService;

    @GetMapping(produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<List<Movie>> findAll(){
        List<Movie> entities = movieService.findAll();
        return new ResponseEntity<>(entities, HttpStatus.OK);
    }
    @PostMapping(produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<Movie> create(@RequestBody MoviePostDTO newMovie) throws Exception {
        Optional<Movie> result = movieService.create(newMovie);
        if(result.isPresent()){
            System.out.println("Uspesno dodavanje!");
        }
        return new ResponseEntity<>(result.get(), HttpStatus.CREATED);
    }

}
