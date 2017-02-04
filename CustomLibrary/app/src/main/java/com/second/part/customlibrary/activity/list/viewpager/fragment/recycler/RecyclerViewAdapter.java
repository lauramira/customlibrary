package com.second.part.customlibrary.activity.list.viewpager.fragment.recycler;

import android.app.Activity;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.view.ViewGroup;

import com.second.part.customlibrary.R;
import com.second.part.customlibrary.application.CustomApplication;
import com.second.part.customlibrary.manager.LibraryManager;
import com.second.part.customlibrary.model.Movie;
import com.second.part.customlibrary.model.TvShow;
import com.second.part.customlibrary.utils.CustomLibraryConstants;

import java.util.List;

/**
 * Created by Usuario on 04/02/2017.
 */

public class RecyclerViewAdapter extends RecyclerView.Adapter<RecyclerViewHolder> {
    private Activity activity;
    private int selectedTab;
    private List<Movie> movieList;
    private List<TvShow> tvShowList;

    public RecyclerViewAdapter(Activity activity, int selectedTab) {
        this.activity = activity;
        this.selectedTab = selectedTab;
        LibraryManager libraryManager =
                ((CustomApplication) activity.getApplication()).getLibraryManager();
        this.movieList = libraryManager.getAllMovies();
        this.tvShowList = libraryManager.getAllTvShows();
    }

    @Override
    public RecyclerViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = activity.getLayoutInflater().inflate(
                R.layout.list_fragment_recycler_item,
                parent,
                false);

        RecyclerViewHolder holder = new RecyclerViewHolder(view);
        return holder;
    }

    @Override
    public void onBindViewHolder(RecyclerViewHolder holder, int position) {
        switch (selectedTab){
            case CustomLibraryConstants.MOVIE_TAB:
                holder.setMovieInfo(movieList.get(position), activity.getResources());
                break;
            case CustomLibraryConstants.TV_SHOW_TAB:
                holder.setTvShowInfo(tvShowList.get(position), activity.getResources());
                break;
        }
    }

    @Override
    public int getItemCount() {
        switch (selectedTab){
            case CustomLibraryConstants.MOVIE_TAB:
                return movieList.size();
            case CustomLibraryConstants.TV_SHOW_TAB:
                return tvShowList.size();
        }
        return 0;
    }
}
