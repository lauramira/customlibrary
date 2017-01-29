package com.second.part.customlibrary.data.impl;

import com.second.part.customlibrary.data.TvShowData;
import com.second.part.customlibrary.model.Movie;
import com.second.part.customlibrary.model.TvShow;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by Usuario on 27/01/2017.
 */

public class TvShowDataMock implements TvShowData {

    List<TvShow> list;


    public TvShowDataMock(){
        list = new ArrayList<>(Arrays.asList(
                new TvShow("TV Show 1", 2001, 1),
                new TvShow("TV Show 2", 2002, 2),
                new TvShow("TV Show 3", 2003, 4),
                new TvShow("TV Show 4", 2004, 1),
                new TvShow("TV Show 5", 2005, 5),
                new TvShow("TV Show 6", 2006, 1),
                new TvShow("TV Show 7", 2007, 3)
        ));
    }

    @Override
    public List<TvShow> getAll() {
        return list;
    }

    @Override
    public void create(TvShow tvShow) {
        list.add(tvShow);
    }
}
