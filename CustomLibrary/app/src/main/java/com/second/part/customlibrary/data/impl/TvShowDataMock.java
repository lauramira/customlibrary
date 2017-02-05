package com.second.part.customlibrary.data.impl;

import com.second.part.customlibrary.data.TvShowData;
import com.second.part.customlibrary.model.TvShow;
import com.second.part.customlibrary.model.TvShow;
import com.second.part.customlibrary.utils.CustomLibraryConstants;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
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

    @Override
    public List<TvShow> sortData(List<TvShow> tvShows, int optionSelected) {

        switch (optionSelected) {
            case CustomLibraryConstants.SORT_TV_SHOW_NAME_A_TO_Z_OPTION:
                Collections.sort(tvShows, new Comparator<TvShow>() {
                    @Override
                    public int compare(TvShow tvShow1, TvShow tvShow2) {
                        return tvShow1.getName().compareTo(tvShow2.getName());
                    }
                });
                return tvShows;

            case CustomLibraryConstants.SORT_TV_SHOW_NAME_Z_TO_A_OPTION:
                Collections.sort(tvShows, new Comparator<TvShow>() {
                    @Override
                    public int compare(TvShow tvShow1, TvShow tvShow2) {
                        return tvShow2.getName().compareTo(tvShow1.getName());
                    }
                });
                return tvShows;

            case CustomLibraryConstants.SORT_TV_SHOW_YEAR_NEW_TO_OLD_OPTION:
                Collections.sort(tvShows, new Comparator<TvShow>() {
                    @Override
                    public int compare(TvShow tvShow1, TvShow tvShow2) {
                        return tvShow2.getStartYear().compareTo(tvShow1.getStartYear());
                    }
                });
                return tvShows;

            case CustomLibraryConstants.SORT_TV_SHOW_YEAR_OLD_TO_NEW_OPTION:
                Collections.sort(tvShows, new Comparator<TvShow>() {
                    @Override
                    public int compare(TvShow tvShow1, TvShow tvShow2) {
                        return tvShow1.getStartYear().compareTo(tvShow2.getStartYear());
                    }
                });
                return tvShows;

            case CustomLibraryConstants.SORT_TV_SHOW_SEASONS_MORE_TO_LESS:
                Collections.sort(tvShows, new Comparator<TvShow>() {
                    @Override
                    public int compare(TvShow tvShow1, TvShow tvShow2) {
                        return tvShow2.getNumSeasons().compareTo(tvShow1.getNumSeasons());
                    }
                });
                return tvShows;

            case CustomLibraryConstants.SORT_TV_SHOW_SEASONS_LESS_TO_MORE:
                Collections.sort(tvShows, new Comparator<TvShow>() {
                    @Override
                    public int compare(TvShow tvShow1, TvShow tvShow2) {
                        return tvShow1.getNumSeasons().compareTo(tvShow2.getNumSeasons());
                    }
                });
                return tvShows;
        }

        return tvShows;
    }
}
