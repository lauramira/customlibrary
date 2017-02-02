package com.second.part.customlibrary.data.impl;

import com.second.part.customlibrary.data.MovieData;
import com.second.part.customlibrary.model.Movie;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by Usuario on 27/01/2017.
 */

public class MovieDataMock implements MovieData {
    List<Movie> list;


    public MovieDataMock(){
        list = new ArrayList<>(Arrays.asList(
                new Movie("Movie 1", 2001, "Director 1"),
                new Movie("Movie 2", 2012, "Director 2"),
                new Movie("Movie 3", 2010, "Director 3"),
                new Movie("Movie 4", 2009, "Director 4"),
                new Movie("Movie 5", 1998, "Director 5")
        ));
    }

    @Override
    public List<Movie> getAll() {
        return list;
    }

    @Override
    public void create(Movie movie) {
        list.add(movie);
    }
}
