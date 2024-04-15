package com.javaguides.springbootapp.model;

import jakarta.persistence.*;

@Table(name="sv_16_2021")
@Entity
public class Movie {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public Long Id;
    public String Title;
    public String Genre;
    public Long Year;
    public Movie(){}
    public Movie(String title, String genre, Long year){
        Title = title;
        Genre = genre;
        Year = year;
    }
}
