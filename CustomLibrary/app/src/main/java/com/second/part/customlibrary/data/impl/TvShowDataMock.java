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
                new TvShow("Movie 1", 2001, 1),
                new TvShow("Movie 2", 2002, 2),
                new TvShow("Movie 3", 2002, 4),
                new TvShow("Movie 4", 2002, 1),
                new TvShow("Movie 5", 2002, 5)
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
