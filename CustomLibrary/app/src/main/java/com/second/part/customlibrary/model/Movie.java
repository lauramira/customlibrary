package com.second.part.customlibrary.model;

/**
 * Created by Usuario on 27/01/2017.
 */

public class Movie {
    private String name;
    private Integer year;
    private String director;

    public Movie() {}

    public Movie(String name, Integer year, String director) {
        this.name = name;
        this.year = year;
        this.director = director;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getYear() {
        return year;
    }

    public void setYear(Integer year) {
        this.year = year;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }
}
