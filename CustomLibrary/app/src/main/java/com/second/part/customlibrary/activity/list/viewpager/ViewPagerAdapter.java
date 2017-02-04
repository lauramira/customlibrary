package com.second.part.customlibrary.activity.list.viewpager;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v7.app.AppCompatActivity;

import com.second.part.customlibrary.R;
import com.second.part.customlibrary.activity.list.viewpager.fragment.ListMovieFragment;
import com.second.part.customlibrary.activity.list.viewpager.fragment.ListTvShowFragment;

/**
 * Created by Usuario on 04/02/2017.
 */

public class ViewPagerAdapter extends FragmentPagerAdapter {
    private final int NUMBER_OF_TABS = 2;
    private final int MOVIE_TAB = 0;
    private final int TV_SHOW_TAB = 1;
    private AppCompatActivity activity;

    public ViewPagerAdapter(FragmentManager fm, AppCompatActivity owner) {
        super(fm);
        this.activity = owner;
    }

    @Override
    public Fragment getItem(int position) {
        switch (position){
            case MOVIE_TAB: return ListMovieFragment.newInstance();
            case TV_SHOW_TAB: return ListTvShowFragment.newInstance();
        }

        throw new RuntimeException(activity.getString(R.string.tab_layout_error_tab_not_found));
    }

    @Override
    public int getCount() {
        return NUMBER_OF_TABS;
    }

    @Override
    public CharSequence getPageTitle(int position) {

        switch (position){
            case MOVIE_TAB: return activity.getString(R.string.tab_layout_movies);
            case TV_SHOW_TAB: return activity.getString(R.string.tab_layout_tv_shows);
        }

        return super.getPageTitle(position);

    }
}
