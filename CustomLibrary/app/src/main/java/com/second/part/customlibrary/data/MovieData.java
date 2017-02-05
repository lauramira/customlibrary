package com.second.part.customlibrary.data;

import com.second.part.customlibrary.model.Movie;

import java.util.List;

/**
 * Created by Usuario on 27/01/2017.
 */

public interface MovieData {
    List<Movie> getAll();
    void create(Movie movie);
    List<Movie> sortData(List<Movie> movies, int optionSelected);
}
