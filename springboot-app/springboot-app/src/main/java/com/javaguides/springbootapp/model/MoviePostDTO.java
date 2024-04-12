package com.javaguides.springbootapp.model;

public class MoviePostDTO {

    public String Title;
    public String Genre;
    public Long Year;
    public MoviePostDTO(){}
    public MoviePostDTO(String title, String genre, Long year){
        Title = title;
        Genre = genre;
        Year = year;
    }
}
