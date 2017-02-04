package com.second.part.customlibrary.activity.create.viewpager.fragment;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.second.part.customlibrary.R;
import com.second.part.customlibrary.application.CustomApplication;
import com.second.part.customlibrary.model.Movie;

public class CreateMovieFragment extends Fragment {

    private EditText editTextName;
    private EditText editTextYear;
    private EditText editTextDirector;

    public CreateMovieFragment() {}

    public static CreateMovieFragment newInstance() {
        CreateMovieFragment fragment = new CreateMovieFragment();
        return fragment;
    }


    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_create_movie, container, false);
        return view;
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        Button buttonAdd = (Button) getActivity().findViewById(R.id.fragment_create_movie_button_add);
        buttonAdd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                addMovie();
            }
        });

        editTextName = (EditText) getActivity().findViewById(R.id.fragment_create_movie_edit_text_name);
        editTextYear = (EditText) getActivity().findViewById(R.id.fragment_create_movie_edit_text_year);
        editTextDirector = (EditText) getActivity().findViewById(R.id.fragment_create_movie_edit_text_director);
    }

    private void addMovie(){

        String name = editTextName.getText().toString();
        String year = editTextYear.getText().toString();
        String director = editTextDirector.getText().toString();

        if (name.isEmpty() || year.isEmpty() || director.isEmpty()){
            Toast.makeText(getContext(), getActivity().getString(R.string.fragment_create_error_empty_fields), Toast.LENGTH_LONG).show();
        } else {
            CustomApplication application = (CustomApplication) getActivity().getApplication();
            application.getLibraryManager().createMovie(
                    new Movie(
                            name,
                            Integer.parseInt(year),
                            director
                    )
            );

            getActivity().finish();
        }
    }
}
