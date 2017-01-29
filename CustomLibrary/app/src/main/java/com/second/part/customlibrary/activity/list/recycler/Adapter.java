package com.second.part.customlibrary.activity.list.recycler;

import android.app.Activity;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.view.ViewGroup;

import com.second.part.customlibrary.R;
import com.second.part.customlibrary.application.CustomApplication;
import com.second.part.customlibrary.manager.LibraryManager;
import com.second.part.customlibrary.model.Movie;
import com.second.part.customlibrary.model.TvShow;

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

    public Adapter(Activity activity) {
        this.mActivity = activity;
        this.libraryManager = CustomApplication.getInstance().getLibraryManager();
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
}
