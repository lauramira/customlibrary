package com.second.part.customlibrary.activity.list.viewpager.fragment;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.second.part.customlibrary.R;

public class ListTvShowFragment extends Fragment {

    public ListTvShowFragment() {
    }

    public static ListTvShowFragment newInstance() {
        ListTvShowFragment fragment = new ListTvShowFragment();
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_list_tv_show, container, false);
    }
}
