package com.second.part.customlibrary.data.impl;

import com.second.part.customlibrary.data.MovieData;
import com.second.part.customlibrary.model.Movie;
import com.second.part.customlibrary.utils.CustomLibraryConstants;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
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

    @Override
    public List<Movie> sortData(List<Movie> movies, int optionSelected) {

        switch (optionSelected){
            case CustomLibraryConstants.SORT_MOVIE_NAME_A_TO_Z_OPTION:
                Collections.sort(movies, new Comparator<Movie>() {
                    @Override
                    public int compare(Movie movie1, Movie movie2) {
                        return movie1.getName().compareTo(movie2.getName());
                    }
                });
                return movies;

            case CustomLibraryConstants.SORT_MOVIE_NAME_Z_TO_A_OPTION:
                Collections.sort(movies, new Comparator<Movie>() {
                    @Override
                    public int compare(Movie movie1, Movie movie2) {
                        return movie2.getName().compareTo(movie1.getName());
                    }
                });
                return movies;

            case CustomLibraryConstants.SORT_MOVIE_YEAR_NEW_TO_OLD_OPTION:
                Collections.sort(movies, new Comparator<Movie>() {
                    @Override
                    public int compare(Movie movie1, Movie movie2) {
                        return movie2.getYear().compareTo(movie1.getYear());
                    }
                });
                return movies;

            case CustomLibraryConstants.SORT_MOVIE_YEAR_OLD_TO_NEW_OPTION:
                Collections.sort(movies, new Comparator<Movie>() {
                    @Override
                    public int compare(Movie movie1, Movie movie2) {
                        return movie1.getYear().compareTo(movie2.getYear());
                    }
                });
                return movies;

            case CustomLibraryConstants.SORT_MOVIE_DIRECTOR_A_TO_Z_OPTION:
                Collections.sort(movies, new Comparator<Movie>() {
                    @Override
                    public int compare(Movie movie1, Movie movie2) {
                        return movie1.getDirector().compareTo(movie2.getDirector());
                    }
                });
                return movies;

            case CustomLibraryConstants.SORT_MOVIE_DIRECTOR_Z_TO_A_OPTION:
                Collections.sort(movies, new Comparator<Movie>() {
                    @Override
                    public int compare(Movie movie1, Movie movie2) {
                        return movie2.getDirector().compareTo(movie1.getDirector());
                    }
                });
                return movies;
        }
        return movies;
    }
}
