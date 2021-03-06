package com.second.part.customlibrary.manager;

import com.second.part.customlibrary.data.MovieData;
import com.second.part.customlibrary.data.TvShowData;
import com.second.part.customlibrary.data.impl.MovieDataMock;
import com.second.part.customlibrary.data.impl.TvShowDataMock;
import com.second.part.customlibrary.model.Movie;
import com.second.part.customlibrary.model.TvShow;

import java.util.List;

/**
 * Created by Usuario on 27/01/2017.
 */

public class LibraryManager {

    private MovieData movieData;
    private TvShowData tvShowData;

    public LibraryManager(){
        movieData = new MovieDataMock();
        tvShowData = new TvShowDataMock();
    }

    public List<Movie> getAllMovies(){
        return movieData.getAll();
    }

    public List<TvShow> getAllTvShows(){
        return tvShowData.getAll();
    }

    public void createMovie(Movie movie){
        movieData.create(movie);
    }

    public void createTvShow(TvShow tvShow){
        tvShowData.create(tvShow);
    }

    public List<Movie> sortMovies(List<Movie> movies, int optionSelected){
       return movieData.sortData(movies, optionSelected);
    }

    public List<TvShow> sortTvShows(List<TvShow> tvShows, int optionSelected){
        return tvShowData.sortData(tvShows, optionSelected);
    }
}
