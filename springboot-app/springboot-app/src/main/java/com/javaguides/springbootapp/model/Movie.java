package com.javaguides.springbootapp.model;

import jakarta.persistence.*;

@Table(name="movie")
@Entity
public class Movie {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public Long Id;
    public String Title;
    public String Genre;
    public Long Year;
    public Movie(){}
    public Movie(Long id, String title, String genre, Long year){
        Id = id;
        Title = title;
        Genre = genre;
        Year = year;
    }
    public Movie(String title, String genre, Long year){
        Title = title;
        Genre = genre;
        Year = year;
    }
}
