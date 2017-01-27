package com.second.part.customlibrary.data;

import com.second.part.customlibrary.model.Movie;
import com.second.part.customlibrary.model.TvShow;

import java.util.List;

/**
 * Created by Usuario on 27/01/2017.
 */

public interface TvShowData {
    List<TvShow> getAll();
    void create(TvShow tvShow);
}
