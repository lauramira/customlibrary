package com.second.part.customlibrary.model;

/**
 * Created by Usuario on 27/01/2017.
 */

public class TvShow {
    private String name;
    private Integer startYear;
    private Integer numSeasons;

    public TvShow() {}

    public TvShow(String name, Integer startYear, Integer numSeasons) {
        this.name = name;
        this.startYear = startYear;
        this.numSeasons = numSeasons;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getStartYear() {
        return startYear;
    }

    public void setStartYear(Integer startYear) {
        this.startYear = startYear;
    }

    public Integer getNumSeasons() {
        return numSeasons;
    }

    public void setNumSeasons(Integer numSeasons) {
        this.numSeasons = numSeasons;
    }
}
