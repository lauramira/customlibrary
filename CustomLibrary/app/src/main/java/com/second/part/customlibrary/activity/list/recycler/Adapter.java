package com.second.part.customlibrary.activity.list.recycler;

import android.app.Activity;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;

import com.second.part.customlibrary.R;
import com.second.part.customlibrary.application.CustomApplication;
import com.second.part.customlibrary.manager.LibraryManager;
import com.second.part.customlibrary.model.Movie;
import com.second.part.customlibrary.model.TvShow;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 * Created by Usuario on 27/01/2017.
 */

public class Adapter extends RecyclerView.Adapter<Holder>{

    private Activity mActivity;
    private LibraryManager libraryManager;
    private Integer listType;
    private List<Movie> movies;
    private List<TvShow> tvShows;
    private static String TAG = "ListActivityAdapter";

    public Adapter(Activity activity) {
        this.mActivity = activity;
        //this.libraryManager = CustomApplication.getInstance().getLibraryManager();
        this.movies = libraryManager.getAllMovies();
        this.tvShows = libraryManager.getAllTvShows();
        this.listType = 1;
    }

    @Override
    public Holder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = mActivity.getLayoutInflater().inflate(
                R.layout.list_recycler_item,
                parent,
                false);

        Holder holder = new Holder(view);
        return holder;
    }

    @Override
    public void onBindViewHolder(Holder holder, int position) {
        if (listType == 1) {
            holder.setMovieInfo(movies.get(position), mActivity.getResources());
        }  else {
            holder.setTvShowInfo(tvShows.get(position), mActivity.getResources());
        }
    }

    @Override
    public int getItemCount() {
       if (listType == 1){
           return movies.size();
       } else {
           return tvShows.size();
       }
    }

    public void changeListType(Integer listType){
        this.listType = listType;
        notifyDataSetChanged();
    }

    public void orderList(String orderBy){
        if (listType == 1){
            Log.d(TAG, "order movies by: " + orderBy);

            if (orderBy.equals("-")){
                Collections.sort(movies, new Comparator<Movie>() {
                    @Override
                    public int compare(Movie movie1, Movie movie2) {
                        return movie1.getYear().compareTo(movie2.getYear());
                    }
                });
            } else {
                Collections.sort(movies, new Comparator<Movie>() {
                    @Override
                    public int compare(Movie movie1, Movie movie2) {
                        return movie2.getYear().compareTo(movie1.getYear());
                    }
                });
            }
            notifyDataSetChanged();
        } else {
            Log.d(TAG, "order tv shows by: " + orderBy);
            if (orderBy.equals("-")) {
                Collections.sort(tvShows, new Comparator<TvShow>() {
                    @Override
                    public int compare(TvShow tvShow1, TvShow tvShow2) {
                        return tvShow1.getStartYear().compareTo(tvShow2.getStartYear());
                    }
                });
            } else {
                Collections.sort(tvShows, new Comparator<TvShow>() {
                    @Override
                    public int compare(TvShow tvShow1, TvShow tvShow2) {
                        return tvShow2.getStartYear().compareTo(tvShow1.getStartYear());
                    }
                });
            }
            notifyDataSetChanged();
        }
    }
}
