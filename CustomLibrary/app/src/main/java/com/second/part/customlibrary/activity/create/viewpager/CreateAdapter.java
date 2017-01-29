package com.second.part.customlibrary.activity.create.viewpager;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import com.second.part.customlibrary.activity.create.fragment.CreateMovieFragment;
import com.second.part.customlibrary.activity.create.fragment.CreateTvShowFragment;

/**
 * Created by Usuario on 29/01/2017.
 */

public class CreateAdapter extends FragmentPagerAdapter {
    private final int PAGE_NUMBER = 2;


    public CreateAdapter(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int position) {
        switch (position){
            case 0: return CreateMovieFragment.newInstance(Integer.toString(position));
            case 1: return CreateTvShowFragment.newInstance(Integer.toString(position));
        }

        return null;
    }

    @Override
    public int getCount() {
        return PAGE_NUMBER;
    }

    @Override
    public CharSequence getPageTitle(int position) {
        switch (position){
            case 0: return "MOVIE";
            case 1: return "TV SHOW";
        }

        return null;
    }
}
