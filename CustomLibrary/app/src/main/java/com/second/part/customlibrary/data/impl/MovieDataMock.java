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
                new Movie("Movie 1", 1991, "Director 1"),
                new Movie("Movie 2", 1992, "Director 2"),
                new Movie("Movie 3", 1993, "Director 3"),
                new Movie("Movie 4", 1994, "Director 4"),
                new Movie("Movie 5", 1995, "Director 5"),
                new Movie("Movie 6", 1996, "Director 6"),
                new Movie("Movie 7", 1997, "Director 7"),
                new Movie("Movie 8", 1998, "Director 8"),
                new Movie("Movie 9", 1999, "Director 9"),
                new Movie("Movie 10", 2000, "Director 10"),
                new Movie("Movie 11", 2001, "Director 11"),
                new Movie("Movie 12", 2002, "Director 12"),
                new Movie("Movie 13", 2003, "Director 13"),
                new Movie("Movie 14", 2004, "Director 14"),
                new Movie("Movie 15", 2005, "Director 15"),
                new Movie("Movie 16", 2006, "Director 16"),
                new Movie("Movie 17", 2007, "Director 17")
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
