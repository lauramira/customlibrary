package com.second.part.customlibrary.activity.create.fragment;


import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.second.part.customlibrary.R;

public class CreateTvShowFragment extends Fragment {
    public static final String ARG_NAME = "ARG_NAME";

    private String tabName;

    public static CreateTvShowFragment newInstance(String name)
    {
        Bundle args = new Bundle();
        args.putString(ARG_NAME, name);
        CreateTvShowFragment fragment = new CreateTvShowFragment();
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        tabName = getArguments().getString(ARG_NAME);
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_create_tv_show, container, false);
        return view;
    }
}
