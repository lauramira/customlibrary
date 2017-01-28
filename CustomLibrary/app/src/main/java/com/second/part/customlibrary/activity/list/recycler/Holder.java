package com.second.part.customlibrary.activity.list.recycler;

import android.content.res.Resources;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.TextView;

import com.second.part.customlibrary.R;
import com.second.part.customlibrary.model.Movie;
import com.second.part.customlibrary.model.TvShow;

/**
 * Created by Usuario on 27/01/2017.
 */

public class Holder extends RecyclerView.ViewHolder {
    private TextView mTextView1;
    private TextView mTextView2;

    public Holder(View itemView) {
        super(itemView);
        mTextView1 = (TextView) itemView.findViewById(R.id.listRecyclerItemTextView1);
        mTextView2 = (TextView) itemView.findViewById(R.id.listRecyclerItemTextView2);
    }

    public void setMovieInfo(Movie movie, Resources resources){

        String text1 = String.format(
                resources.getString(R.string.list_recycler_item_movie),
                movie.getName(),
                movie.getYear());

        mTextView1.setText(text1);
        mTextView2.setText(movie.getDirector());
    }

    public void setTvShowInfo(TvShow tvShow, Resources resources){
        Integer stringResourceId = tvShow.getNumSeasons() == 1 ?
                R.string.list_recycler_item_tvShow_1 : R.string.list_recycler_item_tvShow_2;

        String text1 = String.format(
                resources.getString(stringResourceId),
                tvShow.getName());

        mTextView1.setText(text1);
        mTextView2.setText(Integer.toString(tvShow.getStartYear()));
    }
}
