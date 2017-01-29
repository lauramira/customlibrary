package com.second.part.customlibrary.activity.create.fragment;


import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.second.part.customlibrary.R;

public class CreateMovieFragment extends Fragment {
    public static final String ARG_NAME = "ARG_NAME";

    private String tabName;

    public static CreateMovieFragment newInstance(String name)
    {
        Bundle args = new Bundle();
        args.putString(ARG_NAME, name);
        CreateMovieFragment fragment = new CreateMovieFragment();
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
        View view = inflater.inflate(R.layout.fragment_create_movie, container, false);
        TextView textView = (TextView) view.findViewById(R.id.create_textview);
        textView.setText("Fragment " + tabName);
        return view;
    }
}